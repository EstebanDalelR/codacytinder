package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.f */
public class C1037f {
    /* renamed from: a */
    private final InputStream f2848a;
    /* renamed from: b */
    private final ParcelFileDescriptor f2849b;

    public C1037f(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f2848a = inputStream;
        this.f2849b = parcelFileDescriptor;
    }

    /* renamed from: a */
    public InputStream m3582a() {
        return this.f2848a;
    }

    /* renamed from: b */
    public ParcelFileDescriptor m3583b() {
        return this.f2849b;
    }
}
