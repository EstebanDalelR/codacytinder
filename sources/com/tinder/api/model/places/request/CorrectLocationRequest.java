package com.tinder.api.model.places.request;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/api/model/places/request/CorrectLocationRequest;", "", "newPlaceId", "", "oldPlaceId", "(JJ)V", "getNewPlaceId", "()J", "getOldPlaceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class CorrectLocationRequest {
    private final long newPlaceId;
    private final long oldPlaceId;

    @NotNull
    public static /* synthetic */ CorrectLocationRequest copy$default(CorrectLocationRequest correctLocationRequest, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = correctLocationRequest.newPlaceId;
        }
        if ((i & 2) != 0) {
            j2 = correctLocationRequest.oldPlaceId;
        }
        return correctLocationRequest.copy(j, j2);
    }

    public final long component1() {
        return this.newPlaceId;
    }

    public final long component2() {
        return this.oldPlaceId;
    }

    @NotNull
    public final CorrectLocationRequest copy(@Json(name = "new_place_id") long j, @Json(name = "old_place_id") long j2) {
        return new CorrectLocationRequest(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CorrectLocationRequest) {
            CorrectLocationRequest correctLocationRequest = (CorrectLocationRequest) obj;
            if ((this.newPlaceId == correctLocationRequest.newPlaceId ? 1 : null) != null) {
                if ((this.oldPlaceId == correctLocationRequest.oldPlaceId ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.newPlaceId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.oldPlaceId;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CorrectLocationRequest(newPlaceId=");
        stringBuilder.append(this.newPlaceId);
        stringBuilder.append(", oldPlaceId=");
        stringBuilder.append(this.oldPlaceId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public CorrectLocationRequest(@Json(name = "new_place_id") long j, @Json(name = "old_place_id") long j2) {
        this.newPlaceId = j;
        this.oldPlaceId = j2;
    }

    public final long getNewPlaceId() {
        return this.newPlaceId;
    }

    public final long getOldPlaceId() {
        return this.oldPlaceId;
    }
}
