package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class TileCreator implements Creator<Tile> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23910a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23911a(i);
    }

    /* renamed from: a */
    public Tile m23910a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    i2 = C5466a.m23786f(parcel, readInt);
                    break;
                case 3:
                    i3 = C5466a.m23786f(parcel, readInt);
                    break;
                case 4:
                    bArr = C5466a.m23794n(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new Tile(i, i2, i3, bArr);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public Tile[] m23911a(int i) {
        return new Tile[i];
    }

    /* renamed from: a */
    static void m23909a(Tile tile, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, tile.m30012a());
        C5467b.m23800a(parcel, 2, tile.width);
        C5467b.m23800a(parcel, 3, tile.height);
        C5467b.m23810a(parcel, 4, tile.data, false);
        C5467b.m23796a(parcel, a);
    }
}
