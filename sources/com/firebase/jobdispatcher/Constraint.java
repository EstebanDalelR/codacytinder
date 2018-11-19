package com.firebase.jobdispatcher;

import android.support.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Constraint {
    @VisibleForTesting
    /* renamed from: a */
    static final int[] f5082a = new int[]{2, 1, 4, 8};

    @Retention(RetentionPolicy.SOURCE)
    public @interface JobConstraint {
    }

    /* renamed from: a */
    static int m6562a(int[] iArr) {
        int i = 0;
        if (iArr == null) {
            return 0;
        }
        int i2 = 0;
        while (i < iArr.length) {
            i2 |= iArr[i];
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    static int[] m6563a(int i) {
        int i2 = 0;
        for (int i3 : f5082a) {
            i2 += (i & i3) == i3 ? 1 : 0;
        }
        int[] iArr = new int[i2];
        i2 = 0;
        for (int i32 : f5082a) {
            if ((i & i32) == i32) {
                int i4 = i2 + 1;
                iArr[i2] = i32;
                i2 = i4;
            }
        }
        return iArr;
    }
}
