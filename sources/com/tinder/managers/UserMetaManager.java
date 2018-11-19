package com.tinder.managers;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.model.UserMeta;
import rx.Observable;

@Deprecated
public interface UserMetaManager {
    void clearMetadata();

    void fetchMetaData();

    @Nullable
    UserMeta getMetaUser();

    @NonNull
    Observable<UserMeta> loadMetaData();
}
