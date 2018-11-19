package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.hf;
import com.google.android.gms.internal.tb;

/* renamed from: com.google.android.gms.ads.internal.js.u */
final class C2389u implements Runnable {
    /* renamed from: a */
    final /* synthetic */ tb f7295a;
    /* renamed from: b */
    final /* synthetic */ C4273e f7296b;
    /* renamed from: c */
    final /* synthetic */ C2388t f7297c;

    C2389u(C2388t c2388t, tb tbVar, C4273e c4273e) {
        this.f7297c = c2388t;
        this.f7295a = tbVar;
        this.f7296b = c4273e;
    }

    public final void run() {
        try {
            zzc c4390l = new C4390l(this.f7297c.f7288b, this.f7297c.f7290d, this.f7295a, null);
            c4390l.zza(new C3768v(this, c4390l));
            c4390l.zza("/jsLoaded", new C3769y(this, c4390l));
            hf hfVar = new hf();
            zzt c3770z = new C3770z(this, c4390l, hfVar);
            hfVar.a(c3770z);
            c4390l.zza("/requestReload", c3770z);
            if (this.f7297c.f7289c.endsWith(".js")) {
                c4390l.zzbb(this.f7297c.f7289c);
            } else if (this.f7297c.f7289c.startsWith("<html>")) {
                c4390l.zzbd(this.f7297c.f7289c);
            } else {
                c4390l.zzbc(this.f7297c.f7289c);
            }
            fk.f16060a.postDelayed(new aa(this, c4390l), (long) ae.f7273a);
        } catch (Throwable th) {
            ec.b("Error creating webview.", th);
            ar.m8652i().a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            this.f7296b.d();
        }
    }
}
