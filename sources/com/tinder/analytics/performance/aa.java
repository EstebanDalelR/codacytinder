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

public class aa extends ag {
    public aa(@NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility) {
        super(c2630h, abTestUtility);
    }

    @NonNull
    /* renamed from: a */
    EtlEvent mo7429a(@NonNull InstrumentationRequest instrumentationRequest) {
        C6242m payload = instrumentationRequest.payload();
        instrumentationRequest = du.a().a("startTinder").b(instrumentationRequest.durationInMillis());
        if (payload != null) {
            instrumentationRequest.a(payload.m26957b());
        }
        return instrumentationRequest.a();
    }

    /* renamed from: a */
    public Subscription m34543a(String str, @NonNull C6242m c6242m) {
        return Single.a(new ab(this, str, c6242m)).c(new ac(this)).a(ad.f29158a, ae.f29159a);
    }

    /* renamed from: b */
    final /* synthetic */ C7336a m34544b(String str, @NonNull C6242m c6242m) throws Exception {
        return C7336a.m31303a().mo6801a(Long.valueOf(m33924c(str))).mo6800a(c6242m).mo6803a();
    }
}
