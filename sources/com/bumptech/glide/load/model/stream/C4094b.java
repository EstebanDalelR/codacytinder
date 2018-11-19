package com.bumptech.glide.load.model.stream;

import android.content.Context;
import com.bumptech.glide.load.data.C3023b;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.b */
public class C4094b implements StreamModelLoader<byte[]> {
    /* renamed from: a */
    private final String f12979a;

    /* renamed from: com.bumptech.glide.load.model.stream.b$a */
    public static class C3069a implements ModelLoaderFactory<byte[], InputStream> {
        public void teardown() {
        }

        public ModelLoader<byte[], InputStream> build(Context context, C1035c c1035c) {
            return new C4094b();
        }
    }

    public /* synthetic */ DataFetcher getResourceFetcher(Object obj, int i, int i2) {
        return m15960a((byte[]) obj, i, i2);
    }

    public C4094b() {
        this("");
    }

    @Deprecated
    public C4094b(String str) {
        this.f12979a = str;
    }

    /* renamed from: a */
    public DataFetcher<InputStream> m15960a(byte[] bArr, int i, int i2) {
        return new C3023b(bArr, this.f12979a);
    }
}
