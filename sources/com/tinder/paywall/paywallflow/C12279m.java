package com.tinder.paywall.paywallflow;

import com.tinder.paywall.legacy.ListenerPaywall;
import rx.subjects.PublishSubject;

/* renamed from: com.tinder.paywall.paywallflow.m */
final /* synthetic */ class C12279m implements ListenerPaywall {
    /* renamed from: a */
    private final PublishSubject f39721a;

    private C12279m(PublishSubject publishSubject) {
        this.f39721a = publishSubject;
    }

    /* renamed from: a */
    static ListenerPaywall m48498a(PublishSubject publishSubject) {
        return new C12279m(publishSubject);
    }

    public void onPayClicked(String str) {
        this.f39721a.onNext(str);
    }
}
