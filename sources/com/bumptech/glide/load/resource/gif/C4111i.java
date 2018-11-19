package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.C0992b;
import com.bumptech.glide.gifdecoder.C0993c;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.C3098d;
import com.bumptech.glide.load.resource.bitmap.C3081b;
import com.bumptech.glide.p024b.C0975a;
import com.bumptech.glide.p026d.C0982d;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.resource.gif.i */
public class C4111i implements ResourceEncoder<C3101b> {
    /* renamed from: a */
    private static final C1057a f12987a = new C1057a();
    /* renamed from: b */
    private final BitmapProvider f12988b;
    /* renamed from: c */
    private final BitmapPool f12989c;
    /* renamed from: d */
    private final C1057a f12990d;

    /* renamed from: com.bumptech.glide.load.resource.gif.i$a */
    static class C1057a {
        C1057a() {
        }

        /* renamed from: a */
        public GifDecoder m3640a(BitmapProvider bitmapProvider) {
            return new GifDecoder(bitmapProvider);
        }

        /* renamed from: a */
        public C0993c m3641a() {
            return new C0993c();
        }

        /* renamed from: b */
        public C0975a m3643b() {
            return new C0975a();
        }

        /* renamed from: a */
        public Resource<Bitmap> m3642a(Bitmap bitmap, BitmapPool bitmapPool) {
            return new C3081b(bitmap, bitmapPool);
        }
    }

    public String getId() {
        return "";
    }

    public /* synthetic */ boolean encode(Object obj, OutputStream outputStream) {
        return m15976a((Resource) obj, outputStream);
    }

    public C4111i(BitmapPool bitmapPool) {
        this(bitmapPool, f12987a);
    }

    C4111i(BitmapPool bitmapPool, C1057a c1057a) {
        this.f12989c = bitmapPool;
        this.f12988b = new C3100a(bitmapPool);
        this.f12990d = c1057a;
    }

    /* renamed from: a */
    public boolean m15976a(Resource<C3101b> resource, OutputStream outputStream) {
        long a = C0982d.m3393a();
        C3101b c3101b = (C3101b) resource.get();
        Transformation c = c3101b.m12061c();
        if (c instanceof C3098d) {
            return m15975a(c3101b.m12062d(), outputStream);
        }
        GifDecoder a2 = m15973a(c3101b.m12062d());
        C0975a b = this.f12990d.m3643b();
        if (b.m3362a(outputStream) == null) {
            return false;
        }
        outputStream = null;
        while (outputStream < a2.m3454c()) {
            Resource a3 = m15974a(a2.m3457f(), c, c3101b);
            if (b.m3361a((Bitmap) a3.get())) {
                try {
                    b.m3358a(a2.m3450a(a2.m3455d()));
                    a2.m3451a();
                    a3.recycle();
                    outputStream++;
                } catch (Resource<C3101b> resource2) {
                    a3.recycle();
                    throw resource2;
                }
            }
            a3.recycle();
            return false;
        }
        outputStream = b.m3360a();
        if (Log.isLoggable("GifEncoder", 2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Encoded gif with ");
            stringBuilder.append(a2.m3454c());
            stringBuilder.append(" frames and ");
            stringBuilder.append(c3101b.m12062d().length);
            stringBuilder.append(" bytes in ");
            stringBuilder.append(C0982d.m3392a(a));
            stringBuilder.append(" ms");
            Log.v("GifEncoder", stringBuilder.toString());
        }
        return outputStream;
    }

    /* renamed from: a */
    private boolean m15975a(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return 1;
        } catch (byte[] bArr2) {
            if (Log.isLoggable("GifEncoder", 3) != null) {
                Log.d("GifEncoder", "Failed to write data to output stream in GifResourceEncoder", bArr2);
            }
            return null;
        }
    }

    /* renamed from: a */
    private GifDecoder m15973a(byte[] bArr) {
        C0993c a = this.f12990d.m3641a();
        a.m3475a(bArr);
        C0992b b = a.m3477b();
        GifDecoder a2 = this.f12990d.m3640a(this.f12988b);
        a2.m3452a(b, bArr);
        a2.m3451a();
        return a2;
    }

    /* renamed from: a */
    private Resource<Bitmap> m15974a(Bitmap bitmap, Transformation<Bitmap> transformation, C3101b c3101b) {
        bitmap = this.f12990d.m3642a(bitmap, this.f12989c);
        transformation = transformation.transform(bitmap, c3101b.getIntrinsicWidth(), c3101b.getIntrinsicHeight());
        if (bitmap.equals(transformation) == null) {
            bitmap.recycle();
        }
        return transformation;
    }
}
