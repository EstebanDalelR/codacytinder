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

/* renamed from: com.tinder.analytics.performance.t */
public class C8154t extends ag {
    public C8154t(@NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility) {
        super(c2630h, abTestUtility);
    }

    @NonNull
    /* renamed from: a */
    EtlEvent mo7429a(@NonNull InstrumentationRequest instrumentationRequest) {
        C6242m payload = instrumentationRequest.payload();
        instrumentationRequest = du.a().b(instrumentationRequest.nsEndpoint()).c("POST").a(instrumentationRequest.nsStatusCode()).f(instrumentationRequest.nsOtherId()).b(instrumentationRequest.durationInMillis());
        if (payload != null) {
            instrumentationRequest.a(payload.m26957b());
        }
        return instrumentationRequest.a();
    }

    /* renamed from: a */
    public Subscription m34562a(String str, String str2, String str3, int i, C6242m c6242m) {
        return Single.a(new C6244u(this, str3, str2, i, c6242m, str)).c(new C8023v(this)).a(C8155w.f29166a, C8156x.f29167a);
    }

    /* renamed from: a */
    final /* synthetic */ C7336a m34560a(String str, String str2, int i, C6242m c6242m, String str3) throws Exception {
        return C7336a.m31303a().mo6805b(str).mo6801a(Long.valueOf(m33924c(str2))).mo6804b(Integer.valueOf(i)).mo6800a(c6242m).mo6808e(str3).mo6803a();
    }
}
