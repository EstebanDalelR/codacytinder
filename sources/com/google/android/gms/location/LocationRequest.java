package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.foursquare.internal.util.C1948m;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;

public final class LocationRequest extends zzbfm implements ReflectedParcelable {
    public static final Creator<LocationRequest> CREATOR = new ae();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    private int mPriority;
    private boolean zzhhr;
    private int zziiv;
    private long zziiz;
    private long zzijq;
    private long zzijr;
    private float zzijs;
    private long zzijt;

    public LocationRequest() {
        this.mPriority = 102;
        this.zzijq = 3600000;
        this.zzijr = 600000;
        this.zzhhr = false;
        this.zziiz = Format.OFFSET_SAMPLE_RELATIVE;
        this.zziiv = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzijs = 0.0f;
        this.zzijt = 0;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.mPriority = i;
        this.zzijq = j;
        this.zzijr = j2;
        this.zzhhr = z;
        this.zziiz = j3;
        this.zziiv = i2;
        this.zzijs = f;
        this.zzijt = j4;
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    private static void zzai(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("invalid interval: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.mPriority == locationRequest.mPriority && this.zzijq == locationRequest.zzijq && this.zzijr == locationRequest.zzijr && this.zzhhr == locationRequest.zzhhr && this.zziiz == locationRequest.zziiz && this.zziiv == locationRequest.zziiv && this.zzijs == locationRequest.zzijs && getMaxWaitTime() == locationRequest.getMaxWaitTime();
    }

    public final long getExpirationTime() {
        return this.zziiz;
    }

    public final long getFastestInterval() {
        return this.zzijr;
    }

    public final long getInterval() {
        return this.zzijq;
    }

    public final long getMaxWaitTime() {
        long j = this.zzijt;
        return j < this.zzijq ? this.zzijq : j;
    }

    public final int getNumUpdates() {
        return this.zziiv;
    }

    public final int getPriority() {
        return this.mPriority;
    }

    public final float getSmallestDisplacement() {
        return this.zzijs;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mPriority), Long.valueOf(this.zzijq), Float.valueOf(this.zzijs), Long.valueOf(this.zzijt)});
    }

    public final boolean isFastestIntervalExplicitlySet() {
        return this.zzhhr;
    }

    public final LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = Format.OFFSET_SAMPLE_RELATIVE;
        if (j <= Format.OFFSET_SAMPLE_RELATIVE - elapsedRealtime) {
            j2 = j + elapsedRealtime;
        }
        this.zziiz = j2;
        if (this.zziiz < 0) {
            this.zziiz = 0;
        }
        return this;
    }

    public final LocationRequest setExpirationTime(long j) {
        this.zziiz = j;
        if (this.zziiz < 0) {
            this.zziiz = 0;
        }
        return this;
    }

    public final LocationRequest setFastestInterval(long j) {
        zzai(j);
        this.zzhhr = true;
        this.zzijr = j;
        return this;
    }

    public final LocationRequest setInterval(long j) {
        zzai(j);
        this.zzijq = j;
        if (!this.zzhhr) {
            this.zzijr = (long) (((double) this.zzijq) / 6.0d);
        }
        return this;
    }

    public final LocationRequest setMaxWaitTime(long j) {
        zzai(j);
        this.zzijt = j;
        return this;
    }

    public final LocationRequest setNumUpdates(int i) {
        if (i <= 0) {
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("invalid numUpdates: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.zziiv = i;
        return this;
    }

    public final LocationRequest setPriority(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                this.mPriority = i;
                return this;
            default:
                StringBuilder stringBuilder = new StringBuilder(28);
                stringBuilder.append("invalid quality: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final LocationRequest setSmallestDisplacement(float f) {
        if (f < 0.0f) {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("invalid displacement: ");
            stringBuilder.append(f);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.zzijs = f;
        return this;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[");
        switch (this.mPriority) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        stringBuilder.append(str);
        if (this.mPriority != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.zzijq);
            stringBuilder.append("ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.zzijr);
        stringBuilder.append("ms");
        if (this.zzijt > this.zzijq) {
            stringBuilder.append(" maxWait=");
            stringBuilder.append(this.zzijt);
            stringBuilder.append("ms");
        }
        if (this.zzijs > 0.0f) {
            stringBuilder.append(" smallestDisplacement=");
            stringBuilder.append(this.zzijs);
            stringBuilder.append(C1948m.f5228a);
        }
        if (this.zziiz != Format.OFFSET_SAMPLE_RELATIVE) {
            long elapsedRealtime = this.zziiz - SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(elapsedRealtime);
            stringBuilder.append("ms");
        }
        if (this.zziiv != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            stringBuilder.append(" num=");
            stringBuilder.append(this.zziiv);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.mPriority);
        oj.m20092a(parcel, 2, this.zzijq);
        oj.m20092a(parcel, 3, this.zzijr);
        oj.m20101a(parcel, 4, this.zzhhr);
        oj.m20092a(parcel, 5, this.zziiz);
        oj.m20091a(parcel, 6, this.zziiv);
        oj.m20090a(parcel, 7, this.zzijs);
        oj.m20092a(parcel, 8, this.zzijt);
        oj.m20088a(parcel, i);
    }
}
