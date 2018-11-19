package com.tinder.common.provider;

import com.tinder.model.PingLocation;
import javax.inject.Singleton;
import rx.Observable;

@Singleton
public interface LocationPingUpdatesProvider {
    Observable<PingLocation> observeLocationPingUpdates();
}
