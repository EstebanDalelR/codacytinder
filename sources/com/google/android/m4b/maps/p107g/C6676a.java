package com.google.android.m4b.maps.p107g;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p110j.C5461u.C5460a;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.g.a */
public final class C6676a implements C5468c {
    public static final Creator<C6676a> CREATOR = new C5369b();
    /* renamed from: a */
    public static final C6676a f24965a = new C6676a(0, null);
    /* renamed from: b */
    final int f24966b;
    /* renamed from: c */
    private final int f24967c;
    /* renamed from: d */
    private final PendingIntent f24968d;

    public final int describeContents() {
        return 0;
    }

    C6676a(int i, int i2, PendingIntent pendingIntent) {
        this.f24966b = i;
        this.f24967c = i2;
        this.f24968d = pendingIntent;
    }

    public C6676a(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent);
    }

    /* renamed from: a */
    public final void m29744a(Activity activity, int i) {
        if (m29745a()) {
            activity.startIntentSenderForResult(this.f24968d.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    /* renamed from: a */
    public final boolean m29745a() {
        return (this.f24967c == 0 || this.f24968d == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean m29746b() {
        return this.f24967c == 0;
    }

    /* renamed from: c */
    public final int m29747c() {
        return this.f24967c;
    }

    /* renamed from: d */
    public final PendingIntent m29748d() {
        return this.f24968d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6676a)) {
            return false;
        }
        C6676a c6676a = (C6676a) obj;
        return this.f24967c == c6676a.f24967c && C5461u.m23766a(this.f24968d, c6676a.f24968d) != null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24967c), this.f24968d});
    }

    public final String toString() {
        Object obj;
        C5460a a = C5461u.m23765a(this);
        String str = "statusCode";
        int i = this.f24967c;
        switch (i) {
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
            case 13:
                obj = "CANCELED";
                break;
            case 14:
                obj = "TIMEOUT";
                break;
            case 15:
                obj = "INTERRUPTED";
                break;
            case 16:
                obj = "API_UNAVAILABLE";
                break;
            case 17:
                obj = "SIGN_IN_FAILED";
                break;
            case 18:
                obj = "SERVICE_UPDATING";
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("UNKNOWN_ERROR_CODE(");
                stringBuilder.append(i);
                stringBuilder.append(")");
                obj = stringBuilder.toString();
                break;
        }
        return a.m23764a(str, obj).m23764a("resolution", this.f24968d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5369b.m23567a(this, parcel, i);
    }
}
