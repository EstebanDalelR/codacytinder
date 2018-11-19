package org.apache.commons.lang3.time;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.commons.lang3.exception.C15992a;

/* renamed from: org.apache.commons.lang3.time.a */
class C16002a {
    /* renamed from: a */
    private static final Method f49757a = C16002a.m60754a("isWeekDateSupported", new Class[0]);
    /* renamed from: b */
    private static final Method f49758b = C16002a.m60754a("getWeekYear", new Class[0]);

    /* renamed from: a */
    private static java.lang.reflect.Method m60754a(java.lang.String r1, java.lang.Class<?>... r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.util.Calendar.class;	 Catch:{ Exception -> 0x0007 }
        r1 = r0.getMethod(r1, r2);	 Catch:{ Exception -> 0x0007 }
        return r1;
    L_0x0007:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.a.a(java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    static boolean m60755a(Calendar calendar) {
        try {
            boolean z = false;
            if (!(f49757a == null || ((Boolean) f49757a.invoke(calendar, new Object[0])).booleanValue() == null)) {
                z = true;
            }
            return z;
        } catch (Calendar calendar2) {
            return ((Boolean) C15992a.m60741a(calendar2)).booleanValue();
        }
    }

    /* renamed from: b */
    public static int m60756b(Calendar calendar) {
        try {
            if (C16002a.m60755a(calendar)) {
                return ((Integer) f49758b.invoke(calendar, new Object[0])).intValue();
            }
            int i = calendar.get(1);
            if (f49757a == null && (calendar instanceof GregorianCalendar)) {
                int i2 = calendar.get(2);
                if (i2 != 0) {
                    if (i2 == 11) {
                        if (calendar.get(3) == 1) {
                            i++;
                        }
                    }
                } else if (calendar.get(3) >= 52) {
                    i--;
                }
            }
            return i;
        } catch (Calendar calendar2) {
            return ((Integer) C15992a.m60741a(calendar2)).intValue();
        }
    }
}
