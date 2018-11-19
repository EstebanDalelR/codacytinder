package com.google.android.m4b.maps.bj;

import com.google.android.m4b.maps.bo.bf;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bw.C4981g;

/* renamed from: com.google.android.m4b.maps.bj.g */
public class C6463g implements C4788h {
    /* renamed from: a */
    public C4787f mo5022a(bg bgVar, int i, boolean z, bf bfVar, C4981g c4981g) {
        if (z) {
            return new C7450c(bgVar, i, bfVar, c4981g);
        }
        return new C7452e(bgVar, bfVar, c4981g);
    }

    /* renamed from: a */
    public C7452e mo5021a(bg bgVar, boolean z, bf bfVar, C4981g c4981g) {
        return z ? new C7452e(bgVar, bfVar, c4981g) : null;
    }
}
