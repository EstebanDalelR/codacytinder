package com.mapbox.mapboxsdk.maps;

import android.support.annotation.NonNull;
import android.support.v4.util.C0550f;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import java.util.ArrayList;
import java.util.List;

class PolylineContainer implements Polylines {
    private final C0550f<Annotation> annotations;
    private final NativeMapView nativeMapView;

    PolylineContainer(NativeMapView nativeMapView, C0550f<Annotation> c0550f) {
        this.nativeMapView = nativeMapView;
        this.annotations = c0550f;
    }

    public Polyline addBy(@NonNull PolylineOptions polylineOptions, @NonNull MapboxMap mapboxMap) {
        polylineOptions = polylineOptions.getPolyline();
        if (!polylineOptions.getPoints().isEmpty()) {
            long addPolyline = this.nativeMapView != null ? this.nativeMapView.addPolyline(polylineOptions) : 0;
            polylineOptions.setMapboxMap(mapboxMap);
            polylineOptions.setId(addPolyline);
            this.annotations.b(addPolyline, polylineOptions);
        }
        return polylineOptions;
    }

    public List<Polyline> addBy(@NonNull List<PolylineOptions> list, @NonNull MapboxMap mapboxMap) {
        int size = list.size();
        List<Polyline> arrayList = new ArrayList(size);
        if (this.nativeMapView != null && size > 0) {
            for (PolylineOptions polyline : list) {
                Polyline polyline2 = polyline.getPolyline();
                if (!polyline2.getPoints().isEmpty()) {
                    arrayList.add(polyline2);
                }
            }
            list = this.nativeMapView.addPolylines(arrayList);
            for (size = 0; size < list.length; size++) {
                Polyline polyline3 = (Polyline) arrayList.get(size);
                polyline3.setMapboxMap(mapboxMap);
                polyline3.setId(list[size]);
                this.annotations.b(list[size], polyline3);
            }
        }
        return arrayList;
    }

    public void update(Polyline polyline) {
        this.nativeMapView.updatePolyline(polyline);
        this.annotations.a(this.annotations.d(polyline.getId()), polyline);
    }

    public List<Polyline> obtainAll() {
        List<Polyline> arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.b(); i++) {
            Annotation annotation = (Annotation) this.annotations.a(this.annotations.b(i));
            if (annotation instanceof Polyline) {
                arrayList.add((Polyline) annotation);
            }
        }
        return arrayList;
    }
}
