package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/tinder/api/model/activityfeed/FeedCommentRequest;", "", "activityFeedItemId", "", "activityFeedItemTimestamp", "", "message", "metadata", "Lcom/tinder/api/model/activityfeed/ApiActivityCommentMetaData;", "(Ljava/lang/String;JLjava/lang/String;Lcom/tinder/api/model/activityfeed/ApiActivityCommentMetaData;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getActivityFeedItemTimestamp", "()J", "getMessage", "getMetadata", "()Lcom/tinder/api/model/activityfeed/ApiActivityCommentMetaData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class FeedCommentRequest {
    @NotNull
    private final String activityFeedItemId;
    private final long activityFeedItemTimestamp;
    @NotNull
    private final String message;
    @Nullable
    private final ApiActivityCommentMetaData metadata;

    @NotNull
    public static /* synthetic */ FeedCommentRequest copy$default(FeedCommentRequest feedCommentRequest, String str, long j, String str2, ApiActivityCommentMetaData apiActivityCommentMetaData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedCommentRequest.activityFeedItemId;
        }
        if ((i & 2) != 0) {
            j = feedCommentRequest.activityFeedItemTimestamp;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = feedCommentRequest.message;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            apiActivityCommentMetaData = feedCommentRequest.metadata;
        }
        return feedCommentRequest.copy(str, j2, str3, apiActivityCommentMetaData);
    }

    @NotNull
    public final String component1() {
        return this.activityFeedItemId;
    }

    public final long component2() {
        return this.activityFeedItemTimestamp;
    }

    @NotNull
    public final String component3() {
        return this.message;
    }

    @Nullable
    public final ApiActivityCommentMetaData component4() {
        return this.metadata;
    }

    @NotNull
    public final FeedCommentRequest copy(@NotNull String str, long j, @NotNull String str2, @Nullable ApiActivityCommentMetaData apiActivityCommentMetaData) {
        C2668g.b(str, "activityFeedItemId");
        C2668g.b(str2, "message");
        return new FeedCommentRequest(str, j, str2, apiActivityCommentMetaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeedCommentRequest) {
            FeedCommentRequest feedCommentRequest = (FeedCommentRequest) obj;
            if (C2668g.a(this.activityFeedItemId, feedCommentRequest.activityFeedItemId)) {
                return ((this.activityFeedItemTimestamp > feedCommentRequest.activityFeedItemTimestamp ? 1 : (this.activityFeedItemTimestamp == feedCommentRequest.activityFeedItemTimestamp ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.message, feedCommentRequest.message) && C2668g.a(this.metadata, feedCommentRequest.metadata);
            }
        }
    }

    public int hashCode() {
        String str = this.activityFeedItemId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.activityFeedItemTimestamp;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.message;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ApiActivityCommentMetaData apiActivityCommentMetaData = this.metadata;
        if (apiActivityCommentMetaData != null) {
            i = apiActivityCommentMetaData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedCommentRequest(activityFeedItemId=");
        stringBuilder.append(this.activityFeedItemId);
        stringBuilder.append(", activityFeedItemTimestamp=");
        stringBuilder.append(this.activityFeedItemTimestamp);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", metadata=");
        stringBuilder.append(this.metadata);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedCommentRequest(@NotNull String str, long j, @NotNull String str2, @Nullable ApiActivityCommentMetaData apiActivityCommentMetaData) {
        C2668g.b(str, "activityFeedItemId");
        C2668g.b(str2, "message");
        this.activityFeedItemId = str;
        this.activityFeedItemTimestamp = j;
        this.message = str2;
        this.metadata = apiActivityCommentMetaData;
    }

    @NotNull
    public final String getActivityFeedItemId() {
        return this.activityFeedItemId;
    }

    public final long getActivityFeedItemTimestamp() {
        return this.activityFeedItemTimestamp;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final ApiActivityCommentMetaData getMetadata() {
        return this.metadata;
    }
}
