package com.tinder.settings.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.settings.views.ShowMeView;

public class ShowMeActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ShowMeActivity f51361b;

    @UiThread
    public ShowMeActivity_ViewBinding(ShowMeActivity showMeActivity, View view) {
        this.f51361b = showMeActivity;
        showMeActivity.mShowMe = (ShowMeView) C0761c.b(view, R.id.show_me_view, "field 'mShowMe'", ShowMeView.class);
        showMeActivity.mToolbar = (Toolbar) C0761c.b(view, R.id.toolbar_show_me, "field 'mToolbar'", Toolbar.class);
        showMeActivity.mToolbarTitle = view.getContext().getResources().getString(R.string.show_me);
    }

    @CallSuper
    public void unbind() {
        ShowMeActivity showMeActivity = this.f51361b;
        if (showMeActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51361b = null;
        showMeActivity.mShowMe = null;
        showMeActivity.mToolbar = null;
    }
}
