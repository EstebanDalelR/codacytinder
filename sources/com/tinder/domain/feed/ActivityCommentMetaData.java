package com.tinder.domain.feed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/domain/feed/ActivityCommentMetaData;", "", "carouselItemId", "", "(Ljava/lang/String;)V", "getCarouselItemId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityCommentMetaData {
    @NotNull
    private final String carouselItemId;

    @NotNull
    public static /* synthetic */ ActivityCommentMetaData copy$default(ActivityCommentMetaData activityCommentMetaData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityCommentMetaData.carouselItemId;
        }
        return activityCommentMetaData.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.carouselItemId;
    }

    @NotNull
    public final ActivityCommentMetaData copy(@NotNull String str) {
        C2668g.b(str, "carouselItemId");
        return new ActivityCommentMetaData(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityCommentMetaData) {
                if (C2668g.a(this.carouselItemId, ((ActivityCommentMetaData) obj).carouselItemId)) {
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
        stringBuilder.append("ActivityCommentMetaData(carouselItemId=");
        stringBuilder.append(this.carouselItemId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityCommentMetaData(@NotNull String str) {
        C2668g.b(str, "carouselItemId");
        this.carouselItemId = str;
    }

    @NotNull
    public final String getCarouselItemId() {
        return this.carouselItemId;
    }
}
