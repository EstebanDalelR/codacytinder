package com.bumptech.glide;

import com.bumptech.glide.RequestManager.C0966b;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.gif.C3101b;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.provider.C4116d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.h */
public class C4082h<ModelType> extends C3020g<ModelType> {
    /* renamed from: g */
    private final ModelLoader<ModelType, InputStream> f12956g;
    /* renamed from: h */
    private final C0966b f12957h;

    /* renamed from: a */
    private static <A, R> C4116d<A, InputStream, C3101b, R> m15926a(C0994i c0994i, ModelLoader<A, InputStream> modelLoader, Class<R> cls, ResourceTranscoder<C3101b, R> resourceTranscoder) {
        if (modelLoader == null) {
            return null;
        }
        if (resourceTranscoder == null) {
            resourceTranscoder = c0994i.m3491a(C3101b.class, (Class) cls);
        }
        return new C4116d(modelLoader, resourceTranscoder, c0994i.m3496b(InputStream.class, C3101b.class));
    }

    C4082h(C0990e<ModelType, ?, ?, ?> c0990e, ModelLoader<ModelType, InputStream> modelLoader, C0966b c0966b) {
        super(C4082h.m15926a(c0990e.f2692c, modelLoader, C3101b.class, null), C3101b.class, c0990e);
        this.f12956g = modelLoader;
        this.f12957h = c0966b;
        m11910c();
    }
}
