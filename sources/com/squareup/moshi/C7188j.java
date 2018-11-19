package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.j */
final class C7188j extends C5983k {
    /* renamed from: i */
    private final Object[] f25985i = new Object[32];
    @Nullable
    /* renamed from: j */
    private String f25986j;

    C7188j() {
        m25641a(6);
    }

    /* renamed from: f */
    public Object m30924f() {
        int i = this.a;
        if (i <= 1) {
            if (i != 1 || this.b[i - 1] == 7) {
                return this.f25985i[0];
            }
        }
        throw new IllegalStateException("Incomplete document");
    }

    /* renamed from: a */
    public C5983k mo6464a() throws IOException {
        if (this.a == this.f25985i.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Nesting too deep at ");
            stringBuilder.append(m25657l());
            stringBuilder.append(": circular reference?");
            throw new JsonDataException(stringBuilder.toString());
        }
        Object arrayList = new ArrayList();
        m30912a(arrayList);
        this.f25985i[this.a] = arrayList;
        this.d[this.a] = 0;
        m25641a(1);
        return this;
    }

    /* renamed from: b */
    public C5983k mo6470b() throws IOException {
        if (m25652g() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.a--;
        this.f25985i[this.a] = null;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: c */
    public C5983k mo6472c() throws IOException {
        if (this.a == this.f25985i.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Nesting too deep at ");
            stringBuilder.append(m25657l());
            stringBuilder.append(": circular reference?");
            throw new JsonDataException(stringBuilder.toString());
        }
        Object linkedHashTreeMap = new LinkedHashTreeMap();
        m30912a(linkedHashTreeMap);
        this.f25985i[this.a] = linkedHashTreeMap;
        m25641a(3);
        return this;
    }

    /* renamed from: d */
    public C5983k mo6474d() throws IOException {
        if (m25652g() == 3) {
            if (this.f25986j == null) {
                this.h = false;
                this.a--;
                this.f25985i[this.a] = null;
                this.c[this.a] = null;
                int[] iArr = this.d;
                int i = this.a - 1;
                iArr[i] = iArr[i] + 1;
                return this;
            }
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: b */
    public C5983k mo6471b(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else {
            if (m25652g() == 3) {
                if (this.f25986j == null) {
                    this.f25986j = str;
                    this.c[this.a - 1] = str;
                    this.h = null;
                    return this;
                }
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: c */
    public C5983k mo6473c(@Nullable String str) throws IOException {
        if (this.h) {
            return mo6471b(str);
        }
        m30912a((Object) str);
        str = this.d;
        int i = this.a - 1;
        str[i] = str[i] + 1;
        return this;
    }

    /* renamed from: e */
    public C5983k mo6475e() throws IOException {
        m30912a(null);
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C5983k mo6468a(boolean z) throws IOException {
        m30912a(Boolean.valueOf(z));
        z = this.d;
        int i = this.a - 1;
        z[i] = z[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C5983k mo6465a(double d) throws IOException {
        if (!this.f && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Numeric values must be finite, but was ");
            stringBuilder.append(d);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.h) {
            return mo6471b(Double.toString(d));
        } else {
            m30912a(Double.valueOf(d));
            d = this.d;
            int i = this.a - 1;
            d[i] = d[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    public C5983k mo6466a(long j) throws IOException {
        if (this.h) {
            return mo6471b(Long.toString(j));
        }
        m30912a(Long.valueOf(j));
        j = this.d;
        int i = this.a - 1;
        j[i] = j[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C5983k mo6467a(@Nullable Number number) throws IOException {
        if (!((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer))) {
            if (!(number instanceof Long)) {
                if (!(number instanceof Float)) {
                    if (!(number instanceof Double)) {
                        if (number == null) {
                            return mo6475e();
                        }
                        Object obj;
                        if (number instanceof BigDecimal) {
                            obj = (BigDecimal) number;
                        } else {
                            obj = new BigDecimal(number.toString());
                        }
                        if (this.h) {
                            return mo6471b(obj.toString());
                        }
                        m30912a(obj);
                        number = this.d;
                        int i = this.a - 1;
                        number[i] = number[i] + 1;
                        return this;
                    }
                }
                return mo6465a(number.doubleValue());
            }
        }
        return mo6466a(number.longValue());
    }

    public void close() throws IOException {
        int i = this.a;
        if (i <= 1) {
            if (i != 1 || this.b[i - 1] == 7) {
                this.a = 0;
                return;
            }
        }
        throw new IOException("Incomplete document");
    }

    public void flush() throws IOException {
        if (this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    private C7188j m30912a(@Nullable Object obj) {
        int g = m25652g();
        if (this.a == 1) {
            if (g != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.b[this.a - 1] = 7;
            this.f25985i[this.a - 1] = obj;
        } else if (g == 3 && this.f25986j != null) {
            if (obj != null || this.g) {
                Object put = ((Map) this.f25985i[this.a - 1]).put(this.f25986j, obj);
                if (put != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Map key '");
                    stringBuilder.append(this.f25986j);
                    stringBuilder.append("' has multiple values at path ");
                    stringBuilder.append(m25657l());
                    stringBuilder.append(": ");
                    stringBuilder.append(put);
                    stringBuilder.append(" and ");
                    stringBuilder.append(obj);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.f25986j = null;
        } else if (g == 1) {
            ((List) this.f25985i[this.a - 1]).add(obj);
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
        return this;
    }
}
