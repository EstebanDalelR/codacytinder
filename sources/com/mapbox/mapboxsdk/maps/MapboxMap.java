package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.util.Pools.C2878a;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.android.gestures.RotateGestureDetector;
import com.mapbox.android.gestures.ShoveGestureDetector;
import com.mapbox.android.gestures.StandardScaleGestureDetector;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.BaseMarkerViewOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager.OnMarkerViewAddedListener;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.PolygonOptions;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.Builder;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.maps.MapView.OnMapChangedListener;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.light.Light;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import p000a.p001a.C0001a;

@UiThread
public final class MapboxMap {
    private final AnnotationManager annotationManager;
    private final CameraChangeDispatcher cameraChangeDispatcher;
    private final NativeMapView nativeMapView;
    private OnFpsChangedListener onFpsChangedListener;
    private final OnGesturesManagerInteractionListener onGesturesManagerInteractionListener;
    private final Projection projection;
    private final Transform transform;
    private final UiSettings uiSettings;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        @Nullable
        View getInfoWindow(@NonNull Marker marker);
    }

    @Deprecated
    public static abstract class MarkerViewAdapter<U extends MarkerView> {
        private Context context;
        private final Class<U> persistentClass = ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        private final C2878a<View> viewReusePool = new C2878a(10000);

        @Nullable
        public abstract View getView(@NonNull U u, @Nullable View view, @NonNull ViewGroup viewGroup);

        public void onDeselect(@NonNull U u, @NonNull View view) {
        }

        public boolean onSelect(@NonNull U u, @NonNull View view, boolean z) {
            return true;
        }

        public boolean prepareViewForReuse(@NonNull MarkerView markerView, @NonNull View view) {
            return true;
        }

        public MarkerViewAdapter(Context context) {
            this.context = context;
        }

        public final Class<U> getMarkerClass() {
            return this.persistentClass;
        }

        public final C2878a<View> getViewReusePool() {
            return this.viewReusePool;
        }

        public final Context getContext() {
            return this.context;
        }

        public final void releaseView(View view) {
            view.setVisibility(8);
            this.viewReusePool.release(view);
        }
    }

    @Deprecated
    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 3;
        public static final int REASON_API_GESTURE = 1;
        public static final int REASON_DEVELOPER_ANIMATION = 2;

        void onCameraMoveStarted(int i);
    }

    public interface OnCompassAnimationListener {
        void onCompassAnimation();

        void onCompassAnimationFinished();
    }

    public interface OnFlingListener {
        void onFling();
    }

    public interface OnFpsChangedListener {
        void onFpsChanged(double d);
    }

    interface OnGesturesManagerInteractionListener {
        void cancelAllVelocityAnimations();

        AndroidGesturesManager getGesturesManager();

        void onAddFlingListener(OnFlingListener onFlingListener);

        void onAddMapClickListener(OnMapClickListener onMapClickListener);

        void onAddMapLongClickListener(OnMapLongClickListener onMapLongClickListener);

        void onAddMoveListener(OnMoveListener onMoveListener);

        void onAddRotateListener(OnRotateListener onRotateListener);

        void onAddScaleListener(OnScaleListener onScaleListener);

        void onAddScrollListener(OnScrollListener onScrollListener);

        void onAddShoveListener(OnShoveListener onShoveListener);

        void onRemoveFlingListener(OnFlingListener onFlingListener);

        void onRemoveMapClickListener(OnMapClickListener onMapClickListener);

        void onRemoveMapLongClickListener(OnMapLongClickListener onMapLongClickListener);

        void onRemoveMoveListener(OnMoveListener onMoveListener);

        void onRemoveRotateListener(OnRotateListener onRotateListener);

        void onRemoveScaleListener(OnScaleListener onScaleListener);

        void onRemoveScrollListener(OnScrollListener onScrollListener);

        void onRemoveShoveListener(OnShoveListener onShoveListener);

        void onSetFlingListener(OnFlingListener onFlingListener);

        void onSetMapClickListener(OnMapClickListener onMapClickListener);

        void onSetMapLongClickListener(OnMapLongClickListener onMapLongClickListener);

        void onSetScrollListener(OnScrollListener onScrollListener);

        void setGesturesManager(AndroidGesturesManager androidGesturesManager, boolean z, boolean z2);
    }

    public interface OnInfoWindowClickListener {
        boolean onInfoWindowClick(@NonNull Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(@NonNull LatLng latLng);
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(@NonNull LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(@NonNull Marker marker);
    }

    public interface OnMarkerViewClickListener {
        boolean onMarkerClick(@NonNull Marker marker, @NonNull View view, @NonNull MarkerViewAdapter markerViewAdapter);
    }

    public interface OnMoveListener {
        void onMove(MoveGestureDetector moveGestureDetector);

        void onMoveBegin(MoveGestureDetector moveGestureDetector);

        void onMoveEnd(MoveGestureDetector moveGestureDetector);
    }

    public interface OnPolygonClickListener {
        void onPolygonClick(@NonNull Polygon polygon);
    }

    public interface OnPolylineClickListener {
        void onPolylineClick(@NonNull Polyline polyline);
    }

    public interface OnRotateListener {
        void onRotate(RotateGestureDetector rotateGestureDetector);

        void onRotateBegin(RotateGestureDetector rotateGestureDetector);

        void onRotateEnd(RotateGestureDetector rotateGestureDetector);
    }

    public interface OnScaleListener {
        void onScale(StandardScaleGestureDetector standardScaleGestureDetector);

        void onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector);

        void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector);
    }

    @Deprecated
    public interface OnScrollListener {
        void onScroll();
    }

    public interface OnShoveListener {
        void onShove(ShoveGestureDetector shoveGestureDetector);

        void onShoveBegin(ShoveGestureDetector shoveGestureDetector);

        void onShoveEnd(ShoveGestureDetector shoveGestureDetector);
    }

    public interface OnStyleLoadedListener {
        void onStyleLoaded(String str);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    void onStop() {
    }

    MapboxMap(NativeMapView nativeMapView, Transform transform, UiSettings uiSettings, Projection projection, OnGesturesManagerInteractionListener onGesturesManagerInteractionListener, AnnotationManager annotationManager, CameraChangeDispatcher cameraChangeDispatcher) {
        this.nativeMapView = nativeMapView;
        this.uiSettings = uiSettings;
        this.projection = projection;
        this.annotationManager = annotationManager.bind(this);
        this.transform = transform;
        this.onGesturesManagerInteractionListener = onGesturesManagerInteractionListener;
        this.cameraChangeDispatcher = cameraChangeDispatcher;
    }

    void initialise(@NonNull Context context, @NonNull MapboxMapOptions mapboxMapOptions) {
        this.transform.initialise(this, mapboxMapOptions);
        this.uiSettings.initialise(context, mapboxMapOptions);
        setDebugActive(mapboxMapOptions.getDebugActive());
        setApiBaseUrl(mapboxMapOptions);
        setStyleUrl(mapboxMapOptions);
        setPrefetchesTiles(mapboxMapOptions);
    }

    void onStart() {
        this.nativeMapView.update();
        if (TextUtils.isEmpty(this.nativeMapView.getStyleUrl()) && TextUtils.isEmpty(this.nativeMapView.getStyleJson())) {
            this.nativeMapView.setStyleUrl(Style.MAPBOX_STREETS);
        }
    }

    void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable(MapboxConstants.STATE_CAMERA_POSITION, this.transform.getCameraPosition());
        bundle.putBoolean(MapboxConstants.STATE_DEBUG_ACTIVE, this.nativeMapView.getDebug());
        bundle.putString(MapboxConstants.STATE_STYLE_URL, this.nativeMapView.getStyleUrl());
        this.uiSettings.onSaveInstanceState(bundle);
    }

    void onRestoreInstanceState(Bundle bundle) {
        CameraPosition cameraPosition = (CameraPosition) bundle.getParcelable(MapboxConstants.STATE_CAMERA_POSITION);
        this.uiSettings.onRestoreInstanceState(bundle);
        if (cameraPosition != null) {
            moveCamera(CameraUpdateFactory.newCameraPosition(new Builder(cameraPosition).build()));
        }
        this.nativeMapView.setDebug(bundle.getBoolean(MapboxConstants.STATE_DEBUG_ACTIVE));
        if (!TextUtils.isEmpty(bundle.getString(MapboxConstants.STATE_STYLE_URL))) {
            this.nativeMapView.setStyleUrl(bundle.getString(MapboxConstants.STATE_STYLE_URL));
        }
    }

    void onPreMapReady() {
        invalidateCameraPosition();
        this.annotationManager.reloadMarkers();
        this.annotationManager.adjustTopOffsetPixels(this);
    }

    void onPostMapReady() {
        invalidateCameraPosition();
    }

    void onUpdateRegionChange() {
        this.annotationManager.update();
    }

    void onUpdateFullyRendered() {
        CameraPosition invalidateCameraPosition = this.transform.invalidateCameraPosition();
        if (invalidateCameraPosition != null) {
            this.uiSettings.update(invalidateCameraPosition);
        }
    }

    public long getTransitionDuration() {
        return this.nativeMapView.getTransitionDuration();
    }

    public void setTransitionDuration(long j) {
        this.nativeMapView.setTransitionDuration(j);
    }

    public long getTransitionDelay() {
        return this.nativeMapView.getTransitionDelay();
    }

    public void setTransitionDelay(long j) {
        this.nativeMapView.setTransitionDelay(j);
    }

    private void setPrefetchesTiles(@NonNull MapboxMapOptions mapboxMapOptions) {
        setPrefetchesTiles(mapboxMapOptions.getPrefetchesTiles());
    }

    public void setPrefetchesTiles(boolean z) {
        this.nativeMapView.setPrefetchesTiles(z);
    }

    public boolean getPrefetchesTiles() {
        return this.nativeMapView.getPrefetchesTiles();
    }

    public List<Layer> getLayers() {
        return this.nativeMapView.getLayers();
    }

    @Nullable
    public Layer getLayer(@NonNull String str) {
        return this.nativeMapView.getLayer(str);
    }

    @Nullable
    public <T extends Layer> T getLayerAs(@NonNull String str) {
        try {
            return this.nativeMapView.getLayer(str);
        } catch (Throwable e) {
            C0001a.c(e, "Layer: %s is a different type: ", new Object[]{str});
            return null;
        }
    }

    public void addLayer(@NonNull Layer layer) {
        this.nativeMapView.addLayer(layer);
    }

    public void addLayerBelow(@NonNull Layer layer, @NonNull String str) {
        this.nativeMapView.addLayerBelow(layer, str);
    }

    public void addLayerAbove(@NonNull Layer layer, @NonNull String str) {
        this.nativeMapView.addLayerAbove(layer, str);
    }

    public void addLayerAt(@NonNull Layer layer, @IntRange(from = 0) int i) {
        this.nativeMapView.addLayerAt(layer, i);
    }

    @Nullable
    public Layer removeLayer(@NonNull String str) {
        return this.nativeMapView.removeLayer(str);
    }

    @Nullable
    public Layer removeLayer(@NonNull Layer layer) {
        return this.nativeMapView.removeLayer(layer);
    }

    @Nullable
    public Layer removeLayerAt(@IntRange(from = 0) int i) {
        return this.nativeMapView.removeLayerAt(i);
    }

    public List<Source> getSources() {
        return this.nativeMapView.getSources();
    }

    @Nullable
    public Source getSource(@NonNull String str) {
        return this.nativeMapView.getSource(str);
    }

    @Nullable
    public <T extends Source> T getSourceAs(@NonNull String str) {
        try {
            return this.nativeMapView.getSource(str);
        } catch (Throwable e) {
            C0001a.c(e, "Source: %s is a different type: ", new Object[]{str});
            return null;
        }
    }

    public void addSource(@NonNull Source source) {
        this.nativeMapView.addSource(source);
    }

    @Nullable
    public Source removeSource(@NonNull String str) {
        return this.nativeMapView.removeSource(str);
    }

    @Nullable
    public Source removeSource(@NonNull Source source) {
        return this.nativeMapView.removeSource(source);
    }

    public void addImage(@NonNull String str, @NonNull Bitmap bitmap) {
        this.nativeMapView.addImage(str, bitmap);
    }

    public void addImages(@NonNull HashMap<String, Bitmap> hashMap) {
        this.nativeMapView.addImages(hashMap);
    }

    public void removeImage(String str) {
        this.nativeMapView.removeImage(str);
    }

    public Bitmap getImage(@NonNull String str) {
        return this.nativeMapView.getImage(str);
    }

    public void setMinZoomPreference(@FloatRange(from = 0.0d, to = 25.5d) double d) {
        this.transform.setMinZoom(d);
    }

    public double getMinZoomLevel() {
        return this.transform.getMinZoom();
    }

    public void setMaxZoomPreference(@FloatRange(from = 0.0d, to = 25.5d) double d) {
        this.transform.setMaxZoom(d);
    }

    public double getMaxZoomLevel() {
        return this.transform.getMaxZoom();
    }

    public UiSettings getUiSettings() {
        return this.uiSettings;
    }

    public Projection getProjection() {
        return this.projection;
    }

    @Nullable
    public Light getLight() {
        return this.nativeMapView.getLight();
    }

    public void cancelTransitions() {
        this.transform.cancelTransitions();
    }

    public final CameraPosition getCameraPosition() {
        return this.transform.getCameraPosition();
    }

    public void setCameraPosition(@NonNull CameraPosition cameraPosition) {
        moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), null);
    }

    public final void moveCamera(CameraUpdate cameraUpdate) {
        moveCamera(cameraUpdate, null);
    }

    public final void moveCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        this.transform.moveCamera(this, cameraUpdate, cancelableCallback);
    }

    public final void easeCamera(CameraUpdate cameraUpdate) {
        easeCamera(cameraUpdate, MapboxConstants.ANIMATION_DURATION);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i) {
        easeCamera(cameraUpdate, i, null);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        easeCamera(cameraUpdate, i, true, cancelableCallback);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i, boolean z) {
        easeCamera(cameraUpdate, i, z, null);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i, boolean z, CancelableCallback cancelableCallback) {
        easeCamera(cameraUpdate, i, z, cancelableCallback, false);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i, boolean z, CancelableCallback cancelableCallback, boolean z2) {
        if (i <= 0) {
            throw new IllegalArgumentException("Null duration passed into easeCamera");
        }
        this.transform.easeCamera(this, cameraUpdate, i, z, cancelableCallback, z2);
    }

    public final void animateCamera(CameraUpdate cameraUpdate) {
        animateCamera(cameraUpdate, MapboxConstants.ANIMATION_DURATION, null);
    }

    public final void animateCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        animateCamera(cameraUpdate, MapboxConstants.ANIMATION_DURATION, cancelableCallback);
    }

    public final void animateCamera(CameraUpdate cameraUpdate, int i) {
        animateCamera(cameraUpdate, i, null);
    }

    public final void animateCamera(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        if (i <= 0) {
            throw new IllegalArgumentException("Null duration passed into animageCamera");
        }
        this.transform.animateCamera(this, cameraUpdate, i, cancelableCallback);
    }

    private void invalidateCameraPosition() {
        CameraPosition invalidateCameraPosition = this.transform.invalidateCameraPosition();
        if (invalidateCameraPosition != null) {
            this.transform.updateCameraPosition(invalidateCameraPosition);
        }
    }

    public void resetNorth() {
        this.transform.resetNorth();
    }

    public void setFocalBearing(double d, float f, float f2, long j) {
        this.transform.setBearing(d, f, f2, j);
    }

    public float getHeight() {
        return (float) this.nativeMapView.getHeight();
    }

    public float getWidth() {
        return (float) this.nativeMapView.getWidth();
    }

    public boolean isDebugActive() {
        return this.nativeMapView.getDebug();
    }

    public void setDebugActive(boolean z) {
        this.nativeMapView.setDebug(z);
    }

    public void cycleDebugOptions() {
        this.nativeMapView.cycleDebugOptions();
    }

    private void setApiBaseUrl(@NonNull MapboxMapOptions mapboxMapOptions) {
        mapboxMapOptions = mapboxMapOptions.getApiBaseUrl();
        if (!TextUtils.isEmpty(mapboxMapOptions)) {
            this.nativeMapView.setApiBaseUrl(mapboxMapOptions);
        }
    }

    public void setStyleUrl(@NonNull String str) {
        setStyleUrl(str, null);
    }

    public void setStyleUrl(@NonNull final String str, @Nullable final OnStyleLoadedListener onStyleLoadedListener) {
        if (onStyleLoadedListener != null) {
            this.nativeMapView.addOnMapChangedListener(new OnMapChangedListener() {
                public void onMapChanged(int i) {
                    if (i == 14) {
                        onStyleLoadedListener.onStyleLoaded(str);
                        MapboxMap.this.nativeMapView.removeOnMapChangedListener(this);
                    }
                }
            });
        }
        this.nativeMapView.setStyleUrl(str);
    }

    public void setStyle(String str) {
        setStyleUrl(str);
    }

    public void setStyle(String str, @Nullable OnStyleLoadedListener onStyleLoadedListener) {
        setStyleUrl(str, onStyleLoadedListener);
    }

    private void setStyleUrl(@NonNull MapboxMapOptions mapboxMapOptions) {
        mapboxMapOptions = mapboxMapOptions.getStyle();
        if (!TextUtils.isEmpty(mapboxMapOptions)) {
            setStyleUrl(mapboxMapOptions, null);
        }
    }

    @Nullable
    public String getStyleUrl() {
        return this.nativeMapView.getStyleUrl();
    }

    public void setStyleJson(@NonNull String str) {
        this.nativeMapView.setStyleJson(str);
    }

    public String getStyleJson() {
        return this.nativeMapView.getStyleJson();
    }

    @NonNull
    public Marker addMarker(@NonNull MarkerOptions markerOptions) {
        return this.annotationManager.addMarker(markerOptions, this);
    }

    @NonNull
    public Marker addMarker(@NonNull BaseMarkerOptions baseMarkerOptions) {
        return this.annotationManager.addMarker(baseMarkerOptions, this);
    }

    @Deprecated
    @NonNull
    public MarkerView addMarker(@NonNull BaseMarkerViewOptions baseMarkerViewOptions) {
        return this.annotationManager.addMarker(baseMarkerViewOptions, this, null);
    }

    @Deprecated
    @NonNull
    public MarkerView addMarker(@NonNull BaseMarkerViewOptions baseMarkerViewOptions, OnMarkerViewAddedListener onMarkerViewAddedListener) {
        return this.annotationManager.addMarker(baseMarkerViewOptions, this, onMarkerViewAddedListener);
    }

    @Deprecated
    @NonNull
    public List<MarkerView> addMarkerViews(@NonNull List<? extends BaseMarkerViewOptions> list) {
        return this.annotationManager.addMarkerViews(list, this);
    }

    @Deprecated
    @NonNull
    public List<MarkerView> getMarkerViewsInRect(@NonNull RectF rectF) {
        return this.annotationManager.getMarkerViewsInRect(rectF);
    }

    @NonNull
    public List<Marker> addMarkers(@NonNull List<? extends BaseMarkerOptions> list) {
        return this.annotationManager.addMarkers(list, this);
    }

    public void updateMarker(@NonNull Marker marker) {
        this.annotationManager.updateMarker(marker, this);
    }

    @NonNull
    public Polyline addPolyline(@NonNull PolylineOptions polylineOptions) {
        return this.annotationManager.addPolyline(polylineOptions, this);
    }

    @NonNull
    public List<Polyline> addPolylines(@NonNull List<PolylineOptions> list) {
        return this.annotationManager.addPolylines(list, this);
    }

    public void updatePolyline(Polyline polyline) {
        this.annotationManager.updatePolyline(polyline);
    }

    @NonNull
    public Polygon addPolygon(@NonNull PolygonOptions polygonOptions) {
        return this.annotationManager.addPolygon(polygonOptions, this);
    }

    @NonNull
    public List<Polygon> addPolygons(@NonNull List<PolygonOptions> list) {
        return this.annotationManager.addPolygons(list, this);
    }

    public void updatePolygon(Polygon polygon) {
        this.annotationManager.updatePolygon(polygon);
    }

    public void removeMarker(@NonNull Marker marker) {
        this.annotationManager.removeAnnotation((Annotation) marker);
    }

    public void removePolyline(@NonNull Polyline polyline) {
        this.annotationManager.removeAnnotation((Annotation) polyline);
    }

    public void removePolygon(@NonNull Polygon polygon) {
        this.annotationManager.removeAnnotation((Annotation) polygon);
    }

    public void removeAnnotation(@NonNull Annotation annotation) {
        this.annotationManager.removeAnnotation(annotation);
    }

    public void removeAnnotation(long j) {
        this.annotationManager.removeAnnotation(j);
    }

    public void removeAnnotations(@NonNull List<? extends Annotation> list) {
        this.annotationManager.removeAnnotations(list);
    }

    public void removeAnnotations() {
        this.annotationManager.removeAnnotations();
    }

    public void clear() {
        this.annotationManager.removeAnnotations();
    }

    @Nullable
    public Annotation getAnnotation(long j) {
        return this.annotationManager.getAnnotation(j);
    }

    @NonNull
    public List<Annotation> getAnnotations() {
        return this.annotationManager.getAnnotations();
    }

    @NonNull
    public List<Marker> getMarkers() {
        return this.annotationManager.getMarkers();
    }

    @NonNull
    public List<Polygon> getPolygons() {
        return this.annotationManager.getPolygons();
    }

    @NonNull
    public List<Polyline> getPolylines() {
        return this.annotationManager.getPolylines();
    }

    public void setOnMarkerClickListener(@Nullable OnMarkerClickListener onMarkerClickListener) {
        this.annotationManager.setOnMarkerClickListener(onMarkerClickListener);
    }

    public void setOnPolygonClickListener(@Nullable OnPolygonClickListener onPolygonClickListener) {
        this.annotationManager.setOnPolygonClickListener(onPolygonClickListener);
    }

    public void setOnPolylineClickListener(@Nullable OnPolylineClickListener onPolylineClickListener) {
        this.annotationManager.setOnPolylineClickListener(onPolylineClickListener);
    }

    public void selectMarker(@NonNull Marker marker) {
        if (marker == null) {
            C0001a.d("marker was null, so just returning", new Object[0]);
        } else {
            this.annotationManager.selectMarker(marker);
        }
    }

    public void deselectMarkers() {
        this.annotationManager.deselectMarkers();
    }

    public void deselectMarker(@NonNull Marker marker) {
        this.annotationManager.deselectMarker(marker);
    }

    public List<Marker> getSelectedMarkers() {
        return this.annotationManager.getSelectedMarkers();
    }

    public MarkerViewManager getMarkerViewManager() {
        return this.annotationManager.getMarkerViewManager();
    }

    public void setInfoWindowAdapter(@Nullable InfoWindowAdapter infoWindowAdapter) {
        this.annotationManager.getInfoWindowManager().setInfoWindowAdapter(infoWindowAdapter);
    }

    @Nullable
    public InfoWindowAdapter getInfoWindowAdapter() {
        return this.annotationManager.getInfoWindowManager().getInfoWindowAdapter();
    }

    public void setAllowConcurrentMultipleOpenInfoWindows(boolean z) {
        this.annotationManager.getInfoWindowManager().setAllowConcurrentMultipleOpenInfoWindows(z);
    }

    public boolean isAllowConcurrentMultipleOpenInfoWindows() {
        return this.annotationManager.getInfoWindowManager().isAllowConcurrentMultipleOpenInfoWindows();
    }

    public void setLatLngBoundsForCameraTarget(@Nullable LatLngBounds latLngBounds) {
        this.nativeMapView.setLatLngBounds(latLngBounds);
    }

    public CameraPosition getCameraForLatLngBounds(@NonNull LatLngBounds latLngBounds, int[] iArr) {
        return this.nativeMapView.getCameraForLatLngBounds(latLngBounds, iArr);
    }

    public CameraPosition getCameraForGeometry(Geometry geometry, double d, int[] iArr) {
        return this.nativeMapView.getCameraForGeometry(geometry, d, iArr);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        setPadding(new int[]{i, i2, i3, i4});
    }

    private void setPadding(int[] iArr) {
        this.projection.setContentPadding(iArr);
        this.uiSettings.invalidate();
    }

    public int[] getPadding() {
        return this.projection.getContentPadding();
    }

    @Deprecated
    public void setOnCameraChangeListener(@Nullable OnCameraChangeListener onCameraChangeListener) {
        this.transform.setOnCameraChangeListener(onCameraChangeListener);
    }

    @Deprecated
    public void setOnCameraIdleListener(@Nullable OnCameraIdleListener onCameraIdleListener) {
        this.cameraChangeDispatcher.setOnCameraIdleListener(onCameraIdleListener);
    }

    public void addOnCameraIdleListener(@NonNull OnCameraIdleListener onCameraIdleListener) {
        this.cameraChangeDispatcher.addOnCameraIdleListener(onCameraIdleListener);
    }

    public void removeOnCameraIdleListener(@NonNull OnCameraIdleListener onCameraIdleListener) {
        this.cameraChangeDispatcher.removeOnCameraIdleListener(onCameraIdleListener);
    }

    @Deprecated
    public void setOnCameraMoveCancelListener(@Nullable OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.cameraChangeDispatcher.setOnCameraMoveCanceledListener(onCameraMoveCanceledListener);
    }

    public void addOnCameraMoveCancelListener(@NonNull OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.cameraChangeDispatcher.addOnCameraMoveCancelListener(onCameraMoveCanceledListener);
    }

    public void removeOnCameraMoveCancelListener(@NonNull OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.cameraChangeDispatcher.removeOnCameraMoveCancelListener(onCameraMoveCanceledListener);
    }

    @Deprecated
    public void setOnCameraMoveStartedListener(@Nullable OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.cameraChangeDispatcher.setOnCameraMoveStartedListener(onCameraMoveStartedListener);
    }

    public void addOnCameraMoveStartedListener(@NonNull OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.cameraChangeDispatcher.addOnCameraMoveStartedListener(onCameraMoveStartedListener);
    }

    public void removeOnCameraMoveStartedListener(@NonNull OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.cameraChangeDispatcher.removeOnCameraMoveStartedListener(onCameraMoveStartedListener);
    }

    @Deprecated
    public void setOnCameraMoveListener(@Nullable OnCameraMoveListener onCameraMoveListener) {
        this.cameraChangeDispatcher.setOnCameraMoveListener(onCameraMoveListener);
    }

    public void addOnCameraMoveListener(@NonNull OnCameraMoveListener onCameraMoveListener) {
        this.cameraChangeDispatcher.addOnCameraMoveListener(onCameraMoveListener);
    }

    public void removeOnCameraMoveListener(@NonNull OnCameraMoveListener onCameraMoveListener) {
        this.cameraChangeDispatcher.removeOnCameraMoveListener(onCameraMoveListener);
    }

    public void setOnFpsChangedListener(@Nullable OnFpsChangedListener onFpsChangedListener) {
        this.onFpsChangedListener = onFpsChangedListener;
        this.nativeMapView.setOnFpsChangedListener(onFpsChangedListener);
    }

    OnFpsChangedListener getOnFpsChangedListener() {
        return this.onFpsChangedListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.onGesturesManagerInteractionListener.onSetScrollListener(onScrollListener);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        this.onGesturesManagerInteractionListener.onAddScrollListener(onScrollListener);
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        this.onGesturesManagerInteractionListener.onRemoveScrollListener(onScrollListener);
    }

    @Deprecated
    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.onGesturesManagerInteractionListener.onSetFlingListener(onFlingListener);
    }

    public void addOnFlingListener(@NonNull OnFlingListener onFlingListener) {
        this.onGesturesManagerInteractionListener.onAddFlingListener(onFlingListener);
    }

    public void removeOnFlingListener(@NonNull OnFlingListener onFlingListener) {
        this.onGesturesManagerInteractionListener.onRemoveFlingListener(onFlingListener);
    }

    public void addOnMoveListener(@NonNull OnMoveListener onMoveListener) {
        this.onGesturesManagerInteractionListener.onAddMoveListener(onMoveListener);
    }

    public void removeOnMoveListener(@NonNull OnMoveListener onMoveListener) {
        this.onGesturesManagerInteractionListener.onRemoveMoveListener(onMoveListener);
    }

    public void addOnRotateListener(@NonNull OnRotateListener onRotateListener) {
        this.onGesturesManagerInteractionListener.onAddRotateListener(onRotateListener);
    }

    public void removeOnRotateListener(@NonNull OnRotateListener onRotateListener) {
        this.onGesturesManagerInteractionListener.onRemoveRotateListener(onRotateListener);
    }

    public void addOnScaleListener(@NonNull OnScaleListener onScaleListener) {
        this.onGesturesManagerInteractionListener.onAddScaleListener(onScaleListener);
    }

    public void removeOnScaleListener(@NonNull OnScaleListener onScaleListener) {
        this.onGesturesManagerInteractionListener.onRemoveScaleListener(onScaleListener);
    }

    public void addOnShoveListener(@NonNull OnShoveListener onShoveListener) {
        this.onGesturesManagerInteractionListener.onAddShoveListener(onShoveListener);
    }

    public void removeOnShoveListener(@NonNull OnShoveListener onShoveListener) {
        this.onGesturesManagerInteractionListener.onRemoveShoveListener(onShoveListener);
    }

    public void setGesturesManager(AndroidGesturesManager androidGesturesManager, boolean z, boolean z2) {
        this.onGesturesManagerInteractionListener.setGesturesManager(androidGesturesManager, z, z2);
    }

    public AndroidGesturesManager getGesturesManager() {
        return this.onGesturesManagerInteractionListener.getGesturesManager();
    }

    public void cancelAllVelocityAnimations() {
        this.onGesturesManagerInteractionListener.cancelAllVelocityAnimations();
    }

    @Deprecated
    public void setOnMapClickListener(@Nullable OnMapClickListener onMapClickListener) {
        this.onGesturesManagerInteractionListener.onSetMapClickListener(onMapClickListener);
    }

    public void addOnMapClickListener(@NonNull OnMapClickListener onMapClickListener) {
        this.onGesturesManagerInteractionListener.onAddMapClickListener(onMapClickListener);
    }

    public void removeOnMapClickListener(@NonNull OnMapClickListener onMapClickListener) {
        this.onGesturesManagerInteractionListener.onRemoveMapClickListener(onMapClickListener);
    }

    @Deprecated
    public void setOnMapLongClickListener(@Nullable OnMapLongClickListener onMapLongClickListener) {
        this.onGesturesManagerInteractionListener.onSetMapLongClickListener(onMapLongClickListener);
    }

    public void addOnMapLongClickListener(@NonNull OnMapLongClickListener onMapLongClickListener) {
        this.onGesturesManagerInteractionListener.onAddMapLongClickListener(onMapLongClickListener);
    }

    public void removeOnMapLongClickListener(@NonNull OnMapLongClickListener onMapLongClickListener) {
        this.onGesturesManagerInteractionListener.onRemoveMapLongClickListener(onMapLongClickListener);
    }

    public void setOnInfoWindowClickListener(@Nullable OnInfoWindowClickListener onInfoWindowClickListener) {
        this.annotationManager.getInfoWindowManager().setOnInfoWindowClickListener(onInfoWindowClickListener);
    }

    public OnInfoWindowClickListener getOnInfoWindowClickListener() {
        return this.annotationManager.getInfoWindowManager().getOnInfoWindowClickListener();
    }

    public void setOnInfoWindowLongClickListener(@Nullable OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.annotationManager.getInfoWindowManager().setOnInfoWindowLongClickListener(onInfoWindowLongClickListener);
    }

    public OnInfoWindowLongClickListener getOnInfoWindowLongClickListener() {
        return this.annotationManager.getInfoWindowManager().getOnInfoWindowLongClickListener();
    }

    public void setOnInfoWindowCloseListener(@Nullable OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.annotationManager.getInfoWindowManager().setOnInfoWindowCloseListener(onInfoWindowCloseListener);
    }

    public OnInfoWindowCloseListener getOnInfoWindowCloseListener() {
        return this.annotationManager.getInfoWindowManager().getOnInfoWindowCloseListener();
    }

    public void snapshot(@NonNull SnapshotReadyCallback snapshotReadyCallback) {
        this.nativeMapView.addSnapshotCallback(snapshotReadyCallback);
    }

    @NonNull
    public List<Feature> queryRenderedFeatures(@NonNull PointF pointF, @Nullable String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(pointF, strArr, null);
    }

    @NonNull
    public List<Feature> queryRenderedFeatures(@NonNull PointF pointF, @Nullable Expression expression, @Nullable String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(pointF, strArr, expression);
    }

    @NonNull
    public List<Feature> queryRenderedFeatures(@NonNull RectF rectF, @Nullable String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(rectF, strArr, null);
    }

    @NonNull
    public List<Feature> queryRenderedFeatures(@NonNull RectF rectF, @Nullable Expression expression, @Nullable String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(rectF, strArr, expression);
    }

    Transform getTransform() {
        return this.transform;
    }
}
