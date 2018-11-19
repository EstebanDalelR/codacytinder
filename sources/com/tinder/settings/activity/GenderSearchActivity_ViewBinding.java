package com.tinder.settings.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.settings.views.GenderSearchView;

public class GenderSearchActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private GenderSearchActivity f51310b;

    @UiThread
    public GenderSearchActivity_ViewBinding(GenderSearchActivity genderSearchActivity, View view) {
        this.f51310b = genderSearchActivity;
        genderSearchActivity.mSearchView = (GenderSearchView) C0761c.b(view, R.id.more_gender_search, "field 'mSearchView'", GenderSearchView.class);
    }

    @CallSuper
    public void unbind() {
        GenderSearchActivity genderSearchActivity = this.f51310b;
        if (genderSearchActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51310b = null;
        genderSearchActivity.mSearchView = null;
    }
}
