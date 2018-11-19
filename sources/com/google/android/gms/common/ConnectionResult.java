package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;

public final class ConnectionResult extends zzbfm {
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final Creator<ConnectionResult> CREATOR = new C2488e();
    public static final int DEVELOPER_ERROR = 10;
    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final ConnectionResult zzfkr = new ConnectionResult(0);
    private final int zzcd;
    private int zzeck;
    private final PendingIntent zzeeo;
    private final String zzfks;

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.zzeck = i;
        this.zzcd = i2;
        this.zzeeo = pendingIntent;
        this.zzfks = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    static String getStatusString(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == DRIVE_EXTERNAL_STORAGE_REQUIRED) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder stringBuilder = new StringBuilder(31);
                        stringBuilder.append("UNKNOWN_ERROR_CODE(");
                        stringBuilder.append(i);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.zzcd == connectionResult.zzcd && C2507w.m9173a(this.zzeeo, connectionResult.zzeeo) && C2507w.m9173a(this.zzfks, connectionResult.zzfks);
    }

    public final int getErrorCode() {
        return this.zzcd;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.zzfks;
    }

    @Nullable
    public final PendingIntent getResolution() {
        return this.zzeeo;
    }

    public final boolean hasResolution() {
        return (this.zzcd == 0 || this.zzeeo == null) ? false : true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzcd), this.zzeeo, this.zzfks});
    }

    public final boolean isSuccess() {
        return this.zzcd == 0;
    }

    public final void startResolutionForResult(Activity activity, int i) throws SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.zzeeo.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final String toString() {
        return C2507w.m9172a(this).m9174a("statusCode", getStatusString(this.zzcd)).m9174a("resolution", this.zzeeo).m9174a("message", this.zzfks).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.zzeck);
        oj.a(parcel, 2, getErrorCode());
        oj.a(parcel, 3, getResolution(), i, false);
        oj.a(parcel, 4, getErrorMessage(), false);
        oj.a(parcel, a);
    }
}
