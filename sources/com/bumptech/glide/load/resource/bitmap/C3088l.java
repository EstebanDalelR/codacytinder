package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.model.C1037f;
import com.bumptech.glide.load.model.C3059g;
import com.bumptech.glide.provider.DataLoadProvider;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.l */
public class C3088l implements DataLoadProvider<C1037f, Bitmap> {
    /* renamed from: a */
    private final C3087k f9561a;
    /* renamed from: b */
    private final ResourceDecoder<File, Bitmap> f9562b;
    /* renamed from: c */
    private final ResourceEncoder<Bitmap> f9563c;
    /* renamed from: d */
    private final C3059g f9564d;

    public C3088l(DataLoadProvider<InputStream, Bitmap> dataLoadProvider, DataLoadProvider<ParcelFileDescriptor, Bitmap> dataLoadProvider2) {
        this.f9563c = dataLoadProvider.getEncoder();
        this.f9564d = new C3059g(dataLoadProvider.getSourceEncoder(), dataLoadProvider2.getSourceEncoder());
        this.f9562b = dataLoadProvider.getCacheDecoder();
        this.f9561a = new C3087k(dataLoadProvider.getSourceDecoder(), dataLoadProvider2.getSourceDecoder());
    }

    public ResourceDecoder<File, Bitmap> getCacheDecoder() {
        return this.f9562b;
    }

    public ResourceDecoder<C1037f, Bitmap> getSourceDecoder() {
        return this.f9561a;
    }

    public Encoder<C1037f> getSourceEncoder() {
        return this.f9564d;
    }

    public ResourceEncoder<Bitmap> getEncoder() {
        return this.f9563c;
    }
}
