package org.joda.time.field;

import java.util.Locale;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePartial;

/* renamed from: org.joda.time.field.a */
public abstract class C19482a extends C19305b {
    /* renamed from: a */
    private final DateTimeFieldType f60829a;

    /* renamed from: a */
    public abstract int mo14524a(long j);

    /* renamed from: b */
    public abstract long mo14538b(long j, int i);

    /* renamed from: b */
    public boolean mo14543b(long j) {
        return false;
    }

    /* renamed from: c */
    public final boolean mo14546c() {
        return true;
    }

    /* renamed from: d */
    public abstract long mo14547d(long j);

    /* renamed from: d */
    public abstract C19306c mo14548d();

    /* renamed from: f */
    public C19306c mo14552f() {
        return null;
    }

    /* renamed from: g */
    public abstract int mo14553g();

    /* renamed from: h */
    public abstract int mo14555h();

    protected C19482a(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.f60829a = dateTimeFieldType;
    }

    /* renamed from: a */
    public final DateTimeFieldType mo14534a() {
        return this.f60829a;
    }

    /* renamed from: b */
    public final String mo14539b() {
        return this.f60829a.m68899x();
    }

    /* renamed from: a */
    public String mo14532a(long j, Locale locale) {
        return mo14531a(mo14524a(j), locale);
    }

    /* renamed from: a */
    public String m70279a(ReadablePartial readablePartial, int i, Locale locale) {
        return mo14531a(i, locale);
    }

    /* renamed from: a */
    public final String mo14533a(ReadablePartial readablePartial, Locale locale) {
        return m70279a(readablePartial, readablePartial.get(mo14534a()), locale);
    }

    /* renamed from: a */
    public String mo14531a(int i, Locale locale) {
        return Integer.toString(i);
    }

    /* renamed from: b */
    public String mo14541b(long j, Locale locale) {
        return mo14540b(mo14524a(j), locale);
    }

    /* renamed from: b */
    public String m70289b(ReadablePartial readablePartial, int i, Locale locale) {
        return mo14540b(i, locale);
    }

    /* renamed from: b */
    public final String mo14542b(ReadablePartial readablePartial, Locale locale) {
        return m70289b(readablePartial, readablePartial.get(mo14534a()), locale);
    }

    /* renamed from: b */
    public String mo14540b(int i, Locale locale) {
        return mo14531a(i, locale);
    }

    /* renamed from: a */
    public long mo14528a(long j, int i) {
        return mo14548d().mo14558a(j, i);
    }

    /* renamed from: a */
    public long mo14529a(long j, long j2) {
        return mo14548d().mo14559a(j, j2);
    }

    /* renamed from: b */
    public int mo14535b(long j, long j2) {
        return mo14548d().mo14523c(j, j2);
    }

    /* renamed from: c */
    public long mo14545c(long j, long j2) {
        return mo14548d().mo14562d(j, j2);
    }

    /* renamed from: a */
    public long mo14530a(long j, String str, Locale locale) {
        return mo14538b(j, mo14805a(str, locale));
    }

    /* renamed from: a */
    protected int mo14805a(java.lang.String r2, java.util.Locale r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r3 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0005 }
        return r3;
    L_0x0005:
        r3 = new org.joda.time.IllegalFieldValueException;
        r0 = r1.mo14534a();
        r3.<init>(r0, r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.field.a.a(java.lang.String, java.util.Locale):int");
    }

    /* renamed from: a */
    public int mo14526a(ReadablePartial readablePartial) {
        return mo14553g();
    }

    /* renamed from: a */
    public int mo14527a(ReadablePartial readablePartial, int[] iArr) {
        return mo14526a(readablePartial);
    }

    /* renamed from: c */
    public int mo14544c(long j) {
        return mo14555h();
    }

    /* renamed from: b */
    public int mo14536b(ReadablePartial readablePartial) {
        return mo14555h();
    }

    /* renamed from: b */
    public int mo14537b(ReadablePartial readablePartial, int[] iArr) {
        return mo14536b(readablePartial);
    }

    /* renamed from: a */
    public int mo14525a(Locale locale) {
        locale = mo14555h();
        if (locale >= null) {
            if (locale < 10) {
                return 1;
            }
            if (locale < 100) {
                return 2;
            }
            if (locale < 1000) {
                return 3;
            }
        }
        return Integer.toString(locale).length();
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        long d = mo14547d(j);
        return d != j ? mo14528a(d, (int) 1) : j;
    }

    /* renamed from: f */
    public long mo14551f(long j) {
        long d = mo14547d(j);
        long e = mo14549e(j);
        return j - d <= e - j ? d : e;
    }

    /* renamed from: g */
    public long mo14554g(long j) {
        long d = mo14547d(j);
        long e = mo14549e(j);
        return e - j <= j - d ? e : d;
    }

    /* renamed from: h */
    public long mo14556h(long j) {
        long d = mo14547d(j);
        long e = mo14549e(j);
        long j2 = j - d;
        long j3 = e - j;
        if (j2 < j3) {
            return d;
        }
        return (j3 >= j2 && (mo14524a(e) & 1) != null) ? d : e;
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return j - mo14547d(j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DateTimeField[");
        stringBuilder.append(mo14539b());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
