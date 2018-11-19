package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.engine.Resource;

/* renamed from: com.bumptech.glide.load.resource.transcode.d */
public class C3110d<Z> implements ResourceTranscoder<Z, Z> {
    /* renamed from: a */
    private static final C3110d<?> f9626a = new C3110d();

    public String getId() {
        return "";
    }

    public Resource<Z> transcode(Resource<Z> resource) {
        return resource;
    }

    /* renamed from: a */
    public static <Z> ResourceTranscoder<Z, Z> m12072a() {
        return f9626a;
    }
}
