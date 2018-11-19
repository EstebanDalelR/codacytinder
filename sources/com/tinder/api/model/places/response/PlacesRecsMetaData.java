package com.tinder.api.model.places.response;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/model/places/response/PlacesRecsMetaData;", "", "totalVisitorCount", "", "newVisitorCount", "nextCursor", "", "(IILjava/lang/String;)V", "getNewVisitorCount", "()I", "getNextCursor", "()Ljava/lang/String;", "getTotalVisitorCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesRecsMetaData {
    private final int newVisitorCount;
    @Nullable
    private final String nextCursor;
    private final int totalVisitorCount;

    @NotNull
    public static /* synthetic */ PlacesRecsMetaData copy$default(PlacesRecsMetaData placesRecsMetaData, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = placesRecsMetaData.totalVisitorCount;
        }
        if ((i3 & 2) != 0) {
            i2 = placesRecsMetaData.newVisitorCount;
        }
        if ((i3 & 4) != 0) {
            str = placesRecsMetaData.nextCursor;
        }
        return placesRecsMetaData.copy(i, i2, str);
    }

    public final int component1() {
        return this.totalVisitorCount;
    }

    public final int component2() {
        return this.newVisitorCount;
    }

    @Nullable
    public final String component3() {
        return this.nextCursor;
    }

    @NotNull
    public final PlacesRecsMetaData copy(@Json(name = "total_visitor_count") int i, @Json(name = "new_visitor_count") int i2, @Nullable @Json(name = "next_cursor") String str) {
        return new PlacesRecsMetaData(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlacesRecsMetaData) {
            PlacesRecsMetaData placesRecsMetaData = (PlacesRecsMetaData) obj;
            if ((this.totalVisitorCount == placesRecsMetaData.totalVisitorCount ? 1 : null) != null) {
                return (this.newVisitorCount == placesRecsMetaData.newVisitorCount ? 1 : null) != null && C2668g.a(this.nextCursor, placesRecsMetaData.nextCursor);
            }
        }
    }

    public int hashCode() {
        int i = ((this.totalVisitorCount * 31) + this.newVisitorCount) * 31;
        String str = this.nextCursor;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesRecsMetaData(totalVisitorCount=");
        stringBuilder.append(this.totalVisitorCount);
        stringBuilder.append(", newVisitorCount=");
        stringBuilder.append(this.newVisitorCount);
        stringBuilder.append(", nextCursor=");
        stringBuilder.append(this.nextCursor);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlacesRecsMetaData(@Json(name = "total_visitor_count") int i, @Json(name = "new_visitor_count") int i2, @Nullable @Json(name = "next_cursor") String str) {
        this.totalVisitorCount = i;
        this.newVisitorCount = i2;
        this.nextCursor = str;
    }

    public final int getTotalVisitorCount() {
        return this.totalVisitorCount;
    }

    public final int getNewVisitorCount() {
        return this.newVisitorCount;
    }

    @Nullable
    public final String getNextCursor() {
        return this.nextCursor;
    }
}
