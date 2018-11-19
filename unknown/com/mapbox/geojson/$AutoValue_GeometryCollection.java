
package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_GeometryCollection extends GeometryCollection {

  private final String type;
  private final BoundingBox bbox;
  private final List<Geometry> geometries;

  $AutoValue_GeometryCollection(
      String type,
      @Nullable BoundingBox bbox,
      List<Geometry> geometries) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.bbox = bbox;
    if (geometries == null) {
      throw new NullPointerException("Null geometries");
    }
    this.geometries = geometries;
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

  @NonNull
  @Override
  public List<Geometry> geometries() {
    return geometries;
  }

  @Override
  public String toString() {
    return "GeometryCollection{"
        + "type=" + type + ", "
        + "bbox=" + bbox + ", "
        + "geometries=" + geometries
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GeometryCollection) {
      GeometryCollection that = (GeometryCollection) o;
      return (this.type.equals(that.type()))
           && ((this.bbox == null) ? (that.bbox() == null) : this.bbox.equals(that.bbox()))
           && (this.geometries.equals(that.geometries()));
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
    h ^= this.geometries.hashCode();
    return h;
  }

}
