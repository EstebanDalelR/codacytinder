package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.File;

/* renamed from: com.bumptech.glide.load.model.l */
public class C3065l<T> implements ModelLoader<String, T> {
    /* renamed from: a */
    private final ModelLoader<Uri, T> f9525a;

    public /* synthetic */ DataFetcher getResourceFetcher(Object obj, int i, int i2) {
        return m12013a((String) obj, i, i2);
    }

    public C3065l(ModelLoader<Uri, T> modelLoader) {
        this.f9525a = modelLoader;
    }

    /* renamed from: a */
    public DataFetcher<T> m12013a(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("/")) {
            str = C3065l.m12012a(str);
        } else {
            Uri parse = Uri.parse(str);
            str = parse.getScheme() == null ? C3065l.m12012a(str) : parse;
        }
        return this.f9525a.getResourceFetcher(str, i, i2);
    }

    /* renamed from: a */
    private static Uri m12012a(String str) {
        return Uri.fromFile(new File(str));
    }
}
