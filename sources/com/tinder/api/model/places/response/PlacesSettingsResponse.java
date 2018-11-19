package com.tinder.api.model.places.response;

import com.tinder.api.model.profile.PlacesSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/model/places/response/PlacesSettingsResponse;", "", "places", "Lcom/tinder/api/model/profile/PlacesSettings;", "(Lcom/tinder/api/model/profile/PlacesSettings;)V", "getPlaces", "()Lcom/tinder/api/model/profile/PlacesSettings;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesSettingsResponse {
    @NotNull
    private final PlacesSettings places;

    @NotNull
    public static /* synthetic */ PlacesSettingsResponse copy$default(PlacesSettingsResponse placesSettingsResponse, PlacesSettings placesSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            placesSettings = placesSettingsResponse.places;
        }
        return placesSettingsResponse.copy(placesSettings);
    }

    @NotNull
    public final PlacesSettings component1() {
        return this.places;
    }

    @NotNull
    public final PlacesSettingsResponse copy(@NotNull PlacesSettings placesSettings) {
        C2668g.b(placesSettings, "places");
        return new PlacesSettingsResponse(placesSettings);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlacesSettingsResponse) {
                if (C2668g.a(this.places, ((PlacesSettingsResponse) obj).places)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        PlacesSettings placesSettings = this.places;
        return placesSettings != null ? placesSettings.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesSettingsResponse(places=");
        stringBuilder.append(this.places);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlacesSettingsResponse(@NotNull PlacesSettings placesSettings) {
        C2668g.b(placesSettings, "places");
        this.places = placesSettings;
    }

    @NotNull
    public final PlacesSettings getPlaces() {
        return this.places;
    }
}
