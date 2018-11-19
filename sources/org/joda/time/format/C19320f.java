package org.joda.time.format;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.Writer;

/* renamed from: org.joda.time.format.f */
public class C19320f {
    /* renamed from: a */
    private static final double f60215a = Math.log(10.0d);

    /* renamed from: a */
    public static void m69220a(java.lang.StringBuffer r0, int r1, int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        org.joda.time.format.C19320f.m69217a(r0, r1, r2);	 Catch:{ IOException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.f.a(java.lang.StringBuffer, int, int):void");
    }

    /* renamed from: a */
    public static void m69217a(Appendable appendable, int i, int i2) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
        } else if (i < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        } else {
            int log = i < AdError.NETWORK_ERROR_CODE ? 3 : i < 10000 ? 4 : ((int) (Math.log((double) i) / f60215a)) + 1;
            while (i2 > log) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i));
        }
    }

    /* renamed from: a */
    public static void m69215a(Writer writer, int i, int i2) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    writer.write(48);
                    i2--;
                }
                writer.write("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                writer.write(48);
                i2--;
            }
            writer.write(i + 48);
        } else if (i < 100) {
            while (i2 > 2) {
                writer.write(48);
                i2--;
            }
            i2 = ((i + 1) * 13421772) >> 27;
            writer.write(i2 + 48);
            writer.write(((i - (i2 << 3)) - (i2 << 1)) + 48);
        } else {
            int log = i < AdError.NETWORK_ERROR_CODE ? 3 : i < 10000 ? 4 : ((int) (Math.log((double) i) / f60215a)) + 1;
            while (i2 > log) {
                writer.write(48);
                i2--;
            }
            writer.write(Integer.toString(i));
        }
    }

    /* renamed from: a */
    public static void m69219a(java.lang.StringBuffer r0, int r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        org.joda.time.format.C19320f.m69216a(r0, r1);	 Catch:{ IOException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.f.a(java.lang.StringBuffer, int):void");
    }

    /* renamed from: a */
    public static void m69216a(Appendable appendable, int i) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        } else {
            appendable.append(Integer.toString(i));
        }
    }

    /* renamed from: a */
    public static void m69221a(java.lang.StringBuffer r0, long r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        org.joda.time.format.C19320f.m69218a(r0, r1);	 Catch:{ IOException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.f.a(java.lang.StringBuffer, long):void");
    }

    /* renamed from: a */
    public static void m69218a(Appendable appendable, long j) throws IOException {
        int i = (int) j;
        if (((long) i) == j) {
            C19320f.m69216a(appendable, i);
        } else {
            appendable.append(Long.toString(j));
        }
    }

    /* renamed from: a */
    public static void m69214a(Writer writer, int i) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                writer.write("2147483648");
                return;
            }
        }
        if (i < 10) {
            writer.write(i + 48);
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            writer.write(i2 + 48);
            writer.write(((i - (i2 << 3)) - (i2 << 1)) + 48);
        } else {
            writer.write(Integer.toString(i));
        }
    }

    /* renamed from: a */
    public static int m69211a(long j) {
        int i = 1;
        if (j < 0) {
            return j != Long.MIN_VALUE ? C19320f.m69211a(-j) + 1 : 20;
        } else {
            if (j >= 10) {
                i = j < 100 ? 2 : j < 1000 ? 3 : j < 10000 ? 4 : 1 + ((int) (Math.log((double) j) / f60215a));
            }
            return i;
        }
    }

    /* renamed from: a */
    static int m69212a(CharSequence charSequence, int i) {
        int charAt = charSequence.charAt(i) - 48;
        return (((charAt << 3) + (charAt << 1)) + charSequence.charAt(i + 1)) - 48;
    }

    /* renamed from: a */
    static String m69213a(String str, int i) {
        String str2;
        int i2 = i + 32;
        if (str.length() <= i2 + 3) {
            str2 = str;
        } else {
            str2 = str.substring(0, i2).concat("...");
        }
        if (i <= 0) {
            str = new StringBuilder();
            str.append("Invalid format: \"");
            str.append(str2);
            str.append('\"');
            return str.toString();
        } else if (i >= str.length()) {
            str = new StringBuilder();
            str.append("Invalid format: \"");
            str.append(str2);
            str.append("\" is too short");
            return str.toString();
        } else {
            str = new StringBuilder();
            str.append("Invalid format: \"");
            str.append(str2);
            str.append("\" is malformed at \"");
            str.append(str2.substring(i));
            str.append('\"');
            return str.toString();
        }
    }
}
