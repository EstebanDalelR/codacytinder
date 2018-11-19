package com.tinder.enums;

import android.support.annotation.Nullable;

public enum Gender {
    MALE(0),
    FEMALE(1),
    UNKNOWN(-1);
    
    private int backendId;
    private String mMoreGender;

    private Gender(int i) {
        this.backendId = i;
    }

    public int getBackendId() {
        return this.backendId;
    }

    @Nullable
    public String toString() {
        switch (this) {
            case MALE:
                return "male";
            case FEMALE:
                return "female";
            case UNKNOWN:
                return "Unknown";
            default:
                return null;
        }
    }

    @Nullable
    public static Gender fromBackendId(int i) {
        switch (i) {
            case -1:
                return UNKNOWN;
            case 0:
                return MALE;
            case 1:
                return FEMALE;
            default:
                return 0;
        }
    }

    @Deprecated
    public void setMoreGender(@Nullable String str) {
        this.mMoreGender = str;
    }

    @Nullable
    public String getMoreGender() {
        return this.mMoreGender;
    }
}
