package com.tinder.paywall.paywallflow;

import com.tinder.paywall.legacy.ListenerPaywall;
import rx.subjects.PublishSubject;

/* renamed from: com.tinder.paywall.paywallflow.l */
final /* synthetic */ class C12278l implements ListenerPaywall {
    /* renamed from: a */
    private final PublishSubject f39720a;

    private C12278l(PublishSubject publishSubject) {
        this.f39720a = publishSubject;
    }

    /* renamed from: a */
    static ListenerPaywall m48497a(PublishSubject publishSubject) {
        return new C12278l(publishSubject);
    }

    public void onPayClicked(String str) {
        this.f39720a.onNext(str);
    }
}
