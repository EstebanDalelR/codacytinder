
package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_FeatureCollection extends FeatureCollection {

  private final String type;
  private final BoundingBox bbox;
  private final List<Feature> features;

  $AutoValue_FeatureCollection(
      String type,
      @Nullable BoundingBox bbox,
      @Nullable List<Feature> features) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.bbox = bbox;
    this.features = features;
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
  public List<Feature> features() {
    return features;
  }

  @Override
  public String toString() {
    return "FeatureCollection{"
        + "type=" + type + ", "
        + "bbox=" + bbox + ", "
        + "features=" + features
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FeatureCollection) {
      FeatureCollection that = (FeatureCollection) o;
      return (this.type.equals(that.type()))
           && ((this.bbox == null) ? (that.bbox() == null) : this.bbox.equals(that.bbox()))
           && ((this.features == null) ? (that.features() == null) : this.features.equals(that.features()));
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
    h ^= (features == null) ? 0 : this.features.hashCode();
    return h;
  }

}
