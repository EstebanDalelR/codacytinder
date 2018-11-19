package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter.Factory;
import com.squareup.moshi.JsonReader.C5971a;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;
import org.michaelevans.aftermath.Aftermath;

/* renamed from: com.squareup.moshi.d */
final class C7182d<T> extends JsonAdapter<T> {
    /* renamed from: a */
    public static final Factory f25963a = new C71811();
    /* renamed from: b */
    private final C5980c<T> f25964b;
    /* renamed from: c */
    private final C5981a<?>[] f25965c;
    /* renamed from: d */
    private final C5971a f25966d;

    /* renamed from: com.squareup.moshi.d$a */
    static class C5981a<T> {
        /* renamed from: a */
        final String f21841a;
        /* renamed from: b */
        final Field f21842b;
        /* renamed from: c */
        final JsonAdapter<T> f21843c;

        C5981a(String str, Field field, JsonAdapter<T> jsonAdapter) {
            this.f21841a = str;
            this.f21842b = field;
            this.f21843c = jsonAdapter;
        }

        /* renamed from: a */
        void m25632a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            this.f21842b.set(obj, this.f21843c.fromJson(jsonReader));
        }

        /* renamed from: a */
        void m25633a(C5983k c5983k, Object obj) throws IllegalAccessException, IOException {
            this.f21843c.toJson(c5983k, this.f21842b.get(obj));
        }
    }

    /* renamed from: com.squareup.moshi.d$1 */
    class C71811 implements Factory {
        C71811() {
        }

        @Nullable
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C5987p c5987p) {
            Class e = C5992r.m25686e(type);
            if (!e.isInterface()) {
                if (!e.isEnum()) {
                    if (C7182d.m30834a(e) && !C5992r.m25690i(e)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Platform ");
                        stringBuilder.append(type);
                        stringBuilder.append(" annotated ");
                        stringBuilder.append(set);
                        stringBuilder.append(" requires explicit JsonAdapter to be registered");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else if (set.isEmpty() == null) {
                        return null;
                    } else {
                        if (e.getEnclosingClass() == null || Modifier.isStatic(e.getModifiers()) != null) {
                            if (Modifier.isAbstract(e.getModifiers()) != null) {
                                set = new StringBuilder();
                                set.append("Cannot serialize abstract class ");
                                set.append(e.getName());
                                throw new IllegalArgumentException(set.toString());
                            }
                            set = C5980c.m25630a(e);
                            Map treeMap = new TreeMap();
                            while (type != Object.class) {
                                m30832a(c5987p, type, treeMap);
                                type = C5992r.m25688g(type);
                            }
                            return new C7182d(set, treeMap).nullSafe();
                        } else if (e.getSimpleName().isEmpty() != null) {
                            set = new StringBuilder();
                            set.append("Cannot serialize anonymous class ");
                            set.append(e.getName());
                            throw new IllegalArgumentException(set.toString());
                        } else {
                            set = new StringBuilder();
                            set.append("Cannot serialize non-static nested class ");
                            set.append(e.getName());
                            throw new IllegalArgumentException(set.toString());
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        private void m30832a(C5987p c5987p, Type type, Map<String, C5981a<?>> map) {
            Class e = C5992r.m25686e(type);
            boolean a = C7182d.m30834a(e);
            for (AnnotatedElement annotatedElement : e.getDeclaredFields()) {
                if (m30833a(a, annotatedElement.getModifiers())) {
                    JsonAdapter a2 = c5987p.m25668a(C5992r.m25677a(type, e, annotatedElement.getGenericType()), C5993s.m25692a(annotatedElement));
                    annotatedElement.setAccessible(true);
                    Json json = (Json) annotatedElement.getAnnotation(Json.class);
                    String name = json != null ? json.name() : annotatedElement.getName();
                    C5981a c5981a = new C5981a(name, annotatedElement, a2);
                    C5981a c5981a2 = (C5981a) map.put(name, c5981a);
                    if (c5981a2 != null) {
                        type = new StringBuilder();
                        type.append("Conflicting fields:\n    ");
                        type.append(c5981a2.f21842b);
                        type.append("\n");
                        type.append("    ");
                        type.append(c5981a.f21842b);
                        throw new IllegalArgumentException(type.toString());
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m30833a(boolean z, int i) {
            boolean z2 = false;
            if (!Modifier.isStatic(i)) {
                if (!Modifier.isTransient(i)) {
                    if (!(!Modifier.isPublic(i) && Modifier.isProtected(i) == 0 && z)) {
                        z2 = true;
                    }
                    return z2;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    static boolean m30834a(Class<?> cls) {
        cls = cls.getName();
        if (!(cls.startsWith(Aftermath.ANDROID_PREFIX) || cls.startsWith(Aftermath.JAVA_PREFIX) || cls.startsWith("javax.") || cls.startsWith("kotlin."))) {
            if (cls.startsWith("scala.") == null) {
                return null;
            }
        }
        return true;
    }

    C7182d(C5980c<T> c5980c, Map<String, C5981a<?>> map) {
        this.f25964b = c5980c;
        this.f25965c = (C5981a[]) map.values().toArray(new C5981a[map.size()]);
        this.f25966d = C5971a.m25580a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    public T fromJson(com.squareup.moshi.JsonReader r4) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f25964b;	 Catch:{ InstantiationException -> 0x0050, InvocationTargetException -> 0x0037, IllegalAccessException -> 0x0031 }
        r0 = r0.mo6446a();	 Catch:{ InstantiationException -> 0x0050, InvocationTargetException -> 0x0037, IllegalAccessException -> 0x0031 }
        r4.mo6451e();	 Catch:{ IllegalAccessException -> 0x002b }
    L_0x0009:
        r1 = r4.mo6453g();	 Catch:{ IllegalAccessException -> 0x002b }
        if (r1 == 0) goto L_0x0027;	 Catch:{ IllegalAccessException -> 0x002b }
    L_0x000f:
        r1 = r3.f25966d;	 Catch:{ IllegalAccessException -> 0x002b }
        r1 = r4.mo6447a(r1);	 Catch:{ IllegalAccessException -> 0x002b }
        r2 = -1;	 Catch:{ IllegalAccessException -> 0x002b }
        if (r1 == r2) goto L_0x0020;	 Catch:{ IllegalAccessException -> 0x002b }
    L_0x0018:
        r2 = r3.f25965c;	 Catch:{ IllegalAccessException -> 0x002b }
        r1 = r2[r1];	 Catch:{ IllegalAccessException -> 0x002b }
        r1.m25632a(r4, r0);	 Catch:{ IllegalAccessException -> 0x002b }
        goto L_0x0009;	 Catch:{ IllegalAccessException -> 0x002b }
    L_0x0020:
        r4.mo6455i();	 Catch:{ IllegalAccessException -> 0x002b }
        r4.mo6462p();	 Catch:{ IllegalAccessException -> 0x002b }
        goto L_0x0009;	 Catch:{ IllegalAccessException -> 0x002b }
    L_0x0027:
        r4.mo6452f();	 Catch:{ IllegalAccessException -> 0x002b }
        return r0;
    L_0x002b:
        r4 = new java.lang.AssertionError;
        r4.<init>();
        throw r4;
    L_0x0031:
        r4 = new java.lang.AssertionError;
        r4.<init>();
        throw r4;
    L_0x0037:
        r4 = move-exception;
        r4 = r4.getTargetException();
        r0 = r4 instanceof java.lang.RuntimeException;
        if (r0 == 0) goto L_0x0043;
    L_0x0040:
        r4 = (java.lang.RuntimeException) r4;
        throw r4;
    L_0x0043:
        r0 = r4 instanceof java.lang.Error;
        if (r0 == 0) goto L_0x004a;
    L_0x0047:
        r4 = (java.lang.Error) r4;
        throw r4;
    L_0x004a:
        r0 = new java.lang.RuntimeException;
        r0.<init>(r4);
        throw r0;
    L_0x0050:
        r4 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.d.fromJson(com.squareup.moshi.JsonReader):T");
    }

    public void toJson(com.squareup.moshi.C5983k r6, T r7) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r6.mo6472c();	 Catch:{ IllegalAccessException -> 0x001a }
        r0 = r5.f25965c;	 Catch:{ IllegalAccessException -> 0x001a }
        r1 = r0.length;	 Catch:{ IllegalAccessException -> 0x001a }
        r2 = 0;	 Catch:{ IllegalAccessException -> 0x001a }
    L_0x0007:
        if (r2 >= r1) goto L_0x0016;	 Catch:{ IllegalAccessException -> 0x001a }
    L_0x0009:
        r3 = r0[r2];	 Catch:{ IllegalAccessException -> 0x001a }
        r4 = r3.f21841a;	 Catch:{ IllegalAccessException -> 0x001a }
        r6.mo6471b(r4);	 Catch:{ IllegalAccessException -> 0x001a }
        r3.m25633a(r6, r7);	 Catch:{ IllegalAccessException -> 0x001a }
        r2 = r2 + 1;	 Catch:{ IllegalAccessException -> 0x001a }
        goto L_0x0007;	 Catch:{ IllegalAccessException -> 0x001a }
    L_0x0016:
        r6.mo6474d();	 Catch:{ IllegalAccessException -> 0x001a }
        return;
    L_0x001a:
        r6 = new java.lang.AssertionError;
        r6.<init>();
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.d.toJson(com.squareup.moshi.k, java.lang.Object):void");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JsonAdapter(");
        stringBuilder.append(this.f25964b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
