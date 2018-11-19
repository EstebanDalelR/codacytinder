package com.tinder.domain.meta.gateway;

import android.support.annotation.NonNull;
import com.tinder.domain.meta.model.BoostSettings;
import com.tinder.domain.meta.model.SelectSettings;
import com.tinder.domain.meta.model.SpotifySettings;
import rx.Completable;
import rx.Observable;

public interface ProfileGateway {
    void clear();

    @NonNull
    Completable fetchBoostSettings();

    @NonNull
    Completable fetchSelectSettings();

    @NonNull
    Completable fetchSpotifySettings();

    @NonNull
    Observable<BoostSettings> loadBoostSettings();

    @NonNull
    Observable<SelectSettings> loadSelectSettings();

    @NonNull
    Observable<SpotifySettings> loadSpotifySettings();
}
