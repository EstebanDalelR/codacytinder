package com.tinder.settings.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.settings.views.MoreGenderView;

public class MoreGenderActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private MoreGenderActivity f51311b;

    @UiThread
    public MoreGenderActivity_ViewBinding(MoreGenderActivity moreGenderActivity, View view) {
        this.f51311b = moreGenderActivity;
        moreGenderActivity.toolbar = (Toolbar) C0761c.b(view, R.id.toolbar_more_gender, "field 'toolbar'", Toolbar.class);
        moreGenderActivity.moreGenderView = (MoreGenderView) C0761c.b(view, R.id.more_gender_view, "field 'moreGenderView'", MoreGenderView.class);
        moreGenderActivity.toolbarTitle = view.getContext().getResources().getString(R.string.i_am);
    }

    @CallSuper
    public void unbind() {
        MoreGenderActivity moreGenderActivity = this.f51311b;
        if (moreGenderActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51311b = null;
        moreGenderActivity.toolbar = null;
        moreGenderActivity.moreGenderView = null;
    }
}
