package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
public class C3085g implements ResourceDecoder<ParcelFileDescriptor, Bitmap> {
    /* renamed from: a */
    private final C3091p f9550a;
    /* renamed from: b */
    private final BitmapPool f9551b;
    /* renamed from: c */
    private DecodeFormat f9552c;

    public String getId() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }

    public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
        return m12039a((ParcelFileDescriptor) obj, i, i2);
    }

    public C3085g(BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this(new C3091p(), bitmapPool, decodeFormat);
    }

    public C3085g(C3091p c3091p, BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.f9550a = c3091p;
        this.f9551b = bitmapPool;
        this.f9552c = decodeFormat;
    }

    /* renamed from: a */
    public Resource<Bitmap> m12039a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) throws IOException {
        return C3081b.m12024a(this.f9550a.m12045a(parcelFileDescriptor, this.f9551b, i, i2, this.f9552c), this.f9551b);
    }
}
