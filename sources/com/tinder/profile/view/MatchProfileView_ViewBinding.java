package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class MatchProfileView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private MatchProfileView f50241b;

    @UiThread
    public MatchProfileView_ViewBinding(MatchProfileView matchProfileView, View view) {
        this.f50241b = matchProfileView;
        matchProfileView.profileView = (ProfileView) C0761c.b(view, R.id.profile_view, "field 'profileView'", ProfileView.class);
    }

    @CallSuper
    public void unbind() {
        MatchProfileView matchProfileView = this.f50241b;
        if (matchProfileView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50241b = null;
        matchProfileView.profileView = null;
    }
}
