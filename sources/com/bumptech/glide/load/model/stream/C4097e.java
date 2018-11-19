package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C3065l;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.e */
public class C4097e extends C3065l<InputStream> implements StreamModelLoader<String> {

    /* renamed from: com.bumptech.glide.load.model.stream.e$a */
    public static class C3072a implements ModelLoaderFactory<String, InputStream> {
        public void teardown() {
        }

        public ModelLoader<String, InputStream> build(Context context, C1035c c1035c) {
            return new C4097e(c1035c.m3574a(Uri.class, InputStream.class));
        }
    }

    public C4097e(ModelLoader<Uri, InputStream> modelLoader) {
        super(modelLoader);
    }
}
