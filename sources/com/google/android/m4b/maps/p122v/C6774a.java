package com.google.android.m4b.maps.p122v;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.v.a */
public final class C6774a implements C5468c {
    public static final Creator<C6774a> CREATOR = new C5525b();
    /* renamed from: a */
    final int f25345a;

    public final int describeContents() {
        return 0;
    }

    C6774a(int i) {
        this.f25345a = i;
    }

    public C6774a() {
        this(1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5525b.m24034a(this, parcel);
    }
}
