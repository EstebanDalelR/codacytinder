package org.joda.time;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PeriodType implements Serializable {
    /* renamed from: a */
    static int f60091a = 0;
    /* renamed from: b */
    static int f60092b = 1;
    /* renamed from: c */
    static int f60093c = 2;
    /* renamed from: d */
    static int f60094d = 3;
    /* renamed from: e */
    static int f60095e = 4;
    /* renamed from: f */
    static int f60096f = 5;
    /* renamed from: g */
    static int f60097g = 6;
    /* renamed from: h */
    static int f60098h = 7;
    /* renamed from: i */
    private static final Map<PeriodType, Object> f60099i = new HashMap(32);
    /* renamed from: j */
    private static PeriodType f60100j = null;
    /* renamed from: k */
    private static PeriodType f60101k = null;
    /* renamed from: l */
    private static PeriodType f60102l = null;
    /* renamed from: m */
    private static PeriodType f60103m = null;
    /* renamed from: n */
    private static PeriodType f60104n = null;
    /* renamed from: o */
    private static PeriodType f60105o = null;
    /* renamed from: p */
    private static PeriodType f60106p = null;
    private static final long serialVersionUID = 2274324892792009998L;
    /* renamed from: q */
    private final String f60107q;
    /* renamed from: r */
    private final DurationFieldType[] f60108r;
    /* renamed from: s */
    private final int[] f60109s;

    /* renamed from: a */
    public static PeriodType m68936a() {
        PeriodType periodType = f60100j;
        if (periodType != null) {
            return periodType;
        }
        periodType = new PeriodType("Standard", new DurationFieldType[]{DurationFieldType.m68927j(), DurationFieldType.m68926i(), DurationFieldType.m68924g(), DurationFieldType.m68923f(), DurationFieldType.m68921d(), DurationFieldType.m68920c(), DurationFieldType.m68919b(), DurationFieldType.m68918a()}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        f60100j = periodType;
        return periodType;
    }

    /* renamed from: b */
    public static PeriodType m68937b() {
        PeriodType periodType = f60101k;
        if (periodType != null) {
            return periodType;
        }
        periodType = new PeriodType("Time", new DurationFieldType[]{DurationFieldType.m68921d(), DurationFieldType.m68920c(), DurationFieldType.m68919b(), DurationFieldType.m68918a()}, new int[]{-1, -1, -1, -1, 0, 1, 2, 3});
        f60101k = periodType;
        return periodType;
    }

    /* renamed from: c */
    public static PeriodType m68938c() {
        PeriodType periodType = f60102l;
        if (periodType != null) {
            return periodType;
        }
        periodType = new PeriodType("Years", new DurationFieldType[]{DurationFieldType.m68927j()}, new int[]{0, -1, -1, -1, -1, -1, -1, -1});
        f60102l = periodType;
        return periodType;
    }

    /* renamed from: d */
    public static PeriodType m68939d() {
        PeriodType periodType = f60103m;
        if (periodType != null) {
            return periodType;
        }
        periodType = new PeriodType("Weeks", new DurationFieldType[]{DurationFieldType.m68924g()}, new int[]{-1, -1, 0, -1, -1, -1, -1, -1});
        f60103m = periodType;
        return periodType;
    }

    /* renamed from: e */
    public static PeriodType m68940e() {
        PeriodType periodType = f60104n;
        if (periodType != null) {
            return periodType;
        }
        periodType = new PeriodType("Days", new DurationFieldType[]{DurationFieldType.m68923f()}, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
        f60104n = periodType;
        return periodType;
    }

    /* renamed from: f */
    public static PeriodType m68941f() {
        PeriodType periodType = f60105o;
        if (periodType != null) {
            return periodType;
        }
        periodType = new PeriodType("Minutes", new DurationFieldType[]{DurationFieldType.m68920c()}, new int[]{-1, -1, -1, -1, -1, 0, -1, -1});
        f60105o = periodType;
        return periodType;
    }

    /* renamed from: g */
    public static PeriodType m68942g() {
        PeriodType periodType = f60106p;
        if (periodType != null) {
            return periodType;
        }
        periodType = new PeriodType("Seconds", new DurationFieldType[]{DurationFieldType.m68919b()}, new int[]{-1, -1, -1, -1, -1, -1, 0, -1});
        f60106p = periodType;
        return periodType;
    }

    protected PeriodType(String str, DurationFieldType[] durationFieldTypeArr, int[] iArr) {
        this.f60107q = str;
        this.f60108r = durationFieldTypeArr;
        this.f60109s = iArr;
    }

    /* renamed from: h */
    public String m68947h() {
        return this.f60107q;
    }

    /* renamed from: i */
    public int m68948i() {
        return this.f60108r.length;
    }

    /* renamed from: a */
    public DurationFieldType m68944a(int i) {
        return this.f60108r[i];
    }

    /* renamed from: a */
    public boolean m68945a(DurationFieldType durationFieldType) {
        return m68946b(durationFieldType) >= null ? true : null;
    }

    /* renamed from: b */
    public int m68946b(DurationFieldType durationFieldType) {
        int i = m68948i();
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f60108r[i2] == durationFieldType) {
                return i2;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PeriodType[");
        stringBuilder.append(m68947h());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    int m68943a(ReadablePeriod readablePeriod, int i) {
        i = this.f60109s[i];
        if (i == -1) {
            return null;
        }
        return readablePeriod.getValue(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodType)) {
            return null;
        }
        return Arrays.equals(this.f60108r, ((PeriodType) obj).f60108r);
    }

    public int hashCode() {
        int i = 0;
        for (Object hashCode : this.f60108r) {
            i += hashCode.hashCode();
        }
        return i;
    }
}
