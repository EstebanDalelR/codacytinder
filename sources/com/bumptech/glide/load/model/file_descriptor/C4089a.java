package com.bumptech.glide.load.model.file_descriptor;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C3051b;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.File;

/* renamed from: com.bumptech.glide.load.model.file_descriptor.a */
public class C4089a extends C3051b<ParcelFileDescriptor> implements FileDescriptorModelLoader<File> {

    /* renamed from: com.bumptech.glide.load.model.file_descriptor.a$a */
    public static class C3055a implements ModelLoaderFactory<File, ParcelFileDescriptor> {
        public void teardown() {
        }

        public ModelLoader<File, ParcelFileDescriptor> build(Context context, C1035c c1035c) {
            return new C4089a(c1035c.m3574a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C4089a(ModelLoader<Uri, ParcelFileDescriptor> modelLoader) {
        super(modelLoader);
    }
}
