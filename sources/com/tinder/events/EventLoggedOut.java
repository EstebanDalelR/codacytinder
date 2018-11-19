package com.tinder.events;

import com.tinder.model.auth.LogoutFrom;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/events/EventLoggedOut;", "", "logoutFrom", "Lcom/tinder/model/auth/LogoutFrom;", "(Lcom/tinder/model/auth/LogoutFrom;)V", "getLogoutFrom", "()Lcom/tinder/model/auth/LogoutFrom;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class EventLoggedOut {
    @NotNull
    private final LogoutFrom logoutFrom;

    @NotNull
    public static /* synthetic */ EventLoggedOut copy$default(EventLoggedOut eventLoggedOut, LogoutFrom logoutFrom, int i, Object obj) {
        if ((i & 1) != 0) {
            logoutFrom = eventLoggedOut.logoutFrom;
        }
        return eventLoggedOut.copy(logoutFrom);
    }

    @NotNull
    public final LogoutFrom component1() {
        return this.logoutFrom;
    }

    @NotNull
    public final EventLoggedOut copy(@NotNull LogoutFrom logoutFrom) {
        C2668g.m10309b(logoutFrom, "logoutFrom");
        return new EventLoggedOut(logoutFrom);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EventLoggedOut) {
                if (C2668g.m10308a(this.logoutFrom, ((EventLoggedOut) obj).logoutFrom)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        LogoutFrom logoutFrom = this.logoutFrom;
        return logoutFrom != null ? logoutFrom.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EventLoggedOut(logoutFrom=");
        stringBuilder.append(this.logoutFrom);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public EventLoggedOut(@NotNull LogoutFrom logoutFrom) {
        C2668g.m10309b(logoutFrom, "logoutFrom");
        this.logoutFrom = logoutFrom;
    }

    @NotNull
    public final LogoutFrom getLogoutFrom() {
        return this.logoutFrom;
    }
}
