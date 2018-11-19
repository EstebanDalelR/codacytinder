package com.mapbox.mapboxsdk.maps;

import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C0550f;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.BaseMarkerViewOptions;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager.OnMarkerViewAddedListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class MarkerContainer implements Markers {
    private final C0550f<Annotation> annotations;
    private final IconManager iconManager;
    private final MapView mapView;
    private final MarkerViewManager markerViewManager;
    private final NativeMapView nativeMapView;

    MarkerContainer(NativeMapView nativeMapView, MapView mapView, C0550f<Annotation> c0550f, IconManager iconManager, MarkerViewManager markerViewManager) {
        this.nativeMapView = nativeMapView;
        this.mapView = mapView;
        this.annotations = c0550f;
        this.iconManager = iconManager;
        this.markerViewManager = markerViewManager;
    }

    public Marker addBy(@NonNull BaseMarkerOptions baseMarkerOptions, @NonNull MapboxMap mapboxMap) {
        baseMarkerOptions = prepareMarker(baseMarkerOptions);
        long addMarker = this.nativeMapView != null ? this.nativeMapView.addMarker(baseMarkerOptions) : 0;
        baseMarkerOptions.setMapboxMap(mapboxMap);
        baseMarkerOptions.setId(addMarker);
        this.annotations.b(addMarker, baseMarkerOptions);
        return baseMarkerOptions;
    }

    public List<Marker> addBy(@NonNull List<? extends BaseMarkerOptions> list, @NonNull MapboxMap mapboxMap) {
        int size = list.size();
        List<Marker> arrayList = new ArrayList(size);
        if (this.nativeMapView != null && size > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.add(prepareMarker((BaseMarkerOptions) list.get(i)));
            }
            if (arrayList.size() > null) {
                list = this.nativeMapView.addMarkers(arrayList);
                for (int i2 = 0; i2 < list.length; i2++) {
                    Marker marker = (Marker) arrayList.get(i2);
                    marker.setMapboxMap(mapboxMap);
                    marker.setId(list[i2]);
                    this.annotations.b(list[i2], marker);
                }
            }
        }
        return arrayList;
    }

    public void update(@NonNull Marker marker, @NonNull MapboxMap mapboxMap) {
        ensureIconLoaded(marker, mapboxMap);
        this.nativeMapView.updateMarker(marker);
        this.annotations.a(this.annotations.d(marker.getId()), marker);
    }

    public List<Marker> obtainAll() {
        List<Marker> arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.b(); i++) {
            Annotation annotation = (Annotation) this.annotations.a(this.annotations.b(i));
            if (annotation instanceof Marker) {
                arrayList.add((Marker) annotation);
            }
        }
        return arrayList;
    }

    @NonNull
    public List<Marker> obtainAllIn(@NonNull RectF rectF) {
        rectF = this.nativeMapView.queryPointAnnotations(this.nativeMapView.getDensityDependantRectangle(rectF));
        List arrayList = new ArrayList(rectF.length);
        for (long valueOf : rectF) {
            arrayList.add(Long.valueOf(valueOf));
        }
        Collection arrayList2 = new ArrayList(rectF.length);
        rectF = obtainAnnotations();
        int size = rectF.size();
        for (int i = 0; i < size; i++) {
            Annotation annotation = (Annotation) rectF.get(i);
            if ((annotation instanceof Marker) && arrayList.contains(Long.valueOf(annotation.getId()))) {
                arrayList2.add((Marker) annotation);
            }
        }
        return new ArrayList(arrayList2);
    }

    public MarkerView addViewBy(@NonNull BaseMarkerViewOptions baseMarkerViewOptions, @NonNull MapboxMap mapboxMap, @Nullable OnMarkerViewAddedListener onMarkerViewAddedListener) {
        baseMarkerViewOptions = prepareViewMarker(baseMarkerViewOptions);
        baseMarkerViewOptions.setMapboxMap(mapboxMap);
        long addMarker = this.nativeMapView.addMarker(baseMarkerViewOptions);
        baseMarkerViewOptions.setId(addMarker);
        this.annotations.b(addMarker, baseMarkerViewOptions);
        if (onMarkerViewAddedListener != null) {
            this.markerViewManager.addOnMarkerViewAddedListener(baseMarkerViewOptions, onMarkerViewAddedListener);
        }
        this.markerViewManager.setEnabled(true);
        this.markerViewManager.setWaitingForRenderInvoke(true);
        return baseMarkerViewOptions;
    }

    public List<MarkerView> addViewsBy(@NonNull List<? extends BaseMarkerViewOptions> list, @NonNull MapboxMap mapboxMap) {
        List<MarkerView> arrayList = new ArrayList();
        for (BaseMarkerViewOptions baseMarkerViewOptions : list) {
            if (list.indexOf(baseMarkerViewOptions) == list.size() - 1) {
                this.markerViewManager.setWaitingForRenderInvoke(true);
            }
            Marker prepareViewMarker = prepareViewMarker(baseMarkerViewOptions);
            prepareViewMarker.setMapboxMap(mapboxMap);
            long addMarker = this.nativeMapView.addMarker(prepareViewMarker);
            prepareViewMarker.setId(addMarker);
            this.annotations.b(addMarker, prepareViewMarker);
            arrayList.add(prepareViewMarker);
        }
        this.markerViewManager.setEnabled(true);
        this.markerViewManager.update();
        return arrayList;
    }

    public List<MarkerView> obtainViewsIn(@NonNull RectF rectF) {
        float pixelRatio = this.nativeMapView.getPixelRatio();
        rectF = this.nativeMapView.queryPointAnnotations(new RectF(rectF.left / pixelRatio, rectF.top / pixelRatio, rectF.right / pixelRatio, rectF.bottom / pixelRatio));
        List arrayList = new ArrayList(rectF.length);
        for (long valueOf : rectF) {
            arrayList.add(Long.valueOf(valueOf));
        }
        Collection arrayList2 = new ArrayList(rectF.length);
        rectF = obtainAnnotations();
        int size = rectF.size();
        for (int i = 0; i < size; i++) {
            Annotation annotation = (Annotation) rectF.get(i);
            if ((annotation instanceof MarkerView) && arrayList.contains(Long.valueOf(annotation.getId()))) {
                arrayList2.add((MarkerView) annotation);
            }
        }
        return new ArrayList(arrayList2);
    }

    public void reload() {
        this.iconManager.reloadIcons();
        int b = this.annotations.b();
        for (int i = 0; i < b; i++) {
            Annotation annotation = (Annotation) this.annotations.a((long) i);
            if (annotation instanceof Marker) {
                Marker marker = (Marker) annotation;
                this.nativeMapView.removeAnnotation(annotation.getId());
                marker.setId(this.nativeMapView.addMarker(marker));
            }
        }
    }

    private Marker prepareMarker(BaseMarkerOptions baseMarkerOptions) {
        baseMarkerOptions = baseMarkerOptions.getMarker();
        baseMarkerOptions.setTopOffsetPixels(this.iconManager.getTopOffsetPixelsForIcon(this.iconManager.loadIconForMarker(baseMarkerOptions)));
        return baseMarkerOptions;
    }

    private void ensureIconLoaded(Marker marker, MapboxMap mapboxMap) {
        if (!(marker instanceof MarkerView)) {
            this.iconManager.ensureIconLoaded(marker, mapboxMap);
        }
    }

    private List<Annotation> obtainAnnotations() {
        List<Annotation> arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.b(); i++) {
            arrayList.add(this.annotations.a(this.annotations.b(i)));
        }
        return arrayList;
    }

    private MarkerView prepareViewMarker(BaseMarkerViewOptions baseMarkerViewOptions) {
        MarkerView marker = baseMarkerViewOptions.getMarker();
        baseMarkerViewOptions = baseMarkerViewOptions.getIcon();
        if (baseMarkerViewOptions == null) {
            baseMarkerViewOptions = IconFactory.getInstance(this.mapView.getContext()).defaultMarkerView();
        }
        this.iconManager.loadIconForMarkerView(marker);
        marker.setIcon(baseMarkerViewOptions);
        return marker;
    }
}
