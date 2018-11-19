package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;

public final class zze extends zzbfm {
    public static final Creator<zze> CREATOR = new C4498r();
    private boolean zziir;
    private long zziis;
    private float zziit;
    private long zziiu;
    private int zziiv;

    public zze() {
        this(true, 50, 0.0f, Format.OFFSET_SAMPLE_RELATIVE, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    zze(boolean z, long j, float f, long j2, int i) {
        this.zziir = z;
        this.zziis = j;
        this.zziit = f;
        this.zziiu = j2;
        this.zziiv = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zze = (zze) obj;
        return this.zziir == zze.zziir && this.zziis == zze.zziis && Float.compare(this.zziit, zze.zziit) == 0 && this.zziiu == zze.zziiu && this.zziiv == zze.zziiv;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zziir), Long.valueOf(this.zziis), Float.valueOf(this.zziit), Long.valueOf(this.zziiu), Integer.valueOf(this.zziiv)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeviceOrientationRequest[mShouldUseMag=");
        stringBuilder.append(this.zziir);
        stringBuilder.append(" mMinimumSamplingPeriodMs=");
        stringBuilder.append(this.zziis);
        stringBuilder.append(" mSmallestAngleChangeRadians=");
        stringBuilder.append(this.zziit);
        if (this.zziiu != Format.OFFSET_SAMPLE_RELATIVE) {
            long elapsedRealtime = this.zziiu - SystemClock.elapsedRealtime();
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
        oj.m20101a(parcel, 1, this.zziir);
        oj.m20092a(parcel, 2, this.zziis);
        oj.m20090a(parcel, 3, this.zziit);
        oj.m20092a(parcel, 4, this.zziiu);
        oj.m20091a(parcel, 5, this.zziiv);
        oj.m20088a(parcel, i);
    }
}
