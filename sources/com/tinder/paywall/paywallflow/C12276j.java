package com.tinder.paywall.paywallflow;

import com.tinder.paywall.legacy.ListenerPaywall;
import rx.subjects.PublishSubject;

/* renamed from: com.tinder.paywall.paywallflow.j */
final /* synthetic */ class C12276j implements ListenerPaywall {
    /* renamed from: a */
    private final PublishSubject f39718a;

    private C12276j(PublishSubject publishSubject) {
        this.f39718a = publishSubject;
    }

    /* renamed from: a */
    static ListenerPaywall m48495a(PublishSubject publishSubject) {
        return new C12276j(publishSubject);
    }

    public void onPayClicked(String str) {
        this.f39718a.onNext(str);
    }
}
