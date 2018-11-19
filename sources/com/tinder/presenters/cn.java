package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class cn implements Action1 {
    /* renamed from: a */
    private final int f57893a;

    cn(int i) {
        this.f57893a = i;
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showCountDownActivity(this.f57893a);
    }
}
