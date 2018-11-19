package com.tinder.interfaces;

import com.tinder.model.GalleryItem;

public interface PhotoGalleryView {
    void showDeviceGallery(GalleryItem galleryItem);

    void showDeviceGalleryError();

    void showFacebookGallery(GalleryItem galleryItem);

    void showFacebookGalleryError();
}
