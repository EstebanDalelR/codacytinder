package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.C3086i;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.load.resource.p030c.C1049a;

/* renamed from: com.bumptech.glide.load.resource.transcode.a */
public class C3108a implements ResourceTranscoder<C1049a, C1041b> {
    /* renamed from: a */
    private final ResourceTranscoder<Bitmap, C3086i> f9623a;

    public String getId() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }

    public C3108a(ResourceTranscoder<Bitmap, C3086i> resourceTranscoder) {
        this.f9623a = resourceTranscoder;
    }

    public Resource<C1041b> transcode(Resource<C1049a> resource) {
        C1049a c1049a = (C1049a) resource.get();
        Resource b = c1049a.m3624b();
        if (b != null) {
            return this.f9623a.transcode(b);
        }
        return c1049a.m3625c();
    }
}
