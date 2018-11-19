package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C3051b;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.c */
public class C4095c extends C3051b<InputStream> implements StreamModelLoader<File> {

    /* renamed from: com.bumptech.glide.load.model.stream.c$a */
    public static class C3070a implements ModelLoaderFactory<File, InputStream> {
        public void teardown() {
        }

        public ModelLoader<File, InputStream> build(Context context, C1035c c1035c) {
            return new C4095c(c1035c.m3574a(Uri.class, InputStream.class));
        }
    }

    public C4095c(ModelLoader<Uri, InputStream> modelLoader) {
        super(modelLoader);
    }
}
