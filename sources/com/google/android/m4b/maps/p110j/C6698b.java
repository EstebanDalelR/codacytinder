package com.google.android.m4b.maps.p110j;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.j.b */
public final class C6698b implements C5468c {
    public static final Creator<C6698b> CREATOR = new C5436c();
    /* renamed from: a */
    final int f25064a;
    /* renamed from: b */
    final IBinder f25065b;
    /* renamed from: c */
    final C6690o[] f25066c;

    public final int describeContents() {
        return 0;
    }

    C6698b(int i, IBinder iBinder, C6690o[] c6690oArr) {
        this.f25064a = i;
        this.f25065b = iBinder;
        this.f25066c = c6690oArr;
    }

    public C6698b(C5455p c5455p, Set<C6690o> set) {
        this(1, c5455p.asBinder(), (C6690o[]) set.toArray(new C6690o[set.size()]));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5436c.m23662a(this, parcel, i);
    }
}
