package com.bumptech.glide.load.model.stream;

import android.content.Context;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.load.model.C3067n;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.model.stream.g */
public class C4099g extends C3067n<InputStream> {

    /* renamed from: com.bumptech.glide.load.model.stream.g$a */
    public static class C3074a implements ModelLoaderFactory<URL, InputStream> {
        public void teardown() {
        }

        public ModelLoader<URL, InputStream> build(Context context, C1035c c1035c) {
            return new C4099g(c1035c.m3574a(C1036d.class, InputStream.class));
        }
    }

    public C4099g(ModelLoader<C1036d, InputStream> modelLoader) {
        super(modelLoader);
    }
}
