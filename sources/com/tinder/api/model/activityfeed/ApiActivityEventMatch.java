package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventMatch;", "", "userNumber", "", "otherUserNumber", "timestamp", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getOtherUserNumber", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimestamp", "getUserNumber", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/tinder/api/model/activityfeed/ApiActivityEventMatch;", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventMatch {
    @Nullable
    private final Long otherUserNumber;
    @Nullable
    private final Long timestamp;
    @Nullable
    private final Long userNumber;

    @NotNull
    public static /* synthetic */ ApiActivityEventMatch copy$default(ApiActivityEventMatch apiActivityEventMatch, Long l, Long l2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = apiActivityEventMatch.userNumber;
        }
        if ((i & 2) != 0) {
            l2 = apiActivityEventMatch.otherUserNumber;
        }
        if ((i & 4) != 0) {
            l3 = apiActivityEventMatch.timestamp;
        }
        return apiActivityEventMatch.copy(l, l2, l3);
    }

    @Nullable
    public final Long component1() {
        return this.userNumber;
    }

    @Nullable
    public final Long component2() {
        return this.otherUserNumber;
    }

    @Nullable
    public final Long component3() {
        return this.timestamp;
    }

    @NotNull
    public final ApiActivityEventMatch copy(@Nullable Long l, @Nullable Long l2, @Nullable Long l3) {
        return new ApiActivityEventMatch(l, l2, l3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventMatch) {
                ApiActivityEventMatch apiActivityEventMatch = (ApiActivityEventMatch) obj;
                if (C2668g.a(this.userNumber, apiActivityEventMatch.userNumber) && C2668g.a(this.otherUserNumber, apiActivityEventMatch.otherUserNumber) && C2668g.a(this.timestamp, apiActivityEventMatch.timestamp)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Long l = this.userNumber;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.otherUserNumber;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.timestamp;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityEventMatch(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", otherUserNumber=");
        stringBuilder.append(this.otherUserNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventMatch(@Nullable Long l, @Nullable Long l2, @Nullable Long l3) {
        this.userNumber = l;
        this.otherUserNumber = l2;
        this.timestamp = l3;
    }

    @Nullable
    public final Long getUserNumber() {
        return this.userNumber;
    }

    @Nullable
    public final Long getOtherUserNumber() {
        return this.otherUserNumber;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }
}
