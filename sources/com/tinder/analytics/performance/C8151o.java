package com.tinder.analytics.performance;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest.C7336a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.du;
import rx.Single;
import rx.Subscription;

/* renamed from: com.tinder.analytics.performance.o */
public class C8151o extends ag {
    public C8151o(@NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility) {
        super(c2630h, abTestUtility);
    }

    @NonNull
    /* renamed from: a */
    EtlEvent mo7429a(@NonNull InstrumentationRequest instrumentationRequest) {
        C6242m payload = instrumentationRequest.payload();
        instrumentationRequest = du.a().b(instrumentationRequest.nsEndpoint()).c(instrumentationRequest.nsMethod()).a(instrumentationRequest.nsStatusCode()).f(instrumentationRequest.nsOtherId()).b(instrumentationRequest.durationInMillis());
        if (payload != null) {
            instrumentationRequest.a(payload.m26957b());
        }
        return instrumentationRequest.a();
    }

    /* renamed from: a */
    public Subscription m34557a(@Nullable String str, String str2, String str3, String str4, int i, C6242m c6242m) {
        return Single.a(new C6243p(this, str3, str2, i, str4, str, c6242m)).c(new C8022q(this)).a(C8152r.f29164a, C8153s.f29165a);
    }

    /* renamed from: a */
    final /* synthetic */ C7336a m34555a(String str, String str2, int i, String str3, @Nullable String str4, C6242m c6242m) throws Exception {
        return C7336a.m31303a().mo6805b(str).mo6801a(Long.valueOf(m33924c(str2))).mo6804b(Integer.valueOf(i)).mo6807d(str3).mo6808e(str4).mo6800a(c6242m).mo6803a();
    }
}
