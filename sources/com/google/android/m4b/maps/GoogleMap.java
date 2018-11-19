package com.google.android.m4b.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.m4b.maps.LocationSource.OnLocationChangedListener;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.IndoorBuilding;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.MapsEngineFeature;
import com.google.android.m4b.maps.model.Marker;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.PointOfInterest;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate.Stub;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.C5536d.C6804a;
import com.google.android.m4b.maps.p124x.C5538f;
import com.google.android.m4b.maps.p124x.C5539g.C6809a;
import com.google.android.m4b.maps.p124x.C5541i.C6812a;
import com.google.android.m4b.maps.p124x.C5544l.C6816a;
import com.google.android.m4b.maps.p124x.C5545m.C6818a;
import com.google.android.m4b.maps.p124x.C5546n.C6820a;
import com.google.android.m4b.maps.p124x.C5547o.C6822a;
import com.google.android.m4b.maps.p124x.C5548p;
import com.google.android.m4b.maps.p124x.C5549q.C6826a;
import com.google.android.m4b.maps.p124x.C5550r.C6828a;
import com.google.android.m4b.maps.p124x.C5551s.C6830a;
import com.google.android.m4b.maps.p124x.C5553u.C6834a;
import com.google.android.m4b.maps.p124x.C5554v.C6836a;
import com.google.android.m4b.maps.p124x.C5555w.C6838a;
import com.google.android.m4b.maps.p124x.C5556x.C6840a;
import com.google.android.m4b.maps.p124x.C5557y.C6842a;
import com.google.android.m4b.maps.p124x.C5558z.C6844a;
import com.google.android.m4b.maps.p124x.ag.C6795a;
import java.util.ArrayList;
import java.util.List;

public final class GoogleMap {
    /* renamed from: a */
    private final C5538f f16758a;
    /* renamed from: b */
    private UiSettings f16759b;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    @Deprecated
    public interface OAuthTokenProvider {
        String getOAuthToken();

        void invalidateOAuthToken(String str);
    }

    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    @Deprecated
    public interface OnMapsEngineFeatureClickListener {
        void onFeatureClick(List<MapsEngineFeature> list);

        void onFeatureInformationReceived(List<MapsEngineFeature> list);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location location);
    }

    public interface OnPoiClickListener {
        void onPoiClick(PointOfInterest pointOfInterest);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$10 */
    class AnonymousClass10 extends C6818a {
        /* renamed from: a */
        private /* synthetic */ OnCameraChangeListener f27084a;

        /* renamed from: a */
        public final void mo5313a(CameraPosition cameraPosition) {
            this.f27084a.onCameraChange(cameraPosition);
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$12 */
    class AnonymousClass12 extends C6830a {
        /* renamed from: a */
        private /* synthetic */ OnMapLongClickListener f27087a;

        /* renamed from: a */
        public final void mo5802a(LatLng latLng) {
            this.f27087a.onMapLongClick(latLng);
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$13 */
    class AnonymousClass13 extends C6836a {
        /* renamed from: a */
        private /* synthetic */ OnMarkerClickListener f27088a;

        /* renamed from: a */
        public final boolean mo5806a(IMarkerDelegate iMarkerDelegate) {
            return this.f27088a.onMarkerClick(new Marker(iMarkerDelegate));
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$1 */
    class C73681 extends C6820a {
        /* renamed from: a */
        private /* synthetic */ OnIndoorStateChangeListener f27095a;

        /* renamed from: a */
        public final void mo5795a() {
            this.f27095a.onIndoorBuildingFocused();
        }

        /* renamed from: a */
        public final void mo5796a(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
            this.f27095a.onIndoorLevelActivated(new IndoorBuilding(iIndoorBuildingDelegate));
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$2 */
    class C73692 extends C6842a {
        /* renamed from: a */
        private /* synthetic */ OnMyLocationChangeListener f27096a;

        /* renamed from: a */
        public final void mo5811a(C5484b c5484b) {
            this.f27096a.onMyLocationChange((Location) C7701d.m33408a(c5484b));
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$3 */
    class C73703 extends C6840a {
        /* renamed from: a */
        private /* synthetic */ OnMyLocationButtonClickListener f27097a;

        /* renamed from: a */
        public final boolean mo5810a() {
            return this.f27097a.onMyLocationButtonClick();
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$4 */
    class C73714 extends C6828a {
        /* renamed from: a */
        private /* synthetic */ OnMapLoadedCallback f27098a;

        /* renamed from: a */
        public final void mo5801a() {
            this.f27098a.onMapLoaded();
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$5 */
    class C73725 extends C6795a {
        /* renamed from: a */
        private /* synthetic */ SnapshotReadyCallback f27099a;

        /* renamed from: a */
        public final void mo5695a(Bitmap bitmap) {
            this.f27099a.onSnapshotReady(bitmap);
        }

        /* renamed from: a */
        public final void mo5696a(C5484b c5484b) {
            this.f27099a.onSnapshotReady((Bitmap) C7701d.m33408a(c5484b));
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$6 */
    class C73736 extends C6816a {
        /* renamed from: a */
        private /* synthetic */ OAuthTokenProvider f27100a;

        /* renamed from: a */
        public final String mo5793a() {
            return this.f27100a.getOAuthToken();
        }

        /* renamed from: a */
        public final void mo5794a(String str) {
            this.f27100a.invalidateOAuthToken(str);
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$7 */
    class C73747 extends C6834a {
        /* renamed from: a */
        private /* synthetic */ OnMapsEngineFeatureClickListener f27101a;

        /* renamed from: a */
        public final void mo5804a(List<IBinder> list) {
            List arrayList = new ArrayList(list.size());
            for (IBinder a : list) {
                arrayList.add(new MapsEngineFeature(Stub.m30022a(a)));
            }
            this.f27101a.onFeatureClick(arrayList);
        }

        /* renamed from: b */
        public final void mo5805b(List<IBinder> list) {
            List arrayList = new ArrayList(list.size());
            for (IBinder a : list) {
                arrayList.add(new MapsEngineFeature(Stub.m30022a(a)));
            }
            this.f27101a.onFeatureInformationReceived(arrayList);
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$8 */
    class C73758 extends C6844a {
        /* renamed from: a */
        private /* synthetic */ OnPoiClickListener f27102a;

        /* renamed from: a */
        public final void mo5812a(PointOfInterest pointOfInterest) {
            this.f27102a.onPoiClick(pointOfInterest);
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$9 */
    class C73769 extends C6812a {
        /* renamed from: a */
        private /* synthetic */ LocationSource f27103a;

        /* renamed from: a */
        public final void mo5792a(final C5548p c5548p) {
            this.f27103a.activate(new OnLocationChangedListener(this) {
                /* renamed from: b */
                private /* synthetic */ C73769 f23571b;

                public final void onLocationChanged(Location location) {
                    try {
                        c5548p.mo5798a(location);
                    } catch (Location location2) {
                        throw new RuntimeRemoteException(location2);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo5791a() {
            this.f27103a.deactivate();
        }
    }

    /* renamed from: com.google.android.m4b.maps.GoogleMap$a */
    static final class C7377a extends C6804a {
        /* renamed from: a */
        private final CancelableCallback f27104a;

        C7377a(CancelableCallback cancelableCallback) {
            this.f27104a = cancelableCallback;
        }

        /* renamed from: a */
        public final void mo5736a() {
            this.f27104a.onFinish();
        }

        /* renamed from: b */
        public final void mo5737b() {
            this.f27104a.onCancel();
        }
    }

    protected GoogleMap(C5538f c5538f) {
        this.f16758a = (C5538f) C5462v.m23767a((Object) c5538f);
    }

    /* renamed from: a */
    final C5538f m20389a() {
        return this.f16758a;
    }

    /* renamed from: b */
    public final CameraPosition m20396b() {
        try {
            return this.f16758a.mo5768b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void m20391a(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        try {
            C5538f c5538f = this.f16758a;
            cameraUpdate = cameraUpdate.m20383a();
            if (cancelableCallback == null) {
                cancelableCallback = null;
            } else {
                cancelableCallback = new C7377a(cancelableCallback);
            }
            c5538f.mo5748a(cameraUpdate, i, cancelableCallback);
        } catch (CameraUpdate cameraUpdate2) {
            throw new RuntimeRemoteException(cameraUpdate2);
        }
    }

    /* renamed from: a */
    public final Marker m20388a(MarkerOptions markerOptions) {
        try {
            markerOptions = this.f16758a.mo5741a(markerOptions);
            return markerOptions != null ? new Marker(markerOptions) : null;
        } catch (MarkerOptions markerOptions2) {
            throw new RuntimeRemoteException(markerOptions2);
        }
    }

    /* renamed from: a */
    public final void m20390a(int i) {
        try {
            this.f16758a.mo5745a(i);
        } catch (int i2) {
            throw new RuntimeRemoteException(i2);
        }
    }

    /* renamed from: c */
    public final UiSettings m20397c() {
        try {
            if (this.f16759b == null) {
                this.f16759b = new UiSettings(this.f16758a.mo5784l());
            }
            return this.f16759b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final Projection m20398d() {
        try {
            return new Projection(this.f16758a.mo5785m());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void m20394a(final OnMapClickListener onMapClickListener) {
        if (onMapClickListener == null) {
            try {
                this.f16758a.mo5757a(null);
                return;
            } catch (OnMapClickListener onMapClickListener2) {
                throw new RuntimeRemoteException(onMapClickListener2);
            }
        }
        this.f16758a.mo5757a(new C6826a(this) {
            /* renamed from: b */
            private /* synthetic */ GoogleMap f27086b;

            /* renamed from: a */
            public final void mo5800a(LatLng latLng) {
                onMapClickListener2.onMapClick(latLng);
            }
        });
    }

    /* renamed from: a */
    public final void m20395a(final OnMarkerDragListener onMarkerDragListener) {
        if (onMarkerDragListener == null) {
            try {
                this.f16758a.mo5763a(null);
                return;
            } catch (OnMarkerDragListener onMarkerDragListener2) {
                throw new RuntimeRemoteException(onMarkerDragListener2);
            }
        }
        this.f16758a.mo5763a(new C6838a(this) {
            /* renamed from: b */
            private /* synthetic */ GoogleMap f27090b;

            /* renamed from: a */
            public final void mo5807a(IMarkerDelegate iMarkerDelegate) {
                onMarkerDragListener2.onMarkerDragStart(new Marker(iMarkerDelegate));
            }

            /* renamed from: b */
            public final void mo5808b(IMarkerDelegate iMarkerDelegate) {
                onMarkerDragListener2.onMarkerDragEnd(new Marker(iMarkerDelegate));
            }

            /* renamed from: c */
            public final void mo5809c(IMarkerDelegate iMarkerDelegate) {
                onMarkerDragListener2.onMarkerDrag(new Marker(iMarkerDelegate));
            }
        });
    }

    /* renamed from: a */
    public final void m20393a(final OnInfoWindowClickListener onInfoWindowClickListener) {
        if (onInfoWindowClickListener == null) {
            try {
                this.f16758a.mo5756a(null);
                return;
            } catch (OnInfoWindowClickListener onInfoWindowClickListener2) {
                throw new RuntimeRemoteException(onInfoWindowClickListener2);
            }
        }
        this.f16758a.mo5756a(new C6822a(this) {
            /* renamed from: b */
            private /* synthetic */ GoogleMap f27092b;

            /* renamed from: a */
            public final void mo5797a(IMarkerDelegate iMarkerDelegate) {
                onInfoWindowClickListener2.onInfoWindowClick(new Marker(iMarkerDelegate));
            }
        });
    }

    /* renamed from: a */
    public final void m20392a(final InfoWindowAdapter infoWindowAdapter) {
        if (infoWindowAdapter == null) {
            try {
                this.f16758a.mo5751a(null);
                return;
            } catch (InfoWindowAdapter infoWindowAdapter2) {
                throw new RuntimeRemoteException(infoWindowAdapter2);
            }
        }
        this.f16758a.mo5751a(new C6809a(this) {
            /* renamed from: b */
            private /* synthetic */ GoogleMap f27094b;

            /* renamed from: a */
            public final C5484b mo5789a(IMarkerDelegate iMarkerDelegate) {
                return C7701d.m33407a(infoWindowAdapter2.getInfoWindow(new Marker(iMarkerDelegate)));
            }

            /* renamed from: b */
            public final C5484b mo5790b(IMarkerDelegate iMarkerDelegate) {
                return C7701d.m33407a(infoWindowAdapter2.getInfoContents(new Marker(iMarkerDelegate)));
            }
        });
    }
}
