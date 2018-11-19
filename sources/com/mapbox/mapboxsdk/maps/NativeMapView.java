package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.LibraryLoader;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.Builder;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.ProjectedMeters;
import com.mapbox.mapboxsdk.maps.MapView.OnMapChangedListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnFpsChangedListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.SnapshotReadyCallback;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.layers.CannotAddLayerException;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.light.Light;
import com.mapbox.mapboxsdk.style.sources.CannotAddSourceException;
import com.mapbox.mapboxsdk.style.sources.Source;
import com.mapbox.mapboxsdk.utils.BitmapUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p001a.C0001a;

final class NativeMapView {
    private boolean destroyed;
    private final FileSource fileSource;
    private final MapRenderer mapRenderer;
    private long nativePtr;
    private final CopyOnWriteArrayList<OnMapChangedListener> onMapChangedListeners;
    private final float pixelRatio;
    private SnapshotReadyCallback snapshotReadyCallback;
    private ViewCallback viewCallback;

    private static class BitmapImageConversionTask extends AsyncTask<HashMap<String, Bitmap>, Void, List<Image>> {
        private NativeMapView nativeMapView;

        BitmapImageConversionTask(NativeMapView nativeMapView) {
            this.nativeMapView = nativeMapView;
        }

        protected List<Image> doInBackground(HashMap<String, Bitmap>... hashMapArr) {
            hashMapArr = hashMapArr[0];
            List<Image> arrayList = new ArrayList();
            for (Entry entry : hashMapArr.entrySet()) {
                String str = (String) entry.getKey();
                Bitmap bitmap = (Bitmap) entry.getValue();
                if (bitmap.getConfig() != Config.ARGB_8888) {
                    bitmap = bitmap.copy(Config.ARGB_8888, false);
                }
                Buffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
                bitmap.copyPixelsToBuffer(allocate);
                arrayList.add(new Image(allocate.array(), (bitmap.getDensity() == 0 ? 0.0f : (float) bitmap.getDensity()) / 160.0f, str, bitmap.getWidth(), bitmap.getHeight()));
            }
            return arrayList;
        }

        protected void onPostExecute(List<Image> list) {
            super.onPostExecute(list);
            if (this.nativeMapView != null && !this.nativeMapView.isDestroyedOn("nativeAddImages")) {
                this.nativeMapView.nativeAddImages((Image[]) list.toArray(new Image[list.size()]));
            }
        }
    }

    public interface ViewCallback {
        int getHeight();

        Bitmap getViewContent();

        int getWidth();
    }

    private native void nativeAddAnnotationIcon(String str, int i, int i2, float f, byte[] bArr);

    private native void nativeAddImage(String str, Bitmap bitmap, float f);

    private native void nativeAddImages(Image[] imageArr);

    private native void nativeAddLayer(long j, String str) throws CannotAddLayerException;

    private native void nativeAddLayerAbove(long j, String str) throws CannotAddLayerException;

    private native void nativeAddLayerAt(long j, int i) throws CannotAddLayerException;

    private native long[] nativeAddMarkers(Marker[] markerArr);

    private native long[] nativeAddPolygons(Polygon[] polygonArr);

    private native long[] nativeAddPolylines(Polyline[] polylineArr);

    private native void nativeAddSource(Source source, long j) throws CannotAddSourceException;

    private native void nativeCancelTransitions();

    private native void nativeCycleDebugOptions();

    private native void nativeDestroy();

    private native void nativeEaseTo(double d, double d2, double d3, long j, double d4, double d5, boolean z);

    private native void nativeFlyTo(double d, double d2, double d3, long j, double d4, double d5);

    private native double nativeGetBearing();

    private native CameraPosition nativeGetCameraForGeometry(Geometry geometry, double d, double d2, double d3, double d4, double d5);

    private native CameraPosition nativeGetCameraForLatLngBounds(LatLngBounds latLngBounds, double d, double d2, double d3, double d4);

    private native CameraPosition nativeGetCameraPosition();

    private native boolean nativeGetDebug();

    private native Bitmap nativeGetImage(String str);

    private native LatLng nativeGetLatLng();

    private native Layer nativeGetLayer(String str);

    private native Layer[] nativeGetLayers();

    private native Light nativeGetLight();

    private native double nativeGetMaxZoom();

    private native double nativeGetMetersPerPixelAtLatitude(double d, double d2);

    private native double nativeGetMinZoom();

    private native double nativeGetPitch();

    private native boolean nativeGetPrefetchesTiles();

    private native Source nativeGetSource(String str);

    private native Source[] nativeGetSources();

    private native String nativeGetStyleJson();

    private native String nativeGetStyleUrl();

    private native double nativeGetTopOffsetPixelsForAnnotationSymbol(String str);

    private native long nativeGetTransitionDelay();

    private native long nativeGetTransitionDuration();

    private native double nativeGetZoom();

    private native void nativeInitialize(NativeMapView nativeMapView, FileSource fileSource, MapRenderer mapRenderer, float f);

    private native boolean nativeIsFullyLoaded();

    private native void nativeJumpTo(double d, double d2, double d3, double d4, double d5);

    private native LatLng nativeLatLngForPixel(float f, float f2);

    private native LatLng nativeLatLngForProjectedMeters(double d, double d2);

    private native void nativeMoveBy(double d, double d2, long j);

    private native void nativeOnLowMemory();

    private native PointF nativePixelForLatLng(double d, double d2);

    private native ProjectedMeters nativeProjectedMetersForLatLng(double d, double d2);

    private native long[] nativeQueryPointAnnotations(RectF rectF);

    private native Feature[] nativeQueryRenderedFeaturesForBox(float f, float f2, float f3, float f4, String[] strArr, Object[] objArr);

    private native Feature[] nativeQueryRenderedFeaturesForPoint(float f, float f2, String[] strArr, Object[] objArr);

    private native long[] nativeQueryShapeAnnotations(RectF rectF);

    private native void nativeRemoveAnnotationIcon(String str);

    private native void nativeRemoveAnnotations(long[] jArr);

    private native void nativeRemoveImage(String str);

    private native void nativeRemoveLayer(long j);

    private native Layer nativeRemoveLayerAt(int i);

    private native Layer nativeRemoveLayerById(String str);

    private native void nativeRemoveSource(Source source, long j);

    private native void nativeResetNorth();

    private native void nativeResetPosition();

    private native void nativeResetZoom();

    private native void nativeResizeView(int i, int i2);

    private native void nativeRotateBy(double d, double d2, double d3, double d4, long j);

    private native void nativeSetBearing(double d, long j);

    private native void nativeSetBearingXY(double d, double d2, double d3, long j);

    private native void nativeSetContentPadding(double d, double d2, double d3, double d4);

    private native void nativeSetDebug(boolean z);

    private native void nativeSetGestureInProgress(boolean z);

    private native void nativeSetLatLng(double d, double d2, long j);

    private native void nativeSetLatLngBounds(LatLngBounds latLngBounds);

    private native void nativeSetMaxZoom(double d);

    private native void nativeSetMinZoom(double d);

    private native void nativeSetPitch(double d, long j);

    private native void nativeSetPrefetchesTiles(boolean z);

    private native void nativeSetReachability(boolean z);

    private native void nativeSetStyleJson(String str);

    private native void nativeSetStyleUrl(String str);

    private native void nativeSetTransitionDelay(long j);

    private native void nativeSetTransitionDuration(long j);

    private native void nativeSetVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d, long j);

    private native void nativeSetZoom(double d, double d2, double d3, long j);

    private native void nativeTakeSnapshot();

    private native void nativeUpdateMarker(long j, double d, double d2, String str);

    private native void nativeUpdatePolygon(long j, Polygon polygon);

    private native void nativeUpdatePolyline(long j, Polyline polyline);

    static {
        LibraryLoader.load();
    }

    public NativeMapView(Context context, ViewCallback viewCallback, MapRenderer mapRenderer) {
        this(context, context.getResources().getDisplayMetrics().density, viewCallback, mapRenderer);
    }

    public NativeMapView(Context context, float f, ViewCallback viewCallback, MapRenderer mapRenderer) {
        this.destroyed = false;
        this.nativePtr = 0;
        this.onMapChangedListeners = new CopyOnWriteArrayList();
        this.mapRenderer = mapRenderer;
        this.viewCallback = viewCallback;
        this.fileSource = FileSource.getInstance(context);
        this.pixelRatio = f;
        nativeInitialize(this, this.fileSource, mapRenderer, f);
    }

    private boolean isDestroyedOn(String str) {
        if (this.destroyed && !TextUtils.isEmpty(str)) {
            C0001a.e("You're calling `%s` after the `MapView` was destroyed, were you invoking it after `onDestroy()`?", new Object[]{str});
        }
        return this.destroyed;
    }

    public void destroy() {
        this.destroyed = true;
        this.onMapChangedListeners.clear();
        this.viewCallback = null;
        nativeDestroy();
    }

    public void update() {
        if (!isDestroyedOn("update")) {
            this.mapRenderer.requestRender();
        }
    }

    public void resizeView(int i, int i2) {
        if (!isDestroyedOn("resizeView")) {
            i = (int) (((float) i) / this.pixelRatio);
            i2 = (int) (((float) i2) / this.pixelRatio);
            if (i < 0) {
                throw new IllegalArgumentException("width cannot be negative.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("height cannot be negative.");
            } else {
                if (i > 65535) {
                    C0001a.e("Device returned an out of range width size, capping value at 65535 instead of %s", new Object[]{Integer.valueOf(i)});
                    i = 65535;
                }
                if (i2 > 65535) {
                    C0001a.e("Device returned an out of range height size, capping value at 65535 instead of %s", new Object[]{Integer.valueOf(i2)});
                    i2 = 65535;
                }
                nativeResizeView(i, i2);
            }
        }
    }

    public void setStyleUrl(String str) {
        if (!isDestroyedOn("setStyleUrl")) {
            nativeSetStyleUrl(str);
        }
    }

    public String getStyleUrl() {
        if (isDestroyedOn("getStyleUrl")) {
            return null;
        }
        return nativeGetStyleUrl();
    }

    public void setStyleJson(String str) {
        if (!isDestroyedOn("setStyleJson")) {
            nativeSetStyleJson(str);
        }
    }

    public String getStyleJson() {
        if (isDestroyedOn("getStyleJson")) {
            return null;
        }
        return nativeGetStyleJson();
    }

    public void setLatLngBounds(LatLngBounds latLngBounds) {
        if (!isDestroyedOn("setLatLngBounds")) {
            nativeSetLatLngBounds(latLngBounds);
        }
    }

    public void cancelTransitions() {
        if (!isDestroyedOn("cancelTransitions")) {
            nativeCancelTransitions();
        }
    }

    public void setGestureInProgress(boolean z) {
        if (!isDestroyedOn("setGestureInProgress")) {
            nativeSetGestureInProgress(z);
        }
    }

    public void moveBy(double d, double d2) {
        if (!isDestroyedOn("moveBy")) {
            moveBy(d, d2, 0);
        }
    }

    public void moveBy(double d, double d2, long j) {
        if (!isDestroyedOn("moveBy")) {
            nativeMoveBy(d / ((double) this.pixelRatio), d2 / ((double) this.pixelRatio), j);
        }
    }

    public void setLatLng(LatLng latLng) {
        if (!isDestroyedOn("setLatLng")) {
            setLatLng(latLng, 0);
        }
    }

    public void setLatLng(LatLng latLng, long j) {
        if (!isDestroyedOn("setLatLng")) {
            nativeSetLatLng(latLng.getLatitude(), latLng.getLongitude(), j);
        }
    }

    public LatLng getLatLng() {
        if (isDestroyedOn("")) {
            return new LatLng();
        }
        return nativeGetLatLng().wrap();
    }

    public CameraPosition getCameraForLatLngBounds(LatLngBounds latLngBounds, int[] iArr) {
        if (isDestroyedOn("getCameraForLatLngBounds")) {
            return null;
        }
        return nativeGetCameraForLatLngBounds(latLngBounds, (double) (((float) iArr[1]) / this.pixelRatio), (double) (((float) iArr[0]) / this.pixelRatio), (double) (((float) iArr[3]) / this.pixelRatio), (double) (((float) iArr[2]) / this.pixelRatio));
    }

    public CameraPosition getCameraForGeometry(Geometry geometry, double d, int[] iArr) {
        if (isDestroyedOn("getCameraForGeometry")) {
            return null;
        }
        return nativeGetCameraForGeometry(geometry, d, (double) (((float) iArr[1]) / r12.pixelRatio), (double) (((float) iArr[0]) / r12.pixelRatio), (double) (((float) iArr[3]) / r12.pixelRatio), (double) (((float) iArr[2]) / r12.pixelRatio));
    }

    public void resetPosition() {
        if (!isDestroyedOn("resetPosition")) {
            nativeResetPosition();
        }
    }

    public double getPitch() {
        if (isDestroyedOn("getPitch")) {
            return 0.0d;
        }
        return nativeGetPitch();
    }

    public void setPitch(double d, long j) {
        if (!isDestroyedOn("setPitch")) {
            nativeSetPitch(d, j);
        }
    }

    public void setZoom(double d, PointF pointF, long j) {
        if (!isDestroyedOn("setZoom")) {
            nativeSetZoom(d, (double) (pointF.x / this.pixelRatio), (double) (pointF.y / this.pixelRatio), j);
        }
    }

    public double getZoom() {
        if (isDestroyedOn("getZoom")) {
            return 0.0d;
        }
        return nativeGetZoom();
    }

    public void resetZoom() {
        if (!isDestroyedOn("resetZoom")) {
            nativeResetZoom();
        }
    }

    public void setMinZoom(double d) {
        if (!isDestroyedOn("setMinZoom")) {
            nativeSetMinZoom(d);
        }
    }

    public double getMinZoom() {
        if (isDestroyedOn("getMinZoom")) {
            return 0.0d;
        }
        return nativeGetMinZoom();
    }

    public void setMaxZoom(double d) {
        if (!isDestroyedOn("setMaxZoom")) {
            nativeSetMaxZoom(d);
        }
    }

    public double getMaxZoom() {
        if (isDestroyedOn("getMaxZoom")) {
            return 0.0d;
        }
        return nativeGetMaxZoom();
    }

    public void rotateBy(double d, double d2, double d3, double d4) {
        if (!isDestroyedOn("rotateBy")) {
            rotateBy(d, d2, d3, d4, 0);
        }
    }

    public void rotateBy(double d, double d2, double d3, double d4, long j) {
        if (!isDestroyedOn("rotateBy")) {
            nativeRotateBy(d / ((double) r11.pixelRatio), d2 / ((double) r11.pixelRatio), d3, d4, j);
        }
    }

    public void setContentPadding(int[] iArr) {
        if (!isDestroyedOn("setContentPadding")) {
            nativeSetContentPadding((double) (((float) iArr[1]) / this.pixelRatio), (double) (((float) iArr[0]) / this.pixelRatio), (double) (((float) iArr[3]) / this.pixelRatio), (double) (((float) iArr[2]) / this.pixelRatio));
        }
    }

    public void setBearing(double d) {
        if (!isDestroyedOn("setBearing")) {
            setBearing(d, 0);
        }
    }

    public void setBearing(double d, long j) {
        if (!isDestroyedOn("setBearing")) {
            nativeSetBearing(d, j);
        }
    }

    public void setBearing(double d, double d2, double d3) {
        if (!isDestroyedOn("setBearing")) {
            setBearing(d, d2, d3, 0);
        }
    }

    public void setBearing(double d, double d2, double d3, long j) {
        if (!isDestroyedOn("setBearing")) {
            nativeSetBearingXY(d, d2 / ((double) r9.pixelRatio), d3 / ((double) r9.pixelRatio), j);
        }
    }

    public double getBearing() {
        if (isDestroyedOn("getBearing")) {
            return 0.0d;
        }
        return nativeGetBearing();
    }

    public void resetNorth() {
        if (!isDestroyedOn("resetNorth")) {
            nativeResetNorth();
        }
    }

    public long addMarker(Marker marker) {
        if (isDestroyedOn("addMarker")) {
            return 0;
        }
        return nativeAddMarkers(new Marker[]{marker})[0];
    }

    public long[] addMarkers(List<Marker> list) {
        if (isDestroyedOn("addMarkers")) {
            return new long[null];
        }
        return nativeAddMarkers((Marker[]) list.toArray(new Marker[list.size()]));
    }

    public long addPolyline(Polyline polyline) {
        if (isDestroyedOn("addPolyline")) {
            return 0;
        }
        return nativeAddPolylines(new Polyline[]{polyline})[0];
    }

    public long[] addPolylines(List<Polyline> list) {
        if (isDestroyedOn("addPolylines")) {
            return new long[null];
        }
        return nativeAddPolylines((Polyline[]) list.toArray(new Polyline[list.size()]));
    }

    public long addPolygon(Polygon polygon) {
        if (isDestroyedOn("addPolygon")) {
            return 0;
        }
        return nativeAddPolygons(new Polygon[]{polygon})[0];
    }

    public long[] addPolygons(List<Polygon> list) {
        if (isDestroyedOn("addPolygons")) {
            return new long[null];
        }
        return nativeAddPolygons((Polygon[]) list.toArray(new Polygon[list.size()]));
    }

    public void updateMarker(Marker marker) {
        if (!isDestroyedOn("updateMarker")) {
            LatLng position = marker.getPosition();
            nativeUpdateMarker(marker.getId(), position.getLatitude(), position.getLongitude(), marker.getIcon().getId());
        }
    }

    public void updatePolygon(Polygon polygon) {
        if (!isDestroyedOn("updatePolygon")) {
            nativeUpdatePolygon(polygon.getId(), polygon);
        }
    }

    public void updatePolyline(Polyline polyline) {
        if (!isDestroyedOn("updatePolyline")) {
            nativeUpdatePolyline(polyline.getId(), polyline);
        }
    }

    public void removeAnnotation(long j) {
        if (!isDestroyedOn("removeAnnotation")) {
            removeAnnotations(new long[]{j});
        }
    }

    public void removeAnnotations(long[] jArr) {
        if (!isDestroyedOn("removeAnnotations")) {
            nativeRemoveAnnotations(jArr);
        }
    }

    public long[] queryPointAnnotations(RectF rectF) {
        if (isDestroyedOn("queryPointAnnotations")) {
            return new long[null];
        }
        return nativeQueryPointAnnotations(rectF);
    }

    public long[] queryShapeAnnotations(RectF rectF) {
        if (isDestroyedOn("queryShapeAnnotations")) {
            return new long[null];
        }
        return nativeQueryShapeAnnotations(rectF);
    }

    public void addAnnotationIcon(String str, int i, int i2, float f, byte[] bArr) {
        if (!isDestroyedOn("addAnnotationIcon")) {
            nativeAddAnnotationIcon(str, i, i2, f, bArr);
        }
    }

    public void removeAnnotationIcon(String str) {
        if (!isDestroyedOn("removeAnnotationIcon")) {
            nativeRemoveAnnotationIcon(str);
        }
    }

    public void setVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d, long j) {
        if (!isDestroyedOn("setVisibleCoordinateBounds")) {
            nativeSetVisibleCoordinateBounds(latLngArr, rectF, d, j);
        }
    }

    public void onLowMemory() {
        if (!isDestroyedOn("onLowMemory")) {
            nativeOnLowMemory();
        }
    }

    public void setDebug(boolean z) {
        if (!isDestroyedOn("setDebug")) {
            nativeSetDebug(z);
        }
    }

    public void cycleDebugOptions() {
        if (!isDestroyedOn("cycleDebugOptions")) {
            nativeCycleDebugOptions();
        }
    }

    public boolean getDebug() {
        if (isDestroyedOn("getDebug")) {
            return false;
        }
        return nativeGetDebug();
    }

    public boolean isFullyLoaded() {
        if (isDestroyedOn("isFullyLoaded")) {
            return false;
        }
        return nativeIsFullyLoaded();
    }

    public void setReachability(boolean z) {
        if (!isDestroyedOn("setReachability")) {
            nativeSetReachability(z);
        }
    }

    public double getMetersPerPixelAtLatitude(double d) {
        if (isDestroyedOn("getMetersPerPixelAtLatitude")) {
            return 0.0d;
        }
        return nativeGetMetersPerPixelAtLatitude(d, getZoom()) / ((double) this.pixelRatio);
    }

    public ProjectedMeters projectedMetersForLatLng(LatLng latLng) {
        if (isDestroyedOn("projectedMetersForLatLng")) {
            return null;
        }
        return nativeProjectedMetersForLatLng(latLng.getLatitude(), latLng.getLongitude());
    }

    public LatLng latLngForProjectedMeters(ProjectedMeters projectedMeters) {
        if (isDestroyedOn("latLngForProjectedMeters")) {
            return new LatLng();
        }
        return nativeLatLngForProjectedMeters(projectedMeters.getNorthing(), projectedMeters.getEasting()).wrap();
    }

    public PointF pixelForLatLng(LatLng latLng) {
        if (isDestroyedOn("pixelForLatLng")) {
            return new PointF();
        }
        latLng = nativePixelForLatLng(latLng.getLatitude(), latLng.getLongitude());
        latLng.set(latLng.x * this.pixelRatio, latLng.y * this.pixelRatio);
        return latLng;
    }

    public LatLng latLngForPixel(PointF pointF) {
        if (isDestroyedOn("latLngForPixel")) {
            return new LatLng();
        }
        return nativeLatLngForPixel(pointF.x / this.pixelRatio, pointF.y / this.pixelRatio).wrap();
    }

    public double getTopOffsetPixelsForAnnotationSymbol(String str) {
        if (isDestroyedOn("getTopOffsetPixelsForAnnotationSymbol")) {
            return 0.0d;
        }
        return nativeGetTopOffsetPixelsForAnnotationSymbol(str);
    }

    public void jumpTo(double d, LatLng latLng, double d2, double d3) {
        if (!isDestroyedOn("jumpTo")) {
            nativeJumpTo(d, latLng.getLatitude(), latLng.getLongitude(), d2, d3);
        }
    }

    public void easeTo(double d, LatLng latLng, long j, double d2, double d3, boolean z) {
        if (!isDestroyedOn("easeTo")) {
            nativeEaseTo(d, latLng.getLatitude(), latLng.getLongitude(), j, d2, d3, z);
        }
    }

    public void flyTo(double d, LatLng latLng, long j, double d2, double d3) {
        if (!isDestroyedOn("flyTo")) {
            nativeFlyTo(d, latLng.getLatitude(), latLng.getLongitude(), j, d2, d3);
        }
    }

    public CameraPosition getCameraPosition() {
        if (isDestroyedOn("getCameraValues")) {
            return new Builder().build();
        }
        return nativeGetCameraPosition();
    }

    public void setPrefetchesTiles(boolean z) {
        if (!isDestroyedOn("setPrefetchesTiles")) {
            nativeSetPrefetchesTiles(z);
        }
    }

    public boolean getPrefetchesTiles() {
        if (isDestroyedOn("getPrefetchesTiles")) {
            return false;
        }
        return nativeGetPrefetchesTiles();
    }

    public long getTransitionDuration() {
        return nativeGetTransitionDuration();
    }

    public void setTransitionDuration(long j) {
        nativeSetTransitionDuration(j);
    }

    public long getTransitionDelay() {
        return nativeGetTransitionDelay();
    }

    public void setTransitionDelay(long j) {
        nativeSetTransitionDelay(j);
    }

    public List<Layer> getLayers() {
        if (isDestroyedOn("getLayers")) {
            return null;
        }
        return Arrays.asList(nativeGetLayers());
    }

    public Layer getLayer(String str) {
        if (isDestroyedOn("getLayer")) {
            return null;
        }
        return nativeGetLayer(str);
    }

    public void addLayer(@NonNull Layer layer) {
        if (!isDestroyedOn("addLayer")) {
            nativeAddLayer(layer.getNativePtr(), null);
        }
    }

    public void addLayerBelow(@NonNull Layer layer, @NonNull String str) {
        if (!isDestroyedOn("addLayerBelow")) {
            nativeAddLayer(layer.getNativePtr(), str);
        }
    }

    public void addLayerAbove(@NonNull Layer layer, @NonNull String str) {
        if (!isDestroyedOn("addLayerAbove")) {
            nativeAddLayerAbove(layer.getNativePtr(), str);
        }
    }

    public void addLayerAt(@NonNull Layer layer, @IntRange(from = 0) int i) {
        if (!isDestroyedOn("addLayerAt")) {
            nativeAddLayerAt(layer.getNativePtr(), i);
        }
    }

    @Nullable
    public Layer removeLayer(@NonNull String str) {
        if (isDestroyedOn("removeLayer")) {
            return null;
        }
        return nativeRemoveLayerById(str);
    }

    @Nullable
    public Layer removeLayer(@NonNull Layer layer) {
        if (isDestroyedOn("removeLayer")) {
            return null;
        }
        nativeRemoveLayer(layer.getNativePtr());
        return layer;
    }

    @Nullable
    public Layer removeLayerAt(@IntRange(from = 0) int i) {
        if (isDestroyedOn("removeLayerAt")) {
            return 0;
        }
        return nativeRemoveLayerAt(i);
    }

    public List<Source> getSources() {
        if (isDestroyedOn("getSources")) {
            return null;
        }
        return Arrays.asList(nativeGetSources());
    }

    public Source getSource(@NonNull String str) {
        if (isDestroyedOn("getSource")) {
            return null;
        }
        return nativeGetSource(str);
    }

    public void addSource(@NonNull Source source) {
        if (!isDestroyedOn("addSource")) {
            nativeAddSource(source, source.getNativePtr());
        }
    }

    @Nullable
    public Source removeSource(@NonNull String str) {
        if (isDestroyedOn("removeSource")) {
            return null;
        }
        Source source = getSource(str);
        if (source != null) {
            return removeSource(source);
        }
        return null;
    }

    @Nullable
    public Source removeSource(@NonNull Source source) {
        if (isDestroyedOn("removeSource")) {
            return null;
        }
        nativeRemoveSource(source, source.getNativePtr());
        return source;
    }

    public void addImage(@NonNull String str, @NonNull Bitmap bitmap) {
        if (!isDestroyedOn("addImage")) {
            nativeAddImage(str, bitmap, (float) (bitmap.getDensity() / 160));
        }
    }

    public void addImages(@NonNull HashMap<String, Bitmap> hashMap) {
        if (!isDestroyedOn("addImages")) {
            new BitmapImageConversionTask(this).execute(new HashMap[]{hashMap});
        }
    }

    public void removeImage(String str) {
        if (!isDestroyedOn("removeImage")) {
            nativeRemoveImage(str);
        }
    }

    public Bitmap getImage(String str) {
        if (isDestroyedOn("getImage")) {
            return null;
        }
        return nativeGetImage(str);
    }

    @NonNull
    public List<Feature> queryRenderedFeatures(@NonNull PointF pointF, @Nullable String[] strArr, @Nullable Expression expression) {
        if (isDestroyedOn("queryRenderedFeatures")) {
            return new ArrayList();
        }
        pointF = nativeQueryRenderedFeaturesForPoint(pointF.x / this.pixelRatio, pointF.y / this.pixelRatio, strArr, expression != null ? expression.toArray() : null);
        return pointF != null ? Arrays.asList(pointF) : new ArrayList();
    }

    @NonNull
    public List<Feature> queryRenderedFeatures(@NonNull RectF rectF, @Nullable String[] strArr, @Nullable Expression expression) {
        if (isDestroyedOn("queryRenderedFeatures")) {
            return new ArrayList();
        }
        float f = rectF.left / this.pixelRatio;
        float f2 = rectF.top / this.pixelRatio;
        float f3 = rectF.right / this.pixelRatio;
        float f4 = rectF.bottom / this.pixelRatio;
        if (expression != null) {
            rectF = expression.toArray();
        } else {
            rectF = null;
        }
        rectF = nativeQueryRenderedFeaturesForBox(f, f2, f3, f4, strArr, rectF);
        return rectF != null ? Arrays.asList(rectF) : new ArrayList();
    }

    public void setApiBaseUrl(String str) {
        if (!isDestroyedOn("setApiBaseUrl")) {
            this.fileSource.setApiBaseUrl(str);
        }
    }

    public Light getLight() {
        if (isDestroyedOn("getLight")) {
            return null;
        }
        return nativeGetLight();
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    RectF getDensityDependantRectangle(RectF rectF) {
        return new RectF(rectF.left / this.pixelRatio, rectF.top / this.pixelRatio, rectF.right / this.pixelRatio, rectF.bottom / this.pixelRatio);
    }

    protected void onMapChanged(int i) {
        Iterator it = this.onMapChangedListeners.iterator();
        while (it.hasNext()) {
            try {
                ((OnMapChangedListener) it.next()).onMapChanged(i);
            } catch (Throwable e) {
                C0001a.c(e, "Exception in MapView.OnMapChangedListener", new Object[0]);
            }
        }
    }

    protected void onSnapshotReady(Bitmap bitmap) {
        if (!isDestroyedOn("OnSnapshotReady")) {
            Bitmap viewContent = this.viewCallback.getViewContent();
            if (!(this.snapshotReadyCallback == null || bitmap == null || viewContent == null)) {
                this.snapshotReadyCallback.onSnapshotReady(BitmapUtils.mergeBitmap(bitmap, viewContent));
            }
        }
    }

    int getWidth() {
        if (isDestroyedOn("")) {
            return 0;
        }
        return this.viewCallback.getWidth();
    }

    int getHeight() {
        if (isDestroyedOn("")) {
            return 0;
        }
        return this.viewCallback.getHeight();
    }

    void addOnMapChangedListener(@NonNull OnMapChangedListener onMapChangedListener) {
        this.onMapChangedListeners.add(onMapChangedListener);
    }

    void removeOnMapChangedListener(@NonNull OnMapChangedListener onMapChangedListener) {
        if (this.onMapChangedListeners.contains(onMapChangedListener)) {
            this.onMapChangedListeners.remove(onMapChangedListener);
        }
    }

    void addSnapshotCallback(@NonNull SnapshotReadyCallback snapshotReadyCallback) {
        if (!isDestroyedOn("addSnapshotCallback")) {
            this.snapshotReadyCallback = snapshotReadyCallback;
            nativeTakeSnapshot();
        }
    }

    public void setOnFpsChangedListener(final OnFpsChangedListener onFpsChangedListener) {
        final Handler handler = new Handler();
        this.mapRenderer.queueEvent(new Runnable() {

            /* renamed from: com.mapbox.mapboxsdk.maps.NativeMapView$1$1 */
            class C71001 implements OnFpsChangedListener {
                C71001() {
                }

                public void onFpsChanged(final double d) {
                    handler.post(new Runnable() {
                        public void run() {
                            onFpsChangedListener.onFpsChanged(d);
                        }
                    });
                }
            }

            public void run() {
                NativeMapView.this.mapRenderer.setOnFpsChangedListener(new C71001());
            }
        });
    }
}
