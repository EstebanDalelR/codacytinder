package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import android.support.annotation.UiThread;
import com.mapbox.geojson.Feature;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@UiThread
public class VectorSource extends Source {
    private native Feature[] querySourceFeatures(String[] strArr, Object[] objArr);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str, Object obj);

    protected native String nativeGetUrl();

    public VectorSource(long j) {
        super(j);
    }

    public VectorSource(String str, URL url) {
        this(str, url.toExternalForm());
    }

    public VectorSource(String str, String str2) {
        initialize(str, str2);
    }

    public VectorSource(String str, TileSet tileSet) {
        initialize(str, tileSet.toValueObject());
    }

    @NonNull
    public List<Feature> querySourceFeatures(@Size(min = 1) String[] strArr, @Nullable Expression expression) {
        strArr = querySourceFeatures(strArr, expression != null ? expression.toArray() : null);
        return strArr != null ? Arrays.asList(strArr) : new ArrayList();
    }

    @Nullable
    public String getUrl() {
        return nativeGetUrl();
    }
}
