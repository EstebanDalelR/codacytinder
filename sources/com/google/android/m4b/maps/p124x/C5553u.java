package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.x.u */
public interface C5553u extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.u$a */
    public static abstract class C6834a extends Binder implements C5553u {

        /* renamed from: com.google.android.m4b.maps.x.u$a$a */
        static class C6833a implements C5553u {
            /* renamed from: a */
            private IBinder f25374a;

            C6833a(IBinder iBinder) {
                this.f25374a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25374a;
            }

            /* renamed from: a */
            public final void mo5804a(List<IBinder> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
                    obtain.writeBinderList(list);
                    this.f25374a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo5805b(List<IBinder> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
                    obtain.writeBinderList(list);
                    this.f25374a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C6834a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
                        mo5804a(parcel.createBinderArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
                        mo5805b(parcel.createBinderArrayList());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
            return true;
        }
    }

    /* renamed from: a */
    void mo5804a(List<IBinder> list);

    /* renamed from: b */
    void mo5805b(List<IBinder> list);
}
