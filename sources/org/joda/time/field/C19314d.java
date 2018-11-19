package org.joda.time.field;

import org.joda.time.C19305b;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* renamed from: org.joda.time.field.d */
public class C19314d {
    /* renamed from: a */
    public static int m69086a(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The calculation caused an overflow: ");
        stringBuilder.append(i);
        stringBuilder.append(" + ");
        stringBuilder.append(i2);
        throw new ArithmeticException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static long m69089a(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The calculation caused an overflow: ");
        stringBuilder.append(j);
        stringBuilder.append(" + ");
        stringBuilder.append(j2);
        throw new ArithmeticException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static long m69093b(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The calculation caused an overflow: ");
        stringBuilder.append(j);
        stringBuilder.append(" - ");
        stringBuilder.append(j2);
        throw new ArithmeticException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static long m69088a(long j, int i) {
        StringBuilder stringBuilder;
        switch (i) {
            case -1:
                if (j != Long.MIN_VALUE) {
                    return -j;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Multiplication overflows a long: ");
                stringBuilder.append(j);
                stringBuilder.append(" * ");
                stringBuilder.append(i);
                throw new ArithmeticException(stringBuilder.toString());
            case 0:
                return 0;
            case 1:
                return j;
            default:
                long j2 = (long) i;
                long j3 = j * j2;
                if (j3 / j2 == j) {
                    return j3;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Multiplication overflows a long: ");
                stringBuilder.append(j);
                stringBuilder.append(" * ");
                stringBuilder.append(i);
                throw new ArithmeticException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public static long m69094c(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j != 0) {
            if (j2 != 0) {
                long j3 = j * j2;
                if (j3 / j2 == j && !(j == Long.MIN_VALUE && j2 == -1)) {
                    if (j2 != Long.MIN_VALUE || j != -1) {
                        return j3;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Multiplication overflows a long: ");
                stringBuilder.append(j);
                stringBuilder.append(" * ");
                stringBuilder.append(j2);
                throw new ArithmeticException(stringBuilder.toString());
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m69087a(long j) {
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Value cannot fit in an int: ");
        stringBuilder.append(j);
        throw new ArithmeticException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static void m69091a(C19305b c19305b, int i, int i2, int i3) {
        if (i >= i2) {
            if (i <= i3) {
                return;
            }
        }
        throw new IllegalFieldValueException(c19305b.mo14534a(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: a */
    public static void m69090a(DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        if (i >= i2) {
            if (i <= i3) {
                return;
            }
        }
        throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: a */
    public static boolean m69092a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            if (obj2 != null) {
                return obj.equals(obj2);
            }
        }
        return null;
    }
}
