package com.tinder.model.adapter.domain;

import android.support.annotation.Nullable;
import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import java.util.Collections;
import javax.inject.Inject;

class PhotoProfilePhotoAdapter extends C2645i<Photo, ProfilePhoto> {
    private final RenderProcessedFileAdapter renderAdapter;

    static class RenderProcessedFileAdapter extends C2645i<Render, ProcessedPhoto> {
        @Inject
        RenderProcessedFileAdapter() {
        }

        @Nullable
        public Render adapt(ProcessedPhoto processedPhoto) {
            return Render.builder().url(processedPhoto.imageUrl).width(processedPhoto.width).height(processedPhoto.height).build();
        }
    }

    @Inject
    PhotoProfilePhotoAdapter(RenderProcessedFileAdapter renderProcessedFileAdapter) {
        this.renderAdapter = renderProcessedFileAdapter;
    }

    @Nullable
    public Photo adapt(ProfilePhoto profilePhoto) {
        return Photo.builder().id(profilePhoto.photoId).url(profilePhoto.imageUrl).renders(this.renderAdapter.adapt(profilePhoto.processedPhotos)).videos(Collections.emptyList()).build();
    }
}
