package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.location.C4485e;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

public final class qr implements FusedLocationProviderApi {
    public final PendingResult<Status> flushLocations(GoogleApiClient googleApiClient) {
        return googleApiClient.b(new qw(this, googleApiClient));
    }

    public final android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r1 = com.google.android.gms.location.C4486f.m20356a(r1);
        r1 = r1.m34611c();	 Catch:{ Exception -> 0x0009 }
        return r1;
    L_0x0009:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qr.getLastLocation(com.google.android.gms.common.api.GoogleApiClient):android.location.Location");
    }

    public final com.google.android.gms.location.LocationAvailability getLocationAvailability(com.google.android.gms.common.api.GoogleApiClient r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r1 = com.google.android.gms.location.C4486f.m20356a(r1);
        r1 = r1.m34612o();	 Catch:{ Exception -> 0x0009 }
        return r1;
    L_0x0009:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qr.getLocationAvailability(com.google.android.gms.common.api.GoogleApiClient):com.google.android.gms.location.LocationAvailability");
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.b(new rb(this, googleApiClient, pendingIntent));
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.b(new ra(this, googleApiClient, locationListener));
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, C4485e c4485e) {
        return googleApiClient.b(new qt(this, googleApiClient, c4485e));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.b(new qz(this, googleApiClient, locationRequest, pendingIntent));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        ad.a(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient.b(new qs(this, googleApiClient, locationRequest, locationListener));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        return googleApiClient.b(new qx(this, googleApiClient, locationRequest, locationListener, looper));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, C4485e c4485e, Looper looper) {
        return googleApiClient.b(new qy(this, googleApiClient, locationRequest, c4485e, looper));
    }

    public final PendingResult<Status> setMockLocation(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.b(new qv(this, googleApiClient, location));
    }

    public final PendingResult<Status> setMockMode(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.b(new qu(this, googleApiClient, z));
    }
}
