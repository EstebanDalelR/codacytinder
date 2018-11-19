package com.tinder.boost.target;

public interface BoostSummaryTarget {
    void displayNonSubscriberSummary(String str, String str2, String str3);

    void displaySubscriberSummary(String str);

    void onBoostAgainClick();

    void onGetTinderPlusClick();
}
