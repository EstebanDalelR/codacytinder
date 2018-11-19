package com.google.android.gms.ads.internal;

import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ari;
import com.google.android.gms.internal.arj;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzva;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.ads.internal.x */
final class C2408x implements Runnable {
    /* renamed from: a */
    private /* synthetic */ C2407w f7320a;

    C2408x(C2407w c2407w) {
        this.f7320a = c2407w;
    }

    public final void run() {
        Object a = this.f7320a.f7319b.f13924a;
        Runnable runnable = this.f7320a.f7318a;
        ad.m9053b("Adapters must be initialized on the main thread.");
        Map e = ar.m8652i().r().e();
        if (e != null && !e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    ec.c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            bp g = bp.g();
            if (g != null) {
                Collection<arj> values = e.values();
                Map hashMap = new HashMap();
                IObjectWrapper a2 = C4296b.m17261a(a);
                for (arj arj : values) {
                    for (ari ari : arj.f15641a) {
                        String str = ari.f15631j;
                        for (String str2 : ari.f15624c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                for (Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        cp a3 = g.a(str3);
                        if (a3 != null) {
                            zzva a4 = a3.a();
                            if (!a4.isInitialized()) {
                                if (a4.zzmi()) {
                                    a4.zza(a2, a3.b(), (List) entry.getValue());
                                    String str4 = "Initialized rewarded video mediation adapter ";
                                    String valueOf = String.valueOf(str3);
                                    ec.b(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 56);
                        stringBuilder.append("Failed to initialize rewarded video mediation adapter \"");
                        stringBuilder.append(str3);
                        stringBuilder.append("\"");
                        ec.c(stringBuilder.toString(), th2);
                    }
                }
            }
        }
    }
}
