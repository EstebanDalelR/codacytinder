package org.joda.time.chrono;

import com.google.android.exoplayer2.Format;
import java.util.Locale;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.C19314d;
import org.joda.time.field.C19482a;
import org.joda.time.field.UnsupportedDurationField;

/* renamed from: org.joda.time.chrono.d */
final class C19627d extends C19482a {
    /* renamed from: a */
    private final String f61397a;

    /* renamed from: a */
    public int mo14524a(long j) {
        return 1;
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        return Long.MIN_VALUE;
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        return Format.OFFSET_SAMPLE_RELATIVE;
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return null;
    }

    /* renamed from: f */
    public long mo14551f(long j) {
        return Long.MIN_VALUE;
    }

    /* renamed from: g */
    public int mo14553g() {
        return 1;
    }

    /* renamed from: g */
    public long mo14554g(long j) {
        return Long.MIN_VALUE;
    }

    /* renamed from: h */
    public int mo14555h() {
        return 1;
    }

    /* renamed from: h */
    public long mo14556h(long j) {
        return Long.MIN_VALUE;
    }

    C19627d(String str) {
        super(DateTimeFieldType.m68897w());
        this.f61397a = str;
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, 1, 1);
        return j;
    }

    /* renamed from: a */
    public long mo14530a(long j, String str, Locale locale) {
        if (this.f61397a.equals(str) != null || "1".equals(str) != null) {
            return j;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m68897w(), str);
    }

    /* renamed from: d */
    public C19306c mo14548d() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68929l());
    }

    /* renamed from: a */
    public String mo14531a(int i, Locale locale) {
        return this.f61397a;
    }

    /* renamed from: a */
    public int mo14525a(Locale locale) {
        return this.f61397a.length();
    }
}
