package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.bb;
import com.google.android.gms.common.api.internal.bd;
import com.google.android.gms.common.api.internal.zzn;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.location.C4485e;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzag;

public final class rw extends ql {
    /* renamed from: e */
    private final rp f29178e;

    public rw(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, str, av.a(context));
    }

    public rw(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, av avVar) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, avVar);
        this.f29178e = new rp(context, this.d);
    }

    /* renamed from: a */
    public final void m34597a(long j, PendingIntent pendingIntent) throws RemoteException {
        l();
        ad.a(pendingIntent);
        ad.b(j >= 0, "detectionIntervalMillis must be >= 0");
        ((zzcez) m()).zza(j, true, pendingIntent);
    }

    /* renamed from: a */
    public final void m34598a(PendingIntent pendingIntent) throws RemoteException {
        l();
        ad.a(pendingIntent);
        ((zzcez) m()).zzc(pendingIntent);
    }

    /* renamed from: a */
    public final void m34599a(PendingIntent pendingIntent, zzceu zzceu) throws RemoteException {
        this.f29178e.m20156a(pendingIntent, zzceu);
    }

    /* renamed from: a */
    public final void m34600a(Location location) throws RemoteException {
        this.f29178e.m20157a(location);
    }

    /* renamed from: a */
    public final void m34601a(bd<LocationListener> bdVar, zzceu zzceu) throws RemoteException {
        this.f29178e.m20158a((bd) bdVar, zzceu);
    }

    /* renamed from: a */
    public final void m34602a(zzceu zzceu) throws RemoteException {
        this.f29178e.m20159a(zzceu);
    }

    /* renamed from: a */
    public final void m34603a(zzcfo zzcfo, bb<C4485e> bbVar, zzceu zzceu) throws RemoteException {
        synchronized (this.f29178e) {
            this.f29178e.m20160a(zzcfo, (bb) bbVar, zzceu);
        }
    }

    /* renamed from: a */
    public final void m34604a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzn<Status> zzn) throws RemoteException {
        l();
        ad.a(geofencingRequest, "geofencingRequest can't be null.");
        ad.a(pendingIntent, "PendingIntent must be specified.");
        ad.a(zzn, "ResultHolder not provided.");
        ((zzcez) m()).zza(geofencingRequest, pendingIntent, new rx(zzn));
    }

    /* renamed from: a */
    public final void m34605a(LocationRequest locationRequest, PendingIntent pendingIntent, zzceu zzceu) throws RemoteException {
        this.f29178e.m20161a(locationRequest, pendingIntent, zzceu);
    }

    /* renamed from: a */
    public final void m34606a(LocationRequest locationRequest, bb<LocationListener> bbVar, zzceu zzceu) throws RemoteException {
        synchronized (this.f29178e) {
            this.f29178e.m20162a(locationRequest, (bb) bbVar, zzceu);
        }
    }

    /* renamed from: a */
    public final void m34607a(LocationSettingsRequest locationSettingsRequest, zzn<LocationSettingsResult> zzn, String str) throws RemoteException {
        l();
        boolean z = false;
        ad.b(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        if (zzn != null) {
            z = true;
        }
        ad.b(z, "listener can't be null.");
        ((zzcez) m()).zza(locationSettingsRequest, new rz(zzn), str);
    }

    /* renamed from: a */
    public final void m34608a(zzag zzag, zzn<Status> zzn) throws RemoteException {
        l();
        ad.a(zzag, "removeGeofencingRequest can't be null.");
        ad.a(zzn, "ResultHolder not provided.");
        ((zzcez) m()).zza(zzag, new ry(zzn));
    }

    /* renamed from: a */
    public final void m34609a(boolean z) throws RemoteException {
        this.f29178e.m20163a(z);
    }

    /* renamed from: b */
    public final void m34610b(bd<C4485e> bdVar, zzceu zzceu) throws RemoteException {
        this.f29178e.m20165b(bdVar, zzceu);
    }

    /* renamed from: c */
    public final Location m34611c() throws RemoteException {
        return this.f29178e.m20155a();
    }

    public final void disconnect() {
        synchronized (this.f29178e) {
            if (isConnected()) {
                try {
                    this.f29178e.m20166c();
                    this.f29178e.m20167d();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    /* renamed from: o */
    public final LocationAvailability m34612o() throws RemoteException {
        return this.f29178e.m20164b();
    }
}
