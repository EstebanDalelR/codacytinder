package com.google.android.exoplayer2.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RepeatModeUtil {

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    /* renamed from: b */
    public static boolean m8307b(int i, int i2) {
        boolean z = false;
        switch (i) {
            case 0:
                return true;
            case 1:
                if ((i2 & 1) != 0) {
                    z = true;
                }
                return z;
            case 2:
                if ((i2 & 2) != 0) {
                    z = true;
                }
                return z;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static int m8306a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (m8307b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }
}
