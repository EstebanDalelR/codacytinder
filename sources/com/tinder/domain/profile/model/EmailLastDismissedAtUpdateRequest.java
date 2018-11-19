package com.tinder.domain.profile.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/profile/model/EmailLastDismissedAtUpdateRequest;", "Lcom/tinder/domain/profile/model/ProfileUpdateRequest;", "emailLastDismissedAt", "", "(J)V", "getEmailLastDismissedAt", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class EmailLastDismissedAtUpdateRequest extends ProfileUpdateRequest {
    private final long emailLastDismissedAt;

    @NotNull
    public static /* synthetic */ EmailLastDismissedAtUpdateRequest copy$default(EmailLastDismissedAtUpdateRequest emailLastDismissedAtUpdateRequest, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = emailLastDismissedAtUpdateRequest.emailLastDismissedAt;
        }
        return emailLastDismissedAtUpdateRequest.copy(j);
    }

    public final long component1() {
        return this.emailLastDismissedAt;
    }

    @NotNull
    public final EmailLastDismissedAtUpdateRequest copy(long j) {
        return new EmailLastDismissedAtUpdateRequest(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmailLastDismissedAtUpdateRequest) {
            if ((this.emailLastDismissedAt == ((EmailLastDismissedAtUpdateRequest) obj).emailLastDismissedAt ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.emailLastDismissedAt;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EmailLastDismissedAtUpdateRequest(emailLastDismissedAt=");
        stringBuilder.append(this.emailLastDismissedAt);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final long getEmailLastDismissedAt() {
        return this.emailLastDismissedAt;
    }

    public EmailLastDismissedAtUpdateRequest(long j) {
        super();
        this.emailLastDismissedAt = j;
    }
}
