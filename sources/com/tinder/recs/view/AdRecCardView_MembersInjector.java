package com.tinder.recs.view;

import com.tinder.recs.presenter.AdRecCardPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class AdRecCardView_MembersInjector implements MembersInjector<AdRecCardView> {
    private final Provider<AdRecCardPresenter> adRecCardPresenterProvider;
    private final Provider<RecsView> recsViewProvider;

    public AdRecCardView_MembersInjector(Provider<AdRecCardPresenter> provider, Provider<RecsView> provider2) {
        this.adRecCardPresenterProvider = provider;
        this.recsViewProvider = provider2;
    }

    public static MembersInjector<AdRecCardView> create(Provider<AdRecCardPresenter> provider, Provider<RecsView> provider2) {
        return new AdRecCardView_MembersInjector(provider, provider2);
    }

    public void injectMembers(AdRecCardView adRecCardView) {
        injectAdRecCardPresenter(adRecCardView, (AdRecCardPresenter) this.adRecCardPresenterProvider.get());
        injectRecsView(adRecCardView, (RecsView) this.recsViewProvider.get());
    }

    public static void injectAdRecCardPresenter(AdRecCardView adRecCardView, AdRecCardPresenter adRecCardPresenter) {
        adRecCardView.adRecCardPresenter = adRecCardPresenter;
    }

    public static void injectRecsView(AdRecCardView adRecCardView, RecsView recsView) {
        adRecCardView.recsView = recsView;
    }
}
