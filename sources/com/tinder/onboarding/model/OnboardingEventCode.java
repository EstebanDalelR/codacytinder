package com.tinder.onboarding.model;

public enum OnboardingEventCode {
    NAME(1),
    BIRTHDAY(2),
    UNDER_AGE(3),
    UNDER_AGE_CERTIFICATION(4),
    BINARY_GENDER(5),
    CUSTOM_GENDER(6),
    GENDER_PREFERENCE(7),
    PHOTO(8),
    CHOOSE_PHOTO_METHOD(9),
    FROM_CAMERA(10),
    FROM_CAMERA_ROLL(11),
    EMAIL(13),
    PASSWORD(14),
    SMS_CONFIRM(15),
    ALLOW_EMAIL_MARKETING(16);
    
    private final int value;

    private OnboardingEventCode(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
