package com.tinder.interactors.p262a;

import com.tinder.api.model.common.Instagram;
import com.tinder.api.model.common.Instagram.Photo;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.InstagramPhoto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;

/* renamed from: com.tinder.interactors.a.c */
public class C9709c {
    /* renamed from: a */
    public InstagramDataSet m40182a(Instagram instagram) {
        if (instagram == null) {
            return null;
        }
        InstagramDataSet instagramDataSet = new InstagramDataSet();
        instagramDataSet.lastFetchTime = instagram.lastFetchTime();
        instagramDataSet.username = instagram.username();
        instagramDataSet.profileImageUrl = instagram.profilePicture();
        instagramDataSet.mediaCount = ((Integer) Objects.b(instagram.mediaCount(), Integer.valueOf(0))).intValue();
        instagramDataSet.photos = m40183a(instagram.photos());
        return instagramDataSet;
    }

    /* renamed from: a */
    public List<InstagramPhoto> m40183a(List<Photo> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<InstagramPhoto> arrayList = new ArrayList(list.size());
        for (Photo photo : list) {
            InstagramPhoto instagramPhoto = new InstagramPhoto();
            instagramPhoto.mTimestamp = photo.ts() * 1000;
            instagramPhoto.mLink = photo.link();
            instagramPhoto.mUrlLarge = photo.image();
            instagramPhoto.mUrlSmall = photo.thumbnail();
            arrayList.add(instagramPhoto);
        }
        return arrayList;
    }
}
