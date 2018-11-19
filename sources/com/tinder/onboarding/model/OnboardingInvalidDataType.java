package com.tinder.onboarding.model;

public enum OnboardingInvalidDataType {
    UNKNOWN(-1),
    INVALID_ONBOARDING_ID(40001),
    MALFORMED_DATA(40002),
    INVALID_BIRTH_DATE(40003),
    INVALID_GENDER(40004),
    INVALID_CUSTOM_GENDER(40005),
    NAME_TOO_LONG(40006),
    INVALID_FIELD(40007),
    MISSING_FIELDS(40008),
    INVALID_CHARACTERS(40009),
    INAPPROPRIATE_PHRASES(40010),
    INVALID_SHOW_GENDER_FLAG(40011),
    INVALID_PHOTO(40012),
    INVALID_SCHEMA(40013),
    PASSWORD_NO_DIGITS(40031),
    PASSWORD_NO_LETTERS(40032),
    PASSWORD_TOO_SHORT(40033),
    PASSWORD_TOO_LONG(40034),
    PASSWORD_TOO_SIMPLE(40035),
    PASSWORD_REPEATING_CHARS(40036),
    PASSWORD_INVALID_TYPE(40037),
    INVALID_EMAIL(40038);
    
    private final int internalCode;

    public static OnboardingInvalidDataType fromInternalCode(int i) {
        for (OnboardingInvalidDataType onboardingInvalidDataType : values()) {
            if (i == onboardingInvalidDataType.getInternalCode()) {
                return onboardingInvalidDataType;
            }
        }
        return UNKNOWN;
    }

    private OnboardingInvalidDataType(int i) {
        this.internalCode = i;
    }

    public int getInternalCode() {
        return this.internalCode;
    }
}
