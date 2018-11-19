package com.bumptech.glide.load.model;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.data.DataFetcher;
import com.tinder.api.ManagerWebServices;

/* renamed from: com.bumptech.glide.load.model.m */
public abstract class C3066m<T> implements ModelLoader<Uri, T> {
    /* renamed from: a */
    private final Context f9526a;
    /* renamed from: b */
    private final ModelLoader<C1036d, T> f9527b;

    /* renamed from: a */
    protected abstract DataFetcher<T> mo3185a(Context context, Uri uri);

    /* renamed from: a */
    protected abstract DataFetcher<T> mo3186a(Context context, String str);

    public /* synthetic */ DataFetcher getResourceFetcher(Object obj, int i, int i2) {
        return m12017a((Uri) obj, i, i2);
    }

    public C3066m(Context context, ModelLoader<C1036d, T> modelLoader) {
        this.f9526a = context;
        this.f9527b = modelLoader;
    }

    /* renamed from: a */
    public final DataFetcher<T> m12017a(Uri uri, int i, int i2) {
        String scheme = uri.getScheme();
        if (!C3066m.m12014a(scheme)) {
            return (this.f9527b == null || !("http".equals(scheme) || "https".equals(scheme))) ? null : this.f9527b.getResourceFetcher(new C1036d(uri.toString()), i, i2);
        } else {
            if (C1034a.m3568a(uri) == 0) {
                return mo3185a(this.f9526a, uri);
            }
            return mo3186a(this.f9526a, C1034a.m3569b(uri));
        }
    }

    /* renamed from: a */
    private static boolean m12014a(String str) {
        if (!(ManagerWebServices.PARAM_FILE.equals(str) || "content".equals(str))) {
            if ("android.resource".equals(str) == null) {
                return null;
            }
        }
        return true;
    }
}
