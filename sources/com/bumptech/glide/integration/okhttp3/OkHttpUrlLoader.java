package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.stream.StreamModelLoader;
import java.io.InputStream;
import okhttp3.C17692o;

public class OkHttpUrlLoader implements StreamModelLoader<C1036d> {
    /* renamed from: a */
    private final okhttp3.Call.Factory f12958a;

    public static class Factory implements ModelLoaderFactory<C1036d, InputStream> {
        /* renamed from: a */
        private static volatile okhttp3.Call.Factory f9415a;
        /* renamed from: b */
        private okhttp3.Call.Factory f9416b;

        public void teardown() {
        }

        public Factory() {
            this(m11921a());
        }

        public Factory(okhttp3.Call.Factory factory) {
            this.f9416b = factory;
        }

        /* renamed from: a */
        private static okhttp3.Call.Factory m11921a() {
            if (f9415a == null) {
                synchronized (Factory.class) {
                    if (f9415a == null) {
                        f9415a = new C17692o();
                    }
                }
            }
            return f9415a;
        }

        public ModelLoader<C1036d, InputStream> build(Context context, C1035c c1035c) {
            return new OkHttpUrlLoader(this.f9416b);
        }
    }

    public /* synthetic */ DataFetcher getResourceFetcher(Object obj, int i, int i2) {
        return m15927a((C1036d) obj, i, i2);
    }

    public OkHttpUrlLoader(okhttp3.Call.Factory factory) {
        this.f12958a = factory;
    }

    /* renamed from: a */
    public DataFetcher<InputStream> m15927a(C1036d c1036d, int i, int i2) {
        return new OkHttpStreamFetcher(this.f12958a, c1036d);
    }
}
