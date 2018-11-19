package com.tinder.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.theartofdev.edmodo.cropper.CropImageActivity;
import com.theartofdev.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.CropImageView.C6129a;

public class ImageCropperActivity extends CropImageActivity {
    /* renamed from: a */
    public static final String f29437a;
    /* renamed from: b */
    public static final String f29438b;
    /* renamed from: c */
    private static final String f29439c = "ImageCropperActivity";
    @BindView(2131361797)
    ImageView mImageView;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f29439c);
        stringBuilder.append(".EXTRA_IMAGE_WIDTH");
        f29437a = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f29439c);
        stringBuilder.append(".EXTRA_IMAGE_HEIGHT");
        f29438b = stringBuilder.toString();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ButterKnife.a(this);
    }

    public void onCropImageComplete(@NonNull CropImageView cropImageView, @NonNull C6129a c6129a) {
        if (c6129a.isSuccessful() != null) {
            cropImageView = this.mImageView.getDrawable();
            m35106a(c6129a.getUri(), c6129a.getError(), c6129a.getSampleSize(), cropImageView.getIntrinsicWidth(), cropImageView.getIntrinsicHeight());
            return;
        }
        m35077a((Uri) c6129a.getUri(), c6129a.getError(), (int) c6129a.getSampleSize());
    }

    /* renamed from: a */
    private void m35106a(@NonNull Uri uri, @Nullable Exception exception, int i, int i2, int i3) {
        int i4 = exception == null ? -1 : 204;
        uri = m35078b(uri, exception, i);
        uri.putExtra(f29437a, i2);
        uri.putExtra(f29438b, i3);
        setResult(i4, uri);
        finish();
    }
}
