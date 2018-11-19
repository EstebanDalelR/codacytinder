package com.google.android.m4b.maps.model.internal;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

public final class GroundOverlayOptionsParcelable implements C5468c {
    public static final GroundOverlayOptionsParcelableCreator CREATOR = new GroundOverlayOptionsParcelableCreator();
    /* renamed from: a */
    private final int f25215a;
    /* renamed from: b */
    private BitmapDescriptorParcelable f25216b;

    public final int describeContents() {
        return 0;
    }

    public GroundOverlayOptionsParcelable() {
        this.f25215a = 1;
    }

    GroundOverlayOptionsParcelable(int i, BitmapDescriptorParcelable bitmapDescriptorParcelable) {
        this.f25215a = i;
        this.f25216b = bitmapDescriptorParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        GroundOverlayOptionsParcelableCreator.m23924a(this, parcel, i);
    }

    public final GroundOverlayOptionsParcelable parcelableImage(BitmapDescriptorParcelable bitmapDescriptorParcelable) {
        this.f25216b = bitmapDescriptorParcelable;
        return this;
    }

    /* renamed from: a */
    final int m30017a() {
        return this.f25215a;
    }

    public final BitmapDescriptorParcelable getParcelableImage() {
        return this.f25216b;
    }
}
