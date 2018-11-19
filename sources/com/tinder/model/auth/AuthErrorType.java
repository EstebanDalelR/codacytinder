package com.tinder.model.auth;

public enum AuthErrorType {
    UNKNOWN_ERROR(-1),
    INTERNAL_ERROR(500),
    NO_FB_TOKEN(40001),
    NO_ACCOUNTKIT_TOKEN(40002),
    UNDERAGE(40301),
    BLACK_LISTED(40303),
    FB_PERMISSION_DENIED(40310),
    OUTDATED_CLIENT_VERSION(40304);
    
    private final int mInternalCode;

    public static AuthErrorType valueOf(int i) {
        for (AuthErrorType authErrorType : values()) {
            if (i == authErrorType.getInternalCode()) {
                return authErrorType;
            }
        }
        return UNKNOWN_ERROR;
    }

    private AuthErrorType(int i) {
        this.mInternalCode = i;
    }

    public int getInternalCode() {
        return this.mInternalCode;
    }
}
