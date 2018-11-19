package com.bumptech.glide.load.model.file_descriptor;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C4083c;
import com.bumptech.glide.load.data.C4084d;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.C1035c;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.load.model.C3066m;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;

/* renamed from: com.bumptech.glide.load.model.file_descriptor.d */
public class C4092d extends C3066m<ParcelFileDescriptor> implements FileDescriptorModelLoader<Uri> {

    /* renamed from: com.bumptech.glide.load.model.file_descriptor.d$a */
    public static class C3058a implements ModelLoaderFactory<Uri, ParcelFileDescriptor> {
        public void teardown() {
        }

        public ModelLoader<Uri, ParcelFileDescriptor> build(Context context, C1035c c1035c) {
            return new C4092d(context, c1035c.m3574a(C1036d.class, ParcelFileDescriptor.class));
        }
    }

    public C4092d(Context context, ModelLoader<C1036d, ParcelFileDescriptor> modelLoader) {
        super(context, modelLoader);
    }

    /* renamed from: a */
    protected DataFetcher<ParcelFileDescriptor> mo3185a(Context context, Uri uri) {
        return new C4084d(context, uri);
    }

    /* renamed from: a */
    protected DataFetcher<ParcelFileDescriptor> mo3186a(Context context, String str) {
        return new C4083c(context.getApplicationContext().getAssets(), str);
    }
}
