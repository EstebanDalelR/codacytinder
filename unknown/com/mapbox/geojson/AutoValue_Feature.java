package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
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
final class AutoValue_Feature extends $AutoValue_Feature {
  AutoValue_Feature(String type, @Nullable BoundingBox bbox, @Nullable String id,
      @Nullable Geometry geometry, @Nullable JsonObject properties) {
    super(type, bbox, id, geometry, properties);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<Feature> {
    private final TypeAdapter<String> string_adapter;
    private final TypeAdapter<BoundingBox> boundingBox_adapter;
    private final TypeAdapter<Geometry> geometry_adapter;
    private final TypeAdapter<JsonObject> jsonObject_adapter;
    public GsonTypeAdapter(Gson gson) {
      this.string_adapter = gson.getAdapter(String.class);
      this.boundingBox_adapter = gson.getAdapter(BoundingBox.class);
      this.geometry_adapter = gson.getAdapter(Geometry.class);
      this.jsonObject_adapter = gson.getAdapter(JsonObject.class);
    }
    @Override
    public void write(JsonWriter jsonWriter, Feature object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("type");
      string_adapter.write(jsonWriter, object.type());
      jsonWriter.name("bbox");
      boundingBox_adapter.write(jsonWriter, object.bbox());
      jsonWriter.name("id");
      string_adapter.write(jsonWriter, object.id());
      jsonWriter.name("geometry");
      geometry_adapter.write(jsonWriter, object.geometry());
      jsonWriter.name("properties");
      jsonObject_adapter.write(jsonWriter, object.properties());
      jsonWriter.endObject();
    }
    @Override
    public Feature read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      BoundingBox bbox = null;
      String id = null;
      Geometry geometry = null;
      JsonObject properties = null;
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
          case "id": {
            id = string_adapter.read(jsonReader);
            break;
          }
          case "geometry": {
            geometry = geometry_adapter.read(jsonReader);
            break;
          }
          case "properties": {
            properties = jsonObject_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_Feature(type, bbox, id, geometry, properties);
    }
  }
}
