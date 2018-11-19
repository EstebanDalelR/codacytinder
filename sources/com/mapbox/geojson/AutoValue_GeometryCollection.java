package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

final class AutoValue_GeometryCollection extends C$AutoValue_GeometryCollection {

    public static final class GsonTypeAdapter extends TypeAdapter<GeometryCollection> {
        private final TypeAdapter<BoundingBox> boundingBox_adapter;
        private final TypeAdapter<List<Geometry>> list__geometry_adapter;
        private final TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.string_adapter = gson.getAdapter(String.class);
            this.boundingBox_adapter = gson.getAdapter(BoundingBox.class);
            this.list__geometry_adapter = gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
        }

        public void write(JsonWriter jsonWriter, GeometryCollection geometryCollection) throws IOException {
            if (geometryCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            this.string_adapter.write(jsonWriter, geometryCollection.type());
            jsonWriter.name("bbox");
            this.boundingBox_adapter.write(jsonWriter, geometryCollection.bbox());
            jsonWriter.name("geometries");
            this.list__geometry_adapter.write(jsonWriter, geometryCollection.geometries());
            jsonWriter.endObject();
        }

        public GeometryCollection read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BoundingBox boundingBox = null;
            List list = boundingBox;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    Object obj = -1;
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3017257) {
                        if (hashCode != 3575610) {
                            if (hashCode == 203916432) {
                                if (nextName.equals("geometries")) {
                                    obj = 2;
                                }
                            }
                        } else if (nextName.equals("type")) {
                            obj = null;
                        }
                    } else if (nextName.equals("bbox")) {
                        obj = 1;
                    }
                    switch (obj) {
                        case null:
                            str = (String) this.string_adapter.read(jsonReader);
                            break;
                        case 1:
                            boundingBox = (BoundingBox) this.boundingBox_adapter.read(jsonReader);
                            break;
                        case 2:
                            list = (List) this.list__geometry_adapter.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_GeometryCollection(str, boundingBox, list);
        }
    }

    AutoValue_GeometryCollection(String str, @Nullable BoundingBox boundingBox, List<Geometry> list) {
        super(str, boundingBox, list);
    }
}
