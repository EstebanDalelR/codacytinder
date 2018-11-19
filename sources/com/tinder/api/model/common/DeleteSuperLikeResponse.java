package com.tinder.api.model.common;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/api/model/common/DeleteSuperLikeResponse;", "", "status", "", "superLikes", "Lcom/tinder/api/model/common/SuperLikes;", "(ILcom/tinder/api/model/common/SuperLikes;)V", "getStatus", "()I", "getSuperLikes", "()Lcom/tinder/api/model/common/SuperLikes;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class DeleteSuperLikeResponse {
    private final int status;
    @NotNull
    private final SuperLikes superLikes;

    @NotNull
    public static /* synthetic */ DeleteSuperLikeResponse copy$default(DeleteSuperLikeResponse deleteSuperLikeResponse, int i, SuperLikes superLikes, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deleteSuperLikeResponse.status;
        }
        if ((i2 & 2) != 0) {
            superLikes = deleteSuperLikeResponse.superLikes;
        }
        return deleteSuperLikeResponse.copy(i, superLikes);
    }

    public final int component1() {
        return this.status;
    }

    @NotNull
    public final SuperLikes component2() {
        return this.superLikes;
    }

    @NotNull
    public final DeleteSuperLikeResponse copy(int i, @NotNull @Json(name = "super_likes") SuperLikes superLikes) {
        C2668g.b(superLikes, "superLikes");
        return new DeleteSuperLikeResponse(i, superLikes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeleteSuperLikeResponse) {
            DeleteSuperLikeResponse deleteSuperLikeResponse = (DeleteSuperLikeResponse) obj;
            return (this.status == deleteSuperLikeResponse.status ? 1 : null) != null && C2668g.a(this.superLikes, deleteSuperLikeResponse.superLikes);
        }
    }

    public int hashCode() {
        int i = this.status * 31;
        SuperLikes superLikes = this.superLikes;
        return i + (superLikes != null ? superLikes.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeleteSuperLikeResponse(status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", superLikes=");
        stringBuilder.append(this.superLikes);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public DeleteSuperLikeResponse(int i, @NotNull @Json(name = "super_likes") SuperLikes superLikes) {
        C2668g.b(superLikes, "superLikes");
        this.status = i;
        this.superLikes = superLikes;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final SuperLikes getSuperLikes() {
        return this.superLikes;
    }
}
