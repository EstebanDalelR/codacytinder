package com.tinder.data.user;

import com.tinder.data.ObservingProvider;
import rx.Completable;

public interface CurrentUserIdProvider extends ObservingProvider<String> {
    Completable clear();
}
