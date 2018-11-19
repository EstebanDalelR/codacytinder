package org.joda.time.chrono;

import com.google.android.exoplayer2.Format;
import java.util.Locale;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.C19314d;
import org.joda.time.field.C19482a;
import org.joda.time.field.UnsupportedDurationField;

/* renamed from: org.joda.time.chrono.j */
final class C19628j extends C19482a {
    /* renamed from: a */
    private final BasicChronology f61398a;

    /* renamed from: e */
    public C19306c mo14550e() {
        return null;
    }

    /* renamed from: g */
    public int mo14553g() {
        return 0;
    }

    /* renamed from: h */
    public int mo14555h() {
        return 1;
    }

    C19628j(BasicChronology basicChronology) {
        super(DateTimeFieldType.m68897w());
        this.f61398a = basicChronology;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f61398a.mo14876a(j) <= null ? 0 : 1;
    }

    /* renamed from: a */
    public String mo14531a(int i, Locale locale) {
        return C19310k.m69046a(locale).m69054a(i);
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, 0, 1);
        if (mo14524a(j) == i) {
            return j;
        }
        return this.f61398a.mo14868f(j, -this.f61398a.mo14876a(j));
    }

    /* renamed from: a */
    public long mo14530a(long j, String str, Locale locale) {
        return mo14538b(j, C19310k.m69046a(locale).m69053a(str));
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        return mo14524a(j) == 1 ? this.f61398a.mo14868f(0, 1) : Long.MIN_VALUE;
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        return mo14524a(j) == null ? this.f61398a.mo14868f(0, 1) : Format.OFFSET_SAMPLE_RELATIVE;
    }

    /* renamed from: f */
    public long mo14551f(long j) {
        return mo14547d(j);
    }

    /* renamed from: g */
    public long mo14554g(long j) {
        return mo14547d(j);
    }

    /* renamed from: h */
    public long mo14556h(long j) {
        return mo14547d(j);
    }

    /* renamed from: d */
    public C19306c mo14548d() {
        return UnsupportedDurationField.m70257a(DurationFieldType.m68929l());
    }

    /* renamed from: a */
    public int mo14525a(Locale locale) {
        return C19310k.m69046a(locale).m69052a();
    }
}
