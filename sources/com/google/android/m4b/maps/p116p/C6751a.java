package com.google.android.m4b.maps.p116p;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.p.a */
public final class C6751a implements C5468c {
    public static final Creator<C6751a> CREATOR = new C5504b();
    /* renamed from: a */
    public static final C6751a f25298a = new C6751a(true, null);
    /* renamed from: b */
    final int f25299b;
    /* renamed from: c */
    public final boolean f25300c;
    /* renamed from: d */
    public final String f25301d;

    public final int describeContents() {
        return 0;
    }

    C6751a(int i, boolean z, String str) {
        this.f25299b = i;
        this.f25300c = z;
        this.f25301d = str;
    }

    private C6751a(boolean z, String str) {
        this(1, true, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5504b.m23980a(this, parcel);
    }
}
