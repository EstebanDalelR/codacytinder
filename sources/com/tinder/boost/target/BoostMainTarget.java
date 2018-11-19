package com.tinder.boost.target;

import com.tinder.paywall.paywallflow.C10076o;

public interface BoostMainTarget {
    void animateBoostButtonGone();

    void animateBoostButtonVisible();

    void displayActivatedBoostButton(long j);

    void displayBoostNetworkError();

    void displayBoostSummary();

    void displayBoostUpdate();

    void hideBoostButton();

    void launchPaywallFlow(C10076o c10076o);

    void showBoostButton();

    void showBoostReminderToolTip();

    void showBoostStartToolTip();
}
