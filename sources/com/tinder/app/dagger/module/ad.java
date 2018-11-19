package com.tinder.app.dagger.module;

import com.tinder.activities.MainActivity;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.TinderUserApi;
import com.tinder.auth.repository.AuthLedgerRepository;
import com.tinder.common.logger.Logger;
import com.tinder.data.p328j.C10787a;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.verification.VerificationRepository;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger;
import com.tinder.verification.C15388c;
import com.tinder.verification.C15388c.C15387a;
import com.tinder.verification.trigger.C17236b;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent;
import com.tinder.verification.usecase.C15390a;
import com.tinder.verification.usecase.C15391b;
import com.tinder.verification.usecase.C15392c;
import com.tinder.verification.worker.C15393a;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import io.reactivex.C15679f;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J<\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010#\u001a\u00020\u001bH\u0007J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0007¨\u0006'"}, d2 = {"Lcom/tinder/app/dagger/module/VerificationModule;", "", "()V", "provideAddAuthAccountLinkModalEvent", "Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "provideAuthAccountLinkModalEventWorker", "Lcom/tinder/verification/worker/AuthAccountLinkModalEventWorker;", "addAuthAccountLinkModalEvent", "logger", "Lcom/tinder/common/logger/Logger;", "scheduler", "Lio/reactivex/Scheduler;", "provideObserveSmsVerificationStatus", "Lcom/tinder/verification/usecase/ObserveSmsVerificationStatus;", "authLedgerRepository", "Lcom/tinder/auth/repository/AuthLedgerRepository;", "provideSaveSmsVerificationDismissedAtTime", "Lcom/tinder/verification/usecase/SaveSmsVerificationDismissed;", "verificationRepository", "Lcom/tinder/domain/verification/VerificationRepository;", "provideSmsVerificationDisplayTrigger", "Lcom/tinder/main/trigger/Trigger;", "displayQueue", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "viewModelFactory", "Lcom/tinder/verification/VerificationDialogViewModel$Factory;", "observeSmsVerificationStatus", "ioScheduler", "mainThreadScheduler", "mainActivity", "Lcom/tinder/activities/MainActivity;", "provideSuppressSmsVerificationRequirement", "Lcom/tinder/verification/usecase/SuppressSmsVerificationRequirement;", "provideVerificationDialogViewModelFactory", "provideVerificationRepository", "tinderUserApi", "Lcom/tinder/api/TinderUserApi;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class ad {
    @NotNull
    @Provides
    /* renamed from: a */
    public final C15387a m35152a() {
        return C15388c.f47654a;
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C15390a m35154a(@NotNull AuthLedgerRepository authLedgerRepository) {
        C2668g.b(authLedgerRepository, "authLedgerRepository");
        return new C15390a(authLedgerRepository);
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final C15392c m35157b(@NotNull AuthLedgerRepository authLedgerRepository) {
        C2668g.b(authLedgerRepository, "authLedgerRepository");
        return new C15392c(authLedgerRepository);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final VerificationRepository m35150a(@NotNull TinderUserApi tinderUserApi) {
        C2668g.b(tinderUserApi, "tinderUserApi");
        return new C10787a(tinderUserApi);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C15391b m35155a(@NotNull VerificationRepository verificationRepository) {
        C2668g.b(verificationRepository, "verificationRepository");
        return new C15391b(verificationRepository);
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final Trigger m35151a(@NotNull C9835c c9835c, @NotNull C15387a c15387a, @NotNull C15390a c15390a, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2, @NotNull MainActivity mainActivity) {
        C2668g.b(c9835c, "displayQueue");
        C2668g.b(c15387a, "viewModelFactory");
        C2668g.b(c15390a, "observeSmsVerificationStatus");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        C2668g.b(mainActivity, "mainActivity");
        return new C17236b(c9835c, c15387a, c15390a, c15679f, c15679f2, mainActivity);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final AddAuthAccountLinkModalEvent m35153a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        return new AddAuthAccountLinkModalEvent(c2630h);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C15393a m35156a(@NotNull AddAuthAccountLinkModalEvent addAuthAccountLinkModalEvent, @NotNull Logger logger, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(addAuthAccountLinkModalEvent, "addAuthAccountLinkModalEvent");
        C2668g.b(logger, "logger");
        C2668g.b(c15679f, "scheduler");
        return new C15393a(addAuthAccountLinkModalEvent, logger, c15679f);
    }
}
