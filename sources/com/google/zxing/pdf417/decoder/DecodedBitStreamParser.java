package com.google.zxing.pdf417.decoder;

import java.math.BigInteger;
import java.nio.charset.Charset;

final class DecodedBitStreamParser {
    /* renamed from: a */
    private static final char[] f21047a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    /* renamed from: b */
    private static final char[] f21048b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    /* renamed from: c */
    private static final Charset f21049c = Charset.forName("ISO-8859-1");
    /* renamed from: d */
    private static final BigInteger[] f21050d;

    private enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f21050d = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        f21050d[1] = valueOf;
        for (int i = 2; i < f21050d.length; i++) {
            f21050d[i] = f21050d[i - 1].multiply(valueOf);
        }
    }
}
