package com.tinder.model.adapter.domain;

import dagger.internal.Factory;

public final class PhotoProfilePhotoAdapter_RenderProcessedFileAdapter_Factory implements Factory<RenderProcessedFileAdapter> {
    private static final PhotoProfilePhotoAdapter_RenderProcessedFileAdapter_Factory INSTANCE = new PhotoProfilePhotoAdapter_RenderProcessedFileAdapter_Factory();

    public RenderProcessedFileAdapter get() {
        return provideInstance();
    }

    public static RenderProcessedFileAdapter provideInstance() {
        return new RenderProcessedFileAdapter();
    }

    public static PhotoProfilePhotoAdapter_RenderProcessedFileAdapter_Factory create() {
        return INSTANCE;
    }

    public static RenderProcessedFileAdapter newRenderProcessedFileAdapter() {
        return new RenderProcessedFileAdapter();
    }
}
