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

public class SchoolActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SchoolActivity f26202b;

    @UiThread
    public SchoolActivity_ViewBinding(SchoolActivity schoolActivity, View view) {
        this.f26202b = schoolActivity;
        schoolActivity.viewGroupContainer = (ViewGroup) C0761c.b(view, R.id.school_container, "field 'viewGroupContainer'", ViewGroup.class);
        schoolActivity.toolbar = (Toolbar) C0761c.b(view, R.id.school_toolbar, "field 'toolbar'", Toolbar.class);
        schoolActivity.schoolRecyclerView = (RecyclerView) C0761c.b(view, R.id.school_recycler_view, "field 'schoolRecyclerView'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        SchoolActivity schoolActivity = this.f26202b;
        if (schoolActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26202b = null;
        schoolActivity.viewGroupContainer = null;
        schoolActivity.toolbar = null;
        schoolActivity.schoolRecyclerView = null;
    }
}
