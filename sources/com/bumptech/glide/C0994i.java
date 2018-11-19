package com.bumptech.glide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.C3030b;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.p027a.C1000a;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.load.model.C1037f;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.file_descriptor.C4089a.C3055a;
import com.bumptech.glide.load.model.file_descriptor.C4090b.C3056a;
import com.bumptech.glide.load.model.file_descriptor.C4091c.C3057a;
import com.bumptech.glide.load.model.file_descriptor.C4092d.C3058a;
import com.bumptech.glide.load.model.stream.C4093a.C3068a;
import com.bumptech.glide.load.model.stream.C4094b.C3069a;
import com.bumptech.glide.load.model.stream.C4095c.C3070a;
import com.bumptech.glide.load.model.stream.C4096d.C3071a;
import com.bumptech.glide.load.model.stream.C4097e.C3072a;
import com.bumptech.glide.load.model.stream.C4098f.C3073a;
import com.bumptech.glide.load.model.stream.C4099g.C3074a;
import com.bumptech.glide.load.resource.bitmap.C3084f;
import com.bumptech.glide.load.resource.bitmap.C3086i;
import com.bumptech.glide.load.resource.bitmap.C3088l;
import com.bumptech.glide.load.resource.bitmap.C3089m;
import com.bumptech.glide.load.resource.bitmap.C4103d;
import com.bumptech.glide.load.resource.bitmap.C4107h;
import com.bumptech.glide.load.resource.gif.C3101b;
import com.bumptech.glide.load.resource.gif.C3102c;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.load.resource.p029b.C3080d;
import com.bumptech.glide.load.resource.p030c.C1049a;
import com.bumptech.glide.load.resource.p030c.C3095f;
import com.bumptech.glide.load.resource.p030c.C3096g;
import com.bumptech.glide.load.resource.transcode.C1058c;
import com.bumptech.glide.load.resource.transcode.C3108a;
import com.bumptech.glide.load.resource.transcode.C3109b;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.manager.C1063h;
import com.bumptech.glide.module.C1066a;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.p026d.C0987h;
import com.bumptech.glide.provider.C1067b;
import com.bumptech.glide.provider.DataLoadProvider;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C1070f;
import com.bumptech.glide.request.target.C4331i;
import com.bumptech.glide.request.target.Target;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.i */
public class C0994i {
    /* renamed from: a */
    private static volatile C0994i f2762a = null;
    /* renamed from: b */
    private static boolean f2763b = true;
    /* renamed from: c */
    private final C1035c f2764c;
    /* renamed from: d */
    private final C3030b f2765d;
    /* renamed from: e */
    private final BitmapPool f2766e;
    /* renamed from: f */
    private final MemoryCache f2767f;
    /* renamed from: g */
    private final DecodeFormat f2768g;
    /* renamed from: h */
    private final C1070f f2769h = new C1070f();
    /* renamed from: i */
    private final C1058c f2770i = new C1058c();
    /* renamed from: j */
    private final C1067b f2771j;
    /* renamed from: k */
    private final C4103d f2772k;
    /* renamed from: l */
    private final C3095f f2773l;
    /* renamed from: m */
    private final C4107h f2774m;
    /* renamed from: n */
    private final C3095f f2775n;
    /* renamed from: o */
    private final Handler f2776o;
    /* renamed from: p */
    private final C1000a f2777p;

    /* renamed from: com.bumptech.glide.i$a */
    private static class C4434a extends C4331i<View, Object> {
        public void onLoadCleared(Drawable drawable) {
        }

        public void onLoadFailed(Exception exception, Drawable drawable) {
        }

        public void onLoadStarted(Drawable drawable) {
        }

        public void onResourceReady(Object obj, GlideAnimation<? super Object> glideAnimation) {
        }

        public C4434a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public static C0994i m3480a(Context context) {
        if (f2762a == null) {
            synchronized (C0994i.class) {
                if (f2762a == null) {
                    context = context.getApplicationContext();
                    C0995j c0995j = new C0995j(context);
                    List<GlideModule> c = C0994i.m3488c(context);
                    for (GlideModule applyOptions : c) {
                        applyOptions.applyOptions(context, c0995j);
                    }
                    f2762a = c0995j.m3504a();
                    for (GlideModule registerComponents : c) {
                        registerComponents.registerComponents(context, f2762a);
                    }
                }
            }
        }
        return f2762a;
    }

    /* renamed from: c */
    private static List<GlideModule> m3488c(Context context) {
        if (f2763b) {
            return new C1066a(context).m3672a();
        }
        return Collections.emptyList();
    }

    C0994i(C3030b c3030b, MemoryCache memoryCache, BitmapPool bitmapPool, Context context, DecodeFormat decodeFormat) {
        this.f2765d = c3030b;
        this.f2766e = bitmapPool;
        this.f2767f = memoryCache;
        this.f2768g = decodeFormat;
        this.f2764c = new C1035c(context);
        this.f2776o = new Handler(Looper.getMainLooper());
        this.f2777p = new C1000a(memoryCache, bitmapPool, decodeFormat);
        this.f2771j = new C1067b();
        c3030b = new C3089m(bitmapPool, decodeFormat);
        this.f2771j.m3674a(InputStream.class, Bitmap.class, c3030b);
        memoryCache = new C3084f(bitmapPool, decodeFormat);
        this.f2771j.m3674a(ParcelFileDescriptor.class, Bitmap.class, memoryCache);
        decodeFormat = new C3088l(c3030b, memoryCache);
        this.f2771j.m3674a(C1037f.class, Bitmap.class, decodeFormat);
        c3030b = new C3102c(context, bitmapPool);
        this.f2771j.m3674a(InputStream.class, C3101b.class, c3030b);
        this.f2771j.m3674a(C1037f.class, C1049a.class, new C3096g(decodeFormat, c3030b, bitmapPool));
        this.f2771j.m3674a(InputStream.class, File.class, new C3080d());
        m3494a(File.class, ParcelFileDescriptor.class, new C3055a());
        m3494a(File.class, InputStream.class, new C3070a());
        m3494a(Integer.TYPE, ParcelFileDescriptor.class, new C3056a());
        m3494a(Integer.TYPE, InputStream.class, new C3071a());
        m3494a(Integer.class, ParcelFileDescriptor.class, new C3056a());
        m3494a(Integer.class, InputStream.class, new C3071a());
        m3494a(String.class, ParcelFileDescriptor.class, new C3057a());
        m3494a(String.class, InputStream.class, new C3072a());
        m3494a(Uri.class, ParcelFileDescriptor.class, new C3058a());
        m3494a(Uri.class, InputStream.class, new C3073a());
        m3494a(URL.class, InputStream.class, new C3074a());
        m3494a(C1036d.class, InputStream.class, new C3068a());
        m3494a(byte[].class, InputStream.class, new C3069a());
        this.f2770i.m3645a(Bitmap.class, C3086i.class, new C3109b(context.getResources(), bitmapPool));
        this.f2770i.m3645a(C1049a.class, C1041b.class, new C3108a(new C3109b(context.getResources(), bitmapPool)));
        this.f2772k = new C4103d(bitmapPool);
        this.f2773l = new C3095f(bitmapPool, this.f2772k);
        this.f2774m = new C4107h(bitmapPool);
        this.f2775n = new C3095f(bitmapPool, this.f2774m);
    }

    /* renamed from: a */
    public BitmapPool m3490a() {
        return this.f2766e;
    }

    /* renamed from: a */
    <Z, R> ResourceTranscoder<Z, R> m3491a(Class<Z> cls, Class<R> cls2) {
        return this.f2770i.m3644a(cls, cls2);
    }

    /* renamed from: b */
    <T, Z> DataLoadProvider<T, Z> m3496b(Class<T> cls, Class<Z> cls2) {
        return this.f2771j.m3673a(cls, cls2);
    }

    /* renamed from: a */
    <R> Target<R> m3492a(ImageView imageView, Class<R> cls) {
        return this.f2769h.m3678a(imageView, cls);
    }

    /* renamed from: b */
    C3030b m3495b() {
        return this.f2765d;
    }

    /* renamed from: c */
    C4103d m3497c() {
        return this.f2772k;
    }

    /* renamed from: d */
    C4107h m3498d() {
        return this.f2774m;
    }

    /* renamed from: e */
    C3095f m3499e() {
        return this.f2773l;
    }

    /* renamed from: f */
    C3095f m3500f() {
        return this.f2775n;
    }

    /* renamed from: g */
    Handler m3501g() {
        return this.f2776o;
    }

    /* renamed from: h */
    DecodeFormat m3502h() {
        return this.f2768g;
    }

    /* renamed from: j */
    private C1035c m3489j() {
        return this.f2764c;
    }

    /* renamed from: i */
    public void m3503i() {
        C0987h.m3411a();
        this.f2767f.clearMemory();
        this.f2766e.clearMemory();
    }

    /* renamed from: a */
    public void m3493a(int i) {
        C0987h.m3411a();
        this.f2767f.trimMemory(i);
        this.f2766e.trimMemory(i);
    }

    /* renamed from: a */
    public static void m3485a(Target<?> target) {
        C0987h.m3411a();
        Request request = target.getRequest();
        if (request != null) {
            request.clear();
            target.setRequest(null);
        }
    }

    /* renamed from: a */
    public static void m3484a(FutureTarget<?> futureTarget) {
        futureTarget.clear();
    }

    /* renamed from: a */
    public static void m3483a(View view) {
        C0994i.m3485a(new C4434a(view));
    }

    /* renamed from: a */
    public <T, Y> void m3494a(Class<T> cls, Class<Y> cls2, ModelLoaderFactory<T, Y> modelLoaderFactory) {
        cls = this.f2764c.m3575a((Class) cls, (Class) cls2, (ModelLoaderFactory) modelLoaderFactory);
        if (cls != null) {
            cls.teardown();
        }
    }

    /* renamed from: a */
    public static <T, Y> ModelLoader<T, Y> m3482a(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls != null) {
            return C0994i.m3480a(context).m3489j().m3574a(cls, cls2);
        }
        if (Log.isLoggable("Glide", 3) != null) {
            Log.d("Glide", "Unable to load null model, setting placeholder only");
        }
        return null;
    }

    /* renamed from: a */
    public static <T> ModelLoader<T, InputStream> m3481a(Class<T> cls, Context context) {
        return C0994i.m3482a((Class) cls, InputStream.class, context);
    }

    /* renamed from: b */
    public static <T> ModelLoader<T, ParcelFileDescriptor> m3487b(Class<T> cls, Context context) {
        return C0994i.m3482a((Class) cls, ParcelFileDescriptor.class, context);
    }

    /* renamed from: b */
    public static RequestManager m3486b(Context context) {
        return C1063h.m3655a().m3659a(context);
    }

    /* renamed from: a */
    public static RequestManager m3478a(Activity activity) {
        return C1063h.m3655a().m3658a(activity);
    }

    /* renamed from: a */
    public static RequestManager m3479a(FragmentActivity fragmentActivity) {
        return C1063h.m3655a().m3662a(fragmentActivity);
    }
}
