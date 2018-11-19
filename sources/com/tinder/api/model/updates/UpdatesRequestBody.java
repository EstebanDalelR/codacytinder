package com.tinder.api.model.updates;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/api/model/updates/UpdatesRequestBody;", "", "isFromWebSocketNudge", "", "lastActivityDate", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastActivityDate", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/tinder/api/model/updates/UpdatesRequestBody;", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class UpdatesRequestBody {
    @Nullable
    private final Boolean isFromWebSocketNudge;
    @Nullable
    private final String lastActivityDate;

    @NotNull
    public static /* synthetic */ UpdatesRequestBody copy$default(UpdatesRequestBody updatesRequestBody, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = updatesRequestBody.isFromWebSocketNudge;
        }
        if ((i & 2) != 0) {
            str = updatesRequestBody.lastActivityDate;
        }
        return updatesRequestBody.copy(bool, str);
    }

    @Nullable
    public final Boolean component1() {
        return this.isFromWebSocketNudge;
    }

    @Nullable
    public final String component2() {
        return this.lastActivityDate;
    }

    @NotNull
    public final UpdatesRequestBody copy(@Nullable @Json(name = "nudge") Boolean bool, @Nullable @Json(name = "last_activity_date") String str) {
        return new UpdatesRequestBody(bool, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpdatesRequestBody) {
                UpdatesRequestBody updatesRequestBody = (UpdatesRequestBody) obj;
                if (C2668g.a(this.isFromWebSocketNudge, updatesRequestBody.isFromWebSocketNudge) && C2668g.a(this.lastActivityDate, updatesRequestBody.lastActivityDate)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.isFromWebSocketNudge;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.lastActivityDate;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UpdatesRequestBody(isFromWebSocketNudge=");
        stringBuilder.append(this.isFromWebSocketNudge);
        stringBuilder.append(", lastActivityDate=");
        stringBuilder.append(this.lastActivityDate);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public UpdatesRequestBody(@Nullable @Json(name = "nudge") Boolean bool, @Nullable @Json(name = "last_activity_date") String str) {
        this.isFromWebSocketNudge = bool;
        this.lastActivityDate = str;
    }

    @Nullable
    public final Boolean isFromWebSocketNudge() {
        return this.isFromWebSocketNudge;
    }

    @Nullable
    public final String getLastActivityDate() {
        return this.lastActivityDate;
    }
}
