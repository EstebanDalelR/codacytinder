package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"toByteOrNull", "", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, k = 5, mv = {1, 1, 10}, xi = 1, xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.p */
class C19292p extends C19290o {
    @SinceKotlin(version = "1.1")
    @Nullable
    /* renamed from: a */
    public static final Byte m68640a(@NotNull String str, int i) {
        C2668g.b(str, "$receiver");
        str = C19292p.m68643c(str, i);
        if (str == null) {
            return null;
        }
        str = str.intValue();
        if (str >= -128) {
            if (str <= 127) {
                return Byte.valueOf((byte) str);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    /* renamed from: b */
    public static final Short m68641b(@NotNull String str, int i) {
        C2668g.b(str, "$receiver");
        str = C19292p.m68643c(str, i);
        if (str == null) {
            return null;
        }
        str = str.intValue();
        if (str >= -32768) {
            if (str <= 32767) {
                return Short.valueOf((short) str);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    /* renamed from: c */
    public static final Integer m68642c(@NotNull String str) {
        C2668g.b(str, "$receiver");
        return C19292p.m68643c(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    /* renamed from: c */
    public static final Integer m68643c(@NotNull String str, int i) {
        C2668g.b(str, "$receiver");
        C15875b.m59925a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2;
        Object obj;
        int i3;
        int a;
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (charAt >= '0') {
            i2 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                i2 = 1;
                obj = 1;
                i3 = i5 / i;
                length--;
                if (i2 <= length) {
                    while (true) {
                        a = C15875b.m59924a(str.charAt(i2), i);
                        if (a < 0 && i4 >= i3) {
                            i4 *= i;
                            if (i4 >= i5 + a) {
                                i4 -= a;
                                if (i2 != length) {
                                    break;
                                }
                                i2++;
                            } else {
                                return null;
                            }
                        }
                        return null;
                    }
                }
                return obj == null ? Integer.valueOf(i4) : Integer.valueOf(-i4);
            } else if (charAt != '+') {
                return null;
            } else {
                i2 = 1;
            }
        }
        obj = null;
        i3 = i5 / i;
        length--;
        if (i2 <= length) {
            while (true) {
                a = C15875b.m59924a(str.charAt(i2), i);
                if (a < 0) {
                    return null;
                }
                i4 *= i;
                if (i4 >= i5 + a) {
                    return null;
                }
                i4 -= a;
                if (i2 != length) {
                    break;
                }
                i2++;
            }
        }
        if (obj == null) {
        }
        return obj == null ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    /* renamed from: d */
    public static final Long m68644d(@NotNull String str, int i) {
        String str2 = str;
        int i2 = i;
        C2668g.b(str2, "$receiver");
        C15875b.m59925a(i);
        int length = str.length();
        Long l = null;
        if (length == 0) {
            return null;
        }
        Object obj;
        long j;
        long j2;
        long j3;
        int a;
        int i3;
        long j4;
        long j5;
        int i4 = 0;
        char charAt = str2.charAt(0);
        long j6 = -9223372036854775807L;
        if (charAt < '0') {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j6 = Long.MIN_VALUE;
                i4 = 1;
                obj = 1;
                j = (long) i2;
                j2 = j6 / j;
                j3 = 0;
                length--;
                if (i4 <= length) {
                    while (true) {
                        a = C15875b.m59924a(str2.charAt(i4), i2);
                        if (a < 0 && j3 >= j2) {
                            j3 *= j;
                            i3 = i4;
                            j4 = (long) a;
                            if (j3 >= j6 + j4) {
                                j5 = j3 - j4;
                                i4 = i3;
                                if (i4 != length) {
                                    break;
                                }
                                i4++;
                                l = null;
                                j3 = j5;
                            } else {
                                return null;
                            }
                        }
                        return l;
                    }
                    j3 = j5;
                }
                return obj == null ? Long.valueOf(j3) : Long.valueOf(-j3);
            } else if (charAt != '+') {
                return null;
            } else {
                i4 = 1;
            }
        }
        obj = null;
        j = (long) i2;
        j2 = j6 / j;
        j3 = 0;
        length--;
        if (i4 <= length) {
            while (true) {
                a = C15875b.m59924a(str2.charAt(i4), i2);
                if (a < 0) {
                    return l;
                }
                j3 *= j;
                i3 = i4;
                j4 = (long) a;
                if (j3 >= j6 + j4) {
                    return null;
                }
                j5 = j3 - j4;
                i4 = i3;
                if (i4 != length) {
                    break;
                }
                i4++;
                l = null;
                j3 = j5;
            }
            j3 = j5;
        }
        if (obj == null) {
        }
        return obj == null ? Long.valueOf(j3) : Long.valueOf(-j3);
    }
}
