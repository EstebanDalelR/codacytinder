package com.mapbox.geojson.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.GeometryCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;

public final class AutoValueGson_GeoJsonAdapterFactory extends GeoJsonAdapterFactory {
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        typeToken = typeToken.getRawType();
        if (MultiPoint.class.isAssignableFrom(typeToken)) {
            return MultiPoint.typeAdapter(gson);
        }
        if (MultiLineString.class.isAssignableFrom(typeToken)) {
            return MultiLineString.typeAdapter(gson);
        }
        if (Feature.class.isAssignableFrom(typeToken)) {
            return Feature.typeAdapter(gson);
        }
        if (MultiPolygon.class.isAssignableFrom(typeToken)) {
            return MultiPolygon.typeAdapter(gson);
        }
        if (FeatureCollection.class.isAssignableFrom(typeToken)) {
            return FeatureCollection.typeAdapter(gson);
        }
        if (GeometryCollection.class.isAssignableFrom(typeToken)) {
            return GeometryCollection.typeAdapter(gson);
        }
        if (BoundingBox.class.isAssignableFrom(typeToken)) {
            return BoundingBox.typeAdapter(gson);
        }
        if (Point.class.isAssignableFrom(typeToken)) {
            return Point.typeAdapter(gson);
        }
        if (Polygon.class.isAssignableFrom(typeToken)) {
            return Polygon.typeAdapter(gson);
        }
        return LineString.class.isAssignableFrom(typeToken) != null ? LineString.typeAdapter(gson) : null;
    }
}
