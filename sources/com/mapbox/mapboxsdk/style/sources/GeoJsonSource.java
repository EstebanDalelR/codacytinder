package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@UiThread
public class GeoJsonSource extends Source {
    private native void nativeSetFeature(Feature feature);

    private native void nativeSetFeatureCollection(FeatureCollection featureCollection);

    private native void nativeSetGeoJsonString(String str);

    private native void nativeSetGeometry(Geometry geometry);

    private native Feature[] querySourceFeatures(Object[] objArr);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str, Object obj);

    protected native String nativeGetUrl();

    protected native void nativeSetUrl(String str);

    public GeoJsonSource(long j) {
        super(j);
    }

    public GeoJsonSource(String str) {
        initialize(str, null);
        setGeoJson(FeatureCollection.fromFeatures(new ArrayList()));
    }

    public GeoJsonSource(String str, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(FeatureCollection.fromFeatures(new ArrayList()));
    }

    public GeoJsonSource(String str, String str2) {
        if (str2 != null) {
            if (!str2.startsWith("http")) {
                initialize(str, null);
                setGeoJson(str2);
                return;
            }
        }
        throw new IllegalArgumentException("Expected a raw json body");
    }

    public GeoJsonSource(String str, String str2, GeoJsonOptions geoJsonOptions) {
        if (str2 != null) {
            if (!str2.startsWith("http")) {
                initialize(str, geoJsonOptions);
                setGeoJson(str2);
                return;
            }
        }
        throw new IllegalArgumentException("Expected a raw json body");
    }

    public GeoJsonSource(String str, URL url) {
        initialize(str, null);
        nativeSetUrl(url.toExternalForm());
    }

    public GeoJsonSource(String str, URL url, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        nativeSetUrl(url.toExternalForm());
    }

    public GeoJsonSource(String str, FeatureCollection featureCollection) {
        initialize(str, null);
        setGeoJson(featureCollection);
    }

    public GeoJsonSource(String str, FeatureCollection featureCollection, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(featureCollection);
    }

    public GeoJsonSource(String str, Feature feature) {
        initialize(str, null);
        setGeoJson(feature);
    }

    public GeoJsonSource(String str, Feature feature, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(feature);
    }

    public GeoJsonSource(String str, Geometry geometry) {
        initialize(str, null);
        setGeoJson(geometry);
    }

    public GeoJsonSource(String str, Geometry geometry, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(geometry);
    }

    public void setGeoJson(Feature feature) {
        nativeSetFeature(feature);
    }

    public void setGeoJson(Geometry geometry) {
        nativeSetGeometry(geometry);
    }

    public void setGeoJson(FeatureCollection featureCollection) {
        nativeSetFeatureCollection(featureCollection);
    }

    public void setGeoJson(String str) {
        nativeSetGeoJsonString(str);
    }

    public void setUrl(URL url) {
        setUrl(url.toExternalForm());
    }

    public void setUrl(String str) {
        nativeSetUrl(str);
    }

    @Nullable
    public String getUrl() {
        return nativeGetUrl();
    }

    @NonNull
    public List<Feature> querySourceFeatures(@Nullable Expression expression) {
        expression = querySourceFeatures(expression != null ? expression.toArray() : null);
        return expression != null ? Arrays.asList(expression) : new ArrayList();
    }
}
