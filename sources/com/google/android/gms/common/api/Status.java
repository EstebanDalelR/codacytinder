package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;

public final class Status extends zzbfm implements Result, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C2482l();
    public static final Status zzfni = new Status(0);
    public static final Status zzfnj = new Status(14);
    public static final Status zzfnk = new Status(8);
    public static final Status zzfnl = new Status(15);
    public static final Status zzfnm = new Status(16);
    public static final Status zzfnn = new Status(17);
    private static Status zzfno = new Status(18);
    private final int zzcd;
    private int zzeck;
    @Nullable
    private final PendingIntent zzeeo;
    @Nullable
    private final String zzfks;

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this.zzeck = i;
        this.zzcd = i2;
        this.zzfks = str;
        this.zzeeo = pendingIntent;
    }

    public Status(int i, @Nullable String str) {
        this(1, i, str, null);
    }

    public Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.zzeck == status.zzeck && this.zzcd == status.zzcd && C2507w.m9173a(this.zzfks, status.zzfks) && C2507w.m9173a(this.zzeeo, status.zzeeo);
    }

    public final PendingIntent getResolution() {
        return this.zzeeo;
    }

    public final Status getStatus() {
        return this;
    }

    public final int getStatusCode() {
        return this.zzcd;
    }

    @Nullable
    public final String getStatusMessage() {
        return this.zzfks;
    }

    public final boolean hasResolution() {
        return this.zzeeo != null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzeck), Integer.valueOf(this.zzcd), this.zzfks, this.zzeeo});
    }

    public final boolean isCanceled() {
        return this.zzcd == 16;
    }

    public final boolean isInterrupted() {
        return this.zzcd == 14;
    }

    public final boolean isSuccess() {
        return this.zzcd <= 0;
    }

    public final void startResolutionForResult(Activity activity, int i) throws SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.zzeeo.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final String toString() {
        return C2507w.m9172a(this).m9174a("statusCode", zzagx()).m9174a("resolution", this.zzeeo).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, getStatusCode());
        oj.a(parcel, 2, getStatusMessage(), false);
        oj.a(parcel, 3, this.zzeeo, i, false);
        oj.a(parcel, AdError.NETWORK_ERROR_CODE, this.zzeck);
        oj.a(parcel, a);
    }

    public final String zzagx() {
        return this.zzfks != null ? this.zzfks : C2465a.m8890a(this.zzcd);
    }
}
