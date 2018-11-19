package com.tinder.smsauth.data.api;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0002"}, d2 = {"Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordResponse;", "", "data", "Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordResponse$Data;", "(Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordResponse$Data;)V", "getData", "()Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordResponse$Data;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Data"}, k = 1, mv = {1, 1, 10})
public final class VerifyOneTimePasswordResponse {
    @Nullable
    private final Data data;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordResponse$Data;", "", "refreshToken", "", "onboardingToken", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getOnboardingToken", "getRefreshToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data"}, k = 1, mv = {1, 1, 10})
    public static final class Data {
        @Nullable
        private final String accessToken;
        @Nullable
        private final String onboardingToken;
        @Nullable
        private final String refreshToken;

        @NotNull
        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.refreshToken;
            }
            if ((i & 2) != 0) {
                str2 = data.onboardingToken;
            }
            if ((i & 4) != 0) {
                str3 = data.accessToken;
            }
            return data.copy(str, str2, str3);
        }

        @Nullable
        public final String component1() {
            return this.refreshToken;
        }

        @Nullable
        public final String component2() {
            return this.onboardingToken;
        }

        @Nullable
        public final String component3() {
            return this.accessToken;
        }

        @NotNull
        public final Data copy(@Nullable @Json(name = "refresh_token") String str, @Nullable @Json(name = "onboarding_token") String str2, @Nullable @Json(name = "api_token") String str3) {
            return new Data(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Data) {
                    Data data = (Data) obj;
                    if (C2668g.a(this.refreshToken, data.refreshToken) && C2668g.a(this.onboardingToken, data.onboardingToken) && C2668g.a(this.accessToken, data.accessToken)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.refreshToken;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.onboardingToken;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.accessToken;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Data(refreshToken=");
            stringBuilder.append(this.refreshToken);
            stringBuilder.append(", onboardingToken=");
            stringBuilder.append(this.onboardingToken);
            stringBuilder.append(", accessToken=");
            stringBuilder.append(this.accessToken);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Data(@Nullable @Json(name = "refresh_token") String str, @Nullable @Json(name = "onboarding_token") String str2, @Nullable @Json(name = "api_token") String str3) {
            this.refreshToken = str;
            this.onboardingToken = str2;
            this.accessToken = str3;
        }

        @Nullable
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        @Nullable
        public final String getOnboardingToken() {
            return this.onboardingToken;
        }

        @Nullable
        public final String getAccessToken() {
            return this.accessToken;
        }
    }

    @NotNull
    public static /* synthetic */ VerifyOneTimePasswordResponse copy$default(VerifyOneTimePasswordResponse verifyOneTimePasswordResponse, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            data = verifyOneTimePasswordResponse.data;
        }
        return verifyOneTimePasswordResponse.copy(data);
    }

    @Nullable
    public final Data component1() {
        return this.data;
    }

    @NotNull
    public final VerifyOneTimePasswordResponse copy(@Nullable @Json(name = "data") Data data) {
        return new VerifyOneTimePasswordResponse(data);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VerifyOneTimePasswordResponse) {
                if (C2668g.a(this.data, ((VerifyOneTimePasswordResponse) obj).data)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Data data = this.data;
        return data != null ? data.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerifyOneTimePasswordResponse(data=");
        stringBuilder.append(this.data);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public VerifyOneTimePasswordResponse(@Nullable @Json(name = "data") Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }
}
