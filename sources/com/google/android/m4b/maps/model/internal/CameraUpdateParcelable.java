package com.google.android.m4b.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

public final class CameraUpdateParcelable implements C5468c {
    public static final CameraUpdateParcelableCreator CREATOR = new CameraUpdateParcelableCreator();
    /* renamed from: a */
    private final int f25212a;
    /* renamed from: b */
    private int f25213b;
    /* renamed from: c */
    private Bundle f25214c;

    public final int describeContents() {
        return 0;
    }

    CameraUpdateParcelable(int i, int i2, Bundle bundle) {
        this.f25212a = i;
        this.f25213b = i2;
        this.f25214c = bundle;
    }

    public CameraUpdateParcelable(int i, Bundle bundle) {
        this(1, i, bundle);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        CameraUpdateParcelableCreator.m23921a(this, parcel);
    }

    public final int getVersionCode() {
        return this.f25212a;
    }

    public final int getType() {
        return this.f25213b;
    }

    public final Bundle getParameters() {
        return this.f25214c;
    }
}
