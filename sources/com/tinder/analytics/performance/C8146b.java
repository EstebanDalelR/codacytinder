package com.tinder.analytics.performance;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest.C7336a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.du;
import com.tinder.etl.event.du.C9064a;
import rx.Single;
import rx.Subscription;

/* renamed from: com.tinder.analytics.performance.b */
public class C8146b extends ag {
    public C8146b(@NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility) {
        super(c2630h, abTestUtility);
    }

    @NonNull
    /* renamed from: a */
    EtlEvent mo7429a(@NonNull InstrumentationRequest instrumentationRequest) {
        C9064a b = du.a().b(instrumentationRequest.nsEndpoint()).c(instrumentationRequest.nsMethod()).a(instrumentationRequest.nsStatusCode()).b(instrumentationRequest.durationInMillis());
        if (instrumentationRequest.nsErrorCode() != null) {
            b.d(instrumentationRequest.nsErrorCode());
        }
        return b.a();
    }

    /* renamed from: a */
    public Subscription m34552a(String str, String str2, String str3, int i) {
        return Single.a(new C6237c(this, str2, i, str, str3)).c(new C8018d(this)).a(C8147e.f29160a, C8148f.f29161a);
    }

    /* renamed from: a */
    final /* synthetic */ C7336a m34550a(String str, int i, String str2, String str3) throws Exception {
        return C7336a.m31303a().mo6805b(str).mo6804b(Integer.valueOf(i)).mo6801a(Long.valueOf(m33924c(str2))).mo6807d(str3).mo6803a();
    }
}
