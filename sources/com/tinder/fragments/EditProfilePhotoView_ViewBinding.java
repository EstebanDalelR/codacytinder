package com.tinder.fragments;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomSwitch;

public class EditProfilePhotoView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private EditProfilePhotoView f38617b;

    @UiThread
    public EditProfilePhotoView_ViewBinding(EditProfilePhotoView editProfilePhotoView, View view) {
        this.f38617b = editProfilePhotoView;
        editProfilePhotoView.mPhotosContainer = (RelativeLayout) C0761c.b(view, R.id.photo_section, "field 'mPhotosContainer'", RelativeLayout.class);
        editProfilePhotoView.mContainerMainPhoto = (RelativeLayout) C0761c.b(view, R.id.container_main_photo, "field 'mContainerMainPhoto'", RelativeLayout.class);
        editProfilePhotoView.mContainerPhoto2 = (RelativeLayout) C0761c.b(view, R.id.container_photo_two, "field 'mContainerPhoto2'", RelativeLayout.class);
        editProfilePhotoView.mContainerPhoto3 = (RelativeLayout) C0761c.b(view, R.id.container_photo_three, "field 'mContainerPhoto3'", RelativeLayout.class);
        editProfilePhotoView.mContainerPhoto4 = (RelativeLayout) C0761c.b(view, R.id.container_photo_four, "field 'mContainerPhoto4'", RelativeLayout.class);
        editProfilePhotoView.mContainerPhoto5 = (RelativeLayout) C0761c.b(view, R.id.container_photo_five, "field 'mContainerPhoto5'", RelativeLayout.class);
        editProfilePhotoView.mContainerPhoto6 = (RelativeLayout) C0761c.b(view, R.id.container_photo_six, "field 'mContainerPhoto6'", RelativeLayout.class);
        editProfilePhotoView.mBestPhotoBanner = C0761c.a(view, R.id.best_photo_banner, "field 'mBestPhotoBanner'");
        editProfilePhotoView.mImageViewMain = (ImageView) C0761c.b(view, R.id.imageViewMain, "field 'mImageViewMain'", ImageView.class);
        editProfilePhotoView.mImageView2 = (ImageView) C0761c.b(view, R.id.imageView2, "field 'mImageView2'", ImageView.class);
        editProfilePhotoView.mImageView3 = (ImageView) C0761c.b(view, R.id.imageView3, "field 'mImageView3'", ImageView.class);
        editProfilePhotoView.mImageView4 = (ImageView) C0761c.b(view, R.id.imageView4, "field 'mImageView4'", ImageView.class);
        editProfilePhotoView.mImageView5 = (ImageView) C0761c.b(view, R.id.imageView5, "field 'mImageView5'", ImageView.class);
        editProfilePhotoView.mImageView6 = (ImageView) C0761c.b(view, R.id.imageView6, "field 'mImageView6'", ImageView.class);
        editProfilePhotoView.mProgressSpinner1 = (ProgressBar) C0761c.b(view, R.id.progressSpinner1, "field 'mProgressSpinner1'", ProgressBar.class);
        editProfilePhotoView.mProgressSpinner2 = (ProgressBar) C0761c.b(view, R.id.progressSpinner2, "field 'mProgressSpinner2'", ProgressBar.class);
        editProfilePhotoView.mProgressSpinner3 = (ProgressBar) C0761c.b(view, R.id.progressSpinner3, "field 'mProgressSpinner3'", ProgressBar.class);
        editProfilePhotoView.mProgressSpinner4 = (ProgressBar) C0761c.b(view, R.id.progressSpinner4, "field 'mProgressSpinner4'", ProgressBar.class);
        editProfilePhotoView.mProgressSpinner5 = (ProgressBar) C0761c.b(view, R.id.progressSpinner5, "field 'mProgressSpinner5'", ProgressBar.class);
        editProfilePhotoView.mProgressSpinner6 = (ProgressBar) C0761c.b(view, R.id.progressSpinner6, "field 'mProgressSpinner6'", ProgressBar.class);
        editProfilePhotoView.mImageViewSelectorOverlayMain = (ImageView) C0761c.b(view, R.id.imageView_selector_overlay_main, "field 'mImageViewSelectorOverlayMain'", ImageView.class);
        editProfilePhotoView.mImageViewSelectorOverlay2 = (ImageView) C0761c.b(view, R.id.imageView_selector_overlay2, "field 'mImageViewSelectorOverlay2'", ImageView.class);
        editProfilePhotoView.mImageViewSelectorOverlay3 = (ImageView) C0761c.b(view, R.id.imageView_selector_overlay3, "field 'mImageViewSelectorOverlay3'", ImageView.class);
        editProfilePhotoView.mImageViewSelectorOverlay4 = (ImageView) C0761c.b(view, R.id.imageView_selector_overlay4, "field 'mImageViewSelectorOverlay4'", ImageView.class);
        editProfilePhotoView.mImageViewSelectorOverlay5 = (ImageView) C0761c.b(view, R.id.imageView_selector_overlay5, "field 'mImageViewSelectorOverlay5'", ImageView.class);
        editProfilePhotoView.mImageViewSelectorOverlay6 = (ImageView) C0761c.b(view, R.id.imageView_selector_overlay6, "field 'mImageViewSelectorOverlay6'", ImageView.class);
        editProfilePhotoView.mCellCount1 = (TextView) C0761c.b(view, R.id.pe_photo_cell_1, "field 'mCellCount1'", TextView.class);
        editProfilePhotoView.mCellCount2 = (TextView) C0761c.b(view, R.id.pe_photo_cell_2, "field 'mCellCount2'", TextView.class);
        editProfilePhotoView.mCellCount3 = (TextView) C0761c.b(view, R.id.pe_photo_cell_3, "field 'mCellCount3'", TextView.class);
        editProfilePhotoView.mCellCount4 = (TextView) C0761c.b(view, R.id.pe_photo_cell_4, "field 'mCellCount4'", TextView.class);
        editProfilePhotoView.mCellCount5 = (TextView) C0761c.b(view, R.id.pe_photo_cell_5, "field 'mCellCount5'", TextView.class);
        editProfilePhotoView.mCellCount6 = (TextView) C0761c.b(view, R.id.pe_photo_cell_6, "field 'mCellCount6'", TextView.class);
        editProfilePhotoView.mCellActionButton1 = (ImageView) C0761c.b(view, R.id.profile_image_action_1, "field 'mCellActionButton1'", ImageView.class);
        editProfilePhotoView.mCellActionButton2 = (ImageView) C0761c.b(view, R.id.profile_image_action_2, "field 'mCellActionButton2'", ImageView.class);
        editProfilePhotoView.mCellActionButton3 = (ImageView) C0761c.b(view, R.id.profile_image_action_3, "field 'mCellActionButton3'", ImageView.class);
        editProfilePhotoView.mCellActionButton4 = (ImageView) C0761c.b(view, R.id.profile_image_action_4, "field 'mCellActionButton4'", ImageView.class);
        editProfilePhotoView.mCellActionButton5 = (ImageView) C0761c.b(view, R.id.profile_image_action_5, "field 'mCellActionButton5'", ImageView.class);
        editProfilePhotoView.mCellActionButton6 = (ImageView) C0761c.b(view, R.id.profile_image_action_6, "field 'mCellActionButton6'", ImageView.class);
        editProfilePhotoView.mLayoutIsPhotoProcessing = (RelativeLayout) C0761c.b(view, R.id.frameLayout_is_photo_processing, "field 'mLayoutIsPhotoProcessing'", RelativeLayout.class);
        editProfilePhotoView.mOptimizedPhoto1 = (ImageView) C0761c.b(view, R.id.optimized_photo_1, "field 'mOptimizedPhoto1'", ImageView.class);
        editProfilePhotoView.mOptimizedPhoto2 = (ImageView) C0761c.b(view, R.id.optimized_photo_2, "field 'mOptimizedPhoto2'", ImageView.class);
        editProfilePhotoView.mOptimizedPhoto3 = (ImageView) C0761c.b(view, R.id.optimized_photo_3, "field 'mOptimizedPhoto3'", ImageView.class);
        editProfilePhotoView.mOptimizedPhoto4 = (ImageView) C0761c.b(view, R.id.optimized_photo_4, "field 'mOptimizedPhoto4'", ImageView.class);
        editProfilePhotoView.mOptimizedPhoto5 = (ImageView) C0761c.b(view, R.id.optimized_photo_5, "field 'mOptimizedPhoto5'", ImageView.class);
        editProfilePhotoView.mOptimizedPhoto6 = (ImageView) C0761c.b(view, R.id.optimized_photo_6, "field 'mOptimizedPhoto6'", ImageView.class);
        editProfilePhotoView.mOptimizedOrderLabel1 = (TextView) C0761c.b(view, R.id.optimized_label_1, "field 'mOptimizedOrderLabel1'", TextView.class);
        editProfilePhotoView.mOptimizedOrderLabel2 = (TextView) C0761c.b(view, R.id.optimized_label_2, "field 'mOptimizedOrderLabel2'", TextView.class);
        editProfilePhotoView.mOptimizedOrderLabel3 = (TextView) C0761c.b(view, R.id.optimized_label_3, "field 'mOptimizedOrderLabel3'", TextView.class);
        editProfilePhotoView.mOptimizedOrderLabel4 = (TextView) C0761c.b(view, R.id.optimized_label_4, "field 'mOptimizedOrderLabel4'", TextView.class);
        editProfilePhotoView.mOptimizedOrderLabel5 = (TextView) C0761c.b(view, R.id.optimized_label_5, "field 'mOptimizedOrderLabel5'", TextView.class);
        editProfilePhotoView.mOptimizedOrderLabel6 = (TextView) C0761c.b(view, R.id.optimized_label_6, "field 'mOptimizedOrderLabel6'", TextView.class);
        editProfilePhotoView.mOptimizePhotosContainer = C0761c.a(view, R.id.optimize_photos_container, "field 'mOptimizePhotosContainer'");
        editProfilePhotoView.mOptimizeToggleLabel = (TextView) C0761c.b(view, R.id.optimize_label, "field 'mOptimizeToggleLabel'", TextView.class);
        editProfilePhotoView.mOptimizePhotosSwitch = (CustomSwitch) C0761c.b(view, R.id.optimize_photos_switch, "field 'mOptimizePhotosSwitch'", CustomSwitch.class);
        view = view.getContext();
        Resources resources = view.getResources();
        editProfilePhotoView.RESOURCE_GRAY = C0432b.c(view, R.color.z_profile_body_text);
        editProfilePhotoView.RESOURCE_RED = C0432b.c(view, R.color.tinder_accent);
        editProfilePhotoView.mPhotoCornerRadius = resources.getDimension(R.dimen.optimized_photo_corner_radius);
        editProfilePhotoView.mPhotosSidePadding = resources.getDimensionPixelSize(R.dimen.optimized_photo_padding);
        editProfilePhotoView.mPhotoMargins = resources.getDimensionPixelSize(R.dimen.optimized_photo_margin);
        editProfilePhotoView.mDrawableRemovePhoto = C0432b.a(view, R.drawable.profile_remove_photo);
        editProfilePhotoView.mDrawableAddPhoto = C0432b.a(view, R.drawable.profile_add_photo);
    }

    @CallSuper
    public void unbind() {
        EditProfilePhotoView editProfilePhotoView = this.f38617b;
        if (editProfilePhotoView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38617b = null;
        editProfilePhotoView.mPhotosContainer = null;
        editProfilePhotoView.mContainerMainPhoto = null;
        editProfilePhotoView.mContainerPhoto2 = null;
        editProfilePhotoView.mContainerPhoto3 = null;
        editProfilePhotoView.mContainerPhoto4 = null;
        editProfilePhotoView.mContainerPhoto5 = null;
        editProfilePhotoView.mContainerPhoto6 = null;
        editProfilePhotoView.mBestPhotoBanner = null;
        editProfilePhotoView.mImageViewMain = null;
        editProfilePhotoView.mImageView2 = null;
        editProfilePhotoView.mImageView3 = null;
        editProfilePhotoView.mImageView4 = null;
        editProfilePhotoView.mImageView5 = null;
        editProfilePhotoView.mImageView6 = null;
        editProfilePhotoView.mProgressSpinner1 = null;
        editProfilePhotoView.mProgressSpinner2 = null;
        editProfilePhotoView.mProgressSpinner3 = null;
        editProfilePhotoView.mProgressSpinner4 = null;
        editProfilePhotoView.mProgressSpinner5 = null;
        editProfilePhotoView.mProgressSpinner6 = null;
        editProfilePhotoView.mImageViewSelectorOverlayMain = null;
        editProfilePhotoView.mImageViewSelectorOverlay2 = null;
        editProfilePhotoView.mImageViewSelectorOverlay3 = null;
        editProfilePhotoView.mImageViewSelectorOverlay4 = null;
        editProfilePhotoView.mImageViewSelectorOverlay5 = null;
        editProfilePhotoView.mImageViewSelectorOverlay6 = null;
        editProfilePhotoView.mCellCount1 = null;
        editProfilePhotoView.mCellCount2 = null;
        editProfilePhotoView.mCellCount3 = null;
        editProfilePhotoView.mCellCount4 = null;
        editProfilePhotoView.mCellCount5 = null;
        editProfilePhotoView.mCellCount6 = null;
        editProfilePhotoView.mCellActionButton1 = null;
        editProfilePhotoView.mCellActionButton2 = null;
        editProfilePhotoView.mCellActionButton3 = null;
        editProfilePhotoView.mCellActionButton4 = null;
        editProfilePhotoView.mCellActionButton5 = null;
        editProfilePhotoView.mCellActionButton6 = null;
        editProfilePhotoView.mLayoutIsPhotoProcessing = null;
        editProfilePhotoView.mOptimizedPhoto1 = null;
        editProfilePhotoView.mOptimizedPhoto2 = null;
        editProfilePhotoView.mOptimizedPhoto3 = null;
        editProfilePhotoView.mOptimizedPhoto4 = null;
        editProfilePhotoView.mOptimizedPhoto5 = null;
        editProfilePhotoView.mOptimizedPhoto6 = null;
        editProfilePhotoView.mOptimizedOrderLabel1 = null;
        editProfilePhotoView.mOptimizedOrderLabel2 = null;
        editProfilePhotoView.mOptimizedOrderLabel3 = null;
        editProfilePhotoView.mOptimizedOrderLabel4 = null;
        editProfilePhotoView.mOptimizedOrderLabel5 = null;
        editProfilePhotoView.mOptimizedOrderLabel6 = null;
        editProfilePhotoView.mOptimizePhotosContainer = null;
        editProfilePhotoView.mOptimizeToggleLabel = null;
        editProfilePhotoView.mOptimizePhotosSwitch = null;
    }
}
