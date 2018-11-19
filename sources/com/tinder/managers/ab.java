package com.tinder.managers;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsResult;

final /* synthetic */ class ab implements ResultCallback {
    /* renamed from: a */
    private final ManagerFusedLocation f38992a;
    /* renamed from: b */
    private final LocationRequest f38993b;

    ab(ManagerFusedLocation managerFusedLocation, LocationRequest locationRequest) {
        this.f38992a = managerFusedLocation;
        this.f38993b = locationRequest;
    }

    public void onResult(Result result) {
        this.f38992a.a(this.f38993b, (LocationSettingsResult) result);
    }
}
