package com.tinder.api.response;

import com.squareup.moshi.Json;
import com.tinder.api.model.common.ApiMatch;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/tinder/api/response/MatchResponse;", "", "match", "Lcom/tinder/api/model/common/ApiMatch;", "(Lcom/tinder/api/model/common/ApiMatch;)V", "getMatch", "()Lcom/tinder/api/model/common/ApiMatch;", "setMatch", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class MatchResponse {
    @Nullable
    private ApiMatch match;

    @NotNull
    public static /* synthetic */ MatchResponse copy$default(MatchResponse matchResponse, ApiMatch apiMatch, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMatch = matchResponse.match;
        }
        return matchResponse.copy(apiMatch);
    }

    @Nullable
    public final ApiMatch component1() {
        return this.match;
    }

    @NotNull
    public final MatchResponse copy(@Nullable @Json(name = "results") ApiMatch apiMatch) {
        return new MatchResponse(apiMatch);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MatchResponse) {
                if (C2668g.a(this.match, ((MatchResponse) obj).match)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ApiMatch apiMatch = this.match;
        return apiMatch != null ? apiMatch.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchResponse(match=");
        stringBuilder.append(this.match);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public MatchResponse(@Nullable @Json(name = "results") ApiMatch apiMatch) {
        this.match = apiMatch;
    }

    @Nullable
    public final ApiMatch getMatch() {
        return this.match;
    }

    public final void setMatch(@Nullable ApiMatch apiMatch) {
        this.match = apiMatch;
    }
}
