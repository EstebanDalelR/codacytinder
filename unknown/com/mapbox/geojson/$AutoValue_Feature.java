
package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonObject;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Feature extends Feature {

  private final String type;
  private final BoundingBox bbox;
  private final String id;
  private final Geometry geometry;
  private final JsonObject properties;

  $AutoValue_Feature(
      String type,
      @Nullable BoundingBox bbox,
      @Nullable String id,
      @Nullable Geometry geometry,
      @Nullable JsonObject properties) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.bbox = bbox;
    this.id = id;
    this.geometry = geometry;
    this.properties = properties;
  }

  @NonNull
  @Override
  public String type() {
    return type;
  }

  @Nullable
  @Override
  public BoundingBox bbox() {
    return bbox;
  }

  @Nullable
  @Override
  public String id() {
    return id;
  }

  @Nullable
  @Override
  public Geometry geometry() {
    return geometry;
  }

  @Nullable
  @Override
  public JsonObject properties() {
    return properties;
  }

  @Override
  public String toString() {
    return "Feature{"
        + "type=" + type + ", "
        + "bbox=" + bbox + ", "
        + "id=" + id + ", "
        + "geometry=" + geometry + ", "
        + "properties=" + properties
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Feature) {
      Feature that = (Feature) o;
      return (this.type.equals(that.type()))
           && ((this.bbox == null) ? (that.bbox() == null) : this.bbox.equals(that.bbox()))
           && ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && ((this.geometry == null) ? (that.geometry() == null) : this.geometry.equals(that.geometry()))
           && ((this.properties == null) ? (that.properties() == null) : this.properties.equals(that.properties()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= (bbox == null) ? 0 : this.bbox.hashCode();
    h *= 1000003;
    h ^= (id == null) ? 0 : this.id.hashCode();
    h *= 1000003;
    h ^= (geometry == null) ? 0 : this.geometry.hashCode();
    h *= 1000003;
    h ^= (properties == null) ? 0 : this.properties.hashCode();
    return h;
  }

}
