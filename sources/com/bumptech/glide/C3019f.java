package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.RequestManager.C0966b;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.transcode.C3110d;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.manager.C1064i;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.provider.C4116d;
import com.bumptech.glide.provider.LoadProvider;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.target.Target;
import java.io.File;

/* renamed from: com.bumptech.glide.f */
public class C3019f<ModelType, DataType, ResourceType> extends C0990e<ModelType, DataType, ResourceType, ResourceType> {
    /* renamed from: g */
    private final ModelLoader<ModelType, DataType> f9406g;
    /* renamed from: h */
    private final Class<DataType> f9407h;
    /* renamed from: i */
    private final Class<ResourceType> f9408i;
    /* renamed from: j */
    private final C0966b f9409j;

    /* renamed from: a */
    private static <A, T, Z, R> LoadProvider<A, T, Z, R> m11874a(C0994i c0994i, ModelLoader<A, T> modelLoader, Class<T> cls, Class<Z> cls2, ResourceTranscoder<Z, R> resourceTranscoder) {
        return new C4116d(modelLoader, resourceTranscoder, c0994i.m3496b((Class) cls, (Class) cls2));
    }

    C3019f(Class<ResourceType> cls, C0990e<ModelType, ?, ?, ?> c0990e, ModelLoader<ModelType, DataType> modelLoader, Class<DataType> cls2, Class<ResourceType> cls3, C0966b c0966b) {
        super(C3019f.m11874a(c0990e.f2692c, modelLoader, cls2, cls3, C3110d.m12072a()), cls, c0990e);
        this.f9406g = modelLoader;
        this.f9407h = cls2;
        this.f9408i = cls3;
        this.f9409j = c0966b;
    }

    C3019f(Context context, C0994i c0994i, Class<ModelType> cls, ModelLoader<ModelType, DataType> modelLoader, Class<DataType> cls2, Class<ResourceType> cls3, C1064i c1064i, Lifecycle lifecycle, C0966b c0966b) {
        ModelLoader<ModelType, DataType> modelLoader2 = modelLoader;
        Class<DataType> cls4 = cls2;
        Class<ResourceType> cls5 = cls3;
        C0994i c0994i2 = c0994i;
        super(context, cls, C3019f.m11874a(c0994i2, modelLoader2, cls4, cls5, C3110d.m12072a()), cls5, c0994i2, c1064i, lifecycle);
        this.f9406g = modelLoader2;
        this.f9407h = cls4;
        this.f9408i = cls5;
        this.f9409j = c0966b;
    }

    /* renamed from: a */
    public <Y extends Target<File>> Y mo1261a(Y y) {
        return m11873a().m3435b((Target) y);
    }

    /* renamed from: a */
    public FutureTarget<File> m11875a(int i, int i2) {
        return m11873a().m3438d(i, i2);
    }

    /* renamed from: a */
    private C0990e<ModelType, DataType, File, File> m11873a() {
        return this.f9409j.m3294a(new C0990e(new C4116d(this.f9406g, C3110d.m12072a(), this.c.m3496b(this.f9407h, File.class)), File.class, this)).mo1239b(Priority.LOW).mo1244b(DiskCacheStrategy.SOURCE).mo1248b(true);
    }
}
