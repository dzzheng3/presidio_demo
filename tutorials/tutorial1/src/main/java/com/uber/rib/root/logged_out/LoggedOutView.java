package com.uber.rib.root.logged_out;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Top level view for {@link LoggedOutBuilder.LoggedOutScope}.
 */
class LoggedOutView extends LinearLayout implements LoggedOutInteractor.LoggedOutPresenter {

    public LoggedOutView(Context context) {
        this(context, null);
    }

    public LoggedOutView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoggedOutView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
