package com.tinder.domain.feed;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/feed/FeedPositionRange;", "", "minRangePosition", "", "maxRangePosition", "(II)V", "getMaxRangePosition", "()I", "getMinRangePosition", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FeedPositionRange {
    public static final Companion Companion = new Companion();
    public static final int FEED_RANGE_DEFAULT_MAX = -1;
    public static final int FEED_RANGE_DEFAULT_MIN = -1;
    private static final FeedPositionRange defaultRange = new FeedPositionRange(-1, -1);
    private final int maxRangePosition;
    private final int minRangePosition;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/feed/FeedPositionRange$Companion;", "", "()V", "FEED_RANGE_DEFAULT_MAX", "", "FEED_RANGE_DEFAULT_MIN", "defaultRange", "Lcom/tinder/domain/feed/FeedPositionRange;", "default", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        /* renamed from: default */
        public final FeedPositionRange m37726default() {
            return FeedPositionRange.defaultRange;
        }
    }

    @NotNull
    public static /* synthetic */ FeedPositionRange copy$default(FeedPositionRange feedPositionRange, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = feedPositionRange.minRangePosition;
        }
        if ((i3 & 2) != 0) {
            i2 = feedPositionRange.maxRangePosition;
        }
        return feedPositionRange.copy(i, i2);
    }

    public final int component1() {
        return this.minRangePosition;
    }

    public final int component2() {
        return this.maxRangePosition;
    }

    @NotNull
    public final FeedPositionRange copy(int i, int i2) {
        return new FeedPositionRange(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeedPositionRange) {
            FeedPositionRange feedPositionRange = (FeedPositionRange) obj;
            if ((this.minRangePosition == feedPositionRange.minRangePosition ? 1 : null) != null) {
                if ((this.maxRangePosition == feedPositionRange.maxRangePosition ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.minRangePosition * 31) + this.maxRangePosition;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedPositionRange(minRangePosition=");
        stringBuilder.append(this.minRangePosition);
        stringBuilder.append(", maxRangePosition=");
        stringBuilder.append(this.maxRangePosition);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedPositionRange(int i, int i2) {
        this.minRangePosition = i;
        this.maxRangePosition = i2;
    }

    public final int getMinRangePosition() {
        return this.minRangePosition;
    }

    public final int getMaxRangePosition() {
        return this.maxRangePosition;
    }
}
