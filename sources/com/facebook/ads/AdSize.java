package com.facebook.ads;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.io.Serializable;

public class AdSize implements Serializable {
    @Deprecated
    public static final AdSize BANNER_320_50 = new AdSize(320, 50);
    public static final AdSize BANNER_HEIGHT_50 = new AdSize(-1, 50);
    public static final AdSize BANNER_HEIGHT_90 = new AdSize(-1, 90);
    public static final AdSize INTERSTITIAL = new AdSize(0, 0);
    public static final AdSize RECTANGLE_HEIGHT_250 = new AdSize(-1, Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    /* renamed from: a */
    private final int f3505a;
    /* renamed from: b */
    private final int f3506b;

    public AdSize(int i, int i2) {
        this.f3505a = i;
        this.f3506b = i2;
    }

    public static AdSize fromWidthAndHeight(int i, int i2) {
        return (INTERSTITIAL.f3506b == i2 && INTERSTITIAL.f3505a == i) ? INTERSTITIAL : (BANNER_320_50.f3506b == i2 && BANNER_320_50.f3505a == i) ? BANNER_320_50 : (BANNER_HEIGHT_50.f3506b == i2 && BANNER_HEIGHT_50.f3505a == i) ? BANNER_HEIGHT_50 : (BANNER_HEIGHT_90.f3506b == i2 && BANNER_HEIGHT_90.f3505a == i) ? BANNER_HEIGHT_90 : (RECTANGLE_HEIGHT_250.f3506b == i2 && RECTANGLE_HEIGHT_250.f3505a == i) ? RECTANGLE_HEIGHT_250 : null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f3505a != adSize.f3505a ? false : this.f3506b == adSize.f3506b;
    }

    public int getHeight() {
        return this.f3506b;
    }

    public int getWidth() {
        return this.f3505a;
    }

    public int hashCode() {
        return (this.f3505a * 31) + this.f3506b;
    }
}
