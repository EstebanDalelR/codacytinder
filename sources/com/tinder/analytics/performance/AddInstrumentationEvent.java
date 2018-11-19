package com.tinder.analytics.performance;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.C8019g.C7337a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.EtlEvent;
import rx.Completable;

public abstract class AddInstrumentationEvent implements CompletableUseCase<InstrumentationRequest> {
    @NonNull
    /* renamed from: a */
    private final C2630h f26492a;
    @NonNull
    /* renamed from: b */
    private final AbTestUtility f26493b;

    public interface InstrumentationRequest {

        /* renamed from: com.tinder.analytics.performance.AddInstrumentationEvent$InstrumentationRequest$a */
        public static abstract class C7336a implements InstrumentationRequest {

            /* renamed from: com.tinder.analytics.performance.AddInstrumentationEvent$InstrumentationRequest$a$a */
            public static abstract class C6235a {
                /* renamed from: a */
                public abstract C6235a mo6800a(C6242m c6242m);

                /* renamed from: a */
                public abstract C6235a mo6801a(Number number);

                /* renamed from: a */
                public abstract C6235a mo6802a(String str);

                /* renamed from: a */
                public abstract C7336a mo6803a();

                /* renamed from: b */
                public abstract C6235a mo6804b(Number number);

                /* renamed from: b */
                public abstract C6235a mo6805b(String str);

                /* renamed from: c */
                public abstract C6235a mo6806c(String str);

                /* renamed from: d */
                public abstract C6235a mo6807d(String str);

                /* renamed from: e */
                public abstract C6235a mo6808e(String str);
            }

            /* renamed from: a */
            public static C6235a m31303a() {
                return new C7337a();
            }
        }

        @Nullable
        Number durationInMillis();

        @Nullable
        String nsEndpoint();

        @Nullable
        String nsErrorCode();

        @Nullable
        String nsMethod();

        @Nullable
        String nsName();

        @Nullable
        String nsOtherId();

        @Nullable
        Number nsStatusCode();

        @Nullable
        C6242m payload();
    }

    @NonNull
    /* renamed from: a */
    abstract EtlEvent mo7429a(@NonNull InstrumentationRequest instrumentationRequest);

    @NonNull
    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m31305b((InstrumentationRequest) obj);
    }

    public AddInstrumentationEvent(@NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility) {
        this.f26492a = c2630h;
        this.f26493b = abTestUtility;
    }

    @NonNull
    /* renamed from: b */
    public Completable m31305b(@NonNull InstrumentationRequest instrumentationRequest) {
        return Completable.a(new C8145a(this, instrumentationRequest));
    }

    /* renamed from: c */
    final /* synthetic */ void m31306c(@NonNull InstrumentationRequest instrumentationRequest) {
        if (this.f26493b.isPerformanceInstrumentationEnabled()) {
            this.f26492a.a(mo7429a(instrumentationRequest));
        }
    }
}
