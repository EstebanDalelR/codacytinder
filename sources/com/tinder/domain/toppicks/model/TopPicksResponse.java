package com.tinder.domain.toppicks.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/tinder/domain/toppicks/model/TopPicksResponse;", "", "refreshTime", "Lorg/joda/time/DateTime;", "isTopPicksEnd", "", "hasUnconsumedTopPicks", "count", "", "recsCount", "teasersCount", "hasTpsAvailableForPurchase", "(Lorg/joda/time/DateTime;ZZIIIZ)V", "getCount", "()I", "getHasTpsAvailableForPurchase", "()Z", "getHasUnconsumedTopPicks", "getRecsCount", "getRefreshTime", "()Lorg/joda/time/DateTime;", "getTeasersCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksResponse {
    private final int count;
    private final boolean hasTpsAvailableForPurchase;
    private final boolean hasUnconsumedTopPicks;
    private final boolean isTopPicksEnd;
    private final int recsCount;
    @NotNull
    private final DateTime refreshTime;
    private final int teasersCount;

    public TopPicksResponse() {
        this(null, false, false, 0, 0, 0, false, 127, null);
    }

    @NotNull
    public static /* synthetic */ TopPicksResponse copy$default(TopPicksResponse topPicksResponse, DateTime dateTime, boolean z, boolean z2, int i, int i2, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            dateTime = topPicksResponse.refreshTime;
        }
        if ((i4 & 2) != 0) {
            z = topPicksResponse.isTopPicksEnd;
        }
        boolean z4 = z;
        if ((i4 & 4) != 0) {
            z2 = topPicksResponse.hasUnconsumedTopPicks;
        }
        boolean z5 = z2;
        if ((i4 & 8) != 0) {
            i = topPicksResponse.count;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            i2 = topPicksResponse.recsCount;
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = topPicksResponse.teasersCount;
        }
        int i7 = i3;
        if ((i4 & 64) != 0) {
            z3 = topPicksResponse.hasTpsAvailableForPurchase;
        }
        return topPicksResponse.copy(dateTime, z4, z5, i5, i6, i7, z3);
    }

    @NotNull
    public final DateTime component1() {
        return this.refreshTime;
    }

    public final boolean component2() {
        return this.isTopPicksEnd;
    }

    public final boolean component3() {
        return this.hasUnconsumedTopPicks;
    }

    public final int component4() {
        return this.count;
    }

    public final int component5() {
        return this.recsCount;
    }

    public final int component6() {
        return this.teasersCount;
    }

    public final boolean component7() {
        return this.hasTpsAvailableForPurchase;
    }

    @NotNull
    public final TopPicksResponse copy(@NotNull DateTime dateTime, boolean z, boolean z2, int i, int i2, int i3, boolean z3) {
        DateTime dateTime2 = dateTime;
        C2668g.b(dateTime2, "refreshTime");
        return new TopPicksResponse(dateTime2, z, z2, i, i2, i3, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopPicksResponse) {
            TopPicksResponse topPicksResponse = (TopPicksResponse) obj;
            if (C2668g.a(this.refreshTime, topPicksResponse.refreshTime)) {
                if ((this.isTopPicksEnd == topPicksResponse.isTopPicksEnd ? 1 : null) != null) {
                    if ((this.hasUnconsumedTopPicks == topPicksResponse.hasUnconsumedTopPicks ? 1 : null) != null) {
                        if ((this.count == topPicksResponse.count ? 1 : null) != null) {
                            if ((this.recsCount == topPicksResponse.recsCount ? 1 : null) != null) {
                                if ((this.teasersCount == topPicksResponse.teasersCount ? 1 : null) != null) {
                                    if ((this.hasTpsAvailableForPurchase == topPicksResponse.hasTpsAvailableForPurchase ? 1 : null) != null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        DateTime dateTime = this.refreshTime;
        int hashCode = (dateTime != null ? dateTime.hashCode() : 0) * 31;
        int i = this.isTopPicksEnd;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.hasUnconsumedTopPicks;
        if (i != 0) {
            i = 1;
        }
        hashCode = (((((((hashCode + i) * 31) + this.count) * 31) + this.recsCount) * 31) + this.teasersCount) * 31;
        i = this.hasTpsAvailableForPurchase;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPicksResponse(refreshTime=");
        stringBuilder.append(this.refreshTime);
        stringBuilder.append(", isTopPicksEnd=");
        stringBuilder.append(this.isTopPicksEnd);
        stringBuilder.append(", hasUnconsumedTopPicks=");
        stringBuilder.append(this.hasUnconsumedTopPicks);
        stringBuilder.append(", count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", recsCount=");
        stringBuilder.append(this.recsCount);
        stringBuilder.append(", teasersCount=");
        stringBuilder.append(this.teasersCount);
        stringBuilder.append(", hasTpsAvailableForPurchase=");
        stringBuilder.append(this.hasTpsAvailableForPurchase);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TopPicksResponse(@NotNull DateTime dateTime, boolean z, boolean z2, int i, int i2, int i3, boolean z3) {
        C2668g.b(dateTime, "refreshTime");
        this.refreshTime = dateTime;
        this.isTopPicksEnd = z;
        this.hasUnconsumedTopPicks = z2;
        this.count = i;
        this.recsCount = i2;
        this.teasersCount = i3;
        this.hasTpsAvailableForPurchase = z3;
    }

    public /* synthetic */ TopPicksResponse(DateTime dateTime, boolean z, boolean z2, int i, int i2, int i3, boolean z3, int i4, C15823e c15823e) {
        if ((i4 & 1) != null) {
            dateTime = new DateTime(0);
        }
        boolean z4 = false;
        c15823e = (i4 & 2) != null ? null : z;
        boolean z5 = i4 & 4 ? false : z2;
        int i5 = i4 & 8 ? 0 : i;
        boolean z6 = i4 & 16 ? false : i2;
        int i6 = i4 & 32 ? 0 : i3;
        if (!(i4 & 64)) {
            z4 = z3;
        }
        this(dateTime, c15823e, z5, i5, z6, i6, z4);
    }

    @NotNull
    public final DateTime getRefreshTime() {
        return this.refreshTime;
    }

    public final boolean isTopPicksEnd() {
        return this.isTopPicksEnd;
    }

    public final boolean getHasUnconsumedTopPicks() {
        return this.hasUnconsumedTopPicks;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getRecsCount() {
        return this.recsCount;
    }

    public final int getTeasersCount() {
        return this.teasersCount;
    }

    public final boolean getHasTpsAvailableForPurchase() {
        return this.hasTpsAvailableForPurchase;
    }
}
