package com.tinder.intro;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import com.tinder.R;

enum IntroSlide {
    SLIDE_ONE(R.string.intro_v2_slide_1, R.drawable.intro_v2_slide_1),
    SLIDE_TWO(R.string.intro_v2_slide_2, R.drawable.intro_v2_slide_2),
    SLIDE_THREE(R.string.intro_v2_slide_3, R.drawable.intro_v2_slide_3),
    SLIDE_FOUR(R.string.intro_v2_slide_4, R.drawable.intro_v2_slide_4);
    
    @DrawableRes
    private final int mImageResId;
    @StringRes
    private final int mTitleResId;

    private IntroSlide(int i, int i2) {
        this.mTitleResId = i;
        this.mImageResId = i2;
    }

    @StringRes
    public int getTitleResId() {
        return this.mTitleResId;
    }

    @DrawableRes
    public int getImageResId() {
        return this.mImageResId;
    }
}
