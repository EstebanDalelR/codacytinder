package com.squareup.moshi;

import com.squareup.moshi.JsonReader.C5971a;
import com.squareup.moshi.JsonReader.Token;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.i */
final class C7187i extends JsonReader {
    /* renamed from: g */
    private static final Object f25983g = new Object();
    /* renamed from: h */
    private final Object[] f25984h = new Object[32];

    C7187i(Object obj) {
        this.b[this.a] = 7;
        Object[] objArr = this.f25984h;
        int i = this.a;
        this.a = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: c */
    public void mo6449c() throws IOException {
        ListIterator listIterator = ((List) m30891a(List.class, Token.BEGIN_ARRAY)).listIterator();
        this.f25984h[this.a - 1] = listIterator;
        this.b[this.a - 1] = 1;
        this.d[this.a - 1] = 0;
        if (listIterator.hasNext()) {
            m30893a(listIterator.next());
        }
    }

    /* renamed from: d */
    public void mo6450d() throws IOException {
        ListIterator listIterator = (ListIterator) m30891a(ListIterator.class, Token.END_ARRAY);
        if (listIterator.hasNext()) {
            throw m25583a(listIterator, Token.END_ARRAY);
        }
        m30894t();
    }

    /* renamed from: e */
    public void mo6451e() throws IOException {
        Iterator it = ((Map) m30891a(Map.class, Token.BEGIN_OBJECT)).entrySet().iterator();
        this.f25984h[this.a - 1] = it;
        this.b[this.a - 1] = 3;
        if (it.hasNext()) {
            m30893a(it.next());
        }
    }

    /* renamed from: f */
    public void mo6452f() throws IOException {
        Iterator it = (Iterator) m30891a(Iterator.class, Token.END_OBJECT);
        if (!(it instanceof ListIterator)) {
            if (!it.hasNext()) {
                this.c[this.a - 1] = null;
                m30894t();
                return;
            }
        }
        throw m25583a(it, Token.END_OBJECT);
    }

    /* renamed from: g */
    public boolean mo6453g() throws IOException {
        boolean z = true;
        if (this.a == 0) {
            return true;
        }
        Object obj = this.f25984h[this.a - 1];
        if (obj instanceof Iterator) {
            if (!((Iterator) obj).hasNext()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: h */
    public Token mo6454h() throws IOException {
        if (this.a == 0) {
            return Token.END_DOCUMENT;
        }
        Object obj = this.f25984h[this.a - 1];
        if (obj instanceof ListIterator) {
            return Token.END_ARRAY;
        }
        if (obj instanceof Iterator) {
            return Token.END_OBJECT;
        }
        if (obj instanceof List) {
            return Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return Token.BEGIN_OBJECT;
        }
        if (obj instanceof Entry) {
            return Token.NAME;
        }
        if (obj instanceof String) {
            return Token.STRING;
        }
        if (obj instanceof Boolean) {
            return Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return Token.NUMBER;
        }
        if (obj == null) {
            return Token.NULL;
        }
        if (obj == f25983g) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m25583a(obj, "a JSON value");
    }

    /* renamed from: i */
    public String mo6455i() throws IOException {
        Entry entry = (Entry) m30891a(Entry.class, Token.NAME);
        String a = m30892a(entry);
        this.f25984h[this.a - 1] = entry.getValue();
        this.c[this.a - 2] = a;
        return a;
    }

    /* renamed from: a */
    public int mo6447a(C5971a c5971a) throws IOException {
        Entry entry = (Entry) m30891a(Entry.class, Token.NAME);
        String a = m30892a(entry);
        int length = c5971a.f21802a.length;
        for (int i = 0; i < length; i++) {
            if (c5971a.f21802a[i].equals(a)) {
                this.f25984h[this.a - 1] = entry.getValue();
                this.c[this.a - 2] = a;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public String mo6456j() throws IOException {
        String str = (String) m30891a(String.class, Token.STRING);
        m30894t();
        return str;
    }

    /* renamed from: b */
    public int mo6448b(C5971a c5971a) throws IOException {
        String str = (String) m30891a(String.class, Token.STRING);
        int length = c5971a.f21802a.length;
        for (int i = 0; i < length; i++) {
            if (c5971a.f21802a[i].equals(str)) {
                m30894t();
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public boolean mo6457k() throws IOException {
        Boolean bool = (Boolean) m30891a(Boolean.class, Token.BOOLEAN);
        m30894t();
        return bool.booleanValue();
    }

    @Nullable
    /* renamed from: l */
    public <T> T mo6458l() throws IOException {
        m30891a(Void.class, Token.NULL);
        m30894t();
        return null;
    }

    /* renamed from: m */
    public double mo6459m() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = java.lang.Object.class;
        r1 = com.squareup.moshi.JsonReader.Token.NUMBER;
        r0 = r5.m30891a(r0, r1);
        r1 = r0 instanceof java.lang.Number;
        if (r1 == 0) goto L_0x0013;
    L_0x000c:
        r0 = (java.lang.Number) r0;
        r0 = r0.doubleValue();
        goto L_0x001f;
    L_0x0013:
        r1 = r0 instanceof java.lang.String;
        if (r1 == 0) goto L_0x005d;
    L_0x0017:
        r1 = r0;	 Catch:{ NumberFormatException -> 0x0056 }
        r1 = (java.lang.String) r1;	 Catch:{ NumberFormatException -> 0x0056 }
        r1 = java.lang.Double.parseDouble(r1);	 Catch:{ NumberFormatException -> 0x0056 }
        r0 = r1;
    L_0x001f:
        r2 = r5.e;
        if (r2 != 0) goto L_0x0052;
    L_0x0023:
        r2 = java.lang.Double.isNaN(r0);
        if (r2 != 0) goto L_0x002f;
    L_0x0029:
        r2 = java.lang.Double.isInfinite(r0);
        if (r2 == 0) goto L_0x0052;
    L_0x002f:
        r2 = new com.squareup.moshi.JsonEncodingException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "JSON forbids NaN and infinities: ";
        r3.append(r4);
        r3.append(r0);
        r0 = " at path ";
        r3.append(r0);
        r0 = r5.m25606r();
        r3.append(r0);
        r0 = r3.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0052:
        r5.m30894t();
        return r0;
    L_0x0056:
        r1 = com.squareup.moshi.JsonReader.Token.NUMBER;
        r0 = r5.m25583a(r0, r1);
        throw r0;
    L_0x005d:
        r1 = com.squareup.moshi.JsonReader.Token.NUMBER;
        r0 = r5.m25583a(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.i.m():double");
    }

    /* renamed from: n */
    public long mo6460n() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = java.lang.Object.class;
        r1 = com.squareup.moshi.JsonReader.Token.NUMBER;
        r0 = r3.m30891a(r0, r1);
        r1 = r0 instanceof java.lang.Number;
        if (r1 == 0) goto L_0x0014;
    L_0x000c:
        r0 = (java.lang.Number) r0;
        r0 = r0.longValue();
        r1 = r0;
        goto L_0x002c;
    L_0x0014:
        r1 = r0 instanceof java.lang.String;
        if (r1 == 0) goto L_0x0037;
    L_0x0018:
        r1 = r0;	 Catch:{ NumberFormatException -> 0x0020 }
        r1 = (java.lang.String) r1;	 Catch:{ NumberFormatException -> 0x0020 }
        r1 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x0020 }
        goto L_0x002c;
    L_0x0020:
        r1 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0030 }
        r2 = r0;	 Catch:{ NumberFormatException -> 0x0030 }
        r2 = (java.lang.String) r2;	 Catch:{ NumberFormatException -> 0x0030 }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x0030 }
        r1 = r1.longValueExact();	 Catch:{ NumberFormatException -> 0x0030 }
    L_0x002c:
        r3.m30894t();
        return r1;
    L_0x0030:
        r1 = com.squareup.moshi.JsonReader.Token.NUMBER;
        r0 = r3.m25583a(r0, r1);
        throw r0;
    L_0x0037:
        r1 = com.squareup.moshi.JsonReader.Token.NUMBER;
        r0 = r3.m25583a(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.i.n():long");
    }

    /* renamed from: o */
    public int mo6461o() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = java.lang.Object.class;
        r1 = com.squareup.moshi.JsonReader.Token.NUMBER;
        r0 = r3.m30891a(r0, r1);
        r1 = r0 instanceof java.lang.Number;
        if (r1 == 0) goto L_0x0014;
    L_0x000c:
        r0 = (java.lang.Number) r0;
        r0 = r0.intValue();
        r1 = r0;
        goto L_0x002c;
    L_0x0014:
        r1 = r0 instanceof java.lang.String;
        if (r1 == 0) goto L_0x0037;
    L_0x0018:
        r1 = r0;	 Catch:{ NumberFormatException -> 0x0020 }
        r1 = (java.lang.String) r1;	 Catch:{ NumberFormatException -> 0x0020 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0020 }
        goto L_0x002c;
    L_0x0020:
        r1 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0030 }
        r2 = r0;	 Catch:{ NumberFormatException -> 0x0030 }
        r2 = (java.lang.String) r2;	 Catch:{ NumberFormatException -> 0x0030 }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x0030 }
        r1 = r1.intValueExact();	 Catch:{ NumberFormatException -> 0x0030 }
    L_0x002c:
        r3.m30894t();
        return r1;
    L_0x0030:
        r1 = com.squareup.moshi.JsonReader.Token.NUMBER;
        r0 = r3.m25583a(r0, r1);
        throw r0;
    L_0x0037:
        r1 = com.squareup.moshi.JsonReader.Token.NUMBER;
        r0 = r3.m25583a(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.i.o():int");
    }

    /* renamed from: p */
    public void mo6462p() throws IOException {
        if (this.f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot skip unexpected ");
            stringBuilder.append(mo6454h());
            stringBuilder.append(" at ");
            stringBuilder.append(m25606r());
            throw new JsonDataException(stringBuilder.toString());
        }
        if (this.a > 1) {
            this.c[this.a - 2] = ManagerWebServices.NULL_STRING_VALUE;
        }
        if ((this.a != 0 ? this.f25984h[this.a - 1] : null) instanceof Entry) {
            this.f25984h[this.a - 1] = ((Entry) this.f25984h[this.a - 1]).getValue();
        } else if (this.a > 0) {
            m30894t();
        }
    }

    /* renamed from: s */
    void mo6463s() throws IOException {
        if (mo6453g()) {
            m30893a(mo6455i());
        }
    }

    public void close() throws IOException {
        Arrays.fill(this.f25984h, 0, this.a, null);
        this.f25984h[0] = f25983g;
        this.b[0] = 8;
        this.a = 1;
    }

    /* renamed from: a */
    private void m30893a(Object obj) {
        if (this.a == this.f25984h.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Nesting too deep at ");
            stringBuilder.append(m25606r());
            throw new JsonDataException(stringBuilder.toString());
        }
        Object[] objArr = this.f25984h;
        int i = this.a;
        this.a = i + 1;
        objArr[i] = obj;
    }

    @Nullable
    /* renamed from: a */
    private <T> T m30891a(Class<T> cls, Token token) throws IOException {
        Class<T> cls2 = this.a != 0 ? this.f25984h[this.a - 1] : null;
        if (cls.isInstance(cls2)) {
            return cls.cast(cls2);
        }
        if (cls2 == null && token == Token.NULL) {
            return null;
        }
        if (cls2 == f25983g) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m25583a(cls2, token);
    }

    /* renamed from: a */
    private String m30892a(Entry<?, ?> entry) {
        entry = entry.getKey();
        if (entry instanceof String) {
            return (String) entry;
        }
        throw m25583a(entry, Token.NAME);
    }

    /* renamed from: t */
    private void m30894t() {
        this.a--;
        this.f25984h[this.a] = null;
        this.b[this.a] = 0;
        if (this.a > 0) {
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            Object obj = this.f25984h[this.a - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    m30893a(it.next());
                }
            }
        }
    }
}
