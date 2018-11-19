package com.bumptech.glide.load.resource.p030c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.C3101b;

/* renamed from: com.bumptech.glide.load.resource.c.a */
public class C1049a {
    /* renamed from: a */
    private final Resource<C3101b> f2875a;
    /* renamed from: b */
    private final Resource<Bitmap> f2876b;

    public C1049a(Resource<Bitmap> resource, Resource<C3101b> resource2) {
        if (resource != null && resource2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        } else if (resource == null && resource2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        } else {
            this.f2876b = resource;
            this.f2875a = resource2;
        }
    }

    /* renamed from: a */
    public int m3623a() {
        if (this.f2876b != null) {
            return this.f2876b.getSize();
        }
        return this.f2875a.getSize();
    }

    /* renamed from: b */
    public Resource<Bitmap> m3624b() {
        return this.f2876b;
    }

    /* renamed from: c */
    public Resource<C3101b> m3625c() {
        return this.f2875a;
    }
}
