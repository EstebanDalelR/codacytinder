package com.tinder.interfaces;

import com.tinder.model.GalleryItem.Source;

public interface PhotoUploadSelection {
    void cropDevicePhoto(String str);

    void cropFbPhoto(String str, String str2, String str3);

    void showAlbums(Source source);

    void showGalleries();

    void showPhotos(String str, String str2);
}
