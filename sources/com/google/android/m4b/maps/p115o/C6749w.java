package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p108h.C5427m;
import com.google.android.m4b.maps.p108h.C6691q;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.o.w */
public final class C6749w implements C5427m, C5468c {
    public static final Creator<C6749w> CREATOR = new C5502x();
    /* renamed from: a */
    private final int f25287a;
    /* renamed from: b */
    private final C6691q f25288b;
    /* renamed from: c */
    private final C6750y f25289c;

    public final int describeContents() {
        return 0;
    }

    C6749w(int i, C6691q c6691q, C6750y c6750y) {
        this.f25287a = i;
        this.f25288b = c6691q;
        this.f25289c = c6750y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5502x.m23978a(this, parcel, i);
    }

    /* renamed from: a */
    public final int m30068a() {
        return this.f25287a;
    }

    /* renamed from: b */
    public final C6750y m30069b() {
        return this.f25289c;
    }

    /* renamed from: c */
    public final C6691q m30070c() {
        return this.f25288b;
    }
}
