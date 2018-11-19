package com.facebook.internal;

import android.graphics.Bitmap;

/* renamed from: com.facebook.internal.n */
public class C1732n {
    /* renamed from: a */
    private ImageRequest f4787a;
    /* renamed from: b */
    private Exception f4788b;
    /* renamed from: c */
    private boolean f4789c;
    /* renamed from: d */
    private Bitmap f4790d;

    C1732n(ImageRequest imageRequest, Exception exception, boolean z, Bitmap bitmap) {
        this.f4787a = imageRequest;
        this.f4788b = exception;
        this.f4790d = bitmap;
        this.f4789c = z;
    }

    /* renamed from: a */
    public ImageRequest m5962a() {
        return this.f4787a;
    }

    /* renamed from: b */
    public Exception m5963b() {
        return this.f4788b;
    }

    /* renamed from: c */
    public Bitmap m5964c() {
        return this.f4790d;
    }

    /* renamed from: d */
    public boolean m5965d() {
        return this.f4789c;
    }
}
