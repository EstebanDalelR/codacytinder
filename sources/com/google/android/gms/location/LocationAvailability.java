package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;

public final class LocationAvailability extends zzbfm implements ReflectedParcelable {
    public static final Creator<LocationAvailability> CREATOR = new ad();
    @Deprecated
    private int zzijl;
    @Deprecated
    private int zzijm;
    private long zzijn;
    private int zzijo;
    private zzae[] zzijp;

    LocationAvailability(int i, int i2, int i3, long j, zzae[] zzaeArr) {
        this.zzijo = i;
        this.zzijl = i2;
        this.zzijm = i3;
        this.zzijn = j;
        this.zzijp = zzaeArr;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        return !hasLocationAvailability(intent) ? null : (LocationAvailability) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public static boolean hasLocationAvailability(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.zzijl == locationAvailability.zzijl && this.zzijm == locationAvailability.zzijm && this.zzijn == locationAvailability.zzijn && this.zzijo == locationAvailability.zzijo && Arrays.equals(this.zzijp, locationAvailability.zzijp);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzijo), Integer.valueOf(this.zzijl), Integer.valueOf(this.zzijm), Long.valueOf(this.zzijn), this.zzijp});
    }

    public final boolean isLocationAvailable() {
        return this.zzijo < AdError.NETWORK_ERROR_CODE;
    }

    public final String toString() {
        boolean isLocationAvailable = isLocationAvailable();
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("LocationAvailability[isLocationAvailable: ");
        stringBuilder.append(isLocationAvailable);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzijl);
        oj.m20091a(parcel, 2, this.zzijm);
        oj.m20092a(parcel, 3, this.zzijn);
        oj.m20091a(parcel, 4, this.zzijo);
        oj.m20104a(parcel, 5, this.zzijp, i, false);
        oj.m20088a(parcel, a);
    }
}
