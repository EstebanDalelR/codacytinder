package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.bb;
import com.google.android.gms.common.api.internal.bd;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.location.C4485e;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzp;
import com.google.android.gms.location.zzs;
import java.util.HashMap;
import java.util.Map;

public final class rp {
    /* renamed from: a */
    private final zzcfu<zzcez> f16507a;
    /* renamed from: b */
    private final Context f16508b;
    /* renamed from: c */
    private ContentProviderClient f16509c = null;
    /* renamed from: d */
    private boolean f16510d = false;
    /* renamed from: e */
    private final Map<bd<LocationListener>, ru> f16511e = new HashMap();
    /* renamed from: f */
    private final Map<bd<Object>, rt> f16512f = new HashMap();
    /* renamed from: g */
    private final Map<bd<C4485e>, rq> f16513g = new HashMap();

    public rp(Context context, zzcfu<zzcez> zzcfu) {
        this.f16508b = context;
        this.f16507a = zzcfu;
    }

    /* renamed from: a */
    private final ru m20153a(bb<LocationListener> bbVar) {
        ru ruVar;
        synchronized (this.f16511e) {
            ruVar = (ru) this.f16511e.get(bbVar.b());
            if (ruVar == null) {
                ruVar = new ru(bbVar);
            }
            this.f16511e.put(bbVar.b(), ruVar);
        }
        return ruVar;
    }

    /* renamed from: b */
    private final rq m20154b(bb<C4485e> bbVar) {
        rq rqVar;
        synchronized (this.f16513g) {
            rqVar = (rq) this.f16513g.get(bbVar.b());
            if (rqVar == null) {
                rqVar = new rq(bbVar);
            }
            this.f16513g.put(bbVar.b(), rqVar);
        }
        return rqVar;
    }

    /* renamed from: a */
    public final Location m20155a() throws RemoteException {
        this.f16507a.zzakm();
        return ((zzcez) this.f16507a.zzakn()).zzif(this.f16508b.getPackageName());
    }

    /* renamed from: a */
    public final void m20156a(PendingIntent pendingIntent, zzceu zzceu) throws RemoteException {
        this.f16507a.zzakm();
        ((zzcez) this.f16507a.zzakn()).zza(new zzcfq(2, null, null, pendingIntent, null, zzceu != null ? zzceu.asBinder() : null));
    }

    /* renamed from: a */
    public final void m20157a(Location location) throws RemoteException {
        this.f16507a.zzakm();
        ((zzcez) this.f16507a.zzakn()).zzc(location);
    }

    /* renamed from: a */
    public final void m20158a(bd<LocationListener> bdVar, zzceu zzceu) throws RemoteException {
        this.f16507a.zzakm();
        ad.a(bdVar, "Invalid null listener key");
        synchronized (this.f16511e) {
            zzs zzs = (ru) this.f16511e.remove(bdVar);
            if (zzs != null) {
                zzs.m31652a();
                ((zzcez) this.f16507a.zzakn()).zza(zzcfq.zza(zzs, zzceu));
            }
        }
    }

    /* renamed from: a */
    public final void m20159a(zzceu zzceu) throws RemoteException {
        this.f16507a.zzakm();
        ((zzcez) this.f16507a.zzakn()).zza(zzceu);
    }

    /* renamed from: a */
    public final void m20160a(zzcfo zzcfo, bb<C4485e> bbVar, zzceu zzceu) throws RemoteException {
        this.f16507a.zzakm();
        ((zzcez) this.f16507a.zzakn()).zza(new zzcfq(1, zzcfo, null, null, m20154b(bbVar).asBinder(), zzceu != null ? zzceu.asBinder() : null));
    }

    /* renamed from: a */
    public final void m20161a(LocationRequest locationRequest, PendingIntent pendingIntent, zzceu zzceu) throws RemoteException {
        this.f16507a.zzakm();
        ((zzcez) this.f16507a.zzakn()).zza(new zzcfq(1, zzcfo.zza(locationRequest), null, pendingIntent, null, zzceu != null ? zzceu.asBinder() : null));
    }

    /* renamed from: a */
    public final void m20162a(LocationRequest locationRequest, bb<LocationListener> bbVar, zzceu zzceu) throws RemoteException {
        this.f16507a.zzakm();
        ((zzcez) this.f16507a.zzakn()).zza(new zzcfq(1, zzcfo.zza(locationRequest), m20153a((bb) bbVar).asBinder(), null, null, zzceu != null ? zzceu.asBinder() : null));
    }

    /* renamed from: a */
    public final void m20163a(boolean z) throws RemoteException {
        this.f16507a.zzakm();
        ((zzcez) this.f16507a.zzakn()).zzbj(z);
        this.f16510d = z;
    }

    /* renamed from: b */
    public final LocationAvailability m20164b() throws RemoteException {
        this.f16507a.zzakm();
        return ((zzcez) this.f16507a.zzakn()).zzig(this.f16508b.getPackageName());
    }

    /* renamed from: b */
    public final void m20165b(bd<C4485e> bdVar, zzceu zzceu) throws RemoteException {
        this.f16507a.zzakm();
        ad.a(bdVar, "Invalid null listener key");
        synchronized (this.f16513g) {
            zzp zzp = (rq) this.f16513g.remove(bdVar);
            if (zzp != null) {
                zzp.m31651a();
                ((zzcez) this.f16507a.zzakn()).zza(zzcfq.zza(zzp, zzceu));
            }
        }
    }

    /* renamed from: c */
    public final void m20166c() throws RemoteException {
        synchronized (this.f16511e) {
            for (zzs zzs : this.f16511e.values()) {
                if (zzs != null) {
                    ((zzcez) this.f16507a.zzakn()).zza(zzcfq.zza(zzs, null));
                }
            }
            this.f16511e.clear();
        }
        synchronized (this.f16513g) {
            for (zzp zzp : this.f16513g.values()) {
                if (zzp != null) {
                    ((zzcez) this.f16507a.zzakn()).zza(zzcfq.zza(zzp, null));
                }
            }
            this.f16513g.clear();
        }
        synchronized (this.f16512f) {
            for (rt rtVar : this.f16512f.values()) {
                if (rtVar != null) {
                    ((zzcez) this.f16507a.zzakn()).zza(new zzcdz(2, null, rtVar.asBinder(), null));
                }
            }
            this.f16512f.clear();
        }
    }

    /* renamed from: d */
    public final void m20167d() throws RemoteException {
        if (this.f16510d) {
            m20163a(false);
        }
    }
}
