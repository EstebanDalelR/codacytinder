package com.tinder.api.request;

import com.squareup.moshi.Json;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tinder/api/request/SuperLikeableActionRequestBody;", "", "()V", "Skip", "SuperLike", "api_release"}, k = 1, mv = {1, 1, 10})
public abstract class SuperLikeableActionRequestBody {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/api/request/SuperLikeableActionRequestBody$Skip;", "", "token", "", "action", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Skip {
        public static final Companion Companion = new Companion();
        private final String action;
        @NotNull
        private final String token;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/api/request/SuperLikeableActionRequestBody$Skip$Companion;", "", "()V", "build", "Lcom/tinder/api/request/SuperLikeableActionRequestBody$Skip;", "token", "", "api_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final Skip build(@NotNull String str) {
                C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
                return new Skip(str, null, 2, null);
            }
        }

        @JvmStatic
        @NotNull
        public static final Skip build(@NotNull String str) {
            return Companion.build(str);
        }

        private final String component2() {
            return this.action;
        }

        @NotNull
        public static /* synthetic */ Skip copy$default(Skip skip, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = skip.token;
            }
            if ((i & 2) != 0) {
                str2 = skip.action;
            }
            return skip.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.token;
        }

        @NotNull
        public final Skip copy(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
            C2668g.b(str2, "action");
            return new Skip(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Skip) {
                    Skip skip = (Skip) obj;
                    if (C2668g.a(this.token, skip.token) && C2668g.a(this.action, skip.action)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.token;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.action;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Skip(token=");
            stringBuilder.append(this.token);
            stringBuilder.append(", action=");
            stringBuilder.append(this.action);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Skip(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
            C2668g.b(str2, "action");
            this.token = str;
            this.action = str2;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        public /* synthetic */ Skip(String str, String str2, int i, C15823e c15823e) {
            if ((i & 2) != 0) {
                str2 = "Dismiss";
            }
            this(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/tinder/api/request/SuperLikeableActionRequestBody$SuperLike;", "", "token", "", "recUserId", "recSNumber", "action", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRecSNumber", "()Ljava/lang/String;", "getRecUserId", "getToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class SuperLike {
        public static final Companion Companion = new Companion();
        private final String action;
        @NotNull
        private final String recSNumber;
        @NotNull
        private final String recUserId;
        @NotNull
        private final String token;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/api/request/SuperLikeableActionRequestBody$SuperLike$Companion;", "", "()V", "build", "Lcom/tinder/api/request/SuperLikeableActionRequestBody$SuperLike;", "token", "", "recUserId", "recSNumber", "api_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final SuperLike build(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
                C2668g.b(str2, "recUserId");
                C2668g.b(str3, "recSNumber");
                return new SuperLike(str, str2, str3, null, 8, null);
            }
        }

        @JvmStatic
        @NotNull
        public static final SuperLike build(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            return Companion.build(str, str2, str3);
        }

        private final String component4() {
            return this.action;
        }

        @NotNull
        public static /* synthetic */ SuperLike copy$default(SuperLike superLike, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = superLike.token;
            }
            if ((i & 2) != 0) {
                str2 = superLike.recUserId;
            }
            if ((i & 4) != 0) {
                str3 = superLike.recSNumber;
            }
            if ((i & 8) != 0) {
                str4 = superLike.action;
            }
            return superLike.copy(str, str2, str3, str4);
        }

        @NotNull
        public final String component1() {
            return this.token;
        }

        @NotNull
        public final String component2() {
            return this.recUserId;
        }

        @NotNull
        public final String component3() {
            return this.recSNumber;
        }

        @NotNull
        public final SuperLike copy(@NotNull String str, @NotNull @Json(name = "otherUserId") String str2, @NotNull @Json(name = "s_number") String str3, @NotNull String str4) {
            C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
            C2668g.b(str2, "recUserId");
            C2668g.b(str3, "recSNumber");
            C2668g.b(str4, "action");
            return new SuperLike(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SuperLike) {
                    SuperLike superLike = (SuperLike) obj;
                    if (C2668g.a(this.token, superLike.token) && C2668g.a(this.recUserId, superLike.recUserId) && C2668g.a(this.recSNumber, superLike.recSNumber) && C2668g.a(this.action, superLike.action)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.token;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.recUserId;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.recSNumber;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.action;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SuperLike(token=");
            stringBuilder.append(this.token);
            stringBuilder.append(", recUserId=");
            stringBuilder.append(this.recUserId);
            stringBuilder.append(", recSNumber=");
            stringBuilder.append(this.recSNumber);
            stringBuilder.append(", action=");
            stringBuilder.append(this.action);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public SuperLike(@NotNull String str, @NotNull @Json(name = "otherUserId") String str2, @NotNull @Json(name = "s_number") String str3, @NotNull String str4) {
            C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
            C2668g.b(str2, "recUserId");
            C2668g.b(str3, "recSNumber");
            C2668g.b(str4, "action");
            this.token = str;
            this.recUserId = str2;
            this.recSNumber = str3;
            this.action = str4;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        @NotNull
        public final String getRecUserId() {
            return this.recUserId;
        }

        @NotNull
        public final String getRecSNumber() {
            return this.recSNumber;
        }

        public /* synthetic */ SuperLike(String str, String str2, String str3, String str4, int i, C15823e c15823e) {
            if ((i & 8) != 0) {
                str4 = "Superlike";
            }
            this(str, str2, str3, str4);
        }
    }

    private SuperLikeableActionRequestBody() {
    }
}
