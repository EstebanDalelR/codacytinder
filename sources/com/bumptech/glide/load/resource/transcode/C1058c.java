package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.p026d.C0985g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.resource.transcode.c */
public class C1058c {
    /* renamed from: a */
    private static final C0985g f2897a = new C0985g();
    /* renamed from: b */
    private final Map<C0985g, ResourceTranscoder<?, ?>> f2898b = new HashMap();

    /* renamed from: a */
    public <Z, R> void m3645a(Class<Z> cls, Class<R> cls2, ResourceTranscoder<Z, R> resourceTranscoder) {
        this.f2898b.put(new C0985g(cls, cls2), resourceTranscoder);
    }

    /* renamed from: a */
    public <Z, R> ResourceTranscoder<Z, R> m3644a(Class<Z> cls, Class<R> cls2) {
        if (cls.equals(cls2)) {
            return C3110d.m12072a();
        }
        synchronized (f2897a) {
            f2897a.m3403a(cls, cls2);
            ResourceTranscoder<Z, R> resourceTranscoder = (ResourceTranscoder) this.f2898b.get(f2897a);
        }
        if (resourceTranscoder != null) {
            return resourceTranscoder;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No transcoder registered for ");
        stringBuilder.append(cls);
        stringBuilder.append(" and ");
        stringBuilder.append(cls2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
