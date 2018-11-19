package com.google.android.m4b.maps.p110j;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5457r.C6707a;

/* renamed from: com.google.android.m4b.maps.j.s */
public interface C5458s extends IInterface {

    /* renamed from: com.google.android.m4b.maps.j.s$a */
    public static abstract class C6709a extends Binder implements C5458s {

        /* renamed from: com.google.android.m4b.maps.j.s$a$a */
        static class C6708a implements C5458s {
            /* renamed from: a */
            private IBinder f25105a;

            C6708a(IBinder iBinder) {
                this.f25105a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25105a;
            }

            /* renamed from: a */
            public final void mo5448a(C5457r c5457r, int i, String str, String str2, String[] strArr, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5442a(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5441a(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(3, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5440a(C5457r c5457r, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    this.f25105a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo5454b(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo5456c(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo5458d(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo5460e(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5449a(C5457r c5457r, int i, String str, String str2, String[] strArr, String str3, IBinder iBinder, String str4, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str4);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5446a(C5457r c5457r, int i, String str, String str2, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    this.f25105a.transact(10, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo5462f(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo5464g(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo5466h(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final void mo5468i(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo5470j(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo5472k(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo5474l(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo5476m(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5443a(C5457r c5457r, int i, String str, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5450a(C5457r c5457r, int i, String str, String[] strArr, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo5453b(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(21, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo5455c(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(22, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final void mo5477n(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo5457d(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(24, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public final void mo5478o(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo5459e(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(26, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final void mo5479p(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5439a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    this.f25105a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5447a(C5457r c5457r, int i, String str, String str2, String[] strArr, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo5461f(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(31, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo5463g(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(32, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5445a(C5457r c5457r, int i, String str, String str2, String str3, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStringArray(strArr);
                    this.f25105a.transact(33, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5444a(C5457r c5457r, int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f25105a.transact(34, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo5465h(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(35, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final void mo5467i(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(36, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public final void mo5480q(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public final void mo5481r(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo5469j(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(40, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public final void mo5482s(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo5471k(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(42, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public final void mo5483t(C5457r c5457r, int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo5473l(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(44, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo5475m(C5457r c5457r, int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f25105a.transact(45, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5452a(C5457r c5457r, C6699i c6699i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    if (c6699i != null) {
                        obtain.writeInt(1);
                        c6699i.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5451a(C5457r c5457r, aa aaVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(c5457r != null ? c5457r.asBinder() : null);
                    if (aaVar != null) {
                        obtain.writeInt(1);
                        aaVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25105a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C5458s m29964a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5458s)) {
                return new C6708a(iBinder);
            }
            return (C5458s) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            C6709a c6709a = this;
            int i3 = i;
            Parcel parcel3 = parcel;
            if (i3 != 1598968902) {
                Bundle bundle = null;
                C5457r a;
                int readInt;
                String readString;
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5448a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel3) : null);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5442a(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5441a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5440a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5454b(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5456c(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5458d(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5460e(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5449a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel3) : null);
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5446a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5462f(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5464g(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5466h(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5468i(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5470j(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5472k(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5474l(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5476m(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5443a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel3) : null);
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5450a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel3) : null);
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5453b(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5455c(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5477n(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5457d(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5478o(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5459e(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        a = C6707a.m29918a(parcel.readStrongBinder());
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        mo5479p(a, readInt, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 28:
                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                        mo5439a();
                        parcel2.writeNoException();
                        return true;
                    default:
                        switch (i3) {
                            case 30:
                                parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                mo5447a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel3) : null);
                                parcel2.writeNoException();
                                return true;
                            case 31:
                                parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                mo5461f(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                                parcel2.writeNoException();
                                return true;
                            case 32:
                                parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                mo5463g(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                                parcel2.writeNoException();
                                return true;
                            case 33:
                                parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                mo5445a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                                parcel2.writeNoException();
                                return true;
                            case 34:
                                parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                mo5444a(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
                                parcel2.writeNoException();
                                return true;
                            case 35:
                                parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                mo5465h(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                                parcel2.writeNoException();
                                return true;
                            case 36:
                                parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                mo5467i(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                                parcel2.writeNoException();
                                return true;
                            case 37:
                                parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                a = C6707a.m29918a(parcel.readStrongBinder());
                                readInt = parcel.readInt();
                                readString = parcel.readString();
                                if (parcel.readInt() != 0) {
                                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                }
                                mo5480q(a, readInt, readString, bundle);
                                parcel2.writeNoException();
                                return true;
                            case 38:
                                parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                a = C6707a.m29918a(parcel.readStrongBinder());
                                readInt = parcel.readInt();
                                readString = parcel.readString();
                                if (parcel.readInt() != 0) {
                                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                }
                                mo5481r(a, readInt, readString, bundle);
                                parcel2.writeNoException();
                                return true;
                            default:
                                switch (i3) {
                                    case 40:
                                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                        mo5469j(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                                        parcel2.writeNoException();
                                        return true;
                                    case 41:
                                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                        a = C6707a.m29918a(parcel.readStrongBinder());
                                        readInt = parcel.readInt();
                                        readString = parcel.readString();
                                        if (parcel.readInt() != 0) {
                                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                        }
                                        mo5482s(a, readInt, readString, bundle);
                                        parcel2.writeNoException();
                                        return true;
                                    case 42:
                                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                        mo5471k(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                                        parcel2.writeNoException();
                                        return true;
                                    case 43:
                                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                        a = C6707a.m29918a(parcel.readStrongBinder());
                                        readInt = parcel.readInt();
                                        readString = parcel.readString();
                                        if (parcel.readInt() != 0) {
                                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                        }
                                        mo5483t(a, readInt, readString, bundle);
                                        parcel2.writeNoException();
                                        return true;
                                    case 44:
                                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                        mo5473l(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                                        parcel2.writeNoException();
                                        return true;
                                    case 45:
                                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                        mo5475m(C6707a.m29918a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                                        parcel2.writeNoException();
                                        return true;
                                    case 46:
                                        C6699i c6699i;
                                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                        a = C6707a.m29918a(parcel.readStrongBinder());
                                        if (parcel.readInt() != 0) {
                                            c6699i = (C6699i) C6699i.CREATOR.createFromParcel(parcel3);
                                        }
                                        mo5452a(a, c6699i);
                                        parcel2.writeNoException();
                                        return true;
                                    case 47:
                                        aa aaVar;
                                        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                        a = C6707a.m29918a(parcel.readStrongBinder());
                                        if (parcel.readInt() != 0) {
                                            aaVar = (aa) aa.CREATOR.createFromParcel(parcel3);
                                        }
                                        mo5451a(a, aaVar);
                                        parcel2.writeNoException();
                                        return true;
                                    default:
                                        return super.onTransact(i, parcel, parcel2, i2);
                                }
                        }
                }
            }
            parcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
            return true;
        }
    }

    /* renamed from: a */
    void mo5439a();

    /* renamed from: a */
    void mo5440a(C5457r c5457r, int i);

    /* renamed from: a */
    void mo5441a(C5457r c5457r, int i, String str);

    /* renamed from: a */
    void mo5442a(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: a */
    void mo5443a(C5457r c5457r, int i, String str, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo5444a(C5457r c5457r, int i, String str, String str2);

    /* renamed from: a */
    void mo5445a(C5457r c5457r, int i, String str, String str2, String str3, String[] strArr);

    /* renamed from: a */
    void mo5446a(C5457r c5457r, int i, String str, String str2, String[] strArr);

    /* renamed from: a */
    void mo5447a(C5457r c5457r, int i, String str, String str2, String[] strArr, Bundle bundle);

    /* renamed from: a */
    void mo5448a(C5457r c5457r, int i, String str, String str2, String[] strArr, String str3, Bundle bundle);

    /* renamed from: a */
    void mo5449a(C5457r c5457r, int i, String str, String str2, String[] strArr, String str3, IBinder iBinder, String str4, Bundle bundle);

    /* renamed from: a */
    void mo5450a(C5457r c5457r, int i, String str, String[] strArr, String str2, Bundle bundle);

    /* renamed from: a */
    void mo5451a(C5457r c5457r, aa aaVar);

    /* renamed from: a */
    void mo5452a(C5457r c5457r, C6699i c6699i);

    /* renamed from: b */
    void mo5453b(C5457r c5457r, int i, String str);

    /* renamed from: b */
    void mo5454b(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: c */
    void mo5455c(C5457r c5457r, int i, String str);

    /* renamed from: c */
    void mo5456c(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: d */
    void mo5457d(C5457r c5457r, int i, String str);

    /* renamed from: d */
    void mo5458d(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: e */
    void mo5459e(C5457r c5457r, int i, String str);

    /* renamed from: e */
    void mo5460e(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: f */
    void mo5461f(C5457r c5457r, int i, String str);

    /* renamed from: f */
    void mo5462f(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: g */
    void mo5463g(C5457r c5457r, int i, String str);

    /* renamed from: g */
    void mo5464g(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: h */
    void mo5465h(C5457r c5457r, int i, String str);

    /* renamed from: h */
    void mo5466h(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: i */
    void mo5467i(C5457r c5457r, int i, String str);

    /* renamed from: i */
    void mo5468i(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: j */
    void mo5469j(C5457r c5457r, int i, String str);

    /* renamed from: j */
    void mo5470j(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: k */
    void mo5471k(C5457r c5457r, int i, String str);

    /* renamed from: k */
    void mo5472k(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: l */
    void mo5473l(C5457r c5457r, int i, String str);

    /* renamed from: l */
    void mo5474l(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: m */
    void mo5475m(C5457r c5457r, int i, String str);

    /* renamed from: m */
    void mo5476m(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: n */
    void mo5477n(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: o */
    void mo5478o(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: p */
    void mo5479p(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: q */
    void mo5480q(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: r */
    void mo5481r(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: s */
    void mo5482s(C5457r c5457r, int i, String str, Bundle bundle);

    /* renamed from: t */
    void mo5483t(C5457r c5457r, int i, String str, Bundle bundle);
}
