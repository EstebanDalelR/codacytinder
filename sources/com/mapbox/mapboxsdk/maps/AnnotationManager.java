package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C0550f;
import android.view.View;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.BaseMarkerViewOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager.OnMarkerViewAddedListener;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.PolygonOptions;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMarkerClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnPolygonClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnPolylineClickListener;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.C0001a;

class AnnotationManager {
    private static final long NO_ANNOTATION_ID = -1;
    private Annotations annotations;
    private final C0550f<Annotation> annotationsArray;
    private final IconManager iconManager;
    private final InfoWindowManager infoWindowManager = new InfoWindowManager();
    private final MapView mapView;
    private MapboxMap mapboxMap;
    private final MarkerViewManager markerViewManager;
    private Markers markers;
    private OnMarkerClickListener onMarkerClickListener;
    private OnPolygonClickListener onPolygonClickListener;
    private OnPolylineClickListener onPolylineClickListener;
    private Polygons polygons;
    private Polylines polylines;
    private final List<Marker> selectedMarkers = new ArrayList();
    private ShapeAnnotations shapeAnnotations;

    private static class MarkerHit {
        private final List<Marker> markers;
        private final RectF tapRect;

        MarkerHit(RectF rectF, List<Marker> list) {
            this.tapRect = rectF;
            this.markers = list;
        }

        float getTapPointX() {
            return this.tapRect.centerX();
        }

        float getTapPointY() {
            return this.tapRect.centerY();
        }
    }

    private static class MarkerHitResolver {
        private Bitmap bitmap;
        private long closestMarkerId = -1;
        private RectF highestSurfaceIntersection = new RectF();
        private RectF hitRectMarker = new RectF();
        private Rect hitRectView = new Rect();
        private PointF markerLocation;
        private final MarkerViewManager markerViewManager;
        private final Projection projection;
        private View view;

        MarkerHitResolver(@NonNull MapboxMap mapboxMap) {
            this.markerViewManager = mapboxMap.getMarkerViewManager();
            this.projection = mapboxMap.getProjection();
        }

        public long execute(MarkerHit markerHit) {
            resolveForMarkers(markerHit);
            return this.closestMarkerId;
        }

        private void resolveForMarkers(MarkerHit markerHit) {
            for (Marker marker : markerHit.markers) {
                if (marker instanceof MarkerView) {
                    resolveForMarkerView(markerHit, (MarkerView) marker);
                } else {
                    resolveForMarker(markerHit, marker);
                }
            }
        }

        private void resolveForMarkerView(MarkerHit markerHit, MarkerView markerView) {
            this.view = this.markerViewManager.getView(markerView);
            if (this.view != null) {
                this.view.getHitRect(this.hitRectView);
                this.hitRectMarker = new RectF(this.hitRectView);
                hitTestMarker(markerHit, markerView, this.hitRectMarker);
            }
        }

        private void resolveForMarker(MarkerHit markerHit, Marker marker) {
            this.markerLocation = this.projection.toScreenLocation(marker.getPosition());
            this.bitmap = marker.getIcon().getBitmap();
            this.hitRectMarker.set(0.0f, 0.0f, (float) this.bitmap.getWidth(), (float) this.bitmap.getHeight());
            this.hitRectMarker.offsetTo(this.markerLocation.x - ((float) (this.bitmap.getWidth() / 2)), this.markerLocation.y - ((float) (this.bitmap.getHeight() / 2)));
            hitTestMarker(markerHit, marker, this.hitRectMarker);
        }

        private void hitTestMarker(MarkerHit markerHit, Marker marker, RectF rectF) {
            if (rectF.contains(markerHit.getTapPointX(), markerHit.getTapPointY())) {
                rectF.intersect(markerHit.tapRect);
                if (isRectangleHighestSurfaceIntersection(rectF) != null) {
                    this.highestSurfaceIntersection = new RectF(rectF);
                    this.closestMarkerId = marker.getId();
                }
            }
        }

        private boolean isRectangleHighestSurfaceIntersection(RectF rectF) {
            return rectF.width() * rectF.height() > this.highestSurfaceIntersection.width() * this.highestSurfaceIntersection.height() ? true : null;
        }
    }

    private static class ShapeAnnotationHit {
        private final RectF tapPoint;

        ShapeAnnotationHit(RectF rectF) {
            this.tapPoint = rectF;
        }
    }

    private static class ShapeAnnotationHitResolver {
        private ShapeAnnotations shapeAnnotations;

        ShapeAnnotationHitResolver(ShapeAnnotations shapeAnnotations) {
            this.shapeAnnotations = shapeAnnotations;
        }

        public Annotation execute(ShapeAnnotationHit shapeAnnotationHit) {
            shapeAnnotationHit = this.shapeAnnotations.obtainAllIn(shapeAnnotationHit.tapPoint);
            return shapeAnnotationHit.size() > 0 ? (Annotation) shapeAnnotationHit.get(0) : null;
        }
    }

    AnnotationManager(NativeMapView nativeMapView, MapView mapView, C0550f<Annotation> c0550f, MarkerViewManager markerViewManager, IconManager iconManager, Annotations annotations, Markers markers, Polygons polygons, Polylines polylines, ShapeAnnotations shapeAnnotations) {
        this.mapView = mapView;
        this.annotationsArray = c0550f;
        this.markerViewManager = markerViewManager;
        this.iconManager = iconManager;
        this.annotations = annotations;
        this.markers = markers;
        this.polygons = polygons;
        this.polylines = polylines;
        this.shapeAnnotations = shapeAnnotations;
        if (nativeMapView != null) {
            nativeMapView.addOnMapChangedListener(markerViewManager);
        }
    }

    AnnotationManager bind(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
        this.markerViewManager.bind(mapboxMap);
        return this;
    }

    void update() {
        this.markerViewManager.update();
        this.infoWindowManager.update();
    }

    Annotation getAnnotation(long j) {
        return this.annotations.obtainBy(j);
    }

    List<Annotation> getAnnotations() {
        return this.annotations.obtainAll();
    }

    void removeAnnotation(long j) {
        this.annotations.removeBy(j);
    }

    void removeAnnotation(@NonNull Annotation annotation) {
        if (annotation instanceof Marker) {
            Marker marker = (Marker) annotation;
            marker.hideInfoWindow();
            if (this.selectedMarkers.contains(marker)) {
                this.selectedMarkers.remove(marker);
            }
            if (marker instanceof MarkerView) {
                this.markerViewManager.removeMarkerView((MarkerView) marker);
            } else {
                this.iconManager.iconCleanup(marker.getIcon());
            }
        }
        this.annotations.removeBy(annotation);
    }

    void removeAnnotations(@NonNull List<? extends Annotation> list) {
        for (Annotation annotation : list) {
            if (annotation instanceof Marker) {
                Marker marker = (Marker) annotation;
                marker.hideInfoWindow();
                if (this.selectedMarkers.contains(marker)) {
                    this.selectedMarkers.remove(marker);
                }
                if (marker instanceof MarkerView) {
                    this.markerViewManager.removeMarkerView((MarkerView) marker);
                } else {
                    this.iconManager.iconCleanup(marker.getIcon());
                }
            }
        }
        this.annotations.removeBy((List) list);
    }

    void removeAnnotations() {
        int b = this.annotationsArray.b();
        long[] jArr = new long[b];
        this.selectedMarkers.clear();
        for (int i = 0; i < b; i++) {
            jArr[i] = this.annotationsArray.b(i);
            Annotation annotation = (Annotation) this.annotationsArray.a(jArr[i]);
            if (annotation instanceof Marker) {
                Marker marker = (Marker) annotation;
                marker.hideInfoWindow();
                if (marker instanceof MarkerView) {
                    this.markerViewManager.removeMarkerView((MarkerView) marker);
                } else {
                    this.iconManager.iconCleanup(marker.getIcon());
                }
            }
        }
        this.annotations.removeAll();
    }

    Marker addMarker(@NonNull BaseMarkerOptions baseMarkerOptions, @NonNull MapboxMap mapboxMap) {
        return this.markers.addBy(baseMarkerOptions, mapboxMap);
    }

    List<Marker> addMarkers(@NonNull List<? extends BaseMarkerOptions> list, @NonNull MapboxMap mapboxMap) {
        return this.markers.addBy((List) list, mapboxMap);
    }

    void updateMarker(@NonNull Marker marker, @NonNull MapboxMap mapboxMap) {
        if (isAddedToMap(marker)) {
            this.markers.update(marker, mapboxMap);
        } else {
            logNonAdded(marker);
        }
    }

    List<Marker> getMarkers() {
        return this.markers.obtainAll();
    }

    @NonNull
    List<Marker> getMarkersInRect(@NonNull RectF rectF) {
        return this.markers.obtainAllIn(rectF);
    }

    MarkerView addMarker(@NonNull BaseMarkerViewOptions baseMarkerViewOptions, @NonNull MapboxMap mapboxMap, @Nullable OnMarkerViewAddedListener onMarkerViewAddedListener) {
        return this.markers.addViewBy(baseMarkerViewOptions, mapboxMap, onMarkerViewAddedListener);
    }

    List<MarkerView> addMarkerViews(@NonNull List<? extends BaseMarkerViewOptions> list, @NonNull MapboxMap mapboxMap) {
        return this.markers.addViewsBy(list, mapboxMap);
    }

    List<MarkerView> getMarkerViewsInRect(@NonNull RectF rectF) {
        return this.markers.obtainViewsIn(rectF);
    }

    void reloadMarkers() {
        this.markers.reload();
    }

    Polygon addPolygon(@NonNull PolygonOptions polygonOptions, @NonNull MapboxMap mapboxMap) {
        return this.polygons.addBy(polygonOptions, mapboxMap);
    }

    List<Polygon> addPolygons(@NonNull List<PolygonOptions> list, @NonNull MapboxMap mapboxMap) {
        return this.polygons.addBy((List) list, mapboxMap);
    }

    void updatePolygon(Polygon polygon) {
        if (isAddedToMap(polygon)) {
            this.polygons.update(polygon);
        } else {
            logNonAdded(polygon);
        }
    }

    List<Polygon> getPolygons() {
        return this.polygons.obtainAll();
    }

    Polyline addPolyline(@NonNull PolylineOptions polylineOptions, @NonNull MapboxMap mapboxMap) {
        return this.polylines.addBy(polylineOptions, mapboxMap);
    }

    List<Polyline> addPolylines(@NonNull List<PolylineOptions> list, @NonNull MapboxMap mapboxMap) {
        return this.polylines.addBy((List) list, mapboxMap);
    }

    void updatePolyline(Polyline polyline) {
        if (isAddedToMap(polyline)) {
            this.polylines.update(polyline);
        } else {
            logNonAdded(polyline);
        }
    }

    List<Polyline> getPolylines() {
        return this.polylines.obtainAll();
    }

    void setOnMarkerClickListener(@Nullable OnMarkerClickListener onMarkerClickListener) {
        this.onMarkerClickListener = onMarkerClickListener;
    }

    void setOnPolygonClickListener(@Nullable OnPolygonClickListener onPolygonClickListener) {
        this.onPolygonClickListener = onPolygonClickListener;
    }

    void setOnPolylineClickListener(@Nullable OnPolylineClickListener onPolylineClickListener) {
        this.onPolylineClickListener = onPolylineClickListener;
    }

    void selectMarker(@NonNull Marker marker) {
        if (!this.selectedMarkers.contains(marker)) {
            if (!this.infoWindowManager.isAllowConcurrentMultipleOpenInfoWindows()) {
                deselectMarkers();
            }
            if (marker instanceof MarkerView) {
                MarkerView markerView = (MarkerView) marker;
                this.markerViewManager.select(markerView, false);
                this.markerViewManager.ensureInfoWindowOffset(markerView);
            }
            if (this.infoWindowManager.isInfoWindowValidForMarker(marker) || this.infoWindowManager.getInfoWindowAdapter() != null) {
                this.infoWindowManager.add(marker.showInfoWindow(this.mapboxMap, this.mapView));
            }
            this.selectedMarkers.add(marker);
        }
    }

    void deselectMarkers() {
        if (!this.selectedMarkers.isEmpty()) {
            for (Marker marker : this.selectedMarkers) {
                if (marker != null) {
                    if (marker.isInfoWindowShown()) {
                        marker.hideInfoWindow();
                    }
                    if (marker instanceof MarkerView) {
                        this.markerViewManager.deselect((MarkerView) marker, false);
                    }
                }
            }
            this.selectedMarkers.clear();
        }
    }

    void deselectMarker(@NonNull Marker marker) {
        if (this.selectedMarkers.contains(marker)) {
            if (marker.isInfoWindowShown()) {
                marker.hideInfoWindow();
            }
            if (marker instanceof MarkerView) {
                this.markerViewManager.deselect((MarkerView) marker, false);
            }
            this.selectedMarkers.remove(marker);
        }
    }

    List<Marker> getSelectedMarkers() {
        return this.selectedMarkers;
    }

    InfoWindowManager getInfoWindowManager() {
        return this.infoWindowManager;
    }

    MarkerViewManager getMarkerViewManager() {
        return this.markerViewManager;
    }

    void adjustTopOffsetPixels(MapboxMap mapboxMap) {
        int b = this.annotationsArray.b();
        for (int i = 0; i < b; i++) {
            Annotation annotation = (Annotation) this.annotationsArray.a((long) i);
            if (annotation instanceof Marker) {
                Marker marker = (Marker) annotation;
                marker.setTopOffsetPixels(this.iconManager.getTopOffsetPixelsForIcon(marker.getIcon()));
            }
        }
        for (Marker marker2 : this.selectedMarkers) {
            if (marker2.isInfoWindowShown()) {
                marker2.hideInfoWindow();
                marker2.showInfoWindow(mapboxMap, this.mapView);
            }
        }
    }

    private boolean isAddedToMap(Annotation annotation) {
        return (annotation == null || annotation.getId() == -1 || this.annotationsArray.d(annotation.getId()) <= -1) ? null : true;
    }

    private void logNonAdded(Annotation annotation) {
        C0001a.d("Attempting to update non-added %s with value %s", new Object[]{annotation.getClass().getCanonicalName(), annotation});
    }

    boolean onTap(PointF pointF) {
        Annotation execute = new ShapeAnnotationHitResolver(this.shapeAnnotations).execute(getShapeAnnotationHitFromTap(pointF));
        boolean z = true;
        if (execute != null && handleClickForShapeAnnotation(execute)) {
            return true;
        }
        long execute2 = new MarkerHitResolver(this.mapboxMap).execute(getMarkerHitFromTouchArea(pointF));
        if (execute2 == -1 || isClickHandledForMarker(execute2) == null) {
            z = false;
        }
        return z;
    }

    private ShapeAnnotationHit getShapeAnnotationHitFromTap(PointF pointF) {
        float dimension = Mapbox.getApplicationContext().getResources().getDimension(C5812R.dimen.mapbox_eight_dp);
        return new ShapeAnnotationHit(new RectF(pointF.x - dimension, pointF.y - dimension, pointF.x + dimension, pointF.y + dimension));
    }

    private boolean handleClickForShapeAnnotation(Annotation annotation) {
        if ((annotation instanceof Polygon) && this.onPolygonClickListener != null) {
            this.onPolygonClickListener.onPolygonClick((Polygon) annotation);
            return true;
        } else if (!(annotation instanceof Polyline) || this.onPolylineClickListener == null) {
            return null;
        } else {
            this.onPolylineClickListener.onPolylineClick((Polyline) annotation);
            return true;
        }
    }

    private MarkerHit getMarkerHitFromTouchArea(PointF pointF) {
        float highestIconHeight = (float) ((int) (((double) this.iconManager.getHighestIconHeight()) * 1.5d));
        float highestIconWidth = (float) ((int) (((double) this.iconManager.getHighestIconWidth()) * 1.5d));
        RectF rectF = new RectF(pointF.x - highestIconHeight, pointF.y - highestIconWidth, pointF.x + highestIconHeight, pointF.y + highestIconWidth);
        return new MarkerHit(rectF, getMarkersInRect(rectF));
    }

    private boolean isClickHandledForMarker(long j) {
        boolean onClickMarkerView;
        Marker marker = (Marker) getAnnotation(j);
        if (marker instanceof MarkerView) {
            onClickMarkerView = this.markerViewManager.onClickMarkerView((MarkerView) marker);
        } else {
            onClickMarkerView = onClickMarker(marker);
        }
        if (!onClickMarkerView) {
            toggleMarkerSelectionState(marker);
        }
        return 1;
    }

    private boolean onClickMarker(Marker marker) {
        return (this.onMarkerClickListener == null || this.onMarkerClickListener.onMarkerClick(marker) == null) ? null : true;
    }

    private void toggleMarkerSelectionState(Marker marker) {
        if (this.selectedMarkers.contains(marker)) {
            deselectMarker(marker);
        } else {
            selectMarker(marker);
        }
    }
}
