package com.bumptech.glide.load.resource.p030c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.C1037f;
import com.bumptech.glide.load.resource.gif.C3101b;
import com.bumptech.glide.load.resource.p029b.C3078c;
import com.bumptech.glide.provider.DataLoadProvider;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.c.g */
public class C3096g implements DataLoadProvider<C1037f, C1049a> {
    /* renamed from: a */
    private final ResourceDecoder<File, C1049a> f9588a;
    /* renamed from: b */
    private final ResourceDecoder<C1037f, C1049a> f9589b;
    /* renamed from: c */
    private final ResourceEncoder<C1049a> f9590c;
    /* renamed from: d */
    private final Encoder<C1037f> f9591d;

    public C3096g(DataLoadProvider<C1037f, Bitmap> dataLoadProvider, DataLoadProvider<InputStream, C3101b> dataLoadProvider2, BitmapPool bitmapPool) {
        ResourceDecoder c3093c = new C3093c(dataLoadProvider.getSourceDecoder(), dataLoadProvider2.getSourceDecoder(), bitmapPool);
        this.f9588a = new C3078c(new C3094e(c3093c));
        this.f9589b = c3093c;
        this.f9590c = new C4109d(dataLoadProvider.getEncoder(), dataLoadProvider2.getEncoder());
        this.f9591d = dataLoadProvider.getSourceEncoder();
    }

    public ResourceDecoder<File, C1049a> getCacheDecoder() {
        return this.f9588a;
    }

    public ResourceDecoder<C1037f, C1049a> getSourceDecoder() {
        return this.f9589b;
    }

    public Encoder<C1037f> getSourceEncoder() {
        return this.f9591d;
    }

    public ResourceEncoder<C1049a> getEncoder() {
        return this.f9590c;
    }
}
