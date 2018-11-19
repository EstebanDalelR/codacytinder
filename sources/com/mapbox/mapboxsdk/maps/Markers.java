package com.mapbox.mapboxsdk.maps;

import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.BaseMarkerViewOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager.OnMarkerViewAddedListener;
import java.util.List;

interface Markers {
    Marker addBy(@NonNull BaseMarkerOptions baseMarkerOptions, @NonNull MapboxMap mapboxMap);

    List<Marker> addBy(@NonNull List<? extends BaseMarkerOptions> list, @NonNull MapboxMap mapboxMap);

    MarkerView addViewBy(@NonNull BaseMarkerViewOptions baseMarkerViewOptions, @NonNull MapboxMap mapboxMap, @Nullable OnMarkerViewAddedListener onMarkerViewAddedListener);

    List<MarkerView> addViewsBy(@NonNull List<? extends BaseMarkerViewOptions> list, @NonNull MapboxMap mapboxMap);

    List<Marker> obtainAll();

    List<Marker> obtainAllIn(@NonNull RectF rectF);

    List<MarkerView> obtainViewsIn(@NonNull RectF rectF);

    void reload();

    void update(@NonNull Marker marker, @NonNull MapboxMap mapboxMap);
}
