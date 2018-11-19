package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.C0992b;
import com.bumptech.glide.gifdecoder.C0993c;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.C3098d;
import com.bumptech.glide.p026d.C0987h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.resource.gif.h */
public class C3107h implements ResourceDecoder<InputStream, C3101b> {
    /* renamed from: a */
    private static final C1056b f9616a = new C1056b();
    /* renamed from: b */
    private static final C1055a f9617b = new C1055a();
    /* renamed from: c */
    private final Context f9618c;
    /* renamed from: d */
    private final C1056b f9619d;
    /* renamed from: e */
    private final BitmapPool f9620e;
    /* renamed from: f */
    private final C1055a f9621f;
    /* renamed from: g */
    private final C3100a f9622g;

    /* renamed from: com.bumptech.glide.load.resource.gif.h$a */
    static class C1055a {
        /* renamed from: a */
        private final Queue<GifDecoder> f2895a = C0987h.m3410a(0);

        C1055a() {
        }

        /* renamed from: a */
        public synchronized GifDecoder m3636a(BitmapProvider bitmapProvider) {
            GifDecoder gifDecoder;
            gifDecoder = (GifDecoder) this.f2895a.poll();
            if (gifDecoder == null) {
                gifDecoder = new GifDecoder(bitmapProvider);
            }
            return gifDecoder;
        }

        /* renamed from: a */
        public synchronized void m3637a(GifDecoder gifDecoder) {
            gifDecoder.m3458g();
            this.f2895a.offer(gifDecoder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.h$b */
    static class C1056b {
        /* renamed from: a */
        private final Queue<C0993c> f2896a = C0987h.m3410a(0);

        C1056b() {
        }

        /* renamed from: a */
        public synchronized C0993c m3638a(byte[] bArr) {
            C0993c c0993c;
            c0993c = (C0993c) this.f2896a.poll();
            if (c0993c == null) {
                c0993c = new C0993c();
            }
            return c0993c.m3475a(bArr);
        }

        /* renamed from: a */
        public synchronized void m3639a(C0993c c0993c) {
            c0993c.m3476a();
            this.f2896a.offer(c0993c);
        }
    }

    public String getId() {
        return "";
    }

    public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
        return m12071a((InputStream) obj, i, i2);
    }

    public C3107h(Context context, BitmapPool bitmapPool) {
        this(context, bitmapPool, f9616a, f9617b);
    }

    C3107h(Context context, BitmapPool bitmapPool, C1056b c1056b, C1055a c1055a) {
        this.f9618c = context.getApplicationContext();
        this.f9620e = bitmapPool;
        this.f9621f = c1055a;
        this.f9622g = new C3100a(bitmapPool);
        this.f9619d = c1056b;
    }

    /* renamed from: a */
    public C4110d m12071a(InputStream inputStream, int i, int i2) {
        byte[] a = C3107h.m12070a(inputStream);
        C0993c a2 = this.f9619d.m3638a(a);
        GifDecoder a3 = this.f9621f.m3636a(this.f9622g);
        try {
            i = m12069a(a, i, i2, a2, a3);
            return i;
        } finally {
            this.f9619d.m3639a(a2);
            this.f9621f.m3637a(a3);
        }
    }

    /* renamed from: a */
    private C4110d m12069a(byte[] bArr, int i, int i2, C0993c c0993c, GifDecoder gifDecoder) {
        C0992b b = c0993c.m3477b();
        if (b.m3459a() > null) {
            if (b.m3460b() == null) {
                Bitmap a = m12068a(gifDecoder, b, bArr);
                if (a == null) {
                    return null;
                }
                return new C4110d(new C3101b(this.f9618c, this.f9622g, this.f9620e, C3098d.m12053a(), i, i2, b, bArr, a));
            }
        }
        return null;
    }

    /* renamed from: a */
    private Bitmap m12068a(GifDecoder gifDecoder, C0992b c0992b, byte[] bArr) {
        gifDecoder.m3452a(c0992b, bArr);
        gifDecoder.m3451a();
        return gifDecoder.m3457f();
    }

    /* renamed from: a */
    private static byte[] m12070a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
        } catch (InputStream inputStream2) {
            Log.w("GifResourceDecoder", "Error reading data from stream", inputStream2);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
