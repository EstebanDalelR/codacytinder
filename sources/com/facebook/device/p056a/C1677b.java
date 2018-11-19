package com.facebook.device.p056a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.facebook.device.a.b */
public class C1677b {
    /* renamed from: a */
    private static volatile Integer f4602a;

    /* renamed from: a */
    public static int m5674a(Context context) {
        if (f4602a == null) {
            synchronized (C1677b.class) {
                if (f4602a == null) {
                    f4602a = Integer.valueOf(C1677b.m5677b(context));
                }
            }
        }
        return f4602a.intValue();
    }

    /* renamed from: a */
    private static void m5675a(ArrayList<Integer> arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    private static int m5677b(Context context) {
        long a = C1676a.m5669a(context);
        if (a == -1) {
            return C1677b.m5678c(context);
        }
        if (a <= 805306368) {
            return C1676a.m5665a() <= 1 ? 2009 : 2010;
        }
        int i = 2012;
        if (a <= 1073741824) {
            if (C1676a.m5670b() < 1300000) {
                i = 2011;
            }
            return i;
        } else if (a <= 1610612736) {
            if (C1676a.m5670b() >= 1800000) {
                i = 2013;
            }
            return i;
        } else if (a <= 2147483648L) {
            return 2013;
        } else {
            return a <= 3221225472L ? 2014 : 2015;
        }
    }

    /* renamed from: c */
    private static int m5678c(Context context) {
        ArrayList arrayList = new ArrayList();
        C1677b.m5675a(arrayList, C1677b.m5673a());
        C1677b.m5675a(arrayList, C1677b.m5676b());
        C1677b.m5675a(arrayList, C1677b.m5679d(context));
        if (arrayList.isEmpty() != null) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        context = (arrayList.size() / 2) - 1;
        return ((Integer) arrayList.get(context)).intValue() + ((((Integer) arrayList.get(context + 1)).intValue() - ((Integer) arrayList.get(context)).intValue()) / 2);
    }

    /* renamed from: a */
    private static int m5673a() {
        int a = C1676a.m5665a();
        if (a < 1) {
            return -1;
        }
        if (a == 1) {
            return 2008;
        }
        return a <= 3 ? 2011 : 2012;
    }

    /* renamed from: b */
    private static int m5676b() {
        long b = (long) C1676a.m5670b();
        if (b == -1) {
            return -1;
        }
        if (b <= 528000) {
            return 2008;
        }
        if (b <= 620000) {
            return 2009;
        }
        if (b <= 1020000) {
            return 2010;
        }
        if (b <= 1220000) {
            return 2011;
        }
        if (b <= 1520000) {
            return 2012;
        }
        return b <= 2020000 ? 2013 : 2014;
    }

    /* renamed from: d */
    private static int m5679d(Context context) {
        long a = C1676a.m5669a(context);
        if (a <= 0) {
            return -1;
        }
        if (a <= 201326592) {
            return 2008;
        }
        if (a <= 304087040) {
            return 2009;
        }
        if (a <= 536870912) {
            return 2010;
        }
        if (a <= 1073741824) {
            return 2011;
        }
        if (a <= 1610612736) {
            return 2012;
        }
        return a <= 2147483648L ? 2013 : 2014;
    }
}
