package com.tinder.api.model.meta;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.meta.Meta.PlacesConfig;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta_PlacesConfig */
abstract class C$AutoValue_Meta_PlacesConfig extends PlacesConfig {
    private final Boolean isAvailable;

    C$AutoValue_Meta_PlacesConfig(@Nullable Boolean bool) {
        this.isAvailable = bool;
    }

    @Nullable
    @Json(name = "available")
    public Boolean isAvailable() {
        return this.isAvailable;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesConfig{isAvailable=");
        stringBuilder.append(this.isAvailable);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlacesConfig)) {
            return false;
        }
        PlacesConfig placesConfig = (PlacesConfig) obj;
        if (this.isAvailable != null) {
            z = this.isAvailable.equals(placesConfig.isAvailable());
        } else if (placesConfig.isAvailable() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.isAvailable == null ? 0 : this.isAvailable.hashCode()) ^ 1000003;
    }
}
