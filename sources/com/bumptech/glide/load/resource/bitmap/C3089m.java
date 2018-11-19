package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.C3064k;
import com.bumptech.glide.load.resource.p029b.C3078c;
import com.bumptech.glide.provider.DataLoadProvider;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.m */
public class C3089m implements DataLoadProvider<InputStream, Bitmap> {
    /* renamed from: a */
    private final C3090n f9565a;
    /* renamed from: b */
    private final C4102a f9566b;
    /* renamed from: c */
    private final C3064k f9567c = new C3064k();
    /* renamed from: d */
    private final C3078c<Bitmap> f9568d;

    public C3089m(BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.f9565a = new C3090n(bitmapPool, decodeFormat);
        this.f9566b = new C4102a();
        this.f9568d = new C3078c(this.f9565a);
    }

    public ResourceDecoder<File, Bitmap> getCacheDecoder() {
        return this.f9568d;
    }

    public ResourceDecoder<InputStream, Bitmap> getSourceDecoder() {
        return this.f9565a;
    }

    public Encoder<InputStream> getSourceEncoder() {
        return this.f9567c;
    }

    public ResourceEncoder<Bitmap> getEncoder() {
        return this.f9566b;
    }
}
