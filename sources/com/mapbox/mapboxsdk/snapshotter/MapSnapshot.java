package com.mapbox.mapboxsdk.snapshotter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.mapbox.mapboxsdk.geometry.LatLng;

public class MapSnapshot {
    private String[] attributions;
    private Bitmap bitmap;
    private long nativePtr = 0;
    private boolean showLogo;

    private native void initialize();

    protected native void finalize();

    public native PointF pixelForLatLng(LatLng latLng);

    private MapSnapshot(long j, Bitmap bitmap, String[] strArr, boolean z) {
        this.nativePtr = j;
        this.bitmap = bitmap;
        this.attributions = strArr;
        this.showLogo = z;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    protected String[] getAttributions() {
        return this.attributions;
    }

    boolean isShowLogo() {
        return this.showLogo;
    }
}
