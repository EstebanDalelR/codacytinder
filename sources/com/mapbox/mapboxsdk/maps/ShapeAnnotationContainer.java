package com.mapbox.mapboxsdk.maps;

import android.graphics.RectF;
import android.support.v4.util.C0550f;
import com.mapbox.mapboxsdk.annotations.Annotation;
import java.util.ArrayList;
import java.util.List;

class ShapeAnnotationContainer implements ShapeAnnotations {
    private final C0550f<Annotation> annotations;
    private final NativeMapView nativeMapView;

    ShapeAnnotationContainer(NativeMapView nativeMapView, C0550f<Annotation> c0550f) {
        this.nativeMapView = nativeMapView;
        this.annotations = c0550f;
    }

    public List<Annotation> obtainAllIn(RectF rectF) {
        return getAnnotationsFromIds(this.nativeMapView.queryShapeAnnotations(this.nativeMapView.getDensityDependantRectangle(rectF)));
    }

    private List<Annotation> getAnnotationsFromIds(long[] jArr) {
        List<Annotation> arrayList = new ArrayList();
        for (long a : jArr) {
            Annotation annotation = (Annotation) this.annotations.a(a);
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return arrayList;
    }
}
