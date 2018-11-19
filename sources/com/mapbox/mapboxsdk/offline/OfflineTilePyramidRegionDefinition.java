package com.mapbox.mapboxsdk.offline;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.LatLngBounds.Builder;

public class OfflineTilePyramidRegionDefinition implements Parcelable, OfflineRegionDefinition {
    public static final Creator CREATOR = new C58631();
    private LatLngBounds bounds;
    private double maxZoom;
    private double minZoom;
    private float pixelRatio;
    private String styleURL;

    /* renamed from: com.mapbox.mapboxsdk.offline.OfflineTilePyramidRegionDefinition$1 */
    static class C58631 implements Creator {
        C58631() {
        }

        public OfflineTilePyramidRegionDefinition createFromParcel(Parcel parcel) {
            return new OfflineTilePyramidRegionDefinition(parcel);
        }

        public OfflineTilePyramidRegionDefinition[] newArray(int i) {
            return new OfflineTilePyramidRegionDefinition[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public OfflineTilePyramidRegionDefinition(String str, LatLngBounds latLngBounds, double d, double d2, float f) {
        this.styleURL = str;
        this.bounds = latLngBounds;
        this.minZoom = d;
        this.maxZoom = d2;
        this.pixelRatio = f;
    }

    public OfflineTilePyramidRegionDefinition(Parcel parcel) {
        this.styleURL = parcel.readString();
        this.bounds = new Builder().include(new LatLng(parcel.readDouble(), parcel.readDouble())).include(new LatLng(parcel.readDouble(), parcel.readDouble())).build();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.pixelRatio = parcel.readFloat();
    }

    public String getStyleURL() {
        return this.styleURL;
    }

    public LatLngBounds getBounds() {
        return this.bounds;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.styleURL);
        parcel.writeDouble(this.bounds.getLatNorth());
        parcel.writeDouble(this.bounds.getLonEast());
        parcel.writeDouble(this.bounds.getLatSouth());
        parcel.writeDouble(this.bounds.getLonWest());
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeFloat(this.pixelRatio);
    }
}
