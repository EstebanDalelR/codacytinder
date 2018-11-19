package com.tinder.recs.presenter;

import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.C11813p;
import com.tinder.recs.analytics.AddRecsAllPhotosViewedEvent;
import com.tinder.recs.analytics.AddRecsPhotoViewEvent;
import com.tinder.recs.analytics.RecsPhotosViewedCache;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TappyUserRecCardPresenter_Factory implements Factory<TappyUserRecCardPresenter> {
    private final Provider<AddRecsAllPhotosViewedEvent> addAllRecsPhotoViewEventProvider;
    private final Provider<AddRecsPhotoViewEvent> addRecsPhotoViewEventProvider;
    private final Provider<C11811o> observeFireboardingConfigProvider;
    private final Provider<C11813p> observeIsSuperLikeEnabledProvider;
    private final Provider<RecsPhotosViewedCache> recsPhotosViewedCacheProvider;

    public TappyUserRecCardPresenter_Factory(Provider<AddRecsPhotoViewEvent> provider, Provider<AddRecsAllPhotosViewedEvent> provider2, Provider<RecsPhotosViewedCache> provider3, Provider<C11811o> provider4, Provider<C11813p> provider5) {
        this.addRecsPhotoViewEventProvider = provider;
        this.addAllRecsPhotoViewEventProvider = provider2;
        this.recsPhotosViewedCacheProvider = provider3;
        this.observeFireboardingConfigProvider = provider4;
        this.observeIsSuperLikeEnabledProvider = provider5;
    }

    public TappyUserRecCardPresenter get() {
        return provideInstance(this.addRecsPhotoViewEventProvider, this.addAllRecsPhotoViewEventProvider, this.recsPhotosViewedCacheProvider, this.observeFireboardingConfigProvider, this.observeIsSuperLikeEnabledProvider);
    }

    public static TappyUserRecCardPresenter provideInstance(Provider<AddRecsPhotoViewEvent> provider, Provider<AddRecsAllPhotosViewedEvent> provider2, Provider<RecsPhotosViewedCache> provider3, Provider<C11811o> provider4, Provider<C11813p> provider5) {
        return new TappyUserRecCardPresenter((AddRecsPhotoViewEvent) provider.get(), (AddRecsAllPhotosViewedEvent) provider2.get(), (RecsPhotosViewedCache) provider3.get(), (C11811o) provider4.get(), (C11813p) provider5.get());
    }

    public static TappyUserRecCardPresenter_Factory create(Provider<AddRecsPhotoViewEvent> provider, Provider<AddRecsAllPhotosViewedEvent> provider2, Provider<RecsPhotosViewedCache> provider3, Provider<C11811o> provider4, Provider<C11813p> provider5) {
        return new TappyUserRecCardPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static TappyUserRecCardPresenter newTappyUserRecCardPresenter(AddRecsPhotoViewEvent addRecsPhotoViewEvent, AddRecsAllPhotosViewedEvent addRecsAllPhotosViewedEvent, RecsPhotosViewedCache recsPhotosViewedCache, C11811o c11811o, C11813p c11813p) {
        return new TappyUserRecCardPresenter(addRecsPhotoViewEvent, addRecsAllPhotosViewedEvent, recsPhotosViewedCache, c11811o, c11813p);
    }
}
