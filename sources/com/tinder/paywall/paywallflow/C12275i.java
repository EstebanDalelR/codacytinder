package com.tinder.paywall.paywallflow;

import com.tinder.paywall.legacy.ListenerPaywall;
import rx.subjects.PublishSubject;

/* renamed from: com.tinder.paywall.paywallflow.i */
final /* synthetic */ class C12275i implements ListenerPaywall {
    /* renamed from: a */
    private final PublishSubject f39717a;

    private C12275i(PublishSubject publishSubject) {
        this.f39717a = publishSubject;
    }

    /* renamed from: a */
    static ListenerPaywall m48494a(PublishSubject publishSubject) {
        return new C12275i(publishSubject);
    }

    public void onPayClicked(String str) {
        this.f39717a.onNext(str);
    }
}
