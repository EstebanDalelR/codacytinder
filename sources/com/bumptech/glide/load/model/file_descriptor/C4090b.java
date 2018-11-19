package com.bumptech.glide.load.model.file_descriptor;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C3063j;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;

/* renamed from: com.bumptech.glide.load.model.file_descriptor.b */
public class C4090b extends C3063j<ParcelFileDescriptor> implements FileDescriptorModelLoader<Integer> {

    /* renamed from: com.bumptech.glide.load.model.file_descriptor.b$a */
    public static class C3056a implements ModelLoaderFactory<Integer, ParcelFileDescriptor> {
        public void teardown() {
        }

        public ModelLoader<Integer, ParcelFileDescriptor> build(Context context, C1035c c1035c) {
            return new C4090b(context, c1035c.m3574a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C4090b(Context context, ModelLoader<Uri, ParcelFileDescriptor> modelLoader) {
        super(context, (ModelLoader) modelLoader);
    }
}
