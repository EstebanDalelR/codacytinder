package com.tinder.model.adapter.domain;

import android.support.annotation.Nullable;
import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.Instagram.Photo;
import com.tinder.model.InstagramPhoto;
import javax.inject.Inject;

class InstagramPhotoLegacyInstagramPhotoAdapter extends C2645i<Photo, InstagramPhoto> {
    @Inject
    InstagramPhotoLegacyInstagramPhotoAdapter() {
    }

    @Nullable
    public Photo adapt(InstagramPhoto instagramPhoto) {
        return Photo.builder().link(instagramPhoto.mLink).timestampMillis(instagramPhoto.mTimestamp).thumbnail(instagramPhoto.mUrlSmall).image(instagramPhoto.mUrlLarge).build();
    }
}
