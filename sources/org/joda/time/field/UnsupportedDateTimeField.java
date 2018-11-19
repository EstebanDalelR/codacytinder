package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePartial;

public final class UnsupportedDateTimeField extends C19305b implements Serializable {
    /* renamed from: a */
    private static HashMap<DateTimeFieldType, UnsupportedDateTimeField> f60824a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    /* renamed from: b */
    private final DateTimeFieldType f60825b;
    /* renamed from: c */
    private final C19306c f60826c;

    /* renamed from: c */
    public boolean mo14546c() {
        return false;
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return null;
    }

    /* renamed from: f */
    public C19306c mo14552f() {
        return null;
    }

    public String toString() {
        return "UnsupportedDateTimeField";
    }

    /* renamed from: a */
    public static synchronized UnsupportedDateTimeField m70221a(DateTimeFieldType dateTimeFieldType, C19306c c19306c) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        synchronized (UnsupportedDateTimeField.class) {
            unsupportedDateTimeField = null;
            if (f60824a == null) {
                f60824a = new HashMap(7);
            } else {
                UnsupportedDateTimeField unsupportedDateTimeField2 = (UnsupportedDateTimeField) f60824a.get(dateTimeFieldType);
                if (unsupportedDateTimeField2 == null || unsupportedDateTimeField2.mo14548d() == c19306c) {
                    unsupportedDateTimeField = unsupportedDateTimeField2;
                }
            }
            if (unsupportedDateTimeField == null) {
                unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, c19306c);
                f60824a.put(dateTimeFieldType, unsupportedDateTimeField);
            }
        }
        return unsupportedDateTimeField;
    }

    private UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, C19306c c19306c) {
        if (dateTimeFieldType != null) {
            if (c19306c != null) {
                this.f60825b = dateTimeFieldType;
                this.f60826c = c19306c;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public DateTimeFieldType mo14534a() {
        return this.f60825b;
    }

    /* renamed from: b */
    public String mo14539b() {
        return this.f60825b.m68899x();
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        throw m70222i();
    }

    /* renamed from: a */
    public String mo14532a(long j, Locale locale) {
        throw m70222i();
    }

    /* renamed from: a */
    public String mo14533a(ReadablePartial readablePartial, Locale locale) {
        throw m70222i();
    }

    /* renamed from: a */
    public String mo14531a(int i, Locale locale) {
        throw m70222i();
    }

    /* renamed from: b */
    public String mo14541b(long j, Locale locale) {
        throw m70222i();
    }

    /* renamed from: b */
    public String mo14542b(ReadablePartial readablePartial, Locale locale) {
        throw m70222i();
    }

    /* renamed from: b */
    public String mo14540b(int i, Locale locale) {
        throw m70222i();
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

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        throw m70222i();
    }

    /* renamed from: a */
    public long mo14530a(long j, String str, Locale locale) {
        throw m70222i();
    }

    /* renamed from: d */
    public C19306c mo14548d() {
        return this.f60826c;
    }

    /* renamed from: b */
    public boolean mo14543b(long j) {
        throw m70222i();
    }

    /* renamed from: g */
    public int mo14553g() {
        throw m70222i();
    }

    /* renamed from: a */
    public int mo14526a(ReadablePartial readablePartial) {
        throw m70222i();
    }

    /* renamed from: a */
    public int mo14527a(ReadablePartial readablePartial, int[] iArr) {
        throw m70222i();
    }

    /* renamed from: h */
    public int mo14555h() {
        throw m70222i();
    }

    /* renamed from: c */
    public int mo14544c(long j) {
        throw m70222i();
    }

    /* renamed from: b */
    public int mo14536b(ReadablePartial readablePartial) {
        throw m70222i();
    }

    /* renamed from: b */
    public int mo14537b(ReadablePartial readablePartial, int[] iArr) {
        throw m70222i();
    }

    /* renamed from: a */
    public int mo14525a(Locale locale) {
        throw m70222i();
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        throw m70222i();
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        throw m70222i();
    }

    /* renamed from: f */
    public long mo14551f(long j) {
        throw m70222i();
    }

    /* renamed from: g */
    public long mo14554g(long j) {
        throw m70222i();
    }

    /* renamed from: h */
    public long mo14556h(long j) {
        throw m70222i();
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        throw m70222i();
    }

    private Object readResolve() {
        return m70221a(this.f60825b, this.f60826c);
    }

    /* renamed from: i */
    private UnsupportedOperationException m70222i() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f60825b);
        stringBuilder.append(" field is unsupported");
        return new UnsupportedOperationException(stringBuilder.toString());
    }
}
