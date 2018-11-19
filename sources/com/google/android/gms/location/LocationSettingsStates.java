package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.ok;
import com.google.android.gms.internal.zzbfm;

public final class LocationSettingsStates extends zzbfm {
    public static final Creator<LocationSettingsStates> CREATOR = new C4491l();
    private final boolean zzikf;
    private final boolean zzikg;
    private final boolean zzikh;
    private final boolean zziki;
    private final boolean zzikj;
    private final boolean zzikk;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.zzikf = z;
        this.zzikg = z2;
        this.zzikh = z3;
        this.zziki = z4;
        this.zzikj = z5;
        this.zzikk = z6;
    }

    public static LocationSettingsStates fromIntent(Intent intent) {
        return (LocationSettingsStates) ok.m20113a(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public final boolean isBlePresent() {
        return this.zzikk;
    }

    public final boolean isBleUsable() {
        return this.zzikh;
    }

    public final boolean isGpsPresent() {
        return this.zziki;
    }

    public final boolean isGpsUsable() {
        return this.zzikf;
    }

    public final boolean isLocationPresent() {
        if (!this.zziki) {
            if (!this.zzikj) {
                return false;
            }
        }
        return true;
    }

    public final boolean isLocationUsable() {
        if (!this.zzikf) {
            if (!this.zzikg) {
                return false;
            }
        }
        return true;
    }

    public final boolean isNetworkLocationPresent() {
        return this.zzikj;
    }

    public final boolean isNetworkLocationUsable() {
        return this.zzikg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20101a(parcel, 1, isGpsUsable());
        oj.m20101a(parcel, 2, isNetworkLocationUsable());
        oj.m20101a(parcel, 3, isBleUsable());
        oj.m20101a(parcel, 4, isGpsPresent());
        oj.m20101a(parcel, 5, isNetworkLocationPresent());
        oj.m20101a(parcel, 6, isBlePresent());
        oj.m20088a(parcel, i);
    }
}
