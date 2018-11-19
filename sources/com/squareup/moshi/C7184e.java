package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter.Factory;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.e */
abstract class C7184e<C extends Collection<T>, T> extends JsonAdapter<C> {
    /* renamed from: a */
    public static final Factory f25967a = new C71831();
    /* renamed from: b */
    private final JsonAdapter<T> f25968b;

    /* renamed from: com.squareup.moshi.e$1 */
    class C71831 implements Factory {
        C71831() {
        }

        @Nullable
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C5987p c5987p) {
            Class e = C5992r.m25686e(type);
            if (set.isEmpty() == null) {
                return null;
            }
            if (e != List.class) {
                if (e != Collection.class) {
                    if (e == Set.class) {
                        return C7184e.m30836b(type, c5987p).nullSafe();
                    }
                    return null;
                }
            }
            return C7184e.m30835a(type, c5987p).nullSafe();
        }
    }

    /* renamed from: com.squareup.moshi.e$2 */
    class C79392 extends C7184e<Collection<T>, T> {
        C79392(JsonAdapter jsonAdapter) {
            super(jsonAdapter);
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return super.m30838a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            super.m30839a(c5983k, (Collection) obj);
        }

        /* renamed from: a */
        Collection<T> mo7412a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.squareup.moshi.e$3 */
    class C79403 extends C7184e<Set<T>, T> {
        C79403(JsonAdapter jsonAdapter) {
            super(jsonAdapter);
        }

        /* renamed from: a */
        /* synthetic */ Collection mo7412a() {
            return m33797b();
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return super.m30838a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            super.m30839a(c5983k, (Set) obj);
        }

        /* renamed from: b */
        Set<T> m33797b() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: a */
    abstract C mo7412a();

    public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
        return m30838a(jsonReader);
    }

    public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
        m30839a(c5983k, (Collection) obj);
    }

    private C7184e(JsonAdapter<T> jsonAdapter) {
        this.f25968b = jsonAdapter;
    }

    /* renamed from: a */
    static <T> JsonAdapter<Collection<T>> m30835a(Type type, C5987p c5987p) {
        return new C79392(c5987p.m25667a(C5992r.m25675a(type, Collection.class)));
    }

    /* renamed from: b */
    static <T> JsonAdapter<Set<T>> m30836b(Type type, C5987p c5987p) {
        return new C79403(c5987p.m25667a(C5992r.m25675a(type, Collection.class)));
    }

    /* renamed from: a */
    public C m30838a(JsonReader jsonReader) throws IOException {
        C a = mo7412a();
        jsonReader.mo6449c();
        while (jsonReader.mo6453g()) {
            a.add(this.f25968b.fromJson(jsonReader));
        }
        jsonReader.mo6450d();
        return a;
    }

    /* renamed from: a */
    public void m30839a(C5983k c5983k, C c) throws IOException {
        c5983k.mo6464a();
        for (Object toJson : c) {
            this.f25968b.toJson(c5983k, toJson);
        }
        c5983k.mo6470b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f25968b);
        stringBuilder.append(".collection()");
        return stringBuilder.toString();
    }
}
