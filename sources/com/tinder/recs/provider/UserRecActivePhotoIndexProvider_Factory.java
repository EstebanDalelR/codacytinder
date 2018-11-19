package com.tinder.recs.provider;

import dagger.internal.Factory;

public final class UserRecActivePhotoIndexProvider_Factory implements Factory<UserRecActivePhotoIndexProvider> {
    private static final UserRecActivePhotoIndexProvider_Factory INSTANCE = new UserRecActivePhotoIndexProvider_Factory();

    public UserRecActivePhotoIndexProvider get() {
        return provideInstance();
    }

    public static UserRecActivePhotoIndexProvider provideInstance() {
        return new UserRecActivePhotoIndexProvider();
    }

    public static UserRecActivePhotoIndexProvider_Factory create() {
        return INSTANCE;
    }

    public static UserRecActivePhotoIndexProvider newUserRecActivePhotoIndexProvider() {
        return new UserRecActivePhotoIndexProvider();
    }
}
