package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.profile.view.ProfileInterestsView.InterestsGrid;
import com.tinder.views.CustomTextView;

public class ProfileInterestsView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileInterestsView f50269b;

    @UiThread
    public ProfileInterestsView_ViewBinding(ProfileInterestsView profileInterestsView, View view) {
        this.f50269b = profileInterestsView;
        profileInterestsView.profileInterestsTitleText = (CustomTextView) C0761c.b(view, R.id.profile_interests_title_text, "field 'profileInterestsTitleText'", CustomTextView.class);
        profileInterestsView.interestsGrid = (InterestsGrid) C0761c.b(view, R.id.profile_interests_view, "field 'interestsGrid'", InterestsGrid.class);
    }

    @CallSuper
    public void unbind() {
        ProfileInterestsView profileInterestsView = this.f50269b;
        if (profileInterestsView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50269b = null;
        profileInterestsView.profileInterestsTitleText = null;
        profileInterestsView.interestsGrid = null;
    }
}
