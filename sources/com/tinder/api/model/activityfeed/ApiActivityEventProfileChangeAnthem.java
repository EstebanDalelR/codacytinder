package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeAnthem;", "", "userNumber", "", "timestamp", "anthem", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedAnthem;", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/tinder/api/model/activityfeed/ApiActivityFeedAnthem;)V", "getAnthem", "()Lcom/tinder/api/model/activityfeed/ApiActivityFeedAnthem;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserNumber", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/tinder/api/model/activityfeed/ApiActivityFeedAnthem;)Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeAnthem;", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventProfileChangeAnthem {
    @Nullable
    private final ApiActivityFeedAnthem anthem;
    @Nullable
    private final Long timestamp;
    @Nullable
    private final Long userNumber;

    @NotNull
    public static /* synthetic */ ApiActivityEventProfileChangeAnthem copy$default(ApiActivityEventProfileChangeAnthem apiActivityEventProfileChangeAnthem, Long l, Long l2, ApiActivityFeedAnthem apiActivityFeedAnthem, int i, Object obj) {
        if ((i & 1) != 0) {
            l = apiActivityEventProfileChangeAnthem.userNumber;
        }
        if ((i & 2) != 0) {
            l2 = apiActivityEventProfileChangeAnthem.timestamp;
        }
        if ((i & 4) != 0) {
            apiActivityFeedAnthem = apiActivityEventProfileChangeAnthem.anthem;
        }
        return apiActivityEventProfileChangeAnthem.copy(l, l2, apiActivityFeedAnthem);
    }

    @Nullable
    public final Long component1() {
        return this.userNumber;
    }

    @Nullable
    public final Long component2() {
        return this.timestamp;
    }

    @Nullable
    public final ApiActivityFeedAnthem component3() {
        return this.anthem;
    }

    @NotNull
    public final ApiActivityEventProfileChangeAnthem copy(@Nullable Long l, @Nullable Long l2, @Nullable ApiActivityFeedAnthem apiActivityFeedAnthem) {
        return new ApiActivityEventProfileChangeAnthem(l, l2, apiActivityFeedAnthem);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventProfileChangeAnthem) {
                ApiActivityEventProfileChangeAnthem apiActivityEventProfileChangeAnthem = (ApiActivityEventProfileChangeAnthem) obj;
                if (C2668g.a(this.userNumber, apiActivityEventProfileChangeAnthem.userNumber) && C2668g.a(this.timestamp, apiActivityEventProfileChangeAnthem.timestamp) && C2668g.a(this.anthem, apiActivityEventProfileChangeAnthem.anthem)) {
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
        Long l2 = this.timestamp;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        ApiActivityFeedAnthem apiActivityFeedAnthem = this.anthem;
        if (apiActivityFeedAnthem != null) {
            i = apiActivityFeedAnthem.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityEventProfileChangeAnthem(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", anthem=");
        stringBuilder.append(this.anthem);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventProfileChangeAnthem(@Nullable Long l, @Nullable Long l2, @Nullable ApiActivityFeedAnthem apiActivityFeedAnthem) {
        this.userNumber = l;
        this.timestamp = l2;
        this.anthem = apiActivityFeedAnthem;
    }

    @Nullable
    public final Long getUserNumber() {
        return this.userNumber;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final ApiActivityFeedAnthem getAnthem() {
        return this.anthem;
    }
}
