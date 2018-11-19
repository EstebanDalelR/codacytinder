package com.google.android.m4b.maps.p110j;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.j.aa */
public final class aa implements C5468c {
    public static final Creator<aa> CREATOR = new ab();
    /* renamed from: a */
    final int f25058a;
    /* renamed from: b */
    final IBinder f25059b;
    /* renamed from: c */
    private final int f25060c;
    /* renamed from: d */
    private final C6690o[] f25061d;
    /* renamed from: e */
    private final Bundle f25062e;
    /* renamed from: f */
    private final String f25063f;

    public final int describeContents() {
        return 0;
    }

    aa(int i, int i2, IBinder iBinder, C6690o[] c6690oArr, Bundle bundle, String str) {
        this.f25058a = i;
        this.f25060c = i2;
        this.f25059b = iBinder;
        this.f25061d = c6690oArr;
        this.f25062e = bundle;
        this.f25063f = str;
    }

    public aa(C5455p c5455p, C6690o[] c6690oArr, String str, Bundle bundle) {
        int i = C5398g.f20336a;
        if (c5455p == null) {
            c5455p = null;
        } else {
            c5455p = c5455p.asBinder();
        }
        this(1, i, c5455p, c6690oArr, bundle, str);
    }

    /* renamed from: a */
    public final int m29868a() {
        return this.f25060c;
    }

    /* renamed from: b */
    public final C6690o[] m29869b() {
        return this.f25061d;
    }

    /* renamed from: c */
    public final String m29870c() {
        return this.f25063f;
    }

    /* renamed from: d */
    public final Bundle m29871d() {
        return this.f25062e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ab.m23661a(this, parcel, i);
    }
}
