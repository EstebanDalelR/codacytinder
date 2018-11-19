package com.tinder.recs.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.profile.target.ProfileGamepadTarget;
import com.tinder.profile.view.ProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderImageView;

public class RecProfileView_ViewBinding implements Unbinder {
    private RecProfileView target;

    @UiThread
    public RecProfileView_ViewBinding(RecProfileView recProfileView) {
        this(recProfileView, recProfileView);
    }

    @UiThread
    public RecProfileView_ViewBinding(RecProfileView recProfileView, View view) {
        this.target = recProfileView;
        recProfileView.gamePadButtons = (ProfileGamepadTarget) C0761c.b(view, R.id.user_rec_profile_gamepad, "field 'gamePadButtons'", ProfileGamepadTarget.class);
        recProfileView.placeholderImageView = (PlaceholderImageView) C0761c.b(view, R.id.user_rec_profile_placeholder_image, "field 'placeholderImageView'", PlaceholderImageView.class);
        recProfileView.profileView = (ProfileView) C0761c.b(view, R.id.user_rec_profile, "field 'profileView'", ProfileView.class);
        recProfileView.entranceBackground = C0761c.a(view, R.id.user_rec_profile_entrance_background, "field 'entranceBackground'");
    }

    @CallSuper
    public void unbind() {
        RecProfileView recProfileView = this.target;
        if (recProfileView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        recProfileView.gamePadButtons = null;
        recProfileView.placeholderImageView = null;
        recProfileView.profileView = null;
        recProfileView.entranceBackground = null;
    }
}
