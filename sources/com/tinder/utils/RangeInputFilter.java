package com.tinder.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.List;
import java8.util.Objects;
import java8.util.Optional;

public class RangeInputFilter implements InputFilter {
    @Nullable
    /* renamed from: a */
    private static final String f47607a = null;
    @NonNull
    /* renamed from: b */
    private final List<InputFilter> f47608b;
    @NonNull
    /* renamed from: c */
    private final StringBuilder f47609c;
    @NonNull
    /* renamed from: d */
    private final ag<Integer> f47610d;

    private enum InputType {
        POSSIBLE,
        COMPLETE,
        INVALID
    }

    @Nullable
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        charSequence = m57600a(charSequence, i, i2, spanned, i3, i4);
        if (charSequence.m59132c() == 0) {
            return "";
        }
        String str = (String) charSequence.m59127b();
        if (TextUtils.isEmpty(str) != 0) {
            return str;
        }
        switch (m57597a(str)) {
            case POSSIBLE:
                return f47607a;
            case COMPLETE:
                if (spanned.length() != 0 || m57602b(str) == 0) {
                    return f47607a;
                }
                return m57603c(str);
            default:
                return "";
        }
    }

    @NonNull
    /* renamed from: a */
    private Optional<String> m57600a(@NonNull CharSequence charSequence, int i, int i2, @NonNull Spanned spanned, int i3, int i4) {
        for (InputFilter filter : this.f47608b) {
            CharSequence filter2 = filter.filter(charSequence, i, i2, spanned, i3, i4);
            if (Objects.m59114a((Object) filter2, (Object) "")) {
                return Optional.m59119a();
            }
            if ((Objects.m59114a((Object) filter2, f47607a) ^ 1) != 0) {
                i2 = filter2.length();
                charSequence = filter2;
                i = 0;
            }
        }
        StringBuilder a = m57599a();
        a.append(spanned);
        a.replace(i3, i4, charSequence.subSequence(i, i2).toString());
        return Optional.m59120a(a.toString());
    }

    @NonNull
    /* renamed from: a */
    private StringBuilder m57599a() {
        this.f47609c.setLength(0);
        return this.f47609c;
    }

    @NonNull
    /* renamed from: a */
    private InputType m57597a(@NonNull String str) {
        int parseInt = Integer.parseInt(str);
        str = str.length();
        while (str <= m57601b()) {
            int b = m57601b() - str;
            int a = m57596a(((Integer) this.f47610d.m57622b()).intValue(), b);
            if (m57596a(((Integer) this.f47610d.m57620a()).intValue(), b) > parseInt || parseInt > a) {
                str++;
            } else if (str == m57601b()) {
                return InputType.COMPLETE;
            } else {
                return InputType.POSSIBLE;
            }
        }
        return InputType.INVALID;
    }

    /* renamed from: b */
    private boolean m57602b(@NonNull String str) {
        return str.length() < m57601b() ? true : null;
    }

    @NonNull
    /* renamed from: c */
    private String m57603c(@NonNull String str) {
        return m57598a(str, m57601b());
    }

    /* renamed from: b */
    private int m57601b() {
        return m57595a(((Integer) this.f47610d.m57622b()).intValue());
    }

    /* renamed from: a */
    private int m57595a(int i) {
        return (int) (Math.log10((double) Math.abs(i)) + 1.0d);
    }

    /* renamed from: a */
    private int m57596a(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            i /= 10;
        }
        return i;
    }

    @NonNull
    /* renamed from: a */
    private String m57598a(@NonNull String str, int i) {
        StringBuilder a = m57599a();
        a.append(str);
        while (a.length() < i) {
            a.insert(null, '0');
        }
        return a.toString();
    }
}
