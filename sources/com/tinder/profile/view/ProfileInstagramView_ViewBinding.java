package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomTextView;
import com.viewpagerindicator.CirclePageIndicator;

public class ProfileInstagramView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileInstagramView f50268b;

    @UiThread
    public ProfileInstagramView_ViewBinding(ProfileInstagramView profileInstagramView, View view) {
        this.f50268b = profileInstagramView;
        profileInstagramView.instagramPhotoCountView = (CustomTextView) C0761c.b(view, R.id.profile_instagram_photo_count, "field 'instagramPhotoCountView'", CustomTextView.class);
        profileInstagramView.instagramViewPager = (ViewPager) C0761c.b(view, R.id.instagram_viewpager, "field 'instagramViewPager'", ViewPager.class);
        profileInstagramView.circlePageIndicator = (CirclePageIndicator) C0761c.b(view, R.id.instagram_indicator, "field 'circlePageIndicator'", CirclePageIndicator.class);
    }

    @CallSuper
    public void unbind() {
        ProfileInstagramView profileInstagramView = this.f50268b;
        if (profileInstagramView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50268b = null;
        profileInstagramView.instagramPhotoCountView = null;
        profileInstagramView.instagramViewPager = null;
        profileInstagramView.circlePageIndicator = null;
    }
}
