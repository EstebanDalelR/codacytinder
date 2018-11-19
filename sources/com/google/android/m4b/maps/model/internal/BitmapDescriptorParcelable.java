package com.google.android.m4b.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

public final class BitmapDescriptorParcelable implements C5468c {
    public static final BitmapDescriptorParcelableCreator CREATOR = new BitmapDescriptorParcelableCreator();
    /* renamed from: a */
    private final int f25208a;
    /* renamed from: b */
    private byte f25209b;
    /* renamed from: c */
    private Bundle f25210c;
    /* renamed from: d */
    private Bitmap f25211d;

    public final int describeContents() {
        return 0;
    }

    BitmapDescriptorParcelable(int i, byte b, Bundle bundle, Bitmap bitmap) {
        this.f25208a = i;
        this.f25209b = b;
        this.f25210c = bundle;
        this.f25211d = bitmap;
    }

    public BitmapDescriptorParcelable(byte b, Bitmap bitmap) {
        this(1, b, null, bitmap);
    }

    public BitmapDescriptorParcelable(byte b, Bundle bundle) {
        this(1, b, bundle, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        BitmapDescriptorParcelableCreator.m23918a(this, parcel, i);
    }

    public final int getVersionCode() {
        return this.f25208a;
    }

    public final byte getType() {
        return this.f25209b;
    }

    public final Bundle getParameters() {
        return this.f25210c;
    }

    public final Bitmap getBitmap() {
        return this.f25211d;
    }
}
