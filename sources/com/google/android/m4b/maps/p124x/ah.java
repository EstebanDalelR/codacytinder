package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;
import com.google.android.m4b.maps.p124x.aa.C6783a.C6782a;
import com.google.android.m4b.maps.p124x.ab.C6785a.C6784a;
import com.google.android.m4b.maps.p124x.ac.C6787a.C6786a;
import com.google.android.m4b.maps.p124x.ad.C6789a.C6788a;

/* renamed from: com.google.android.m4b.maps.x.ah */
public interface ah extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.ah$a */
    public static abstract class C6797a extends Binder implements ah {

        /* renamed from: com.google.android.m4b.maps.x.ah$a$a */
        static class C6796a implements ah {
            /* renamed from: a */
            private IBinder f25359a;

            C6796a(IBinder iBinder) {
                this.f25359a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25359a;
            }

            /* renamed from: a */
            public final void mo5707a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeInt(z);
                    this.f25359a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo5709b(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeInt(z);
                    this.f25359a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo5711c(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeInt(z);
                    this.f25359a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo5713d(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeInt(z);
                    this.f25359a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo5708a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z = false;
                    this.f25359a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo5710b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z = false;
                    this.f25359a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final boolean mo5712c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z = false;
                    this.f25359a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final boolean mo5714d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z = false;
                    this.f25359a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5701a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    if (streetViewPanoramaCamera != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaCamera.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    this.f25359a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final StreetViewPanoramaCamera mo5715e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    this.f25359a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    StreetViewPanoramaCamera a = obtain2.readInt() != 0 ? StreetViewPanoramaCamera.CREATOR.m23895a(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5706a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeString(str);
                    this.f25359a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5699a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25359a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5700a(LatLng latLng, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f25359a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final StreetViewPanoramaLocation mo5716f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    this.f25359a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    StreetViewPanoramaLocation a = obtain2.readInt() != 0 ? StreetViewPanoramaLocation.CREATOR.m23901a(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5703a(ab abVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(abVar != null ? abVar.asBinder() : null);
                    this.f25359a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5702a(aa aaVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(aaVar != null ? aaVar.asBinder() : null);
                    this.f25359a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5704a(ac acVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(acVar != null ? acVar.asBinder() : null);
                    this.f25359a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final StreetViewPanoramaOrientation mo5697a(C5484b c5484b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    StreetViewPanoramaOrientation streetViewPanoramaOrientation = null;
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    this.f25359a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != null) {
                        streetViewPanoramaOrientation = StreetViewPanoramaOrientation.CREATOR.m23907a(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return streetViewPanoramaOrientation;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C5484b mo5698a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    if (streetViewPanoramaOrientation != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOrientation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25359a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    streetViewPanoramaOrientation = C6735a.m30039a(obtain2.readStrongBinder());
                    return streetViewPanoramaOrientation;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5705a(ad adVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f25359a.transact(20, obtain, obtain2, 0);
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

        public C6797a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
        }

        /* renamed from: a */
        public static ah m30189a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ah)) {
                return new C6796a(iBinder);
            }
            return (ah) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                StreetViewPanoramaCamera streetViewPanoramaCamera = null;
                LatLng a;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5707a(z);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5709b(z);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5711c(z);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5713d(z);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = mo5708a();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = mo5710b();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = mo5712c();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = mo5714d();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        if (parcel.readInt() != 0) {
                            streetViewPanoramaCamera = StreetViewPanoramaCamera.CREATOR.m23895a(parcel);
                        }
                        mo5701a(streetViewPanoramaCamera, (long) parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = mo5715e();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        mo5706a((String) parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        if (parcel.readInt() != 0) {
                            a = LatLng.CREATOR.m23867a(parcel);
                        }
                        mo5699a(a);
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        if (parcel.readInt() != 0) {
                            a = LatLng.CREATOR.m23867a(parcel);
                        }
                        mo5700a(a, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = mo5716f();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 15:
                        ab c6784a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaChangeListener");
                            if (parcel == null || (parcel instanceof ab) == 0) {
                                c6784a = new C6784a(i);
                            } else {
                                c6784a = (ab) parcel;
                            }
                        }
                        mo5703a(c6784a);
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        aa c6782a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                            if (parcel == null || (parcel instanceof aa) == 0) {
                                c6782a = new C6782a(i);
                            } else {
                                c6782a = (aa) parcel;
                            }
                        }
                        mo5702a(c6782a);
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        ac c6786a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaClickListener");
                            if (parcel == null || (parcel instanceof ac) == 0) {
                                c6786a = new C6786a(i);
                            } else {
                                c6786a = (ac) parcel;
                            }
                        }
                        mo5704a(c6786a);
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = mo5697a((C5484b) C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 19:
                        IBinder asBinder;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = mo5698a((StreetViewPanoramaOrientation) parcel.readInt() != 0 ? StreetViewPanoramaOrientation.CREATOR.m23907a(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            asBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(asBinder);
                        return true;
                    case 20:
                        ad c6788a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaLongClickListener");
                            if (parcel == null || (parcel instanceof ad) == 0) {
                                c6788a = new C6788a(i);
                            } else {
                                c6788a = (ad) parcel;
                            }
                        }
                        mo5705a(c6788a);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
            return true;
        }
    }

    /* renamed from: a */
    StreetViewPanoramaOrientation mo5697a(C5484b c5484b);

    /* renamed from: a */
    C5484b mo5698a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);

    /* renamed from: a */
    void mo5699a(LatLng latLng);

    /* renamed from: a */
    void mo5700a(LatLng latLng, int i);

    /* renamed from: a */
    void mo5701a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j);

    /* renamed from: a */
    void mo5702a(aa aaVar);

    /* renamed from: a */
    void mo5703a(ab abVar);

    /* renamed from: a */
    void mo5704a(ac acVar);

    /* renamed from: a */
    void mo5705a(ad adVar);

    /* renamed from: a */
    void mo5706a(String str);

    /* renamed from: a */
    void mo5707a(boolean z);

    /* renamed from: a */
    boolean mo5708a();

    /* renamed from: b */
    void mo5709b(boolean z);

    /* renamed from: b */
    boolean mo5710b();

    /* renamed from: c */
    void mo5711c(boolean z);

    /* renamed from: c */
    boolean mo5712c();

    /* renamed from: d */
    void mo5713d(boolean z);

    /* renamed from: d */
    boolean mo5714d();

    /* renamed from: e */
    StreetViewPanoramaCamera mo5715e();

    /* renamed from: f */
    StreetViewPanoramaLocation mo5716f();
}
