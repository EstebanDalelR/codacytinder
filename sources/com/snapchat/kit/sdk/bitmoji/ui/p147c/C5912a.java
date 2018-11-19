package com.snapchat.kit.sdk.bitmoji.ui.p147c;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.c.a */
public class C5912a {
    /* renamed from: a */
    public static ObjectAnimator m25500a(View view) {
        view = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 0.85f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 0.85f})});
        view.setDuration(200);
        view.setInterpolator(new AccelerateDecelerateInterpolator());
        return view;
    }
}
