package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class LocationSettingsResult extends zzbfm implements Result {
    public static final Creator<LocationSettingsResult> CREATOR = new C4490k();
    private final Status mStatus;
    private final LocationSettingsStates zzike;

    public LocationSettingsResult(Status status) {
        this(status, null);
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.mStatus = status;
        this.zzike = locationSettingsStates;
    }

    public final LocationSettingsStates getLocationSettingsStates() {
        return this.zzike;
    }

    public final Status getStatus() {
        return this.mStatus;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20096a(parcel, 1, getStatus(), i, false);
        oj.m20096a(parcel, 2, getLocationSettingsStates(), i, false);
        oj.m20088a(parcel, a);
    }
}
