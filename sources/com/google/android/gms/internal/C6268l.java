package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;

@zzzv
/* renamed from: com.google.android.gms.internal.l */
public abstract class C6268l implements zzaal, zzaif<Void> {
    /* renamed from: a */
    private final zzalh<zzaat> f23399a;
    /* renamed from: b */
    private final zzaal f23400b;
    /* renamed from: c */
    private final Object f23401c = new Object();

    public C6268l(zzalh<zzaat> zzalh, zzaal zzaal) {
        this.f23399a = zzalh;
        this.f23400b = zzaal;
    }

    /* renamed from: a */
    public abstract void mo6897a();

    /* renamed from: a */
    final boolean m27427a(zzabb zzabb, zzaat zzaat) {
        try {
            zzabb.zza(zzaat, new C7360t(this));
            return true;
        } catch (Throwable th) {
            hx.m19914c("Could not fetch ad response from ad request service due to an Exception.", th);
            ar.i().m27296a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f23400b.zza(new zzaax(0));
            return false;
        }
    }

    /* renamed from: b */
    public abstract zzabb mo6898b();

    public final void cancel() {
        mo6897a();
    }

    public final void zza(zzaax zzaax) {
        synchronized (this.f23401c) {
            this.f23400b.zza(zzaax);
            mo6897a();
        }
    }

    public final /* synthetic */ Object zznd() {
        zzabb b = mo6898b();
        if (b == null) {
            this.f23400b.zza(new zzaax(0));
            mo6897a();
            return null;
        }
        this.f23399a.zza(new C6269m(this, b), new C6270n(this));
        return null;
    }
}
