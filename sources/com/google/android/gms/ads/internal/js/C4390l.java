package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bn;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.ahw;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.mb;
import com.google.android.gms.internal.tb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanv;
import com.google.android.gms.internal.zzzv;
import java.util.Map;
import org.json.JSONObject;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.js.l */
public final class C4390l implements zzc {
    /* renamed from: a */
    private final zzanh f14562a;
    /* renamed from: b */
    private final Context f14563b;

    public C4390l(Context context, zzakd zzakd, @Nullable tb tbVar, bn bnVar) throws zzanv {
        Context context2 = context;
        this.f14563b = context2;
        this.f14562a = ar.m8649f().a(context2, mb.a(), "", false, false, tbVar, zzakd, null, null, null, ahw.a());
        zzanh zzanh = this.f14562a;
        if (zzanh == null) {
            throw null;
        }
        ((View) zzanh).setWillNotDraw(true);
    }

    /* renamed from: a */
    private static void m18146a(Runnable runnable) {
        aja.a();
        if (hn.b()) {
            runnable.run();
        } else {
            fk.f16060a.post(runnable);
        }
    }

    public final void destroy() {
        this.f14562a.destroy();
    }

    public final void zza(zzd zzd) {
        this.f14562a.zzsz().a(new C3766r(this, zzd));
    }

    public final void zza(String str, zzt<? super zzaj> zzt) {
        this.f14562a.zzsz().a(str, new C3767s(this, zzt));
    }

    public final void zza(String str, Map<String, ?> map) {
        this.f14562a.zza(str, map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.f14562a.zza(str, jSONObject);
    }

    public final void zzb(String str, zzt<? super zzaj> zzt) {
        this.f14562a.zzsz().a(str, new C3765m(zzt));
    }

    public final void zzb(String str, JSONObject jSONObject) {
        C4390l.m18146a(new C2384n(this, str, jSONObject));
    }

    public final void zzbb(String str) {
        C4390l.m18146a(new C2385o(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void zzbc(String str) {
        C4390l.m18146a(new C2387q(this, str));
    }

    public final void zzbd(String str) {
        C4390l.m18146a(new C2386p(this, str));
    }

    public final zzak zzln() {
        return new C4389j(this);
    }
}
