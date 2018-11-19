package com.tinder.profile.view;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.profile.view.tappy.TappyProfilePhotosView;
import com.tinder.shimmy.ShimmerFrameLayout;

public final class BasicInfoView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private BasicInfoView f50205b;

    @UiThread
    public BasicInfoView_ViewBinding(BasicInfoView basicInfoView, View view) {
        this.f50205b = basicInfoView;
        basicInfoView.superLikeImage = (ImageView) C0761c.b(view, R.id.image_profile_superlike, "field 'superLikeImage'", ImageView.class);
        basicInfoView.nameText = (TextView) C0761c.b(view, R.id.profile_text_name, "field 'nameText'", TextView.class);
        basicInfoView.ageText = (TextView) C0761c.b(view, R.id.profile_text_age, "field 'ageText'", TextView.class);
        basicInfoView.badgeImage = (ImageView) C0761c.b(view, R.id.verified_badge, "field 'badgeImage'", ImageView.class);
        basicInfoView.shimmerFrameLayout = (ShimmerFrameLayout) C0761c.b(view, R.id.shimmer_frame_layout, "field 'shimmerFrameLayout'", ShimmerFrameLayout.class);
        basicInfoView.attributionIcon = (ImageView) C0761c.b(view, R.id.attribution_icon, "field 'attributionIcon'", ImageView.class);
        basicInfoView.badgeText = (TextView) C0761c.b(view, R.id.profile_badge_content, "field 'badgeText'", TextView.class);
        basicInfoView.jobText = (TextView) C0761c.b(view, R.id.profile_job, "field 'jobText'", TextView.class);
        basicInfoView.school1Text = (TextView) C0761c.b(view, R.id.profile_school1, "field 'school1Text'", TextView.class);
        basicInfoView.school2Text = (TextView) C0761c.b(view, R.id.profile_school2, "field 'school2Text'", TextView.class);
        basicInfoView.genderText = (TextView) C0761c.b(view, R.id.profile_gender, "field 'genderText'", TextView.class);
        basicInfoView.locationText = (TextView) C0761c.b(view, R.id.profile_text_location, "field 'locationText'", TextView.class);
        basicInfoView.photoViewerContainer = C0761c.a(view, R.id.photo_viewer_container, "field 'photoViewerContainer'");
        basicInfoView.photosView = (TappyProfilePhotosView) C0761c.b(view, R.id.photo_viewer, "field 'photosView'", TappyProfilePhotosView.class);
        basicInfoView.recOverflowButton = (RecOverflowButton) C0761c.b(view, R.id.tappy_overflow, "field 'recOverflowButton'", RecOverflowButton.class);
        basicInfoView.matchOverflowButton = (MatchOverflowButton) C0761c.b(view, R.id.tappy_overflow_button, "field 'matchOverflowButton'", MatchOverflowButton.class);
        basicInfoView.downArrowBtn = C0761c.a(view, R.id.profile_info_back, "field 'downArrowBtn'");
    }

    public void unbind() {
        BasicInfoView basicInfoView = this.f50205b;
        if (basicInfoView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50205b = null;
        basicInfoView.superLikeImage = null;
        basicInfoView.nameText = null;
        basicInfoView.ageText = null;
        basicInfoView.badgeImage = null;
        basicInfoView.shimmerFrameLayout = null;
        basicInfoView.attributionIcon = null;
        basicInfoView.badgeText = null;
        basicInfoView.jobText = null;
        basicInfoView.school1Text = null;
        basicInfoView.school2Text = null;
        basicInfoView.genderText = null;
        basicInfoView.locationText = null;
        basicInfoView.photoViewerContainer = null;
        basicInfoView.photosView = null;
        basicInfoView.recOverflowButton = null;
        basicInfoView.matchOverflowButton = null;
        basicInfoView.downArrowBtn = null;
    }
}
