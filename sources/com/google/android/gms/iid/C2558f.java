package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: com.google.android.gms.iid.f */
public final class C2558f extends Binder {
    /* renamed from: a */
    private final zzb f7773a;

    C2558f(zzb zzb) {
        this.f7773a = zzb;
    }

    /* renamed from: a */
    public final void m9308a(C2556d c2556d) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "service received new intent via bind strategy");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "intent being queued for bg execution");
        }
        this.f7773a.zzieo.execute(new C2559g(this, c2556d));
    }
}
