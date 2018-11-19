package com.google.android.m4b.maps.p108h;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p110j.C5461u.C5460a;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.h.q */
public final class C6691q implements C5427m, C5468c {
    public static final Creator<C6691q> CREATOR = new C5430r();
    /* renamed from: a */
    public static final C6691q f25042a = new C6691q(0);
    /* renamed from: b */
    public static final C6691q f25043b = new C6691q(8);
    /* renamed from: c */
    public static final C6691q f25044c = new C6691q(15);
    /* renamed from: d */
    public static final C6691q f25045d = new C6691q(16);
    /* renamed from: e */
    private static C6691q f25046e = new C6691q(14);
    /* renamed from: f */
    private final int f25047f;
    /* renamed from: g */
    private final int f25048g;
    /* renamed from: h */
    private final String f25049h;
    /* renamed from: i */
    private final PendingIntent f25050i;

    public final int describeContents() {
        return 0;
    }

    C6691q(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f25047f = i;
        this.f25048g = i2;
        this.f25049h = str;
        this.f25050i = pendingIntent;
    }

    public C6691q(int i) {
        this(i, null);
    }

    public C6691q(int i, String str) {
        this(1, i, str, null);
    }

    public C6691q(int i, String str, PendingIntent pendingIntent) {
        this(1, 8, str, null);
    }

    /* renamed from: a */
    final PendingIntent m29849a() {
        return this.f25050i;
    }

    /* renamed from: b */
    public final String m29850b() {
        return this.f25049h;
    }

    /* renamed from: c */
    final int m29851c() {
        return this.f25047f;
    }

    /* renamed from: d */
    public final boolean m29852d() {
        return this.f25048g <= 0;
    }

    /* renamed from: e */
    public final int m29853e() {
        return this.f25048g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25047f), Integer.valueOf(this.f25048g), this.f25049h, this.f25050i});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6691q)) {
            return false;
        }
        C6691q c6691q = (C6691q) obj;
        if (this.f25047f == c6691q.f25047f && this.f25048g == c6691q.f25048g && C5461u.m23766a(this.f25049h, c6691q.f25049h) && C5461u.m23766a(this.f25050i, c6691q.f25050i) != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object obj;
        C5460a a = C5461u.m23765a(this);
        String str = "statusCode";
        if (this.f25049h == null) {
            int i = this.f25048g;
            switch (i) {
                case -1:
                    obj = "SUCCESS_CACHE";
                    break;
                case 0:
                    obj = "SUCCESS";
                    break;
                case 1:
                    obj = "SERVICE_MISSING";
                    break;
                case 2:
                    obj = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    obj = "SERVICE_DISABLED";
                    break;
                case 4:
                    obj = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    obj = "INVALID_ACCOUNT";
                    break;
                case 6:
                    obj = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    obj = "NETWORK_ERROR";
                    break;
                case 8:
                    obj = "INTERNAL_ERROR";
                    break;
                case 9:
                    obj = "SERVICE_INVALID";
                    break;
                case 10:
                    obj = "DEVELOPER_ERROR";
                    break;
                case 11:
                    obj = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i) {
                        case 13:
                            obj = "ERROR_OPERATION_FAILED";
                            break;
                        case 14:
                            obj = "INTERRUPTED";
                            break;
                        case 15:
                            obj = "TIMEOUT";
                            break;
                        case 16:
                            obj = "CANCELED";
                            break;
                        default:
                            switch (i) {
                                case 3000:
                                    obj = "AUTH_API_INVALID_CREDENTIALS";
                                    break;
                                case AdError.MEDIATION_ERROR_CODE /*3001*/:
                                    obj = "AUTH_API_ACCESS_FORBIDDEN";
                                    break;
                                case 3002:
                                    obj = "AUTH_API_CLIENT_ERROR";
                                    break;
                                case 3003:
                                    obj = "AUTH_API_SERVER_ERROR";
                                    break;
                                case 3004:
                                    obj = "AUTH_TOKEN_ERROR";
                                    break;
                                case 3005:
                                    obj = "AUTH_URL_RESOLUTION";
                                    break;
                                default:
                                    StringBuilder stringBuilder = new StringBuilder(32);
                                    stringBuilder.append("unknown status code: ");
                                    stringBuilder.append(i);
                                    obj = stringBuilder.toString();
                                    break;
                            }
                    }
            }
        }
        obj = this.f25049h;
        return a.m23764a(str, obj).m23764a("resolution", this.f25050i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5430r.m23648a(this, parcel, i);
    }
}
