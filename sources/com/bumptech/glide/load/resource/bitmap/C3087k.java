package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.C1037f;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
public class C3087k implements ResourceDecoder<C1037f, Bitmap> {
    /* renamed from: a */
    private final ResourceDecoder<InputStream, Bitmap> f9559a;
    /* renamed from: b */
    private final ResourceDecoder<ParcelFileDescriptor, Bitmap> f9560b;

    public String getId() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }

    public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
        return m12043a((C1037f) obj, i, i2);
    }

    public C3087k(ResourceDecoder<InputStream, Bitmap> resourceDecoder, ResourceDecoder<ParcelFileDescriptor, Bitmap> resourceDecoder2) {
        this.f9559a = resourceDecoder;
        this.f9560b = resourceDecoder2;
    }

    /* renamed from: a */
    public Resource<Bitmap> m12043a(C1037f c1037f, int i, int i2) throws IOException {
        Resource<Bitmap> decode;
        InputStream a = c1037f.m3582a();
        if (a != null) {
            try {
                decode = this.f9559a.decode(a, i, i2);
            } catch (Throwable e) {
                if (Log.isLoggable("ImageVideoDecoder", 2)) {
                    Log.v("ImageVideoDecoder", "Failed to load image from stream, trying FileDescriptor", e);
                }
            }
            if (decode == null) {
                return decode;
            }
            c1037f = c1037f.m3583b();
            return c1037f == null ? this.f9560b.decode(c1037f, i, i2) : decode;
        }
        decode = null;
        if (decode == null) {
            return decode;
        }
        c1037f = c1037f.m3583b();
        if (c1037f == null) {
        }
    }
}
