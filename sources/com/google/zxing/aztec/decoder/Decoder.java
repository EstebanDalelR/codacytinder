package com.google.zxing.aztec.decoder;

import com.facebook.ads.internal.C1391d;
import com.foursquare.internal.util.C1948m;
import com.foursquare.pilgrim.C1993z;
import com.leanplum.BuildConfig;
import com.tinder.settings.presenter.C18077q;
import io.fabric.sdk.android.services.events.C15645a;

public final class Decoder {
    /* renamed from: a */
    private static final String[] f20959a = new String[]{"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    /* renamed from: b */
    private static final String[] f20960b = new String[]{"CTRL_PS", " ", "a", "b", "c", C1391d.f3780a, "e", "f", "g", "h", "i", "j", "k", "l", C1948m.f5228a, "n", "o", BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER, C18077q.f56130a, "r", "s", "t", "u", "v", "w", "x", "y", C1993z.f5398a, "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    /* renamed from: c */
    private static final String[] f20961c = new String[]{"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", C15645a.ROLL_OVER_FILE_NAME_SEPARATOR, "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    /* renamed from: d */
    private static final String[] f20962d = new String[]{"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    /* renamed from: e */
    private static final String[] f20963e = new String[]{"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    private enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }
}
