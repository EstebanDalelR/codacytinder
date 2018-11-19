package com.tinder.account.model;

public enum UpdateAccountErrorType {
    UNKNOWN(-1),
    INTERNAL(500),
    PASSWORD_NO_DIGITS(40023),
    PASSWORD_NO_LETTERS(40024),
    PASSWORD_TOO_SHORT(40025),
    PASSWORD_TOO_LONG(40026),
    PASSWORD_TOO_SIMPLE(40027),
    PASSWORD_REPEATING_CHARS(40028),
    PASSWORD_INVALID_TYPE(40029),
    INVALID_EMAIL(40030),
    UNAUTHORIZED_UPDATE(40312),
    PASSWORD_HASH_FAILURE(50031);
    
    private final int internalCode;

    public static UpdateAccountErrorType valueOf(int i) {
        for (UpdateAccountErrorType updateAccountErrorType : values()) {
            if (updateAccountErrorType.getInternalCode() == i) {
                return updateAccountErrorType;
            }
        }
        return UNKNOWN;
    }

    private UpdateAccountErrorType(int i) {
        this.internalCode = i;
    }

    public int getInternalCode() {
        return this.internalCode;
    }
}
