package com.tinder.utils;

import android.support.annotation.Nullable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.tinder.utils.t */
public class C15369t implements InputFilter {
    /* renamed from: a */
    private static final Pattern f47635a = Pattern.compile(" ");

    @Nullable
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        spanned = spanned.toString();
        i3 = spanned.endsWith(" ");
        spanned = spanned.endsWith("\n\n");
        CharSequence charSequence2 = null;
        if (charSequence.length() == 0) {
            return null;
        }
        if (i3 != 0 && charSequence.charAt(i) == 32) {
            charSequence2 = f47635a.matcher(charSequence.toString()).replaceFirst("");
        } else if (spanned != null && charSequence.charAt(i) == 10) {
            charSequence2 = charSequence.toString().replaceAll(String.valueOf('\n'), "");
        }
        if ((charSequence instanceof Spanned) == null || charSequence2 == null) {
            return charSequence2;
        }
        spanned = new SpannableString(charSequence2);
        TextUtils.copySpansFrom((Spanned) charSequence, i, i2, null, spanned, 0);
        return spanned;
    }
}
