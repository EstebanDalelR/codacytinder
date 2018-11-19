package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.ar;

final class gf implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ String f16090a;
    /* renamed from: b */
    private /* synthetic */ gd f16091b;

    gf(gd gdVar, String str) {
        this.f16091b = gdVar;
        this.f16090a = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ar.e();
        fk.m19696a(this.f16091b.f16076a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f16090a), "Share via"));
    }
}
