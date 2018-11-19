package com.tinder.analytics.performance;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest.C7336a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.du;
import rx.Single;
import rx.Subscription;

/* renamed from: com.tinder.analytics.performance.h */
abstract class C8020h extends AddInstrumentationEvent {
    @NonNull
    /* renamed from: a */
    abstract String mo7613a();

    C8020h(@NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility) {
        super(c2630h, abTestUtility);
    }

    @NonNull
    /* renamed from: a */
    EtlEvent mo7429a(@NonNull InstrumentationRequest instrumentationRequest) {
        C6242m payload = instrumentationRequest.payload();
        instrumentationRequest = du.a().a(instrumentationRequest.nsName()).b(instrumentationRequest.durationInMillis());
        if (payload != null) {
            instrumentationRequest.a(payload.m26957b());
        }
        return instrumentationRequest.a();
    }

    /* renamed from: a */
    public Subscription mo7614a(long j, @NonNull C6242m c6242m) {
        return Single.a(new C6239i(this, j, c6242m)).c(new C8021j(this)).a(C8149k.f29162a, C8150l.f29163a);
    }

    /* renamed from: b */
    final /* synthetic */ C7336a m33931b(long j, @NonNull C6242m c6242m) throws Exception {
        return C7336a.m31303a().mo6802a(mo7613a()).mo6801a(Long.valueOf(j)).mo6800a(c6242m).mo6803a();
    }
}
