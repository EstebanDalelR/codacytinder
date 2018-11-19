package com.google.android.m4b.maps.p110j;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p110j.C5455p.C6705a;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.j.y */
public final class C6713y implements C5468c {
    public static final Creator<C6713y> CREATOR = new C5464z();
    /* renamed from: a */
    final int f25110a;
    /* renamed from: b */
    IBinder f25111b;
    /* renamed from: c */
    private C6676a f25112c;
    /* renamed from: d */
    private boolean f25113d;
    /* renamed from: e */
    private boolean f25114e;

    public final int describeContents() {
        return 0;
    }

    C6713y(int i, IBinder iBinder, C6676a c6676a, boolean z, boolean z2) {
        this.f25110a = i;
        this.f25111b = iBinder;
        this.f25112c = c6676a;
        this.f25113d = z;
        this.f25114e = z2;
    }

    private C6713y(C6676a c6676a) {
        this(1, null, c6676a, false, false);
    }

    public C6713y(int i) {
        this(new C6676a(8, null));
    }

    /* renamed from: a */
    public final C5455p m29969a() {
        return C6705a.m29915a(this.f25111b);
    }

    /* renamed from: b */
    public final C6676a m29970b() {
        return this.f25112c;
    }

    /* renamed from: c */
    public final boolean m29971c() {
        return this.f25113d;
    }

    /* renamed from: d */
    public final boolean m29972d() {
        return this.f25114e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5464z.m23775a(this, parcel, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6713y)) {
            return false;
        }
        C6713y c6713y = (C6713y) obj;
        return this.f25112c.equals(c6713y.f25112c) && C6705a.m29915a(this.f25111b).equals(C6705a.m29915a(c6713y.f25111b)) != null;
    }
}
