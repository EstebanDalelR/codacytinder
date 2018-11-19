package com.tinder.api.model.updates;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.updates.Updates.Places;

/* renamed from: com.tinder.api.model.updates.$AutoValue_Updates_Places */
abstract class C$AutoValue_Updates_Places extends Places {
    private final Boolean hasNew;

    C$AutoValue_Updates_Places(@Nullable Boolean bool) {
        this.hasNew = bool;
    }

    @Nullable
    @Json(name = "has_new")
    public Boolean hasNew() {
        return this.hasNew;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Places{hasNew=");
        stringBuilder.append(this.hasNew);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Places)) {
            return false;
        }
        Places places = (Places) obj;
        if (this.hasNew != null) {
            z = this.hasNew.equals(places.hasNew());
        } else if (places.hasNew() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.hasNew == null ? 0 : this.hasNew.hashCode()) ^ 1000003;
    }
}
