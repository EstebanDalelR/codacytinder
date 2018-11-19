package com.tinder.app.dagger.module;

import com.tinder.analytics.experiment.C6220a;
import com.tinder.auth.observer.C10338a;
import com.tinder.auth.observer.C10339b;
import com.tinder.auth.observer.C10340c;
import com.tinder.auth.observer.C10342e;
import com.tinder.auth.observer.C10343f;
import com.tinder.auth.observer.C10344g;
import com.tinder.auth.observer.LoginObserver;
import com.tinder.auth.repository.AuthSessionRepository;
import com.tinder.interactors.C9719k;
import com.tinder.managers.C2652a;
import com.tinder.managers.bj;
import com.tinder.typingindicator.worker.TypingIndicatorWorker;
import com.tinder.updates.UpdatesScheduler;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u0018"}, d2 = {"Lcom/tinder/app/dagger/module/LoginObserverModule;", "", "()V", "provideAbTestVariantsObserver", "Lcom/tinder/auth/observer/LoginObserver;", "authSessionRepository", "Lcom/tinder/auth/repository/AuthSessionRepository;", "abTestVariantsReporter", "Lcom/tinder/analytics/experiment/AbTestVariantsReporter;", "provideAuthenticationManagerLoginObserver", "authenticationManager", "Lcom/tinder/managers/AuthenticationManager;", "provideManagerSettingsLoginObserver", "managerSettings", "Lcom/tinder/managers/ManagerSettings;", "provideSyncProfileLoginObserver", "profileInteractor", "Lcom/tinder/interactors/ProfileInteractor;", "provideTypingIndicatorWorkerLoginObserver", "typingIndicatorWorker", "Lcom/tinder/typingindicator/worker/TypingIndicatorWorker;", "provideUpdatesSchedulerLoginObserver", "updatesScheduler", "Lcom/tinder/updates/UpdatesScheduler;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.app.dagger.module.a */
public final class C8244a {
    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final LoginObserver m35144a(@NotNull C2652a c2652a) {
        C2668g.b(c2652a, "authenticationManager");
        return new C10339b(c2652a);
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final LoginObserver m35145a(@NotNull bj bjVar) {
        C2668g.b(bjVar, "managerSettings");
        return new C10340c(bjVar);
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final LoginObserver m35143a(@NotNull C9719k c9719k) {
        C2668g.b(c9719k, "profileInteractor");
        return new C10342e(c9719k);
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final LoginObserver m35147a(@NotNull UpdatesScheduler updatesScheduler) {
        C2668g.b(updatesScheduler, "updatesScheduler");
        return new C10344g(updatesScheduler);
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final LoginObserver m35146a(@NotNull TypingIndicatorWorker typingIndicatorWorker) {
        C2668g.b(typingIndicatorWorker, "typingIndicatorWorker");
        return new C10343f(typingIndicatorWorker);
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final LoginObserver m35142a(@NotNull AuthSessionRepository authSessionRepository, @NotNull C6220a c6220a) {
        C2668g.b(authSessionRepository, "authSessionRepository");
        C2668g.b(c6220a, "abTestVariantsReporter");
        return new C10338a(authSessionRepository, c6220a);
    }
}
