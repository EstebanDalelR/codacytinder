package com.tinder.profile.view;

import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class ProfileBitmojiAuthView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileBitmojiAuthView f50255b;
    /* renamed from: c */
    private View f50256c;

    @UiThread
    public ProfileBitmojiAuthView_ViewBinding(final ProfileBitmojiAuthView profileBitmojiAuthView, View view) {
        this.f50255b = profileBitmojiAuthView;
        profileBitmojiAuthView.bitmojiTitle = (TextView) C0761c.b(view, R.id.bitmoji_title, "field 'bitmojiTitle'", TextView.class);
        profileBitmojiAuthView.connectTextBitmoji = (TextView) C0761c.b(view, R.id.connect_text_bitmoji, "field 'connectTextBitmoji'", TextView.class);
        profileBitmojiAuthView.disconnectTextBitmoji = (TextView) C0761c.b(view, R.id.disconnect_text_bitmoji, "field 'disconnectTextBitmoji'", TextView.class);
        View a = C0761c.a(view, R.id.bitmoji_auth_button, "field 'bitmojiButton' and method 'onBitmojiAuthClick$Tinder_release'");
        profileBitmojiAuthView.bitmojiButton = (ConstraintLayout) C0761c.c(a, R.id.bitmoji_auth_button, "field 'bitmojiButton'", ConstraintLayout.class);
        this.f50256c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ProfileBitmojiAuthView_ViewBinding f50254b;

            public void doClick(View view) {
                profileBitmojiAuthView.onBitmojiAuthClick$Tinder_release();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        profileBitmojiAuthView.instagramLoggedInNameColor = C0432b.c(view, R.color.instagram_loggedin_name);
        profileBitmojiAuthView.tinderRedColor = C0432b.c(view, R.color.tinder_red);
        profileBitmojiAuthView.bitmojiKeyboardString = resources.getString(R.string.bitmoji_keyboard);
    }

    public void unbind() {
        ProfileBitmojiAuthView profileBitmojiAuthView = this.f50255b;
        if (profileBitmojiAuthView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50255b = null;
        profileBitmojiAuthView.bitmojiTitle = null;
        profileBitmojiAuthView.connectTextBitmoji = null;
        profileBitmojiAuthView.disconnectTextBitmoji = null;
        profileBitmojiAuthView.bitmojiButton = null;
        this.f50256c.setOnClickListener(null);
        this.f50256c = null;
    }
}
