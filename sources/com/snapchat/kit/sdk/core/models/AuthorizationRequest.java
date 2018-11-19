package com.snapchat.kit.sdk.core.models;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tinder.api.ManagerWebServices;
import java.io.Serializable;
import org.apache.commons.lang3.builder.C17715c;
import org.apache.commons.lang3.builder.C17716d;
import org.apache.commons.lang3.builder.C17717f;

public class AuthorizationRequest implements Serializable {
    @SerializedName("mClientId")
    @Expose
    private String mClientId;
    @SerializedName("mCodeChallenge")
    @Expose
    private String mCodeChallenge;
    @SerializedName("mCodeChallengeMethod")
    @Expose
    private String mCodeChallengeMethod;
    @SerializedName("mCodeVerifier")
    @Expose
    private String mCodeVerifier;
    @SerializedName("mRedirectUri")
    @Expose
    private String mRedirectUri;
    @SerializedName("mResponseType")
    @Expose
    private String mResponseType;
    @SerializedName("mScope")
    @Expose
    private String mScope;
    @SerializedName("mState")
    @Expose
    private String mState;

    public String getResponseType() {
        return this.mResponseType;
    }

    public AuthorizationRequest withResponseType(String str) {
        this.mResponseType = str;
        return this;
    }

    public AuthorizationRequest withClientId(String str) {
        this.mClientId = str;
        return this;
    }

    public AuthorizationRequest withScope(String str) {
        this.mScope = str;
        return this;
    }

    public String getRedirectUri() {
        return this.mRedirectUri;
    }

    public AuthorizationRequest withRedirectUri(String str) {
        this.mRedirectUri = str;
        return this;
    }

    public String getState() {
        return this.mState;
    }

    public AuthorizationRequest withState(String str) {
        this.mState = str;
        return this;
    }

    public String getCodeVerifier() {
        return this.mCodeVerifier;
    }

    public AuthorizationRequest withCodeVerifier(String str) {
        this.mCodeVerifier = str;
        return this;
    }

    public AuthorizationRequest withCodeChallengeMethod(String str) {
        this.mCodeChallengeMethod = str;
        return this;
    }

    public AuthorizationRequest withCodeChallenge(String str) {
        this.mCodeChallenge = str;
        return this;
    }

    public String toJson() {
        return new Gson().toJson((Object) this);
    }

    public Uri toUri(@Nullable String str, @NonNull String str2, @Nullable String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "https://accounts.snapchat.com/accounts";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        str = Uri.parse(stringBuilder.toString()).buildUpon().appendQueryParameter(QueryParams.RESPONSE_TYPE, this.mResponseType).appendQueryParameter("client_id", this.mClientId).appendQueryParameter(QueryParams.REDIRECT_URI, this.mRedirectUri).appendQueryParameter(QueryParams.SCOPE, this.mScope).appendQueryParameter("state", this.mState).appendQueryParameter("code_challenge_method", this.mCodeChallengeMethod).appendQueryParameter("code_challenge", this.mCodeChallenge);
        if (TextUtils.isEmpty(str3) == null) {
            str.appendQueryParameter("package_name", str3);
        }
        str.appendQueryParameter("kit_version", "1.0.2");
        str.appendQueryParameter(ManagerWebServices.IG_PARAM_LINK, this.mClientId);
        return str.build();
    }

    public String toString() {
        return C17717f.c(this);
    }

    public int hashCode() {
        return new C17716d().a(this.mResponseType).a(this.mClientId).a(this.mScope).a(this.mRedirectUri).a(this.mState).a(this.mCodeVerifier).a(this.mCodeChallengeMethod).a(this.mCodeChallenge).a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorizationRequest)) {
            return null;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        return new C17715c().a(this.mResponseType, authorizationRequest.mResponseType).a(this.mClientId, authorizationRequest.mClientId).a(this.mScope, authorizationRequest.mScope).a(this.mRedirectUri, authorizationRequest.mRedirectUri).a(this.mState, authorizationRequest.mState).a(this.mCodeVerifier, authorizationRequest.mCodeVerifier).a(this.mCodeChallengeMethod, authorizationRequest.mCodeChallengeMethod).a(this.mCodeChallenge, authorizationRequest.mCodeChallenge).a();
    }
}
