package org.koishi.launcher.h2co3core.fakefx.beans.property;

import org.koishi.launcher.h2co3core.fakefx.beans.InvalidationListener;
import org.koishi.launcher.h2co3core.fakefx.beans.value.ChangeListener;
import org.koishi.launcher.h2co3core.fakefx.binding.ExpressionHelper;

/**
 * Base class for all readonly properties wrapping a {@code double}. This class provides a default
 * implementation to attach listener.
 *
 * @see ReadOnlyDoubleProperty
 * @since JavaFX 2.0
 */
public abstract class ReadOnlyDoublePropertyBase extends ReadOnlyDoubleProperty {

    ExpressionHelper<Number> helper;

    /**
     * Creates a default {@code ReadOnlyDoublePropertyBase}.
     */
    public ReadOnlyDoublePropertyBase() {
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
    public void addListener(ChangeListener<? super Number> listener) {
        helper = ExpressionHelper.addListener(helper, this, listener);
    }

    @Override
    public void removeListener(ChangeListener<? super Number> listener) {
        helper = ExpressionHelper.removeListener(helper, listener);
    }

    protected void fireValueChangedEvent() {
        ExpressionHelper.fireValueChangedEvent(helper);
    }

}
