package com.bumptech.glide.load.resource.p030c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.C3101b;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.resource.c.d */
public class C4109d implements ResourceEncoder<C1049a> {
    /* renamed from: a */
    private final ResourceEncoder<Bitmap> f12984a;
    /* renamed from: b */
    private final ResourceEncoder<C3101b> f12985b;
    /* renamed from: c */
    private String f12986c;

    public /* synthetic */ boolean encode(Object obj, OutputStream outputStream) {
        return m15972a((Resource) obj, outputStream);
    }

    public C4109d(ResourceEncoder<Bitmap> resourceEncoder, ResourceEncoder<C3101b> resourceEncoder2) {
        this.f12984a = resourceEncoder;
        this.f12985b = resourceEncoder2;
    }

    /* renamed from: a */
    public boolean m15972a(Resource<C1049a> resource, OutputStream outputStream) {
        C1049a c1049a = (C1049a) resource.get();
        Resource b = c1049a.m3624b();
        if (b != null) {
            return this.f12984a.encode(b, outputStream);
        }
        return this.f12985b.encode(c1049a.m3625c(), outputStream);
    }

    public String getId() {
        if (this.f12986c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f12984a.getId());
            stringBuilder.append(this.f12985b.getId());
            this.f12986c = stringBuilder.toString();
        }
        return this.f12986c;
    }
}
