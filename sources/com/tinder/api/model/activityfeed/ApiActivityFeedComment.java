package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityFeedComment;", "", "message", "", "activityFeedItemId", "createdAt", "", "metadata", "Lcom/tinder/api/model/activityfeed/ApiActivityCommentMetaData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/tinder/api/model/activityfeed/ApiActivityCommentMetaData;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMessage", "getMetadata", "()Lcom/tinder/api/model/activityfeed/ApiActivityCommentMetaData;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/tinder/api/model/activityfeed/ApiActivityCommentMetaData;)Lcom/tinder/api/model/activityfeed/ApiActivityFeedComment;", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityFeedComment {
    @Nullable
    private final String activityFeedItemId;
    @Nullable
    private final Long createdAt;
    @Nullable
    private final String message;
    @Nullable
    private final ApiActivityCommentMetaData metadata;

    @NotNull
    public static /* synthetic */ ApiActivityFeedComment copy$default(ApiActivityFeedComment apiActivityFeedComment, String str, String str2, Long l, ApiActivityCommentMetaData apiActivityCommentMetaData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityFeedComment.message;
        }
        if ((i & 2) != 0) {
            str2 = apiActivityFeedComment.activityFeedItemId;
        }
        if ((i & 4) != 0) {
            l = apiActivityFeedComment.createdAt;
        }
        if ((i & 8) != 0) {
            apiActivityCommentMetaData = apiActivityFeedComment.metadata;
        }
        return apiActivityFeedComment.copy(str, str2, l, apiActivityCommentMetaData);
    }

    @Nullable
    public final String component1() {
        return this.message;
    }

    @Nullable
    public final String component2() {
        return this.activityFeedItemId;
    }

    @Nullable
    public final Long component3() {
        return this.createdAt;
    }

    @Nullable
    public final ApiActivityCommentMetaData component4() {
        return this.metadata;
    }

    @NotNull
    public final ApiActivityFeedComment copy(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable ApiActivityCommentMetaData apiActivityCommentMetaData) {
        return new ApiActivityFeedComment(str, str2, l, apiActivityCommentMetaData);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityFeedComment) {
                ApiActivityFeedComment apiActivityFeedComment = (ApiActivityFeedComment) obj;
                if (C2668g.a(this.message, apiActivityFeedComment.message) && C2668g.a(this.activityFeedItemId, apiActivityFeedComment.activityFeedItemId) && C2668g.a(this.createdAt, apiActivityFeedComment.createdAt) && C2668g.a(this.metadata, apiActivityFeedComment.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.activityFeedItemId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.createdAt;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        ApiActivityCommentMetaData apiActivityCommentMetaData = this.metadata;
        if (apiActivityCommentMetaData != null) {
            i = apiActivityCommentMetaData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityFeedComment(message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.activityFeedItemId);
        stringBuilder.append(", createdAt=");
        stringBuilder.append(this.createdAt);
        stringBuilder.append(", metadata=");
        stringBuilder.append(this.metadata);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityFeedComment(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable ApiActivityCommentMetaData apiActivityCommentMetaData) {
        this.message = str;
        this.activityFeedItemId = str2;
        this.createdAt = l;
        this.metadata = apiActivityCommentMetaData;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getActivityFeedItemId() {
        return this.activityFeedItemId;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final ApiActivityCommentMetaData getMetadata() {
        return this.metadata;
    }
}
