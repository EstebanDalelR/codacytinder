package com.google.android.m4b.maps.p115o;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.r */
public final class C6746r implements C5468c {
    public static final Creator<C6746r> CREATOR = new C5499s();
    /* renamed from: a */
    static final List<Location> f25279a = Collections.emptyList();
    /* renamed from: b */
    private final int f25280b;
    /* renamed from: c */
    private final List<Location> f25281c;

    public final int describeContents() {
        return 0;
    }

    C6746r(int i, List<Location> list) {
        this.f25280b = i;
        this.f25281c = list;
    }

    @NonNull
    /* renamed from: a */
    public final List<Location> m30060a() {
        return this.f25281c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5499s.m23975a(this, parcel);
    }

    /* renamed from: b */
    final int m30061b() {
        return this.f25280b;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f25281c) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6746r)) {
            return false;
        }
        C6746r c6746r = (C6746r) obj;
        if (c6746r.f25281c.size() != this.f25281c.size()) {
            return false;
        }
        Iterator it = this.f25281c.iterator();
        for (Location time : c6746r.f25281c) {
            if (((Location) it.next()).getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25281c);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("LocationResult[locations: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
