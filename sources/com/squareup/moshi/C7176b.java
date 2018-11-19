package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter.Factory;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.b */
final class C7176b extends JsonAdapter<Object> {
    /* renamed from: a */
    public static final Factory f25950a = new C71751();
    /* renamed from: b */
    private final Class<?> f25951b;
    /* renamed from: c */
    private final JsonAdapter<Object> f25952c;

    /* renamed from: com.squareup.moshi.b$1 */
    class C71751 implements Factory {
        C71751() {
        }

        @Nullable
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C5987p c5987p) {
            type = C5992r.m25689h(type);
            if (type == null || set.isEmpty() == null) {
                return null;
            }
            return new C7176b(C5992r.m25686e(type), c5987p.m25667a(type)).nullSafe();
        }
    }

    C7176b(Class<?> cls, JsonAdapter<Object> jsonAdapter) {
        this.f25951b = cls;
        this.f25952c = jsonAdapter;
    }

    public Object fromJson(JsonReader jsonReader) throws IOException {
        List arrayList = new ArrayList();
        jsonReader.mo6449c();
        while (jsonReader.mo6453g()) {
            arrayList.add(this.f25952c.fromJson(jsonReader));
        }
        jsonReader.mo6450d();
        jsonReader = Array.newInstance(this.f25951b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(jsonReader, i, arrayList.get(i));
        }
        return jsonReader;
    }

    public void toJson(C5983k c5983k, Object obj) throws IOException {
        c5983k.mo6464a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f25952c.toJson(c5983k, Array.get(obj, i));
        }
        c5983k.mo6470b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f25952c);
        stringBuilder.append(".array()");
        return stringBuilder.toString();
    }
}
