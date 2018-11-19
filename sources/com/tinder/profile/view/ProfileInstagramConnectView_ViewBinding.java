package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomTextView;

public class ProfileInstagramConnectView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileInstagramConnectView f50264b;
    /* renamed from: c */
    private View f50265c;

    @UiThread
    public ProfileInstagramConnectView_ViewBinding(final ProfileInstagramConnectView profileInstagramConnectView, View view) {
        this.f50264b = profileInstagramConnectView;
        profileInstagramConnectView.instagramShareTextView = (CustomTextView) C0761c.b(view, R.id.instagram_share_textview, "field 'instagramShareTextView'", CustomTextView.class);
        view = C0761c.a(view, R.id.instagram_login_button, "field 'instagramLoginButton' and method 'onInstagramLoginClick'");
        profileInstagramConnectView.instagramLoginButton = (CustomButton) C0761c.c(view, R.id.instagram_login_button, "field 'instagramLoginButton'", CustomButton.class);
        this.f50265c = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ProfileInstagramConnectView_ViewBinding f50263b;

            public void doClick(View view) {
                profileInstagramConnectView.onInstagramLoginClick();
            }
        });
    }

    @CallSuper
    public void unbind() {
        ProfileInstagramConnectView profileInstagramConnectView = this.f50264b;
        if (profileInstagramConnectView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50264b = null;
        profileInstagramConnectView.instagramShareTextView = null;
        profileInstagramConnectView.instagramLoginButton = null;
        this.f50265c.setOnClickListener(null);
        this.f50265c = null;
    }
}
