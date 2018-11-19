package com.mapbox.geojson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_BoundingBox extends $AutoValue_BoundingBox {
  AutoValue_BoundingBox(Point southwest, Point northeast) {
    super(southwest, northeast);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<BoundingBox> {
    private final TypeAdapter<Point> point_adapter;
    public GsonTypeAdapter(Gson gson) {
      this.point_adapter = gson.getAdapter(Point.class);
    }
    @Override
    public void write(JsonWriter jsonWriter, BoundingBox object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("southwest");
      point_adapter.write(jsonWriter, object.southwest());
      jsonWriter.name("northeast");
      point_adapter.write(jsonWriter, object.northeast());
      jsonWriter.endObject();
    }
    @Override
    public BoundingBox read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      Point southwest = null;
      Point northeast = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "southwest": {
            southwest = point_adapter.read(jsonReader);
            break;
          }
          case "northeast": {
            northeast = point_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_BoundingBox(southwest, northeast);
    }
  }
}
