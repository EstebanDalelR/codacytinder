package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomTextView;

public class ProfilePotentialCommonConnectionsView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfilePotentialCommonConnectionsView f50281b;

    @UiThread
    public ProfilePotentialCommonConnectionsView_ViewBinding(ProfilePotentialCommonConnectionsView profilePotentialCommonConnectionsView, View view) {
        this.f50281b = profilePotentialCommonConnectionsView;
        profilePotentialCommonConnectionsView.numConnectionsTitle = (CustomTextView) C0761c.b(view, R.id.profile_connections_title, "field 'numConnectionsTitle'", CustomTextView.class);
    }

    @CallSuper
    public void unbind() {
        ProfilePotentialCommonConnectionsView profilePotentialCommonConnectionsView = this.f50281b;
        if (profilePotentialCommonConnectionsView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50281b = null;
        profilePotentialCommonConnectionsView.numConnectionsTitle = null;
    }
}
