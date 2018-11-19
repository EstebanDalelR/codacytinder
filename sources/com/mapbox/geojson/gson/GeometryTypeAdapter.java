package com.mapbox.geojson.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.CoordinateContainer;
import com.mapbox.geojson.Geometry;
import java.io.IOException;

public class GeometryTypeAdapter extends TypeAdapter<Geometry> {
    public Geometry read(JsonReader jsonReader) throws IOException {
        return null;
    }

    public void write(JsonWriter jsonWriter, Geometry geometry) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("type").value(geometry.type());
        if (geometry.bbox() != null) {
            jsonWriter.name("bbox").jsonValue(geometry.bbox().toJson());
        }
        if (geometry instanceof CoordinateContainer) {
            jsonWriter.name("coordinates").jsonValue(((CoordinateContainer) geometry).coordinates().toString());
        }
        jsonWriter.endObject();
    }
}
