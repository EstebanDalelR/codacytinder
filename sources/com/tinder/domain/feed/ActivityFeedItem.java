package com.tinder.domain.feed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001*BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedItem;", "", "id", "", "activityId", "matchId", "comments", "", "Lcom/tinder/domain/feed/ActivityFeedComment;", "activityEvent", "Lcom/tinder/domain/feed/ActivityEvent;", "userInfo", "Lcom/tinder/domain/feed/ActivityFeedUserInfo;", "matchType", "Lcom/tinder/domain/feed/ActivityFeedItem$MatchType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tinder/domain/feed/ActivityEvent;Lcom/tinder/domain/feed/ActivityFeedUserInfo;Lcom/tinder/domain/feed/ActivityFeedItem$MatchType;)V", "getActivityEvent", "()Lcom/tinder/domain/feed/ActivityEvent;", "getActivityId", "()Ljava/lang/String;", "getComments", "()Ljava/util/List;", "getId", "getMatchId", "getMatchType", "()Lcom/tinder/domain/feed/ActivityFeedItem$MatchType;", "getUserInfo", "()Lcom/tinder/domain/feed/ActivityFeedUserInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "MatchType", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedItem {
    @NotNull
    private final ActivityEvent activityEvent;
    @NotNull
    private final String activityId;
    @NotNull
    private final List<ActivityFeedComment> comments;
    @NotNull
    private final String id;
    @NotNull
    private final String matchId;
    @NotNull
    private final MatchType matchType;
    @NotNull
    private final ActivityFeedUserInfo userInfo;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedItem$MatchType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NONE", "BOOST", "SUPER_LIKE", "LIKES_YOU", "TOP_PICK", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum MatchType {
        ;
        
        @NotNull
        private final String value;

        protected MatchType(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @NotNull
    public static /* synthetic */ ActivityFeedItem copy$default(ActivityFeedItem activityFeedItem, String str, String str2, String str3, List list, ActivityEvent activityEvent, ActivityFeedUserInfo activityFeedUserInfo, MatchType matchType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityFeedItem.id;
        }
        if ((i & 2) != 0) {
            str2 = activityFeedItem.activityId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = activityFeedItem.matchId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = activityFeedItem.comments;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            activityEvent = activityFeedItem.activityEvent;
        }
        ActivityEvent activityEvent2 = activityEvent;
        if ((i & 32) != 0) {
            activityFeedUserInfo = activityFeedItem.userInfo;
        }
        ActivityFeedUserInfo activityFeedUserInfo2 = activityFeedUserInfo;
        if ((i & 64) != 0) {
            matchType = activityFeedItem.matchType;
        }
        return activityFeedItem.copy(str, str4, str5, list2, activityEvent2, activityFeedUserInfo2, matchType);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.activityId;
    }

    @NotNull
    public final String component3() {
        return this.matchId;
    }

    @NotNull
    public final List<ActivityFeedComment> component4() {
        return this.comments;
    }

    @NotNull
    public final ActivityEvent component5() {
        return this.activityEvent;
    }

    @NotNull
    public final ActivityFeedUserInfo component6() {
        return this.userInfo;
    }

    @NotNull
    public final MatchType component7() {
        return this.matchType;
    }

    @NotNull
    public final ActivityFeedItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<ActivityFeedComment> list, @NotNull ActivityEvent activityEvent, @NotNull ActivityFeedUserInfo activityFeedUserInfo, @NotNull MatchType matchType) {
        String str4 = str;
        C2668g.b(str4, "id");
        String str5 = str2;
        C2668g.b(str5, "activityId");
        String str6 = str3;
        C2668g.b(str6, "matchId");
        List<ActivityFeedComment> list2 = list;
        C2668g.b(list2, "comments");
        ActivityEvent activityEvent2 = activityEvent;
        C2668g.b(activityEvent2, "activityEvent");
        ActivityFeedUserInfo activityFeedUserInfo2 = activityFeedUserInfo;
        C2668g.b(activityFeedUserInfo2, "userInfo");
        MatchType matchType2 = matchType;
        C2668g.b(matchType2, "matchType");
        return new ActivityFeedItem(str4, str5, str6, list2, activityEvent2, activityFeedUserInfo2, matchType2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityFeedItem) {
                ActivityFeedItem activityFeedItem = (ActivityFeedItem) obj;
                if (C2668g.a(this.id, activityFeedItem.id) && C2668g.a(this.activityId, activityFeedItem.activityId) && C2668g.a(this.matchId, activityFeedItem.matchId) && C2668g.a(this.comments, activityFeedItem.comments) && C2668g.a(this.activityEvent, activityFeedItem.activityEvent) && C2668g.a(this.userInfo, activityFeedItem.userInfo) && C2668g.a(this.matchType, activityFeedItem.matchType)) {
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
        ActivityEvent activityEvent = this.activityEvent;
        hashCode = (hashCode + (activityEvent != null ? activityEvent.hashCode() : 0)) * 31;
        ActivityFeedUserInfo activityFeedUserInfo = this.userInfo;
        hashCode = (hashCode + (activityFeedUserInfo != null ? activityFeedUserInfo.hashCode() : 0)) * 31;
        MatchType matchType = this.matchType;
        if (matchType != null) {
            i = matchType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedItem(id=");
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

    public ActivityFeedItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<ActivityFeedComment> list, @NotNull ActivityEvent activityEvent, @NotNull ActivityFeedUserInfo activityFeedUserInfo, @NotNull MatchType matchType) {
        C2668g.b(str, "id");
        C2668g.b(str2, "activityId");
        C2668g.b(str3, "matchId");
        C2668g.b(list, "comments");
        C2668g.b(activityEvent, "activityEvent");
        C2668g.b(activityFeedUserInfo, "userInfo");
        C2668g.b(matchType, "matchType");
        this.id = str;
        this.activityId = str2;
        this.matchId = str3;
        this.comments = list;
        this.activityEvent = activityEvent;
        this.userInfo = activityFeedUserInfo;
        this.matchType = matchType;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    @NotNull
    public final String getMatchId() {
        return this.matchId;
    }

    @NotNull
    public final List<ActivityFeedComment> getComments() {
        return this.comments;
    }

    @NotNull
    public final ActivityEvent getActivityEvent() {
        return this.activityEvent;
    }

    @NotNull
    public final ActivityFeedUserInfo getUserInfo() {
        return this.userInfo;
    }

    public /* synthetic */ ActivityFeedItem(String str, String str2, String str3, List list, ActivityEvent activityEvent, ActivityFeedUserInfo activityFeedUserInfo, MatchType matchType, int i, C15823e c15823e) {
        this(str, str2, str3, list, activityEvent, activityFeedUserInfo, (i & 64) != 0 ? MatchType.NONE : matchType);
    }

    @NotNull
    public final MatchType getMatchType() {
        return this.matchType;
    }
}
