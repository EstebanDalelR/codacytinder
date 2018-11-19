package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class atk implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ ati f15710a;

    atk(ati ati) {
        this.f15710a = ati;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f15710a.m19488a("Operation denied by user.");
    }
}
