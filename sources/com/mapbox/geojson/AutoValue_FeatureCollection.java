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

final class AutoValue_FeatureCollection extends C$AutoValue_FeatureCollection {

    public static final class GsonTypeAdapter extends TypeAdapter<FeatureCollection> {
        private final TypeAdapter<BoundingBox> boundingBox_adapter;
        private final TypeAdapter<List<Feature>> list__feature_adapter;
        private final TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.string_adapter = gson.getAdapter(String.class);
            this.boundingBox_adapter = gson.getAdapter(BoundingBox.class);
            this.list__feature_adapter = gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
        }

        public void write(JsonWriter jsonWriter, FeatureCollection featureCollection) throws IOException {
            if (featureCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            this.string_adapter.write(jsonWriter, featureCollection.type());
            jsonWriter.name("bbox");
            this.boundingBox_adapter.write(jsonWriter, featureCollection.bbox());
            jsonWriter.name("features");
            this.list__feature_adapter.write(jsonWriter, featureCollection.features());
            jsonWriter.endObject();
        }

        public FeatureCollection read(JsonReader jsonReader) throws IOException {
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
                    if (hashCode != -290659267) {
                        if (hashCode != 3017257) {
                            if (hashCode == 3575610) {
                                if (nextName.equals("type")) {
                                    obj = null;
                                }
                            }
                        } else if (nextName.equals("bbox")) {
                            obj = 1;
                        }
                    } else if (nextName.equals("features")) {
                        obj = 2;
                    }
                    switch (obj) {
                        case null:
                            str = (String) this.string_adapter.read(jsonReader);
                            break;
                        case 1:
                            boundingBox = (BoundingBox) this.boundingBox_adapter.read(jsonReader);
                            break;
                        case 2:
                            list = (List) this.list__feature_adapter.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_FeatureCollection(str, boundingBox, list);
        }
    }

    AutoValue_FeatureCollection(String str, @Nullable BoundingBox boundingBox, @Nullable List<Feature> list) {
        super(str, boundingBox, list);
    }
}
