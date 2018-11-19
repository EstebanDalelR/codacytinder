package com.google.android.m4b.maps.p124x;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.CircleOptions;
import com.google.android.m4b.maps.model.GroundOverlayOptions;
import com.google.android.m4b.maps.model.MapsEngineLayerOptions;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.PolygonOptions;
import com.google.android.m4b.maps.model.PolylineOptions;
import com.google.android.m4b.maps.model.TileOverlayOptions;
import com.google.android.m4b.maps.model.internal.ICircleDelegate;
import com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate;
import com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.model.internal.IPolygonDelegate;
import com.google.android.m4b.maps.model.internal.IPolylineDelegate;
import com.google.android.m4b.maps.model.internal.IPolylineDelegate.Stub;
import com.google.android.m4b.maps.model.internal.ITileOverlayDelegate;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;
import com.google.android.m4b.maps.p124x.C5536d.C6804a;
import com.google.android.m4b.maps.p124x.C5539g.C6809a.C6808a;
import com.google.android.m4b.maps.p124x.C5541i.C6812a.C6811a;
import com.google.android.m4b.maps.p124x.C5544l.C6816a.C6815a;
import com.google.android.m4b.maps.p124x.C5545m.C6818a.C6817a;
import com.google.android.m4b.maps.p124x.C5546n.C6820a.C6819a;
import com.google.android.m4b.maps.p124x.C5547o.C6822a.C6821a;
import com.google.android.m4b.maps.p124x.C5549q.C6826a.C6825a;
import com.google.android.m4b.maps.p124x.C5550r.C6828a.C6827a;
import com.google.android.m4b.maps.p124x.C5551s.C6830a.C6829a;
import com.google.android.m4b.maps.p124x.C5552t.C6832a;
import com.google.android.m4b.maps.p124x.C5553u.C6834a.C6833a;
import com.google.android.m4b.maps.p124x.C5554v.C6836a.C6835a;
import com.google.android.m4b.maps.p124x.C5555w.C6838a.C6837a;
import com.google.android.m4b.maps.p124x.C5556x.C6840a.C6839a;
import com.google.android.m4b.maps.p124x.C5557y.C6842a.C6841a;
import com.google.android.m4b.maps.p124x.C5558z.C6844a.C6843a;
import com.google.android.m4b.maps.p124x.af.C6793a;
import com.google.android.m4b.maps.p124x.ag.C6795a.C6794a;
import com.google.android.m4b.maps.p124x.ak.C6801a;

/* renamed from: com.google.android.m4b.maps.x.f */
public interface C5538f extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.f$a */
    public static abstract class C6807a extends Binder implements C5538f {

        /* renamed from: com.google.android.m4b.maps.x.f$a$a */
        static class C6806a implements C5538f {
            /* renamed from: a */
            private IBinder f25362a;

            C6806a(IBinder iBinder) {
                this.f25362a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25362a;
            }

            /* renamed from: b */
            public final CameraPosition mo5768b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    CameraPosition a = obtain2.readInt() != 0 ? CameraPosition.CREATOR.m23853a(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final float mo5772c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final float mo5775d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5747a(C5484b c5484b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    this.f25362a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo5769b(C5484b c5484b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    this.f25362a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5749a(C5484b c5484b, C5536d c5536d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    if (c5536d != null) {
                        iBinder = c5536d.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f25362a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5748a(C5484b c5484b, int i, C5536d c5536d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    obtain.writeInt(i);
                    if (c5536d != null) {
                        iBinder = c5536d.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f25362a.transact(7, obtain, obtain2, null);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo5777e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final IPolylineDelegate mo5743a(PolylineOptions polylineOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (polylineOptions != null) {
                        obtain.writeInt(1);
                        polylineOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    polylineOptions = Stub.m30026a(obtain2.readStrongBinder());
                    return polylineOptions;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final IPolygonDelegate mo5742a(PolygonOptions polygonOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (polygonOptions != null) {
                        obtain.writeInt(1);
                        polygonOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    polygonOptions = IPolygonDelegate.Stub.m30025a(obtain2.readStrongBinder());
                    return polygonOptions;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final IMarkerDelegate mo5741a(MarkerOptions markerOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (markerOptions != null) {
                        obtain.writeInt(1);
                        markerOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    markerOptions = IMarkerDelegate.Stub.m30024a(obtain2.readStrongBinder());
                    return markerOptions;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final IGroundOverlayDelegate mo5739a(GroundOverlayOptions groundOverlayOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (groundOverlayOptions != null) {
                        obtain.writeInt(1);
                        groundOverlayOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    groundOverlayOptions = IGroundOverlayDelegate.Stub.m30019a(obtain2.readStrongBinder());
                    return groundOverlayOptions;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final ITileOverlayDelegate mo5744a(TileOverlayOptions tileOverlayOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (tileOverlayOptions != null) {
                        obtain.writeInt(1);
                        tileOverlayOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    tileOverlayOptions = ITileOverlayDelegate.Stub.m30027a(obtain2.readStrongBinder());
                    return tileOverlayOptions;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo5778f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final int mo5779g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5745a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(i);
                    this.f25362a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final boolean mo5780h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f25362a.transact(17, obtain, obtain2, 0);
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
            public final void mo5767a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z);
                    this.f25362a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final boolean mo5781i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f25362a.transact(19, obtain, obtain2, 0);
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
            public final boolean mo5771b(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z);
                    boolean z2 = false;
                    this.f25362a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt()) {
                        z2 = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final boolean mo5782j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f25362a.transact(21, obtain, obtain2, 0);
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
            public final void mo5774c(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z);
                    this.f25362a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final Location mo5783k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(23, obtain, obtain2, 0);
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
            public final void mo5752a(C5541i c5541i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5541i != null ? c5541i.asBinder() : null);
                    this.f25362a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final ak mo5784l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    ak a = C6801a.m30209a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final af mo5785m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    af a = C6793a.m30166a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5754a(C5545m c5545m) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5545m != null ? c5545m.asBinder() : null);
                    this.f25362a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5757a(C5549q c5549q) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5549q != null ? c5549q.asBinder() : null);
                    this.f25362a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5759a(C5551s c5551s) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5551s != null ? c5551s.asBinder() : null);
                    this.f25362a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5762a(C5554v c5554v) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5554v != null ? c5554v.asBinder() : null);
                    this.f25362a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5763a(C5555w c5555w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5555w != null ? c5555w.asBinder() : null);
                    this.f25362a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5756a(C5547o c5547o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5547o != null ? c5547o.asBinder() : null);
                    this.f25362a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5751a(C5539g c5539g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5539g != null ? c5539g.asBinder() : null);
                    this.f25362a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final ICircleDelegate mo5738a(CircleOptions circleOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (circleOptions != null) {
                        obtain.writeInt(1);
                        circleOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    circleOptions = ICircleDelegate.Stub.m30018a(obtain2.readStrongBinder());
                    return circleOptions;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5765a(C5557y c5557y) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5557y != null ? c5557y.asBinder() : null);
                    this.f25362a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5764a(C5556x c5556x) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5556x != null ? c5556x.asBinder() : null);
                    this.f25362a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5750a(ag agVar, C5484b c5484b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(agVar != null ? agVar.asBinder() : null);
                    if (c5484b != null) {
                        iBinder = c5484b.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f25362a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5746a(int i, int i2, int i3, int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.f25362a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final boolean mo5786n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f25362a.transact(40, obtain, obtain2, 0);
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
            public final void mo5776d(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z);
                    this.f25362a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5758a(C5550r c5550r) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5550r != null ? c5550r.asBinder() : null);
                    this.f25362a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public final IIndoorBuildingDelegate mo5787o() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    IIndoorBuildingDelegate a = IIndoorBuildingDelegate.Stub.m30020a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5755a(C5546n c5546n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5546n != null ? c5546n.asBinder() : null);
                    this.f25362a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5753a(C5544l c5544l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5544l != null ? c5544l.asBinder() : null);
                    this.f25362a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final IMapsEngineLayerDelegate mo5740a(MapsEngineLayerOptions mapsEngineLayerOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (mapsEngineLayerOptions != null) {
                        obtain.writeInt(1);
                        mapsEngineLayerOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                    mapsEngineLayerOptions = IMapsEngineLayerDelegate.Stub.m30023a(obtain2.readStrongBinder());
                    return mapsEngineLayerOptions;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5761a(C5553u c5553u) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5553u != null ? c5553u.asBinder() : null);
                    this.f25362a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5760a(C5552t c5552t) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5552t != null ? c5552t.asBinder() : null);
                    this.f25362a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5323a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final void mo5325p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public final void mo5326q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(56, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public final void mo5327r() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public final void mo5328s() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(58, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public final boolean mo5329t() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f25362a.transact(59, obtain, obtain2, 0);
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
            public final void mo5324b(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo5770b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeString(str);
                    this.f25362a.transact(61, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5766a(C5558z c5558z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(c5558z != null ? c5558z.asBinder() : null);
                    this.f25362a.transact(80, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo5773c(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25362a.transact(81, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public final void mo5788u() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                    this.f25362a.transact(82, obtain, obtain2, 0);
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

        public C6807a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IGoogleMapDelegate");
        }

        /* renamed from: a */
        public static C5538f m30271a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5538f)) {
                return new C6806a(iBinder);
            }
            return (C5538f) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5768b();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5772c();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5775d();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        mo5747a((C5484b) C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        mo5769b((C5484b) C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        mo5749a((C5484b) C6735a.m30039a(parcel.readStrongBinder()), (C5536d) C6804a.m30212a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        mo5748a(C6735a.m30039a(parcel.readStrongBinder()), parcel.readInt(), C6804a.m30212a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        mo5777e();
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5743a((PolylineOptions) parcel.readInt() != 0 ? PolylineOptions.CREATOR.m23892a(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5742a((PolygonOptions) parcel.readInt() != 0 ? PolygonOptions.CREATOR.m23889a(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5741a((MarkerOptions) parcel.readInt() != 0 ? MarkerOptions.CREATOR.m23883a(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5739a((GroundOverlayOptions) parcel.readInt() != 0 ? GroundOverlayOptions.CREATOR.m23859a(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5744a((TileOverlayOptions) parcel.readInt() != 0 ? TileOverlayOptions.CREATOR.m23913a(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        mo5778f();
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5779g();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        mo5745a(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5780h();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5767a(z);
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5781i();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 20:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        i = mo5771b(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 21:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5782j();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 22:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5774c(z);
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5783k();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 24:
                        C5541i c6811a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
                            if (parcel == null || (parcel instanceof C5541i) == 0) {
                                c6811a = new C6811a(i);
                            } else {
                                c6811a = (C5541i) parcel;
                            }
                        }
                        mo5752a(c6811a);
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5784l();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 26:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = mo5785m();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 27:
                        C5545m c6817a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnCameraChangeListener");
                            if (parcel == null || (parcel instanceof C5545m) == 0) {
                                c6817a = new C6817a(i);
                            } else {
                                c6817a = (C5545m) parcel;
                            }
                        }
                        mo5754a(c6817a);
                        parcel2.writeNoException();
                        return true;
                    case 28:
                        C5549q c6825a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapClickListener");
                            if (parcel == null || (parcel instanceof C5549q) == 0) {
                                c6825a = new C6825a(i);
                            } else {
                                c6825a = (C5549q) parcel;
                            }
                        }
                        mo5757a(c6825a);
                        parcel2.writeNoException();
                        return true;
                    case 29:
                        C5551s c6829a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapLongClickListener");
                            if (parcel == null || (parcel instanceof C5551s) == 0) {
                                c6829a = new C6829a(i);
                            } else {
                                c6829a = (C5551s) parcel;
                            }
                        }
                        mo5759a(c6829a);
                        parcel2.writeNoException();
                        return true;
                    case 30:
                        C5554v c6835a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMarkerClickListener");
                            if (parcel == null || (parcel instanceof C5554v) == 0) {
                                c6835a = new C6835a(i);
                            } else {
                                c6835a = (C5554v) parcel;
                            }
                        }
                        mo5762a(c6835a);
                        parcel2.writeNoException();
                        return true;
                    case 31:
                        C5555w c6837a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                            if (parcel == null || (parcel instanceof C5555w) == 0) {
                                c6837a = new C6837a(i);
                            } else {
                                c6837a = (C5555w) parcel;
                            }
                        }
                        mo5763a(c6837a);
                        parcel2.writeNoException();
                        return true;
                    case 32:
                        C5547o c6821a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnInfoWindowClickListener");
                            if (parcel == null || (parcel instanceof C5547o) == 0) {
                                c6821a = new C6821a(i);
                            } else {
                                c6821a = (C5547o) parcel;
                            }
                        }
                        mo5756a(c6821a);
                        parcel2.writeNoException();
                        return true;
                    case 33:
                        C5539g c6808a;
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                        i = parcel.readStrongBinder();
                        if (i != 0) {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
                            if (parcel == null || (parcel instanceof C5539g) == 0) {
                                c6808a = new C6808a(i);
                            } else {
                                c6808a = (C5539g) parcel;
                            }
                        }
                        mo5751a(c6808a);
                        parcel2.writeNoException();
                        return true;
                    default:
                        switch (i) {
                            case 35:
                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                i = mo5738a((CircleOptions) parcel.readInt() != 0 ? CircleOptions.CREATOR.m23856a(parcel) : 0);
                                parcel2.writeNoException();
                                if (i != 0) {
                                    iBinder = i.asBinder();
                                }
                                parcel2.writeStrongBinder(iBinder);
                                return true;
                            case 36:
                                C5557y c6841a;
                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                i = parcel.readStrongBinder();
                                if (i != 0) {
                                    parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMyLocationChangeListener");
                                    if (parcel == null || (parcel instanceof C5557y) == 0) {
                                        c6841a = new C6841a(i);
                                    } else {
                                        c6841a = (C5557y) parcel;
                                    }
                                }
                                mo5765a(c6841a);
                                parcel2.writeNoException();
                                return true;
                            case 37:
                                C5556x c6839a;
                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                i = parcel.readStrongBinder();
                                if (i != 0) {
                                    parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMyLocationButtonClickListener");
                                    if (parcel == null || (parcel instanceof C5556x) == 0) {
                                        c6839a = new C6839a(i);
                                    } else {
                                        c6839a = (C5556x) parcel;
                                    }
                                }
                                mo5764a(c6839a);
                                parcel2.writeNoException();
                                return true;
                            case 38:
                                ag c6794a;
                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                i = parcel.readStrongBinder();
                                if (i != 0) {
                                    i2 = i.queryLocalInterface("com.google.android.m4b.maps.internal.ISnapshotReadyCallback");
                                    if (i2 == 0 || !(i2 instanceof ag)) {
                                        c6794a = new C6794a(i);
                                    } else {
                                        c6794a = (ag) i2;
                                    }
                                }
                                mo5750a(c6794a, (C5484b) C6735a.m30039a(parcel.readStrongBinder()));
                                parcel2.writeNoException();
                                return true;
                            case 39:
                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                mo5746a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                                parcel2.writeNoException();
                                return true;
                            case 40:
                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                i = mo5786n();
                                parcel2.writeNoException();
                                parcel2.writeInt(i);
                                return true;
                            case 41:
                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                if (parcel.readInt() != 0) {
                                    z = true;
                                }
                                mo5776d(z);
                                parcel2.writeNoException();
                                return true;
                            case 42:
                                C5550r c6827a;
                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                i = parcel.readStrongBinder();
                                if (i != 0) {
                                    parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapLoadedCallback");
                                    if (parcel == null || (parcel instanceof C5550r) == 0) {
                                        c6827a = new C6827a(i);
                                    } else {
                                        c6827a = (C5550r) parcel;
                                    }
                                }
                                mo5758a(c6827a);
                                parcel2.writeNoException();
                                return true;
                            default:
                                switch (i) {
                                    case 44:
                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                        i = mo5787o();
                                        parcel2.writeNoException();
                                        if (i != 0) {
                                            iBinder = i.asBinder();
                                        }
                                        parcel2.writeStrongBinder(iBinder);
                                        return true;
                                    case 45:
                                        C5546n c6819a;
                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                        i = parcel.readStrongBinder();
                                        if (i != 0) {
                                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
                                            if (parcel == null || (parcel instanceof C5546n) == 0) {
                                                c6819a = new C6819a(i);
                                            } else {
                                                c6819a = (C5546n) parcel;
                                            }
                                        }
                                        mo5755a(c6819a);
                                        parcel2.writeNoException();
                                        return true;
                                    default:
                                        switch (i) {
                                            case 48:
                                                C5544l c6815a;
                                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                i = parcel.readStrongBinder();
                                                if (i != 0) {
                                                    parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
                                                    if (parcel == null || (parcel instanceof C5544l) == 0) {
                                                        c6815a = new C6815a(i);
                                                    } else {
                                                        c6815a = (C5544l) parcel;
                                                    }
                                                }
                                                mo5753a(c6815a);
                                                parcel2.writeNoException();
                                                return true;
                                            case 49:
                                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                i = mo5740a((MapsEngineLayerOptions) parcel.readInt() != 0 ? MapsEngineLayerOptions.CREATOR.m23873a(parcel) : 0);
                                                parcel2.writeNoException();
                                                if (i != 0) {
                                                    iBinder = i.asBinder();
                                                }
                                                parcel2.writeStrongBinder(iBinder);
                                                return true;
                                            case 50:
                                                C5553u c6833a;
                                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                i = parcel.readStrongBinder();
                                                if (i != 0) {
                                                    parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
                                                    if (parcel == null || (parcel instanceof C5553u) == 0) {
                                                        c6833a = new C6833a(i);
                                                    } else {
                                                        c6833a = (C5553u) parcel;
                                                    }
                                                }
                                                mo5761a(c6833a);
                                                parcel2.writeNoException();
                                                return true;
                                            default:
                                                Bundle bundle;
                                                switch (i) {
                                                    case 53:
                                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                        mo5760a((C5552t) C6832a.m30288a(parcel.readStrongBinder()));
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 54:
                                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                        if (parcel.readInt() != 0) {
                                                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                                        }
                                                        mo5323a(bundle);
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 55:
                                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                        mo5325p();
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 56:
                                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                        mo5326q();
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 57:
                                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                        mo5327r();
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 58:
                                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                        mo5328s();
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 59:
                                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                        i = mo5329t();
                                                        parcel2.writeNoException();
                                                        parcel2.writeInt(i);
                                                        return true;
                                                    case 60:
                                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                        if (parcel.readInt() != 0) {
                                                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                                        }
                                                        mo5324b(bundle);
                                                        parcel2.writeNoException();
                                                        if (bundle != null) {
                                                            parcel2.writeInt(1);
                                                            bundle.writeToParcel(parcel2, 1);
                                                        } else {
                                                            parcel2.writeInt(0);
                                                        }
                                                        return true;
                                                    case 61:
                                                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                        mo5770b((String) parcel.readString());
                                                        parcel2.writeNoException();
                                                        return true;
                                                    default:
                                                        switch (i) {
                                                            case 80:
                                                                C5558z c6843a;
                                                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                                i = parcel.readStrongBinder();
                                                                if (i != 0) {
                                                                    parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnPoiClickListener");
                                                                    if (parcel == null || (parcel instanceof C5558z) == 0) {
                                                                        c6843a = new C6843a(i);
                                                                    } else {
                                                                        c6843a = (C5558z) parcel;
                                                                    }
                                                                }
                                                                mo5766a(c6843a);
                                                                parcel2.writeNoException();
                                                                return true;
                                                            case 81:
                                                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                                if (parcel.readInt() != 0) {
                                                                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                                                }
                                                                mo5773c(bundle);
                                                                parcel2.writeNoException();
                                                                return true;
                                                            case 82:
                                                                parcel.enforceInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                                                                mo5788u();
                                                                parcel2.writeNoException();
                                                                return true;
                                                            default:
                                                                return super.onTransact(i, parcel, parcel2, i2);
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
            return true;
        }
    }

    /* renamed from: a */
    ICircleDelegate mo5738a(CircleOptions circleOptions);

    /* renamed from: a */
    IGroundOverlayDelegate mo5739a(GroundOverlayOptions groundOverlayOptions);

    /* renamed from: a */
    IMapsEngineLayerDelegate mo5740a(MapsEngineLayerOptions mapsEngineLayerOptions);

    /* renamed from: a */
    IMarkerDelegate mo5741a(MarkerOptions markerOptions);

    /* renamed from: a */
    IPolygonDelegate mo5742a(PolygonOptions polygonOptions);

    /* renamed from: a */
    IPolylineDelegate mo5743a(PolylineOptions polylineOptions);

    /* renamed from: a */
    ITileOverlayDelegate mo5744a(TileOverlayOptions tileOverlayOptions);

    /* renamed from: a */
    void mo5745a(int i);

    /* renamed from: a */
    void mo5746a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo5323a(Bundle bundle);

    /* renamed from: a */
    void mo5747a(C5484b c5484b);

    /* renamed from: a */
    void mo5748a(C5484b c5484b, int i, C5536d c5536d);

    /* renamed from: a */
    void mo5749a(C5484b c5484b, C5536d c5536d);

    /* renamed from: a */
    void mo5750a(ag agVar, C5484b c5484b);

    /* renamed from: a */
    void mo5751a(C5539g c5539g);

    /* renamed from: a */
    void mo5752a(C5541i c5541i);

    /* renamed from: a */
    void mo5753a(C5544l c5544l);

    /* renamed from: a */
    void mo5754a(C5545m c5545m);

    /* renamed from: a */
    void mo5755a(C5546n c5546n);

    /* renamed from: a */
    void mo5756a(C5547o c5547o);

    /* renamed from: a */
    void mo5757a(C5549q c5549q);

    /* renamed from: a */
    void mo5758a(C5550r c5550r);

    /* renamed from: a */
    void mo5759a(C5551s c5551s);

    /* renamed from: a */
    void mo5760a(C5552t c5552t);

    /* renamed from: a */
    void mo5761a(C5553u c5553u);

    /* renamed from: a */
    void mo5762a(C5554v c5554v);

    /* renamed from: a */
    void mo5763a(C5555w c5555w);

    /* renamed from: a */
    void mo5764a(C5556x c5556x);

    /* renamed from: a */
    void mo5765a(C5557y c5557y);

    /* renamed from: a */
    void mo5766a(C5558z c5558z);

    /* renamed from: a */
    void mo5767a(boolean z);

    /* renamed from: b */
    CameraPosition mo5768b();

    /* renamed from: b */
    void mo5324b(Bundle bundle);

    /* renamed from: b */
    void mo5769b(C5484b c5484b);

    /* renamed from: b */
    void mo5770b(String str);

    /* renamed from: b */
    boolean mo5771b(boolean z);

    /* renamed from: c */
    float mo5772c();

    /* renamed from: c */
    void mo5773c(Bundle bundle);

    /* renamed from: c */
    void mo5774c(boolean z);

    /* renamed from: d */
    float mo5775d();

    /* renamed from: d */
    void mo5776d(boolean z);

    /* renamed from: e */
    void mo5777e();

    /* renamed from: f */
    void mo5778f();

    /* renamed from: g */
    int mo5779g();

    /* renamed from: h */
    boolean mo5780h();

    /* renamed from: i */
    boolean mo5781i();

    /* renamed from: j */
    boolean mo5782j();

    /* renamed from: k */
    Location mo5783k();

    /* renamed from: l */
    ak mo5784l();

    /* renamed from: m */
    af mo5785m();

    /* renamed from: n */
    boolean mo5786n();

    /* renamed from: o */
    IIndoorBuildingDelegate mo5787o();

    /* renamed from: p */
    void mo5325p();

    /* renamed from: q */
    void mo5326q();

    /* renamed from: r */
    void mo5327r();

    /* renamed from: s */
    void mo5328s();

    /* renamed from: t */
    boolean mo5329t();

    /* renamed from: u */
    void mo5788u();
}
