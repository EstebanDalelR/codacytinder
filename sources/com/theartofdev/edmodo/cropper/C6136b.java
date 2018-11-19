package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.C6139c.C6138b;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.b */
final class C6136b extends AsyncTask<Void, Void, C6135a> {
    /* renamed from: a */
    private final WeakReference<CropImageView> f22614a;
    /* renamed from: b */
    private final Uri f22615b;
    /* renamed from: c */
    private final Context f22616c;
    /* renamed from: d */
    private final int f22617d;
    /* renamed from: e */
    private final int f22618e;

    /* renamed from: com.theartofdev.edmodo.cropper.b$a */
    public static final class C6135a {
        /* renamed from: a */
        public final Uri f22609a;
        /* renamed from: b */
        public final Bitmap f22610b;
        /* renamed from: c */
        public final int f22611c;
        /* renamed from: d */
        public final int f22612d;
        /* renamed from: e */
        public final Exception f22613e;

        C6135a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f22609a = uri;
            this.f22610b = bitmap;
            this.f22611c = i;
            this.f22612d = i2;
            this.f22613e = null;
        }

        C6135a(Uri uri, Exception exception) {
            this.f22609a = uri;
            this.f22610b = null;
            this.f22611c = 0;
            this.f22612d = 0;
            this.f22613e = exception;
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m26688a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m26689a((C6135a) obj);
    }

    public C6136b(CropImageView cropImageView, Uri uri) {
        this.f22615b = uri;
        this.f22614a = new WeakReference(cropImageView);
        this.f22616c = cropImageView.getContext();
        cropImageView = cropImageView.getResources().getDisplayMetrics();
        double d = cropImageView.density > 1065353216 ? (double) (1.0f / cropImageView.density) : 1.0d;
        this.f22617d = (int) (((double) cropImageView.widthPixels) * d);
        this.f22618e = (int) (((double) cropImageView.heightPixels) * d);
    }

    /* renamed from: a */
    public Uri m26687a() {
        return this.f22615b;
    }

    /* renamed from: a */
    protected C6135a m26688a(Void... voidArr) {
        try {
            if (isCancelled() == null) {
                voidArr = C6139c.m26701a(this.f22616c, this.f22615b, this.f22617d, this.f22618e);
                if (!isCancelled()) {
                    C6138b a = C6139c.m26706a(voidArr.f22619a, this.f22616c, this.f22615b);
                    return new C6135a(this.f22615b, a.f22621a, voidArr.f22620b, a.f22622b);
                }
            }
            return null;
        } catch (Void[] voidArr2) {
            return new C6135a(this.f22615b, voidArr2);
        }
    }

    /* renamed from: a */
    protected void m26689a(C6135a c6135a) {
        if (c6135a != null) {
            Object obj = null;
            if (!isCancelled()) {
                CropImageView cropImageView = (CropImageView) this.f22614a.get();
                if (cropImageView != null) {
                    obj = 1;
                    cropImageView.m26645a(c6135a);
                }
            }
            if (obj == null && c6135a.f22610b != null) {
                c6135a.f22610b.recycle();
            }
        }
    }
}
