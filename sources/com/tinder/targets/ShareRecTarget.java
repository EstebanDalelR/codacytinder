package com.tinder.targets;

import android.support.annotation.ColorRes;

public interface ShareRecTarget {
    void setColorFilter(@ColorRes int i);

    void setShareComplete();

    void setShareInProgress();

    void setVisibility(int i);
}
