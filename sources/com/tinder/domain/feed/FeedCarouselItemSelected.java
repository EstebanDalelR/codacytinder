package com.tinder.domain.feed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "", "feedItemId", "", "mediaItemId", "carouselPosition", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCarouselPosition", "()I", "getFeedItemId", "()Ljava/lang/String;", "getMediaItemId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FeedCarouselItemSelected {
    private final int carouselPosition;
    @NotNull
    private final String feedItemId;
    @NotNull
    private final String mediaItemId;

    @NotNull
    public static /* synthetic */ FeedCarouselItemSelected copy$default(FeedCarouselItemSelected feedCarouselItemSelected, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedCarouselItemSelected.feedItemId;
        }
        if ((i2 & 2) != 0) {
            str2 = feedCarouselItemSelected.mediaItemId;
        }
        if ((i2 & 4) != 0) {
            i = feedCarouselItemSelected.carouselPosition;
        }
        return feedCarouselItemSelected.copy(str, str2, i);
    }

    @NotNull
    public final String component1() {
        return this.feedItemId;
    }

    @NotNull
    public final String component2() {
        return this.mediaItemId;
    }

    public final int component3() {
        return this.carouselPosition;
    }

    @NotNull
    public final FeedCarouselItemSelected copy(@NotNull String str, @NotNull String str2, int i) {
        C2668g.b(str, "feedItemId");
        C2668g.b(str2, "mediaItemId");
        return new FeedCarouselItemSelected(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeedCarouselItemSelected) {
            FeedCarouselItemSelected feedCarouselItemSelected = (FeedCarouselItemSelected) obj;
            if (C2668g.a(this.feedItemId, feedCarouselItemSelected.feedItemId) && C2668g.a(this.mediaItemId, feedCarouselItemSelected.mediaItemId)) {
                if ((this.carouselPosition == feedCarouselItemSelected.carouselPosition ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.feedItemId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mediaItemId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.carouselPosition;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedCarouselItemSelected(feedItemId=");
        stringBuilder.append(this.feedItemId);
        stringBuilder.append(", mediaItemId=");
        stringBuilder.append(this.mediaItemId);
        stringBuilder.append(", carouselPosition=");
        stringBuilder.append(this.carouselPosition);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedCarouselItemSelected(@NotNull String str, @NotNull String str2, int i) {
        C2668g.b(str, "feedItemId");
        C2668g.b(str2, "mediaItemId");
        this.feedItemId = str;
        this.mediaItemId = str2;
        this.carouselPosition = i;
    }

    @NotNull
    public final String getFeedItemId() {
        return this.feedItemId;
    }

    @NotNull
    public final String getMediaItemId() {
        return this.mediaItemId;
    }

    public final int getCarouselPosition() {
        return this.carouselPosition;
    }
}
