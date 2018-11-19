package com.tinder.api.request;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tinder/api/request/PauseAccountRequest;", "", "user", "Lcom/tinder/api/request/PauseAccountRequest$PauseAccountUser;", "(Lcom/tinder/api/request/PauseAccountRequest$PauseAccountUser;)V", "getUser", "()Lcom/tinder/api/request/PauseAccountRequest$PauseAccountUser;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "PauseAccountUser", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PauseAccountRequest {
    public static final Companion Companion = new Companion();
    @NotNull
    private final PauseAccountUser user;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/api/request/PauseAccountRequest$Companion;", "", "()V", "create", "Lcom/tinder/api/request/PauseAccountRequest;", "shouldPause", "", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final PauseAccountRequest create(boolean z) {
            return new PauseAccountRequest(new PauseAccountUser(z));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/api/request/PauseAccountRequest$PauseAccountUser;", "", "deactivated", "", "(Z)V", "getDeactivated", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class PauseAccountUser {
        private final boolean deactivated;

        @NotNull
        public static /* synthetic */ PauseAccountUser copy$default(PauseAccountUser pauseAccountUser, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = pauseAccountUser.deactivated;
            }
            return pauseAccountUser.copy(z);
        }

        public final boolean component1() {
            return this.deactivated;
        }

        @NotNull
        public final PauseAccountUser copy(boolean z) {
            return new PauseAccountUser(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PauseAccountUser) {
                if ((this.deactivated == ((PauseAccountUser) obj).deactivated ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            boolean z = this.deactivated;
            return z ? 1 : z;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PauseAccountUser(deactivated=");
            stringBuilder.append(this.deactivated);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public PauseAccountUser(boolean z) {
            this.deactivated = z;
        }

        public final boolean getDeactivated() {
            return this.deactivated;
        }
    }

    @NotNull
    public static /* synthetic */ PauseAccountRequest copy$default(PauseAccountRequest pauseAccountRequest, PauseAccountUser pauseAccountUser, int i, Object obj) {
        if ((i & 1) != 0) {
            pauseAccountUser = pauseAccountRequest.user;
        }
        return pauseAccountRequest.copy(pauseAccountUser);
    }

    @NotNull
    public final PauseAccountUser component1() {
        return this.user;
    }

    @NotNull
    public final PauseAccountRequest copy(@NotNull PauseAccountUser pauseAccountUser) {
        C2668g.b(pauseAccountUser, ManagerWebServices.PARAM_USER);
        return new PauseAccountRequest(pauseAccountUser);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PauseAccountRequest) {
                if (C2668g.a(this.user, ((PauseAccountRequest) obj).user)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        PauseAccountUser pauseAccountUser = this.user;
        return pauseAccountUser != null ? pauseAccountUser.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PauseAccountRequest(user=");
        stringBuilder.append(this.user);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PauseAccountRequest(@NotNull PauseAccountUser pauseAccountUser) {
        C2668g.b(pauseAccountUser, ManagerWebServices.PARAM_USER);
        this.user = pauseAccountUser;
    }

    @NotNull
    public final PauseAccountUser getUser() {
        return this.user;
    }
}
