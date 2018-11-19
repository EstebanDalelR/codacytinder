package com.tinder.model.auth;

public abstract class AccountConfig {
    public abstract boolean needPassword();

    public static AccountConfig newInstance(boolean z) {
        return new AutoValue_AccountConfig(z);
    }
}
