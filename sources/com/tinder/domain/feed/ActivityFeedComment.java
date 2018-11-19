package com.tinder.domain.feed;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001!B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedComment;", "", "message", "", "activityFeedItemId", "createdAt", "", "metadata", "Lcom/tinder/domain/feed/ActivityCommentMetaData;", "state", "Lcom/tinder/domain/feed/ActivityFeedComment$State;", "(Ljava/lang/String;Ljava/lang/String;JLcom/tinder/domain/feed/ActivityCommentMetaData;Lcom/tinder/domain/feed/ActivityFeedComment$State;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getCreatedAt", "()J", "getMessage", "getMetadata", "()Lcom/tinder/domain/feed/ActivityCommentMetaData;", "getState", "()Lcom/tinder/domain/feed/ActivityFeedComment$State;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "State", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedComment {
    @NotNull
    private final String activityFeedItemId;
    private final long createdAt;
    @NotNull
    private final String message;
    @NotNull
    private final ActivityCommentMetaData metadata;
    @NotNull
    private final State state;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedComment$State;", "", "(Ljava/lang/String;I)V", "PENDING", "SENT", "FAILED", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum State {
    }

    @NotNull
    public static /* synthetic */ ActivityFeedComment copy$default(ActivityFeedComment activityFeedComment, String str, String str2, long j, ActivityCommentMetaData activityCommentMetaData, State state, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityFeedComment.message;
        }
        if ((i & 2) != 0) {
            str2 = activityFeedComment.activityFeedItemId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = activityFeedComment.createdAt;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            activityCommentMetaData = activityFeedComment.metadata;
        }
        ActivityCommentMetaData activityCommentMetaData2 = activityCommentMetaData;
        if ((i & 16) != 0) {
            state = activityFeedComment.state;
        }
        return activityFeedComment.copy(str, str3, j2, activityCommentMetaData2, state);
    }

    @NotNull
    public final String component1() {
        return this.message;
    }

    @NotNull
    public final String component2() {
        return this.activityFeedItemId;
    }

    public final long component3() {
        return this.createdAt;
    }

    @NotNull
    public final ActivityCommentMetaData component4() {
        return this.metadata;
    }

    @NotNull
    public final State component5() {
        return this.state;
    }

    @NotNull
    public final ActivityFeedComment copy(@NotNull String str, @NotNull String str2, long j, @NotNull ActivityCommentMetaData activityCommentMetaData, @NotNull State state) {
        C2668g.b(str, "message");
        C2668g.b(str2, "activityFeedItemId");
        C2668g.b(activityCommentMetaData, "metadata");
        C2668g.b(state, "state");
        return new ActivityFeedComment(str, str2, j, activityCommentMetaData, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityFeedComment) {
            ActivityFeedComment activityFeedComment = (ActivityFeedComment) obj;
            if (C2668g.a(this.message, activityFeedComment.message) && C2668g.a(this.activityFeedItemId, activityFeedComment.activityFeedItemId)) {
                return ((this.createdAt > activityFeedComment.createdAt ? 1 : (this.createdAt == activityFeedComment.createdAt ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.metadata, activityFeedComment.metadata) && C2668g.a(this.state, activityFeedComment.state);
            }
        }
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.activityFeedItemId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.createdAt;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        ActivityCommentMetaData activityCommentMetaData = this.metadata;
        hashCode = (hashCode + (activityCommentMetaData != null ? activityCommentMetaData.hashCode() : 0)) * 31;
        State state = this.state;
        if (state != null) {
            i = state.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedComment(message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.activityFeedItemId);
        stringBuilder.append(", createdAt=");
        stringBuilder.append(this.createdAt);
        stringBuilder.append(", metadata=");
        stringBuilder.append(this.metadata);
        stringBuilder.append(", state=");
        stringBuilder.append(this.state);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityFeedComment(@NotNull String str, @NotNull String str2, long j, @NotNull ActivityCommentMetaData activityCommentMetaData, @NotNull State state) {
        C2668g.b(str, "message");
        C2668g.b(str2, "activityFeedItemId");
        C2668g.b(activityCommentMetaData, "metadata");
        C2668g.b(state, "state");
        this.message = str;
        this.activityFeedItemId = str2;
        this.createdAt = j;
        this.metadata = activityCommentMetaData;
        this.state = state;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getActivityFeedItemId() {
        return this.activityFeedItemId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final ActivityCommentMetaData getMetadata() {
        return this.metadata;
    }

    public /* synthetic */ ActivityFeedComment(String str, String str2, long j, ActivityCommentMetaData activityCommentMetaData, State state, int i, C15823e c15823e) {
        if ((i & 16) != 0) {
            state = State.SENT;
        }
        this(str, str2, j, activityCommentMetaData, state);
    }

    @NotNull
    public final State getState() {
        return this.state;
    }
}
