package com.google.zxing.datamatrix.decoder;

import com.tinder.api.ManagerWebServices;

final class DecodedBitStreamParser {
    /* renamed from: a */
    private static final char[] f20995a = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    /* renamed from: b */
    private static final char[] f20996b = new char[]{'!', '\"', '#', '$', '%', ManagerWebServices.QUERY_AMPERSAND, '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', ManagerWebServices.QUERY_QUESTION_MARK, '@', '[', '\\', ']', '^', '_'};
    /* renamed from: c */
    private static final char[] f20997c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    /* renamed from: d */
    private static final char[] f20998d = f20996b;
    /* renamed from: e */
    private static final char[] f20999e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', ''};

    private enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }
}
