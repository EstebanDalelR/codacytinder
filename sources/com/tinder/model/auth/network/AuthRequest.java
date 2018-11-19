package com.tinder.model.auth.network;

import com.google.gson.annotations.SerializedName;
import com.tinder.auth.model.AuthType;
import com.tinder.managers.ManagerApp;
import javax.annotation.Nullable;

public class AuthRequest {
    @SerializedName("token")
    private final String accessToken;
    private final transient AuthType authType;
    @SerializedName("client_version")
    private final String clientVersion;
    @SerializedName("id")
    private final String id;
    @SerializedName("refresh_token")
    private final String refreshToken;

    public AuthRequest(AuthType authType, String str) {
        this(null, null, authType, str);
    }

    public AuthRequest(@Nullable String str, @Nullable String str2, AuthType authType) {
        this(str, str2, authType, null);
    }

    public AuthRequest(@Nullable String str, @Nullable String str2, AuthType authType, @Nullable String str3) {
        this.accessToken = str;
        this.id = str2;
        this.authType = authType;
        this.clientVersion = ManagerApp.f12346b;
        this.refreshToken = str3;
    }

    public AuthType getAuthType() {
        return this.authType;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getId() {
        return this.id;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthRequest{accessToken='");
        stringBuilder.append(this.accessToken);
        stringBuilder.append('\'');
        stringBuilder.append(", refreshToken='");
        stringBuilder.append(this.refreshToken);
        stringBuilder.append('\'');
        stringBuilder.append(", id='");
        stringBuilder.append(this.id);
        stringBuilder.append('\'');
        stringBuilder.append(", clientVersion='");
        stringBuilder.append(this.clientVersion);
        stringBuilder.append('\'');
        stringBuilder.append(", authType=");
        stringBuilder.append(this.authType);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
