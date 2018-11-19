package com.tinder.model.auth;

import com.tinder.auth.model.AuthType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/tinder/model/auth/LogoutFrom;", "", "analyticsValue", "", "(Ljava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "BUTTON", "FORCED", "Merge", "Lcom/tinder/model/auth/LogoutFrom$BUTTON;", "Lcom/tinder/model/auth/LogoutFrom$FORCED;", "Lcom/tinder/model/auth/LogoutFrom$Merge;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class LogoutFrom {
    @NotNull
    private final String analyticsValue;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/model/auth/LogoutFrom$Merge;", "Lcom/tinder/model/auth/LogoutFrom;", "authType", "Lcom/tinder/auth/model/AuthType;", "(Lcom/tinder/auth/model/AuthType;)V", "getAuthType", "()Lcom/tinder/auth/model/AuthType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Merge extends LogoutFrom {
        @NotNull
        private final AuthType authType;

        @NotNull
        public static /* synthetic */ Merge copy$default(Merge merge, AuthType authType, int i, Object obj) {
            if ((i & 1) != 0) {
                authType = merge.authType;
            }
            return merge.copy(authType);
        }

        @NotNull
        public final AuthType component1() {
            return this.authType;
        }

        @NotNull
        public final Merge copy(@NotNull AuthType authType) {
            C2668g.m10309b(authType, "authType");
            return new Merge(authType);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Merge) {
                    if (C2668g.m10308a(this.authType, ((Merge) obj).authType)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            AuthType authType = this.authType;
            return authType != null ? authType.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Merge(authType=");
            stringBuilder.append(this.authType);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Merge(@NotNull AuthType authType) {
            C2668g.m10309b(authType, "authType");
            super("merge");
            this.authType = authType;
        }

        @NotNull
        public final AuthType getAuthType() {
            return this.authType;
        }
    }

    private LogoutFrom(String str) {
        this.analyticsValue = str;
    }

    @NotNull
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
