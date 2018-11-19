package com.google.android.m4b.maps.p122v;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p122v.C5529h.C6780a;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.v.f */
public interface C5527f extends IInterface {

    /* renamed from: com.google.android.m4b.maps.v.f$a */
    public static abstract class C6776a extends Binder implements C5527f {
        public IBinder asBinder() {
            return this;
        }

        public C6776a() {
            attachInterface(this, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
                        mo7240a((String) parcel.readString(), (List) parcel.createTypedArrayList(C6690o.CREATOR), (C5529h) C6780a.m30155a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
                        mo7239a((String) parcel.readString(), (String) parcel.readString(), (C5529h) C6780a.m30155a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            return true;
        }
    }

    /* renamed from: a */
    void mo7239a(String str, String str2, C5529h c5529h);

    /* renamed from: a */
    void mo7240a(String str, List<C6690o> list, C5529h c5529h);
}
