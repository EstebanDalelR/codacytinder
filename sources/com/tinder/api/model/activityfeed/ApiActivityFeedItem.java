package com.tinder.api.model.activityfeed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityFeedItem;", "", "id", "", "activityId", "matchId", "comments", "", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedComment;", "activityEvent", "Lcom/tinder/api/model/activityfeed/ApiActivityEvent;", "userInfo", "Lcom/tinder/api/model/activityfeed/ApiActivityUserInfo;", "matchType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tinder/api/model/activityfeed/ApiActivityEvent;Lcom/tinder/api/model/activityfeed/ApiActivityUserInfo;Ljava/lang/String;)V", "getActivityEvent", "()Lcom/tinder/api/model/activityfeed/ApiActivityEvent;", "getActivityId", "()Ljava/lang/String;", "getComments", "()Ljava/util/List;", "getId", "getMatchId", "getMatchType", "getUserInfo", "()Lcom/tinder/api/model/activityfeed/ApiActivityUserInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityFeedItem {
    @Nullable
    private final ApiActivityEvent activityEvent;
    @Nullable
    private final String activityId;
    @Nullable
    private final List<ApiActivityFeedComment> comments;
    @Nullable
    private final String id;
    @Nullable
    private final String matchId;
    @Nullable
    private final String matchType;
    @Nullable
    private final ApiActivityUserInfo userInfo;

    @NotNull
    public static /* synthetic */ ApiActivityFeedItem copy$default(ApiActivityFeedItem apiActivityFeedItem, String str, String str2, String str3, List list, ApiActivityEvent apiActivityEvent, ApiActivityUserInfo apiActivityUserInfo, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityFeedItem.id;
        }
        if ((i & 2) != 0) {
            str2 = apiActivityFeedItem.activityId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = apiActivityFeedItem.matchId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = apiActivityFeedItem.comments;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            apiActivityEvent = apiActivityFeedItem.activityEvent;
        }
        ApiActivityEvent apiActivityEvent2 = apiActivityEvent;
        if ((i & 32) != 0) {
            apiActivityUserInfo = apiActivityFeedItem.userInfo;
        }
        ApiActivityUserInfo apiActivityUserInfo2 = apiActivityUserInfo;
        if ((i & 64) != 0) {
            str4 = apiActivityFeedItem.matchType;
        }
        return apiActivityFeedItem.copy(str, str5, str6, list2, apiActivityEvent2, apiActivityUserInfo2, str4);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.activityId;
    }

    @Nullable
    public final String component3() {
        return this.matchId;
    }

    @Nullable
    public final List<ApiActivityFeedComment> component4() {
        return this.comments;
    }

    @Nullable
    public final ApiActivityEvent component5() {
        return this.activityEvent;
    }

    @Nullable
    public final ApiActivityUserInfo component6() {
        return this.userInfo;
    }

    @Nullable
    public final String component7() {
        return this.matchType;
    }

    @NotNull
    public final ApiActivityFeedItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<ApiActivityFeedComment> list, @Nullable ApiActivityEvent apiActivityEvent, @Nullable ApiActivityUserInfo apiActivityUserInfo, @Nullable String str4) {
        return new ApiActivityFeedItem(str, str2, str3, list, apiActivityEvent, apiActivityUserInfo, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityFeedItem) {
                ApiActivityFeedItem apiActivityFeedItem = (ApiActivityFeedItem) obj;
                if (C2668g.a(this.id, apiActivityFeedItem.id) && C2668g.a(this.activityId, apiActivityFeedItem.activityId) && C2668g.a(this.matchId, apiActivityFeedItem.matchId) && C2668g.a(this.comments, apiActivityFeedItem.comments) && C2668g.a(this.activityEvent, apiActivityFeedItem.activityEvent) && C2668g.a(this.userInfo, apiActivityFeedItem.userInfo) && C2668g.a(this.matchType, apiActivityFeedItem.matchType)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.activityId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.matchId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.comments;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        ApiActivityEvent apiActivityEvent = this.activityEvent;
        hashCode = (hashCode + (apiActivityEvent != null ? apiActivityEvent.hashCode() : 0)) * 31;
        ApiActivityUserInfo apiActivityUserInfo = this.userInfo;
        hashCode = (hashCode + (apiActivityUserInfo != null ? apiActivityUserInfo.hashCode() : 0)) * 31;
        str2 = this.matchType;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityFeedItem(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", activityId=");
        stringBuilder.append(this.activityId);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.matchId);
        stringBuilder.append(", comments=");
        stringBuilder.append(this.comments);
        stringBuilder.append(", activityEvent=");
        stringBuilder.append(this.activityEvent);
        stringBuilder.append(", userInfo=");
        stringBuilder.append(this.userInfo);
        stringBuilder.append(", matchType=");
        stringBuilder.append(this.matchType);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityFeedItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<ApiActivityFeedComment> list, @Nullable ApiActivityEvent apiActivityEvent, @Nullable ApiActivityUserInfo apiActivityUserInfo, @Nullable String str4) {
        this.id = str;
        this.activityId = str2;
        this.matchId = str3;
        this.comments = list;
        this.activityEvent = apiActivityEvent;
        this.userInfo = apiActivityUserInfo;
        this.matchType = str4;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getMatchId() {
        return this.matchId;
    }

    @Nullable
    public final List<ApiActivityFeedComment> getComments() {
        return this.comments;
    }

    @Nullable
    public final ApiActivityEvent getActivityEvent() {
        return this.activityEvent;
    }

    @Nullable
    public final ApiActivityUserInfo getUserInfo() {
        return this.userInfo;
    }

    @Nullable
    public final String getMatchType() {
        return this.matchType;
    }
}
