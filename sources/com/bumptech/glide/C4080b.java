package com.bumptech.glide;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.RequestManager.C0966b;
import com.bumptech.glide.load.model.C1037f;
import com.bumptech.glide.load.model.C3054e;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.provider.C4116d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.b */
public class C4080b<ModelType> extends C3015a<ModelType, Bitmap> {
    /* renamed from: g */
    private final ModelLoader<ModelType, InputStream> f12949g;
    /* renamed from: h */
    private final ModelLoader<ModelType, ParcelFileDescriptor> f12950h;
    /* renamed from: i */
    private final C0994i f12951i;
    /* renamed from: j */
    private final C0966b f12952j;

    /* renamed from: a */
    private static <A, R> C4116d<A, C1037f, Bitmap, R> m15919a(C0994i c0994i, ModelLoader<A, InputStream> modelLoader, ModelLoader<A, ParcelFileDescriptor> modelLoader2, Class<R> cls, ResourceTranscoder<Bitmap, R> resourceTranscoder) {
        if (modelLoader == null && modelLoader2 == null) {
            return null;
        }
        if (resourceTranscoder == null) {
            resourceTranscoder = c0994i.m3491a(Bitmap.class, (Class) cls);
        }
        return new C4116d(new C3054e(modelLoader, modelLoader2), resourceTranscoder, c0994i.m3496b(C1037f.class, Bitmap.class));
    }

    C4080b(C0990e<ModelType, ?, ?, ?> c0990e, ModelLoader<ModelType, InputStream> modelLoader, ModelLoader<ModelType, ParcelFileDescriptor> modelLoader2, C0966b c0966b) {
        super(C4080b.m15919a(c0990e.f2692c, modelLoader, modelLoader2, Bitmap.class, null), Bitmap.class, c0990e);
        this.f12949g = modelLoader;
        this.f12950h = modelLoader2;
        this.f12951i = c0990e.f2692c;
        this.f12952j = c0966b;
    }
}
