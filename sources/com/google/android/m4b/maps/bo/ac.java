package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ax.C4699a;

public final class ac {
    /* renamed from: a */
    public static int m21429a(af afVar) {
        return afVar == null ? 0 : 24;
    }

    /* renamed from: a */
    public static boolean m21434a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public static int m21431a(C4854s c4854s) {
        return c4854s == null ? null : c4854s.m21782d();
    }

    /* renamed from: a */
    public static int m21428a(C4699a c4699a) {
        return c4699a == null ? null : C4699a.m20896b();
    }

    /* renamed from: a */
    public static int m21430a(as asVar) {
        return asVar == null ? null : asVar.m21569m();
    }

    /* renamed from: a */
    public static int m21432a(String str) {
        return str == null ? null : ((((str.length() + 1) / 4) * 4) * 2) + 40;
    }

    /* renamed from: a */
    public static void m21433a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i >> 16);
        i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 8);
        bArr[i3] = (byte) i;
    }
}
