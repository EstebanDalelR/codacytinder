package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

final class AutoValue_Feature extends C$AutoValue_Feature {

    public static final class GsonTypeAdapter extends TypeAdapter<Feature> {
        private final TypeAdapter<BoundingBox> boundingBox_adapter;
        private final TypeAdapter<Geometry> geometry_adapter;
        private final TypeAdapter<JsonObject> jsonObject_adapter;
        private final TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.string_adapter = gson.getAdapter(String.class);
            this.boundingBox_adapter = gson.getAdapter(BoundingBox.class);
            this.geometry_adapter = gson.getAdapter(Geometry.class);
            this.jsonObject_adapter = gson.getAdapter(JsonObject.class);
        }

        public void write(JsonWriter jsonWriter, Feature feature) throws IOException {
            if (feature == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            this.string_adapter.write(jsonWriter, feature.type());
            jsonWriter.name("bbox");
            this.boundingBox_adapter.write(jsonWriter, feature.bbox());
            jsonWriter.name("id");
            this.string_adapter.write(jsonWriter, feature.id());
            jsonWriter.name("geometry");
            this.geometry_adapter.write(jsonWriter, feature.geometry());
            jsonWriter.name("properties");
            this.jsonObject_adapter.write(jsonWriter, feature.properties());
            jsonWriter.endObject();
        }

        public Feature read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            BoundingBox boundingBox = str;
            String str2 = boundingBox;
            Geometry geometry = str2;
            JsonObject jsonObject = geometry;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    Object obj = -1;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -926053069) {
                        if (hashCode != 3355) {
                            if (hashCode != 3017257) {
                                if (hashCode != 3575610) {
                                    if (hashCode == 1846020210) {
                                        if (nextName.equals("geometry")) {
                                            obj = 3;
                                        }
                                    }
                                } else if (nextName.equals("type")) {
                                    obj = null;
                                }
                            } else if (nextName.equals("bbox")) {
                                obj = 1;
                            }
                        } else if (nextName.equals("id")) {
                            obj = 2;
                        }
                    } else if (nextName.equals("properties")) {
                        obj = 4;
                    }
                    switch (obj) {
                        case null:
                            str = (String) this.string_adapter.read(jsonReader);
                            break;
                        case 1:
                            boundingBox = (BoundingBox) this.boundingBox_adapter.read(jsonReader);
                            break;
                        case 2:
                            str2 = (String) this.string_adapter.read(jsonReader);
                            break;
                        case 3:
                            geometry = (Geometry) this.geometry_adapter.read(jsonReader);
                            break;
                        case 4:
                            jsonObject = (JsonObject) this.jsonObject_adapter.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_Feature(str, boundingBox, str2, geometry, jsonObject);
        }
    }

    AutoValue_Feature(String str, @Nullable BoundingBox boundingBox, @Nullable String str2, @Nullable Geometry geometry, @Nullable JsonObject jsonObject) {
        super(str, boundingBox, str2, geometry, jsonObject);
    }
}
