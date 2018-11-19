package com.bumptech.glide;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.RequestManager.C0966b;
import com.bumptech.glide.load.model.C1037f;
import com.bumptech.glide.load.model.C3054e;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.load.resource.p030c.C1049a;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.manager.C1064i;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.provider.C4116d;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.target.Target;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.d */
public class C4081d<ModelType> extends C3018c<ModelType> {
    /* renamed from: g */
    private final ModelLoader<ModelType, InputStream> f12953g;
    /* renamed from: h */
    private final ModelLoader<ModelType, ParcelFileDescriptor> f12954h;
    /* renamed from: i */
    private final C0966b f12955i;

    /* renamed from: a */
    private static <A, Z, R> C4116d<A, C1037f, Z, R> m15920a(C0994i c0994i, ModelLoader<A, InputStream> modelLoader, ModelLoader<A, ParcelFileDescriptor> modelLoader2, Class<Z> cls, Class<R> cls2, ResourceTranscoder<Z, R> resourceTranscoder) {
        if (modelLoader == null && modelLoader2 == null) {
            return null;
        }
        if (resourceTranscoder == null) {
            resourceTranscoder = c0994i.m3491a((Class) cls, (Class) cls2);
        }
        return new C4116d(new C3054e(modelLoader, modelLoader2), resourceTranscoder, c0994i.m3496b(C1037f.class, (Class) cls));
    }

    C4081d(Class<ModelType> cls, ModelLoader<ModelType, InputStream> modelLoader, ModelLoader<ModelType, ParcelFileDescriptor> modelLoader2, Context context, C0994i c0994i, C1064i c1064i, Lifecycle lifecycle, C0966b c0966b) {
        super(context, cls, C4081d.m15920a(c0994i, modelLoader, modelLoader2, C1049a.class, C1041b.class, null), c0994i, c1064i, lifecycle);
        this.f12953g = modelLoader;
        this.f12954h = modelLoader2;
        this.f12955i = c0966b;
    }

    /* renamed from: l */
    public C4080b<ModelType> m15924l() {
        return (C4080b) this.f12955i.m3294a(new C4080b(this, this.f12953g, this.f12954h, this.f12955i));
    }

    /* renamed from: m */
    public C4082h<ModelType> m15925m() {
        return (C4082h) this.f12955i.m3294a(new C4082h(this, this.f12953g, this.f12955i));
    }

    /* renamed from: a */
    public <Y extends Target<File>> Y mo1261a(Y y) {
        return m15921n().mo1261a(y);
    }

    /* renamed from: c */
    public FutureTarget<File> m15923c(int i, int i2) {
        return m15921n().m11875a(i, i2);
    }

    /* renamed from: n */
    private C3019f<ModelType, InputStream, File> m15921n() {
        return (C3019f) this.f12955i.m3294a(new C3019f(File.class, this, this.f12953g, InputStream.class, File.class, this.f12955i));
    }
}
