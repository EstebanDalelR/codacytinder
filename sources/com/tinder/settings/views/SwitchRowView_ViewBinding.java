package com.tinder.settings.views;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import butterknife.Unbinder;
import com.tinder.R;

public class SwitchRowView_ViewBinding implements Unbinder {
    @CallSuper
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public SwitchRowView_ViewBinding(SwitchRowView switchRowView, View view) {
        this(switchRowView, view.getContext());
    }

    @UiThread
    public SwitchRowView_ViewBinding(SwitchRowView switchRowView, Context context) {
        switchRowView.white = C0432b.c(context, R.color.white);
    }
}
