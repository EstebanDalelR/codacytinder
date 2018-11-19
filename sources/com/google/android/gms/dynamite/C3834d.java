package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.zzc;
import com.google.android.gms.dynamite.DynamiteModule.zzd;

/* renamed from: com.google.android.gms.dynamite.d */
final class C3834d implements zzd {
    C3834d() {
    }

    public final C2533i zza(Context context, String str, zzi zzi) throws zzc {
        int i;
        C2533i c2533i = new C2533i();
        c2533i.f7699a = zzi.zzab(context, str);
        c2533i.f7700b = zzi.zzc(context, str, true);
        if (c2533i.f7699a == 0 && c2533i.f7700b == 0) {
            i = 0;
        } else if (c2533i.f7699a >= c2533i.f7700b) {
            i = -1;
        } else {
            c2533i.f7701c = 1;
            return c2533i;
        }
        c2533i.f7701c = i;
        return c2533i;
    }
}
