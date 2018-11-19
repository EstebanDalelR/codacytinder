package com.tinder.recs.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.aj;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.RecCardViewHolderFactory;
import com.tinder.recs.analytics.RecsPhotosViewedCache;
import com.tinder.recs.presenter.RecsPresenter;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class RecsView_MembersInjector implements MembersInjector<RecsView> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<C14386k> addProfileShareEventProvider;
    private final Provider<Lifecycle> lifecycleProvider;
    private final Provider<C14550a> notificationDispatcherProvider;
    private final Provider<RecsPresenter> presenterProvider;
    private final Provider<C14418b> profileFactoryProvider;
    private final Provider<aj> profileShareEventFactoryProvider;
    private final Provider<RecCardViewHolderFactory> recCardViewHolderFactoryProvider;
    private final Provider<RecsPhotosViewedCache> recsPhotosViewedCacheProvider;
    private final Provider<C14548a> tinderNotificationFactoryProvider;
    private final Provider<UserRecActivePhotoIndexProvider> userRecActivePhotoIndexProvider;

    public RecsView_MembersInjector(Provider<RecsPresenter> provider, Provider<RecCardViewHolderFactory> provider2, Provider<UserRecActivePhotoIndexProvider> provider3, Provider<RecsPhotosViewedCache> provider4, Provider<C14418b> provider5, Provider<AbTestUtility> provider6, Provider<Lifecycle> provider7, Provider<C14548a> provider8, Provider<C14550a> provider9, Provider<C14386k> provider10, Provider<aj> provider11) {
        this.presenterProvider = provider;
        this.recCardViewHolderFactoryProvider = provider2;
        this.userRecActivePhotoIndexProvider = provider3;
        this.recsPhotosViewedCacheProvider = provider4;
        this.profileFactoryProvider = provider5;
        this.abTestUtilityProvider = provider6;
        this.lifecycleProvider = provider7;
        this.tinderNotificationFactoryProvider = provider8;
        this.notificationDispatcherProvider = provider9;
        this.addProfileShareEventProvider = provider10;
        this.profileShareEventFactoryProvider = provider11;
    }

    public static MembersInjector<RecsView> create(Provider<RecsPresenter> provider, Provider<RecCardViewHolderFactory> provider2, Provider<UserRecActivePhotoIndexProvider> provider3, Provider<RecsPhotosViewedCache> provider4, Provider<C14418b> provider5, Provider<AbTestUtility> provider6, Provider<Lifecycle> provider7, Provider<C14548a> provider8, Provider<C14550a> provider9, Provider<C14386k> provider10, Provider<aj> provider11) {
        return new RecsView_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public void injectMembers(RecsView recsView) {
        injectPresenter(recsView, (RecsPresenter) this.presenterProvider.get());
        injectRecCardViewHolderFactory(recsView, (RecCardViewHolderFactory) this.recCardViewHolderFactoryProvider.get());
        injectUserRecActivePhotoIndexProvider(recsView, (UserRecActivePhotoIndexProvider) this.userRecActivePhotoIndexProvider.get());
        injectRecsPhotosViewedCache(recsView, (RecsPhotosViewedCache) this.recsPhotosViewedCacheProvider.get());
        injectProfileFactory(recsView, (C14418b) this.profileFactoryProvider.get());
        injectAbTestUtility(recsView, (AbTestUtility) this.abTestUtilityProvider.get());
        injectLifecycle(recsView, (Lifecycle) this.lifecycleProvider.get());
        injectTinderNotificationFactory(recsView, (C14548a) this.tinderNotificationFactoryProvider.get());
        injectNotificationDispatcher(recsView, (C14550a) this.notificationDispatcherProvider.get());
        injectAddProfileShareEvent(recsView, (C14386k) this.addProfileShareEventProvider.get());
        injectProfileShareEventFactory(recsView, (aj) this.profileShareEventFactoryProvider.get());
    }

    public static void injectPresenter(RecsView recsView, RecsPresenter recsPresenter) {
        recsView.presenter = recsPresenter;
    }

    public static void injectRecCardViewHolderFactory(RecsView recsView, RecCardViewHolderFactory recCardViewHolderFactory) {
        recsView.recCardViewHolderFactory = recCardViewHolderFactory;
    }

    public static void injectUserRecActivePhotoIndexProvider(RecsView recsView, UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider) {
        recsView.userRecActivePhotoIndexProvider = userRecActivePhotoIndexProvider;
    }

    public static void injectRecsPhotosViewedCache(RecsView recsView, RecsPhotosViewedCache recsPhotosViewedCache) {
        recsView.recsPhotosViewedCache = recsPhotosViewedCache;
    }

    public static void injectProfileFactory(RecsView recsView, C14418b c14418b) {
        recsView.profileFactory = c14418b;
    }

    public static void injectAbTestUtility(RecsView recsView, AbTestUtility abTestUtility) {
        recsView.abTestUtility = abTestUtility;
    }

    public static void injectLifecycle(RecsView recsView, Lifecycle lifecycle) {
        recsView.lifecycle = lifecycle;
    }

    public static void injectTinderNotificationFactory(RecsView recsView, C14548a c14548a) {
        recsView.tinderNotificationFactory = c14548a;
    }

    public static void injectNotificationDispatcher(RecsView recsView, C14550a c14550a) {
        recsView.notificationDispatcher = c14550a;
    }

    public static void injectAddProfileShareEvent(RecsView recsView, C14386k c14386k) {
        recsView.addProfileShareEvent = c14386k;
    }

    public static void injectProfileShareEventFactory(RecsView recsView, aj ajVar) {
        recsView.profileShareEventFactory = ajVar;
    }
}
