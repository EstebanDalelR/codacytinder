package com.tinder.api.model.places.response;

import com.squareup.moshi.Json;
import com.tinder.api.model.recs.Rec;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/model/places/response/PlacesRecsResponse;", "", "recs", "", "Lcom/tinder/api/model/recs/Rec;", "recsMetaData", "Lcom/tinder/api/model/places/response/PlacesRecsMetaData;", "(Ljava/util/List;Lcom/tinder/api/model/places/response/PlacesRecsMetaData;)V", "getRecs", "()Ljava/util/List;", "getRecsMetaData", "()Lcom/tinder/api/model/places/response/PlacesRecsMetaData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesRecsResponse {
    @NotNull
    private final List<Rec> recs;
    @NotNull
    private final PlacesRecsMetaData recsMetaData;

    @NotNull
    public static /* synthetic */ PlacesRecsResponse copy$default(PlacesRecsResponse placesRecsResponse, List list, PlacesRecsMetaData placesRecsMetaData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = placesRecsResponse.recs;
        }
        if ((i & 2) != 0) {
            placesRecsMetaData = placesRecsResponse.recsMetaData;
        }
        return placesRecsResponse.copy(list, placesRecsMetaData);
    }

    @NotNull
    public final List<Rec> component1() {
        return this.recs;
    }

    @NotNull
    public final PlacesRecsMetaData component2() {
        return this.recsMetaData;
    }

    @NotNull
    public final PlacesRecsResponse copy(@NotNull List<? extends Rec> list, @NotNull @Json(name = "recs_metadata") PlacesRecsMetaData placesRecsMetaData) {
        C2668g.b(list, "recs");
        C2668g.b(placesRecsMetaData, "recsMetaData");
        return new PlacesRecsResponse(list, placesRecsMetaData);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlacesRecsResponse) {
                PlacesRecsResponse placesRecsResponse = (PlacesRecsResponse) obj;
                if (C2668g.a(this.recs, placesRecsResponse.recs) && C2668g.a(this.recsMetaData, placesRecsResponse.recsMetaData)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.recs;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        PlacesRecsMetaData placesRecsMetaData = this.recsMetaData;
        if (placesRecsMetaData != null) {
            i = placesRecsMetaData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesRecsResponse(recs=");
        stringBuilder.append(this.recs);
        stringBuilder.append(", recsMetaData=");
        stringBuilder.append(this.recsMetaData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlacesRecsResponse(@NotNull List<? extends Rec> list, @NotNull @Json(name = "recs_metadata") PlacesRecsMetaData placesRecsMetaData) {
        C2668g.b(list, "recs");
        C2668g.b(placesRecsMetaData, "recsMetaData");
        this.recs = list;
        this.recsMetaData = placesRecsMetaData;
    }

    @NotNull
    public final List<Rec> getRecs() {
        return this.recs;
    }

    @NotNull
    public final PlacesRecsMetaData getRecsMetaData() {
        return this.recsMetaData;
    }
}
