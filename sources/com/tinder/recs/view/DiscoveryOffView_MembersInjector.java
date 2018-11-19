package com.tinder.recs.view;

import com.tinder.recs.presenter.DiscoveryOffPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class DiscoveryOffView_MembersInjector implements MembersInjector<DiscoveryOffView> {
    private final Provider<DiscoveryOffPresenter> presenterProvider;

    public DiscoveryOffView_MembersInjector(Provider<DiscoveryOffPresenter> provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector<DiscoveryOffView> create(Provider<DiscoveryOffPresenter> provider) {
        return new DiscoveryOffView_MembersInjector(provider);
    }

    public void injectMembers(DiscoveryOffView discoveryOffView) {
        injectPresenter(discoveryOffView, (DiscoveryOffPresenter) this.presenterProvider.get());
    }

    public static void injectPresenter(DiscoveryOffView discoveryOffView, DiscoveryOffPresenter discoveryOffPresenter) {
        discoveryOffView.presenter = discoveryOffPresenter;
    }
}
