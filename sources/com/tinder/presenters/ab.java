package com.tinder.presenters;

import com.tinder.targets.FragmentViewProfileTarget;
import rx.functions.Action1;

final /* synthetic */ class ab implements Action1 {
    /* renamed from: a */
    private final C17744d f57854a;
    /* renamed from: b */
    private final FragmentViewProfileTarget f57855b;

    ab(C17744d c17744d, FragmentViewProfileTarget fragmentViewProfileTarget) {
        this.f57854a = c17744d;
        this.f57855b = fragmentViewProfileTarget;
    }

    public void call(Object obj) {
        this.f57854a.m64719a(this.f57855b, (Boolean) obj);
    }
}
