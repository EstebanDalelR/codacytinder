package com.bumptech.glide.load.resource.p030c;

import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.C1037f;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.c.e */
public class C3094e implements ResourceDecoder<InputStream, C1049a> {
    /* renamed from: a */
    private final ResourceDecoder<C1037f, C1049a> f9585a;

    public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
        return m12052a((InputStream) obj, i, i2);
    }

    public C3094e(ResourceDecoder<C1037f, C1049a> resourceDecoder) {
        this.f9585a = resourceDecoder;
    }

    /* renamed from: a */
    public Resource<C1049a> m12052a(InputStream inputStream, int i, int i2) throws IOException {
        return this.f9585a.decode(new C1037f(inputStream, null), i, i2);
    }

    public String getId() {
        return this.f9585a.getId();
    }
}
