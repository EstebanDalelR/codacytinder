package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.zzc;
import com.google.android.gms.dynamite.DynamiteModule.zzd;

/* renamed from: com.google.android.gms.dynamite.e */
final class C3835e implements zzd {
    C3835e() {
    }

    public final C2533i zza(Context context, String str, zzi zzi) throws zzc {
        C2533i c2533i = new C2533i();
        c2533i.f7699a = zzi.zzab(context, str);
        c2533i.f7700b = c2533i.f7699a != 0 ? zzi.zzc(context, str, false) : zzi.zzc(context, str, true);
        if (c2533i.f7699a == 0 && c2533i.f7700b == 0) {
            c2533i.f7701c = 0;
            return c2533i;
        } else if (c2533i.f7699a >= c2533i.f7700b) {
            c2533i.f7701c = -1;
            return c2533i;
        } else {
            c2533i.f7701c = 1;
            return c2533i;
        }
    }
}
