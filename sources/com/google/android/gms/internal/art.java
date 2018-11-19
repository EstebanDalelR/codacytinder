package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzzv
public final class art implements zzug {
    /* renamed from: a */
    private final zzaat f23095a;
    /* renamed from: b */
    private final zzux f23096b;
    /* renamed from: c */
    private final Context f23097c;
    /* renamed from: d */
    private final Object f23098d = new Object();
    /* renamed from: e */
    private final arj f23099e;
    /* renamed from: f */
    private final boolean f23100f;
    /* renamed from: g */
    private final long f23101g;
    /* renamed from: h */
    private final long f23102h;
    /* renamed from: i */
    private final amb f23103i;
    /* renamed from: j */
    private final boolean f23104j;
    /* renamed from: k */
    private final String f23105k;
    /* renamed from: l */
    private boolean f23106l = false;
    /* renamed from: m */
    private arl f23107m;
    /* renamed from: n */
    private List<aro> f23108n = new ArrayList();
    /* renamed from: o */
    private final boolean f23109o;

    public art(Context context, zzaat zzaat, zzux zzux, arj arj, boolean z, boolean z2, String str, long j, long j2, amb amb, boolean z3) {
        this.f23097c = context;
        this.f23095a = zzaat;
        this.f23096b = zzux;
        this.f23099e = arj;
        this.f23100f = z;
        this.f23104j = z2;
        this.f23105k = str;
        this.f23101g = j;
        this.f23102h = j2;
        this.f23103i = amb;
        this.f23109o = z3;
    }

    public final void cancel() {
        synchronized (this.f23098d) {
            this.f23106l = true;
            if (this.f23107m != null) {
                this.f23107m.m27224a();
            }
        }
    }

    public final aro zzh(List<ari> list) {
        Throwable th;
        Object obj;
        ArrayList arrayList;
        hx.m19911b("Starting mediation.");
        ArrayList arrayList2 = new ArrayList();
        alz a = this.f23103i.m19361a();
        zzjn zzjn = this.f23095a.zzauc;
        int[] iArr = new int[2];
        if (zzjn.zzbem != null) {
            ar.v();
            if (arp.m19464a(r1.f23105k, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjn[] zzjnArr = zzjn.zzbem;
                int length = zzjnArr.length;
                while (i < length) {
                    zzjn zzjn2 = zzjnArr[i];
                    if (i2 == zzjn2.width && i3 == zzjn2.height) {
                        zzjn = zzjn2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ari ari = (ari) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(ari.f15623b);
            hx.m19915d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = ari.f15624c.iterator();
            while (it2.hasNext()) {
                aro aro;
                valueOf = (String) it2.next();
                alz a2 = r1.f23103i.m19361a();
                Object obj2 = r1.f23098d;
                synchronized (obj2) {
                    try {
                        if (r1.f23106l) {
                            try {
                                aro = new aro(-1);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                obj = obj2;
                                throw th3;
                            }
                        }
                        Iterator it3 = it;
                        Iterator it4 = it2;
                        alz alz = a;
                        alz alz2 = a2;
                        arl arl = arl;
                        ArrayList arrayList3 = arrayList2;
                        arl arl2 = arl;
                        obj = obj2;
                        try {
                            arl = new arl(r1.f23097c, valueOf, r1.f23096b, r1.f23099e, ari, r1.f23095a.zzcnd, zzjn, r1.f23095a.zzaty, r1.f23100f, r1.f23104j, r1.f23095a.zzauo, r1.f23095a.zzauw, r1.f23095a.zzcns, r1.f23095a.zzcon, r1.f23109o);
                            r1.f23107m = arl2;
                            aro = r1.f23107m.m27223a(r1.f23101g, r1.f23102h);
                            r1.f23108n.add(aro);
                            if (aro.f15662a == 0) {
                                hx.m19911b("Adapter succeeded.");
                                r1.f23103i.m19365a("mediation_network_succeed", valueOf);
                                arrayList = arrayList3;
                                if (!arrayList.isEmpty()) {
                                    r1.f23103i.m19365a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                }
                                r1.f23103i.m19367a(alz2, "mls");
                                r1.f23103i.m19367a(alz, "ttm");
                                return aro;
                            }
                            alz alz3 = alz;
                            alz alz4 = alz2;
                            arrayList = arrayList3;
                            arrayList.add(valueOf);
                            r1.f23103i.m19367a(alz4, "mlf");
                            if (aro.f15664c != null) {
                                fk.f16060a.post(new aru(r1, aro));
                            }
                            arrayList2 = arrayList;
                            a = alz3;
                            it = it3;
                            it2 = it4;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        obj = obj2;
                    }
                }
                return aro;
            }
        }
        arrayList = arrayList2;
        if (!arrayList.isEmpty()) {
            r1.f23103i.m19365a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new aro(1);
        th3 = th2;
        throw th3;
    }

    public final List<aro> zzlu() {
        return this.f23108n;
    }
}
