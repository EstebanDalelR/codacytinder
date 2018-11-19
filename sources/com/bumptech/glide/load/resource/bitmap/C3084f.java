package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.C3076a;
import com.bumptech.glide.load.resource.p029b.C3078c;
import com.bumptech.glide.provider.DataLoadProvider;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
public class C3084f implements DataLoadProvider<ParcelFileDescriptor, Bitmap> {
    /* renamed from: a */
    private final ResourceDecoder<File, Bitmap> f9546a;
    /* renamed from: b */
    private final C3085g f9547b;
    /* renamed from: c */
    private final C4102a f9548c = new C4102a();
    /* renamed from: d */
    private final Encoder<ParcelFileDescriptor> f9549d = C3076a.m12020a();

    public C3084f(BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.f9546a = new C3078c(new C3090n(bitmapPool, decodeFormat));
        this.f9547b = new C3085g(bitmapPool, decodeFormat);
    }

    public ResourceDecoder<File, Bitmap> getCacheDecoder() {
        return this.f9546a;
    }

    public ResourceDecoder<ParcelFileDescriptor, Bitmap> getSourceDecoder() {
        return this.f9547b;
    }

    public Encoder<ParcelFileDescriptor> getSourceEncoder() {
        return this.f9549d;
    }

    public ResourceEncoder<Bitmap> getEncoder() {
        return this.f9548c;
    }
}
