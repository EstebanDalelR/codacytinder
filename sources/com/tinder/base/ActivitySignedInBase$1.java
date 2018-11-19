package com.tinder.base;

import android.view.ViewTreeObserver.OnPreDrawListener;

class ActivitySignedInBase$1 implements OnPreDrawListener {
    /* renamed from: a */
    final /* synthetic */ ActivitySignedInBase f29573a;

    ActivitySignedInBase$1(ActivitySignedInBase activitySignedInBase) {
        this.f29573a = activitySignedInBase;
    }

    public boolean onPreDraw() {
        if (ActivitySignedInBase.a(this.f29573a).getHeight() <= 0) {
            return true;
        }
        ActivitySignedInBase.a(this.f29573a).getViewTreeObserver().removeOnPreDrawListener(this);
        ActivitySignedInBase.a(this.f29573a, null);
        ActivitySignedInBase.b(this.f29573a);
        return false;
    }
}
