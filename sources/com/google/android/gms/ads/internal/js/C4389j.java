package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzzv;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.js.j */
public final class C4389j implements zzak {
    /* renamed from: a */
    private final zzaj f14560a;
    /* renamed from: b */
    private final HashSet<SimpleEntry<String, zzt<? super zzaj>>> f14561b = new HashSet();

    public C4389j(zzaj zzaj) {
        this.f14560a = zzaj;
    }

    public final void zza(String str, zzt<? super zzaj> zzt) {
        this.f14560a.zza(str, zzt);
        this.f14561b.add(new SimpleEntry(str, zzt));
    }

    public final void zza(String str, Map<String, ?> map) {
        this.f14560a.zza(str, (Map) map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.f14560a.zza(str, jSONObject);
    }

    public final void zzb(String str, zzt<? super zzaj> zzt) {
        this.f14560a.zzb(str, zzt);
        this.f14561b.remove(new SimpleEntry(str, zzt));
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.f14560a.zzb(str, jSONObject);
    }

    public final void zzlt() {
        Iterator it = this.f14561b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((zzt) simpleEntry.getValue()).toString());
            ec.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f14560a.zzb((String) simpleEntry.getKey(), (zzt) simpleEntry.getValue());
        }
        this.f14561b.clear();
    }
}
