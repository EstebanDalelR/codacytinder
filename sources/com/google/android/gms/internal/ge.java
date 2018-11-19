package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ge implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ int f16086a;
    /* renamed from: b */
    private /* synthetic */ int f16087b;
    /* renamed from: c */
    private /* synthetic */ int f16088c;
    /* renamed from: d */
    private /* synthetic */ gd f16089d;

    ge(gd gdVar, int i, int i2, int i3) {
        this.f16089d = gdVar;
        this.f16086a = i;
        this.f16087b = i2;
        this.f16088c = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == this.f16086a) {
            this.f16089d.m19794b();
            return;
        }
        if (i == this.f16087b) {
            if (((Boolean) aja.m19221f().m19334a(alo.cy)).booleanValue()) {
                this.f16089d.m19796c();
                return;
            }
        }
        if (i == this.f16088c) {
            if (((Boolean) aja.m19221f().m19334a(alo.cz)).booleanValue()) {
                this.f16089d.m19799d();
            }
        }
    }
}
