package com.bumptech.glide.load.model.stream;

import android.content.Context;
import com.bumptech.glide.load.data.C3025e;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.load.model.C1040i;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.a */
public class C4093a implements StreamModelLoader<C1036d> {
    /* renamed from: a */
    private final C1040i<C1036d, C1036d> f12978a;

    /* renamed from: com.bumptech.glide.load.model.stream.a$a */
    public static class C3068a implements ModelLoaderFactory<C1036d, InputStream> {
        /* renamed from: a */
        private final C1040i<C1036d, C1036d> f9529a = new C1040i(500);

        public void teardown() {
        }

        public ModelLoader<C1036d, InputStream> build(Context context, C1035c c1035c) {
            return new C4093a(this.f9529a);
        }
    }

    public /* synthetic */ DataFetcher getResourceFetcher(Object obj, int i, int i2) {
        return m15959a((C1036d) obj, i, i2);
    }

    public C4093a() {
        this(null);
    }

    public C4093a(C1040i<C1036d, C1036d> c1040i) {
        this.f12978a = c1040i;
    }

    /* renamed from: a */
    public DataFetcher<InputStream> m15959a(C1036d c1036d, int i, int i2) {
        if (this.f12978a != 0) {
            C1036d c1036d2 = (C1036d) this.f12978a.m3588a(c1036d, 0, 0);
            if (c1036d2 == null) {
                this.f12978a.m3589a(c1036d, 0, 0, c1036d);
            } else {
                c1036d = c1036d2;
            }
        }
        return new C3025e(c1036d);
    }
}
