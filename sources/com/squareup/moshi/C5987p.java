package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter.Factory;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.p */
public final class C5987p {
    /* renamed from: a */
    static final List<Factory> f21858a = new ArrayList(5);
    /* renamed from: b */
    private final List<Factory> f21859b;
    /* renamed from: c */
    private final ThreadLocal<List<C7193b<?>>> f21860c = new ThreadLocal();
    /* renamed from: d */
    private final Map<Object, JsonAdapter<?>> f21861d = new LinkedHashMap();

    /* renamed from: com.squareup.moshi.p$a */
    public static final class C5986a {
        /* renamed from: a */
        final List<Factory> f21857a = new ArrayList();

        /* renamed from: a */
        public C5986a m25663a(Factory factory) {
            if (factory == null) {
                throw new IllegalArgumentException("factory == null");
            }
            this.f21857a.add(factory);
            return this;
        }

        /* renamed from: a */
        public C5987p m25664a() {
            return new C5987p(this);
        }
    }

    /* renamed from: com.squareup.moshi.p$b */
    private static class C7193b<T> extends JsonAdapter<T> {
        @Nullable
        /* renamed from: a */
        Object f25993a;
        @Nullable
        /* renamed from: b */
        private JsonAdapter<T> f25994b;

        C7193b(Object obj) {
            this.f25993a = obj;
        }

        /* renamed from: a */
        void m30927a(JsonAdapter<T> jsonAdapter) {
            this.f25994b = jsonAdapter;
            this.f25993a = null;
        }

        public T fromJson(JsonReader jsonReader) throws IOException {
            if (this.f25994b != null) {
                return this.f25994b.fromJson(jsonReader);
            }
            throw new IllegalStateException("Type adapter isn't ready");
        }

        public void toJson(C5983k c5983k, T t) throws IOException {
            if (this.f25994b == null) {
                throw new IllegalStateException("Type adapter isn't ready");
            }
            this.f25994b.toJson(c5983k, (Object) t);
        }
    }

    static {
        f21858a.add(C5988q.f21862a);
        f21858a.add(C7184e.f25967a);
        f21858a.add(C7192o.f25990a);
        f21858a.add(C7176b.f25950a);
        f21858a.add(C7182d.f25963a);
    }

    C5987p(C5986a c5986a) {
        List arrayList = new ArrayList(c5986a.f21857a.size() + f21858a.size());
        arrayList.addAll(c5986a.f21857a);
        arrayList.addAll(f21858a);
        this.f21859b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public <T> JsonAdapter<T> m25667a(Type type) {
        return m25668a(type, C5993s.f21879a);
    }

    /* renamed from: a */
    public <T> JsonAdapter<T> m25666a(Class<T> cls) {
        return m25668a(cls, C5993s.f21879a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public <T> com.squareup.moshi.JsonAdapter<T> m25668a(java.lang.reflect.Type r8, java.util.Set<? extends java.lang.annotation.Annotation> r9) {
        /*
        r7 = this;
        r8 = com.squareup.moshi.C5992r.m25685d(r8);
        r0 = r7.m25665b(r8, r9);
        r1 = r7.f21861d;
        monitor-enter(r1);
        r2 = r7.f21861d;	 Catch:{ all -> 0x00d4 }
        r2 = r2.get(r0);	 Catch:{ all -> 0x00d4 }
        r2 = (com.squareup.moshi.JsonAdapter) r2;	 Catch:{ all -> 0x00d4 }
        if (r2 == 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r1);	 Catch:{ all -> 0x00d4 }
        return r2;
    L_0x0017:
        monitor-exit(r1);	 Catch:{ all -> 0x00d4 }
        r1 = r7.f21860c;
        r1 = r1.get();
        r1 = (java.util.List) r1;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0023:
        r3 = r1.size();
        r4 = 0;
    L_0x0028:
        if (r4 >= r3) goto L_0x0046;
    L_0x002a:
        r5 = r1.get(r4);
        r5 = (com.squareup.moshi.C5987p.C7193b) r5;
        r6 = r5.f25993a;
        r6 = r6.equals(r0);
        if (r6 == 0) goto L_0x0039;
    L_0x0038:
        return r5;
    L_0x0039:
        r4 = r4 + 1;
        goto L_0x0028;
    L_0x003c:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r3 = r7.f21860c;
        r3.set(r1);
    L_0x0046:
        r3 = new com.squareup.moshi.p$b;
        r3.<init>(r0);
        r1.add(r3);
        r4 = r7.f21859b;	 Catch:{ all -> 0x00be }
        r4 = r4.size();	 Catch:{ all -> 0x00be }
    L_0x0054:
        if (r2 >= r4) goto L_0x008b;
    L_0x0056:
        r5 = r7.f21859b;	 Catch:{ all -> 0x00be }
        r5 = r5.get(r2);	 Catch:{ all -> 0x00be }
        r5 = (com.squareup.moshi.JsonAdapter.Factory) r5;	 Catch:{ all -> 0x00be }
        r5 = r5.create(r8, r9, r7);	 Catch:{ all -> 0x00be }
        if (r5 == 0) goto L_0x0088;
    L_0x0064:
        r3.m30927a(r5);	 Catch:{ all -> 0x00be }
        r8 = r7.f21861d;	 Catch:{ all -> 0x00be }
        monitor-enter(r8);	 Catch:{ all -> 0x00be }
        r9 = r7.f21861d;	 Catch:{ all -> 0x0085 }
        r9.put(r0, r5);	 Catch:{ all -> 0x0085 }
        monitor-exit(r8);	 Catch:{ all -> 0x0085 }
        r8 = r1.size();
        r8 = r8 + -1;
        r1.remove(r8);
        r8 = r1.isEmpty();
        if (r8 == 0) goto L_0x0084;
    L_0x007f:
        r8 = r7.f21860c;
        r8.remove();
    L_0x0084:
        return r5;
    L_0x0085:
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0085 }
        throw r9;	 Catch:{ all -> 0x00be }
    L_0x0088:
        r2 = r2 + 1;
        goto L_0x0054;
    L_0x008b:
        r0 = r1.size();
        r0 = r0 + -1;
        r1.remove(r0);
        r0 = r1.isEmpty();
        if (r0 == 0) goto L_0x009f;
    L_0x009a:
        r0 = r7.f21860c;
        r0.remove();
    L_0x009f:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "No JsonAdapter for ";
        r1.append(r2);
        r1.append(r8);
        r8 = " annotated ";
        r1.append(r8);
        r1.append(r9);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00be:
        r8 = move-exception;
        r9 = r1.size();
        r9 = r9 + -1;
        r1.remove(r9);
        r9 = r1.isEmpty();
        if (r9 == 0) goto L_0x00d3;
    L_0x00ce:
        r9 = r7.f21860c;
        r9.remove();
    L_0x00d3:
        throw r8;
    L_0x00d4:
        r8 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00d4 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.p.a(java.lang.reflect.Type, java.util.Set):com.squareup.moshi.JsonAdapter<T>");
    }

    /* renamed from: b */
    private Object m25665b(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(new Object[]{type, set});
    }
}
