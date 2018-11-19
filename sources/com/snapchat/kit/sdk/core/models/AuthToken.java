package com.snapchat.kit.sdk.core.models;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.apache.commons.lang3.builder.C17715c;
import org.apache.commons.lang3.builder.C17716d;
import org.apache.commons.lang3.builder.C17717f;

public class AuthToken implements Serializable {
    @SerializedName("access_token")
    @Expose
    private String mAccessToken;
    @SerializedName("expires_in")
    @Expose
    private long mExpiresIn;
    @SerializedName("last_updated")
    @Expose
    private long mLastUpdated;
    @SerializedName("refresh_token")
    @Expose
    private String mRefreshToken;
    @SerializedName("token_type")
    @Expose
    private String mTokenType;

    public AuthToken(String str) {
        this.mAccessToken = str;
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public String getTokenType() {
        return this.mTokenType;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public long getExpiresIn() {
        return this.mExpiresIn;
    }

    public long getExpiresInMillis() {
        return this.mExpiresIn * 1000;
    }

    public long getLastUpdated() {
        return this.mLastUpdated;
    }

    public void setLastUpdated(long j) {
        this.mLastUpdated = j;
    }

    public String toJson() {
        return new Gson().toJson((Object) this);
    }

    public String toString() {
        return C17717f.c(this);
    }

    public int hashCode() {
        return new C17716d().a(this.mAccessToken).a(this.mTokenType).a(this.mRefreshToken).a(this.mExpiresIn).a(this.mLastUpdated).a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthToken)) {
            return null;
        }
        AuthToken authToken = (AuthToken) obj;
        return new C17715c().a(this.mAccessToken, authToken.mAccessToken).a(this.mTokenType, authToken.mTokenType).a(this.mRefreshToken, authToken.mRefreshToken).a(this.mExpiresIn, authToken.mExpiresIn).a(this.mLastUpdated, authToken.mLastUpdated).a();
    }
}
