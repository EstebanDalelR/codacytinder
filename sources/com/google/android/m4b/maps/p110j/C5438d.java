package com.google.android.m4b.maps.p110j;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.m4b.maps.j.d */
public final class C5438d implements Parcelable {
    public static final Creator<C5438d> CREATOR = new C54371();
    /* renamed from: a */
    private IBinder f20390a;

    /* renamed from: com.google.android.m4b.maps.j.d$1 */
    class C54371 implements Creator<C5438d> {
        C54371() {
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return new C5438d[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C5438d(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public C5438d() {
        this.f20390a = null;
    }

    public C5438d(IBinder iBinder) {
        this.f20390a = null;
        this.f20390a = iBinder;
    }

    private C5438d(Parcel parcel) {
        this.f20390a = null;
        this.f20390a = parcel.readStrongBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f20390a);
    }
}
