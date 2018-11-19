package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalInstantException;

/* renamed from: org.joda.time.format.c */
public class C19319c {
    /* renamed from: a */
    private final C19304a f60202a;
    /* renamed from: b */
    private final long f60203b;
    /* renamed from: c */
    private final Locale f60204c;
    /* renamed from: d */
    private final int f60205d;
    /* renamed from: e */
    private final DateTimeZone f60206e;
    /* renamed from: f */
    private final Integer f60207f;
    /* renamed from: g */
    private DateTimeZone f60208g;
    /* renamed from: h */
    private Integer f60209h;
    /* renamed from: i */
    private Integer f60210i;
    /* renamed from: j */
    private C19317a[] f60211j;
    /* renamed from: k */
    private int f60212k;
    /* renamed from: l */
    private boolean f60213l;
    /* renamed from: m */
    private Object f60214m;

    /* renamed from: org.joda.time.format.c$a */
    static class C19317a implements Comparable<C19317a> {
        /* renamed from: a */
        C19305b f60193a;
        /* renamed from: b */
        int f60194b;
        /* renamed from: c */
        String f60195c;
        /* renamed from: d */
        Locale f60196d;

        public /* synthetic */ int compareTo(Object obj) {
            return m69179a((C19317a) obj);
        }

        C19317a() {
        }

        /* renamed from: a */
        void m69181a(C19305b c19305b, int i) {
            this.f60193a = c19305b;
            this.f60194b = i;
            this.f60195c = null;
            this.f60196d = null;
        }

        /* renamed from: a */
        void m69182a(C19305b c19305b, String str, Locale locale) {
            this.f60193a = c19305b;
            this.f60194b = null;
            this.f60195c = str;
            this.f60196d = locale;
        }

        /* renamed from: a */
        long m69180a(long j, boolean z) {
            if (this.f60195c == null) {
                j = this.f60193a.mo14804c(j, this.f60194b);
            } else {
                j = this.f60193a.mo14530a(j, this.f60195c, this.f60196d);
            }
            return z ? this.f60193a.mo14547d(j) : j;
        }

        /* renamed from: a */
        public int m69179a(C19317a c19317a) {
            c19317a = c19317a.f60193a;
            int a = C19319c.m69184a(this.f60193a.mo14550e(), c19317a.mo14550e());
            if (a != 0) {
                return a;
            }
            return C19319c.m69184a(this.f60193a.mo14548d(), c19317a.mo14548d());
        }
    }

    /* renamed from: org.joda.time.format.c$b */
    class C19318b {
        /* renamed from: a */
        final DateTimeZone f60197a;
        /* renamed from: b */
        final Integer f60198b;
        /* renamed from: c */
        final C19317a[] f60199c;
        /* renamed from: d */
        final int f60200d;
        /* renamed from: e */
        final /* synthetic */ C19319c f60201e;

        C19318b(C19319c c19319c) {
            this.f60201e = c19319c;
            this.f60197a = c19319c.f60208g;
            this.f60198b = c19319c.f60209h;
            this.f60199c = c19319c.f60211j;
            this.f60200d = c19319c.f60212k;
        }

        /* renamed from: a */
        boolean m69183a(C19319c c19319c) {
            if (c19319c != this.f60201e) {
                return null;
            }
            c19319c.f60208g = this.f60197a;
            c19319c.f60209h = this.f60198b;
            c19319c.f60211j = this.f60199c;
            if (this.f60200d < c19319c.f60212k) {
                c19319c.f60213l = true;
            }
            c19319c.f60212k = this.f60200d;
            return true;
        }
    }

    public C19319c(long j, C19304a c19304a, Locale locale, Integer num, int i) {
        c19304a = DateTimeUtils.m68910a(c19304a);
        this.f60203b = j;
        this.f60206e = c19304a.mo14710a();
        this.f60202a = c19304a.mo14712b();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        this.f60204c = locale;
        this.f60205d = i;
        this.f60207f = num;
        this.f60208g = this.f60206e;
        this.f60210i = this.f60207f;
        this.f60211j = new C19317a[8];
    }

    /* renamed from: a */
    long m69196a(C19324i c19324i, CharSequence charSequence) {
        int parseInto = c19324i.parseInto(this, charSequence, 0);
        if (parseInto < null) {
            parseInto ^= -1;
        } else if (parseInto >= charSequence.length()) {
            return m69197a(true, charSequence);
        }
        throw new IllegalArgumentException(C19320f.m69213a(charSequence.toString(), parseInto));
    }

    /* renamed from: a */
    public C19304a m69199a() {
        return this.f60202a;
    }

    /* renamed from: b */
    public Locale m69206b() {
        return this.f60204c;
    }

    /* renamed from: c */
    public DateTimeZone m69207c() {
        return this.f60208g;
    }

    /* renamed from: a */
    public void m69203a(DateTimeZone dateTimeZone) {
        this.f60214m = null;
        this.f60208g = dateTimeZone;
    }

    /* renamed from: d */
    public Integer m69208d() {
        return this.f60209h;
    }

    /* renamed from: a */
    public void m69200a(Integer num) {
        this.f60214m = null;
        this.f60209h = num;
    }

    /* renamed from: e */
    public Integer m69209e() {
        return this.f60210i;
    }

    /* renamed from: a */
    public void m69204a(C19305b c19305b, int i) {
        m69195g().m69181a(c19305b, i);
    }

    /* renamed from: a */
    public void m69201a(DateTimeFieldType dateTimeFieldType, int i) {
        m69195g().m69181a(dateTimeFieldType.mo14453a(this.f60202a), i);
    }

    /* renamed from: a */
    public void m69202a(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        m69195g().m69182a(dateTimeFieldType.mo14453a(this.f60202a), str, locale);
    }

    /* renamed from: g */
    private C19317a m69195g() {
        Object obj = this.f60211j;
        int i = this.f60212k;
        if (i == obj.length || this.f60213l) {
            Object obj2 = new C19317a[(i == obj.length ? i * 2 : obj.length)];
            System.arraycopy(obj, 0, obj2, 0, i);
            this.f60211j = obj2;
            this.f60213l = false;
            obj = obj2;
        }
        this.f60214m = null;
        C19317a c19317a = obj[i];
        if (c19317a == null) {
            c19317a = new C19317a();
            obj[i] = c19317a;
        }
        this.f60212k = i + 1;
        return c19317a;
    }

    /* renamed from: f */
    public Object m69210f() {
        if (this.f60214m == null) {
            this.f60214m = new C19318b(this);
        }
        return this.f60214m;
    }

    /* renamed from: a */
    public boolean m69205a(Object obj) {
        if (!(obj instanceof C19318b) || !((C19318b) obj).m69183a(this)) {
            return null;
        }
        this.f60214m = obj;
        return true;
    }

    /* renamed from: a */
    public long m69198a(boolean z, String str) {
        return m69197a(z, (CharSequence) str);
    }

    /* renamed from: a */
    public long m69197a(boolean z, CharSequence charSequence) {
        long intValue;
        C19317a[] c19317aArr = this.f60211j;
        boolean z2 = this.f60212k;
        if (this.f60213l) {
            c19317aArr = (C19317a[]) this.f60211j.clone();
            this.f60211j = c19317aArr;
            this.f60213l = false;
        }
        C19319c.m69189a(c19317aArr, (int) z2);
        if (z2 > 0) {
            C19306c a = DurationFieldType.m68926i().mo14457a(this.f60202a);
            C19306c a2 = DurationFieldType.m68923f().mo14457a(this.f60202a);
            C19306c d = c19317aArr[0].f60193a.mo14548d();
            if (C19319c.m69184a(d, a) >= 0 && C19319c.m69184a(d, a2) <= 0) {
                m69201a(DateTimeFieldType.m68893s(), this.f60205d);
                return m69197a(z, charSequence);
            }
        }
        long j = this.f60203b;
        int i = 0;
        while (i < z2) {
            try {
                j = c19317aArr[i].m69180a(j, z);
                i++;
            } catch (boolean z3) {
                if (charSequence != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot parse \"");
                    stringBuilder.append(charSequence);
                    stringBuilder.append('\"');
                    z3.m68934a(stringBuilder.toString());
                }
                throw z3;
            }
        }
        if (z3) {
            z3 = false;
            while (z3 < z2) {
                j = c19317aArr[z3].m69180a(j, z3 == z2 + -1);
                z3++;
            }
        }
        if (this.f60209h) {
            intValue = j - ((long) this.f60209h.intValue());
        } else if (this.f60208g) {
            z3 = this.f60208g.e(j);
            long j2 = j - ((long) z3);
            if (z3 != this.f60208g.b(j2)) {
                z3 = new StringBuilder();
                z3.append("Illegal instant due to time zone offset transition (");
                z3.append(this.f60208g);
                z3.append(')');
                z3 = z3.toString();
                if (charSequence != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot parse \"");
                    stringBuilder.append(charSequence);
                    stringBuilder.append("\": ");
                    stringBuilder.append(z3);
                    z3 = stringBuilder.toString();
                }
                throw new IllegalInstantException(z3);
            }
            intValue = j2;
        } else {
            intValue = j;
        }
        return intValue;
    }

    /* renamed from: a */
    private static void m69189a(C19317a[] c19317aArr, int i) {
        int i2 = 0;
        if (i > 10) {
            Arrays.sort(c19317aArr, 0, i);
            return;
        }
        while (i2 < i) {
            for (int i3 = i2; i3 > 0; i3--) {
                int i4 = i3 - 1;
                if (c19317aArr[i4].m69179a(c19317aArr[i3]) <= 0) {
                    break;
                }
                C19317a c19317a = c19317aArr[i3];
                c19317aArr[i3] = c19317aArr[i4];
                c19317aArr[i4] = c19317a;
            }
            i2++;
        }
    }

    /* renamed from: a */
    static int m69184a(C19306c c19306c, C19306c c19306c2) {
        if (c19306c != null) {
            if (c19306c.mo14522b()) {
                if (c19306c2 != null) {
                    if (c19306c2.mo14522b()) {
                        return -c19306c.compareTo(c19306c2);
                    }
                }
                return 1;
            }
        }
        if (c19306c2 != null) {
            if (c19306c2.mo14522b() != null) {
                return -1;
            }
        }
        return null;
    }
}
