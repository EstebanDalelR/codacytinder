package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5468c;
import com.google.android.m4b.maps.p117q.C6763n;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.g */
public final class C6738g implements C5468c {
    public static final Creator<C6738g> CREATOR = new C5492h();
    /* renamed from: a */
    private final int f25254a;
    /* renamed from: b */
    private final List<C6763n> f25255b;
    /* renamed from: c */
    private final int f25256c;

    public final int describeContents() {
        return 0;
    }

    C6738g(int i, List<C6763n> list, int i2) {
        this.f25254a = i;
        this.f25255b = list;
        this.f25256c = i2;
    }

    /* renamed from: a */
    public final int m30043a() {
        return this.f25254a;
    }

    /* renamed from: b */
    public final List<C6763n> m30044b() {
        return this.f25255b;
    }

    /* renamed from: c */
    public final int m30045c() {
        return this.f25256c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5492h.m23964a(this, parcel);
    }
}
