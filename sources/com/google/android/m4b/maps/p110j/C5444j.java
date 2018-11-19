package com.google.android.m4b.maps.p110j;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.j.j */
public final class C5444j implements Creator<C6699i> {
    /* renamed from: a */
    static void m23676a(C6699i c6699i, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6699i.f25067a);
        C5467b.m23800a(parcel, 2, c6699i.f25068b);
        C5467b.m23800a(parcel, 3, c6699i.f25069c);
        C5467b.m23806a(parcel, 4, c6699i.f25070d, false);
        C5467b.m23803a(parcel, 5, c6699i.f25071e, false);
        C5467b.m23811a(parcel, 6, c6699i.f25072f, i, false);
        C5467b.m23802a(parcel, 7, c6699i.f25073g, false);
        C5467b.m23804a(parcel, 8, c6699i.f25074h, i, false);
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6699i[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        String str = null;
        IBinder iBinder = str;
        C6690o[] c6690oArr = iBinder;
        Bundle bundle = c6690oArr;
        Account account = bundle;
        int i = 0;
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
                    str = C5466a.m23791k(parcel, readInt);
                    break;
                case 5:
                    iBinder = C5466a.m23792l(parcel, readInt);
                    break;
                case 6:
                    c6690oArr = (C6690o[]) C5466a.m23781b(parcel, readInt, C6690o.CREATOR);
                    break;
                case 7:
                    bundle = C5466a.m23793m(parcel, readInt);
                    break;
                case 8:
                    account = (Account) C5466a.m23778a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6699i(i, i2, i3, str, iBinder, c6690oArr, bundle, account);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
