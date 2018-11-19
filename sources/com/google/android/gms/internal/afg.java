package com.google.android.gms.internal;

import android.content.ComponentName;
import android.support.customtabs.C0161b;
import android.support.customtabs.C0165d;
import java.lang.ref.WeakReference;

public final class afg extends C0165d {
    /* renamed from: a */
    private WeakReference<zzftt> f22903a;

    public afg(zzftt zzftt) {
        this.f22903a = new WeakReference(zzftt);
    }

    /* renamed from: a */
    public final void m27077a(ComponentName componentName, C0161b c0161b) {
        zzftt zzftt = (zzftt) this.f22903a.get();
        if (zzftt != null) {
            zzftt.zza(c0161b);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzftt zzftt = (zzftt) this.f22903a.get();
        if (zzftt != null) {
            zzftt.zzjk();
        }
    }
}
