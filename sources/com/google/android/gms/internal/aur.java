package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import io.fabric.sdk.android.services.events.C15645a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@zzzv
public final class aur extends auj {
    /* renamed from: g */
    protected aro f28705g;
    /* renamed from: h */
    private zzux f28706h;
    /* renamed from: i */
    private zzug f28707i;
    /* renamed from: j */
    private arj f28708j;
    /* renamed from: k */
    private final amb f28709k;
    /* renamed from: l */
    private final zzanh f28710l;
    /* renamed from: m */
    private boolean f28711m;

    aur(Context context, dm dmVar, zzux zzux, zzyb zzyb, amb amb, zzanh zzanh) {
        super(context, dmVar, zzyb);
        this.f28706h = zzux;
        this.f28708j = dmVar.f15997c;
        this.f28709k = amb;
        this.f28710l = zzanh;
    }

    /* renamed from: a */
    private static String m33970a(List<aro> list) {
        String str = "";
        if (list == null) {
            return str.toString();
        }
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return str.substring(0, Math.max(0, str.length() - 1));
            }
            aro aro = (aro) it.next();
            if (!(aro == null || aro.f15663b == null || TextUtils.isEmpty(aro.f15663b.f15625d))) {
                str = String.valueOf(str);
                String str2 = aro.f15663b.f15625d;
                switch (aro.f15662a) {
                    case -1:
                        i = 4;
                        break;
                    case 0:
                        break;
                    case 1:
                        i = 1;
                        break;
                    case 3:
                        i = 2;
                        break;
                    case 4:
                        i = 3;
                        break;
                    case 5:
                        i = 5;
                        break;
                    default:
                        i = 6;
                        break;
                }
                long j = aro.f15668g;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 33);
                stringBuilder.append(str2);
                stringBuilder.append(".");
                stringBuilder.append(i);
                stringBuilder.append(".");
                stringBuilder.append(j);
                String stringBuilder2 = stringBuilder.toString();
                StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(stringBuilder2).length());
                stringBuilder3.append(str);
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
                str = stringBuilder3.toString();
            }
        }
    }

    /* renamed from: a */
    protected final dl mo7432a(int i) {
        zzaat zzaat = this.e.f15995a;
        zzjj zzjj = zzaat.zzcnd;
        zzanh zzanh = this.f28710l;
        List list = this.f.zzcdk;
        List list2 = this.f.zzcdl;
        List list3 = this.f.zzcoy;
        int i2 = this.f.orientation;
        long j = this.f.zzcdq;
        String str = zzaat.zzcng;
        boolean z = this.f.zzcow;
        ari ari = this.f28705g != null ? r0.f28705g.f15663b : null;
        zzva zzva = r0.f28705g != null ? r0.f28705g.f15664c : null;
        return new dl(zzjj, zzanh, list, i, list2, list3, i2, j, str, z, ari, zzva, r0.f28705g != null ? r0.f28705g.f15665d : AdMobAdapter.class.getName(), r0.f28708j, r0.f28705g != null ? r0.f28705g.f15666e : null, r0.f.zzcox, r0.e.f15998d, r0.f.zzcov, r0.e.f16000f, r0.f.zzcpa, r0.f.zzcpb, r0.e.f16002h, null, r0.f.zzcpl, r0.f.zzcpm, r0.f.zzcpn, r0.f28708j != null ? r0.f28708j.f15654n : false, r0.f.zzcpp, r0.f28707i != null ? m33970a(r0.f28707i.zzlu()) : null, r0.f.zzcdn, r0.f.zzcps, r0.e.f16003i, r0.f.zzaqv, r0.e.f16004j);
    }

    /* renamed from: a */
    protected final void mo7433a(long j) throws zzxz {
        boolean z;
        ListIterator listIterator;
        StringBuilder stringBuilder;
        synchronized (this.d) {
            zzug zzug;
            try {
                if (r1.f28708j.f15652l != -1) {
                    Context context = r1.b;
                    zzaat zzaat = r1.e.f15995a;
                    zzux zzux = r1.f28706h;
                    arj arj = r1.f28708j;
                    boolean z2 = r1.f.zzben;
                    boolean z3 = r1.f.zzbep;
                    String str = r1.f.zzcpq;
                    long longValue = ((Long) aja.m19221f().m19334a(alo.bn)).longValue();
                    boolean z4 = r1.e.f16004j;
                } else {
                    zzug art = new art(r1.b, r1.e.f15995a, r1.f28706h, r1.f28708j, r1.f.zzben, r1.f.zzbep, r1.f.zzcpq, j, ((Long) aja.m19221f().m19334a(alo.bn)).longValue(), r1.f28709k, r1.e.f16004j);
                }
                r1.f28707i = zzug;
            } finally {
                zzug = r0;
            }
        }
        List arrayList = new ArrayList(r1.f28708j.f15641a);
        Bundle bundle = r1.e.f15995a.zzcnd.zzbdp;
        String str2 = "com.google.ads.mediation.admob.AdMobAdapter";
        if (bundle != null) {
            bundle = bundle.getBundle(str2);
            if (bundle != null) {
                z = bundle.getBoolean("_skipMediation");
                if (z) {
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (!((ari) listIterator.next()).f15624c.contains(str2)) {
                            listIterator.remove();
                        }
                    }
                }
                r1.f28705g = r1.f28707i.zzh(arrayList);
                switch (r1.f28705g.f15662a) {
                    case 0:
                        if (r1.f28705g.f15663b == null && r1.f28705g.f15663b.f15634m != null) {
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            fk.f16060a.post(new aus(r1, countDownLatch));
                            try {
                                countDownLatch.await(10, TimeUnit.SECONDS);
                                synchronized (r1.d) {
                                    try {
                                        if (!r1.f28711m) {
                                            throw new zzxz("View could not be prepared", 0);
                                        } else if (r1.f28710l.isDestroyed()) {
                                            throw new zzxz("Assets not loaded, web view is destroyed", 0);
                                        }
                                    } catch (Throwable th) {
                                        Throwable th2 = th;
                                    }
                                }
                                return;
                            } catch (InterruptedException e) {
                                String valueOf = String.valueOf(e);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
                                stringBuilder.append("Interrupted while waiting for latch : ");
                                stringBuilder.append(valueOf);
                                throw new zzxz(stringBuilder.toString(), 0);
                            }
                        }
                        return;
                    case 1:
                        throw new zzxz("No fill from any mediation ad networks.", 3);
                    default:
                        int i = r1.f28705g.f15662a;
                        stringBuilder = new StringBuilder(40);
                        stringBuilder.append("Unexpected mediation result: ");
                        stringBuilder.append(i);
                        throw new zzxz(stringBuilder.toString(), 0);
                }
            }
        }
        z = false;
        if (z) {
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((ari) listIterator.next()).f15624c.contains(str2)) {
                    listIterator.remove();
                }
            }
        }
        r1.f28705g = r1.f28707i.zzh(arrayList);
        switch (r1.f28705g.f15662a) {
            case 0:
                if (r1.f28705g.f15663b == null) {
                    break;
                }
                return;
            case 1:
                throw new zzxz("No fill from any mediation ad networks.", 3);
            default:
                int i2 = r1.f28705g.f15662a;
                stringBuilder = new StringBuilder(40);
                stringBuilder.append("Unexpected mediation result: ");
                stringBuilder.append(i2);
                throw new zzxz(stringBuilder.toString(), 0);
        }
    }

    /* renamed from: b */
    public final void mo6838b() {
        synchronized (this.d) {
            super.mo6838b();
            if (this.f28707i != null) {
                this.f28707i.cancel();
            }
        }
    }
}
