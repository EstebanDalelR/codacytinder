package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.support.annotation.FloatRange;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.ProjectedMeters;
import com.mapbox.mapboxsdk.geometry.VisibleRegion;
import java.util.ArrayList;
import java.util.List;

public class Projection {
    private int[] contentPadding = new int[]{0, 0, 0, 0};
    private final NativeMapView nativeMapView;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Projection(@android.support.annotation.NonNull com.mapbox.mapboxsdk.maps.NativeMapView r1) {
        /*
        r0 = this;
        r0.<init>();
        r0.nativeMapView = r1;
        r1 = 4;
        r1 = new int[r1];
        r1 = {0, 0, 0, 0};
        r0.contentPadding = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.Projection.<init>(com.mapbox.mapboxsdk.maps.NativeMapView):void");
    }

    void setContentPadding(int[] iArr) {
        this.contentPadding = iArr;
        this.nativeMapView.setContentPadding(iArr);
    }

    int[] getContentPadding() {
        return this.contentPadding;
    }

    public void invalidateContentPadding() {
        setContentPadding(this.contentPadding);
    }

    public ProjectedMeters getProjectedMetersForLatLng(LatLng latLng) {
        return this.nativeMapView.projectedMetersForLatLng(latLng);
    }

    public LatLng getLatLngForProjectedMeters(ProjectedMeters projectedMeters) {
        return this.nativeMapView.latLngForProjectedMeters(projectedMeters);
    }

    public double getMetersPerPixelAtLatitude(@FloatRange(from = -90.0d, to = 90.0d) double d) {
        return this.nativeMapView.getMetersPerPixelAtLatitude(d);
    }

    public LatLng fromScreenLocation(PointF pointF) {
        return this.nativeMapView.latLngForPixel(pointF);
    }

    public VisibleRegion getVisibleRegion() {
        float width = (float) this.nativeMapView.getWidth();
        float height = (float) this.nativeMapView.getHeight();
        LatLng fromScreenLocation = fromScreenLocation(new PointF(0.0f, 0.0f));
        LatLng fromScreenLocation2 = fromScreenLocation(new PointF(width, 0.0f));
        LatLng fromScreenLocation3 = fromScreenLocation(new PointF(width, height));
        LatLng fromScreenLocation4 = fromScreenLocation(new PointF(0.0f, height));
        List arrayList = new ArrayList();
        arrayList.add(fromScreenLocation);
        arrayList.add(fromScreenLocation2);
        arrayList.add(fromScreenLocation3);
        arrayList.add(fromScreenLocation4);
        while (true) {
            if (((LatLng) arrayList.get(0)).getLatitude() >= ((LatLng) arrayList.get(3)).getLatitude()) {
                if (((LatLng) arrayList.get(1)).getLatitude() >= ((LatLng) arrayList.get(2)).getLatitude()) {
                    break;
                }
            }
            arrayList.add((LatLng) arrayList.remove(0));
        }
        double latitude = ((LatLng) arrayList.get(0)).getLatitude();
        if (latitude < ((LatLng) arrayList.get(1)).getLatitude()) {
            latitude = ((LatLng) arrayList.get(1)).getLatitude();
        }
        double d = latitude;
        latitude = ((LatLng) arrayList.get(2)).getLatitude();
        if (latitude > ((LatLng) arrayList.get(3)).getLatitude()) {
            latitude = ((LatLng) arrayList.get(3)).getLatitude();
        }
        double d2 = latitude;
        latitude = ((LatLng) arrayList.get(0)).getLongitude();
        double longitude = ((LatLng) arrayList.get(1)).getLongitude();
        double longitude2 = ((LatLng) arrayList.get(2)).getLongitude();
        double longitude3 = ((LatLng) arrayList.get(3)).getLongitude();
        if (longitude <= longitude3 || latitude >= longitude2) {
            if (longitude < longitude2) {
                longitude2 = longitude;
            }
            return new VisibleRegion(fromScreenLocation, fromScreenLocation2, fromScreenLocation4, fromScreenLocation3, LatLngBounds.from(d, longitude2, d2, latitude > longitude3 ? latitude : longitude3));
        }
        if (longitude > longitude2) {
            longitude2 = longitude;
        }
        return new VisibleRegion(fromScreenLocation, fromScreenLocation2, fromScreenLocation4, fromScreenLocation3, LatLngBounds.from(d, longitude2, d2, latitude < longitude3 ? latitude : longitude3));
    }

    public PointF toScreenLocation(LatLng latLng) {
        return this.nativeMapView.pixelForLatLng(latLng);
    }

    float getHeight() {
        return (float) this.nativeMapView.getHeight();
    }

    float getWidth() {
        return (float) this.nativeMapView.getWidth();
    }

    public double calculateZoom(float f) {
        return this.nativeMapView.getZoom() + (Math.log((double) f) / Math.log(2.0d));
    }
}
