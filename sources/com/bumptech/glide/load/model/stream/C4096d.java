package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C3063j;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.stream.d */
public class C4096d extends C3063j<InputStream> implements StreamModelLoader<Integer> {

    /* renamed from: com.bumptech.glide.load.model.stream.d$a */
    public static class C3071a implements ModelLoaderFactory<Integer, InputStream> {
        public void teardown() {
        }

        public ModelLoader<Integer, InputStream> build(Context context, C1035c c1035c) {
            return new C4096d(context, c1035c.m3574a(Uri.class, InputStream.class));
        }
    }

    public C4096d(Context context, ModelLoader<Uri, InputStream> modelLoader) {
        super(context, (ModelLoader) modelLoader);
    }
}
