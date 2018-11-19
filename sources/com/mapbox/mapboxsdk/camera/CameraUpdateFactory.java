package com.mapbox.mapboxsdk.camera;

import android.graphics.Point;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.camera.CameraPosition.Builder;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.UiSettings;

public final class CameraUpdateFactory {

    static final class CameraBoundsUpdate implements CameraUpdate {
        private LatLngBounds bounds;
        private int[] padding;

        CameraBoundsUpdate(LatLngBounds latLngBounds, int[] iArr) {
            this.bounds = latLngBounds;
            this.padding = iArr;
        }

        CameraBoundsUpdate(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
            this(latLngBounds, new int[]{i, i2, i3, i4});
        }

        public LatLngBounds getBounds() {
            return this.bounds;
        }

        public int[] getPadding() {
            return this.padding;
        }

        public CameraPosition getCameraPosition(@NonNull MapboxMap mapboxMap) {
            return mapboxMap.getCameraForLatLngBounds(this.bounds, this.padding);
        }
    }

    static final class CameraMoveUpdate implements CameraUpdate {
        /* renamed from: x */
        private float f25695x;
        /* renamed from: y */
        private float f25696y;

        CameraMoveUpdate(float f, float f2) {
            this.f25695x = f;
            this.f25696y = f2;
        }

        public CameraPosition getCameraPosition(@NonNull MapboxMap mapboxMap) {
            UiSettings uiSettings = mapboxMap.getUiSettings();
            LatLng fromScreenLocation = mapboxMap.getProjection().fromScreenLocation(new PointF((uiSettings.getWidth() / 2.0f) + this.f25695x, (uiSettings.getHeight() / 2.0f) + this.f25696y));
            mapboxMap = mapboxMap.getCameraPosition();
            Builder builder = new Builder();
            if (fromScreenLocation == null) {
                fromScreenLocation = mapboxMap.target;
            }
            return builder.target(fromScreenLocation).zoom(mapboxMap.zoom).tilt(mapboxMap.tilt).bearing(mapboxMap.bearing).build();
        }
    }

    static final class CameraPositionUpdate implements CameraUpdate {
        private final double bearing;
        private final LatLng target;
        private final double tilt;
        private final double zoom;

        CameraPositionUpdate(double d, LatLng latLng, double d2, double d3) {
            this.bearing = d;
            this.target = latLng;
            this.tilt = d2;
            this.zoom = d3;
        }

        public LatLng getTarget() {
            return this.target;
        }

        public double getBearing() {
            return this.bearing;
        }

        public double getTilt() {
            return this.tilt;
        }

        public double getZoom() {
            return this.zoom;
        }

        public CameraPosition getCameraPosition(@NonNull MapboxMap mapboxMap) {
            mapboxMap = mapboxMap.getCameraPosition();
            if (this.target == null) {
                return new Builder(this).target(mapboxMap.target).build();
            }
            return new Builder(this).build();
        }
    }

    static final class ZoomUpdate implements CameraUpdate {
        static final int ZOOM_BY = 2;
        static final int ZOOM_IN = 0;
        static final int ZOOM_OUT = 1;
        static final int ZOOM_TO = 3;
        static final int ZOOM_TO_POINT = 4;
        private final int type;
        /* renamed from: x */
        private float f25697x;
        /* renamed from: y */
        private float f25698y;
        private final double zoom;

        ZoomUpdate(int i) {
            this.type = i;
            this.zoom = 0.0d;
        }

        ZoomUpdate(int i, double d) {
            this.type = i;
            this.zoom = d;
        }

        ZoomUpdate(double d, float f, float f2) {
            this.type = 4;
            this.zoom = d;
            this.f25697x = f;
            this.f25698y = f2;
        }

        public double getZoom() {
            return this.zoom;
        }

        public int getType() {
            return this.type;
        }

        public float getX() {
            return this.f25697x;
        }

        public float getY() {
            return this.f25698y;
        }

        double transformZoom(double d) {
            switch (getType()) {
                case 0:
                    return d + 1.0d;
                case 1:
                    d -= 1.0d;
                    return d < 0.0d ? 0.0d : d;
                case 2:
                    return d + getZoom();
                case 3:
                    return getZoom();
                case 4:
                    return d + getZoom();
                default:
                    return d;
            }
        }

        public CameraPosition getCameraPosition(@NonNull MapboxMap mapboxMap) {
            CameraPosition cameraPosition = mapboxMap.getCameraPosition();
            if (getType() != 4) {
                return new Builder(cameraPosition).zoom(transformZoom(cameraPosition.zoom)).build();
            }
            return new Builder(cameraPosition).zoom(transformZoom(cameraPosition.zoom)).target(mapboxMap.getProjection().fromScreenLocation(new PointF(getX(), getY()))).build();
        }
    }

    public static CameraUpdate newCameraPosition(@NonNull CameraPosition cameraPosition) {
        return new CameraPositionUpdate(cameraPosition.bearing, cameraPosition.target, cameraPosition.tilt, cameraPosition.zoom);
    }

    public static CameraUpdate newLatLng(@NonNull LatLng latLng) {
        return new CameraPositionUpdate(-1.0d, latLng, -1.0d, -1.0d);
    }

    public static CameraUpdate newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i) {
        return newLatLngBounds(latLngBounds, i, i, i, i);
    }

    public static CameraUpdate newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        return new CameraBoundsUpdate(latLngBounds, i, i2, i3, i4);
    }

    public static CameraUpdate newLatLngZoom(@NonNull LatLng latLng, double d) {
        return new CameraPositionUpdate(-1.0d, latLng, -1.0d, d);
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        return new CameraMoveUpdate(f, f2);
    }

    public static CameraUpdate zoomBy(double d, Point point) {
        return new ZoomUpdate(d, (float) point.x, (float) point.y);
    }

    public static CameraUpdate zoomBy(double d) {
        return new ZoomUpdate(2, d);
    }

    public static CameraUpdate zoomIn() {
        return new ZoomUpdate(0);
    }

    public static CameraUpdate zoomOut() {
        return new ZoomUpdate(1);
    }

    public static CameraUpdate zoomTo(double d) {
        return new ZoomUpdate(3, d);
    }

    public static CameraUpdate bearingTo(double d) {
        return new CameraPositionUpdate(d, null, -1.0d, -1.0d);
    }

    public static CameraUpdate tiltTo(double d) {
        return new CameraPositionUpdate(-1.0d, null, d, -1.0d);
    }
}
