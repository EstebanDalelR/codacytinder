package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Polygon extends C$AutoValue_Polygon {

    public static final class GsonTypeAdapter extends TypeAdapter<Polygon> {
        private final TypeAdapter<BoundingBox> boundingBox_adapter;
        private final TypeAdapter<List<List<Point>>> list__list__point_adapter;
        private final TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.string_adapter = gson.getAdapter(String.class);
            this.boundingBox_adapter = gson.getAdapter(BoundingBox.class);
            Type[] typeArr = new Type[1];
            typeArr[0] = TypeToken.getParameterized(List.class, Point.class).getType();
            this.list__list__point_adapter = gson.getAdapter(TypeToken.getParameterized(List.class, typeArr));
        }

        public void write(JsonWriter jsonWriter, Polygon polygon) throws IOException {
            if (polygon == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            this.string_adapter.write(jsonWriter, polygon.type());
            jsonWriter.name("bbox");
            this.boundingBox_adapter.write(jsonWriter, polygon.bbox());
            jsonWriter.name("coordinates");
            this.list__list__point_adapter.write(jsonWriter, polygon.coordinates());
            jsonWriter.endObject();
        }

        public Polygon read(JsonReader jsonReader) throws IOException {
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
                            if (hashCode == 1871919611) {
                                if (nextName.equals("coordinates")) {
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
                            list = (List) this.list__list__point_adapter.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_Polygon(str, boundingBox, list);
        }
    }

    AutoValue_Polygon(String str, @Nullable BoundingBox boundingBox, @Nullable List<List<Point>> list) {
        super(str, boundingBox, list);
    }
}
