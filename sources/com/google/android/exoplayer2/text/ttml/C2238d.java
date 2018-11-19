package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.text.ttml.d */
final class C2238d {
    /* renamed from: a */
    public static TtmlStyle m8026a(TtmlStyle ttmlStyle, String[] strArr, Map<String, TtmlStyle> map) {
        if (ttmlStyle == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (ttmlStyle == null && strArr.length == 1) {
            return (TtmlStyle) map.get(strArr[0]);
        }
        int length;
        if (ttmlStyle == null && strArr.length > 1) {
            ttmlStyle = new TtmlStyle();
            length = strArr.length;
            while (i < length) {
                ttmlStyle.m7992a((TtmlStyle) map.get(strArr[i]));
                i++;
            }
            return ttmlStyle;
        } else if (ttmlStyle != null && strArr != null && strArr.length == 1) {
            return ttmlStyle.m7992a((TtmlStyle) map.get(strArr[0]));
        } else {
            if (ttmlStyle == null || strArr == null || strArr.length <= 1) {
                return ttmlStyle;
            }
            length = strArr.length;
            while (i < length) {
                ttmlStyle.m7992a((TtmlStyle) map.get(strArr[i]));
                i++;
            }
            return ttmlStyle;
        }
    }

    /* renamed from: a */
    public static void m8029a(SpannableStringBuilder spannableStringBuilder, int i, int i2, TtmlStyle ttmlStyle) {
        if (ttmlStyle.m7988a() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(ttmlStyle.m7988a()), i, i2, 33);
        }
        if (ttmlStyle.m7998b()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (ttmlStyle.m8001c()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (ttmlStyle.m8005f()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ttmlStyle.m8004e()), i, i2, 33);
        }
        if (ttmlStyle.m8007h()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(ttmlStyle.m8006g()), i, i2, 33);
        }
        if (ttmlStyle.m8003d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(ttmlStyle.m8003d()), i, i2, 33);
        }
        if (ttmlStyle.m8009j() != null) {
            spannableStringBuilder.setSpan(new Standard(ttmlStyle.m8009j()), i, i2, 33);
        }
        switch (ttmlStyle.m8010k()) {
            case 1:
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) ttmlStyle.m8011l(), true), i, i2, 33);
                return;
            case 2:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(ttmlStyle.m8011l()), i, i2, 33);
                return;
            case 3:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(ttmlStyle.m8011l() / 100.0f), i, i2, 33);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    static void m8028a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    /* renamed from: a */
    static String m8027a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
}
