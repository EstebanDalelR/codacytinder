package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

@zzzv
public final class ks implements zzt<zzamp> {
    @Nullable
    /* renamed from: a */
    private ko f23396a;

    /* renamed from: a */
    private static java.lang.Integer m27425a(java.util.Map<java.lang.String, java.lang.String> r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r3.containsKey(r4);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r3.get(r4);	 Catch:{ NumberFormatException -> 0x0017 }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x0017 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0017 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0017 }
        return r0;
    L_0x0017:
        r3 = r3.get(r4);
        r3 = (java.lang.String) r3;
        r0 = java.lang.String.valueOf(r4);
        r0 = r0.length();
        r0 = r0 + 39;
        r2 = java.lang.String.valueOf(r3);
        r2 = r2.length();
        r0 = r0 + r2;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r0);
        r0 = "Precache invalid numeric parameter '";
        r2.append(r0);
        r2.append(r4);
        r4 = "': ";
        r2.append(r4);
        r2.append(r3);
        r3 = r2.toString();
        com.google.android.gms.internal.hx.m19916e(r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ks.a(java.util.Map, java.lang.String):java.lang.Integer");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzamp zzamp = (zzamp) obj;
        ar.x();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str != null) {
                if (this.f23396a != null) {
                    hx.m19916e("Threadless precache task has already started.");
                    return;
                } else if (km.m19980b(zzamp) != null) {
                    hx.m19916e("Precache task is already running.");
                    return;
                } else if (zzamp.zzbq() == null) {
                    hx.m19916e("Precache requires a dependency provider.");
                    return;
                } else {
                    Object obj2;
                    int i;
                    kc kcVar = new kc((String) map.get("flags"));
                    Integer a = m27425a(map, "notifyBytes");
                    Integer a2 = m27425a(map, "notifyMillis");
                    Integer a3 = m27425a(map, "player");
                    int i2 = 0;
                    if (a3 == null) {
                        a3 = Integer.valueOf(0);
                    }
                    ko zza = zzamp.zzbq().f7212a.zza(zzamp, a3.intValue(), null, kcVar);
                    if (a == null) {
                        if (a2 == null) {
                            obj2 = null;
                            if (obj2 != null) {
                                for (String str2 : kcVar.f16241a.split(",")) {
                                    if (str2.equals("1") && !str2.equals("2")) {
                                        i2 = 1;
                                        break;
                                    }
                                }
                                if (i2 != 0) {
                                    if (a == null) {
                                        a.intValue();
                                    } else {
                                        a2.intValue();
                                    }
                                    this.f23396a = zza;
                                }
                            }
                            new kk(zzamp, zza, str).zznd();
                        }
                    }
                    obj2 = 1;
                    if (obj2 != null) {
                        for (i = 0; i < r7; i++) {
                            if (str2.equals("1")) {
                            }
                        }
                        if (i2 != 0) {
                            if (a == null) {
                                a2.intValue();
                            } else {
                                a.intValue();
                            }
                            this.f23396a = zza;
                        }
                    }
                    new kk(zzamp, zza, str).zznd();
                }
            } else if (km.m19980b(zzamp) == null && this.f23396a == null) {
                hx.m19916e("Precache must specify a source.");
                return;
            }
            Integer a4 = m27425a(map, "minBufferMs");
            if (a4 != null) {
                a4.intValue();
            }
            a4 = m27425a(map, "maxBufferMs");
            if (a4 != null) {
                a4.intValue();
            }
            a4 = m27425a(map, "bufferForPlaybackMs");
            if (a4 != null) {
                a4.intValue();
            }
            a4 = m27425a(map, "bufferForPlaybackAfterRebufferMs");
            if (a4 != null) {
                a4.intValue();
            }
        } else if (this.f23396a != null) {
            this.f23396a.mo6887a();
        } else {
            if (!km.m19979a(zzamp)) {
                hx.m19916e("Precache abort but no precache task running.");
            }
        }
    }
}
