package com.tinder.api.response.v2;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.User;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/response/v2/UserWrapper;", "", "user", "Lcom/tinder/api/model/common/User;", "(Lcom/tinder/api/model/common/User;)V", "getUser", "()Lcom/tinder/api/model/common/User;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class UserWrapper {
    @NotNull
    private final User user;

    @NotNull
    public static /* synthetic */ UserWrapper copy$default(UserWrapper userWrapper, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userWrapper.user;
        }
        return userWrapper.copy(user);
    }

    @NotNull
    public final User component1() {
        return this.user;
    }

    @NotNull
    public final UserWrapper copy(@NotNull User user) {
        C2668g.b(user, ManagerWebServices.PARAM_USER);
        return new UserWrapper(user);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserWrapper) {
                if (C2668g.a(this.user, ((UserWrapper) obj).user)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        User user = this.user;
        return user != null ? user.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserWrapper(user=");
        stringBuilder.append(this.user);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public UserWrapper(@NotNull User user) {
        C2668g.b(user, ManagerWebServices.PARAM_USER);
        this.user = user;
    }

    @NotNull
    public final User getUser() {
        return this.user;
    }
}
