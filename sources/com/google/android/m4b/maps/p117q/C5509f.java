package com.google.android.m4b.maps.p117q;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p108h.C6691q;
import com.google.android.m4b.maps.p115o.C5487b;
import com.google.android.m4b.maps.p115o.C5493j;
import com.google.android.m4b.maps.p115o.C5495l;
import com.google.android.m4b.maps.p115o.C5495l.C6743a;
import com.google.android.m4b.maps.p115o.C5496n;
import com.google.android.m4b.maps.p115o.C5498q;
import com.google.android.m4b.maps.p115o.C6736a;
import com.google.android.m4b.maps.p115o.C6738g;
import com.google.android.m4b.maps.p115o.C6739i;
import com.google.android.m4b.maps.p115o.C6744m;
import com.google.android.m4b.maps.p115o.C6745p;
import com.google.android.m4b.maps.p115o.C6748u;
import com.google.android.m4b.maps.p117q.C5508e.C6756a;
import com.google.android.m4b.maps.p117q.C5510g.C6760a.C6759a;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.q.f */
public interface C5509f extends IInterface {

    /* renamed from: com.google.android.m4b.maps.q.f$a */
    public static abstract class C6758a extends Binder implements C5509f {

        /* renamed from: com.google.android.m4b.maps.q.f$a$a */
        static class C6757a implements C5509f {
            /* renamed from: a */
            private IBinder f25307a;

            C6757a(IBinder iBinder) {
                this.f25307a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25307a;
            }

            /* renamed from: a */
            public final void mo5665a(List<C6763n> list, PendingIntent pendingIntent, C5508e c5508e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeTypedList(list);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5508e != null ? c5508e.asBinder() : null);
                    obtain.writeString(str);
                    this.f25307a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5655a(C6738g c6738g, PendingIntent pendingIntent, C5508e c5508e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (c6738g != null) {
                        obtain.writeInt(1);
                        c6738g.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5508e != null ? c5508e.asBinder() : null);
                    this.f25307a.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5652a(PendingIntent pendingIntent, C5508e c5508e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5508e != null ? c5508e.asBinder() : null);
                    obtain.writeString(str);
                    this.f25307a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5667a(String[] strArr, C5508e c5508e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(c5508e != null ? c5508e.asBinder() : null);
                    obtain.writeString(str);
                    this.f25307a.transact(3, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5661a(C5508e c5508e, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(c5508e != null ? c5508e.asBinder() : null);
                    obtain.writeString(str);
                    this.f25307a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5650a(long j, boolean z, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeLong(j);
                    obtain.writeInt(z);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25307a.transact(true, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5651a(PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25307a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C6736a mo5649a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.f25307a.transact(64, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != null) {
                        str = C6736a.CREATOR;
                        str = C5487b.m23960a(obtain2);
                    } else {
                        str = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return str;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C6691q mo5648a(C6739i c6739i, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (c6739i != null) {
                        obtain.writeInt(1);
                        c6739i.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25307a.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                    c6739i = obtain2.readInt() != null ? (C6691q) C6691q.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return c6739i;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final C6691q mo5670b(PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25307a.transact(61, obtain, obtain2, 0);
                    obtain2.readException();
                    pendingIntent = obtain2.readInt() != null ? (C6691q) C6691q.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return pendingIntent;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final Location mo5647a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.f25307a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    Location location = obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return location;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5658a(C6745p c6745p, C5495l c5495l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (c6745p != null) {
                        obtain.writeInt(1);
                        c6745p.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5495l != null ? c5495l.asBinder() : null);
                    this.f25307a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5659a(C6745p c6745p, C5495l c5495l, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (c6745p != null) {
                        obtain.writeInt(1);
                        c6745p.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5495l != null ? c5495l.asBinder() : null);
                    obtain.writeString(str);
                    this.f25307a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5657a(C6745p c6745p, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (c6745p != null) {
                        obtain.writeInt(1);
                        c6745p.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25307a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5663a(C6761j c6761j, C5495l c5495l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (c6761j != null) {
                        obtain.writeInt(1);
                        c6761j.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5495l != null ? c5495l.asBinder() : null);
                    this.f25307a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5662a(C6761j c6761j, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (c6761j != null) {
                        obtain.writeInt(1);
                        c6761j.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25307a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5656a(C5495l c5495l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(c5495l != null ? c5495l.asBinder() : null);
                    this.f25307a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo5672c(PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25307a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5664a(C6762l c6762l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (c6762l != null) {
                        obtain.writeInt(1);
                        c6762l.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25307a.transact(59, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5666a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeInt(z);
                    this.f25307a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5653a(Location location) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25307a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final Location mo5668b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.f25307a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    str = obtain2.readInt() != null ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return str;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5654a(Location location, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f25307a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final C6744m mo5671c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.f25307a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != null) {
                        str = C6744m.CREATOR;
                        str = C5496n.m23970a(obtain2);
                    } else {
                        str = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return str;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final IBinder mo5669b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.f25307a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5660a(C6748u c6748u, C5510g c5510g, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (c6748u != null) {
                        obtain.writeInt(1);
                        c6748u.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5510g != null ? c5510g.asBinder() : null);
                    obtain.writeString(str);
                    this.f25307a.transact(63, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C5509f m30113a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5509f)) {
                return new C6757a(iBinder);
            }
            return (C5509f) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Location location = null;
            if (i != 26) {
                boolean z = false;
                if (i == 34) {
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    i = mo5671c((String) parcel.readString());
                    parcel2.writeNoException();
                    if (i != 0) {
                        parcel2.writeInt(1);
                        i.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                } else if (i == 57) {
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    i = parcel.readInt() != 0 ? (C6738g) C6738g.CREATOR.createFromParcel(parcel) : 0;
                    if (parcel.readInt() != 0) {
                        r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                    }
                    mo5655a((C6738g) i, r1, (C5508e) C6756a.m30086a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                } else if (i != 1598968902) {
                    C6745p a;
                    switch (i) {
                        case 1:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            i = parcel.createTypedArrayList(C6763n.CREATOR);
                            if (parcel.readInt() != 0) {
                                r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                            }
                            mo5665a(i, r1, C6756a.m30086a(parcel.readStrongBinder()), parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        case 2:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (parcel.readInt() != 0) {
                                r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                            }
                            mo5652a(r1, (C5508e) C6756a.m30086a(parcel.readStrongBinder()), (String) parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        case 3:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            mo5667a((String[]) parcel.createStringArray(), (C5508e) C6756a.m30086a(parcel.readStrongBinder()), (String) parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        case 4:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            mo5661a((C5508e) C6756a.m30086a(parcel.readStrongBinder()), (String) parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        case 5:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            long readLong = parcel.readLong();
                            if (parcel.readInt() != 0) {
                                z = true;
                            }
                            if (parcel.readInt() != 0) {
                                r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                            }
                            mo5650a(readLong, z, r1);
                            parcel2.writeNoException();
                            return true;
                        case 6:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (parcel.readInt() != 0) {
                                r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                            }
                            mo5651a(r1);
                            parcel2.writeNoException();
                            return true;
                        case 7:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            i = mo5647a();
                            parcel2.writeNoException();
                            if (i != 0) {
                                parcel2.writeInt(1);
                                i.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 8:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (parcel.readInt() != 0) {
                                i = C6745p.CREATOR;
                                a = C5498q.m23973a(parcel);
                            }
                            mo5658a(a, (C5495l) C6743a.m30052a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case 9:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (parcel.readInt() != 0) {
                                i = C6745p.CREATOR;
                                i = C5498q.m23973a(parcel);
                            } else {
                                i = 0;
                            }
                            if (parcel.readInt() != 0) {
                                r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                            }
                            mo5657a((C6745p) i, r1);
                            parcel2.writeNoException();
                            return true;
                        case 10:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            mo5656a((C5495l) C6743a.m30052a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case 11:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (parcel.readInt() != 0) {
                                r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                            }
                            mo5672c(r1);
                            parcel2.writeNoException();
                            return true;
                        case 12:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (parcel.readInt() != 0) {
                                z = true;
                            }
                            mo5666a(z);
                            parcel2.writeNoException();
                            return true;
                        case 13:
                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                            if (parcel.readInt() != 0) {
                                location = (Location) Location.CREATOR.createFromParcel(parcel);
                            }
                            mo5653a(location);
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i) {
                                case 20:
                                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                    if (parcel.readInt() != 0) {
                                        i = C6745p.CREATOR;
                                        a = C5498q.m23973a(parcel);
                                    }
                                    mo5659a(a, (C5495l) C6743a.m30052a(parcel.readStrongBinder()), (String) parcel.readString());
                                    parcel2.writeNoException();
                                    return true;
                                case 21:
                                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                    i = mo5668b((String) parcel.readString());
                                    parcel2.writeNoException();
                                    if (i != 0) {
                                        parcel2.writeInt(1);
                                        i.writeToParcel(parcel2, 1);
                                    } else {
                                        parcel2.writeInt(0);
                                    }
                                    return true;
                                default:
                                    switch (i) {
                                        case 51:
                                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                            i = mo5669b();
                                            parcel2.writeNoException();
                                            parcel2.writeStrongBinder(i);
                                            return true;
                                        case 52:
                                            C6761j a2;
                                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                            if (parcel.readInt() != 0) {
                                                i = C6761j.CREATOR;
                                                a2 = C5513k.m24017a(parcel);
                                            }
                                            mo5663a(a2, (C5495l) C6743a.m30052a(parcel.readStrongBinder()));
                                            parcel2.writeNoException();
                                            return true;
                                        case 53:
                                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                            if (parcel.readInt() != 0) {
                                                i = C6761j.CREATOR;
                                                i = C5513k.m24017a(parcel);
                                            } else {
                                                i = 0;
                                            }
                                            if (parcel.readInt() != 0) {
                                                r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                                            }
                                            mo5662a((C6761j) i, r1);
                                            parcel2.writeNoException();
                                            return true;
                                        default:
                                            switch (i) {
                                                case 59:
                                                    C6762l a3;
                                                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                                    if (parcel.readInt() != 0) {
                                                        i = C6762l.CREATOR;
                                                        a3 = C5514m.m24019a(parcel);
                                                    }
                                                    mo5664a(a3);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 60:
                                                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                                    if (parcel.readInt() != 0) {
                                                        i = C6739i.CREATOR;
                                                        i = C5493j.m23965a(parcel);
                                                    } else {
                                                        i = 0;
                                                    }
                                                    if (parcel.readInt() != 0) {
                                                        r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                                                    }
                                                    i = mo5648a((C6739i) i, r1);
                                                    parcel2.writeNoException();
                                                    if (i != 0) {
                                                        parcel2.writeInt(1);
                                                        i.writeToParcel(parcel2, 1);
                                                    } else {
                                                        parcel2.writeInt(0);
                                                    }
                                                    return true;
                                                case 61:
                                                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                                    if (parcel.readInt() != 0) {
                                                        r1 = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                                                    }
                                                    i = mo5670b(r1);
                                                    parcel2.writeNoException();
                                                    if (i != 0) {
                                                        parcel2.writeInt(1);
                                                        i.writeToParcel(parcel2, 1);
                                                    } else {
                                                        parcel2.writeInt(0);
                                                    }
                                                    return true;
                                                default:
                                                    switch (i) {
                                                        case 63:
                                                            C5510g c6759a;
                                                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                                            i = parcel.readInt() != 0 ? (C6748u) C6748u.CREATOR.createFromParcel(parcel) : 0;
                                                            i2 = parcel.readStrongBinder();
                                                            if (i2 != 0) {
                                                                IInterface queryLocalInterface = i2.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                                                                if (queryLocalInterface == null || !(queryLocalInterface instanceof C5510g)) {
                                                                    c6759a = new C6759a(i2);
                                                                } else {
                                                                    c6759a = (C5510g) queryLocalInterface;
                                                                }
                                                            }
                                                            mo5660a((C6748u) i, c6759a, (String) parcel.readString());
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case 64:
                                                            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                                            i = mo5649a((String) parcel.readString());
                                                            parcel2.writeNoException();
                                                            if (i != 0) {
                                                                parcel2.writeInt(1);
                                                                i.writeToParcel(parcel2, 1);
                                                            } else {
                                                                parcel2.writeInt(0);
                                                            }
                                                            return true;
                                                        default:
                                                            return super.onTransact(i, parcel, parcel2, i2);
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    parcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    return true;
                }
            }
            parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (parcel.readInt() != 0) {
                location = (Location) Location.CREATOR.createFromParcel(parcel);
            }
            mo5654a(location, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    Location mo5647a();

    /* renamed from: a */
    C6691q mo5648a(C6739i c6739i, PendingIntent pendingIntent);

    /* renamed from: a */
    C6736a mo5649a(String str);

    /* renamed from: a */
    void mo5650a(long j, boolean z, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo5651a(PendingIntent pendingIntent);

    /* renamed from: a */
    void mo5652a(PendingIntent pendingIntent, C5508e c5508e, String str);

    /* renamed from: a */
    void mo5653a(Location location);

    /* renamed from: a */
    void mo5654a(Location location, int i);

    /* renamed from: a */
    void mo5655a(C6738g c6738g, PendingIntent pendingIntent, C5508e c5508e);

    /* renamed from: a */
    void mo5656a(C5495l c5495l);

    /* renamed from: a */
    void mo5657a(C6745p c6745p, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo5658a(C6745p c6745p, C5495l c5495l);

    /* renamed from: a */
    void mo5659a(C6745p c6745p, C5495l c5495l, String str);

    /* renamed from: a */
    void mo5660a(C6748u c6748u, C5510g c5510g, String str);

    /* renamed from: a */
    void mo5661a(C5508e c5508e, String str);

    /* renamed from: a */
    void mo5662a(C6761j c6761j, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo5663a(C6761j c6761j, C5495l c5495l);

    /* renamed from: a */
    void mo5664a(C6762l c6762l);

    /* renamed from: a */
    void mo5665a(List<C6763n> list, PendingIntent pendingIntent, C5508e c5508e, String str);

    /* renamed from: a */
    void mo5666a(boolean z);

    /* renamed from: a */
    void mo5667a(String[] strArr, C5508e c5508e, String str);

    /* renamed from: b */
    Location mo5668b(String str);

    /* renamed from: b */
    IBinder mo5669b();

    /* renamed from: b */
    C6691q mo5670b(PendingIntent pendingIntent);

    /* renamed from: c */
    C6744m mo5671c(String str);

    /* renamed from: c */
    void mo5672c(PendingIntent pendingIntent);
}
