package com.mapbox.mapboxsdk.camera;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.FloatRange;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.utils.MathUtils;

public final class CameraPosition implements Parcelable {
    public static final Creator<CameraPosition> CREATOR = new C58211();
    public static final CameraPosition DEFAULT = new CameraPosition(new LatLng(), 0.0d, 0.0d, 0.0d);
    public final double bearing;
    public final LatLng target;
    public final double tilt;
    public final double zoom;

    /* renamed from: com.mapbox.mapboxsdk.camera.CameraPosition$1 */
    static class C58211 implements Creator<CameraPosition> {
        C58211() {
        }

        public CameraPosition createFromParcel(Parcel parcel) {
            double readDouble = parcel.readDouble();
            return new CameraPosition((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()), parcel.readDouble(), parcel.readDouble(), readDouble);
        }

        public CameraPosition[] newArray(int i) {
            return new CameraPosition[i];
        }
    }

    public static final class Builder {
        private double bearing = -1.0d;
        private LatLng target = null;
        private double tilt = -1.0d;
        private double zoom = -1.0d;

        public Builder(CameraPosition cameraPosition) {
            if (cameraPosition != null) {
                this.bearing = cameraPosition.bearing;
                this.target = cameraPosition.target;
                this.tilt = cameraPosition.tilt;
                this.zoom = cameraPosition.zoom;
            }
        }

        public Builder(TypedArray typedArray) {
            if (typedArray != null) {
                this.bearing = (double) typedArray.getFloat(C5812R.styleable.mapbox_MapView_mapbox_cameraBearing, 0.0f);
                this.target = new LatLng((double) typedArray.getFloat(C5812R.styleable.mapbox_MapView_mapbox_cameraTargetLat, 0.0f), (double) typedArray.getFloat(C5812R.styleable.mapbox_MapView_mapbox_cameraTargetLng, 0.0f));
                this.tilt = (double) typedArray.getFloat(C5812R.styleable.mapbox_MapView_mapbox_cameraTilt, 0.0f);
                this.zoom = (double) typedArray.getFloat(C5812R.styleable.mapbox_MapView_mapbox_cameraZoom, 0.0f);
            }
        }

        public Builder(CameraPositionUpdate cameraPositionUpdate) {
            if (cameraPositionUpdate != null) {
                this.bearing = cameraPositionUpdate.getBearing();
                this.target = cameraPositionUpdate.getTarget();
                this.tilt = cameraPositionUpdate.getTilt();
                this.zoom = cameraPositionUpdate.getZoom();
            }
        }

        public Builder(ZoomUpdate zoomUpdate) {
            if (zoomUpdate != null) {
                this.zoom = zoomUpdate.getZoom();
            }
        }

        public Builder bearing(double d) {
            while (d >= 360.0d) {
                d -= 360.0d;
            }
            while (d < 0.0d) {
                d += 360.0d;
            }
            this.bearing = d;
            return this;
        }

        public Builder target(LatLng latLng) {
            this.target = latLng;
            return this;
        }

        public Builder tilt(@FloatRange(from = 0.0d, to = 60.0d) double d) {
            this.tilt = MathUtils.clamp(d, 0.0d, 60.0d);
            return this;
        }

        public Builder zoom(@FloatRange(from = 0.0d, to = 25.5d) double d) {
            this.zoom = d;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.target, this.zoom, this.tilt, this.bearing);
        }
    }

    public int describeContents() {
        return 0;
    }

    CameraPosition(LatLng latLng, double d, double d2, double d3) {
        this.target = latLng;
        this.bearing = d3;
        this.tilt = d2;
        this.zoom = d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.bearing);
        parcel.writeParcelable(this.target, i);
        parcel.writeDouble(this.tilt);
        parcel.writeDouble(this.zoom);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Target: ");
        stringBuilder.append(this.target);
        stringBuilder.append(", Zoom:");
        stringBuilder.append(this.zoom);
        stringBuilder.append(", Bearing:");
        stringBuilder.append(this.bearing);
        stringBuilder.append(", Tilt:");
        stringBuilder.append(this.tilt);
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                CameraPosition cameraPosition = (CameraPosition) obj;
                return (this.target == null || this.target.equals(cameraPosition.target)) && this.zoom == cameraPosition.zoom && this.tilt == cameraPosition.tilt && this.bearing == cameraPosition.bearing;
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 + (this.target != null ? this.target.hashCode() : 0);
    }
}
