package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
public class C3090n implements ResourceDecoder<InputStream, Bitmap> {
    /* renamed from: a */
    private final C3083e f9569a;
    /* renamed from: b */
    private BitmapPool f9570b;
    /* renamed from: c */
    private DecodeFormat f9571c;
    /* renamed from: d */
    private String f9572d;

    public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
        return m12044a((InputStream) obj, i, i2);
    }

    public C3090n(BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this(C3083e.f9541a, bitmapPool, decodeFormat);
    }

    public C3090n(C3083e c3083e, BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.f9569a = c3083e;
        this.f9570b = bitmapPool;
        this.f9571c = decodeFormat;
    }

    /* renamed from: a */
    public Resource<Bitmap> m12044a(InputStream inputStream, int i, int i2) {
        return C3081b.m12024a(this.f9569a.m12037a(inputStream, this.f9570b, i, i2, this.f9571c), this.f9570b);
    }

    public String getId() {
        if (this.f9572d == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap");
            stringBuilder.append(this.f9569a.getId());
            stringBuilder.append(this.f9571c.name());
            this.f9572d = stringBuilder.toString();
        }
        return this.f9572d;
    }
}
