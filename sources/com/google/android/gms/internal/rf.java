package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest.C4481a;
import com.google.android.gms.location.zzag;
import java.util.List;

public final class rf implements GeofencingApi {
    /* renamed from: a */
    private final PendingResult<Status> m27452a(GoogleApiClient googleApiClient, zzag zzag) {
        return googleApiClient.b(new rh(this, googleApiClient, zzag));
    }

    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return googleApiClient.b(new rg(this, googleApiClient, geofencingRequest, pendingIntent));
    }

    @Deprecated
    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, List<Geofence> list, PendingIntent pendingIntent) {
        C4481a c4481a = new C4481a();
        c4481a.m20345a((List) list);
        c4481a.m20343a(5);
        return addGeofences(googleApiClient, c4481a.m20346a(), pendingIntent);
    }

    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return m27452a(googleApiClient, zzag.zzb(pendingIntent));
    }

    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, List<String> list) {
        return m27452a(googleApiClient, zzag.zzac(list));
    }
}
