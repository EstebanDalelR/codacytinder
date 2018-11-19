package com.google.android.m4b.maps.p122v;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.v.d */
public final class C6775d implements C5468c {
    public static final Creator<C6775d> CREATOR = new C5526e();
    /* renamed from: a */
    final int f25346a;
    /* renamed from: b */
    final boolean f25347b;
    /* renamed from: c */
    final List<C6690o> f25348c;

    public final int describeContents() {
        return 0;
    }

    C6775d(int i, boolean z, List<C6690o> list) {
        this.f25346a = i;
        this.f25347b = z;
        this.f25348c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5526e.m24035a(this, parcel);
    }

    public C6775d(boolean z, Set<C6690o> set) {
        if (set == null) {
            set = Collections.emptyList();
        } else {
            set = Collections.unmodifiableList(new ArrayList(set));
        }
        this(1, z, set);
    }
}
