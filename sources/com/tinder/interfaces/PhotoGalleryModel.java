package com.tinder.interfaces;

import com.tinder.model.FacebookAlbum;
import com.tinder.model.GalleryItem;
import java.util.List;

public interface PhotoGalleryModel {

    public interface ListenerFacebookPhotos {
        void onFailure();

        void onSuccess(List<FacebookAlbum> list, FacebookAlbum facebookAlbum);
    }

    public interface ListenerGallery {
        void onFailure();

        void onSuccess(GalleryItem galleryItem);
    }

    void getDeviceGallery(ListenerGallery listenerGallery);

    void getFacebookGallery(ListenerGallery listenerGallery);
}
