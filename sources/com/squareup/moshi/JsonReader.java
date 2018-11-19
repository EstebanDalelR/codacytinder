package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.C15977l;
import okio.C18549c;

public abstract class JsonReader implements Closeable {
    /* renamed from: a */
    int f21804a = 0;
    /* renamed from: b */
    final int[] f21805b = new int[32];
    /* renamed from: c */
    final String[] f21806c = new String[32];
    /* renamed from: d */
    final int[] f21807d = new int[32];
    /* renamed from: e */
    boolean f21808e;
    /* renamed from: f */
    boolean f21809f;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* renamed from: com.squareup.moshi.JsonReader$a */
    public static final class C5971a {
        /* renamed from: a */
        final String[] f21802a;
        /* renamed from: b */
        final C15977l f21803b;

        private C5971a(String[] strArr, C15977l c15977l) {
            this.f21802a = strArr;
            this.f21803b = c15977l;
        }

        /* renamed from: a */
        public static C5971a m25580a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                BufferedSink c18549c = new C18549c();
                for (int i = 0; i < strArr.length; i++) {
                    C7186h.m30874a(c18549c, strArr[i]);
                    c18549c.readByte();
                    byteStringArr[i] = c18549c.readByteString();
                }
                return new C5971a((String[]) strArr.clone(), C15977l.a(byteStringArr));
            } catch (String[] strArr2) {
                throw new AssertionError(strArr2);
            }
        }
    }

    /* renamed from: a */
    public abstract int mo6447a(C5971a c5971a) throws IOException;

    /* renamed from: b */
    public abstract int mo6448b(C5971a c5971a) throws IOException;

    /* renamed from: c */
    public abstract void mo6449c() throws IOException;

    /* renamed from: d */
    public abstract void mo6450d() throws IOException;

    /* renamed from: e */
    public abstract void mo6451e() throws IOException;

    /* renamed from: f */
    public abstract void mo6452f() throws IOException;

    /* renamed from: g */
    public abstract boolean mo6453g() throws IOException;

    /* renamed from: h */
    public abstract Token mo6454h() throws IOException;

    /* renamed from: i */
    public abstract String mo6455i() throws IOException;

    /* renamed from: j */
    public abstract String mo6456j() throws IOException;

    /* renamed from: k */
    public abstract boolean mo6457k() throws IOException;

    @Nullable
    /* renamed from: l */
    public abstract <T> T mo6458l() throws IOException;

    /* renamed from: m */
    public abstract double mo6459m() throws IOException;

    /* renamed from: n */
    public abstract long mo6460n() throws IOException;

    /* renamed from: o */
    public abstract int mo6461o() throws IOException;

    /* renamed from: p */
    public abstract void mo6462p() throws IOException;

    /* renamed from: s */
    abstract void mo6463s() throws IOException;

    /* renamed from: a */
    public static JsonReader m25581a(BufferedSource bufferedSource) {
        return new C7185g(bufferedSource);
    }

    JsonReader() {
    }

    /* renamed from: a */
    final void m25585a(int i) {
        if (this.f21804a == this.f21805b.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Nesting too deep at ");
            stringBuilder.append(m25606r());
            throw new JsonDataException(stringBuilder.toString());
        }
        int[] iArr = this.f21805b;
        int i2 = this.f21804a;
        this.f21804a = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: a */
    final JsonEncodingException m25584a(String str) throws JsonEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" at path ");
        stringBuilder.append(m25606r());
        throw new JsonEncodingException(stringBuilder.toString());
    }

    /* renamed from: a */
    final JsonDataException m25583a(@Nullable Object obj, Object obj2) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(obj2);
            stringBuilder.append(" but was null at path ");
            stringBuilder.append(m25606r());
            return new JsonDataException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Expected ");
        stringBuilder2.append(obj2);
        stringBuilder2.append(" but was ");
        stringBuilder2.append(obj);
        stringBuilder2.append(", a ");
        stringBuilder2.append(obj.getClass().getName());
        stringBuilder2.append(", at path ");
        stringBuilder2.append(m25606r());
        return new JsonDataException(stringBuilder2.toString());
    }

    /* renamed from: a */
    public final void m25586a(boolean z) {
        this.f21808e = z;
    }

    /* renamed from: a */
    public final boolean m25587a() {
        return this.f21808e;
    }

    /* renamed from: b */
    public final void m25589b(boolean z) {
        this.f21809f = z;
    }

    /* renamed from: b */
    public final boolean m25590b() {
        return this.f21809f;
    }

    @Nullable
    /* renamed from: q */
    public final Object m25605q() throws IOException {
        switch (mo6454h()) {
            case BEGIN_ARRAY:
                List arrayList = new ArrayList();
                mo6449c();
                while (mo6453g()) {
                    arrayList.add(m25605q());
                }
                mo6450d();
                return arrayList;
            case BEGIN_OBJECT:
                Map linkedHashTreeMap = new LinkedHashTreeMap();
                mo6451e();
                while (mo6453g()) {
                    String i = mo6455i();
                    Object q = m25605q();
                    Object put = linkedHashTreeMap.put(i, q);
                    if (put != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Map key '");
                        stringBuilder.append(i);
                        stringBuilder.append("' has multiple values at path ");
                        stringBuilder.append(m25606r());
                        stringBuilder.append(": ");
                        stringBuilder.append(put);
                        stringBuilder.append(" and ");
                        stringBuilder.append(q);
                        throw new JsonDataException(stringBuilder.toString());
                    }
                }
                mo6452f();
                return linkedHashTreeMap;
            case STRING:
                return mo6456j();
            case NUMBER:
                return Double.valueOf(mo6459m());
            case BOOLEAN:
                return Boolean.valueOf(mo6457k());
            case NULL:
                return mo6458l();
            default:
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Expected a value but was ");
                stringBuilder2.append(mo6454h());
                stringBuilder2.append(" at path ");
                stringBuilder2.append(m25606r());
                throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    /* renamed from: r */
    public final String m25606r() {
        return C5982f.m25634a(this.f21804a, this.f21805b, this.f21806c, this.f21807d);
    }
}
