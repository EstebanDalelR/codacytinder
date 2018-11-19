package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ProfileView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileView f50300b;

    @UiThread
    public ProfileView_ViewBinding(ProfileView profileView, View view) {
        this.f50300b = profileView;
        profileView.scrollView = (ScrollView) C0761c.b(view, R.id.scroll_view, "field 'scrollView'", ScrollView.class);
        profileView.profileLayout = (LinearLayout) C0761c.b(view, R.id.profile_layout, "field 'profileLayout'", LinearLayout.class);
    }

    @CallSuper
    public void unbind() {
        ProfileView profileView = this.f50300b;
        if (profileView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50300b = null;
        profileView.scrollView = null;
        profileView.profileLayout = null;
    }
}
