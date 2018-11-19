package com.tinder.api.response.v2;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/response/v2/UserResponse;", "", "data", "Lcom/tinder/api/response/v2/UserWrapper;", "meta", "Lcom/tinder/api/response/v2/ResponseMeta;", "(Lcom/tinder/api/response/v2/UserWrapper;Lcom/tinder/api/response/v2/ResponseMeta;)V", "getData", "()Lcom/tinder/api/response/v2/UserWrapper;", "getMeta", "()Lcom/tinder/api/response/v2/ResponseMeta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class UserResponse {
    @Nullable
    private final UserWrapper data;
    @NotNull
    private final ResponseMeta meta;

    @NotNull
    public static /* synthetic */ UserResponse copy$default(UserResponse userResponse, UserWrapper userWrapper, ResponseMeta responseMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            userWrapper = userResponse.data;
        }
        if ((i & 2) != 0) {
            responseMeta = userResponse.meta;
        }
        return userResponse.copy(userWrapper, responseMeta);
    }

    @Nullable
    public final UserWrapper component1() {
        return this.data;
    }

    @NotNull
    public final ResponseMeta component2() {
        return this.meta;
    }

    @NotNull
    public final UserResponse copy(@Nullable UserWrapper userWrapper, @NotNull ResponseMeta responseMeta) {
        C2668g.b(responseMeta, ManagerWebServices.PARAM_META);
        return new UserResponse(userWrapper, responseMeta);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserResponse) {
                UserResponse userResponse = (UserResponse) obj;
                if (C2668g.a(this.data, userResponse.data) && C2668g.a(this.meta, userResponse.meta)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        UserWrapper userWrapper = this.data;
        int i = 0;
        int hashCode = (userWrapper != null ? userWrapper.hashCode() : 0) * 31;
        ResponseMeta responseMeta = this.meta;
        if (responseMeta != null) {
            i = responseMeta.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserResponse(data=");
        stringBuilder.append(this.data);
        stringBuilder.append(", meta=");
        stringBuilder.append(this.meta);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public UserResponse(@Nullable UserWrapper userWrapper, @NotNull ResponseMeta responseMeta) {
        C2668g.b(responseMeta, ManagerWebServices.PARAM_META);
        this.data = userWrapper;
        this.meta = responseMeta;
    }

    @Nullable
    public final UserWrapper getData() {
        return this.data;
    }

    @NotNull
    public final ResponseMeta getMeta() {
        return this.meta;
    }
}
