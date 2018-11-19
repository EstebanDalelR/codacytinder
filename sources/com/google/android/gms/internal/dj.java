package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

@zzzv
public final class dj implements zzafn {
    public final zzakv<String> zza(String str, PackageInfo packageInfo) {
        return id.m19920a(str);
    }

    public final zzakv<Info> zzab(Context context) {
        zzakv iwVar = new iw();
        aja.m19216a();
        if (hn.m19880f(context)) {
            fe.m19676a(new dk(this, context, iwVar));
        }
        return iwVar;
    }
}
