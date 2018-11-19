package com.spotify.sdk.android.authentication;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.sdk.android.authentication.AuthenticationResponse.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AuthenticationRequest implements Parcelable {
    static final String ACCOUNTS_AUTHORITY = "accounts.spotify.com";
    static final String ACCOUNTS_PATH = "authorize";
    static final String ACCOUNTS_SCHEME = "https";
    public static final Creator<AuthenticationRequest> CREATOR = new C59591();
    static final String SCOPES_SEPARATOR = " ";
    private final String mClientId;
    private final Map<String, String> mCustomParams;
    private final String mRedirectUri;
    private final String mResponseType;
    private final String[] mScopes;
    private final boolean mShowDialog;
    private final String mState;

    /* renamed from: com.spotify.sdk.android.authentication.AuthenticationRequest$1 */
    static class C59591 implements Creator<AuthenticationRequest> {
        C59591() {
        }

        public AuthenticationRequest createFromParcel(Parcel parcel) {
            return new AuthenticationRequest(parcel);
        }

        public AuthenticationRequest[] newArray(int i) {
            return new AuthenticationRequest[i];
        }
    }

    public static class Builder {
        private final String mClientId;
        private final Map<String, String> mCustomParams = new HashMap();
        private final String mRedirectUri;
        private final Type mResponseType;
        private String[] mScopes;
        private boolean mShowDialog;
        private String mState;

        public Builder(String str, Type type, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("Client ID can't be null");
            } else if (type == null) {
                throw new IllegalArgumentException("Response type can't be null");
            } else {
                if (str2 != null) {
                    if (str2.length() != 0) {
                        this.mClientId = str;
                        this.mResponseType = type;
                        this.mRedirectUri = str2;
                        return;
                    }
                }
                throw new IllegalArgumentException("Redirect URI can't be null or empty");
            }
        }

        public Builder setState(String str) {
            this.mState = str;
            return this;
        }

        public Builder setScopes(String[] strArr) {
            this.mScopes = strArr;
            return this;
        }

        public Builder setShowDialog(boolean z) {
            this.mShowDialog = z;
            return this;
        }

        public Builder setCustomParam(String str, String str2) {
            if (str != null) {
                if (!str.isEmpty()) {
                    if (str2 != null) {
                        if (!str2.isEmpty()) {
                            this.mCustomParams.put(str, str2);
                            return this;
                        }
                    }
                    throw new IllegalArgumentException("Custom parameter value can't be null or empty");
                }
            }
            throw new IllegalArgumentException("Custom parameter key can't be null or empty");
        }

        public AuthenticationRequest build() {
            return new AuthenticationRequest(this.mClientId, this.mResponseType, this.mRedirectUri, this.mState, this.mScopes, this.mShowDialog, this.mCustomParams);
        }
    }

    static final class QueryParams {
        public static final String CLIENT_ID = "client_id";
        public static final String REDIRECT_URI = "redirect_uri";
        public static final String RESPONSE_TYPE = "response_type";
        public static final String SCOPE = "scope";
        public static final String SHOW_DIALOG = "show_dialog";
        public static final String STATE = "state";

        QueryParams() {
        }
    }

    public int describeContents() {
        return 0;
    }

    public AuthenticationRequest(Parcel parcel) {
        this.mClientId = parcel.readString();
        this.mResponseType = parcel.readString();
        this.mRedirectUri = parcel.readString();
        this.mState = parcel.readString();
        this.mScopes = parcel.createStringArray();
        this.mShowDialog = parcel.readByte() != (byte) 0;
        this.mCustomParams = new HashMap();
        parcel = parcel.readBundle();
        for (String str : parcel.keySet()) {
            this.mCustomParams.put(str, parcel.getString(str));
        }
    }

    public String getClientId() {
        return this.mClientId;
    }

    public String getResponseType() {
        return this.mResponseType;
    }

    public String getRedirectUri() {
        return this.mRedirectUri;
    }

    public String getState() {
        return this.mState;
    }

    public String[] getScopes() {
        return this.mScopes;
    }

    public boolean getShowDialog() {
        return this.mShowDialog;
    }

    public String getCustomParam(String str) {
        return (String) this.mCustomParams.get(str);
    }

    private AuthenticationRequest(String str, Type type, String str2, String str3, String[] strArr, boolean z, Map<String, String> map) {
        this.mClientId = str;
        this.mResponseType = type.toString();
        this.mRedirectUri = str2;
        this.mState = str3;
        this.mScopes = strArr;
        this.mShowDialog = z;
        this.mCustomParams = map;
    }

    public Uri toUri() {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme(ACCOUNTS_SCHEME).authority(ACCOUNTS_AUTHORITY).appendPath(ACCOUNTS_PATH).appendQueryParameter("client_id", this.mClientId).appendQueryParameter(QueryParams.RESPONSE_TYPE, this.mResponseType).appendQueryParameter(QueryParams.REDIRECT_URI, this.mRedirectUri);
        if (this.mScopes != null && this.mScopes.length > 0) {
            builder.appendQueryParameter(QueryParams.SCOPE, scopesToString());
        }
        if (this.mState != null) {
            builder.appendQueryParameter("state", this.mState);
        }
        if (this.mShowDialog) {
            builder.appendQueryParameter(QueryParams.SHOW_DIALOG, "true");
        }
        if (this.mCustomParams.size() > 0) {
            for (Entry entry : this.mCustomParams.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builder.build();
    }

    private String scopesToString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : this.mScopes) {
            stringBuilder.append(append);
            stringBuilder.append(SCOPES_SEPARATOR);
        }
        return stringBuilder.toString().trim();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mClientId);
        parcel.writeString(this.mResponseType);
        parcel.writeString(this.mRedirectUri);
        parcel.writeString(this.mState);
        parcel.writeStringArray(this.mScopes);
        parcel.writeByte((byte) this.mShowDialog);
        i = new Bundle();
        for (Entry entry : this.mCustomParams.entrySet()) {
            i.putString((String) entry.getKey(), (String) entry.getValue());
        }
        parcel.writeBundle(i);
    }
}
