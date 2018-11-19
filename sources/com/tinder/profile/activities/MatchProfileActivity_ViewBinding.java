package com.tinder.profile.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.profile.view.MatchProfileView;

public class MatchProfileActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private MatchProfileActivity f49934b;

    @UiThread
    public MatchProfileActivity_ViewBinding(MatchProfileActivity matchProfileActivity, View view) {
        this.f49934b = matchProfileActivity;
        matchProfileActivity.matchProfileView = (MatchProfileView) C0761c.b(view, R.id.match_profile_view, "field 'matchProfileView'", MatchProfileView.class);
    }

    @CallSuper
    public void unbind() {
        MatchProfileActivity matchProfileActivity = this.f49934b;
        if (matchProfileActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f49934b = null;
        matchProfileActivity.matchProfileView = null;
    }
}
