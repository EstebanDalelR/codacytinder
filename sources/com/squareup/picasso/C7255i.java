package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: com.squareup.picasso.i */
class C7255i extends C6084a<ImageView> {
    /* renamed from: m */
    Callback f26150m;

    C7255i(Picasso picasso, ImageView imageView, C6104o c6104o, int i, int i2, int i3, Drawable drawable, String str, Object obj, Callback callback, boolean z) {
        super(picasso, imageView, c6104o, i, i2, i3, drawable, str, obj, z);
        this.f26150m = callback;
    }

    /* renamed from: a */
    public void mo6580a(Bitmap bitmap, LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
        }
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            Bitmap bitmap2 = bitmap;
            LoadedFrom loadedFrom2 = loadedFrom;
            C6099m.m26508a(imageView, this.a.f22318c, bitmap2, loadedFrom2, this.d, this.a.f22326k);
            if (this.f26150m != null) {
                this.f26150m.onSuccess();
            }
        }
    }

    /* renamed from: a */
    public void mo6579a() {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            if (this.g != 0) {
                imageView.setImageResource(this.g);
            } else if (this.h != null) {
                imageView.setImageDrawable(this.h);
            }
            if (this.f26150m != null) {
                this.f26150m.onError();
            }
        }
    }

    /* renamed from: b */
    void mo6581b() {
        super.mo6581b();
        if (this.f26150m != null) {
            this.f26150m = null;
        }
    }
}
