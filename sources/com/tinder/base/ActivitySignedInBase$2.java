package com.tinder.base;

import android.animation.Animator;
import android.support.annotation.Nullable;
import com.tinder.utils.an;

class ActivitySignedInBase$2 extends an {
    /* renamed from: a */
    final /* synthetic */ ActivitySignedInBase f33801a;

    ActivitySignedInBase$2(ActivitySignedInBase activitySignedInBase) {
        this.f33801a = activitySignedInBase;
    }

    public void onAnimationEnd(@Nullable Animator animator) {
        super.onAnimationEnd(animator);
        ActivitySignedInBase.a(this.f33801a, null);
    }
}
