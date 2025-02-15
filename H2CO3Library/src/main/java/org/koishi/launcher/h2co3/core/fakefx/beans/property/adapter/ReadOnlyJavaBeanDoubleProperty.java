package org.koishi.launcher.h2co3.core.fakefx.beans.property.adapter;

import org.koishi.launcher.h2co3.core.fakefx.beans.property.ReadOnlyDoublePropertyBase;
import org.koishi.launcher.h2co3.core.fakefx.property.MethodHelper;
import org.koishi.launcher.h2co3.core.fakefx.property.adapter.Disposer;
import org.koishi.launcher.h2co3.core.fakefx.property.adapter.ReadOnlyPropertyDescriptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;

public final class ReadOnlyJavaBeanDoubleProperty extends ReadOnlyDoublePropertyBase implements ReadOnlyJavaBeanProperty<Number> {

    private final ReadOnlyPropertyDescriptor descriptor;
    private final ReadOnlyPropertyDescriptor.ReadOnlyListener<Number> listener;

    @SuppressWarnings("removal")
    private final AccessControlContext acc = AccessController.getContext();

    ReadOnlyJavaBeanDoubleProperty(ReadOnlyPropertyDescriptor descriptor, Object bean) {
        this.descriptor = descriptor;
        this.listener = descriptor.new ReadOnlyListener<Number>(bean, this);
        descriptor.addListener(listener);
        Disposer.addRecord(this, new DescriptorListenerCleaner(descriptor, listener));
    }

    /**
     * {@inheritDoc}
     *
     * @throws UndeclaredThrowableException if calling the getter of the Java Bean
     *                                      property throws an {@code IllegalAccessException} or an
     *                                      {@code InvocationTargetException}.
     */
    @SuppressWarnings("removal")
    @Override
    public double get() {
        return AccessController.doPrivileged((PrivilegedAction<Double>) () -> {
            try {
                return ((Number) MethodHelper.invoke(
                        descriptor.getGetter(), getBean(), (Object[]) null)).doubleValue();
            } catch (IllegalAccessException e) {
                throw new UndeclaredThrowableException(e);
            } catch (InvocationTargetException e) {
                throw new UndeclaredThrowableException(e);
            }
        }, acc);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getBean() {
        return listener.getBean();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return descriptor.getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fireValueChangedEvent() {
        super.fireValueChangedEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        descriptor.removeListener(listener);
    }
}
