package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzag;

public final class rn extends aau implements zzcez {
    rn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void zza(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel a = m18799a();
        a.writeLong(j);
        aaw.m18806a(a, true);
        aaw.m18805a(a, (Parcelable) pendingIntent);
        m18801b(5, a);
    }

    public final void zza(zzcdz zzcdz) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzcdz);
        m18801b(75, a);
    }

    public final void zza(zzceu zzceu) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzceu);
        m18801b(67, a);
    }

    public final void zza(zzcfq zzcfq) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzcfq);
        m18801b(59, a);
    }

    public final void zza(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzcex zzcex) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) geofencingRequest);
        aaw.m18805a(a, (Parcelable) pendingIntent);
        aaw.m18804a(a, (IInterface) zzcex);
        m18801b(57, a);
    }

    public final void zza(LocationSettingsRequest locationSettingsRequest, zzcfb zzcfb, String str) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) locationSettingsRequest);
        aaw.m18804a(a, (IInterface) zzcfb);
        a.writeString(str);
        m18801b(63, a);
    }

    public final void zza(zzag zzag, zzcex zzcex) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzag);
        aaw.m18804a(a, (IInterface) zzcex);
        m18801b(74, a);
    }

    public final void zzbj(boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18806a(a, z);
        m18801b(12, a);
    }

    public final void zzc(PendingIntent pendingIntent) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) pendingIntent);
        m18801b(6, a);
    }

    public final void zzc(Location location) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) location);
        m18801b(13, a);
    }

    public final Location zzif(String str) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        Parcel a2 = m18800a(21, a);
        Location location = (Location) aaw.m18803a(a2, Location.CREATOR);
        a2.recycle();
        return location;
    }

    public final LocationAvailability zzig(String str) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        Parcel a2 = m18800a(34, a);
        LocationAvailability locationAvailability = (LocationAvailability) aaw.m18803a(a2, LocationAvailability.CREATOR);
        a2.recycle();
        return locationAvailability;
    }
}
