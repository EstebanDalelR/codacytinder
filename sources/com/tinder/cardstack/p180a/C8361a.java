package com.tinder.cardstack.p180a;

import android.animation.TimeInterpolator;
import android.support.annotation.Nullable;
import com.tinder.cardstack.p182b.C8363a;

/* renamed from: com.tinder.cardstack.a.a */
public abstract class C8361a {
    private static final int DEFAULT_ALPHA = 1;
    private static final int DEFAULT_XY = 0;
    public static final float HORIZONTAL_SWIPE_DISTANCE = (C8363a.m35601b() * 1.4f);
    public static final int INVALID_ROTATION = Integer.MIN_VALUE;
    private static final int UNSPECIFIED_ANIMATION_DURATION = -1;
    public static final float VERTICAL_SWIPE_DISTANCE = C8363a.m35600a();

    public int durationMilli() {
        return -1;
    }

    public float endAlpha() {
        return 1.0f;
    }

    public float endRotation() {
        return -2.14748365E9f;
    }

    public float endX() {
        return 0.0f;
    }

    public float endY() {
        return 0.0f;
    }

    @Nullable
    public TimeInterpolator interpolator() {
        return null;
    }

    public float startAlpha() {
        return 1.0f;
    }

    public float startRotation() {
        return -2.14748365E9f;
    }

    public float startX() {
        return 0.0f;
    }

    public float startY() {
        return 0.0f;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
