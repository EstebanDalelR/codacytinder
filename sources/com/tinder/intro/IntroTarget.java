package com.tinder.intro;

import android.support.annotation.ColorRes;

public interface IntroTarget {
    void hideDisclaimerContent();

    void setUpPagerIndicator(@ColorRes int i, @ColorRes int i2);

    void setupPagerAdapter();

    void showDisclaimerDismissButton();

    void showDisclaimerText();

    void showFBDisclaimerContent();

    void showViewPager();
}
