package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.o.m */
public final class C6744m implements C5468c {
    public static final C5496n CREATOR = new C5496n();
    /* renamed from: a */
    int f25265a;
    /* renamed from: b */
    int f25266b;
    /* renamed from: c */
    long f25267c;
    /* renamed from: d */
    int f25268d;
    /* renamed from: e */
    private final int f25269e;

    public final int describeContents() {
        return 0;
    }

    C6744m(int i, int i2, int i3, int i4, long j) {
        this.f25269e = i;
        this.f25268d = i2;
        this.f25265a = i3;
        this.f25266b = i4;
        this.f25267c = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5496n.m23971a(this, parcel);
    }

    /* renamed from: a */
    final int m30053a() {
        return this.f25269e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25268d), Integer.valueOf(this.f25265a), Integer.valueOf(this.f25266b), Long.valueOf(this.f25267c)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6744m)) {
            return false;
        }
        C6744m c6744m = (C6744m) obj;
        if (this.f25268d == c6744m.f25268d && this.f25265a == c6744m.f25265a && this.f25266b == c6744m.f25266b && this.f25267c == c6744m.f25267c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        boolean z = this.f25268d < AdError.NETWORK_ERROR_CODE;
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("LocationAvailability[isLocationAvailable: ");
        stringBuilder.append(z);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
