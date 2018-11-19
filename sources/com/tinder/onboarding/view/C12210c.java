package com.tinder.onboarding.view;

import android.support.annotation.NonNull;
import com.tinder.onboarding.viewmodel.C10005a;
import com.tinder.onboarding.viewmodel.C10009b;
import com.tinder.onboarding.viewmodel.DateField;
import org.joda.time.DateTime;

/* renamed from: com.tinder.onboarding.view.c */
public class C12210c implements DateWidgetDateValidator {
    public boolean validateDate(@NonNull DateField dateField, @NonNull C10005a c10005a, @NonNull C10005a c10005a2, @NonNull C10005a c10005a3, @NonNull C10009b c10009b) {
        switch (dateField) {
            case DAY_OF_MONTH:
                return m48365c(c10005a, c10005a2, c10005a3, c10009b);
            case MONTH:
                return m48364b(c10005a, c10005a2, c10005a3, c10009b);
            case YEAR:
                return m48363a(c10005a, c10005a2, c10005a3, c10009b);
            default:
                return null;
        }
    }

    /* renamed from: a */
    private boolean m48363a(@NonNull C10005a c10005a, @NonNull C10005a c10005a2, @NonNull C10005a c10005a3, @NonNull C10009b c10009b) {
        int b = c10005a3.m41010b();
        if (!c10005a3.m41011c()) {
            return C12210c.m48362a(c10005a3.m41010b(), c10005a3.m41009a(), c10009b);
        }
        if (c10009b.m41022a(DateField.YEAR).a(Integer.valueOf(b)) == null) {
            return null;
        }
        return (c10005a.m41011c() == null || c10005a2.m41011c() == null) ? true : C12210c.m48361a(c10005a.m41010b(), c10005a2.m41010b(), b);
    }

    /* renamed from: b */
    private boolean m48364b(@NonNull C10005a c10005a, @NonNull C10005a c10005a2, @NonNull C10005a c10005a3, @NonNull C10009b c10009b) {
        int b = c10005a2.m41010b();
        if (c10005a2.m41011c() != null) {
            if (c10009b.m41022a(DateField.MONTH).a(Integer.valueOf(b)) == null) {
                return false;
            }
            if (c10005a3.m41011c() == null || c10005a.m41011c() == null) {
                return c10005a.m41011c() == null || c10005a.m41010b() <= C12210c.m48359a(b);
            } else {
                return C12210c.m48361a(c10005a.m41010b(), b, c10005a3.m41010b());
            }
        } else if (b > 1) {
            return false;
        }
    }

    /* renamed from: c */
    private boolean m48365c(@NonNull C10005a c10005a, @NonNull C10005a c10005a2, @NonNull C10005a c10005a3, @NonNull C10009b c10009b) {
        int b = c10005a.m41010b();
        if (c10005a.m41011c() != null) {
            c10005a = c10009b.m41022a(DateField.DAY_OF_MONTH);
            if (b >= ((Integer) c10005a.a()).intValue()) {
                if (b <= ((Integer) c10005a.b()).intValue()) {
                    if (c10005a2.m41011c() != null && c10005a3.m41011c() != null) {
                        return C12210c.m48361a(b, c10005a2.m41010b(), c10005a3.m41010b());
                    }
                    if (c10005a2.m41011c() != null && b > C12210c.m48359a(c10005a2.m41010b())) {
                        return false;
                    }
                }
            }
            return false;
        } else if (b > 3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static int m48360a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == -1) {
                return i;
            }
        }
        return iArr.length;
    }

    /* renamed from: a */
    private static boolean m48361a(int r4, int r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.util.Locale.US;
        r1 = "%04d-%02d-%02d";
        r2 = 3;
        r2 = new java.lang.Object[r2];
        r6 = java.lang.Integer.valueOf(r6);
        r3 = 0;
        r2[r3] = r6;
        r5 = java.lang.Integer.valueOf(r5);
        r6 = 1;
        r2[r6] = r5;
        r4 = java.lang.Integer.valueOf(r4);
        r5 = 2;
        r2[r5] = r4;
        r4 = java.lang.String.format(r0, r1, r2);
        r5 = new java.text.SimpleDateFormat;
        r0 = "yyyy-MM-dd";
        r1 = java.util.Locale.US;
        r5.<init>(r0, r1);
        r5.setLenient(r3);
        r5.parse(r4);	 Catch:{ ParseException -> 0x0030 }
        return r6;
    L_0x0030:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.onboarding.view.c.a(int, int, int):boolean");
    }

    /* renamed from: a */
    private static boolean m48362a(int i, int[] iArr, C10009b c10009b) {
        int a = C12210c.m48360a(iArr);
        if (a <= 0) {
            return false;
        }
        iArr = (int) Math.pow(10.0d, (double) (iArr.length - a));
        c10009b = c10009b.m41022a(DateField.YEAR);
        for (a = ((Integer) c10009b.b()).intValue(); a >= ((Integer) c10009b.a()).intValue(); a--) {
            if (a / iArr == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static int m48359a(int i) {
        if (i == 2) {
            return 29;
        }
        return DateTime.a().d(i).d().i();
    }
}
