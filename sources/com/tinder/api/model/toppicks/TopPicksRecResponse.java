package com.tinder.api.model.toppicks;

import com.squareup.moshi.Json;
import com.tinder.api.model.recs.Rec;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\b\b\u0018\u00002\u00020\u0001Bq\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0012Jz\u0010(\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000fHÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\n\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/tinder/api/model/toppicks/TopPicksRecResponse;", "", "recs", "", "Lcom/tinder/api/model/recs/Rec;", "teasers", "nextPageToken", "", "topPicksRefreshTime", "", "isAtEnd", "", "hasPurchasableTopPicks", "hasUnconsumedTopPicks", "count", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHasPurchasableTopPicks", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasUnconsumedTopPicks", "getNextPageToken", "()Ljava/lang/String;", "getRecs", "()Ljava/util/List;", "getTeasers", "getTopPicksRefreshTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/tinder/api/model/toppicks/TopPicksRecResponse;", "equals", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksRecResponse {
    @Nullable
    private final Integer count;
    @Nullable
    private final Boolean hasPurchasableTopPicks;
    @Nullable
    private final Boolean hasUnconsumedTopPicks;
    @Nullable
    private final Boolean isAtEnd;
    @Nullable
    private final String nextPageToken;
    @Nullable
    private final List<Rec> recs;
    @Nullable
    private final List<Rec> teasers;
    @Nullable
    private final Long topPicksRefreshTime;

    @NotNull
    public static /* synthetic */ TopPicksRecResponse copy$default(TopPicksRecResponse topPicksRecResponse, List list, List list2, String str, Long l, Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i, Object obj) {
        TopPicksRecResponse topPicksRecResponse2 = topPicksRecResponse;
        int i2 = i;
        return topPicksRecResponse2.copy((i2 & 1) != 0 ? topPicksRecResponse2.recs : list, (i2 & 2) != 0 ? topPicksRecResponse2.teasers : list2, (i2 & 4) != 0 ? topPicksRecResponse2.nextPageToken : str, (i2 & 8) != 0 ? topPicksRecResponse2.topPicksRefreshTime : l, (i2 & 16) != 0 ? topPicksRecResponse2.isAtEnd : bool, (i2 & 32) != 0 ? topPicksRecResponse2.hasPurchasableTopPicks : bool2, (i2 & 64) != 0 ? topPicksRecResponse2.hasUnconsumedTopPicks : bool3, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? topPicksRecResponse2.count : num);
    }

    @Nullable
    public final List<Rec> component1() {
        return this.recs;
    }

    @Nullable
    public final List<Rec> component2() {
        return this.teasers;
    }

    @Nullable
    public final String component3() {
        return this.nextPageToken;
    }

    @Nullable
    public final Long component4() {
        return this.topPicksRefreshTime;
    }

    @Nullable
    public final Boolean component5() {
        return this.isAtEnd;
    }

    @Nullable
    public final Boolean component6() {
        return this.hasPurchasableTopPicks;
    }

    @Nullable
    public final Boolean component7() {
        return this.hasUnconsumedTopPicks;
    }

    @Nullable
    public final Integer component8() {
        return this.count;
    }

    @NotNull
    public final TopPicksRecResponse copy(@Nullable @Json(name = "results") List<? extends Rec> list, @Nullable @Json(name = "teasers") List<? extends Rec> list2, @Nullable @Json(name = "next_page_token") String str, @Nullable @Json(name = "top_picks_refresh_time") Long l, @Nullable @Json(name = "top_picks_end") Boolean bool, @Nullable @Json(name = "top_picks_available") Boolean bool2, @Nullable @Json(name = "unconsumed_tps_available") Boolean bool3, @Nullable @Json(name = "count") Integer num) {
        return new TopPicksRecResponse(list, list2, str, l, bool, bool2, bool3, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TopPicksRecResponse) {
                TopPicksRecResponse topPicksRecResponse = (TopPicksRecResponse) obj;
                if (C2668g.a(this.recs, topPicksRecResponse.recs) && C2668g.a(this.teasers, topPicksRecResponse.teasers) && C2668g.a(this.nextPageToken, topPicksRecResponse.nextPageToken) && C2668g.a(this.topPicksRefreshTime, topPicksRecResponse.topPicksRefreshTime) && C2668g.a(this.isAtEnd, topPicksRecResponse.isAtEnd) && C2668g.a(this.hasPurchasableTopPicks, topPicksRecResponse.hasPurchasableTopPicks) && C2668g.a(this.hasUnconsumedTopPicks, topPicksRecResponse.hasUnconsumedTopPicks) && C2668g.a(this.count, topPicksRecResponse.count)) {
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
        List list2 = this.teasers;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.nextPageToken;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.topPicksRefreshTime;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.isAtEnd;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.hasPurchasableTopPicks;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.hasUnconsumedTopPicks;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.count;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPicksRecResponse(recs=");
        stringBuilder.append(this.recs);
        stringBuilder.append(", teasers=");
        stringBuilder.append(this.teasers);
        stringBuilder.append(", nextPageToken=");
        stringBuilder.append(this.nextPageToken);
        stringBuilder.append(", topPicksRefreshTime=");
        stringBuilder.append(this.topPicksRefreshTime);
        stringBuilder.append(", isAtEnd=");
        stringBuilder.append(this.isAtEnd);
        stringBuilder.append(", hasPurchasableTopPicks=");
        stringBuilder.append(this.hasPurchasableTopPicks);
        stringBuilder.append(", hasUnconsumedTopPicks=");
        stringBuilder.append(this.hasUnconsumedTopPicks);
        stringBuilder.append(", count=");
        stringBuilder.append(this.count);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TopPicksRecResponse(@Nullable @Json(name = "results") List<? extends Rec> list, @Nullable @Json(name = "teasers") List<? extends Rec> list2, @Nullable @Json(name = "next_page_token") String str, @Nullable @Json(name = "top_picks_refresh_time") Long l, @Nullable @Json(name = "top_picks_end") Boolean bool, @Nullable @Json(name = "top_picks_available") Boolean bool2, @Nullable @Json(name = "unconsumed_tps_available") Boolean bool3, @Nullable @Json(name = "count") Integer num) {
        this.recs = list;
        this.teasers = list2;
        this.nextPageToken = str;
        this.topPicksRefreshTime = l;
        this.isAtEnd = bool;
        this.hasPurchasableTopPicks = bool2;
        this.hasUnconsumedTopPicks = bool3;
        this.count = num;
    }

    @Nullable
    public final List<Rec> getRecs() {
        return this.recs;
    }

    @Nullable
    public final List<Rec> getTeasers() {
        return this.teasers;
    }

    @Nullable
    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    @Nullable
    public final Long getTopPicksRefreshTime() {
        return this.topPicksRefreshTime;
    }

    @Nullable
    public final Boolean isAtEnd() {
        return this.isAtEnd;
    }

    @Nullable
    public final Boolean getHasPurchasableTopPicks() {
        return this.hasPurchasableTopPicks;
    }

    @Nullable
    public final Boolean getHasUnconsumedTopPicks() {
        return this.hasUnconsumedTopPicks;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }
}
