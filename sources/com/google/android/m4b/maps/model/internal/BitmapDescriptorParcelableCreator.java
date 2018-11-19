package com.google.android.m4b.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class BitmapDescriptorParcelableCreator implements Creator<BitmapDescriptorParcelable> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23919a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23920a(i);
    }

    /* renamed from: a */
    public BitmapDescriptorParcelable m23919a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        Bundle bundle = null;
        Bitmap bitmap = bundle;
        byte b = (byte) 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    b = C5466a.m23784d(parcel, readInt);
                    break;
                case 3:
                    bundle = C5466a.m23793m(parcel, readInt);
                    break;
                case 4:
                    bitmap = (Bitmap) C5466a.m23778a(parcel, readInt, Bitmap.CREATOR);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new BitmapDescriptorParcelable(i, b, bundle, bitmap);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public BitmapDescriptorParcelable[] m23920a(int i) {
        return new BitmapDescriptorParcelable[i];
    }

    /* renamed from: a */
    static void m23918a(BitmapDescriptorParcelable bitmapDescriptorParcelable, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, bitmapDescriptorParcelable.getVersionCode());
        C5467b.m23797a(parcel, 2, bitmapDescriptorParcelable.getType());
        C5467b.m23802a(parcel, 3, bitmapDescriptorParcelable.getParameters(), false);
        C5467b.m23804a(parcel, 4, bitmapDescriptorParcelable.getBitmap(), i, false);
        C5467b.m23796a(parcel, a);
    }
}
