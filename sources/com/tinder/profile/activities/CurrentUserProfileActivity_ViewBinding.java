package com.tinder.profile.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.profile.view.CurrentUserProfileView;

public class CurrentUserProfileActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private CurrentUserProfileActivity f49933b;

    @UiThread
    public CurrentUserProfileActivity_ViewBinding(CurrentUserProfileActivity currentUserProfileActivity, View view) {
        this.f49933b = currentUserProfileActivity;
        currentUserProfileActivity.currentUserProfileView = (CurrentUserProfileView) C0761c.b(view, R.id.current_user_profile_view, "field 'currentUserProfileView'", CurrentUserProfileView.class);
    }

    @CallSuper
    public void unbind() {
        CurrentUserProfileActivity currentUserProfileActivity = this.f49933b;
        if (currentUserProfileActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f49933b = null;
        currentUserProfileActivity.currentUserProfileView = null;
    }
}
