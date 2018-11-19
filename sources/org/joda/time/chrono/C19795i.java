package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C19640g;

/* renamed from: org.joda.time.chrono.i */
final class C19795i extends C19640g {
    /* renamed from: b */
    private final BasicChronology f61925b;

    /* renamed from: g */
    public int mo14553g() {
        return 1;
    }

    /* renamed from: h */
    public int mo14555h() {
        return 7;
    }

    C19795i(BasicChronology basicChronology, C19306c c19306c) {
        super(DateTimeFieldType.m68886l(), c19306c);
        this.f61925b = basicChronology;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f61925b.m71147g(j);
    }

    /* renamed from: a */
    public String mo14531a(int i, Locale locale) {
        return C19310k.m69046a(locale).m69063d(i);
    }

    /* renamed from: b */
    public String mo14540b(int i, Locale locale) {
        return C19310k.m69046a(locale).m69064e(i);
    }

    /* renamed from: a */
    protected int mo14805a(String str, Locale locale) {
        return C19310k.m69046a(locale).m69059c(str);
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return this.f61925b.mo14517w();
    }

    /* renamed from: a */
    public int mo14525a(Locale locale) {
        return C19310k.m69046a(locale).m69058c();
    }
}
