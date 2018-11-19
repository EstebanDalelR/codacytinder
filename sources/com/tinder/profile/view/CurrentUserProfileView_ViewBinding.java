package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class CurrentUserProfileView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private CurrentUserProfileView f50232b;
    /* renamed from: c */
    private View f50233c;

    @UiThread
    public CurrentUserProfileView_ViewBinding(final CurrentUserProfileView currentUserProfileView, View view) {
        this.f50232b = currentUserProfileView;
        currentUserProfileView.profileView = (ProfileView) C0761c.b(view, R.id.profile_view, "field 'profileView'", ProfileView.class);
        view = C0761c.a(view, R.id.profile_fab_edit, "method 'onProfileFabEditClick'");
        this.f50233c = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ CurrentUserProfileView_ViewBinding f50231b;

            public void doClick(View view) {
                currentUserProfileView.onProfileFabEditClick();
            }
        });
    }

    @CallSuper
    public void unbind() {
        CurrentUserProfileView currentUserProfileView = this.f50232b;
        if (currentUserProfileView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50232b = null;
        currentUserProfileView.profileView = null;
        this.f50233c.setOnClickListener(null);
        this.f50233c = null;
    }
}
