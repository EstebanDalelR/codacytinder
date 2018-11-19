package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import java.io.File;

/* renamed from: com.bumptech.glide.provider.c */
public class C3116c<T, Z> implements DataLoadProvider<T, Z> {
    /* renamed from: a */
    private static final DataLoadProvider<?, ?> f9632a = new C3116c();

    public ResourceDecoder<File, Z> getCacheDecoder() {
        return null;
    }

    public ResourceEncoder<Z> getEncoder() {
        return null;
    }

    public ResourceDecoder<T, Z> getSourceDecoder() {
        return null;
    }

    public Encoder<T> getSourceEncoder() {
        return null;
    }

    /* renamed from: a */
    public static <T, Z> DataLoadProvider<T, Z> m12076a() {
        return f9632a;
    }
}
