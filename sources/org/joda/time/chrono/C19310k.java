package org.joda.time.chrono;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.IllegalFieldValueException;

/* renamed from: org.joda.time.chrono.k */
class C19310k {
    /* renamed from: a */
    private static ConcurrentMap<Locale, C19310k> f60155a = new ConcurrentHashMap();
    /* renamed from: b */
    private final String[] f60156b;
    /* renamed from: c */
    private final String[] f60157c;
    /* renamed from: d */
    private final String[] f60158d;
    /* renamed from: e */
    private final String[] f60159e;
    /* renamed from: f */
    private final String[] f60160f;
    /* renamed from: g */
    private final String[] f60161g;
    /* renamed from: h */
    private final TreeMap<String, Integer> f60162h;
    /* renamed from: i */
    private final TreeMap<String, Integer> f60163i;
    /* renamed from: j */
    private final TreeMap<String, Integer> f60164j;
    /* renamed from: k */
    private final int f60165k;
    /* renamed from: l */
    private final int f60166l;
    /* renamed from: m */
    private final int f60167m;
    /* renamed from: n */
    private final int f60168n;
    /* renamed from: o */
    private final int f60169o;
    /* renamed from: p */
    private final int f60170p;

    /* renamed from: a */
    static C19310k m69046a(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C19310k c19310k = (C19310k) f60155a.get(locale);
        if (c19310k != null) {
            return c19310k;
        }
        c19310k = new C19310k(locale);
        C19310k c19310k2 = (C19310k) f60155a.putIfAbsent(locale, c19310k);
        return c19310k2 != null ? c19310k2 : c19310k;
    }

    /* renamed from: a */
    private static String[] m69049a(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    /* renamed from: b */
    private static String[] m69050b(String[] strArr) {
        String[] strArr2 = new String[8];
        int i = 1;
        while (i < 8) {
            strArr2[i] = strArr[i < 7 ? i + 1 : 1];
            i++;
        }
        return strArr2;
    }

    /* renamed from: a */
    private static void m69048a(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                Object obj = strArr[length];
                if (obj != null) {
                    treeMap.put(obj, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m69047a(TreeMap<String, Integer> treeMap, int i, int i2, Integer[] numArr) {
        while (i <= i2) {
            treeMap.put(String.valueOf(i).intern(), numArr[i]);
            i++;
        }
    }

    /* renamed from: c */
    private static int m69051c(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            String str = strArr[length];
            if (str != null) {
                int length2 = str.length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }
    }

    private C19310k(Locale locale) {
        DateFormatSymbols a = DateTimeUtils.m68905a(locale);
        this.f60156b = a.getEras();
        this.f60157c = C19310k.m69050b(a.getWeekdays());
        this.f60158d = C19310k.m69050b(a.getShortWeekdays());
        this.f60159e = C19310k.m69049a(a.getMonths());
        this.f60160f = C19310k.m69049a(a.getShortMonths());
        this.f60161g = a.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        this.f60162h = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        C19310k.m69048a(this.f60162h, this.f60156b, numArr);
        if ("en".equals(locale.getLanguage()) != null) {
            this.f60162h.put("BCE", numArr[0]);
            this.f60162h.put("CE", numArr[1]);
        }
        this.f60163i = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        C19310k.m69048a(this.f60163i, this.f60157c, numArr);
        C19310k.m69048a(this.f60163i, this.f60158d, numArr);
        C19310k.m69047a(this.f60163i, 1, 7, numArr);
        this.f60164j = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        C19310k.m69048a(this.f60164j, this.f60159e, numArr);
        C19310k.m69048a(this.f60164j, this.f60160f, numArr);
        C19310k.m69047a(this.f60164j, 1, 12, numArr);
        this.f60165k = C19310k.m69051c(this.f60156b);
        this.f60166l = C19310k.m69051c(this.f60157c);
        this.f60167m = C19310k.m69051c(this.f60158d);
        this.f60168n = C19310k.m69051c(this.f60159e);
        this.f60169o = C19310k.m69051c(this.f60160f);
        this.f60170p = C19310k.m69051c(this.f60161g);
    }

    /* renamed from: a */
    public String m69054a(int i) {
        return this.f60156b[i];
    }

    /* renamed from: a */
    public int m69053a(String str) {
        Integer num = (Integer) this.f60162h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m68897w(), str);
    }

    /* renamed from: a */
    public int m69052a() {
        return this.f60165k;
    }

    /* renamed from: b */
    public String m69057b(int i) {
        return this.f60159e[i];
    }

    /* renamed from: c */
    public String m69060c(int i) {
        return this.f60160f[i];
    }

    /* renamed from: b */
    public int m69056b(String str) {
        Integer num = (Integer) this.f60164j.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m68892r(), str);
    }

    /* renamed from: b */
    public int m69055b() {
        return this.f60168n;
    }

    /* renamed from: d */
    public String m69063d(int i) {
        return this.f60157c[i];
    }

    /* renamed from: e */
    public String m69064e(int i) {
        return this.f60158d[i];
    }

    /* renamed from: c */
    public int m69059c(String str) {
        Integer num = (Integer) this.f60163i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m68886l(), str);
    }

    /* renamed from: c */
    public int m69058c() {
        return this.f60166l;
    }

    /* renamed from: f */
    public String m69065f(int i) {
        return this.f60161g[i];
    }

    /* renamed from: d */
    public int m69062d(String str) {
        String[] strArr = this.f60161g;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.m68885k(), str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return length;
    }

    /* renamed from: d */
    public int m69061d() {
        return this.f60170p;
    }
}
