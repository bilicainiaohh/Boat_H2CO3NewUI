package org.koishi.launcher.h2co3.core.fakefx.beans.property;

import org.koishi.launcher.h2co3.core.fakefx.beans.InvalidationListener;
import org.koishi.launcher.h2co3.core.fakefx.beans.value.ChangeListener;
import org.koishi.launcher.h2co3.core.fakefx.binding.ExpressionHelper;

/**
 * Base class for all readonly properties wrapping a {@code long}. This class provides a default
 * implementation to attach listener.
 *
 * @see ReadOnlyLongProperty
 * @since JavaFX 2.0
 */
public abstract class ReadOnlyLongPropertyBase extends ReadOnlyLongProperty {

    ExpressionHelper<Number> helper;

    /**
     * Creates a default {@code ReadOnlyLongPropertyBase}.
     */
    public ReadOnlyLongPropertyBase() {
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
