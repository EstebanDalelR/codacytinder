package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzjj;
import java.lang.ref.WeakReference;

final class aj implements Runnable {
    /* renamed from: a */
    private /* synthetic */ WeakReference f7102a;
    /* renamed from: b */
    private /* synthetic */ ai f7103b;

    aj(ai aiVar, WeakReference weakReference) {
        this.f7103b = aiVar;
        this.f7102a = weakReference;
    }

    public final void run() {
        this.f7103b.f7099d = false;
        C4269a c4269a = (C4269a) this.f7102a.get();
        if (c4269a != null) {
            zzjj a = this.f7103b.f7098c;
            if (c4269a.mo3745b(a)) {
                c4269a.zzb(a);
            } else {
                ec.d("Ad is not visible. Not refreshing ad.");
                c4269a.f13841d.m8629b(a);
            }
        }
    }
}
