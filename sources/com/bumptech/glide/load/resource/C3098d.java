package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;

/* renamed from: com.bumptech.glide.load.resource.d */
public class C3098d<T> implements Transformation<T> {
    /* renamed from: a */
    private static final Transformation<?> f9593a = new C3098d();

    public String getId() {
        return "";
    }

    public Resource<T> transform(Resource<T> resource, int i, int i2) {
        return resource;
    }

    /* renamed from: a */
    public static <T> C3098d<T> m12053a() {
        return (C3098d) f9593a;
    }
}
