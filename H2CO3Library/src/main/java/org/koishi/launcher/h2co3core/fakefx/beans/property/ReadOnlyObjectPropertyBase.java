package org.koishi.launcher.h2co3core.fakefx.beans.property;

import org.koishi.launcher.h2co3core.fakefx.beans.InvalidationListener;
import org.koishi.launcher.h2co3core.fakefx.beans.value.ChangeListener;
import org.koishi.launcher.h2co3core.fakefx.binding.ExpressionHelper;

/**
 * Base class for all readonly properties wrapping an arbitrary {@code Object}. This class provides a default
 * implementation to attach listener.
 *
 * @see ReadOnlyObjectProperty
 *
 * @param <T> the type of the wrapped {@code Object}
 * @since JavaFX 2.0
 */
public abstract class ReadOnlyObjectPropertyBase<T> extends ReadOnlyObjectProperty<T> {

    ExpressionHelper<T> helper;

    /**
     * Creates a default {@code ReadOnlyObjectPropertyBase}.
     */
    public ReadOnlyObjectPropertyBase() {
    }

    @Override
    public void addListener(InvalidationListener listener) {
        helper = ExpressionHelper.addListener(helper, this, listener);
    }

    @Override
    public void removeListener(InvalidationListener listener) {
        helper = ExpressionHelper.removeListener(helper, listener);
    }

    @Override
    public void addListener(ChangeListener<? super T> listener) {
        helper = ExpressionHelper.addListener(helper, this, listener);
    }

    @Override
    public void removeListener(ChangeListener<? super T> listener) {
        helper = ExpressionHelper.removeListener(helper, listener);
    }

    protected void fireValueChangedEvent() {
        ExpressionHelper.fireValueChangedEvent(helper);
    }

}
