package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C0990e;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.C3076a;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4330g;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.UUID;

class GifFrameLoader {
    /* renamed from: a */
    private final FrameCallback f2878a;
    /* renamed from: b */
    private final GifDecoder f2879b;
    /* renamed from: c */
    private final Handler f2880c;
    /* renamed from: d */
    private boolean f2881d;
    /* renamed from: e */
    private boolean f2882e;
    /* renamed from: f */
    private C0990e<GifDecoder, GifDecoder, Bitmap, Bitmap> f2883f;
    /* renamed from: g */
    private C4435a f2884g;
    /* renamed from: h */
    private boolean f2885h;

    public interface FrameCallback {
        void onFrameReady(int i);
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$b */
    private class C1053b implements Callback {
        /* renamed from: a */
        final /* synthetic */ GifFrameLoader f2877a;

        private C1053b(GifFrameLoader gifFrameLoader) {
            this.f2877a = gifFrameLoader;
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                this.f2877a.m3632a((C4435a) message.obj);
                return true;
            }
            if (message.what == 2) {
                C0994i.m3485a((C4435a) message.obj);
            }
            return null;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$c */
    static class C3099c implements Key {
        /* renamed from: a */
        private final UUID f9594a;

        public C3099c() {
            this(UUID.randomUUID());
        }

        C3099c(UUID uuid) {
            this.f9594a = uuid;
        }

        public boolean equals(Object obj) {
            return obj instanceof C3099c ? ((C3099c) obj).f9594a.equals(this.f9594a) : null;
        }

        public int hashCode() {
            return this.f9594a.hashCode();
        }

        public void updateDiskCacheKey(MessageDigest messageDigest) throws UnsupportedEncodingException {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$a */
    static class C4435a extends C4330g<Bitmap> {
        /* renamed from: a */
        private final Handler f14736a;
        /* renamed from: b */
        private final int f14737b;
        /* renamed from: c */
        private final long f14738c;
        /* renamed from: d */
        private Bitmap f14739d;

        public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
            m18444a((Bitmap) obj, glideAnimation);
        }

        public C4435a(Handler handler, int i, long j) {
            this.f14736a = handler;
            this.f14737b = i;
            this.f14738c = j;
        }

        /* renamed from: a */
        public Bitmap m18443a() {
            return this.f14739d;
        }

        /* renamed from: a */
        public void m18444a(Bitmap bitmap, GlideAnimation<? super Bitmap> glideAnimation) {
            this.f14739d = bitmap;
            this.f14736a.sendMessageAtTime(this.f14736a.obtainMessage(1, this), this.f14738c);
        }
    }

    public GifFrameLoader(Context context, FrameCallback frameCallback, GifDecoder gifDecoder, int i, int i2) {
        this(frameCallback, gifDecoder, 0, m3628a(context, gifDecoder, i, i2, C0994i.m3480a(context).m3490a()));
    }

    GifFrameLoader(FrameCallback frameCallback, GifDecoder gifDecoder, Handler handler, C0990e<GifDecoder, GifDecoder, Bitmap, Bitmap> c0990e) {
        this.f2881d = false;
        this.f2882e = false;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper(), new C1053b());
        }
        this.f2878a = frameCallback;
        this.f2879b = gifDecoder;
        this.f2880c = handler;
        this.f2883f = c0990e;
    }

    /* renamed from: a */
    public void m3631a(Transformation<Bitmap> transformation) {
        if (transformation == null) {
            throw new NullPointerException("Transformation must not be null");
        }
        this.f2883f = this.f2883f.mo1249b(transformation);
    }

    /* renamed from: a */
    public void m3630a() {
        if (!this.f2881d) {
            this.f2881d = true;
            this.f2885h = false;
            m3629e();
        }
    }

    /* renamed from: b */
    public void m3633b() {
        this.f2881d = false;
    }

    /* renamed from: c */
    public void m3634c() {
        m3633b();
        if (this.f2884g != null) {
            C0994i.m3485a(this.f2884g);
            this.f2884g = null;
        }
        this.f2885h = true;
    }

    /* renamed from: d */
    public Bitmap m3635d() {
        return this.f2884g != null ? this.f2884g.m18443a() : null;
    }

    /* renamed from: e */
    private void m3629e() {
        if (this.f2881d) {
            if (!this.f2882e) {
                this.f2882e = true;
                long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f2879b.m3453b());
                this.f2879b.m3451a();
                this.f2883f.mo1242b(new C3099c()).m3435b(new C4435a(this.f2880c, this.f2879b.m3455d(), uptimeMillis));
            }
        }
    }

    /* renamed from: a */
    void m3632a(C4435a c4435a) {
        if (this.f2885h) {
            this.f2880c.obtainMessage(2, c4435a).sendToTarget();
            return;
        }
        C4435a c4435a2 = this.f2884g;
        this.f2884g = c4435a;
        this.f2878a.onFrameReady(c4435a.f14737b);
        if (c4435a2 != null) {
            this.f2880c.obtainMessage(2, c4435a2).sendToTarget();
        }
        this.f2882e = null;
        m3629e();
    }

    /* renamed from: a */
    private static C0990e<GifDecoder, GifDecoder, Bitmap, Bitmap> m3628a(Context context, GifDecoder gifDecoder, int i, int i2, BitmapPool bitmapPool) {
        ResourceDecoder c3106g = new C3106g(bitmapPool);
        bitmapPool = new C3105f();
        return C0994i.m3486b(context).m11770a(bitmapPool, GifDecoder.class).m3293a((Object) gifDecoder).m3290a(Bitmap.class).mo1241b(C3076a.m12020a()).mo1243b(c3106g).mo1248b(true).mo1244b(DiskCacheStrategy.NONE).mo1237b(i, i2);
    }
}
