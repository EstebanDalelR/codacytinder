package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class ahh implements zzz {
    /* renamed from: a */
    private final Executor f22953a;

    public ahh(Handler handler) {
        this.f22953a = new aic(this, handler);
    }

    public final void zza(aom<?> aom, asu<?> asu, Runnable runnable) {
        aom.m19397j();
        aom.m19388b("post-response");
        this.f22953a.execute(new aiy(this, aom, asu, runnable));
    }

    public final void zza(aom<?> aom, zzad zzad) {
        aom.m19388b("post-error");
        this.f22953a.execute(new aiy(this, aom, asu.m19469a(zzad), null));
    }

    public final void zzb(aom<?> aom, asu<?> asu) {
        zza(aom, asu, null);
    }
}
