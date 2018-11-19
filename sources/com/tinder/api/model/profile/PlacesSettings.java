package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/api/model/profile/PlacesSettings;", "", "enabled", "", "(Ljava/lang/Boolean;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/tinder/api/model/profile/PlacesSettings;", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesSettings {
    @Nullable
    private final Boolean enabled;

    @NotNull
    public static /* synthetic */ PlacesSettings copy$default(PlacesSettings placesSettings, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = placesSettings.enabled;
        }
        return placesSettings.copy(bool);
    }

    @Nullable
    public final Boolean component1() {
        return this.enabled;
    }

    @NotNull
    public final PlacesSettings copy(@Nullable @Json(name = "enabled") Boolean bool) {
        return new PlacesSettings(bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlacesSettings) {
                if (C2668g.a(this.enabled, ((PlacesSettings) obj).enabled)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        return bool != null ? bool.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesSettings(enabled=");
        stringBuilder.append(this.enabled);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlacesSettings(@Nullable @Json(name = "enabled") Boolean bool) {
        this.enabled = bool;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }
}
