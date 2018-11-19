package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C2302k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.webvtt.g */
public final class C2245g {
    /* renamed from: a */
    private static final Pattern f6647a = Pattern.compile("^NOTE(( |\t).*)?$");
    /* renamed from: b */
    private static final Pattern f6648b = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");

    /* renamed from: a */
    public static void m8099a(C2302k c2302k) throws SubtitleDecoderException {
        c2302k = c2302k.m8414z();
        if (c2302k != null) {
            if (f6648b.matcher(c2302k).matches()) {
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected WEBVTT. Got ");
        stringBuilder.append(c2302k);
        throw new SubtitleDecoderException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static long m8098a(String str) throws NumberFormatException {
        str = str.split("\\.", 2);
        int i = 0;
        String[] split = str[0].split(":");
        long j = 0;
        while (i < split.length) {
            i++;
            j = (j * 60) + Long.parseLong(split[i]);
        }
        j *= 1000;
        if (str.length == 2) {
            j += Long.parseLong(str[1]);
        }
        return j * 1000;
    }

    /* renamed from: b */
    public static float m8100b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: b */
    public static Matcher m8101b(C2302k c2302k) {
        while (true) {
            CharSequence z = c2302k.m8414z();
            if (z == null) {
                return null;
            }
            if (f6647a.matcher(z).matches()) {
                while (true) {
                    String z2 = c2302k.m8414z();
                    if (z2 == null || z2.isEmpty()) {
                        break;
                    }
                }
            } else {
                Matcher matcher = C2244e.f6644a.matcher(z);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
