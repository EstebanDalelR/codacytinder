package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.theartofdev.edmodo.cropper.CropImageView.C6129a;
import com.theartofdev.edmodo.cropper.CropImageView.Guidelines;

public final class CropImage {

    /* renamed from: com.theartofdev.edmodo.cropper.CropImage$a */
    public static final class C6127a {
        /* renamed from: a */
        private final Uri f22517a;
        /* renamed from: b */
        private final CropImageOptions f22518b;

        private C6127a(@NonNull Uri uri) {
            this.f22517a = uri;
            this.f22518b = new CropImageOptions();
        }

        /* renamed from: a */
        public Intent m26615a(@NonNull Context context) {
            return m26616a(context, CropImageActivity.class);
        }

        /* renamed from: a */
        public Intent m26616a(@NonNull Context context, @Nullable Class<?> cls) {
            this.f22518b.validate();
            Intent intent = new Intent();
            intent.setClass(context, cls);
            intent.putExtra("CROP_IMAGE_EXTRA_SOURCE", this.f22517a);
            intent.putExtra("CROP_IMAGE_EXTRA_OPTIONS", this.f22518b);
            return intent;
        }

        /* renamed from: a */
        public void m26620a(@NonNull Activity activity) {
            this.f22518b.validate();
            activity.startActivityForResult(m26615a((Context) activity), 203);
        }

        /* renamed from: a */
        public void m26621a(@NonNull Activity activity, @Nullable Class<?> cls) {
            this.f22518b.validate();
            activity.startActivityForResult(m26616a((Context) activity, (Class) cls), 203);
        }

        /* renamed from: a */
        public void m26622a(@NonNull Context context, @NonNull Fragment fragment) {
            fragment.startActivityForResult(m26615a(context), 203);
        }

        /* renamed from: a */
        public C6127a m26618a(@NonNull Guidelines guidelines) {
            this.f22518b.guidelines = guidelines;
            return this;
        }

        /* renamed from: a */
        public C6127a m26619a(boolean z) {
            this.f22518b.fixAspectRatio = z;
            return this;
        }

        /* renamed from: a */
        public C6127a m26617a(int i, int i2) {
            this.f22518b.aspectRatioX = i;
            this.f22518b.aspectRatioY = i2;
            this.f22518b.fixAspectRatio = true;
            return this;
        }

        /* renamed from: b */
        public C6127a m26623b(boolean z) {
            this.f22518b.allowRotation = z;
            return this;
        }
    }

    public static final class ActivityResult extends C6129a implements Parcelable {
        public static final Creator<ActivityResult> CREATOR = new C61261();

        /* renamed from: com.theartofdev.edmodo.cropper.CropImage$ActivityResult$1 */
        static class C61261 implements Creator<ActivityResult> {
            C61261() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m26613a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m26614a(i);
            }

            /* renamed from: a */
            public ActivityResult m26613a(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            /* renamed from: a */
            public ActivityResult[] m26614a(int i) {
                return new ActivityResult[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public ActivityResult(Bitmap bitmap, Uri uri, Exception exception, float[] fArr, Rect rect, int i, int i2) {
            super(bitmap, uri, exception, fArr, rect, i, i2);
        }

        protected ActivityResult(Parcel parcel) {
            super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(getUri(), i);
            parcel.writeSerializable(getError());
            parcel.writeFloatArray(getCropPoints());
            parcel.writeParcelable(getCropRect(), i);
            parcel.writeInt(getRotation());
            parcel.writeInt(getSampleSize());
        }
    }

    /* renamed from: a */
    public static C6127a m26625a(@NonNull Uri uri) {
        if (uri != null) {
            if (!uri.equals(Uri.EMPTY)) {
                return new C6127a(uri);
            }
        }
        throw new IllegalArgumentException("Uri must be non null or empty");
    }

    /* renamed from: a */
    public static ActivityResult m26624a(@Nullable Intent intent) {
        return intent != null ? (ActivityResult) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT") : null;
    }
}
