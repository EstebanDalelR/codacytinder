package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.Encoder;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.resource.a */
public class C3076a<T> implements Encoder<T> {
    /* renamed from: a */
    private static final C3076a<?> f9531a = new C3076a();

    public boolean encode(T t, OutputStream outputStream) {
        return false;
    }

    public String getId() {
        return "";
    }

    /* renamed from: a */
    public static <T> Encoder<T> m12020a() {
        return f9531a;
    }
}
