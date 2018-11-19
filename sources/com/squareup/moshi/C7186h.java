package com.squareup.moshi;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import javax.annotation.Nullable;
import okio.BufferedSink;

/* renamed from: com.squareup.moshi.h */
final class C7186h extends C5983k {
    /* renamed from: i */
    private static final String[] f25979i = new String[ProfileEditingConfig.DEFAULT_MAX_LENGTH];
    /* renamed from: j */
    private final BufferedSink f25980j;
    /* renamed from: k */
    private String f25981k = ":";
    /* renamed from: l */
    private String f25982l;

    static {
        for (int i = 0; i <= 31; i++) {
            f25979i[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        f25979i[34] = "\\\"";
        f25979i[92] = "\\\\";
        f25979i[9] = "\\t";
        f25979i[8] = "\\b";
        f25979i[10] = "\\n";
        f25979i[13] = "\\r";
        f25979i[12] = "\\f";
    }

    C7186h(BufferedSink bufferedSink) {
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        }
        this.f25980j = bufferedSink;
        m25641a(6);
    }

    /* renamed from: a */
    public void mo6469a(String str) {
        super.mo6469a(str);
        this.f25981k = str.isEmpty() == null ? ": " : ":";
    }

    /* renamed from: a */
    public C5983k mo6464a() throws IOException {
        m30875f();
        return m30873a(1, "[");
    }

    /* renamed from: b */
    public C5983k mo6470b() throws IOException {
        return m30872a(1, 2, "]");
    }

    /* renamed from: c */
    public C5983k mo6472c() throws IOException {
        m30875f();
        return m30873a(3, "{");
    }

    /* renamed from: d */
    public C5983k mo6474d() throws IOException {
        this.h = false;
        return m30872a(3, 5, "}");
    }

    /* renamed from: a */
    private C5983k m30873a(int i, String str) throws IOException {
        m30878o();
        m25641a(i);
        this.d[this.a - 1] = null;
        this.f25980j.writeUtf8(str);
        return this;
    }

    /* renamed from: a */
    private C5983k m30872a(int i, int i2, String str) throws IOException {
        int g = m25652g();
        if (g != i2 && g != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f25982l != 0) {
            i2 = new StringBuilder();
            i2.append("Dangling name: ");
            i2.append(this.f25982l);
            throw new IllegalStateException(i2.toString());
        } else {
            this.a--;
            this.c[this.a] = null;
            i = this.d;
            int i3 = this.a - 1;
            i[i3] = i[i3] + 1;
            if (g == i2) {
                m30876m();
            }
            this.f25980j.writeUtf8(str);
            return this;
        }
    }

    /* renamed from: b */
    public C5983k mo6471b(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (this.f25982l != null) {
            throw new IllegalStateException("Nesting problem.");
        } else {
            this.f25982l = str;
            this.c[this.a - 1] = str;
            this.h = null;
            return this;
        }
    }

    /* renamed from: f */
    private void m30875f() throws IOException {
        if (this.f25982l != null) {
            m30877n();
            C7186h.m30874a(this.f25980j, this.f25982l);
            this.f25982l = null;
        }
    }

    /* renamed from: c */
    public C5983k mo6473c(String str) throws IOException {
        if (str == null) {
            return mo6475e();
        }
        if (this.h) {
            return mo6471b(str);
        }
        m30875f();
        m30878o();
        C7186h.m30874a(this.f25980j, str);
        str = this.d;
        int i = this.a - 1;
        str[i] = str[i] + 1;
        return this;
    }

    /* renamed from: e */
    public C5983k mo6475e() throws IOException {
        if (this.f25982l != null) {
            if (this.g) {
                m30875f();
            } else {
                this.f25982l = null;
                return this;
            }
        }
        m30878o();
        this.f25980j.writeUtf8(ManagerWebServices.NULL_STRING_VALUE);
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C5983k mo6468a(boolean z) throws IOException {
        m30875f();
        m30878o();
        this.f25980j.writeUtf8(z ? "true" : "false");
        z = this.d;
        int i = this.a - 1;
        z[i] = z[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C5983k mo6465a(double d) throws IOException {
        if (!this.f && (Double.isNaN(d) || Double.isInfinite(d))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Numeric values must be finite, but was ");
            stringBuilder.append(d);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.h) {
            return mo6471b(Double.toString(d));
        } else {
            m30875f();
            m30878o();
            this.f25980j.writeUtf8(Double.toString(d));
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
        m30875f();
        m30878o();
        this.f25980j.writeUtf8(Long.toString(j));
        j = this.d;
        int i = this.a - 1;
        j[i] = j[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C5983k mo6467a(@Nullable Number number) throws IOException {
        if (number == null) {
            return mo6475e();
        }
        String obj = number.toString();
        if (!this.f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Numeric values must be finite, but was ");
            stringBuilder.append(number);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.h != null) {
            return mo6471b(obj);
        } else {
            m30875f();
            m30878o();
            this.f25980j.writeUtf8(obj);
            number = this.d;
            int i = this.a - 1;
            number[i] = number[i] + 1;
            return this;
        }
    }

    public void flush() throws IOException {
        if (this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f25980j.flush();
    }

    public void close() throws IOException {
        this.f25980j.close();
        int i = this.a;
        if (i <= 1) {
            if (i != 1 || this.b[i - 1] == 7) {
                this.a = 0;
                return;
            }
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: a */
    static void m30874a(BufferedSink bufferedSink, String str) throws IOException {
        String[] strArr = f25979i;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str2;
            char charAt = str.charAt(i2);
            if (charAt < '') {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == ' ') {
                str2 = "\\u2028";
            } else if (charAt == ' ') {
                str2 = "\\u2029";
            } else {
            }
            if (i < i2) {
                bufferedSink.writeUtf8(str, i, i2);
            }
            bufferedSink.writeUtf8(str2);
            i = i2 + 1;
        }
        if (i < length) {
            bufferedSink.writeUtf8(str, i, length);
        }
        bufferedSink.writeByte(34);
    }

    /* renamed from: m */
    private void m30876m() throws IOException {
        if (this.e != null) {
            this.f25980j.writeByte(10);
            int i = this.a;
            for (int i2 = 1; i2 < i; i2++) {
                this.f25980j.writeUtf8(this.e);
            }
        }
    }

    /* renamed from: n */
    private void m30877n() throws IOException {
        int g = m25652g();
        if (g == 5) {
            this.f25980j.writeByte(44);
        } else if (g != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m30876m();
        m25645b(4);
    }

    /* renamed from: o */
    private void m30878o() throws IOException {
        switch (m25652g()) {
            case 1:
                m25645b(2);
                m30876m();
                return;
            case 2:
                this.f25980j.writeByte(44);
                m30876m();
                return;
            case 4:
                this.f25980j.writeUtf8(this.f25981k);
                m25645b(5);
                return;
            case 6:
                break;
            case 7:
                if (!this.f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
            default:
                throw new IllegalStateException("Nesting problem.");
        }
        m25645b(7);
    }
}
