package com.tinder.profiletab.view;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class ProfileTabView$UserInfoView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileTabView$UserInfoView f50439b;
    /* renamed from: c */
    private View f50440c;
    /* renamed from: d */
    private View f50441d;
    /* renamed from: e */
    private View f50442e;
    /* renamed from: f */
    private View f50443f;

    @UiThread
    public ProfileTabView$UserInfoView_ViewBinding(final ProfileTabView$UserInfoView profileTabView$UserInfoView, View view) {
        this.f50439b = profileTabView$UserInfoView;
        View a = C0761c.a(view, R.id.profile_tab_user_info_avatar, "method 'onAvatarClick$Tinder_release'");
        this.f50440c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ProfileTabView$UserInfoView_ViewBinding f50432b;

            public void doClick(View view) {
                profileTabView$UserInfoView.onAvatarClick$Tinder_release();
            }
        });
        a = C0761c.a(view, R.id.profile_tab_user_info_edit_button, "method 'onEditButtonClick$Tinder_release'");
        this.f50441d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ProfileTabView$UserInfoView_ViewBinding f50434b;

            public void doClick(View view) {
                profileTabView$UserInfoView.onEditButtonClick$Tinder_release();
            }
        });
        a = C0761c.a(view, R.id.profile_tab_user_info_settings_button, "method 'onSettingsButtonClick$Tinder_release'");
        this.f50442e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ProfileTabView$UserInfoView_ViewBinding f50436b;

            public void doClick(View view) {
                profileTabView$UserInfoView.onSettingsButtonClick$Tinder_release();
            }
        });
        view = C0761c.a(view, R.id.profile_tab_user_info_media_button, "method 'onMediaButtonClick$Tinder_release'");
        this.f50443f = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ProfileTabView$UserInfoView_ViewBinding f50438b;

            public void doClick(View view) {
                profileTabView$UserInfoView.onMediaButtonClick$Tinder_release();
            }
        });
    }

    public void unbind() {
        if (this.f50439b == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50439b = null;
        this.f50440c.setOnClickListener(null);
        this.f50440c = null;
        this.f50441d.setOnClickListener(null);
        this.f50441d = null;
        this.f50442e.setOnClickListener(null);
        this.f50442e = null;
        this.f50443f.setOnClickListener(null);
        this.f50443f = null;
    }
}
