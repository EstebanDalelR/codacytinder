
package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_MultiPolygon extends MultiPolygon {

  private final String type;
  private final BoundingBox bbox;
  private final List<List<List<Point>>> coordinates;

  $AutoValue_MultiPolygon(
      String type,
      @Nullable BoundingBox bbox,
      List<List<List<Point>>> coordinates) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.bbox = bbox;
    if (coordinates == null) {
      throw new NullPointerException("Null coordinates");
    }
    this.coordinates = coordinates;
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
  public List<List<List<Point>>> coordinates() {
    return coordinates;
  }

  @Override
  public String toString() {
    return "MultiPolygon{"
        + "type=" + type + ", "
        + "bbox=" + bbox + ", "
        + "coordinates=" + coordinates
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MultiPolygon) {
      MultiPolygon that = (MultiPolygon) o;
      return (this.type.equals(that.type()))
           && ((this.bbox == null) ? (that.bbox() == null) : this.bbox.equals(that.bbox()))
           && (this.coordinates.equals(that.coordinates()));
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
    h ^= this.coordinates.hashCode();
    return h;
  }

}
