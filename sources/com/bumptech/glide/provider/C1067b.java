package com.bumptech.glide.provider;

import com.bumptech.glide.p026d.C0985g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.provider.b */
public class C1067b {
    /* renamed from: a */
    private static final C0985g f2914a = new C0985g();
    /* renamed from: b */
    private final Map<C0985g, DataLoadProvider<?, ?>> f2915b = new HashMap();

    /* renamed from: a */
    public <T, Z> void m3674a(Class<T> cls, Class<Z> cls2, DataLoadProvider<T, Z> dataLoadProvider) {
        this.f2915b.put(new C0985g(cls, cls2), dataLoadProvider);
    }

    /* renamed from: a */
    public <T, Z> DataLoadProvider<T, Z> m3673a(Class<T> cls, Class<Z> cls2) {
        DataLoadProvider dataLoadProvider;
        synchronized (f2914a) {
            f2914a.m3403a(cls, cls2);
            dataLoadProvider = (DataLoadProvider) this.f2915b.get(f2914a);
        }
        return dataLoadProvider == null ? C3116c.m12076a() : dataLoadProvider;
    }
}
