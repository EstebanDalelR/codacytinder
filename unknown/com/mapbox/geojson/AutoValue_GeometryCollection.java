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
final class AutoValue_GeometryCollection extends $AutoValue_GeometryCollection {
  AutoValue_GeometryCollection(String type, @Nullable BoundingBox bbox, List<Geometry> geometries) {
    super(type, bbox, geometries);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<GeometryCollection> {
    private final TypeAdapter<String> string_adapter;
    private final TypeAdapter<BoundingBox> boundingBox_adapter;
    private final TypeAdapter<List<Geometry>> list__geometry_adapter;
    public GsonTypeAdapter(Gson gson) {
      this.string_adapter = gson.getAdapter(String.class);
      this.boundingBox_adapter = gson.getAdapter(BoundingBox.class);
      this.list__geometry_adapter = (TypeAdapter<List<Geometry>>) gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
    }
    @Override
    public void write(JsonWriter jsonWriter, GeometryCollection object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("type");
      string_adapter.write(jsonWriter, object.type());
      jsonWriter.name("bbox");
      boundingBox_adapter.write(jsonWriter, object.bbox());
      jsonWriter.name("geometries");
      list__geometry_adapter.write(jsonWriter, object.geometries());
      jsonWriter.endObject();
    }
    @Override
    public GeometryCollection read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      BoundingBox bbox = null;
      List<Geometry> geometries = null;
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
          case "geometries": {
            geometries = list__geometry_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_GeometryCollection(type, bbox, geometries);
    }
  }
}
