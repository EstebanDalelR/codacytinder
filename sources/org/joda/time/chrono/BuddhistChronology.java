package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology.C19307a;
import org.joda.time.field.C19798c;
import org.joda.time.field.C19799e;
import org.joda.time.field.C19801h;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

public final class BuddhistChronology extends AssembledChronology {
    /* renamed from: a */
    private static final C19305b f61895a = new C19627d("BE");
    /* renamed from: b */
    private static final ConcurrentHashMap<DateTimeZone, BuddhistChronology> f61896b = new ConcurrentHashMap();
    /* renamed from: c */
    private static final BuddhistChronology f61897c = m71155b(DateTimeZone.f8461a);
    private static final long serialVersionUID = -3474595157769370126L;

    /* renamed from: N */
    public static BuddhistChronology m71153N() {
        return f61897c;
    }

    /* renamed from: O */
    public static BuddhistChronology m71154O() {
        return m71155b(DateTimeZone.a());
    }

    /* renamed from: b */
    public static BuddhistChronology m71155b(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        BuddhistChronology buddhistChronology = (BuddhistChronology) f61896b.get(dateTimeZone);
        if (buddhistChronology != null) {
            return buddhistChronology;
        }
        C19304a buddhistChronology2 = new BuddhistChronology(GJChronology.m71173a(dateTimeZone, null), null);
        BuddhistChronology buddhistChronology3 = new BuddhistChronology(LimitChronology.m71221a(buddhistChronology2, new DateTime(1, 1, 1, 0, 0, 0, 0, buddhistChronology2), null), "");
        buddhistChronology = (BuddhistChronology) f61896b.putIfAbsent(dateTimeZone, buddhistChronology3);
        return buddhistChronology != null ? buddhistChronology : buddhistChronology3;
    }

    private BuddhistChronology(C19304a c19304a, Object obj) {
        super(c19304a, obj);
    }

    private Object readResolve() {
        C19304a L = m70691L();
        return L == null ? m71153N() : m71155b(L.mo14710a());
    }

    /* renamed from: b */
    public C19304a mo14712b() {
        return f61897c;
    }

    /* renamed from: a */
    public C19304a mo14711a(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        if (dateTimeZone == mo14710a()) {
            return this;
        }
        return m71155b(dateTimeZone);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuddhistChronology)) {
            return null;
        }
        return mo14710a().equals(((BuddhistChronology) obj).mo14710a());
    }

    public int hashCode() {
        return ("Buddhist".hashCode() * 11) + mo14710a().hashCode();
    }

    public String toString() {
        String str = "BuddhistChronology";
        DateTimeZone a = mo14710a();
        if (a == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('[');
        stringBuilder.append(a.e());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        if (m70692M() == null) {
            c19307a.f60130l = UnsupportedDurationField.m70257a(DurationFieldType.m68929l());
            c19307a.f60114E = new C19799e(new SkipUndoDateTimeField(this, c19307a.f60114E), 543);
            C19305b c19305b = c19307a.f60115F;
            c19307a.f60115F = new DelegatedDateTimeField(c19307a.f60114E, c19307a.f60130l, DateTimeFieldType.m68894t());
            c19307a.f60111B = new C19799e(new SkipUndoDateTimeField(this, c19307a.f60111B), 543);
            c19307a.f60117H = new C19798c(new C19799e(c19307a.f60115F, 99), c19307a.f60130l, DateTimeFieldType.m68896v(), 100);
            c19307a.f60129k = c19307a.f60117H.mo14548d();
            c19307a.f60116G = new C19799e(new C19801h((C19798c) c19307a.f60117H), DateTimeFieldType.m68895u(), 1);
            c19307a.f60112C = new C19799e(new C19801h(c19307a.f60111B, c19307a.f60129k, DateTimeFieldType.m68891q(), 100), DateTimeFieldType.m68891q(), 1);
            c19307a.f60118I = f61895a;
        }
    }
}
