package com.tinder.analytics.performance;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.du;

public class af extends ag {
    public af(@NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility) {
        super(c2630h, abTestUtility);
    }

    @NonNull
    /* renamed from: a */
    EtlEvent mo7429a(@NonNull InstrumentationRequest instrumentationRequest) {
        C6242m payload = instrumentationRequest.payload();
        instrumentationRequest = du.a().a("startTinderToChat").b(instrumentationRequest.durationInMillis());
        if (payload != null) {
            instrumentationRequest.a(payload.m26957b());
        }
        return instrumentationRequest.a();
    }
}
