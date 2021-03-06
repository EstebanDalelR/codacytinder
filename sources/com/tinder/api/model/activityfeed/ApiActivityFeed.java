package com.tinder.api.model.activityfeed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityFeed;", "", "activityFeedItems", "", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedItem;", "userId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getActivityFeedItems", "()Ljava/util/List;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityFeed {
    @Nullable
    private final List<ApiActivityFeedItem> activityFeedItems;
    @Nullable
    private final String userId;

    @NotNull
    public static /* synthetic */ ApiActivityFeed copy$default(ApiActivityFeed apiActivityFeed, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = apiActivityFeed.activityFeedItems;
        }
        if ((i & 2) != 0) {
            str = apiActivityFeed.userId;
        }
        return apiActivityFeed.copy(list, str);
    }

    @Nullable
    public final List<ApiActivityFeedItem> component1() {
        return this.activityFeedItems;
    }

    @Nullable
    public final String component2() {
        return this.userId;
    }

    @NotNull
    public final ApiActivityFeed copy(@Nullable List<ApiActivityFeedItem> list, @Nullable String str) {
        return new ApiActivityFeed(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityFeed) {
                ApiActivityFeed apiActivityFeed = (ApiActivityFeed) obj;
                if (C2668g.a(this.activityFeedItems, apiActivityFeed.activityFeedItems) && C2668g.a(this.userId, apiActivityFeed.userId)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.activityFeedItems;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.userId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityFeed(activityFeedItems=");
        stringBuilder.append(this.activityFeedItems);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityFeed(@Nullable List<ApiActivityFeedItem> list, @Nullable String str) {
        this.activityFeedItems = list;
        this.userId = str;
    }

    @Nullable
    public final List<ApiActivityFeedItem> getActivityFeedItems() {
        return this.activityFeedItems;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }
}
