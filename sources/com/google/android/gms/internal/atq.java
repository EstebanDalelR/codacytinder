package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class atq implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ ato f15718a;

    atq(ato ato) {
        this.f15718a = ato;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f15718a.m19488a("User canceled the download.");
    }
}
