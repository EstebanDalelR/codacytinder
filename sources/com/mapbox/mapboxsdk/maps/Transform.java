package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView.OnMapChangedListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.CancelableCallback;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraChangeListener;
import p000a.p001a.C0001a;

final class Transform implements OnMapChangedListener {
    private CancelableCallback cameraCancelableCallback;
    private CameraChangeDispatcher cameraChangeDispatcher;
    private CameraPosition cameraPosition;
    private final Handler handler = new Handler();
    private final NativeMapView mapView;
    private final MarkerViewManager markerViewManager;
    private OnCameraChangeListener onCameraChangeListener;

    /* renamed from: com.mapbox.mapboxsdk.maps.Transform$1 */
    class C58461 implements Runnable {
        C58461() {
        }

        public void run() {
            if (Transform.this.cameraCancelableCallback != null) {
                Transform.this.cameraCancelableCallback.onFinish();
                Transform.this.cameraCancelableCallback = null;
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.Transform$5 */
    class C71025 implements OnMapChangedListener {
        C71025() {
        }

        public void onMapChanged(int i) {
            if (i == 4) {
                Transform.this.mapView.removeOnMapChangedListener(this);
                Transform.this.cameraChangeDispatcher.onCameraIdle();
            }
        }
    }

    Transform(NativeMapView nativeMapView, MarkerViewManager markerViewManager, CameraChangeDispatcher cameraChangeDispatcher) {
        this.mapView = nativeMapView;
        this.markerViewManager = markerViewManager;
        this.cameraChangeDispatcher = cameraChangeDispatcher;
    }

    void initialise(@NonNull MapboxMap mapboxMap, @NonNull MapboxMapOptions mapboxMapOptions) {
        CameraPosition camera = mapboxMapOptions.getCamera();
        if (!(camera == null || camera.equals(CameraPosition.DEFAULT))) {
            moveCamera(mapboxMap, CameraUpdateFactory.newCameraPosition(camera), null);
        }
        setMinZoom(mapboxMapOptions.getMinZoomPreference());
        setMaxZoom(mapboxMapOptions.getMaxZoomPreference());
    }

    @UiThread
    public final CameraPosition getCameraPosition() {
        if (this.cameraPosition == null) {
            this.cameraPosition = invalidateCameraPosition();
        }
        return this.cameraPosition;
    }

    @UiThread
    void updateCameraPosition(@NonNull CameraPosition cameraPosition) {
        this.markerViewManager.setTilt((float) cameraPosition.tilt);
    }

    public void onMapChanged(int i) {
        if (i == 4) {
            updateCameraPosition(invalidateCameraPosition());
            if (this.cameraCancelableCallback != 0) {
                this.handler.post(new C58461());
            }
            this.cameraChangeDispatcher.onCameraIdle();
            this.mapView.removeOnMapChangedListener(this);
        }
    }

    @UiThread
    final void moveCamera(MapboxMap mapboxMap, CameraUpdate cameraUpdate, final CancelableCallback cancelableCallback) {
        mapboxMap = cameraUpdate.getCameraPosition(mapboxMap);
        if (isValidCameraPosition(mapboxMap) != null) {
            cancelTransitions();
            this.cameraChangeDispatcher.onCameraMoveStarted(3);
            this.mapView.jumpTo(mapboxMap.bearing, mapboxMap.target, mapboxMap.tilt, mapboxMap.zoom);
            this.cameraChangeDispatcher.onCameraIdle();
            invalidateCameraPosition();
            this.handler.post(new Runnable() {
                public void run() {
                    if (cancelableCallback != null) {
                        cancelableCallback.onFinish();
                    }
                }
            });
        }
    }

    @UiThread
    final void easeCamera(MapboxMap mapboxMap, CameraUpdate cameraUpdate, int i, boolean z, CancelableCallback cancelableCallback, boolean z2) {
        CancelableCallback cancelableCallback2 = cancelableCallback;
        CameraPosition cameraPosition = cameraUpdate.getCameraPosition(mapboxMap);
        if (isValidCameraPosition(cameraPosition)) {
            cancelTransitions();
            r0.cameraChangeDispatcher.onCameraMoveStarted(3);
            if (cancelableCallback2 != null) {
                r0.cameraCancelableCallback = cancelableCallback2;
            }
            r0.mapView.addOnMapChangedListener(r0);
            r0.mapView.easeTo(cameraPosition.bearing, cameraPosition.target, (long) i, cameraPosition.tilt, cameraPosition.zoom, z);
        }
    }

    @UiThread
    final void animateCamera(MapboxMap mapboxMap, CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        mapboxMap = cameraUpdate.getCameraPosition(mapboxMap);
        if (isValidCameraPosition(mapboxMap) != null) {
            cancelTransitions();
            this.cameraChangeDispatcher.onCameraMoveStarted(3);
            if (cancelableCallback != null) {
                this.cameraCancelableCallback = cancelableCallback;
            }
            this.mapView.addOnMapChangedListener(this);
            this.mapView.flyTo(mapboxMap.bearing, mapboxMap.target, (long) i, mapboxMap.tilt, mapboxMap.zoom);
        }
    }

    private boolean isValidCameraPosition(@Nullable CameraPosition cameraPosition) {
        return (cameraPosition == null || cameraPosition.equals(this.cameraPosition) != null) ? null : true;
    }

    @Nullable
    @UiThread
    CameraPosition invalidateCameraPosition() {
        if (this.mapView != null) {
            CameraPosition cameraPosition = this.mapView.getCameraPosition();
            if (!(this.cameraPosition == null || this.cameraPosition.equals(cameraPosition))) {
                this.cameraChangeDispatcher.onCameraMove();
            }
            if (isComponentUpdateRequired(cameraPosition)) {
                updateCameraPosition(cameraPosition);
            }
            this.cameraPosition = cameraPosition;
            if (this.onCameraChangeListener != null) {
                this.onCameraChangeListener.onCameraChange(this.cameraPosition);
            }
        }
        return this.cameraPosition;
    }

    private boolean isComponentUpdateRequired(@NonNull CameraPosition cameraPosition) {
        return (this.cameraPosition == null || (this.cameraPosition.tilt == cameraPosition.tilt && this.cameraPosition.bearing == cameraPosition.bearing)) ? null : true;
    }

    void cancelTransitions() {
        this.cameraChangeDispatcher.onCameraMoveCanceled();
        if (this.cameraCancelableCallback != null) {
            final CancelableCallback cancelableCallback = this.cameraCancelableCallback;
            this.cameraChangeDispatcher.onCameraIdle();
            this.handler.post(new Runnable() {
                public void run() {
                    cancelableCallback.onCancel();
                }
            });
            this.cameraCancelableCallback = null;
        }
        this.mapView.cancelTransitions();
        this.cameraChangeDispatcher.onCameraIdle();
    }

    @UiThread
    void resetNorth() {
        cancelTransitions();
        this.mapView.resetNorth();
    }

    void setOnCameraChangeListener(@Nullable OnCameraChangeListener onCameraChangeListener) {
        this.onCameraChangeListener = onCameraChangeListener;
    }

    double getZoom() {
        return this.cameraPosition.zoom;
    }

    double getRawZoom() {
        return this.mapView.getZoom();
    }

    void zoomBy(double d, @NonNull PointF pointF) {
        setZoom(this.mapView.getZoom() + d, pointF);
    }

    void setZoom(double d, @NonNull PointF pointF) {
        setZoom(d, pointF, 0);
    }

    void setZoom(double d, @NonNull PointF pointF, final long j) {
        if (this.mapView != null) {
            this.mapView.addOnMapChangedListener(new OnMapChangedListener() {
                public void onMapChanged(int i) {
                    if (i == 4) {
                        if (j > 0) {
                            Transform.this.cameraChangeDispatcher.onCameraIdle();
                        }
                        Transform.this.mapView.removeOnMapChangedListener(this);
                    }
                }
            });
            this.mapView.setZoom(d, pointF, j);
        }
    }

    double getBearing() {
        double d = -this.mapView.getBearing();
        while (d > 360.0d) {
            d -= 360.0d;
        }
        while (d < 0.0d) {
            d += 360.0d;
        }
        return d;
    }

    double getRawBearing() {
        return this.mapView.getBearing();
    }

    void setBearing(double d) {
        this.mapView.setBearing(d);
    }

    void setBearing(double d, float f, float f2) {
        this.mapView.setBearing(d, (double) f, (double) f2);
    }

    void setBearing(double d, float f, float f2, long j) {
        this.mapView.setBearing(d, (double) f, (double) f2, j);
    }

    LatLng getLatLng() {
        return this.mapView.getLatLng();
    }

    double getTilt() {
        return this.mapView.getPitch();
    }

    void setTilt(Double d) {
        this.markerViewManager.setTilt(d.floatValue());
        this.mapView.setPitch(d.doubleValue(), 0);
    }

    LatLng getCenterCoordinate() {
        return this.mapView.getLatLng();
    }

    void setCenterCoordinate(LatLng latLng) {
        this.mapView.setLatLng(latLng);
    }

    void setGestureInProgress(boolean z) {
        this.mapView.setGestureInProgress(z);
        if (!z) {
            invalidateCameraPosition();
        }
    }

    void moveBy(double d, double d2, long j) {
        if (j > 0) {
            this.mapView.addOnMapChangedListener(new C71025());
        }
        this.mapView.moveBy(d, d2, j);
    }

    void setMinZoom(double d) {
        if (d >= 0.0d) {
            if (d <= 25.5d) {
                this.mapView.setMinZoom(d);
                return;
            }
        }
        C0001a.e("Not setting minZoomPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d)});
    }

    double getMinZoom() {
        return this.mapView.getMinZoom();
    }

    void setMaxZoom(double d) {
        if (d >= 0.0d) {
            if (d <= 25.5d) {
                this.mapView.setMaxZoom(d);
                return;
            }
        }
        C0001a.e("Not setting maxZoomPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d)});
    }

    double getMaxZoom() {
        return this.mapView.getMaxZoom();
    }
}
