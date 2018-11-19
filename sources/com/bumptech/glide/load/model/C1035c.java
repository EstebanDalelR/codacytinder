package com.bumptech.glide.load.model;

import android.content.Context;
import com.bumptech.glide.load.data.DataFetcher;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.model.c */
public class C1035c {
    /* renamed from: c */
    private static final ModelLoader f2839c = new C30521();
    /* renamed from: a */
    private final Map<Class, Map<Class, ModelLoaderFactory>> f2840a = new HashMap();
    /* renamed from: b */
    private final Map<Class, Map<Class, ModelLoader>> f2841b = new HashMap();
    /* renamed from: d */
    private final Context f2842d;

    /* renamed from: com.bumptech.glide.load.model.c$1 */
    static class C30521 implements ModelLoader {
        public String toString() {
            return "NULL_MODEL_LOADER";
        }

        C30521() {
        }

        public DataFetcher getResourceFetcher(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }
    }

    public C1035c(Context context) {
        this.f2842d = context.getApplicationContext();
    }

    /* renamed from: a */
    public synchronized <T, Y> ModelLoaderFactory<T, Y> m3575a(Class<T> cls, Class<Y> cls2, ModelLoaderFactory<T, Y> modelLoaderFactory) {
        this.f2841b.clear();
        Map map = (Map) this.f2840a.get(cls);
        if (map == null) {
            map = new HashMap();
            this.f2840a.put(cls, map);
        }
        cls = (ModelLoaderFactory) map.put(cls2, modelLoaderFactory);
        if (cls != null) {
            for (Y containsValue : this.f2840a.values()) {
                if (containsValue.containsValue(cls) != null) {
                    cls = null;
                    break;
                }
            }
        }
        return cls;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized <T, Y> com.bumptech.glide.load.model.ModelLoader<T, Y> m3574a(java.lang.Class<T> r3, java.lang.Class<Y> r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.m3572c(r3, r4);	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0014;
    L_0x0007:
        r3 = f2839c;	 Catch:{ all -> 0x0029 }
        r3 = r3.equals(r0);	 Catch:{ all -> 0x0029 }
        if (r3 == 0) goto L_0x0012;
    L_0x000f:
        r3 = 0;
        monitor-exit(r2);
        return r3;
    L_0x0012:
        monitor-exit(r2);
        return r0;
    L_0x0014:
        r1 = r2.m3573d(r3, r4);	 Catch:{ all -> 0x0029 }
        if (r1 == 0) goto L_0x0024;
    L_0x001a:
        r0 = r2.f2842d;	 Catch:{ all -> 0x0029 }
        r0 = r1.build(r0, r2);	 Catch:{ all -> 0x0029 }
        r2.m3570a(r3, r4, r0);	 Catch:{ all -> 0x0029 }
        goto L_0x0027;
    L_0x0024:
        r2.m3571b(r3, r4);	 Catch:{ all -> 0x0029 }
    L_0x0027:
        monitor-exit(r2);
        return r0;
    L_0x0029:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.model.c.a(java.lang.Class, java.lang.Class):com.bumptech.glide.load.model.ModelLoader<T, Y>");
    }

    /* renamed from: b */
    private <T, Y> void m3571b(Class<T> cls, Class<Y> cls2) {
        m3570a((Class) cls, (Class) cls2, f2839c);
    }

    /* renamed from: a */
    private <T, Y> void m3570a(Class<T> cls, Class<Y> cls2, ModelLoader<T, Y> modelLoader) {
        Map map = (Map) this.f2841b.get(cls);
        if (map == null) {
            map = new HashMap();
            this.f2841b.put(cls, map);
        }
        map.put(cls2, modelLoader);
    }

    /* renamed from: c */
    private <T, Y> ModelLoader<T, Y> m3572c(Class<T> cls, Class<Y> cls2) {
        Map map = (Map) this.f2841b.get(cls);
        return map != null ? (ModelLoader) map.get(cls2) : null;
    }

    /* renamed from: d */
    private <T, Y> ModelLoaderFactory<T, Y> m3573d(Class<T> cls, Class<Y> cls2) {
        Map map = (Map) this.f2840a.get(cls);
        ModelLoaderFactory<T, Y> modelLoaderFactory = map != null ? (ModelLoaderFactory) map.get(cls2) : null;
        if (modelLoaderFactory == null) {
            for (Class cls3 : this.f2840a.keySet()) {
                if (cls3.isAssignableFrom(cls)) {
                    Map map2 = (Map) this.f2840a.get(cls3);
                    if (map2 != null) {
                        ModelLoaderFactory modelLoaderFactory2 = (ModelLoaderFactory) map2.get(cls2);
                        if (modelLoaderFactory2 != null) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return modelLoaderFactory;
    }
}
