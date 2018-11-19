package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.u */
public final class C6748u implements C5468c {
    public static final Creator<C6748u> CREATOR = new C5501v();
    /* renamed from: a */
    private final int f25282a;
    /* renamed from: b */
    private final List<C6745p> f25283b;
    /* renamed from: c */
    private final boolean f25284c;
    /* renamed from: d */
    private final boolean f25285d;
    /* renamed from: e */
    private final boolean f25286e;

    public final int describeContents() {
        return 0;
    }

    C6748u(int i, List<C6745p> list, boolean z, boolean z2, boolean z3) {
        this.f25282a = i;
        this.f25283b = list;
        this.f25284c = z;
        this.f25285d = z2;
        this.f25286e = z3;
    }

    /* renamed from: a */
    public final int m30063a() {
        return this.f25282a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5501v.m23977a(this, parcel);
    }

    /* renamed from: b */
    public final List<C6745p> m30064b() {
        return Collections.unmodifiableList(this.f25283b);
    }

    /* renamed from: c */
    public final boolean m30065c() {
        return this.f25284c;
    }

    /* renamed from: d */
    public final boolean m30066d() {
        return this.f25285d;
    }

    /* renamed from: e */
    public final boolean m30067e() {
        return this.f25286e;
    }
}
