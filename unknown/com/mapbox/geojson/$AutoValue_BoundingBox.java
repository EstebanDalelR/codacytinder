
package com.mapbox.geojson;

import android.support.annotation.NonNull;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_BoundingBox extends BoundingBox {

  private final Point southwest;
  private final Point northeast;

  $AutoValue_BoundingBox(
      Point southwest,
      Point northeast) {
    if (southwest == null) {
      throw new NullPointerException("Null southwest");
    }
    this.southwest = southwest;
    if (northeast == null) {
      throw new NullPointerException("Null northeast");
    }
    this.northeast = northeast;
  }

  @NonNull
  @Override
  public Point southwest() {
    return southwest;
  }

  @NonNull
  @Override
  public Point northeast() {
    return northeast;
  }

  @Override
  public String toString() {
    return "BoundingBox{"
        + "southwest=" + southwest + ", "
        + "northeast=" + northeast
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BoundingBox) {
      BoundingBox that = (BoundingBox) o;
      return (this.southwest.equals(that.southwest()))
           && (this.northeast.equals(that.northeast()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.southwest.hashCode();
    h *= 1000003;
    h ^= this.northeast.hashCode();
    return h;
  }

}
