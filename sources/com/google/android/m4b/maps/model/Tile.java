package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

public final class Tile implements C5468c {
    public static final TileCreator CREATOR = new TileCreator();
    /* renamed from: a */
    private final int f25198a;
    public final byte[] data;
    public final int height;
    public final int width;

    public final int describeContents() {
        return 0;
    }

    Tile(int i, int i2, int i3, byte[] bArr) {
        this.f25198a = i;
        this.width = i2;
        this.height = i3;
        this.data = bArr;
    }

    /* renamed from: a */
    final int m30012a() {
        return this.f25198a;
    }

    public Tile(int i, int i2, byte[] bArr) {
        this(1, i, i2, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TileCreator.m23909a(this, parcel);
    }
}
