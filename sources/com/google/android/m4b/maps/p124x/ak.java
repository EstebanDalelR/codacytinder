package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.x.ak */
public interface ak extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.ak$a */
    public static abstract class C6801a extends Binder implements ak {

        /* renamed from: com.google.android.m4b.maps.x.ak$a$a */
        static class C6800a implements ak {
            /* renamed from: a */
            private IBinder f25360a;

            C6800a(IBinder iBinder) {
                this.f25360a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25360a;
            }

            /* renamed from: e */
            public final void mo5721e(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo5722f(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo5723g(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo5724h(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final void mo5725i(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo5726j(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo5727k(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo5728l(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public final boolean mo5731v() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f25360a.transact(9, obtain, obtain2, 0);
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

            /* renamed from: w */
            public final boolean mo5732w() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f25360a.transact(10, obtain, obtain2, 0);
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

            /* renamed from: x */
            public final boolean mo5733x() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f25360a.transact(11, obtain, obtain2, 0);
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

            /* renamed from: y */
            public final boolean mo5734y() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f25360a.transact(12, obtain, obtain2, 0);
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

            /* renamed from: z */
            public final boolean mo5735z() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f25360a.transact(13, obtain, obtain2, 0);
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

            /* renamed from: A */
            public final boolean mo5717A() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f25360a.transact(14, obtain, obtain2, 0);
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

            /* renamed from: B */
            public final boolean mo5718B() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f25360a.transact(15, obtain, obtain2, 0);
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

            /* renamed from: m */
            public final void mo5729m(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: C */
            public final boolean mo5719C() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f25360a.transact(17, obtain, obtain2, 0);
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

            /* renamed from: n */
            public final void mo5730n(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z);
                    this.f25360a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: D */
            public final boolean mo5720D() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f25360a.transact(19, obtain, obtain2, 0);
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
        }

        public IBinder asBinder() {
            return this;
        }

        public C6801a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IUiSettingsDelegate");
        }

        /* renamed from: a */
        public static ak m30209a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ak)) {
                return new C6800a(iBinder);
            }
            return (ak) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5721e(z);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5722f(z);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5723g(z);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5724h(z);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5725i(z);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5726j(z);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5727k(z);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5728l(z);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        i = mo5731v();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        i = mo5732w();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        i = mo5733x();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        i = mo5734y();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        i = mo5735z();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        i = mo5717A();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        i = mo5718B();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5729m(z);
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        i = mo5719C();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5730n(z);
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                        i = mo5720D();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            return true;
        }
    }

    /* renamed from: A */
    boolean mo5717A();

    /* renamed from: B */
    boolean mo5718B();

    /* renamed from: C */
    boolean mo5719C();

    /* renamed from: D */
    boolean mo5720D();

    /* renamed from: e */
    void mo5721e(boolean z);

    /* renamed from: f */
    void mo5722f(boolean z);

    /* renamed from: g */
    void mo5723g(boolean z);

    /* renamed from: h */
    void mo5724h(boolean z);

    /* renamed from: i */
    void mo5725i(boolean z);

    /* renamed from: j */
    void mo5726j(boolean z);

    /* renamed from: k */
    void mo5727k(boolean z);

    /* renamed from: l */
    void mo5728l(boolean z);

    /* renamed from: m */
    void mo5729m(boolean z);

    /* renamed from: n */
    void mo5730n(boolean z);

    /* renamed from: v */
    boolean mo5731v();

    /* renamed from: w */
    boolean mo5732w();

    /* renamed from: x */
    boolean mo5733x();

    /* renamed from: y */
    boolean mo5734y();

    /* renamed from: z */
    boolean mo5735z();
}
