package com.google.zxing.datamatrix.encoder;

import com.google.zxing.C5660c;
import com.tinder.api.ManagerWebServices;
import java.nio.charset.Charset;

/* renamed from: com.google.zxing.datamatrix.encoder.h */
final class C5669h {
    /* renamed from: a */
    int f21004a;
    /* renamed from: b */
    private final String f21005b;
    /* renamed from: c */
    private SymbolShapeHint f21006c;
    /* renamed from: d */
    private C5660c f21007d;
    /* renamed from: e */
    private C5660c f21008e;
    /* renamed from: f */
    private final StringBuilder f21009f;
    /* renamed from: g */
    private int f21010g;
    /* renamed from: h */
    private C5672k f21011h;
    /* renamed from: i */
    private int f21012i;

    C5669h(String str) {
        byte[] bytes = str.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder stringBuilder = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != ManagerWebServices.QUERY_QUESTION_MARK || str.charAt(i) == ManagerWebServices.QUERY_QUESTION_MARK) {
                stringBuilder.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f21005b = stringBuilder.toString();
        this.f21006c = SymbolShapeHint.FORCE_NONE;
        this.f21009f = new StringBuilder(str.length());
        this.f21010g = -1;
    }

    /* renamed from: a */
    public void m24795a(SymbolShapeHint symbolShapeHint) {
        this.f21006c = symbolShapeHint;
    }

    /* renamed from: a */
    public void m24794a(C5660c c5660c, C5660c c5660c2) {
        this.f21007d = c5660c;
        this.f21008e = c5660c2;
    }

    /* renamed from: a */
    public String m24791a() {
        return this.f21005b;
    }

    /* renamed from: a */
    public void m24793a(int i) {
        this.f21012i = i;
    }

    /* renamed from: b */
    public char m24797b() {
        return this.f21005b.charAt(this.f21004a);
    }

    /* renamed from: c */
    public StringBuilder m24799c() {
        return this.f21009f;
    }

    /* renamed from: a */
    public void m24796a(String str) {
        this.f21009f.append(str);
    }

    /* renamed from: a */
    public void m24792a(char c) {
        this.f21009f.append(c);
    }

    /* renamed from: d */
    public int m24801d() {
        return this.f21009f.length();
    }

    /* renamed from: e */
    public int m24802e() {
        return this.f21010g;
    }

    /* renamed from: b */
    public void m24798b(int i) {
        this.f21010g = i;
    }

    /* renamed from: f */
    public void m24803f() {
        this.f21010g = -1;
    }

    /* renamed from: g */
    public boolean m24804g() {
        return this.f21004a < m24790l();
    }

    /* renamed from: l */
    private int m24790l() {
        return this.f21005b.length() - this.f21012i;
    }

    /* renamed from: h */
    public int m24805h() {
        return m24790l() - this.f21004a;
    }

    /* renamed from: i */
    public C5672k m24806i() {
        return this.f21011h;
    }

    /* renamed from: j */
    public void m24807j() {
        m24800c(m24801d());
    }

    /* renamed from: c */
    public void m24800c(int i) {
        if (this.f21011h == null || i > this.f21011h.m24837f()) {
            this.f21011h = C5672k.m24827a(i, this.f21006c, this.f21007d, this.f21008e, true);
        }
    }

    /* renamed from: k */
    public void m24808k() {
        this.f21011h = null;
    }
}
