package com.tinder.api.model.places.response;

import com.squareup.moshi.Json;
import com.tinder.api.model.places.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/model/places/response/PlacesResponse;", "", "places", "", "Lcom/tinder/api/model/places/Place;", "refreshTime", "", "(Ljava/util/List;J)V", "getPlaces", "()Ljava/util/List;", "getRefreshTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesResponse {
    @NotNull
    private final List<Place> places;
    private final long refreshTime;

    @NotNull
    public static /* synthetic */ PlacesResponse copy$default(PlacesResponse placesResponse, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = placesResponse.places;
        }
        if ((i & 2) != 0) {
            j = placesResponse.refreshTime;
        }
        return placesResponse.copy(list, j);
    }

    @NotNull
    public final List<Place> component1() {
        return this.places;
    }

    public final long component2() {
        return this.refreshTime;
    }

    @NotNull
    public final PlacesResponse copy(@NotNull List<Place> list, @Json(name = "refresh_time") long j) {
        C2668g.b(list, "places");
        return new PlacesResponse(list, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlacesResponse) {
            PlacesResponse placesResponse = (PlacesResponse) obj;
            if (C2668g.a(this.places, placesResponse.places)) {
                if ((this.refreshTime == placesResponse.refreshTime ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List list = this.places;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        long j = this.refreshTime;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesResponse(places=");
        stringBuilder.append(this.places);
        stringBuilder.append(", refreshTime=");
        stringBuilder.append(this.refreshTime);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlacesResponse(@NotNull List<Place> list, @Json(name = "refresh_time") long j) {
        C2668g.b(list, "places");
        this.places = list;
        this.refreshTime = j;
    }

    @NotNull
    public final List<Place> getPlaces() {
        return this.places;
    }

    public final long getRefreshTime() {
        return this.refreshTime;
    }
}
