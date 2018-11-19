package com.mapbox.geojson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

final class AutoValue_BoundingBox extends C$AutoValue_BoundingBox {

    public static final class GsonTypeAdapter extends TypeAdapter<BoundingBox> {
        private final TypeAdapter<Point> point_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.point_adapter = gson.getAdapter(Point.class);
        }

        public void write(JsonWriter jsonWriter, BoundingBox boundingBox) throws IOException {
            if (boundingBox == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("southwest");
            this.point_adapter.write(jsonWriter, boundingBox.southwest());
            jsonWriter.name("northeast");
            this.point_adapter.write(jsonWriter, boundingBox.northeast());
            jsonWriter.endObject();
        }

        public BoundingBox read(JsonReader jsonReader) throws IOException {
            Point point = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Point point2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    Object obj = -1;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1635992324) {
                        if (hashCode == 443261570) {
                            if (nextName.equals("northeast")) {
                                obj = 1;
                            }
                        }
                    } else if (nextName.equals("southwest")) {
                        obj = null;
                    }
                    switch (obj) {
                        case null:
                            point = (Point) this.point_adapter.read(jsonReader);
                            break;
                        case 1:
                            point2 = (Point) this.point_adapter.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_BoundingBox(point, point2);
        }
    }

    AutoValue_BoundingBox(Point point, Point point2) {
        super(point, point2);
    }
}
