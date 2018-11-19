package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.AssembledChronology.C19307a;
import org.joda.time.field.C19314d;
import org.joda.time.field.C19639b;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.C19316b;
import org.joda.time.format.C19322g;

public final class LimitChronology extends AssembledChronology {
    private static final long serialVersionUID = 7670866536893052522L;
    /* renamed from: a */
    final DateTime f61914a;
    /* renamed from: b */
    final DateTime f61915b;
    /* renamed from: c */
    private transient LimitChronology f61916c;

    private class LimitException extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;
        /* renamed from: a */
        final /* synthetic */ LimitChronology f60150a;
        /* renamed from: b */
        private final boolean f60151b;

        LimitException(LimitChronology limitChronology, String str, boolean z) {
            this.f60150a = limitChronology;
            super(str);
            this.f60151b = z;
        }

        public String getMessage() {
            StringBuffer stringBuffer = new StringBuffer(85);
            stringBuffer.append("The");
            String message = super.getMessage();
            if (message != null) {
                stringBuffer.append(' ');
                stringBuffer.append(message);
            }
            stringBuffer.append(" instant is ");
            C19316b a = C19322g.m69278e().m69164a(this.f60150a.m70691L());
            if (this.f60151b) {
                stringBuffer.append("below the supported minimum of ");
                a.m69169a(stringBuffer, this.f60150a.mo14801N().getMillis());
            } else {
                stringBuffer.append("above the supported maximum of ");
                a.m69169a(stringBuffer, this.f60150a.m71223O().getMillis());
            }
            stringBuffer.append(" (");
            stringBuffer.append(this.f60150a.m70691L());
            stringBuffer.append(')');
            return stringBuffer.toString();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IllegalArgumentException: ");
            stringBuilder.append(getMessage());
            return stringBuilder.toString();
        }
    }

    private class LimitDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 8049297699408782284L;
        /* renamed from: a */
        final /* synthetic */ LimitChronology f61909a;

        LimitDurationField(LimitChronology limitChronology, C19306c c19306c) {
            this.f61909a = limitChronology;
            super(c19306c, c19306c.mo14521a());
        }

        /* renamed from: a */
        public long mo14558a(long j, int i) {
            this.f61909a.m71228a(j, null);
            j = m70817f().mo14558a(j, i);
            this.f61909a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: a */
        public long mo14559a(long j, long j2) {
            this.f61909a.m71228a(j, null);
            j = m70817f().mo14559a(j, j2);
            this.f61909a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: c */
        public int mo14523c(long j, long j2) {
            this.f61909a.m71228a(j, "minuend");
            this.f61909a.m71228a(j2, "subtrahend");
            return m70817f().mo14523c(j, j2);
        }

        /* renamed from: d */
        public long mo14562d(long j, long j2) {
            this.f61909a.m71228a(j, "minuend");
            this.f61909a.m71228a(j2, "subtrahend");
            return m70817f().mo14562d(j, j2);
        }
    }

    /* renamed from: org.joda.time.chrono.LimitChronology$a */
    private class C19788a extends C19639b {
        /* renamed from: a */
        final /* synthetic */ LimitChronology f61910a;
        /* renamed from: b */
        private final C19306c f61911b;
        /* renamed from: c */
        private final C19306c f61912c;
        /* renamed from: d */
        private final C19306c f61913d;

        C19788a(LimitChronology limitChronology, C19305b c19305b, C19306c c19306c, C19306c c19306c2, C19306c c19306c3) {
            this.f61910a = limitChronology;
            super(c19305b, c19305b.mo14534a());
            this.f61911b = c19306c;
            this.f61912c = c19306c2;
            this.f61913d = c19306c3;
        }

        /* renamed from: a */
        public int mo14524a(long j) {
            this.f61910a.m71228a(j, null);
            return m70847i().mo14524a(j);
        }

        /* renamed from: a */
        public String mo14532a(long j, Locale locale) {
            this.f61910a.m71228a(j, null);
            return m70847i().mo14532a(j, locale);
        }

        /* renamed from: b */
        public String mo14541b(long j, Locale locale) {
            this.f61910a.m71228a(j, null);
            return m70847i().mo14541b(j, locale);
        }

        /* renamed from: a */
        public long mo14528a(long j, int i) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14528a(j, i);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: a */
        public long mo14529a(long j, long j2) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14529a(j, j2);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: b */
        public int mo14535b(long j, long j2) {
            this.f61910a.m71228a(j, "minuend");
            this.f61910a.m71228a(j2, "subtrahend");
            return m70847i().mo14535b(j, j2);
        }

        /* renamed from: c */
        public long mo14545c(long j, long j2) {
            this.f61910a.m71228a(j, "minuend");
            this.f61910a.m71228a(j2, "subtrahend");
            return m70847i().mo14545c(j, j2);
        }

        /* renamed from: b */
        public long mo14538b(long j, int i) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14538b(j, i);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: a */
        public long mo14530a(long j, String str, Locale locale) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14530a(j, str, locale);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: d */
        public final C19306c mo14548d() {
            return this.f61911b;
        }

        /* renamed from: e */
        public final C19306c mo14550e() {
            return this.f61912c;
        }

        /* renamed from: b */
        public boolean mo14543b(long j) {
            this.f61910a.m71228a(j, null);
            return m70847i().mo14543b(j);
        }

        /* renamed from: f */
        public final C19306c mo14552f() {
            return this.f61913d;
        }

        /* renamed from: d */
        public long mo14547d(long j) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14547d(j);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: e */
        public long mo14549e(long j) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14549e(j);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: f */
        public long mo14551f(long j) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14551f(j);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: g */
        public long mo14554g(long j) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14554g(j);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: h */
        public long mo14556h(long j) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14556h(j);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: i */
        public long mo14557i(long j) {
            this.f61910a.m71228a(j, null);
            j = m70847i().mo14557i(j);
            this.f61910a.m71228a(j, "resulting");
            return j;
        }

        /* renamed from: c */
        public int mo14544c(long j) {
            this.f61910a.m71228a(j, null);
            return m70847i().mo14544c(j);
        }

        /* renamed from: a */
        public int mo14525a(Locale locale) {
            return m70847i().mo14525a(locale);
        }
    }

    /* renamed from: a */
    public static LimitChronology m71221a(C19304a c19304a, ReadableDateTime readableDateTime, ReadableDateTime readableDateTime2) {
        if (c19304a == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        ReadableInstant readableInstant = null;
        if (readableDateTime == null) {
            readableDateTime = null;
        } else {
            readableDateTime = readableDateTime.toDateTime();
        }
        if (readableDateTime2 != null) {
            readableInstant = readableDateTime2.toDateTime();
        }
        if (readableDateTime == null || readableInstant == null || readableDateTime.isBefore(readableInstant) != null) {
            return new LimitChronology(c19304a, (DateTime) readableDateTime, (DateTime) readableInstant);
        }
        throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
    }

    private LimitChronology(C19304a c19304a, DateTime dateTime, DateTime dateTime2) {
        super(c19304a, null);
        this.f61914a = dateTime;
        this.f61915b = dateTime2;
    }

    /* renamed from: N */
    public DateTime mo14801N() {
        return this.f61914a;
    }

    /* renamed from: O */
    public DateTime m71223O() {
        return this.f61915b;
    }

    /* renamed from: b */
    public C19304a mo14712b() {
        return mo14711a(DateTimeZone.f8461a);
    }

    /* renamed from: a */
    public C19304a mo14711a(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        if (dateTimeZone == mo14710a()) {
            return this;
        }
        if (dateTimeZone == DateTimeZone.f8461a && this.f61916c != null) {
            return this.f61916c;
        }
        ReadableDateTime readableDateTime = this.f61914a;
        if (readableDateTime != null) {
            MutableDateTime toMutableDateTime = readableDateTime.toMutableDateTime();
            toMutableDateTime.setZoneRetainFields(dateTimeZone);
            readableDateTime = toMutableDateTime.toDateTime();
        }
        ReadableDateTime readableDateTime2 = this.f61915b;
        if (readableDateTime2 != null) {
            MutableDateTime toMutableDateTime2 = readableDateTime2.toMutableDateTime();
            toMutableDateTime2.setZoneRetainFields(dateTimeZone);
            readableDateTime2 = toMutableDateTime2.toDateTime();
        }
        C19304a a = m71221a(m70691L().mo14711a(dateTimeZone), readableDateTime, readableDateTime2);
        if (dateTimeZone == DateTimeZone.f8461a) {
            this.f61916c = a;
        }
        return a;
    }

    /* renamed from: a */
    public long mo14487a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        long a = m70691L().mo14487a(i, i2, i3, i4);
        m71228a(a, "resulting");
        return a;
    }

    /* renamed from: a */
    public long mo14488a(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        long a = m70691L().mo14488a(i, i2, i3, i4, i5, i6, i7);
        m71228a(a, "resulting");
        return a;
    }

    /* renamed from: a */
    public long mo14489a(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        m71228a(j, null);
        j = m70691L().mo14489a(j, i, i2, i3, i4);
        m71228a(j, "resulting");
        return j;
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        HashMap hashMap = new HashMap();
        c19307a.f60130l = m71220a(c19307a.f60130l, hashMap);
        c19307a.f60129k = m71220a(c19307a.f60129k, hashMap);
        c19307a.f60128j = m71220a(c19307a.f60128j, hashMap);
        c19307a.f60127i = m71220a(c19307a.f60127i, hashMap);
        c19307a.f60126h = m71220a(c19307a.f60126h, hashMap);
        c19307a.f60125g = m71220a(c19307a.f60125g, hashMap);
        c19307a.f60124f = m71220a(c19307a.f60124f, hashMap);
        c19307a.f60123e = m71220a(c19307a.f60123e, hashMap);
        c19307a.f60122d = m71220a(c19307a.f60122d, hashMap);
        c19307a.f60121c = m71220a(c19307a.f60121c, hashMap);
        c19307a.f60120b = m71220a(c19307a.f60120b, hashMap);
        c19307a.f60119a = m71220a(c19307a.f60119a, hashMap);
        c19307a.f60114E = m71219a(c19307a.f60114E, hashMap);
        c19307a.f60115F = m71219a(c19307a.f60115F, hashMap);
        c19307a.f60116G = m71219a(c19307a.f60116G, hashMap);
        c19307a.f60117H = m71219a(c19307a.f60117H, hashMap);
        c19307a.f60118I = m71219a(c19307a.f60118I, hashMap);
        c19307a.f60142x = m71219a(c19307a.f60142x, hashMap);
        c19307a.f60143y = m71219a(c19307a.f60143y, hashMap);
        c19307a.f60144z = m71219a(c19307a.f60144z, hashMap);
        c19307a.f60113D = m71219a(c19307a.f60113D, hashMap);
        c19307a.f60110A = m71219a(c19307a.f60110A, hashMap);
        c19307a.f60111B = m71219a(c19307a.f60111B, hashMap);
        c19307a.f60112C = m71219a(c19307a.f60112C, hashMap);
        c19307a.f60131m = m71219a(c19307a.f60131m, hashMap);
        c19307a.f60132n = m71219a(c19307a.f60132n, hashMap);
        c19307a.f60133o = m71219a(c19307a.f60133o, hashMap);
        c19307a.f60134p = m71219a(c19307a.f60134p, hashMap);
        c19307a.f60135q = m71219a(c19307a.f60135q, hashMap);
        c19307a.f60136r = m71219a(c19307a.f60136r, hashMap);
        c19307a.f60137s = m71219a(c19307a.f60137s, hashMap);
        c19307a.f60139u = m71219a(c19307a.f60139u, hashMap);
        c19307a.f60138t = m71219a(c19307a.f60138t, hashMap);
        c19307a.f60140v = m71219a(c19307a.f60140v, hashMap);
        c19307a.f60141w = m71219a(c19307a.f60141w, hashMap);
    }

    /* renamed from: a */
    private C19306c m71220a(C19306c c19306c, HashMap<Object, Object> hashMap) {
        if (c19306c != null) {
            if (c19306c.mo14522b()) {
                if (hashMap.containsKey(c19306c)) {
                    return (C19306c) hashMap.get(c19306c);
                }
                C19306c limitDurationField = new LimitDurationField(this, c19306c);
                hashMap.put(c19306c, limitDurationField);
                return limitDurationField;
            }
        }
        return c19306c;
    }

    /* renamed from: a */
    private C19305b m71219a(C19305b c19305b, HashMap<Object, Object> hashMap) {
        if (c19305b != null) {
            if (c19305b.mo14546c()) {
                if (hashMap.containsKey(c19305b)) {
                    return (C19305b) hashMap.get(c19305b);
                }
                C19305b c19788a = new C19788a(this, c19305b, m71220a(c19305b.mo14548d(), (HashMap) hashMap), m71220a(c19305b.mo14550e(), (HashMap) hashMap), m71220a(c19305b.mo14552f(), (HashMap) hashMap));
                hashMap.put(c19305b, c19788a);
                return c19788a;
            }
        }
        return c19305b;
    }

    /* renamed from: a */
    void m71228a(long j, String str) {
        DateTime dateTime = this.f61914a;
        if (dateTime == null || j >= dateTime.getMillis()) {
            dateTime = this.f61915b;
            if (dateTime != null && j >= dateTime.getMillis()) {
                throw new LimitException(this, str, false);
            }
            return;
        }
        throw new LimitException(this, str, true);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitChronology)) {
            return false;
        }
        LimitChronology limitChronology = (LimitChronology) obj;
        if (!m70691L().equals(limitChronology.m70691L()) || !C19314d.m69092a(mo14801N(), limitChronology.mo14801N()) || C19314d.m69092a(m71223O(), limitChronology.m71223O()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (mo14801N() != null ? mo14801N().hashCode() : 0) + 317351877;
        if (m71223O() != null) {
            i = m71223O().hashCode();
        }
        return (hashCode + i) + (m70691L().hashCode() * 7);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LimitChronology[");
        stringBuilder.append(m70691L().toString());
        stringBuilder.append(", ");
        stringBuilder.append(mo14801N() == null ? "NoLimit" : mo14801N().toString());
        stringBuilder.append(", ");
        stringBuilder.append(m71223O() == null ? "NoLimit" : m71223O().toString());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
