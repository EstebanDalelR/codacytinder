package com.google.android.m4b.maps.p110j;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.j.x */
public final class C5463x implements Creator<C6712w> {
    /* renamed from: a */
    static void m23774a(C6712w c6712w, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6712w.f25107a);
        C5467b.m23804a(parcel, 2, c6712w.m29967a(), i, false);
        C5467b.m23800a(parcel, 3, c6712w.m29968b());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6712w[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        Account account = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    account = (Account) C5466a.m23778a(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    i2 = C5466a.m23786f(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6712w(i, account, i2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
