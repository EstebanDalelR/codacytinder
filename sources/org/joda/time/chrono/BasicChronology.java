package org.joda.time.chrono;

import com.facebook.ads.AdError;
import com.tinder.api.ManagerWebServices;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology.C19307a;
import org.joda.time.field.C19314d;
import org.joda.time.field.C19798c;
import org.joda.time.field.C19799e;
import org.joda.time.field.C19800f;
import org.joda.time.field.C19801h;
import org.joda.time.field.C19802i;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;

abstract class BasicChronology extends AssembledChronology {
    /* renamed from: a */
    private static final C19306c f61875a = MillisDurationField.f60823a;
    /* renamed from: b */
    private static final C19306c f61876b = new PreciseDurationField(DurationFieldType.m68919b(), 1000);
    /* renamed from: c */
    private static final C19306c f61877c = new PreciseDurationField(DurationFieldType.m68920c(), 60000);
    /* renamed from: d */
    private static final C19306c f61878d = new PreciseDurationField(DurationFieldType.m68921d(), 3600000);
    /* renamed from: e */
    private static final C19306c f61879e = new PreciseDurationField(DurationFieldType.m68922e(), 43200000);
    /* renamed from: f */
    private static final C19306c f61880f = new PreciseDurationField(DurationFieldType.m68923f(), 86400000);
    /* renamed from: g */
    private static final C19306c f61881g = new PreciseDurationField(DurationFieldType.m68924g(), 604800000);
    /* renamed from: h */
    private static final C19305b f61882h = new C19800f(DateTimeFieldType.m68875a(), f61875a, f61876b);
    /* renamed from: i */
    private static final C19305b f61883i = new C19800f(DateTimeFieldType.m68876b(), f61875a, f61880f);
    /* renamed from: j */
    private static final C19305b f61884j = new C19800f(DateTimeFieldType.m68877c(), f61876b, f61877c);
    /* renamed from: k */
    private static final C19305b f61885k = new C19800f(DateTimeFieldType.m68878d(), f61876b, f61880f);
    /* renamed from: l */
    private static final C19305b f61886l = new C19800f(DateTimeFieldType.m68879e(), f61877c, f61878d);
    /* renamed from: m */
    private static final C19305b f61887m = new C19800f(DateTimeFieldType.m68880f(), f61877c, f61880f);
    /* renamed from: n */
    private static final C19305b f61888n = new C19800f(DateTimeFieldType.m68881g(), f61878d, f61880f);
    /* renamed from: o */
    private static final C19305b f61889o = new C19800f(DateTimeFieldType.m68883i(), f61878d, f61879e);
    /* renamed from: p */
    private static final C19305b f61890p = new C19802i(f61888n, DateTimeFieldType.m68882h());
    /* renamed from: q */
    private static final C19305b f61891q = new C19802i(f61889o, DateTimeFieldType.m68884j());
    /* renamed from: r */
    private static final C19305b f61892r = new C19864a();
    private static final long serialVersionUID = 8283225332206808863L;
    /* renamed from: s */
    private final transient C19308b[] f61893s = new C19308b[1024];
    /* renamed from: t */
    private final int f61894t;

    /* renamed from: org.joda.time.chrono.BasicChronology$b */
    private static class C19308b {
        /* renamed from: a */
        public final int f60145a;
        /* renamed from: b */
        public final long f60146b;

        C19308b(int i, long j) {
            this.f60145a = i;
            this.f60146b = j;
        }
    }

    /* renamed from: org.joda.time.chrono.BasicChronology$a */
    private static class C19864a extends C19800f {
        C19864a() {
            super(DateTimeFieldType.m68885k(), BasicChronology.f61879e, BasicChronology.f61880f);
        }

        /* renamed from: a */
        public String mo14531a(int i, Locale locale) {
            return C19310k.m69046a(locale).m69065f(i);
        }

        /* renamed from: a */
        public long mo14530a(long j, String str, Locale locale) {
            return mo14538b(j, C19310k.m69046a(locale).m69062d(str));
        }

        /* renamed from: a */
        public int mo14525a(Locale locale) {
            return C19310k.m69046a(locale).m69061d();
        }
    }

    /* renamed from: O */
    int mo14871O() {
        return 366;
    }

    /* renamed from: P */
    int mo14855P() {
        return 31;
    }

    /* renamed from: Q */
    abstract int mo14872Q();

    /* renamed from: R */
    abstract int mo14873R();

    /* renamed from: S */
    int mo14856S() {
        return 12;
    }

    /* renamed from: T */
    abstract long mo14857T();

    /* renamed from: U */
    abstract long mo14858U();

    /* renamed from: V */
    abstract long mo14859V();

    /* renamed from: W */
    abstract long mo14874W();

    /* renamed from: a */
    abstract int mo14860a(long j, int i);

    /* renamed from: a */
    abstract long mo14861a(long j, long j2);

    /* renamed from: b */
    abstract int mo14862b(int i, int i2);

    /* renamed from: c */
    abstract long mo14865c(int i, int i2);

    /* renamed from: e */
    abstract boolean mo14866e(int i);

    /* renamed from: f */
    abstract int mo14867f(int i);

    /* renamed from: f */
    abstract long mo14868f(long j, int i);

    /* renamed from: g */
    abstract long mo14878g(int i);

    /* renamed from: j */
    boolean mo14870j(long j) {
        return false;
    }

    BasicChronology(C19304a c19304a, Object obj, int i) {
        super(c19304a, obj);
        if (i >= 1) {
            if (i <= 7) {
                this.f61894t = i;
                return;
            }
        }
        obj = new StringBuilder();
        obj.append("Invalid min days in first week: ");
        obj.append(i);
        throw new IllegalArgumentException(obj.toString());
    }

    /* renamed from: a */
    public DateTimeZone mo14710a() {
        C19304a L = m70691L();
        if (L != null) {
            return L.mo14710a();
        }
        return DateTimeZone.f8461a;
    }

    /* renamed from: a */
    public long mo14487a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        C19304a L = m70691L();
        if (L != null) {
            return L.mo14487a(i, i2, i3, i4);
        }
        C19314d.m69090a(DateTimeFieldType.m68876b(), i4, 0, 86399999);
        return m71106b(i, i2, i3, i4);
    }

    /* renamed from: a */
    public long mo14488a(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        C19304a L = m70691L();
        if (L != null) {
            return L.mo14488a(i, i2, i3, i4, i5, i6, i7);
        }
        C19314d.m69090a(DateTimeFieldType.m68881g(), i4, 0, 23);
        C19314d.m69090a(DateTimeFieldType.m68879e(), i5, 0, 59);
        C19314d.m69090a(DateTimeFieldType.m68877c(), i6, 0, 59);
        C19314d.m69090a(DateTimeFieldType.m68875a(), i7, 0, 999);
        return m71106b(i, i2, i3, (int) ((long) ((((i4 * 3600000) + (i5 * ManagerWebServices.TIMEOUT_AUTH_MS)) + (i6 * AdError.NETWORK_ERROR_CODE)) + i7)));
    }

    /* renamed from: b */
    private long m71106b(int i, int i2, int i3, int i4) {
        long b = mo14881b(i, i2, i3);
        if (b == Long.MIN_VALUE) {
            b = mo14881b(i, i2, i3 + 1);
            i4 -= 86400000;
        }
        i3 = b + ((long) i4);
        if (i3 < 0 && b > 0) {
            return -1;
        }
        if (i3 <= 0 || b >= 0) {
            return i3;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: N */
    public int mo14801N() {
        return this.f61894t;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        if (mo14801N() != basicChronology.mo14801N() || mo14710a().equals(basicChronology.mo14710a()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((getClass().getName().hashCode() * 11) + mo14710a().hashCode()) + mo14801N();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        stringBuilder.append(name);
        stringBuilder.append('[');
        DateTimeZone a = mo14710a();
        if (a != null) {
            stringBuilder.append(a.e());
        }
        if (mo14801N() != 4) {
            stringBuilder.append(",mdfw=");
            stringBuilder.append(mo14801N());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        c19307a.f60119a = f61875a;
        c19307a.f60120b = f61876b;
        c19307a.f60121c = f61877c;
        c19307a.f60122d = f61878d;
        c19307a.f60123e = f61879e;
        c19307a.f60124f = f61880f;
        c19307a.f60125g = f61881g;
        c19307a.f60131m = f61882h;
        c19307a.f60132n = f61883i;
        c19307a.f60133o = f61884j;
        c19307a.f60134p = f61885k;
        c19307a.f60135q = f61886l;
        c19307a.f60136r = f61887m;
        c19307a.f60137s = f61888n;
        c19307a.f60139u = f61889o;
        c19307a.f60138t = f61890p;
        c19307a.f60140v = f61891q;
        c19307a.f60141w = f61892r;
        c19307a.f60114E = new C19794g(this);
        c19307a.f60115F = new C19796m(c19307a.f60114E, this);
        c19307a.f60117H = new C19798c(new C19799e(c19307a.f60115F, 99), DateTimeFieldType.m68896v(), 100);
        c19307a.f60129k = c19307a.f60117H.mo14548d();
        c19307a.f60116G = new C19799e(new C19801h((C19798c) c19307a.f60117H), DateTimeFieldType.m68895u(), 1);
        c19307a.f60118I = new C19628j(this);
        c19307a.f60142x = new C19795i(this, c19307a.f60124f);
        c19307a.f60143y = new C19789a(this, c19307a.f60124f);
        c19307a.f60144z = new C19790b(this, c19307a.f60124f);
        c19307a.f60113D = new C19865l(this);
        c19307a.f60111B = new C19793f(this);
        c19307a.f60110A = new C19792e(this, c19307a.f60125g);
        c19307a.f60112C = new C19799e(new C19801h(c19307a.f60111B, c19307a.f60129k, DateTimeFieldType.m68891q(), 100), DateTimeFieldType.m68891q(), 1);
        c19307a.f60128j = c19307a.f60114E.mo14548d();
        c19307a.f60127i = c19307a.f60113D.mo14548d();
        c19307a.f60126h = c19307a.f60111B.mo14548d();
    }

    /* renamed from: a */
    int mo14875a(int i) {
        return mo14866e(i) != 0 ? 366 : 365;
    }

    /* renamed from: b */
    int m71129b(int i) {
        return (int) ((m71136c(i + 1) - m71136c(i)) / 604800000);
    }

    /* renamed from: c */
    long m71136c(int i) {
        long d = m71140d(i);
        i = m71147g(d);
        return i > 8 - this.f61894t ? d + (((long) (8 - i)) * 86400000) : d - (((long) (i - 1)) * 86400000);
    }

    /* renamed from: d */
    long m71140d(int i) {
        return m71107i(i).f60146b;
    }

    /* renamed from: a */
    long m71122a(int i, int i2) {
        return m71140d(i) + mo14865c(i, i2);
    }

    /* renamed from: a */
    long m71123a(int i, int i2, int i3) {
        return (m71140d(i) + mo14865c(i, i2)) + (((long) (i3 - 1)) * 86400000);
    }

    /* renamed from: a */
    int mo14876a(long j) {
        long U = mo14858U();
        long W = (j >> 1) + mo14874W();
        if (W < 0) {
            W = (W - U) + 1;
        }
        int i = (int) (W / U);
        long d = m71140d(i);
        W = j - d;
        if (W < 0) {
            return i - 1;
        }
        long j2 = 31536000000L;
        if (W < 31536000000L) {
            return i;
        }
        if (mo14866e(i)) {
            j2 = 31622400000L;
        }
        return d + j2 <= j ? i + 1 : i;
    }

    /* renamed from: b */
    int mo14863b(long j) {
        return mo14860a(j, mo14876a(j));
    }

    /* renamed from: c */
    int mo14864c(long j) {
        int a = mo14876a(j);
        return m71121a(j, a, mo14860a(j, a));
    }

    /* renamed from: b */
    int m71132b(long j, int i) {
        return m71121a(j, i, mo14860a(j, i));
    }

    /* renamed from: a */
    int m71121a(long j, int i, int i2) {
        return ((int) ((j - (m71140d(i) + mo14865c(i, i2))) / 86400000)) + 1;
    }

    /* renamed from: d */
    int m71138d(long j) {
        return m71135c(j, mo14876a(j));
    }

    /* renamed from: c */
    int m71135c(long j, int i) {
        return ((int) ((j - m71140d(i)) / 86400000)) + 1;
    }

    /* renamed from: e */
    int m71141e(long j) {
        int a = mo14876a(j);
        int d = m71139d(j, a);
        if (d == 1) {
            return mo14876a(j + 604800000);
        }
        return d > 51 ? mo14876a(j - 1209600000) : a;
    }

    /* renamed from: f */
    int m71145f(long j) {
        return m71139d(j, mo14876a(j));
    }

    /* renamed from: d */
    int m71139d(long j, int i) {
        long c = m71136c(i);
        if (j < c) {
            return m71129b(i - 1);
        }
        if (j >= m71136c(i + 1)) {
            return 1;
        }
        return ((int) ((j - c) / 604800000)) + 1;
    }

    /* renamed from: g */
    int m71147g(long j) {
        if (j >= 0) {
            j /= 86400000;
        } else {
            j = (j - 86399999) / 86400000;
            if (j < -3) {
                return ((int) ((j + 4) % 7)) + 7;
            }
        }
        return ((int) ((j + 3) % 7)) + 1;
    }

    /* renamed from: h */
    int m71150h(long j) {
        if (j >= 0) {
            return (int) (j % 86400000);
        }
        return ((int) ((j + 1) % 86400000)) + 86399999;
    }

    /* renamed from: i */
    int m71151i(long j) {
        int a = mo14876a(j);
        return mo14862b(a, mo14860a(j, a));
    }

    /* renamed from: e */
    int mo14869e(long j, int i) {
        return m71151i(j);
    }

    /* renamed from: b */
    long mo14881b(int i, int i2, int i3) {
        C19314d.m69090a(DateTimeFieldType.m68893s(), i, mo14872Q() - 1, mo14873R() + 1);
        C19314d.m69090a(DateTimeFieldType.m68892r(), i2, 1, m71149h(i));
        C19314d.m69090a(DateTimeFieldType.m68887m(), i3, 1, mo14862b(i, i2));
        i2 = m71123a(i, i2, i3);
        if (i2 >= 0 || i != mo14873R() + 1) {
            return (i2 <= 0 || i != mo14872Q() - 1) ? i2 : 0;
        } else {
            return -1;
        }
    }

    /* renamed from: h */
    int m71149h(int i) {
        return mo14856S();
    }

    /* renamed from: i */
    private C19308b m71107i(int i) {
        int i2 = i & 1023;
        C19308b c19308b = this.f61893s[i2];
        if (c19308b != null && c19308b.f60145a == i) {
            return c19308b;
        }
        c19308b = new C19308b(i, mo14878g(i));
        this.f61893s[i2] = c19308b;
        return c19308b;
    }
}
