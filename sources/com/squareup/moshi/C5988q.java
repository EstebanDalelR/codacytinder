package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter.Factory;
import com.squareup.moshi.JsonReader.C5971a;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.squareup.moshi.q */
final class C5988q {
    /* renamed from: a */
    public static final Factory f21862a = new C71941();
    /* renamed from: b */
    static final JsonAdapter<Boolean> f21863b = new C71963();
    /* renamed from: c */
    static final JsonAdapter<Byte> f21864c = new C71974();
    /* renamed from: d */
    static final JsonAdapter<Character> f21865d = new C71985();
    /* renamed from: e */
    static final JsonAdapter<Double> f21866e = new C71996();
    /* renamed from: f */
    static final JsonAdapter<Float> f21867f = new C72007();
    /* renamed from: g */
    static final JsonAdapter<Integer> f21868g = new C72018();
    /* renamed from: h */
    static final JsonAdapter<Long> f21869h = new C72029();
    /* renamed from: i */
    static final JsonAdapter<Short> f21870i = new JsonAdapter<Short>() {
        public String toString() {
            return "JsonAdapter(Short)";
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30928a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30929a(c5983k, (Short) obj);
        }

        /* renamed from: a */
        public Short m30928a(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) C5988q.m25669a(jsonReader, "a short", -32768, 32767));
        }

        /* renamed from: a */
        public void m30929a(C5983k c5983k, Short sh) throws IOException {
            c5983k.mo6466a((long) sh.intValue());
        }
    };
    /* renamed from: j */
    static final JsonAdapter<String> f21871j = new C71952();

    /* renamed from: com.squareup.moshi.q$1 */
    class C71941 implements Factory {
        C71941() {
        }

        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C5987p c5987p) {
            if (set.isEmpty() == null) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C5988q.f21863b;
            }
            if (type == Byte.TYPE) {
                return C5988q.f21864c;
            }
            if (type == Character.TYPE) {
                return C5988q.f21865d;
            }
            if (type == Double.TYPE) {
                return C5988q.f21866e;
            }
            if (type == Float.TYPE) {
                return C5988q.f21867f;
            }
            if (type == Integer.TYPE) {
                return C5988q.f21868g;
            }
            if (type == Long.TYPE) {
                return C5988q.f21869h;
            }
            if (type == Short.TYPE) {
                return C5988q.f21870i;
            }
            if (type == Boolean.class) {
                return C5988q.f21863b.nullSafe();
            }
            if (type == Byte.class) {
                return C5988q.f21864c.nullSafe();
            }
            if (type == Character.class) {
                return C5988q.f21865d.nullSafe();
            }
            if (type == Double.class) {
                return C5988q.f21866e.nullSafe();
            }
            if (type == Float.class) {
                return C5988q.f21867f.nullSafe();
            }
            if (type == Integer.class) {
                return C5988q.f21868g.nullSafe();
            }
            if (type == Long.class) {
                return C5988q.f21869h.nullSafe();
            }
            if (type == Short.class) {
                return C5988q.f21870i.nullSafe();
            }
            if (type == String.class) {
                return C5988q.f21871j.nullSafe();
            }
            if (type == Object.class) {
                return new C7204b(c5987p).nullSafe();
            }
            type = C5992r.m25686e(type);
            if (type.isEnum() != null) {
                return new C7203a(type).nullSafe();
            }
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.q$2 */
    class C71952 extends JsonAdapter<String> {
        public String toString() {
            return "JsonAdapter(String)";
        }

        C71952() {
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30930a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30931a(c5983k, (String) obj);
        }

        /* renamed from: a */
        public String m30930a(JsonReader jsonReader) throws IOException {
            return jsonReader.mo6456j();
        }

        /* renamed from: a */
        public void m30931a(C5983k c5983k, String str) throws IOException {
            c5983k.mo6473c(str);
        }
    }

    /* renamed from: com.squareup.moshi.q$3 */
    class C71963 extends JsonAdapter<Boolean> {
        public String toString() {
            return "JsonAdapter(Boolean)";
        }

        C71963() {
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30932a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30933a(c5983k, (Boolean) obj);
        }

        /* renamed from: a */
        public Boolean m30932a(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.mo6457k());
        }

        /* renamed from: a */
        public void m30933a(C5983k c5983k, Boolean bool) throws IOException {
            c5983k.mo6468a(bool.booleanValue());
        }
    }

    /* renamed from: com.squareup.moshi.q$4 */
    class C71974 extends JsonAdapter<Byte> {
        public String toString() {
            return "JsonAdapter(Byte)";
        }

        C71974() {
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30934a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30935a(c5983k, (Byte) obj);
        }

        /* renamed from: a */
        public Byte m30934a(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) C5988q.m25669a(jsonReader, "a byte", -128, 255));
        }

        /* renamed from: a */
        public void m30935a(C5983k c5983k, Byte b) throws IOException {
            c5983k.mo6466a((long) (b.intValue() & 255));
        }
    }

    /* renamed from: com.squareup.moshi.q$5 */
    class C71985 extends JsonAdapter<Character> {
        public String toString() {
            return "JsonAdapter(Character)";
        }

        C71985() {
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30936a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30937a(c5983k, (Character) obj);
        }

        /* renamed from: a */
        public Character m30936a(JsonReader jsonReader) throws IOException {
            String j = jsonReader.mo6456j();
            if (j.length() <= 1) {
                return Character.valueOf(j.charAt(0));
            }
            Object[] objArr = new Object[3];
            objArr[0] = "a char";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('\"');
            stringBuilder.append(j);
            stringBuilder.append('\"');
            objArr[1] = stringBuilder.toString();
            objArr[2] = jsonReader.m25606r();
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", objArr));
        }

        /* renamed from: a */
        public void m30937a(C5983k c5983k, Character ch) throws IOException {
            c5983k.mo6473c(ch.toString());
        }
    }

    /* renamed from: com.squareup.moshi.q$6 */
    class C71996 extends JsonAdapter<Double> {
        public String toString() {
            return "JsonAdapter(Double)";
        }

        C71996() {
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30938a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30939a(c5983k, (Double) obj);
        }

        /* renamed from: a */
        public Double m30938a(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.mo6459m());
        }

        /* renamed from: a */
        public void m30939a(C5983k c5983k, Double d) throws IOException {
            c5983k.mo6465a(d.doubleValue());
        }
    }

    /* renamed from: com.squareup.moshi.q$7 */
    class C72007 extends JsonAdapter<Float> {
        public String toString() {
            return "JsonAdapter(Float)";
        }

        C72007() {
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30940a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30941a(c5983k, (Float) obj);
        }

        /* renamed from: a */
        public Float m30940a(JsonReader jsonReader) throws IOException {
            float m = (float) jsonReader.mo6459m();
            if (jsonReader.m25587a() || !Float.isInfinite(m)) {
                return Float.valueOf(m);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(m);
            stringBuilder.append(" at path ");
            stringBuilder.append(jsonReader.m25606r());
            throw new JsonDataException(stringBuilder.toString());
        }

        /* renamed from: a */
        public void m30941a(C5983k c5983k, Float f) throws IOException {
            if (f == null) {
                throw new NullPointerException();
            }
            c5983k.mo6467a((Number) f);
        }
    }

    /* renamed from: com.squareup.moshi.q$8 */
    class C72018 extends JsonAdapter<Integer> {
        public String toString() {
            return "JsonAdapter(Integer)";
        }

        C72018() {
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30942a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30943a(c5983k, (Integer) obj);
        }

        /* renamed from: a */
        public Integer m30942a(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.mo6461o());
        }

        /* renamed from: a */
        public void m30943a(C5983k c5983k, Integer num) throws IOException {
            c5983k.mo6466a((long) num.intValue());
        }
    }

    /* renamed from: com.squareup.moshi.q$9 */
    class C72029 extends JsonAdapter<Long> {
        public String toString() {
            return "JsonAdapter(Long)";
        }

        C72029() {
        }

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30944a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30945a(c5983k, (Long) obj);
        }

        /* renamed from: a */
        public Long m30944a(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.mo6460n());
        }

        /* renamed from: a */
        public void m30945a(C5983k c5983k, Long l) throws IOException {
            c5983k.mo6466a(l.longValue());
        }
    }

    /* renamed from: com.squareup.moshi.q$a */
    static final class C7203a<T extends Enum<T>> extends JsonAdapter<T> {
        /* renamed from: a */
        private final Class<T> f25995a;
        /* renamed from: b */
        private final String[] f25996b;
        /* renamed from: c */
        private final T[] f25997c;
        /* renamed from: d */
        private final C5971a f25998d;

        public /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return m30946a(jsonReader);
        }

        public /* synthetic */ void toJson(C5983k c5983k, Object obj) throws IOException {
            m30947a(c5983k, (Enum) obj);
        }

        C7203a(Class<T> cls) {
            this.f25995a = cls;
            try {
                this.f25997c = (Enum[]) cls.getEnumConstants();
                this.f25996b = new String[this.f25997c.length];
                for (int i = 0; i < this.f25997c.length; i++) {
                    Enum enumR = this.f25997c[i];
                    Json json = (Json) cls.getField(enumR.name()).getAnnotation(Json.class);
                    this.f25996b[i] = json != null ? json.name() : enumR.name();
                }
                this.f25998d = C5971a.m25580a(this.f25996b);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Missing field in ");
                stringBuilder.append(cls.getName());
                throw new AssertionError(stringBuilder.toString(), e);
            }
        }

        /* renamed from: a */
        public T m30946a(JsonReader jsonReader) throws IOException {
            int b = jsonReader.mo6448b(this.f25998d);
            if (b != -1) {
                return this.f25997c[b];
            }
            String j = jsonReader.mo6456j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected one of ");
            stringBuilder.append(Arrays.asList(this.f25996b));
            stringBuilder.append(" but was ");
            stringBuilder.append(j);
            stringBuilder.append(" at path ");
            stringBuilder.append(jsonReader.m25606r());
            throw new JsonDataException(stringBuilder.toString());
        }

        /* renamed from: a */
        public void m30947a(C5983k c5983k, T t) throws IOException {
            c5983k.mo6473c(this.f25996b[t.ordinal()]);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JsonAdapter(");
            stringBuilder.append(this.f25995a.getName());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.squareup.moshi.q$b */
    static final class C7204b extends JsonAdapter<Object> {
        /* renamed from: a */
        private final C5987p f25999a;

        public String toString() {
            return "JsonAdapter(Object)";
        }

        C7204b(C5987p c5987p) {
            this.f25999a = c5987p;
        }

        public Object fromJson(JsonReader jsonReader) throws IOException {
            return jsonReader.m25605q();
        }

        public void toJson(C5983k c5983k, Object obj) throws IOException {
            Class cls = obj.getClass();
            if (cls == Object.class) {
                c5983k.mo6472c();
                c5983k.mo6474d();
                return;
            }
            this.f25999a.m25668a(m30948a(cls), C5993s.f21879a).toJson(c5983k, obj);
        }

        /* renamed from: a */
        private Class<?> m30948a(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }
    }

    /* renamed from: a */
    static int m25669a(JsonReader jsonReader, String str, int i, int i2) throws IOException {
        int o = jsonReader.mo6461o();
        if (o >= i) {
            if (o <= i2) {
                return o;
            }
        }
        throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(o), jsonReader.m25606r()}));
    }
}
