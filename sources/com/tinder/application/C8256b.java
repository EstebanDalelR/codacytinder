package com.tinder.application;

import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ProductionEnvironmentProvider;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.AuthExperiment;
import com.tinder.core.experiment.AuthExperiment.AuthExperimentTimelineProvider;
import com.tinder.core.experiment.C12816s;
import com.tinder.core.experiment.C8592c;
import com.tinder.core.experiment.C8593g;
import com.tinder.core.experiment.CanIGetYoEmailExperimentProvider.Variant;
import com.tinder.domain.auth.UniqueIdFactory;
import com.tinder.module.bs;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import org.joda.time.DateTime;
import org.joda.time.Period;

@Module(includes = {bs.class})
/* renamed from: com.tinder.application.b */
abstract class C8256b {
    /* renamed from: a */
    private static final DateTime f29466a = DateTime.a("2018-05-06T00:00:00+00:00");
    /* renamed from: b */
    private static final Period f29467b = Period.c(9);

    @Provides
    /* renamed from: a */
    static C8593g<Variant> m35243a(UniqueIdFactory uniqueIdFactory) {
        return new C8593g(uniqueIdFactory);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    static AbTestUtility m35241a(C8592c c8592c, AuthExperiment<Variant> authExperiment) {
        return new C12816s(c8592c, authExperiment);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    static AuthExperimentTimelineProvider m35242a() {
        return C10309c.f33696a;
    }

    @Singleton
    @Provides
    /* renamed from: b */
    static EnvironmentProvider m35244b() {
        return new ProductionEnvironmentProvider();
    }
}
