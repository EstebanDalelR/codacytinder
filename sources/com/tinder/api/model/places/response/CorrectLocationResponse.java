package com.tinder.api.model.places.response;

import com.squareup.moshi.Json;
import com.tinder.api.model.places.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/model/places/response/CorrectLocationResponse;", "", "newPlace", "Lcom/tinder/api/model/places/Place;", "(Lcom/tinder/api/model/places/Place;)V", "getNewPlace", "()Lcom/tinder/api/model/places/Place;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class CorrectLocationResponse {
    @NotNull
    private final Place newPlace;

    @NotNull
    public static /* synthetic */ CorrectLocationResponse copy$default(CorrectLocationResponse correctLocationResponse, Place place, int i, Object obj) {
        if ((i & 1) != 0) {
            place = correctLocationResponse.newPlace;
        }
        return correctLocationResponse.copy(place);
    }

    @NotNull
    public final Place component1() {
        return this.newPlace;
    }

    @NotNull
    public final CorrectLocationResponse copy(@NotNull @Json(name = "new_place") Place place) {
        C2668g.b(place, "newPlace");
        return new CorrectLocationResponse(place);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CorrectLocationResponse) {
                if (C2668g.a(this.newPlace, ((CorrectLocationResponse) obj).newPlace)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Place place = this.newPlace;
        return place != null ? place.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CorrectLocationResponse(newPlace=");
        stringBuilder.append(this.newPlace);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public CorrectLocationResponse(@NotNull @Json(name = "new_place") Place place) {
        C2668g.b(place, "newPlace");
        this.newPlace = place;
    }

    @NotNull
    public final Place getNewPlace() {
        return this.newPlace;
    }
}
