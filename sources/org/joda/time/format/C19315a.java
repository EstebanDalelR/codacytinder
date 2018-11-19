package org.joda.time.format;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.DateTime;

/* renamed from: org.joda.time.format.a */
public class C19315a {
    /* renamed from: a */
    private static final ConcurrentHashMap<String, C19316b> f60183a = new ConcurrentHashMap();
    /* renamed from: b */
    private static final AtomicReferenceArray<C19316b> f60184b = new AtomicReferenceArray(25);

    /* renamed from: a */
    public static C19316b m69151a(String str) {
        return C19315a.m69154c(str);
    }

    /* renamed from: a */
    private static void m69152a(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        int length = str.length();
        int[] iArr = new int[1];
        int i = 0;
        while (i < length) {
            iArr[0] = i;
            String a = C19315a.m69150a(str, iArr);
            int i2 = iArr[0];
            int length2 = a.length();
            if (length2 != 0) {
                char charAt = a.charAt(0);
                switch (charAt) {
                    case '\'':
                        a = a.substring(1);
                        if (a.length() != 1) {
                            dateTimeFormatterBuilder.m69109a(new String(a));
                            break;
                        } else {
                            dateTimeFormatterBuilder.m69105a(a.charAt(0));
                            break;
                        }
                    case 'C':
                        dateTimeFormatterBuilder.m69142g(length2, length2);
                        break;
                    case 'D':
                        dateTimeFormatterBuilder.m69146i(length2);
                        break;
                    case 'E':
                        if (length2 < 4) {
                            dateTimeFormatterBuilder.m69134e();
                            break;
                        } else {
                            dateTimeFormatterBuilder.m69131d();
                            break;
                        }
                    case 'G':
                        dateTimeFormatterBuilder.m69143h();
                        break;
                    case 'H':
                        dateTimeFormatterBuilder.m69128c(length2);
                        break;
                    case 'K':
                        dateTimeFormatterBuilder.m69135e(length2);
                        break;
                    case 'M':
                        if (length2 >= 3) {
                            if (length2 < 4) {
                                dateTimeFormatterBuilder.m69140g();
                                break;
                            } else {
                                dateTimeFormatterBuilder.m69137f();
                                break;
                            }
                        }
                        dateTimeFormatterBuilder.m69149k(length2);
                        break;
                    case 'S':
                        dateTimeFormatterBuilder.m69107a(length2, length2);
                        break;
                    case 'Y':
                    case 'x':
                    case 'y':
                        if (length2 != 2) {
                            i = 9;
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                if (C19315a.m69153b(C19315a.m69150a(str, iArr))) {
                                    i = length2;
                                }
                                iArr[0] = iArr[0] - 1;
                            }
                            if (charAt == 'Y') {
                                dateTimeFormatterBuilder.m69139f(length2, i);
                                break;
                            }
                            switch (charAt) {
                                case 'x':
                                    dateTimeFormatterBuilder.m69133d(length2, i);
                                    break;
                                case 'y':
                                    dateTimeFormatterBuilder.m69136e(length2, i);
                                    break;
                                default:
                                    break;
                            }
                        }
                        boolean b;
                        if (i2 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            b = C19315a.m69153b(C19315a.m69150a(str, iArr)) ^ true;
                            iArr[0] = iArr[0] - 1;
                        } else {
                            b = true;
                        }
                        if (charAt == 'x') {
                            dateTimeFormatterBuilder.m69122b(new DateTime().getWeekyear() - 30, b);
                            break;
                        } else {
                            dateTimeFormatterBuilder.m69108a(new DateTime().getYear() - 30, b);
                            break;
                        }
                    case 'Z':
                        if (length2 != 1) {
                            if (length2 != 2) {
                                dateTimeFormatterBuilder.m69147j();
                                break;
                            }
                            dateTimeFormatterBuilder.m69110a(null, "Z", true, 2, 2);
                            break;
                        }
                        dateTimeFormatterBuilder.m69110a(null, "Z", false, 2, 2);
                        break;
                    case 'a':
                        dateTimeFormatterBuilder.m69127c();
                        break;
                    case 'd':
                        dateTimeFormatterBuilder.m69144h(length2);
                        break;
                    case 'e':
                        dateTimeFormatterBuilder.m69141g(length2);
                        break;
                    case 'h':
                        dateTimeFormatterBuilder.m69138f(length2);
                        break;
                    case 'k':
                        dateTimeFormatterBuilder.m69132d(length2);
                        break;
                    case 'm':
                        dateTimeFormatterBuilder.m69120b(length2);
                        break;
                    case 's':
                        dateTimeFormatterBuilder.m69106a(length2);
                        break;
                    case 'w':
                        dateTimeFormatterBuilder.m69148j(length2);
                        break;
                    case 'z':
                        if (length2 < 4) {
                            dateTimeFormatterBuilder.m69112a(null);
                            break;
                        } else {
                            dateTimeFormatterBuilder.m69145i();
                            break;
                        }
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Illegal pattern component: ");
                        stringBuilder.append(a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static String m69150a(String str, int[] iArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            stringBuilder.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                stringBuilder.append(charAt);
                i = i2;
            }
        } else {
            stringBuilder.append('\'');
            int i3 = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != '\'') {
                    if (i3 == 0 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    stringBuilder.append(charAt2);
                } else {
                    int i4 = i + 1;
                    if (i4 >= length || str.charAt(i4) != '\'') {
                        i3 ^= 1;
                    } else {
                        stringBuilder.append(charAt2);
                        i = i4;
                    }
                }
                i++;
            }
        }
        iArr[0] = i;
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static boolean m69153b(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 67:
                case 68:
                case 70:
                case 72:
                case 75:
                case 83:
                case 87:
                case 89:
                case 99:
                case 100:
                case 101:
                case 104:
                case 107:
                case 109:
                case 115:
                case 119:
                case 120:
                case 121:
                    return true;
                case 77:
                    if (length <= 2) {
                        return true;
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static C19316b m69154c(String str) {
        if (str != null) {
            if (str.length() != 0) {
                C19316b c19316b = (C19316b) f60183a.get(str);
                if (c19316b != null) {
                    return c19316b;
                }
                DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
                C19315a.m69152a(dateTimeFormatterBuilder, str);
                c19316b = dateTimeFormatterBuilder.m69119a();
                if (f60183a.size() >= 500) {
                    return c19316b;
                }
                C19316b c19316b2 = (C19316b) f60183a.putIfAbsent(str, c19316b);
                return c19316b2 != null ? c19316b2 : c19316b;
            }
        }
        throw new IllegalArgumentException("Invalid pattern specification");
    }
}
