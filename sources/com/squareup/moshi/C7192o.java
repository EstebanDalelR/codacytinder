package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter.Factory;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.o */
final class C7192o<K, V> extends JsonAdapter<Map<K, V>> {
    /* renamed from: a */
    public static final Factory f25990a = new C71911();
    /* renamed from: b */
    private final JsonAdapter<K> f25991b;
    /* renamed from: c */
    private final JsonAdapter<V> f25992c;

    /* renamed from: com.squareup.moshi.o$1 */
    class C71911 implements Factory {
        C71911() {
        }

        @Nullable
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C5987p c5987p) {
            if (set.isEmpty() == null) {
                return null;
            }
            set = C5992r.m25686e(type);
            if (set != Map.class) {
                return null;
            }
            type = C5992r.m25683b(type, set);
            return new C7192o(c5987p, type[0], type[1]).nullSafe();
        }
    }

    public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
        return m30925a(jsonReader);
    }

    public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
        m30926a(c5983k, (Map) obj);
    }

    C7192o(C5987p c5987p, Type type, Type type2) {
        this.f25991b = c5987p.m25667a(type);
        this.f25992c = c5987p.m25667a(type2);
    }

    /* renamed from: a */
    public void m30926a(C5983k c5983k, Map<K, V> map) throws IOException {
        c5983k.mo6472c();
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            if (entry.getKey() == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Map key is null at ");
                stringBuilder.append(c5983k.m25657l());
                throw new JsonDataException(stringBuilder.toString());
            }
            c5983k.m25656k();
            this.f25991b.toJson(c5983k, entry.getKey());
            this.f25992c.toJson(c5983k, entry.getValue());
        }
        c5983k.mo6474d();
    }

    /* renamed from: a */
    public Map<K, V> m30925a(JsonReader jsonReader) throws IOException {
        Map linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.mo6451e();
        while (jsonReader.mo6453g()) {
            jsonReader.mo6463s();
            Object fromJson = this.f25991b.fromJson(jsonReader);
            Object fromJson2 = this.f25992c.fromJson(jsonReader);
            Object put = linkedHashTreeMap.put(fromJson, fromJson2);
            if (put != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Map key '");
                stringBuilder.append(fromJson);
                stringBuilder.append("' has multiple values at path ");
                stringBuilder.append(jsonReader.m25606r());
                stringBuilder.append(": ");
                stringBuilder.append(put);
                stringBuilder.append(" and ");
                stringBuilder.append(fromJson2);
                throw new JsonDataException(stringBuilder.toString());
            }
        }
        jsonReader.mo6452f();
        return linkedHashTreeMap;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JsonAdapter(");
        stringBuilder.append(this.f25991b);
        stringBuilder.append("=");
        stringBuilder.append(this.f25992c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
