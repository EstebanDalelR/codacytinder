package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_Point extends $AutoValue_Point {
  AutoValue_Point(String type, @Nullable BoundingBox bbox, List<Double> coordinates) {
    super(type, bbox, coordinates);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<Point> {
    private final TypeAdapter<String> string_adapter;
    private final TypeAdapter<BoundingBox> boundingBox_adapter;
    private final TypeAdapter<List<Double>> list__double_adapter;
    public GsonTypeAdapter(Gson gson) {
      this.string_adapter = gson.getAdapter(String.class);
      this.boundingBox_adapter = gson.getAdapter(BoundingBox.class);
      this.list__double_adapter = (TypeAdapter<List<Double>>) gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
    }
    @Override
    public void write(JsonWriter jsonWriter, Point object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("type");
      string_adapter.write(jsonWriter, object.type());
      jsonWriter.name("bbox");
      boundingBox_adapter.write(jsonWriter, object.bbox());
      jsonWriter.name("coordinates");
      list__double_adapter.write(jsonWriter, object.coordinates());
      jsonWriter.endObject();
    }
    @Override
    public Point read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      BoundingBox bbox = null;
      List<Double> coordinates = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "type": {
            type = string_adapter.read(jsonReader);
            break;
          }
          case "bbox": {
            bbox = boundingBox_adapter.read(jsonReader);
            break;
          }
          case "coordinates": {
            coordinates = list__double_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_Point(type, bbox, coordinates);
    }
  }
}
