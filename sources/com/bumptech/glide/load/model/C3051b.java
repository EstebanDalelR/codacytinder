package com.bumptech.glide.load.model;

import android.net.Uri;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.File;

/* renamed from: com.bumptech.glide.load.model.b */
public class C3051b<T> implements ModelLoader<File, T> {
    /* renamed from: a */
    private final ModelLoader<Uri, T> f9511a;

    public /* synthetic */ DataFetcher getResourceFetcher(Object obj, int i, int i2) {
        return m12004a((File) obj, i, i2);
    }

    public C3051b(ModelLoader<Uri, T> modelLoader) {
        this.f9511a = modelLoader;
    }

    /* renamed from: a */
    public DataFetcher<T> m12004a(File file, int i, int i2) {
        return this.f9511a.getResourceFetcher(Uri.fromFile(file), i, i2);
    }
}
