package com.mapbox.mapboxsdk.maps;

import android.support.annotation.NonNull;
import android.support.v4.util.C0550f;
import com.mapbox.mapboxsdk.annotations.Annotation;
import java.util.ArrayList;
import java.util.List;

class AnnotationContainer implements Annotations {
    private final C0550f<Annotation> annotations;
    private final NativeMapView nativeMapView;

    AnnotationContainer(NativeMapView nativeMapView, C0550f<Annotation> c0550f) {
        this.nativeMapView = nativeMapView;
        this.annotations = c0550f;
    }

    public Annotation obtainBy(long j) {
        return (Annotation) this.annotations.a(j);
    }

    public List<Annotation> obtainAll() {
        List<Annotation> arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.b(); i++) {
            arrayList.add(this.annotations.a(this.annotations.b(i)));
        }
        return arrayList;
    }

    public void removeBy(long j) {
        if (this.nativeMapView != null) {
            this.nativeMapView.removeAnnotation(j);
        }
        this.annotations.c(j);
    }

    public void removeBy(@NonNull Annotation annotation) {
        removeBy(annotation.getId());
    }

    public void removeBy(@NonNull List<? extends Annotation> list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Annotation) list.get(i)).getId();
        }
        removeNativeAnnotations(jArr);
        for (long c : jArr) {
            this.annotations.c(c);
        }
    }

    public void removeAll() {
        int b = this.annotations.b();
        long[] jArr = new long[b];
        for (int i = 0; i < b; i++) {
            jArr[i] = this.annotations.b(i);
        }
        removeNativeAnnotations(jArr);
        this.annotations.c();
    }

    private void removeNativeAnnotations(long[] jArr) {
        if (this.nativeMapView != null) {
            this.nativeMapView.removeAnnotations(jArr);
        }
    }
}
