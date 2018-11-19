package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.C6139c.C6137a;
import com.theartofdev.edmodo.cropper.CropImageView.RequestSizeOptions;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.a */
final class C6134a extends AsyncTask<Void, Void, C6133a> {
    /* renamed from: a */
    private final WeakReference<CropImageView> f22592a;
    /* renamed from: b */
    private final Bitmap f22593b;
    /* renamed from: c */
    private final Uri f22594c;
    /* renamed from: d */
    private final Context f22595d;
    /* renamed from: e */
    private final float[] f22596e;
    /* renamed from: f */
    private final int f22597f;
    /* renamed from: g */
    private final int f22598g;
    /* renamed from: h */
    private final int f22599h;
    /* renamed from: i */
    private final boolean f22600i;
    /* renamed from: j */
    private final int f22601j;
    /* renamed from: k */
    private final int f22602k;
    /* renamed from: l */
    private final int f22603l;
    /* renamed from: m */
    private final int f22604m;
    /* renamed from: n */
    private final RequestSizeOptions f22605n;
    /* renamed from: o */
    private final Uri f22606o;
    /* renamed from: p */
    private final CompressFormat f22607p;
    /* renamed from: q */
    private final int f22608q;

    /* renamed from: com.theartofdev.edmodo.cropper.a$a */
    public static final class C6133a {
        /* renamed from: a */
        public final Bitmap f22587a;
        /* renamed from: b */
        public final Uri f22588b;
        /* renamed from: c */
        public final Exception f22589c;
        /* renamed from: d */
        public final boolean f22590d;
        /* renamed from: e */
        public final int f22591e;

        C6133a(Bitmap bitmap, int i) {
            this.f22587a = bitmap;
            this.f22588b = null;
            this.f22589c = null;
            this.f22590d = null;
            this.f22591e = i;
        }

        C6133a(Uri uri, int i) {
            this.f22587a = null;
            this.f22588b = uri;
            this.f22589c = null;
            this.f22590d = true;
            this.f22591e = i;
        }

        C6133a(Exception exception, boolean z) {
            this.f22587a = null;
            this.f22588b = null;
            this.f22589c = exception;
            this.f22590d = z;
            this.f22591e = 1;
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m26685a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m26686a((C6133a) obj);
    }

    public C6134a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, RequestSizeOptions requestSizeOptions, Uri uri, CompressFormat compressFormat, int i6) {
        this.f22592a = new WeakReference(cropImageView);
        this.f22595d = cropImageView.getContext();
        this.f22593b = bitmap;
        this.f22596e = fArr;
        this.f22594c = null;
        this.f22597f = i;
        this.f22600i = z;
        this.f22601j = i2;
        this.f22602k = i3;
        this.f22603l = i4;
        this.f22604m = i5;
        this.f22605n = requestSizeOptions;
        this.f22606o = uri;
        this.f22607p = compressFormat;
        this.f22608q = i6;
        this.f22598g = 0;
        this.f22599h = 0;
    }

    public C6134a(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, RequestSizeOptions requestSizeOptions, Uri uri2, CompressFormat compressFormat, int i8) {
        CropImageView cropImageView2 = cropImageView;
        this.f22592a = new WeakReference(cropImageView2);
        this.f22595d = cropImageView2.getContext();
        this.f22594c = uri;
        this.f22596e = fArr;
        this.f22597f = i;
        this.f22600i = z;
        this.f22601j = i4;
        this.f22602k = i5;
        this.f22598g = i2;
        this.f22599h = i3;
        this.f22603l = i6;
        this.f22604m = i7;
        this.f22605n = requestSizeOptions;
        this.f22606o = uri2;
        this.f22607p = compressFormat;
        this.f22608q = i8;
        this.f22593b = null;
    }

    /* renamed from: a */
    protected C6133a m26685a(Void... voidArr) {
        boolean z = true;
        try {
            Bitmap bitmap = null;
            if (isCancelled()) {
                return null;
            }
            int i;
            if (this.f22594c != null) {
                C6137a a = C6139c.m26703a(this.f22595d, this.f22594c, this.f22596e, this.f22597f, this.f22598g, this.f22599h, this.f22600i, this.f22601j, this.f22602k, this.f22603l, this.f22604m);
                bitmap = a.f22619a;
                i = a.f22620b;
            } else {
                if (this.f22593b != null) {
                    bitmap = C6139c.m26697a(this.f22593b, this.f22596e, this.f22597f, this.f22600i, this.f22601j, this.f22602k);
                }
                i = 1;
            }
            bitmap = C6139c.m26696a(bitmap, this.f22603l, this.f22604m, this.f22605n);
            if (this.f22606o == null) {
                return new C6133a(bitmap, i);
            }
            C6139c.m26709a(this.f22595d, bitmap, this.f22606o, this.f22607p, this.f22608q);
            if (bitmap != null) {
                bitmap.recycle();
            }
            return new C6133a(this.f22606o, i);
        } catch (Exception e) {
            if (this.f22606o == null) {
                z = null;
            }
            return new C6133a(e, z);
        }
    }

    /* renamed from: a */
    protected void m26686a(C6133a c6133a) {
        if (c6133a != null) {
            Object obj = null;
            if (!isCancelled()) {
                CropImageView cropImageView = (CropImageView) this.f22592a.get();
                if (cropImageView != null) {
                    obj = 1;
                    cropImageView.m26644a(c6133a);
                }
            }
            if (obj == null && c6133a.f22587a != null) {
                c6133a.f22587a.recycle();
            }
        }
    }
}
