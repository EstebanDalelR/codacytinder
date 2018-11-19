package com.tinder.domain.meta.gateway;

import android.support.annotation.NonNull;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.meta.model.Configuration;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.LegacyMetaContainer;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.ProfileSettings;
import java8.util.Optional;
import rx.Completable;
import rx.Observable;

public interface MetaGateway {
    Completable clear();

    @NonNull
    Completable fetchMeta();

    @NonNull
    Optional<String> getUserId();

    @NonNull
    Observable<Configuration> observeConfiguration();

    @NonNull
    Observable<CurrentUser> observeCurrentUser();

    @Deprecated
    @NonNull
    Observable<Optional<DiscoverySettings>> observeDiscoverySettings();

    @NonNull
    Observable<LegacyMetaContainer> observeMeta();

    @NonNull
    Observable<ProfileSettings> observeProfileSettings();

    @NonNull
    Observable<Subscription> observeSubscription();

    @Deprecated
    @NonNull
    Observable<PlusControlSettings> observeTinderPlusSettings();

    @NonNull
    Completable updateDiscoverySettings(DiscoverySettings discoverySettings);
}
