package com.spotify.sdk.android.authentication;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tinder.api.ManagerWebServices;

public class AuthenticationResponse implements Parcelable {
    public static final Creator<AuthenticationResponse> CREATOR = new C59601();
    private final String mAccessToken;
    private final String mCode;
    private final String mError;
    private final int mExpiresIn;
    private final String mState;
    private final Type mType;

    /* renamed from: com.spotify.sdk.android.authentication.AuthenticationResponse$1 */
    static class C59601 implements Creator<AuthenticationResponse> {
        C59601() {
        }

        public AuthenticationResponse createFromParcel(Parcel parcel) {
            return new AuthenticationResponse(parcel);
        }

        public AuthenticationResponse[] newArray(int i) {
            return new AuthenticationResponse[i];
        }
    }

    public static class Builder {
        private String mAccessToken;
        private String mCode;
        private String mError;
        private int mExpiresIn;
        private String mState;
        private Type mType;

        public Builder setType(Type type) {
            this.mType = type;
            return this;
        }

        public Builder setCode(String str) {
            this.mCode = str;
            return this;
        }

        public Builder setAccessToken(String str) {
            this.mAccessToken = str;
            return this;
        }

        public Builder setState(String str) {
            this.mState = str;
            return this;
        }

        public Builder setError(String str) {
            this.mError = str;
            return this;
        }

        public Builder setExpiresIn(int i) {
            this.mExpiresIn = i;
            return this;
        }

        public AuthenticationResponse build() {
            return new AuthenticationResponse(this.mType, this.mCode, this.mAccessToken, this.mState, this.mError, this.mExpiresIn);
        }
    }

    static final class QueryParams {
        public static final String ACCESS_TOKEN = "access_token";
        public static final String CODE = "code";
        public static final String ERROR = "error";
        public static final String EXPIRES_IN = "expires_in";
        public static final String STATE = "state";

        QueryParams() {
        }
    }

    public enum Type {
        CODE("code"),
        TOKEN(ManagerWebServices.PARAM_TOKEN),
        ERROR("error"),
        EMPTY("empty"),
        UNKNOWN("unknown");
        
        private final String mType;

        private Type(String str) {
            this.mType = str;
        }

        public String toString() {
            return this.mType;
        }
    }

    public int describeContents() {
        return 0;
    }

    private AuthenticationResponse(Type type, String str, String str2, String str3, String str4, int i) {
        if (type == null) {
            type = Type.UNKNOWN;
        }
        this.mType = type;
        this.mCode = str;
        this.mAccessToken = str2;
        this.mState = str3;
        this.mError = str4;
        this.mExpiresIn = i;
    }

    public AuthenticationResponse(Parcel parcel) {
        this.mExpiresIn = parcel.readInt();
        this.mError = parcel.readString();
        this.mState = parcel.readString();
        this.mAccessToken = parcel.readString();
        this.mCode = parcel.readString();
        this.mType = Type.values()[parcel.readInt()];
    }

    public static com.spotify.sdk.android.authentication.AuthenticationResponse fromUri(android.net.Uri r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new com.spotify.sdk.android.authentication.AuthenticationResponse$Builder;
        r0.<init>();
        if (r11 != 0) goto L_0x0011;
    L_0x0007:
        r11 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.EMPTY;
        r0.setType(r11);
        r11 = r0.build();
        return r11;
    L_0x0011:
        r1 = "error";
        r1 = r11.getQueryParameter(r1);
        if (r1 == 0) goto L_0x002f;
    L_0x0019:
        r2 = "state";
        r11 = r11.getQueryParameter(r2);
        r0.setError(r1);
        r0.setState(r11);
        r11 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.ERROR;
        r0.setType(r11);
        r11 = r0.build();
        return r11;
    L_0x002f:
        r1 = "code";
        r1 = r11.getQueryParameter(r1);
        if (r1 == 0) goto L_0x004d;
    L_0x0037:
        r2 = "state";
        r11 = r11.getQueryParameter(r2);
        r0.setCode(r1);
        r0.setState(r11);
        r11 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.CODE;
        r0.setType(r11);
        r11 = r0.build();
        return r11;
    L_0x004d:
        r11 = r11.getEncodedFragment();
        if (r11 == 0) goto L_0x00c1;
    L_0x0053:
        r1 = r11.length();
        if (r1 <= 0) goto L_0x00c1;
    L_0x0059:
        r1 = "&";
        r11 = r11.split(r1);
        r1 = r11.length;
        r2 = 0;
        r3 = 0;
        r4 = r2;
        r5 = r4;
        r6 = r5;
        r2 = 0;
    L_0x0066:
        if (r2 >= r1) goto L_0x00a8;
    L_0x0068:
        r7 = r11[r2];
        r8 = "=";
        r7 = r7.split(r8);
        r8 = r7.length;
        r9 = 2;
        if (r8 != r9) goto L_0x00a5;
    L_0x0074:
        r8 = r7[r3];
        r9 = "access_token";
        r8 = r8.startsWith(r9);
        r9 = 1;
        if (r8 == 0) goto L_0x0085;
    L_0x007f:
        r4 = r7[r9];
        r4 = android.net.Uri.decode(r4);
    L_0x0085:
        r8 = r7[r3];
        r10 = "state";
        r8 = r8.startsWith(r10);
        if (r8 == 0) goto L_0x0095;
    L_0x008f:
        r5 = r7[r9];
        r5 = android.net.Uri.decode(r5);
    L_0x0095:
        r8 = r7[r3];
        r10 = "expires_in";
        r8 = r8.startsWith(r10);
        if (r8 == 0) goto L_0x00a5;
    L_0x009f:
        r6 = r7[r9];
        r6 = android.net.Uri.decode(r6);
    L_0x00a5:
        r2 = r2 + 1;
        goto L_0x0066;
    L_0x00a8:
        r0.setAccessToken(r4);
        r0.setState(r5);
        if (r6 == 0) goto L_0x00b7;
    L_0x00b0:
        r11 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00b7 }
        r0.setExpiresIn(r11);	 Catch:{ NumberFormatException -> 0x00b7 }
    L_0x00b7:
        r11 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.TOKEN;
        r0.setType(r11);
        r11 = r0.build();
        return r11;
    L_0x00c1:
        r11 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.UNKNOWN;
        r0.setType(r11);
        r11 = r0.build();
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.sdk.android.authentication.AuthenticationResponse.fromUri(android.net.Uri):com.spotify.sdk.android.authentication.AuthenticationResponse");
    }

    public Type getType() {
        return this.mType;
    }

    public String getCode() {
        return this.mCode;
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public String getState() {
        return this.mState;
    }

    public String getError() {
        return this.mError;
    }

    public int getExpiresIn() {
        return this.mExpiresIn;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mExpiresIn);
        parcel.writeString(this.mError);
        parcel.writeString(this.mState);
        parcel.writeString(this.mAccessToken);
        parcel.writeString(this.mCode);
        parcel.writeInt(this.mType.ordinal());
    }
}
