package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;

final class gk implements Runnable {
    /* renamed from: a */
    final /* synthetic */ Context f16099a;
    /* renamed from: b */
    private /* synthetic */ String f16100b;
    /* renamed from: c */
    private /* synthetic */ boolean f16101c;
    /* renamed from: d */
    private /* synthetic */ boolean f16102d;

    gk(gj gjVar, Context context, String str, boolean z, boolean z2) {
        this.f16099a = context;
        this.f16100b = str;
        this.f16101c = z;
        this.f16102d = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.f16099a);
        builder.setMessage(this.f16100b);
        builder.setTitle(this.f16101c ? "Error" : "Info");
        if (this.f16102d) {
            builder.setNeutralButton("Dismiss", null);
        } else {
            builder.setPositiveButton("Learn More", new gl(this));
            builder.setNegativeButton("Dismiss", null);
        }
        builder.create().show();
    }
}
