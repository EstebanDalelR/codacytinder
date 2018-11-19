package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/tinder/api/model/activityfeed/ActivityFeedResponse;", "", "activityFeed", "Lcom/tinder/api/model/activityfeed/ApiActivityFeed;", "nextToken", "", "pollInterval", "", "noMore", "(Lcom/tinder/api/model/activityfeed/ApiActivityFeed;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getActivityFeed", "()Lcom/tinder/api/model/activityfeed/ApiActivityFeed;", "getNextToken", "()Ljava/lang/String;", "getNoMore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPollInterval", "component1", "component2", "component3", "component4", "copy", "(Lcom/tinder/api/model/activityfeed/ApiActivityFeed;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/tinder/api/model/activityfeed/ActivityFeedResponse;", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedResponse {
    @Nullable
    private final ApiActivityFeed activityFeed;
    @Nullable
    private final String nextToken;
    @Nullable
    private final Integer noMore;
    @Nullable
    private final Integer pollInterval;

    @NotNull
    public static /* synthetic */ ActivityFeedResponse copy$default(ActivityFeedResponse activityFeedResponse, ApiActivityFeed apiActivityFeed, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            apiActivityFeed = activityFeedResponse.activityFeed;
        }
        if ((i & 2) != 0) {
            str = activityFeedResponse.nextToken;
        }
        if ((i & 4) != 0) {
            num = activityFeedResponse.pollInterval;
        }
        if ((i & 8) != 0) {
            num2 = activityFeedResponse.noMore;
        }
        return activityFeedResponse.copy(apiActivityFeed, str, num, num2);
    }

    @Nullable
    public final ApiActivityFeed component1() {
        return this.activityFeed;
    }

    @Nullable
    public final String component2() {
        return this.nextToken;
    }

    @Nullable
    public final Integer component3() {
        return this.pollInterval;
    }

    @Nullable
    public final Integer component4() {
        return this.noMore;
    }

    @NotNull
    public final ActivityFeedResponse copy(@Nullable ApiActivityFeed apiActivityFeed, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        return new ActivityFeedResponse(apiActivityFeed, str, num, num2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityFeedResponse) {
                ActivityFeedResponse activityFeedResponse = (ActivityFeedResponse) obj;
                if (C2668g.a(this.activityFeed, activityFeedResponse.activityFeed) && C2668g.a(this.nextToken, activityFeedResponse.nextToken) && C2668g.a(this.pollInterval, activityFeedResponse.pollInterval) && C2668g.a(this.noMore, activityFeedResponse.noMore)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ApiActivityFeed apiActivityFeed = this.activityFeed;
        int i = 0;
        int hashCode = (apiActivityFeed != null ? apiActivityFeed.hashCode() : 0) * 31;
        String str = this.nextToken;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.pollInterval;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        num = this.noMore;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedResponse(activityFeed=");
        stringBuilder.append(this.activityFeed);
        stringBuilder.append(", nextToken=");
        stringBuilder.append(this.nextToken);
        stringBuilder.append(", pollInterval=");
        stringBuilder.append(this.pollInterval);
        stringBuilder.append(", noMore=");
        stringBuilder.append(this.noMore);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityFeedResponse(@Nullable ApiActivityFeed apiActivityFeed, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        this.activityFeed = apiActivityFeed;
        this.nextToken = str;
        this.pollInterval = num;
        this.noMore = num2;
    }

    @Nullable
    public final ApiActivityFeed getActivityFeed() {
        return this.activityFeed;
    }

    @Nullable
    public final String getNextToken() {
        return this.nextToken;
    }

    @Nullable
    public final Integer getPollInterval() {
        return this.pollInterval;
    }

    @Nullable
    public final Integer getNoMore() {
        return this.noMore;
    }
}
