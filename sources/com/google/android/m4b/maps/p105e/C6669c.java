package com.google.android.m4b.maps.p105e;

import android.os.Parcel;
import com.google.android.m4b.maps.dd.C5326a.C7535d;
import com.google.android.m4b.maps.p105e.C5362a.C5360b;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p111k.C5468c;
import com.google.android.m4b.maps.p120t.C6770a;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.e.c */
public final class C6669c implements C5468c {
    public static final C5364d CREATOR = new C5364d();
    /* renamed from: a */
    public final int f24954a;
    /* renamed from: b */
    public C6770a f24955b;
    /* renamed from: c */
    public byte[] f24956c;
    /* renamed from: d */
    public final C7535d f24957d;
    /* renamed from: e */
    public final C5360b f24958e;

    public final int describeContents() {
        return 0;
    }

    public C6669c(C6770a c6770a, C7535d c7535d, C5360b c5360b) {
        this.f24954a = 1;
        this.f24955b = c6770a;
        this.f24957d = c7535d;
        this.f24958e = c5360b;
    }

    C6669c(int i, C6770a c6770a, byte[] bArr) {
        this.f24954a = i;
        this.f24955b = c6770a;
        this.f24956c = bArr;
        this.f24957d = null;
        this.f24958e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6669c)) {
            return false;
        }
        C6669c c6669c = (C6669c) obj;
        return this.f24954a == c6669c.f24954a && C5461u.m23766a(this.f24955b, c6669c.f24955b) && Arrays.equals(this.f24956c, c6669c.f24956c) && C5461u.m23766a(this.f24957d, c6669c.f24957d) && C5461u.m23766a(this.f24958e, c6669c.f24958e) != null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24954a), this.f24955b, this.f24956c, this.f24957d, this.f24958e});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        stringBuilder.append(this.f24954a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f24955b);
        stringBuilder.append(", ");
        stringBuilder.append(this.f24956c == null ? null : new String(this.f24956c));
        stringBuilder.append(", ");
        stringBuilder.append(this.f24957d);
        stringBuilder.append(", ");
        stringBuilder.append(this.f24958e);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5364d.m23562a(this, parcel, i);
    }
}
