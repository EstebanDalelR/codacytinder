package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

final class fl implements zzof {
    /* renamed from: a */
    private /* synthetic */ List f23298a;
    /* renamed from: b */
    private /* synthetic */ amj f23299b;
    /* renamed from: c */
    private /* synthetic */ Context f23300c;

    fl(fk fkVar, List list, amj amj, Context context) {
        this.f23298a = list;
        this.f23299b = amj;
        this.f23300c = context;
    }

    public final void zzjl() {
        for (String str : this.f23298a) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            hx.m19915d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.f23299b.m27139a(Uri.parse(str), null, null);
        }
        this.f23299b.m27137a((Activity) this.f23300c);
    }
}
