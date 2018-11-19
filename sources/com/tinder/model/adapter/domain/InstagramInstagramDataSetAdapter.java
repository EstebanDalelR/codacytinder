package com.tinder.model.adapter.domain;

import android.support.annotation.Nullable;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.Instagram;
import com.tinder.model.InstagramDataSet;
import java8.util.Optional;
import javax.inject.Inject;

class InstagramInstagramDataSetAdapter extends C2645i<Instagram, InstagramDataSet> {
    private final C10738l dateTimeAdapter;
    private final InstagramPhotoLegacyInstagramPhotoAdapter photoAdapter;

    @Inject
    InstagramInstagramDataSetAdapter(C10738l c10738l, InstagramPhotoLegacyInstagramPhotoAdapter instagramPhotoLegacyInstagramPhotoAdapter) {
        this.dateTimeAdapter = c10738l;
        this.photoAdapter = instagramPhotoLegacyInstagramPhotoAdapter;
    }

    @Nullable
    public Instagram adapt(InstagramDataSet instagramDataSet) {
        if (!(instagramDataSet == null || instagramDataSet.photos == null)) {
            if (!instagramDataSet.photos.isEmpty()) {
                return Instagram.builder().username(instagramDataSet.username).profilePicture(instagramDataSet.profileImageUrl).mediaCount(instagramDataSet.mediaCount).photos(this.photoAdapter.adapt(instagramDataSet.photos)).completedInitialFetch(false).lastFetchedTime(Optional.b(this.dateTimeAdapter.m43129a(instagramDataSet.lastFetchTime))).build();
            }
        }
        return null;
    }
}
