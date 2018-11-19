package com.google.android.gms.internal;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

final class ave implements Runnable {
    /* renamed from: a */
    final /* synthetic */ JSONObject f15783a;
    /* renamed from: b */
    final /* synthetic */ iw f15784b;
    /* renamed from: c */
    final /* synthetic */ avd f15785c;

    ave(avd avd, JSONObject jSONObject, iw iwVar) {
        this.f15785c = avd;
        this.f15783a = jSONObject;
        this.f15784b = iwVar;
    }

    public final void run() {
        try {
            zzanh a = this.f15785c.m19534a();
            a.zza(mb.m20046b());
            this.f15785c.f15777f.a(a);
            WeakReference weakReference = new WeakReference(a);
            a.zzsz().m19998a(this.f15785c.m19526a(weakReference), this.f15785c.m19533b(weakReference));
            this.f15785c.m19530a(a);
            a.zzsz().m20001a(new avf(this, a));
            a.zzsz().m20000a(new avg(this));
            a.loadUrl((String) aja.m19221f().m19334a(alo.bL));
        } catch (Throwable e) {
            hx.m19914c("Exception occurred while getting video view", e);
            this.f15784b.m27364b(null);
        }
    }
}
