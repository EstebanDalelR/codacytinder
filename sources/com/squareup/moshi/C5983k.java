package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import javax.annotation.Nullable;
import okio.BufferedSink;

/* renamed from: com.squareup.moshi.k */
public abstract class C5983k implements Closeable, Flushable {
    /* renamed from: a */
    int f21844a = 0;
    /* renamed from: b */
    final int[] f21845b = new int[32];
    /* renamed from: c */
    final String[] f21846c = new String[32];
    /* renamed from: d */
    final int[] f21847d = new int[32];
    /* renamed from: e */
    String f21848e;
    /* renamed from: f */
    boolean f21849f;
    /* renamed from: g */
    boolean f21850g;
    /* renamed from: h */
    boolean f21851h;

    /* renamed from: a */
    public abstract C5983k mo6464a() throws IOException;

    /* renamed from: a */
    public abstract C5983k mo6465a(double d) throws IOException;

    /* renamed from: a */
    public abstract C5983k mo6466a(long j) throws IOException;

    /* renamed from: a */
    public abstract C5983k mo6467a(@Nullable Number number) throws IOException;

    /* renamed from: a */
    public abstract C5983k mo6468a(boolean z) throws IOException;

    /* renamed from: b */
    public abstract C5983k mo6470b() throws IOException;

    /* renamed from: b */
    public abstract C5983k mo6471b(String str) throws IOException;

    /* renamed from: c */
    public abstract C5983k mo6472c() throws IOException;

    /* renamed from: c */
    public abstract C5983k mo6473c(@Nullable String str) throws IOException;

    /* renamed from: d */
    public abstract C5983k mo6474d() throws IOException;

    /* renamed from: e */
    public abstract C5983k mo6475e() throws IOException;

    /* renamed from: a */
    public static C5983k m25635a(BufferedSink bufferedSink) {
        return new C7186h(bufferedSink);
    }

    C5983k() {
    }

    /* renamed from: g */
    final int m25652g() {
        if (this.f21844a != 0) {
            return this.f21845b[this.f21844a - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: a */
    final void m25641a(int i) {
        if (this.f21844a == this.f21845b.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Nesting too deep at ");
            stringBuilder.append(m25657l());
            stringBuilder.append(": circular reference?");
            throw new JsonDataException(stringBuilder.toString());
        }
        int[] iArr = this.f21845b;
        int i2 = this.f21844a;
        this.f21844a = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    final void m25645b(int i) {
        this.f21845b[this.f21844a - 1] = i;
    }

    /* renamed from: a */
    public void mo6469a(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f21848e = str;
    }

    /* renamed from: h */
    public final String m25653h() {
        return this.f21848e != null ? this.f21848e : "";
    }

    /* renamed from: b */
    public final void m25646b(boolean z) {
        this.f21849f = z;
    }

    /* renamed from: i */
    public final boolean m25654i() {
        return this.f21849f;
    }

    /* renamed from: c */
    public final void m25649c(boolean z) {
        this.f21850g = z;
    }

    /* renamed from: j */
    public final boolean m25655j() {
        return this.f21850g;
    }

    /* renamed from: k */
    final void m25656k() throws IOException {
        int g = m25652g();
        if (g == 5 || g == 3) {
            this.f21851h = true;
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: l */
    public final String m25657l() {
        return C5982f.m25634a(this.f21844a, this.f21845b, this.f21846c, this.f21847d);
    }
}
