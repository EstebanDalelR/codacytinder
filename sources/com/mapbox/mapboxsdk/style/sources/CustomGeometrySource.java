package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@UiThread
public class CustomGeometrySource extends Source {
    private final Map<TileID, AtomicBoolean> cancelledTileRequests;
    private ExecutorService executor;
    private GeometryTileProvider provider;

    private static class GeometryTileRequest implements Runnable {
        private AtomicBoolean cancelled;
        private TileID id;
        private GeometryTileProvider provider;
        private WeakReference<CustomGeometrySource> sourceRef;

        public GeometryTileRequest(TileID tileID, GeometryTileProvider geometryTileProvider, CustomGeometrySource customGeometrySource, AtomicBoolean atomicBoolean) {
            this.id = tileID;
            this.provider = geometryTileProvider;
            this.sourceRef = new WeakReference(customGeometrySource);
            this.cancelled = atomicBoolean;
        }

        public void run() {
            if (!isCancelled().booleanValue()) {
                FeatureCollection featuresForBounds = this.provider.getFeaturesForBounds(LatLngBounds.from(this.id.f21546z, this.id.f21544x, this.id.f21545y), this.id.f21546z);
                CustomGeometrySource customGeometrySource = (CustomGeometrySource) this.sourceRef.get();
                if (!(isCancelled().booleanValue() || customGeometrySource == null || featuresForBounds == null)) {
                    customGeometrySource.setTileData(this.id, featuresForBounds);
                }
            }
        }

        private Boolean isCancelled() {
            return Boolean.valueOf(this.cancelled.get());
        }
    }

    private static class TileID {
        /* renamed from: x */
        public int f21544x;
        /* renamed from: y */
        public int f21545y;
        /* renamed from: z */
        public int f21546z;

        public TileID(int i, int i2, int i3) {
            this.f21546z = i;
            this.f21544x = i2;
            this.f21545y = i3;
        }

        public int hashCode() {
            return Arrays.hashCode(new int[]{this.f21546z, this.f21544x, this.f21545y});
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    if (!(obj instanceof TileID)) {
                        return false;
                    }
                    TileID tileID = (TileID) obj;
                    if (this.f21546z != tileID.f21546z || this.f21544x != tileID.f21544x || this.f21545y != tileID.f21545y) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    private native void nativeInvalidateBounds(LatLngBounds latLngBounds);

    private native void nativeInvalidateTile(int i, int i2, int i3);

    private native void nativeSetTileData(int i, int i2, int i3, FeatureCollection featureCollection);

    private native Feature[] querySourceFeatures(Object[] objArr);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str, Object obj);

    public CustomGeometrySource(String str, GeometryTileProvider geometryTileProvider) {
        this(str, geometryTileProvider, new CustomGeometrySourceOptions());
    }

    public CustomGeometrySource(String str, GeometryTileProvider geometryTileProvider, CustomGeometrySourceOptions customGeometrySourceOptions) {
        this.cancelledTileRequests = new ConcurrentHashMap();
        this.provider = geometryTileProvider;
        this.executor = Executors.newFixedThreadPool(4);
        initialize(str, customGeometrySourceOptions);
    }

    public void invalidateRegion(LatLngBounds latLngBounds) {
        nativeInvalidateBounds(latLngBounds);
    }

    public void invalidateTile(int i, int i2, int i3) {
        nativeInvalidateTile(i, i2, i3);
    }

    public void setTileData(int i, int i2, int i3, FeatureCollection featureCollection) {
        nativeSetTileData(i, i2, i3, featureCollection);
    }

    @NonNull
    public List<Feature> querySourceFeatures(@Nullable Expression expression) {
        expression = querySourceFeatures(expression != null ? expression.toArray() : null);
        return expression != null ? Arrays.asList(expression) : new ArrayList();
    }

    private void setTileData(TileID tileID, FeatureCollection featureCollection) {
        this.cancelledTileRequests.remove(tileID);
        nativeSetTileData(tileID.f21546z, tileID.f21544x, tileID.f21545y, featureCollection);
    }

    @WorkerThread
    private void fetchTile(int i, int i2, int i3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        TileID tileID = new TileID(i, i2, i3);
        this.cancelledTileRequests.put(tileID, atomicBoolean);
        this.executor.execute(new GeometryTileRequest(tileID, this.provider, this, atomicBoolean));
    }

    @WorkerThread
    private void cancelTile(int i, int i2, int i3) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.cancelledTileRequests.get(new TileID(i, i2, i3));
        if (atomicBoolean != null) {
            atomicBoolean.compareAndSet(0, 1);
        }
    }
}
