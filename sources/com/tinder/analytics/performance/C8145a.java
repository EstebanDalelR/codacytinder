package com.tinder.analytics.performance;

import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest;
import rx.functions.Action0;

/* renamed from: com.tinder.analytics.performance.a */
final /* synthetic */ class C8145a implements Action0 {
    /* renamed from: a */
    private final AddInstrumentationEvent f29156a;
    /* renamed from: b */
    private final InstrumentationRequest f29157b;

    C8145a(AddInstrumentationEvent addInstrumentationEvent, InstrumentationRequest instrumentationRequest) {
        this.f29156a = addInstrumentationEvent;
        this.f29157b = instrumentationRequest;
    }

    public void call() {
        this.f29156a.m31306c(this.f29157b);
    }
}
