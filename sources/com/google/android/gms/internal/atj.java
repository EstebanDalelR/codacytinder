package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.ar;

final class atj implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ ati f15709a;

    atj(ati ati) {
        this.f15709a = ati;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent b = this.f15709a.m27241b();
        ar.e();
        fk.m19696a(this.f15709a.f23123b, b);
    }
}
