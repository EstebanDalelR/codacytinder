package com.google.android.m4b.maps.bv;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.cg.bp;

/* renamed from: com.google.android.m4b.maps.bv.t */
public final class C4948t implements Parcelable {
    public static final Creator<C4948t> CREATOR = new C49471();
    /* renamed from: a */
    public final float f18294a;
    /* renamed from: b */
    public final int f18295b;
    /* renamed from: c */
    public final String f18296c;
    /* renamed from: d */
    public final int f18297d;
    /* renamed from: e */
    public String f18298e;

    /* renamed from: com.google.android.m4b.maps.bv.t$1 */
    class C49471 implements Creator<C4948t> {
        C49471() {
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return new C4948t[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C4948t(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    private C4948t(float f, String str, int i, String str2) {
        this.f18294a = f;
        this.f18295b = bp.m23008p(f);
        this.f18296c = str;
        this.f18297d = i;
        this.f18298e = str2;
    }

    public C4948t(Parcel parcel) {
        this.f18294a = parcel.readFloat();
        this.f18295b = parcel.readInt();
        this.f18296c = parcel.readString();
        this.f18297d = parcel.readInt();
        this.f18298e = parcel.readString();
    }

    public C4948t(C4662a c4662a) {
        this(C4944q.m22167a(c4662a.m20835d(53)), c4662a.m20843h(54), c4662a.m20835d(55), c4662a.m20843h(56));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C4948t c4948t = (C4948t) obj;
                return this.f18296c.equals(c4948t.f18296c) && this.f18298e.equals(c4948t.f18298e) && this.f18297d == c4948t.f18297d && Float.floatToRawIntBits(this.f18294a) == Float.floatToRawIntBits(c4948t.f18294a);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18296c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f18294a);
        parcel.writeInt(this.f18295b);
        parcel.writeString(this.f18296c);
        parcel.writeInt(this.f18297d);
        parcel.writeString(this.f18298e);
    }
}
