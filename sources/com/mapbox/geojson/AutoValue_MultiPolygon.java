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

final class AutoValue_MultiPolygon extends C$AutoValue_MultiPolygon {

    public static final class GsonTypeAdapter extends TypeAdapter<MultiPolygon> {
        private final TypeAdapter<BoundingBox> boundingBox_adapter;
        private final TypeAdapter<List<List<List<Point>>>> list__list__list__point_adapter;
        private final TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.string_adapter = gson.getAdapter(String.class);
            this.boundingBox_adapter = gson.getAdapter(BoundingBox.class);
            Type[] typeArr = new Type[1];
            Type[] typeArr2 = new Type[1];
            typeArr2[0] = TypeToken.getParameterized(List.class, Point.class).getType();
            typeArr[0] = TypeToken.getParameterized(List.class, typeArr2).getType();
            this.list__list__list__point_adapter = gson.getAdapter(TypeToken.getParameterized(List.class, typeArr));
        }

        public void write(JsonWriter jsonWriter, MultiPolygon multiPolygon) throws IOException {
            if (multiPolygon == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            this.string_adapter.write(jsonWriter, multiPolygon.type());
            jsonWriter.name("bbox");
            this.boundingBox_adapter.write(jsonWriter, multiPolygon.bbox());
            jsonWriter.name("coordinates");
            this.list__list__list__point_adapter.write(jsonWriter, multiPolygon.coordinates());
            jsonWriter.endObject();
        }

        public MultiPolygon read(JsonReader jsonReader) throws IOException {
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
                            list = (List) this.list__list__list__point_adapter.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_MultiPolygon(str, boundingBox, list);
        }
    }

    AutoValue_MultiPolygon(String str, @Nullable BoundingBox boundingBox, List<List<List<Point>>> list) {
        super(str, boundingBox, list);
    }
}
