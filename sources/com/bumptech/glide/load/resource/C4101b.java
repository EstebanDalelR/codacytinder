package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.resource.b */
public class C4101b<T> implements ResourceEncoder<T> {
    /* renamed from: a */
    private static final C4101b<?> f12980a = new C4101b();

    /* renamed from: a */
    public boolean m15964a(Resource<T> resource, OutputStream outputStream) {
        return false;
    }

    public String getId() {
        return "";
    }

    public /* synthetic */ boolean encode(Object obj, OutputStream outputStream) {
        return m15964a((Resource) obj, outputStream);
    }

    /* renamed from: a */
    public static <T> C4101b<T> m15963a() {
        return f12980a;
    }
}
