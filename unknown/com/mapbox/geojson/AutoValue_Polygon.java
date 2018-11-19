package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_Polygon extends $AutoValue_Polygon {
  AutoValue_Polygon(String type, @Nullable BoundingBox bbox,
      @Nullable List<List<Point>> coordinates) {
    super(type, bbox, coordinates);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<Polygon> {
    private final TypeAdapter<String> string_adapter;
    private final TypeAdapter<BoundingBox> boundingBox_adapter;
    private final TypeAdapter<List<List<Point>>> list__list__point_adapter;
    public GsonTypeAdapter(Gson gson) {
      this.string_adapter = gson.getAdapter(String.class);
      this.boundingBox_adapter = gson.getAdapter(BoundingBox.class);
      this.list__list__point_adapter = (TypeAdapter<List<List<Point>>>) gson.getAdapter(TypeToken.getParameterized(List.class, TypeToken.getParameterized(List.class, Point.class).getType()));
    }
    @Override
    public void write(JsonWriter jsonWriter, Polygon object) throws IOException {
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
      list__list__point_adapter.write(jsonWriter, object.coordinates());
      jsonWriter.endObject();
    }
    @Override
    public Polygon read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      BoundingBox bbox = null;
      List<List<Point>> coordinates = null;
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
            coordinates = list__list__point_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_Polygon(type, bbox, coordinates);
    }
  }
}
