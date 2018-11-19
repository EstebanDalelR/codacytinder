package com.google.android.m4b.maps.ag;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.ag.a */
public final class C4609a {
    /* renamed from: a */
    private static final byte[] f17023a;

    /* renamed from: a */
    public static int m20698a(long j) {
        return j > 2147483647L ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
    }

    static {
        byte[] bArr = new byte[ProfileEditingConfig.DEFAULT_MAX_LENGTH];
        f17023a = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i <= 9; i++) {
            f17023a[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 <= 26; i2++) {
            byte b = (byte) (i2 + 10);
            f17023a[i2 + 65] = b;
            f17023a[i2 + 97] = b;
        }
    }
}
