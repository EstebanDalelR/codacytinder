package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.Tile;

public interface ITileProviderDelegate extends IInterface {

    public static abstract class Stub extends Binder implements ITileProviderDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.ITileProviderDelegate$Stub$a */
        static class C6728a implements ITileProviderDelegate {
            /* renamed from: a */
            private IBinder f25228a;

            C6728a(IBinder iBinder) {
                this.f25228a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25228a;
            }

            public final Tile getTile(int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileProviderDelegate");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f25228a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    i = obtain2.readInt() != 0 ? Tile.CREATOR.m23910a(obtain2) : 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return i;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.ITileProviderDelegate");
        }

        /* renamed from: a */
        public static ITileProviderDelegate m30028a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.ITileProviderDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITileProviderDelegate)) {
                return new C6728a(iBinder);
            }
            return (ITileProviderDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileProviderDelegate");
                i = getTile(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (i != 0) {
                    parcel2.writeInt(1);
                    i.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.model.internal.ITileProviderDelegate");
                return true;
            }
        }
    }

    Tile getTile(int i, int i2, int i3);
}
