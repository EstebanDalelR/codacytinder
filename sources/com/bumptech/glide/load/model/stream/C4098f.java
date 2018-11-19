package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.data.C4085g;
import com.bumptech.glide.load.data.C4086h;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.load.model.C3066m;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.f */
public class C4098f extends C3066m<InputStream> implements StreamModelLoader<Uri> {

    /* renamed from: com.bumptech.glide.load.model.stream.f$a */
    public static class C3073a implements ModelLoaderFactory<Uri, InputStream> {
        public void teardown() {
        }

        public ModelLoader<Uri, InputStream> build(Context context, C1035c c1035c) {
            return new C4098f(context, c1035c.m3574a(C1036d.class, InputStream.class));
        }
    }

    public C4098f(Context context, ModelLoader<C1036d, InputStream> modelLoader) {
        super(context, modelLoader);
    }

    /* renamed from: a */
    protected DataFetcher<InputStream> mo3185a(Context context, Uri uri) {
        return new C4086h(context, uri);
    }

    /* renamed from: a */
    protected DataFetcher<InputStream> mo3186a(Context context, String str) {
        return new C4085g(context.getApplicationContext().getAssets(), str);
    }
}
