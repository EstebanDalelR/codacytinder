package com.tinder.paywall.paywallflow;

import com.tinder.paywall.legacy.ListenerPaywall;
import rx.subjects.PublishSubject;

/* renamed from: com.tinder.paywall.paywallflow.k */
final /* synthetic */ class C12277k implements ListenerPaywall {
    /* renamed from: a */
    private final PublishSubject f39719a;

    private C12277k(PublishSubject publishSubject) {
        this.f39719a = publishSubject;
    }

    /* renamed from: a */
    static ListenerPaywall m48496a(PublishSubject publishSubject) {
        return new C12277k(publishSubject);
    }

    public void onPayClicked(String str) {
        this.f39719a.onNext(str);
    }
}
