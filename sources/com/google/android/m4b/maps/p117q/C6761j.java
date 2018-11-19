package com.google.android.m4b.maps.p117q;

import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p111k.C5468c;
import com.google.android.m4b.maps.p115o.C6745p;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.q.j */
public final class C6761j implements C5468c {
    public static final C5513k CREATOR = new C5513k();
    /* renamed from: a */
    static final List<C6753b> f25309a = Collections.emptyList();
    /* renamed from: b */
    C6745p f25310b;
    /* renamed from: c */
    boolean f25311c;
    /* renamed from: d */
    boolean f25312d;
    /* renamed from: e */
    boolean f25313e;
    /* renamed from: f */
    List<C6753b> f25314f;
    /* renamed from: g */
    final String f25315g;
    /* renamed from: h */
    private final int f25316h;

    public final int describeContents() {
        return 0;
    }

    C6761j(int i, C6745p c6745p, boolean z, boolean z2, boolean z3, List<C6753b> list, String str) {
        this.f25316h = i;
        this.f25310b = c6745p;
        this.f25311c = z;
        this.f25312d = z2;
        this.f25313e = z3;
        this.f25314f = list;
        this.f25315g = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5513k.m24018a(this, parcel, i);
    }

    /* renamed from: a */
    final int m30116a() {
        return this.f25316h;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f25310b.toString());
        stringBuilder.append(" requestNlpDebugInfo=");
        stringBuilder.append(this.f25311c);
        stringBuilder.append(" restorePendingIntentListeners=");
        stringBuilder.append(this.f25312d);
        stringBuilder.append(" triggerUpdate=");
        stringBuilder.append(this.f25313e);
        stringBuilder.append(" clients=");
        stringBuilder.append(this.f25314f);
        if (this.f25315g != null) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.f25315g);
        }
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6761j)) {
            return false;
        }
        C6761j c6761j = (C6761j) obj;
        if (C5461u.m23766a(this.f25310b, c6761j.f25310b) && this.f25311c == c6761j.f25311c && this.f25312d == c6761j.f25312d && this.f25313e == c6761j.f25313e && C5461u.m23766a(this.f25314f, c6761j.f25314f) != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25310b.hashCode();
    }

    /* renamed from: a */
    public static C6761j m30115a(C6745p c6745p) {
        return new C6761j(1, c6745p, false, true, true, f25309a, null);
    }
}
