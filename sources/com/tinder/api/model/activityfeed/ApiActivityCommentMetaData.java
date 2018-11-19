package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityCommentMetaData;", "", "carouselItemId", "", "(Ljava/lang/String;)V", "getCarouselItemId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityCommentMetaData {
    @Nullable
    private final String carouselItemId;

    @NotNull
    public static /* synthetic */ ApiActivityCommentMetaData copy$default(ApiActivityCommentMetaData apiActivityCommentMetaData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityCommentMetaData.carouselItemId;
        }
        return apiActivityCommentMetaData.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.carouselItemId;
    }

    @NotNull
    public final ApiActivityCommentMetaData copy(@Nullable String str) {
        return new ApiActivityCommentMetaData(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityCommentMetaData) {
                if (C2668g.a(this.carouselItemId, ((ApiActivityCommentMetaData) obj).carouselItemId)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.carouselItemId;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityCommentMetaData(carouselItemId=");
        stringBuilder.append(this.carouselItemId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityCommentMetaData(@Nullable String str) {
        this.carouselItemId = str;
    }

    @Nullable
    public final String getCarouselItemId() {
        return this.carouselItemId;
    }
}
