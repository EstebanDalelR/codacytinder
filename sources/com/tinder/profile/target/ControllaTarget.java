package com.tinder.profile.target;

import com.tinder.controlla.model.AdvertisingPageType;
import com.tinder.intropricing.controlla.C9729a;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.profile.p366e.C14408a;
import com.tinder.profile.view.ControllaView.Page;
import com.tinder.profile.view.ControllaView.State;
import java.util.List;

public interface ControllaTarget {
    void bindIntroPricing(C9729a c9729a);

    void bindState(State state, AdvertisingPageType advertisingPageType);

    void changePage(Page page);

    void launchPaywallFlow(C10076o c10076o);

    void launchTPlusControlActivity();

    void setUpgradeGoldButtonVisibility(boolean z);

    void setViewModels(List<C14408a> list);

    void startCarouselTimer();

    void stopCarouselTimer();

    void updateBoostCount(int i);

    void updateBoostTimer(long j);

    void updateButton(State state, AdvertisingPageType advertisingPageType);

    void updateSuperLikesCount(int i);
}
