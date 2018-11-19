package com.tinder.events;

import com.tinder.model.ProfilePhoto;
import java.util.List;

public class EventPhotosProcessed {
    private List<ProfilePhoto> mProfilePhotos;

    public EventPhotosProcessed(List<ProfilePhoto> list) {
        this.mProfilePhotos = list;
    }

    public List<ProfilePhoto> getProfilePhotos() {
        return this.mProfilePhotos;
    }
}
