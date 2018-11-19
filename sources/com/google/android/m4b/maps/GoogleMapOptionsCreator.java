package com.google.android.m4b.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class GoogleMapOptionsCreator implements Creator<GoogleMapOptions> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m20400a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m20401a(i);
    }

    /* renamed from: a */
    public GoogleMapOptions m20400a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = C5466a.m23776a(parcel);
        CameraPosition cameraPosition = null;
        int i = 0;
        byte b = (byte) -1;
        byte b2 = (byte) -1;
        int i2 = 0;
        byte b3 = (byte) -1;
        byte b4 = (byte) -1;
        byte b5 = (byte) -1;
        byte b6 = (byte) -1;
        byte b7 = (byte) -1;
        byte b8 = (byte) -1;
        byte b9 = (byte) -1;
        byte b10 = (byte) -1;
        byte b11 = (byte) -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel2, readInt);
                    break;
                case 2:
                    b = C5466a.m23784d(parcel2, readInt);
                    break;
                case 3:
                    b2 = C5466a.m23784d(parcel2, readInt);
                    break;
                case 4:
                    i2 = C5466a.m23786f(parcel2, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C5466a.m23778a(parcel2, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = C5466a.m23784d(parcel2, readInt);
                    break;
                case 7:
                    b4 = C5466a.m23784d(parcel2, readInt);
                    break;
                case 8:
                    b5 = C5466a.m23784d(parcel2, readInt);
                    break;
                case 9:
                    b6 = C5466a.m23784d(parcel2, readInt);
                    break;
                case 10:
                    b7 = C5466a.m23784d(parcel2, readInt);
                    break;
                case 11:
                    b8 = C5466a.m23784d(parcel2, readInt);
                    break;
                case 12:
                    b9 = C5466a.m23784d(parcel2, readInt);
                    break;
                case 14:
                    b10 = C5466a.m23784d(parcel2, readInt);
                    break;
                case 15:
                    b11 = C5466a.m23784d(parcel2, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GoogleMapOptions(i, b, b2, i2, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel2);
    }

    /* renamed from: a */
    public GoogleMapOptions[] m20401a(int i) {
        return new GoogleMapOptions[i];
    }

    /* renamed from: a */
    static void m20399a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, googleMapOptions.m27633a());
        C5467b.m23797a(parcel, 2, googleMapOptions.m27634b());
        C5467b.m23797a(parcel, 3, googleMapOptions.m27635c());
        C5467b.m23800a(parcel, 4, googleMapOptions.getMapType());
        C5467b.m23804a(parcel, 5, googleMapOptions.getCamera(), i, false);
        C5467b.m23797a(parcel, 6, googleMapOptions.m27636d());
        C5467b.m23797a(parcel, 7, googleMapOptions.m27637e());
        C5467b.m23797a(parcel, 8, googleMapOptions.m27638f());
        C5467b.m23797a(parcel, 9, googleMapOptions.m27639g());
        C5467b.m23797a(parcel, 10, googleMapOptions.m27640h());
        C5467b.m23797a(parcel, 11, googleMapOptions.m27641i());
        C5467b.m23797a(parcel, 12, googleMapOptions.m27642j());
        C5467b.m23797a(parcel, 14, googleMapOptions.m27643k());
        C5467b.m23797a(parcel, 15, googleMapOptions.m27644l());
        C5467b.m23796a(parcel, a);
    }
}
