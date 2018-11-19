package com.tinder.presenters;

import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class fb implements Action1 {
    /* renamed from: a */
    private final String f57932a;

    fb(String str) {
        this.f57932a = str;
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).showSmsCollectionFaq(this.f57932a);
    }
}
