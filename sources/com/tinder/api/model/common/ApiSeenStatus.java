package com.tinder.api.model.common;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/model/common/ApiSeenStatus;", "", "lastSeenMessageId", "", "matchSeen", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getLastSeenMessageId", "()Ljava/lang/String;", "getMatchSeen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/tinder/api/model/common/ApiSeenStatus;", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiSeenStatus {
    @Nullable
    private final String lastSeenMessageId;
    @Nullable
    private final Boolean matchSeen;

    @NotNull
    public static /* synthetic */ ApiSeenStatus copy$default(ApiSeenStatus apiSeenStatus, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiSeenStatus.lastSeenMessageId;
        }
        if ((i & 2) != 0) {
            bool = apiSeenStatus.matchSeen;
        }
        return apiSeenStatus.copy(str, bool);
    }

    @Nullable
    public final String component1() {
        return this.lastSeenMessageId;
    }

    @Nullable
    public final Boolean component2() {
        return this.matchSeen;
    }

    @NotNull
    public final ApiSeenStatus copy(@Nullable @Json(name = "last_seen_msg_id") String str, @Nullable @Json(name = "match_seen") Boolean bool) {
        return new ApiSeenStatus(str, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiSeenStatus) {
                ApiSeenStatus apiSeenStatus = (ApiSeenStatus) obj;
                if (C2668g.a(this.lastSeenMessageId, apiSeenStatus.lastSeenMessageId) && C2668g.a(this.matchSeen, apiSeenStatus.matchSeen)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.lastSeenMessageId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.matchSeen;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiSeenStatus(lastSeenMessageId=");
        stringBuilder.append(this.lastSeenMessageId);
        stringBuilder.append(", matchSeen=");
        stringBuilder.append(this.matchSeen);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiSeenStatus(@Nullable @Json(name = "last_seen_msg_id") String str, @Nullable @Json(name = "match_seen") Boolean bool) {
        this.lastSeenMessageId = str;
        this.matchSeen = bool;
    }

    @Nullable
    public final String getLastSeenMessageId() {
        return this.lastSeenMessageId;
    }

    @Nullable
    public final Boolean getMatchSeen() {
        return this.matchSeen;
    }
}
