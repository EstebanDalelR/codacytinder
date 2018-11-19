package android.support.v4.util;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.io.PrintWriter;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.util.o */
public final class C0564o {
    /* renamed from: a */
    private static final Object f1748a = new Object();
    /* renamed from: b */
    private static char[] f1749b = new char[24];

    /* renamed from: a */
    private static int m2091a(int i, int i2, boolean z, int i3) {
        if (i <= 99) {
            if (!z || i3 < 3) {
                if (i <= 9) {
                    if (!z || i3 < 2) {
                        if (!z) {
                            if (i <= 0) {
                                return 0;
                            }
                        }
                        return i2 + 1;
                    }
                }
                return i2 + 2;
            }
        }
        return i2 + 3;
    }

    /* renamed from: a */
    private static int m2093a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        if (!z && i <= 0) {
            return i2;
        }
        int i4;
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= true) || i > true || i2 != i4) {
            i2 = i / 10;
            cArr[i4] = (char) (i2 + 48);
            i4++;
            i -= i2 * 10;
        }
        cArr[i4] = (char) (i + 48);
        i4++;
        cArr[i4] = c;
        return i4 + 1;
    }

    /* renamed from: a */
    private static int m2092a(long j, int i) {
        long j2 = j;
        int i2 = i;
        if (f1749b.length < i2) {
            f1749b = new char[i2];
        }
        char[] cArr = f1749b;
        int i3;
        if (j2 == 0) {
            i3 = i2 - 1;
            while (i3 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i8 = (int) (j2 % 1000);
        i3 = (int) Math.floor((double) (j2 / 1000));
        if (i3 > 86400) {
            i4 = i3 / 86400;
            i3 -= 86400 * i4;
        } else {
            i4 = 0;
        }
        if (i3 > 3600) {
            i5 = i3 / 3600;
            i3 -= i5 * 3600;
        } else {
            i5 = 0;
        }
        if (i3 > 60) {
            int i9 = i3 / 60;
            i6 = i3 - (i9 * 60);
            i3 = i9;
        } else {
            i6 = i3;
            i3 = 0;
        }
        if (i2 != 0) {
            i9 = C0564o.m2091a(i4, 1, false, 0);
            i9 += C0564o.m2091a(i5, 1, i9 > 0, 2);
            i9 += C0564o.m2091a(i3, 1, i9 > 0, 2);
            i9 += C0564o.m2091a(i6, 1, i9 > 0, 2);
            i7 = 0;
            for (i9 += C0564o.m2091a(i8, 2, true, i9 > 0 ? 3 : 0) + 1; i9 < i2; i9++) {
                cArr[i7] = ' ';
                i7++;
            }
        } else {
            i7 = 0;
        }
        cArr[i7] = c;
        int i10 = i7 + 1;
        Object obj = i2 != 0 ? 1 : null;
        int i11 = i10;
        int a = C0564o.m2093a(cArr, i4, 'd', i10, false, 0);
        a = C0564o.m2093a(cArr, i5, 'h', a, a != i11, obj != null ? 2 : 0);
        a = C0564o.m2093a(cArr, i3, 'm', a, a != i11, obj != null ? 2 : 0);
        a = C0564o.m2093a(cArr, i6, 's', a, a != i11, obj != null ? 2 : 0);
        i10 = (obj == null || a == i11) ? 0 : 3;
        i3 = C0564o.m2093a(cArr, i8, 'm', a, true, i10);
        cArr[i3] = 's';
        return i3 + 1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static void m2096a(long j, PrintWriter printWriter, int i) {
        synchronized (f1748a) {
            printWriter.print(new String(f1749b, 0, C0564o.m2092a(j, i)));
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static void m2095a(long j, PrintWriter printWriter) {
        C0564o.m2096a(j, printWriter, 0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static void m2094a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            C0564o.m2096a(j - j2, printWriter, (int) 0);
        }
    }
}
