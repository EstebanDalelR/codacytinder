package com.tinder.model.adapter.domain;

import dagger.internal.Factory;

public final class InstagramPhotoLegacyInstagramPhotoAdapter_Factory implements Factory<InstagramPhotoLegacyInstagramPhotoAdapter> {
    private static final InstagramPhotoLegacyInstagramPhotoAdapter_Factory INSTANCE = new InstagramPhotoLegacyInstagramPhotoAdapter_Factory();

    public InstagramPhotoLegacyInstagramPhotoAdapter get() {
        return provideInstance();
    }

    public static InstagramPhotoLegacyInstagramPhotoAdapter provideInstance() {
        return new InstagramPhotoLegacyInstagramPhotoAdapter();
    }

    public static InstagramPhotoLegacyInstagramPhotoAdapter_Factory create() {
        return INSTANCE;
    }

    public static InstagramPhotoLegacyInstagramPhotoAdapter newInstagramPhotoLegacyInstagramPhotoAdapter() {
        return new InstagramPhotoLegacyInstagramPhotoAdapter();
    }
}
