package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.internal.C2503l;
import java.util.Locale;

public final class ow {
    /* renamed from: a */
    private final String f16375a;
    /* renamed from: b */
    private final String f16376b;
    /* renamed from: c */
    private final C2503l f16377c;
    /* renamed from: d */
    private final int f16378d;

    private ow(String str, String str2) {
        this.f16376b = str2;
        this.f16375a = str;
        this.f16377c = new C2503l(str);
        this.f16378d = m20118a();
    }

    public ow(String str, String... strArr) {
        this(str, m20119a(strArr));
    }

    /* renamed from: a */
    private final int m20118a() {
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f16375a, i)) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static String m20119a(String... strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (String str : strArr) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(",");
            }
            stringBuilder.append(str);
        }
        stringBuilder.append(']');
        stringBuilder.append(' ');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private final boolean m20120a(int i) {
        return this.f16378d <= i;
    }

    /* renamed from: b */
    private final String m20121b(String str, @Nullable Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f16376b.concat(str);
    }

    /* renamed from: a */
    public final void m20122a(String str, @Nullable Object... objArr) {
        if (m20120a(3)) {
            Log.d(this.f16375a, m20121b(str, objArr));
        }
    }
}
