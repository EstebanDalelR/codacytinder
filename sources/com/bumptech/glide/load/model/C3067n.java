package com.bumptech.glide.load.model;

import com.bumptech.glide.load.data.DataFetcher;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.model.n */
public class C3067n<T> implements ModelLoader<URL, T> {
    /* renamed from: a */
    private final ModelLoader<C1036d, T> f9528a;

    public /* synthetic */ DataFetcher getResourceFetcher(Object obj, int i, int i2) {
        return m12018a((URL) obj, i, i2);
    }

    public C3067n(ModelLoader<C1036d, T> modelLoader) {
        this.f9528a = modelLoader;
    }

    /* renamed from: a */
    public DataFetcher<T> m12018a(URL url, int i, int i2) {
        return this.f9528a.getResourceFetcher(new C1036d(url), i, i2);
    }
}
