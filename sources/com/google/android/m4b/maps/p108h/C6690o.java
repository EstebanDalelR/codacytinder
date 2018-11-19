package com.google.android.m4b.maps.p108h;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.m4b.maps.p111k.C5468c;

/* renamed from: com.google.android.m4b.maps.h.o */
public final class C6690o implements C5468c {
    public static final Creator<C6690o> CREATOR = new C5429p();
    /* renamed from: a */
    final int f25040a;
    /* renamed from: b */
    private final String f25041b;

    public final int describeContents() {
        return 0;
    }

    C6690o(int i, String str) {
        String str2 = "scopeUri must not be null or empty";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(str2));
        }
        this.f25040a = i;
        this.f25041b = str;
    }

    /* renamed from: a */
    public final String m29848a() {
        return this.f25041b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6690o) {
            return this.f25041b.equals(((C6690o) obj).f25041b);
        }
        return null;
    }

    public final int hashCode() {
        return this.f25041b.hashCode();
    }

    public final String toString() {
        return this.f25041b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5429p.m23647a(this, parcel);
    }
}
