package com.tinder.analytics.fireworks;

import android.support.annotation.NonNull;
import rx.Completable;
import rx.Observable;

public interface FireworksRepository {
    @NonNull
    Completable clear();

    @NonNull
    Completable insertEvent(@NonNull C2632i c2632i);

    @NonNull
    Observable<C2632i> loadEvents();
}
