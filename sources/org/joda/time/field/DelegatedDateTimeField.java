package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePartial;

public class DelegatedDateTimeField extends C19305b implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    /* renamed from: a */
    private final C19305b f60820a;
    /* renamed from: b */
    private final C19306c f60821b;
    /* renamed from: c */
    private final DateTimeFieldType f60822c;

    public DelegatedDateTimeField(C19305b c19305b) {
        this(c19305b, null);
    }

    public DelegatedDateTimeField(C19305b c19305b, DateTimeFieldType dateTimeFieldType) {
        this(c19305b, null, dateTimeFieldType);
    }

    public DelegatedDateTimeField(C19305b c19305b, C19306c c19306c, DateTimeFieldType dateTimeFieldType) {
        if (c19305b == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        this.f60820a = c19305b;
        this.f60821b = c19306c;
        if (dateTimeFieldType == null) {
            dateTimeFieldType = c19305b.mo14534a();
        }
        this.f60822c = dateTimeFieldType;
    }

    /* renamed from: a */
    public DateTimeFieldType mo14534a() {
        return this.f60822c;
    }

    /* renamed from: b */
    public String mo14539b() {
        return this.f60822c.m68899x();
    }

    /* renamed from: c */
    public boolean mo14546c() {
        return this.f60820a.mo14546c();
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f60820a.mo14524a(j);
    }

    /* renamed from: a */
    public String mo14532a(long j, Locale locale) {
        return this.f60820a.mo14532a(j, locale);
    }

    /* renamed from: a */
    public String mo14533a(ReadablePartial readablePartial, Locale locale) {
        return this.f60820a.mo14533a(readablePartial, locale);
    }

    /* renamed from: a */
    public String mo14531a(int i, Locale locale) {
        return this.f60820a.mo14531a(i, locale);
    }

    /* renamed from: b */
    public String mo14541b(long j, Locale locale) {
        return this.f60820a.mo14541b(j, locale);
    }

    /* renamed from: b */
    public String mo14542b(ReadablePartial readablePartial, Locale locale) {
        return this.f60820a.mo14542b(readablePartial, locale);
    }

    /* renamed from: b */
    public String mo14540b(int i, Locale locale) {
        return this.f60820a.mo14540b(i, locale);
    }

    /* renamed from: a */
    public long mo14528a(long j, int i) {
        return this.f60820a.mo14528a(j, i);
    }

    /* renamed from: a */
    public long mo14529a(long j, long j2) {
        return this.f60820a.mo14529a(j, j2);
    }

    /* renamed from: b */
    public int mo14535b(long j, long j2) {
        return this.f60820a.mo14535b(j, j2);
    }

    /* renamed from: c */
    public long mo14545c(long j, long j2) {
        return this.f60820a.mo14545c(j, j2);
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        return this.f60820a.mo14538b(j, i);
    }

    /* renamed from: a */
    public long mo14530a(long j, String str, Locale locale) {
        return this.f60820a.mo14530a(j, str, locale);
    }

    /* renamed from: d */
    public C19306c mo14548d() {
        return this.f60820a.mo14548d();
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        if (this.f60821b != null) {
            return this.f60821b;
        }
        return this.f60820a.mo14550e();
    }

    /* renamed from: b */
    public boolean mo14543b(long j) {
        return this.f60820a.mo14543b(j);
    }

    /* renamed from: f */
    public C19306c mo14552f() {
        return this.f60820a.mo14552f();
    }

    /* renamed from: g */
    public int mo14553g() {
        return this.f60820a.mo14553g();
    }

    /* renamed from: a */
    public int mo14526a(ReadablePartial readablePartial) {
        return this.f60820a.mo14526a(readablePartial);
    }

    /* renamed from: a */
    public int mo14527a(ReadablePartial readablePartial, int[] iArr) {
        return this.f60820a.mo14527a(readablePartial, iArr);
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f60820a.mo14555h();
    }

    /* renamed from: c */
    public int mo14544c(long j) {
        return this.f60820a.mo14544c(j);
    }

    /* renamed from: b */
    public int mo14536b(ReadablePartial readablePartial) {
        return this.f60820a.mo14536b(readablePartial);
    }

    /* renamed from: b */
    public int mo14537b(ReadablePartial readablePartial, int[] iArr) {
        return this.f60820a.mo14537b(readablePartial, iArr);
    }

    /* renamed from: a */
    public int mo14525a(Locale locale) {
        return this.f60820a.mo14525a(locale);
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        return this.f60820a.mo14547d(j);
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        return this.f60820a.mo14549e(j);
    }

    /* renamed from: f */
    public long mo14551f(long j) {
        return this.f60820a.mo14551f(j);
    }

    /* renamed from: g */
    public long mo14554g(long j) {
        return this.f60820a.mo14554g(j);
    }

    /* renamed from: h */
    public long mo14556h(long j) {
        return this.f60820a.mo14556h(j);
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return this.f60820a.mo14557i(j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DateTimeField[");
        stringBuilder.append(mo14539b());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
