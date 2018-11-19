package com.google.android.m4b.maps.bw;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bn.C4831a;
import com.google.android.m4b.maps.bo.af;

/* renamed from: com.google.android.m4b.maps.bw.c */
public final class C4970c {
    /* renamed from: a */
    public static af m22238a(C4662a c4662a) {
        int d = c4662a.m20835d(3);
        d = 1 << ((30 - d) - 7);
        return new af((c4662a.m20835d(1) * d) - 536870912, 536870912 - (c4662a.m20835d(2) * d));
    }

    /* renamed from: a */
    public static af m22239a(C4831a c4831a) {
        return af.m21466b(c4831a.m21411a(), c4831a.m21412b());
    }
}
