package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.gmsg.C2377h;
import com.google.android.gms.ads.internal.js.C2388t;
import com.google.android.gms.ads.internal.js.C4272a;
import com.google.android.gms.ads.internal.js.zzaj;
import org.json.JSONObject;

@zzzv
public final class ard<I, O> implements zztp<I, O> {
    /* renamed from: a */
    private final zztr<O> f26784a;
    /* renamed from: b */
    private final zzts<I> f26785b;
    /* renamed from: c */
    private final C2388t f26786c;
    /* renamed from: d */
    private final String f26787d;

    ard(C2388t c2388t, String str, zzts<I> zzts, zztr<O> zztr) {
        this.f26786c = c2388t;
        this.f26787d = str;
        this.f26785b = zzts;
        this.f26784a = zztr;
    }

    /* renamed from: a */
    private final void m31501a(C4272a c4272a, zzaj zzaj, I i, iw<O> iwVar) {
        try {
            ar.e();
            String a = fk.m19685a();
            C2377h.f7255o.a(a, new arg(this, c4272a, iwVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a);
            jSONObject.put("args", this.f26785b.zzh(i));
            zzaj.zzb(this.f26787d, jSONObject);
        } catch (Throwable e) {
            iwVar.m27363a(e);
            hx.m19912b("Unable to invokeJavaScript", e);
        } finally {
            c4272a.a();
        }
    }

    public final zzakv<O> zzc(I i) throws Exception {
        return zzg(i);
    }

    public final zzakv<O> zzg(I i) {
        zzakv iwVar = new iw();
        iz b = this.f26786c.b(null);
        b.zza(new are(this, b, i, iwVar), new arf(this, iwVar, b));
        return iwVar;
    }
}
