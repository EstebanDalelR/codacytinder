package com.tinder.model.auth;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.auth.model.AuthType;
import com.tinder.model.network.ErrorResponse;

public final class AuthException extends RuntimeException {
    private static final String EMPTY_MESSAGE = "";
    private final int mErrorCode;
    private final AuthErrorType mErrorType;
    private final String mUserFacingMessage;

    /* renamed from: com.tinder.model.auth.AuthException$1 */
    static /* synthetic */ class C99351 {
        static final /* synthetic */ int[] $SwitchMap$com$tinder$auth$model$AuthType = new int[AuthType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.auth.model.AuthType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$tinder$auth$model$AuthType = r0;
            r0 = $SwitchMap$com$tinder$auth$model$AuthType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.auth.model.AuthType.FACEBOOK;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$tinder$auth$model$AuthType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.auth.model.AuthType.ACCOUNTKIT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$tinder$auth$model$AuthType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.auth.model.AuthType.TINDER_SMS;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.auth.AuthException.1.<clinit>():void");
        }
    }

    public static AuthException newInstance(@NonNull AuthErrorType authErrorType) {
        return newInstance(authErrorType, "");
    }

    public static AuthException newInstance(@NonNull AuthErrorType authErrorType, @Nullable String str) {
        return new AuthException(authErrorType, str, authErrorType.getInternalCode());
    }

    public static AuthException createNoLongLivedTokenException(@NonNull AuthType authType) {
        switch (C99351.$SwitchMap$com$tinder$auth$model$AuthType[authType.ordinal()]) {
            case 1:
                return newInstance(AuthErrorType.NO_FB_TOKEN, "No Facebook or Tinder long lived token.");
            case 2:
                return newInstance(AuthErrorType.NO_ACCOUNTKIT_TOKEN, "No AccountKit or Tinder long lived token");
            case 3:
                return newInstance(AuthErrorType.INTERNAL_ERROR, "No Tinder long lived token.");
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Third party token or Tinder long lived token was empty or null but no corresponding type was found");
                stringBuilder.append(authType);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static AuthException fromErrorResponse(@Nullable ErrorResponse errorResponse) {
        if (errorResponse != null) {
            if (errorResponse.getData() != null) {
                errorResponse = errorResponse.getData();
                int internalCode = errorResponse.getInternalCode();
                return new AuthException(AuthErrorType.valueOf(internalCode), errorResponse.getMessage(), internalCode);
            }
        }
        AuthErrorType authErrorType = AuthErrorType.UNKNOWN_ERROR;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("error response is empty: ");
        stringBuilder.append(errorResponse);
        return newInstance(authErrorType, stringBuilder.toString());
    }

    public AuthException(AuthErrorType authErrorType, String str, int i) {
        super(str);
        this.mErrorType = authErrorType;
        this.mUserFacingMessage = str;
        this.mErrorCode = i;
    }

    public AuthErrorType getErrorType() {
        return this.mErrorType;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getMessage() {
        return toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthException{mErrorType=");
        stringBuilder.append(this.mErrorType);
        stringBuilder.append(", mUserFacingMessage='");
        stringBuilder.append(this.mUserFacingMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", mErrorCode=");
        stringBuilder.append(this.mErrorCode);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                AuthException authException = (AuthException) obj;
                if (this.mErrorCode != authException.mErrorCode || this.mErrorType != authException.mErrorType) {
                    return false;
                }
                if (this.mUserFacingMessage != null) {
                    z = this.mUserFacingMessage.equals(authException.mUserFacingMessage);
                } else if (authException.mUserFacingMessage != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.mErrorType != null ? this.mErrorType.hashCode() : 0) * 31;
        if (this.mUserFacingMessage != null) {
            i = this.mUserFacingMessage.hashCode();
        }
        return ((hashCode + i) * 31) + this.mErrorCode;
    }
}
