package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/* renamed from: org.joda.time.format.b */
public class C19316b {
    /* renamed from: a */
    private final C19325k f60185a;
    /* renamed from: b */
    private final C19324i f60186b;
    /* renamed from: c */
    private final Locale f60187c;
    /* renamed from: d */
    private final boolean f60188d;
    /* renamed from: e */
    private final C19304a f60189e;
    /* renamed from: f */
    private final DateTimeZone f60190f;
    /* renamed from: g */
    private final Integer f60191g;
    /* renamed from: h */
    private final int f60192h;

    C19316b(C19325k c19325k, C19324i c19324i) {
        this.f60185a = c19325k;
        this.f60186b = c19324i;
        this.f60187c = null;
        this.f60188d = null;
        this.f60189e = null;
        this.f60190f = null;
        this.f60191g = null;
        this.f60192h = 2000;
    }

    private C19316b(C19325k c19325k, C19324i c19324i, Locale locale, boolean z, C19304a c19304a, DateTimeZone dateTimeZone, Integer num, int i) {
        this.f60185a = c19325k;
        this.f60186b = c19324i;
        this.f60187c = locale;
        this.f60188d = z;
        this.f60189e = c19304a;
        this.f60190f = dateTimeZone;
        this.f60191g = num;
        this.f60192h = i;
    }

    /* renamed from: a */
    C19325k m69165a() {
        return this.f60185a;
    }

    /* renamed from: b */
    public DateTimeParser m69171b() {
        return C19495j.m70320a(this.f60186b);
    }

    /* renamed from: c */
    C19324i m69173c() {
        return this.f60186b;
    }

    /* renamed from: a */
    public C19316b m69162a(Locale locale) {
        if (locale != m69174d()) {
            if (locale == null || !locale.equals(m69174d())) {
                return new C19316b(this.f60185a, this.f60186b, locale, this.f60188d, this.f60189e, this.f60190f, this.f60191g, this.f60192h);
            }
        }
        return this;
    }

    /* renamed from: d */
    public Locale m69174d() {
        return this.f60187c;
    }

    /* renamed from: e */
    public C19316b m69176e() {
        if (this.f60188d) {
            return this;
        }
        return new C19316b(this.f60185a, this.f60186b, this.f60187c, true, this.f60189e, null, this.f60191g, this.f60192h);
    }

    /* renamed from: a */
    public C19316b m69164a(C19304a c19304a) {
        if (this.f60189e == c19304a) {
            return this;
        }
        return new C19316b(this.f60185a, this.f60186b, this.f60187c, this.f60188d, c19304a, this.f60190f, this.f60191g, this.f60192h);
    }

    /* renamed from: f */
    public C19316b m69177f() {
        return m69163a(DateTimeZone.f8461a);
    }

    /* renamed from: a */
    public C19316b m69163a(DateTimeZone dateTimeZone) {
        if (this.f60190f == dateTimeZone) {
            return this;
        }
        return new C19316b(this.f60185a, this.f60186b, this.f60187c, false, this.f60189e, dateTimeZone, this.f60191g, this.f60192h);
    }

    /* renamed from: g */
    public DateTimeZone m69178g() {
        return this.f60190f;
    }

    /* renamed from: a */
    public void m69167a(Appendable appendable, ReadableInstant readableInstant) throws IOException {
        m69155a(appendable, DateTimeUtils.m68904a(readableInstant), DateTimeUtils.m68914b(readableInstant));
    }

    /* renamed from: a */
    public void m69169a(java.lang.StringBuffer r1, long r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0.m69166a(r1, r2);	 Catch:{ IOException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.b.a(java.lang.StringBuffer, long):void");
    }

    /* renamed from: a */
    public void m69166a(Appendable appendable, long j) throws IOException {
        m69155a(appendable, j, null);
    }

    /* renamed from: a */
    public void m69168a(Appendable appendable, ReadablePartial readablePartial) throws IOException {
        C19325k h = m69157h();
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        h.printTo(appendable, readablePartial, this.f60187c);
    }

    /* renamed from: a */
    public java.lang.String m69160a(org.joda.time.ReadableInstant r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = new java.lang.StringBuilder;
        r1 = r2.m69157h();
        r1 = r1.estimatePrintedLength();
        r0.<init>(r1);
        r2.m69167a(r0, r3);	 Catch:{ IOException -> 0x0010 }
    L_0x0010:
        r3 = r0.toString();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.b.a(org.joda.time.ReadableInstant):java.lang.String");
    }

    /* renamed from: a */
    public java.lang.String m69161a(org.joda.time.ReadablePartial r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = new java.lang.StringBuilder;
        r1 = r2.m69157h();
        r1 = r1.estimatePrintedLength();
        r0.<init>(r1);
        r2.m69168a(r0, r3);	 Catch:{ IOException -> 0x0010 }
    L_0x0010:
        r3 = r0.toString();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.b.a(org.joda.time.ReadablePartial):java.lang.String");
    }

    /* renamed from: a */
    private void m69155a(Appendable appendable, long j, C19304a c19304a) throws IOException {
        long j2 = j;
        C19325k h = m69157h();
        C19304a b = m69156b(c19304a);
        DateTimeZone a = b.mo14710a();
        int b2 = a.b(j2);
        long j3 = (long) b2;
        long j4 = j2 + j3;
        if ((j2 ^ j4) < 0 && (j2 ^ j3) >= 0) {
            a = DateTimeZone.f8461a;
            b2 = 0;
            j4 = j2;
        }
        C19325k c19325k = h;
        Appendable appendable2 = appendable;
        long j5 = j4;
        c19325k.printTo(appendable2, j5, b.mo14712b(), b2, a, r0.f60187c);
    }

    /* renamed from: h */
    private C19325k m69157h() {
        C19325k c19325k = this.f60185a;
        if (c19325k != null) {
            return c19325k;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    /* renamed from: a */
    public long m69159a(String str) {
        return new C19319c(0, m69156b(this.f60189e), this.f60187c, this.f60191g, this.f60192h).m69196a(m69158i(), (CharSequence) str);
    }

    /* renamed from: b */
    public LocalDate m69170b(String str) {
        return m69172c(str).d();
    }

    /* renamed from: c */
    public LocalDateTime m69172c(String str) {
        C19324i i = m69158i();
        C19304a b = m69156b(null).mo14712b();
        C19319c c19319c = new C19319c(0, b, this.f60187c, this.f60191g, this.f60192h);
        int parseInto = i.parseInto(c19319c, str, 0);
        if (parseInto < 0) {
            parseInto ^= -1;
        } else if (parseInto >= str.length()) {
            long a = c19319c.m69198a(true, str);
            if (c19319c.m69208d() != null) {
                b = b.mo14711a(DateTimeZone.a(c19319c.m69208d().intValue()));
            } else if (c19319c.m69207c() != null) {
                b = b.mo14711a(c19319c.m69207c());
            }
            return new LocalDateTime(a, b);
        }
        throw new IllegalArgumentException(C19320f.m69213a(str, parseInto));
    }

    /* renamed from: d */
    public DateTime m69175d(String str) {
        C19324i i = m69158i();
        C19304a b = m69156b(null);
        C19319c c19319c = new C19319c(0, b, this.f60187c, this.f60191g, this.f60192h);
        int parseInto = i.parseInto(c19319c, str, 0);
        if (parseInto < 0) {
            parseInto ^= -1;
        } else if (parseInto >= str.length()) {
            long a = c19319c.m69198a(true, str);
            if (this.f60188d != null && c19319c.m69208d() != null) {
                b = b.mo14711a(DateTimeZone.a(c19319c.m69208d().intValue()));
            } else if (c19319c.m69207c() != null) {
                b = b.mo14711a(c19319c.m69207c());
            }
            str = new DateTime(a, b);
            return this.f60190f != null ? str.a(this.f60190f) : str;
        }
        throw new IllegalArgumentException(C19320f.m69213a(str, parseInto));
    }

    /* renamed from: i */
    private C19324i m69158i() {
        C19324i c19324i = this.f60186b;
        if (c19324i != null) {
            return c19324i;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    /* renamed from: b */
    private C19304a m69156b(C19304a c19304a) {
        c19304a = DateTimeUtils.m68910a(c19304a);
        if (this.f60189e != null) {
            c19304a = this.f60189e;
        }
        return this.f60190f != null ? c19304a.mo14711a(this.f60190f) : c19304a;
    }
}
