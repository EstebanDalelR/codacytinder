package com.tinder.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ImageCropperActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ImageCropperActivity f26194b;

    @UiThread
    public ImageCropperActivity_ViewBinding(ImageCropperActivity imageCropperActivity, View view) {
        this.f26194b = imageCropperActivity;
        imageCropperActivity.mImageView = (ImageView) C0761c.b(view, R.id.ImageView_image, "field 'mImageView'", ImageView.class);
    }

    @CallSuper
    public void unbind() {
        ImageCropperActivity imageCropperActivity = this.f26194b;
        if (imageCropperActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26194b = null;
        imageCropperActivity.mImageView = null;
    }
}
