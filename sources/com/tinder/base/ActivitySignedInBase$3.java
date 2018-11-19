package com.tinder.base;

import android.animation.Animator;
import android.support.annotation.Nullable;
import com.tinder.utils.an;

class ActivitySignedInBase$3 extends an {
    /* renamed from: a */
    final /* synthetic */ ActivitySignedInBase f33802a;

    ActivitySignedInBase$3(ActivitySignedInBase activitySignedInBase) {
        this.f33802a = activitySignedInBase;
    }

    public void onAnimationEnd(@Nullable Animator animator) {
        super.onAnimationEnd(animator);
        ActivitySignedInBase.c(this.f33802a);
        ActivitySignedInBase.b(this.f33802a, null);
    }
}
