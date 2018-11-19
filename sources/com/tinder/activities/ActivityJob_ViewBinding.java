package com.tinder.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ActivityJob_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ActivityJob f26193b;

    @UiThread
    public ActivityJob_ViewBinding(ActivityJob activityJob, View view) {
        this.f26193b = activityJob;
        activityJob.mContainer = (ViewGroup) C0761c.b(view, R.id.job_container, "field 'mContainer'", ViewGroup.class);
        activityJob.mToolbar = (Toolbar) C0761c.b(view, R.id.job_toolbar, "field 'mToolbar'", Toolbar.class);
        activityJob.mRecyclerView = (RecyclerView) C0761c.b(view, R.id.job_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        ActivityJob activityJob = this.f26193b;
        if (activityJob == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26193b = null;
        activityJob.mContainer = null;
        activityJob.mToolbar = null;
        activityJob.mRecyclerView = null;
    }
}
