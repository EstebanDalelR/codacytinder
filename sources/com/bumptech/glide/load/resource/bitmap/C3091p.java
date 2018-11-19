package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
public class C3091p implements BitmapDecoder<ParcelFileDescriptor> {
    /* renamed from: a */
    private static final C1048a f9573a = new C1048a();
    /* renamed from: b */
    private C1048a f9574b;
    /* renamed from: c */
    private int f9575c;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.p$a */
    static class C1048a {
        C1048a() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever m3622a() {
            return new MediaMetadataRetriever();
        }
    }

    public String getId() {
        return "VideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }

    public /* synthetic */ Bitmap decode(Object obj, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) throws Exception {
        return m12045a((ParcelFileDescriptor) obj, bitmapPool, i, i2, decodeFormat);
    }

    public C3091p() {
        this(f9573a, -1);
    }

    C3091p(C1048a c1048a, int i) {
        this.f9574b = c1048a;
        this.f9575c = i;
    }

    /* renamed from: a */
    public Bitmap m12045a(ParcelFileDescriptor parcelFileDescriptor, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) throws IOException {
        bitmapPool = this.f9574b.m3622a();
        bitmapPool.setDataSource(parcelFileDescriptor.getFileDescriptor());
        if (this.f9575c >= 0) {
            i = bitmapPool.getFrameAtTime((long) this.f9575c);
        } else {
            i = bitmapPool.getFrameAtTime();
        }
        bitmapPool.release();
        parcelFileDescriptor.close();
        return i;
    }
}
