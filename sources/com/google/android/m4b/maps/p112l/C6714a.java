package com.google.android.m4b.maps.p112l;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.l.a */
public final class C6714a implements C5468c {
    public static final Creator<C6714a> CREATOR = new C5469b();
    /* renamed from: a */
    final int f25115a;
    /* renamed from: b */
    private final long f25116b;
    /* renamed from: c */
    private int f25117c;
    /* renamed from: d */
    private final String f25118d;
    /* renamed from: e */
    private final String f25119e;
    /* renamed from: f */
    private final String f25120f;
    /* renamed from: g */
    private final String f25121g;
    /* renamed from: h */
    private final String f25122h;
    /* renamed from: i */
    private final String f25123i;
    /* renamed from: j */
    private final long f25124j;
    /* renamed from: k */
    private final long f25125k;
    /* renamed from: l */
    private long f25126l;

    public final int describeContents() {
        return 0;
    }

    C6714a(int i, long j, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this.f25115a = i;
        this.f25116b = j;
        this.f25117c = i2;
        this.f25118d = str;
        this.f25119e = str2;
        this.f25120f = str3;
        this.f25121g = str4;
        this.f25126l = -1;
        this.f25122h = str5;
        this.f25123i = str6;
        this.f25124j = j2;
        this.f25125k = j3;
    }

    public C6714a(long j, int i, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this(1, j, i, str, str2, str3, str4, str5, str6, j2, j3);
    }

    /* renamed from: a */
    public final long m29973a() {
        return this.f25116b;
    }

    /* renamed from: b */
    public final int m29974b() {
        return this.f25117c;
    }

    /* renamed from: c */
    public final String m29975c() {
        return this.f25118d;
    }

    /* renamed from: d */
    public final String m29976d() {
        return this.f25119e;
    }

    /* renamed from: e */
    public final String m29977e() {
        return this.f25120f;
    }

    /* renamed from: f */
    public final String m29978f() {
        return this.f25121g;
    }

    /* renamed from: g */
    public final String m29979g() {
        return this.f25122h;
    }

    /* renamed from: h */
    public final String m29980h() {
        return this.f25123i;
    }

    /* renamed from: i */
    public final long m29981i() {
        return this.f25125k;
    }

    /* renamed from: j */
    public final long m29982j() {
        return this.f25124j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5469b.m23818a(this, parcel);
    }
}
