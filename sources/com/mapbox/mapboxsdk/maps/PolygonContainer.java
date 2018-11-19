package com.mapbox.mapboxsdk.maps;

import android.support.annotation.NonNull;
import android.support.v4.util.C0550f;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.PolygonOptions;
import java.util.ArrayList;
import java.util.List;

class PolygonContainer implements Polygons {
    private final C0550f<Annotation> annotations;
    private final NativeMapView nativeMapView;

    PolygonContainer(NativeMapView nativeMapView, C0550f<Annotation> c0550f) {
        this.nativeMapView = nativeMapView;
        this.annotations = c0550f;
    }

    public Polygon addBy(@NonNull PolygonOptions polygonOptions, @NonNull MapboxMap mapboxMap) {
        polygonOptions = polygonOptions.getPolygon();
        if (!polygonOptions.getPoints().isEmpty()) {
            long addPolygon = this.nativeMapView != null ? this.nativeMapView.addPolygon(polygonOptions) : 0;
            polygonOptions.setId(addPolygon);
            polygonOptions.setMapboxMap(mapboxMap);
            this.annotations.b(addPolygon, polygonOptions);
        }
        return polygonOptions;
    }

    public List<Polygon> addBy(@NonNull List<PolygonOptions> list, @NonNull MapboxMap mapboxMap) {
        int size = list.size();
        List<Polygon> arrayList = new ArrayList(size);
        if (this.nativeMapView != null && size > 0) {
            for (PolygonOptions polygon : list) {
                Polygon polygon2 = polygon.getPolygon();
                if (!polygon2.getPoints().isEmpty()) {
                    arrayList.add(polygon2);
                }
            }
            list = this.nativeMapView.addPolygons(arrayList);
            for (size = 0; size < list.length; size++) {
                Polygon polygon3 = (Polygon) arrayList.get(size);
                polygon3.setMapboxMap(mapboxMap);
                polygon3.setId(list[size]);
                this.annotations.b(list[size], polygon3);
            }
        }
        return arrayList;
    }

    public void update(Polygon polygon) {
        this.nativeMapView.updatePolygon(polygon);
        this.annotations.a(this.annotations.d(polygon.getId()), polygon);
    }

    public List<Polygon> obtainAll() {
        List<Polygon> arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.b(); i++) {
            Annotation annotation = (Annotation) this.annotations.a(this.annotations.b(i));
            if (annotation instanceof Polygon) {
                arrayList.add((Polygon) annotation);
            }
        }
        return arrayList;
    }
}
