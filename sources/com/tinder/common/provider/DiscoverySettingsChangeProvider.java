package com.tinder.common.provider;

import java8.util.Optional;
import rx.Observable;

public interface DiscoverySettingsChangeProvider {
    Observable<Optional<?>> observeDiscoverySettingsChanges();
}
