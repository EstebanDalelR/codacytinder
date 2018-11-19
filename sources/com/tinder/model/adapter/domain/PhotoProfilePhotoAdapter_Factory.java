package com.tinder.model.adapter.domain;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class PhotoProfilePhotoAdapter_Factory implements Factory<PhotoProfilePhotoAdapter> {
    private final Provider<RenderProcessedFileAdapter> renderAdapterProvider;

    public PhotoProfilePhotoAdapter_Factory(Provider<RenderProcessedFileAdapter> provider) {
        this.renderAdapterProvider = provider;
    }

    public PhotoProfilePhotoAdapter get() {
        return provideInstance(this.renderAdapterProvider);
    }

    public static PhotoProfilePhotoAdapter provideInstance(Provider<RenderProcessedFileAdapter> provider) {
        return new PhotoProfilePhotoAdapter((RenderProcessedFileAdapter) provider.get());
    }

    public static PhotoProfilePhotoAdapter_Factory create(Provider<RenderProcessedFileAdapter> provider) {
        return new PhotoProfilePhotoAdapter_Factory(provider);
    }

    public static PhotoProfilePhotoAdapter newPhotoProfilePhotoAdapter(Object obj) {
        return new PhotoProfilePhotoAdapter((RenderProcessedFileAdapter) obj);
    }
}
