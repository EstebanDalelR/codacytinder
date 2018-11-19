package com.tinder.model.adapter.domain;

import com.tinder.data.adapter.C10738l;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class InstagramInstagramDataSetAdapter_Factory implements Factory<InstagramInstagramDataSetAdapter> {
    private final Provider<C10738l> dateTimeAdapterProvider;
    private final Provider<InstagramPhotoLegacyInstagramPhotoAdapter> photoAdapterProvider;

    public InstagramInstagramDataSetAdapter_Factory(Provider<C10738l> provider, Provider<InstagramPhotoLegacyInstagramPhotoAdapter> provider2) {
        this.dateTimeAdapterProvider = provider;
        this.photoAdapterProvider = provider2;
    }

    public InstagramInstagramDataSetAdapter get() {
        return provideInstance(this.dateTimeAdapterProvider, this.photoAdapterProvider);
    }

    public static InstagramInstagramDataSetAdapter provideInstance(Provider<C10738l> provider, Provider<InstagramPhotoLegacyInstagramPhotoAdapter> provider2) {
        return new InstagramInstagramDataSetAdapter((C10738l) provider.get(), (InstagramPhotoLegacyInstagramPhotoAdapter) provider2.get());
    }

    public static InstagramInstagramDataSetAdapter_Factory create(Provider<C10738l> provider, Provider<InstagramPhotoLegacyInstagramPhotoAdapter> provider2) {
        return new InstagramInstagramDataSetAdapter_Factory(provider, provider2);
    }

    public static InstagramInstagramDataSetAdapter newInstagramInstagramDataSetAdapter(C10738l c10738l, Object obj) {
        return new InstagramInstagramDataSetAdapter(c10738l, (InstagramPhotoLegacyInstagramPhotoAdapter) obj);
    }
}
