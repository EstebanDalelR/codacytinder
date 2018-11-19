package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_MultiPolygon.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AutoValue
public abstract class MultiPolygon implements CoordinateContainer<List<List<List<Point>>>>, Serializable {
    private static final String TYPE = "MultiPolygon";

    @Nullable
    public abstract BoundingBox bbox();

    @NonNull
    public abstract List<List<List<Point>>> coordinates();

    @NonNull
    public abstract String type();

    public static MultiPolygon fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        return (MultiPolygon) gsonBuilder.create().fromJson(str, MultiPolygon.class);
    }

    public static MultiPolygon fromPolygons(@NonNull List<Polygon> list) {
        List arrayList = new ArrayList(list.size());
        for (Polygon coordinates : list) {
            arrayList.add(coordinates.coordinates());
        }
        return new AutoValue_MultiPolygon(TYPE, null, arrayList);
    }

    public static MultiPolygon fromPolygons(@NonNull List<Polygon> list, @Nullable BoundingBox boundingBox) {
        List arrayList = new ArrayList(list.size());
        for (Polygon coordinates : list) {
            arrayList.add(coordinates.coordinates());
        }
        return new AutoValue_MultiPolygon(TYPE, boundingBox, arrayList);
    }

    public static MultiPolygon fromPolygon(@NonNull Polygon polygon) {
        return new AutoValue_MultiPolygon(TYPE, null, Arrays.asList(new List[]{polygon.coordinates()}));
    }

    public static MultiPolygon fromPolygon(@NonNull Polygon polygon, @Nullable BoundingBox boundingBox) {
        return new AutoValue_MultiPolygon(TYPE, boundingBox, Arrays.asList(new List[]{polygon.coordinates()}));
    }

    public static MultiPolygon fromLngLats(@NonNull List<List<List<Point>>> list) {
        return new AutoValue_MultiPolygon(TYPE, null, list);
    }

    public static MultiPolygon fromLngLats(@NonNull List<List<List<Point>>> list, @Nullable BoundingBox boundingBox) {
        return new AutoValue_MultiPolygon(TYPE, boundingBox, list);
    }

    static MultiPolygon fromLngLats(@NonNull double[][][][] dArr) {
        List arrayList = new ArrayList(dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            List arrayList2 = new ArrayList(dArr[i].length);
            for (int i2 = 0; i2 < dArr[i].length; i2++) {
                List arrayList3 = new ArrayList(dArr[i][i2].length);
                for (double[] fromLngLat : dArr[i][i2]) {
                    arrayList3.add(Point.fromLngLat(fromLngLat));
                }
                arrayList2.add(arrayList3);
            }
            arrayList.add(arrayList2);
        }
        return new AutoValue_MultiPolygon(TYPE, null, arrayList);
    }

    public List<Polygon> polygons() {
        List<List> coordinates = coordinates();
        List<Polygon> arrayList = new ArrayList(coordinates.size());
        for (List fromLngLats : coordinates) {
            arrayList.add(Polygon.fromLngLats(fromLngLats));
        }
        return arrayList;
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Point.class, new PointSerializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public static TypeAdapter<MultiPolygon> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }
}
