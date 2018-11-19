package com.google.android.m4b.maps.p117q;

import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.q.b */
public final class C6753b implements C5468c {
    public static final C5507c CREATOR = new C5507c();
    /* renamed from: a */
    public final int f25303a;
    /* renamed from: b */
    public final String f25304b;
    /* renamed from: c */
    private final int f25305c;

    public final int describeContents() {
        return 0;
    }

    C6753b(int i, int i2, String str) {
        this.f25305c = i;
        this.f25303a = i2;
        this.f25304b = str;
    }

    public final int hashCode() {
        return this.f25303a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6753b)) {
            return false;
        }
        C6753b c6753b = (C6753b) obj;
        if (c6753b.f25303a != this.f25303a || C5461u.m23766a(c6753b.f25304b, this.f25304b) == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.f25303a), this.f25304b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5507c.m23982a(this, parcel);
    }

    /* renamed from: a */
    final int m30081a() {
        return this.f25305c;
    }
}
