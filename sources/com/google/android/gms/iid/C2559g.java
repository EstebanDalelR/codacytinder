package com.google.android.gms.iid;

import android.util.Log;

/* renamed from: com.google.android.gms.iid.g */
final class C2559g implements Runnable {
    /* renamed from: a */
    private /* synthetic */ C2556d f7774a;
    /* renamed from: b */
    private /* synthetic */ C2558f f7775b;

    C2559g(C2558f c2558f, C2556d c2556d) {
        this.f7775b = c2558f;
        this.f7774a = c2556d;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f7775b.f7773a.handleIntent(this.f7774a.f7767a);
        this.f7774a.m9306a();
    }
}
