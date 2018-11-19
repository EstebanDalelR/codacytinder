
package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Point extends Point {

  private final String type;
  private final BoundingBox bbox;
  private final List<Double> coordinates;

  $AutoValue_Point(
      String type,
      @Nullable BoundingBox bbox,
      List<Double> coordinates) {
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
  public List<Double> coordinates() {
    return coordinates;
  }

  @Override
  public String toString() {
    return "Point{"
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
    if (o instanceof Point) {
      Point that = (Point) o;
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
