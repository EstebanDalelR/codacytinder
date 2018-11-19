package com.tinder.analytics.fireworks;

import javax.annotation.Nonnull;
import rx.Observable;

public interface FireworksNetworkClient {
    Observable<Boolean> sendEvents(@Nonnull Iterable<C2632i> iterable);
}
