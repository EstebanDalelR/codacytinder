package com.tinder.onboarding.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class PhotosStepView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private PhotosStepView f39559b;
    /* renamed from: c */
    private View f39560c;
    /* renamed from: d */
    private View f39561d;

    @UiThread
    public PhotosStepView_ViewBinding(final PhotosStepView photosStepView, View view) {
        this.f39559b = photosStepView;
        photosStepView.mAddPhotoImageView = (ImageView) C0761c.b(view, R.id.onboarding_add_photo_imageview, "field 'mAddPhotoImageView'", ImageView.class);
        View a = C0761c.a(view, R.id.onboarding_add_photo_done_button, "field 'mAddPhotoDoneButton' and method 'onAddPhotoDoneButtonClicked'");
        photosStepView.mAddPhotoDoneButton = (Button) C0761c.c(a, R.id.onboarding_add_photo_done_button, "field 'mAddPhotoDoneButton'", Button.class);
        this.f39560c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ PhotosStepView_ViewBinding f39556b;

            public void doClick(View view) {
                photosStepView.onAddPhotoDoneButtonClicked();
            }
        });
        photosStepView.mAddPhotoEmptyStateCard = C0761c.a(view, R.id.onboarding_add_photo_empty_state_card, "field 'mAddPhotoEmptyStateCard'");
        photosStepView.mAddPhotoPlusImageCircleView = C0761c.a(view, R.id.onboarding_add_photo_plus_circle, "field 'mAddPhotoPlusImageCircleView'");
        photosStepView.mAddPhotoTextView = C0761c.a(view, R.id.onboarding_add_photo_text, "field 'mAddPhotoTextView'");
        a = C0761c.a(view, R.id.onboarding_add_photo_button, "method 'onAddPhotoButtonClick'");
        this.f39561d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ PhotosStepView_ViewBinding f39558b;

            public void doClick(View view) {
                photosStepView.onAddPhotoButtonClick();
            }
        });
        photosStepView.mLoadingString = view.getContext().getResources().getString(R.string.mad_ave_loading);
    }

    @CallSuper
    public void unbind() {
        PhotosStepView photosStepView = this.f39559b;
        if (photosStepView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39559b = null;
        photosStepView.mAddPhotoImageView = null;
        photosStepView.mAddPhotoDoneButton = null;
        photosStepView.mAddPhotoEmptyStateCard = null;
        photosStepView.mAddPhotoPlusImageCircleView = null;
        photosStepView.mAddPhotoTextView = null;
        this.f39560c.setOnClickListener(null);
        this.f39560c = null;
        this.f39561d.setOnClickListener(null);
        this.f39561d = null;
    }
}
