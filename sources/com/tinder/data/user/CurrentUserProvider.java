package com.tinder.data.user;

import com.tinder.data.ObservingProvider;
import com.tinder.domain.common.model.ProfileUser;
import javax.annotation.Nullable;
import rx.Completable;

public interface CurrentUserProvider extends ObservingProvider<ProfileUser> {
    Completable clear();

    @Deprecated
    @Nullable
    ProfileUser get();

    @Deprecated
    void update(ProfileUser profileUser);
}
