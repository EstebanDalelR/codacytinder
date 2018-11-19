package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import java8.util.Optional;
import rx.functions.Action1;

final /* synthetic */ class au implements Action1 {
    /* renamed from: a */
    private final Optional f57868a;

    au(Optional optional) {
        this.f57868a = optional;
    }

    public void call(Object obj) {
        ((FragmentViewProfileTarget) obj).showMyJob(this.f57868a);
    }
}
