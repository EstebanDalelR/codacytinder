package com.tinder.listeners;

import com.tinder.model.ProfilePhoto;
import java.util.List;

public interface ListenerPhoto {
    void onAddPhotoFailure(int i, ProfilePhoto profilePhoto);

    void onAddPhotoSuccess(int i, ProfilePhoto profilePhoto, int i2);

    void onDeletePhotoFailure(int i);

    void onDeletePhotoSuccess(int i);

    void onDeletePhotosSuccess(List<Integer> list);

    void onSetMainPhotoFailure(int i, int i2);

    void onSetMainPhotoSuccess(int i, int i2);

    void onSetPhotoOrderFailure();

    void onSetPhotoOrderSuccess();

    void onSwapPhotosFailure();

    void onSwapPhotosSuccess();
}
