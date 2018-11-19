package com.bumptech.glide.load.model.file_descriptor;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C3065l;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;

/* renamed from: com.bumptech.glide.load.model.file_descriptor.c */
public class C4091c extends C3065l<ParcelFileDescriptor> implements FileDescriptorModelLoader<String> {

    /* renamed from: com.bumptech.glide.load.model.file_descriptor.c$a */
    public static class C3057a implements ModelLoaderFactory<String, ParcelFileDescriptor> {
        public void teardown() {
        }

        public ModelLoader<String, ParcelFileDescriptor> build(Context context, C1035c c1035c) {
            return new C4091c(c1035c.m3574a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C4091c(ModelLoader<Uri, ParcelFileDescriptor> modelLoader) {
        super(modelLoader);
    }
}
