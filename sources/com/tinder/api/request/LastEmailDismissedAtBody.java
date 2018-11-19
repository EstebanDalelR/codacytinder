package com.tinder.api.request;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/request/LastEmailDismissedAtBody;", "", "lastEmailDismissedAt", "", "(J)V", "getLastEmailDismissedAt", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class LastEmailDismissedAtBody {
    private final long lastEmailDismissedAt;

    @NotNull
    public static /* synthetic */ LastEmailDismissedAtBody copy$default(LastEmailDismissedAtBody lastEmailDismissedAtBody, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lastEmailDismissedAtBody.lastEmailDismissedAt;
        }
        return lastEmailDismissedAtBody.copy(j);
    }

    public final long component1() {
        return this.lastEmailDismissedAt;
    }

    @NotNull
    public final LastEmailDismissedAtBody copy(@Json(name = "last_email_dismissed_at") long j) {
        return new LastEmailDismissedAtBody(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LastEmailDismissedAtBody) {
            if ((this.lastEmailDismissedAt == ((LastEmailDismissedAtBody) obj).lastEmailDismissedAt ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.lastEmailDismissedAt;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LastEmailDismissedAtBody(lastEmailDismissedAt=");
        stringBuilder.append(this.lastEmailDismissedAt);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public LastEmailDismissedAtBody(@Json(name = "last_email_dismissed_at") long j) {
        this.lastEmailDismissedAt = j;
    }

    public final long getLastEmailDismissedAt() {
        return this.lastEmailDismissedAt;
    }
}
