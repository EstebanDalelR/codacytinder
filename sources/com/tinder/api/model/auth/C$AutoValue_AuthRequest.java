package com.tinder.api.model.auth;

import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.auth.$AutoValue_AuthRequest */
abstract class C$AutoValue_AuthRequest extends AuthRequest {
    private final String accessToken;
    private final String clientVersion;
    private final String id;

    static final class Builder extends com.tinder.api.model.auth.AuthRequest.Builder {
        private String accessToken;
        private String clientVersion;
        private String id;

        Builder() {
        }

        Builder(AuthRequest authRequest) {
            this.accessToken = authRequest.accessToken();
            this.id = authRequest.id();
            this.clientVersion = authRequest.clientVersion();
        }

        public com.tinder.api.model.auth.AuthRequest.Builder accessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public com.tinder.api.model.auth.AuthRequest.Builder id(String str) {
            this.id = str;
            return this;
        }

        public com.tinder.api.model.auth.AuthRequest.Builder clientVersion(String str) {
            this.clientVersion = str;
            return this;
        }

        public AuthRequest build() {
            String str = "";
            if (this.accessToken == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" accessToken");
                str = stringBuilder.toString();
            }
            if (this.id == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.clientVersion == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" clientVersion");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_AuthRequest(this.accessToken, this.id, this.clientVersion);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$AutoValue_AuthRequest(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null accessToken");
        }
        this.accessToken = str;
        if (str2 == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str2;
        if (str3 == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.clientVersion = str3;
    }

    @Json(name = "token")
    public String accessToken() {
        return this.accessToken;
    }

    @Json(name = "id")
    public String id() {
        return this.id;
    }

    @Json(name = "client_version")
    public String clientVersion() {
        return this.clientVersion;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthRequest{accessToken=");
        stringBuilder.append(this.accessToken);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", clientVersion=");
        stringBuilder.append(this.clientVersion);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthRequest)) {
            return false;
        }
        AuthRequest authRequest = (AuthRequest) obj;
        if (!this.accessToken.equals(authRequest.accessToken()) || !this.id.equals(authRequest.id()) || this.clientVersion.equals(authRequest.clientVersion()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.accessToken.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.clientVersion.hashCode();
    }
}
