package com.tinder.model;

import java.util.List;

public class ProcessingPhotos {
    private boolean isPhotoProcessing;
    private List<ProfilePhoto> profilePhotos;

    public ProcessingPhotos(List<ProfilePhoto> list, boolean z) {
        this.profilePhotos = list;
        this.isPhotoProcessing = z;
    }

    public List<ProfilePhoto> getProfilePhotos() {
        return this.profilePhotos;
    }

    public boolean isPhotoProcessing() {
        return this.isPhotoProcessing;
    }
}
