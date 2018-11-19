package com.google.android.m4b.maps.model.internal;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

public final class MarkerOptionsParcelable implements C5468c {
    public static final MarkerOptionsParcelableCreator CREATOR = new MarkerOptionsParcelableCreator();
    /* renamed from: a */
    private final int f25229a;
    /* renamed from: b */
    private BitmapDescriptorParcelable f25230b;

    public final int describeContents() {
        return 0;
    }

    public MarkerOptionsParcelable() {
        this.f25229a = 1;
    }

    MarkerOptionsParcelable(int i, BitmapDescriptorParcelable bitmapDescriptorParcelable) {
        this.f25229a = i;
        this.f25230b = bitmapDescriptorParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        MarkerOptionsParcelableCreator.m23927a(this, parcel, i);
    }

    /* renamed from: a */
    final int m30029a() {
        return this.f25229a;
    }

    public final BitmapDescriptorParcelable getParcelableIcon() {
        return this.f25230b;
    }

    public final MarkerOptionsParcelable parcelableIcon(BitmapDescriptorParcelable bitmapDescriptorParcelable) {
        this.f25230b = bitmapDescriptorParcelable;
        return this;
    }
}
