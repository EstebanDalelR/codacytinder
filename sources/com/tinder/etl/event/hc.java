package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class hc implements EtlField<Number> {
    public String description() {
        return "</br>for top picks events</br> 1 - empty state, 2 - scroll to bottom, 3 - deeplink, 4 - footer button from grid view, 5 - swiping on teaser, 6 - tapping on teaser. </br>for super like events</br> 4 - exhausted 5 - upsell 6 - exhausted 7 - profile setting 8 - merchandise 10 - top picks 11 - places. </br>for boostpaywall.view</br> NoBoostRemainingHomeScreen - 1, NoBoostRemainingReboostScreen - 2, MerchandisingScreen - 3, Settings - 4, DeepLink -5, WhatsNew - 6, FastMatch - 7, RecsOnboarding - 8. </br>for boostpaywall.purchase</br> NoBoostRemainingHomeScreen - 1, NoBoostRemainingReboostScreen - 2, MerchandisingScreen - 3, Settings - 4, DeepLink -5, WhatsNew - 6, FastMatch - 7, RecsOnboarding - 8, InAppPromotion - 26";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    hc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
