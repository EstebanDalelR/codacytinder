package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.o.y */
public final class C6750y implements C5468c {
    public static final Creator<C6750y> CREATOR = new C5503z();
    /* renamed from: a */
    private final int f25290a;
    /* renamed from: b */
    private final boolean f25291b;
    /* renamed from: c */
    private final boolean f25292c;
    /* renamed from: d */
    private final boolean f25293d;
    /* renamed from: e */
    private final boolean f25294e;
    /* renamed from: f */
    private final boolean f25295f;
    /* renamed from: g */
    private final boolean f25296g;
    /* renamed from: h */
    private final boolean f25297h;

    public final int describeContents() {
        return 0;
    }

    C6750y(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f25290a = i;
        this.f25291b = z;
        this.f25292c = z2;
        this.f25293d = z3;
        this.f25294e = z4;
        this.f25295f = z5;
        this.f25296g = z6;
        this.f25297h = z7;
    }

    /* renamed from: a */
    public final int m30071a() {
        return this.f25290a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5503z.m23979a(this, parcel);
    }

    /* renamed from: b */
    public final boolean m30072b() {
        return this.f25291b;
    }

    /* renamed from: c */
    public final boolean m30073c() {
        return this.f25294e;
    }

    /* renamed from: d */
    public final boolean m30074d() {
        return this.f25292c;
    }

    /* renamed from: e */
    public final boolean m30075e() {
        return this.f25295f;
    }

    /* renamed from: f */
    public final boolean m30076f() {
        return this.f25293d;
    }

    /* renamed from: g */
    public final boolean m30077g() {
        return this.f25296g;
    }

    /* renamed from: h */
    public final boolean m30078h() {
        return this.f25297h;
    }
}
