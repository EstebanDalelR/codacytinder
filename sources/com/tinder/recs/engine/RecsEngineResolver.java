package com.tinder.recs.engine;

import android.support.annotation.NonNull;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngine.ResetReason.Default.Unspecified;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.SwipeDataStore;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.passport.model.C10044b;
import com.tinder.passport.provider.PassportLocationProvider;
import com.tinder.recs.domain.model.CustomRecEngineResetReason;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.DiscoverySettingsUpdate;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.PassportLocationUpdate;
import com.tinder.recs.provider.RecSourceProvider;
import com.tinder.recs.rule.SwipeDispatchRule;
import javax.inject.Inject;
import javax.inject.Singleton;
import p000a.p001a.C0001a;
import rx.Observable;

@Singleton
@Deprecated
public class RecsEngineResolver {
    private final RecSourceProvider recSourceProvider;
    private final RecsEngineProvider recsEngineProvider;
    private final SwipeDispatchRule swipeDispatchRule;
    private final SwipeDataStore swipeRepository;

    @Inject
    public RecsEngineResolver(@NonNull RecSourceProvider recSourceProvider, @NonNull RecsEngineRegistry recsEngineRegistry, @NonNull RecsEngineProvider recsEngineProvider, @NonNull PassportLocationProvider passportLocationProvider, @NonNull ObserveDiscoverySettings observeDiscoverySettings, @NonNull SwipeDataStore swipeDataStore, @NonNull SwipeDispatchRule swipeDispatchRule) {
        this.recSourceProvider = recSourceProvider;
        this.recsEngineProvider = recsEngineProvider;
        this.swipeRepository = swipeDataStore;
        this.swipeDispatchRule = swipeDispatchRule;
        recsEngineProvider.setEngine(Core.INSTANCE, recsEngineRegistry.getEngine(Core.INSTANCE));
        recSourceProvider.observeChanges().a(new RecsEngineResolver$$Lambda$0(this, recsEngineProvider), RecsEngineResolver$$Lambda$1.$instance);
        observeDiscoverySettings.execute().distinctUntilChanged().skip(1).subscribe(new RecsEngineResolver$$Lambda$2(this), RecsEngineResolver$$Lambda$3.$instance);
        passportLocationProvider.observeUpdates().f(RecsEngineResolver$$Lambda$4.$instance).a(new RecsEngineResolver$$Lambda$5(this), RecsEngineResolver$$Lambda$6.$instance);
    }

    final /* synthetic */ void lambda$new$0$RecsEngineResolver(@NonNull RecsEngineProvider recsEngineProvider, RecSource recSource) {
        RecsEngine currentEngine = recsEngineProvider.getCurrentEngine();
        if (currentEngine != null) {
            currentEngine.pause();
        }
        recsEngineProvider.updateCurrentEngine(getEngine(recSource));
    }

    final /* synthetic */ void lambda$new$1$RecsEngineResolver(DiscoverySettings discoverySettings) throws Exception {
        resetEngines(DiscoverySettingsUpdate.INSTANCE);
    }

    final /* synthetic */ void lambda$new$3$RecsEngineResolver(C10044b c10044b) {
        resetEngines(PassportLocationUpdate.INSTANCE);
    }

    public Observable<RecsEngine> observeRecsEngineChanges() {
        return this.recsEngineProvider.observeCurrentEngine();
    }

    @NonNull
    public RecsEngine getActiveEngine() {
        return getEngine(this.recSourceProvider.getSource());
    }

    @NonNull
    public RecsEngine getEngine(@NonNull Rec$Source rec$Source) {
        return this.recsEngineProvider.getEngine(rec$Source);
    }

    private void resetEngines(@NonNull CustomRecEngineResetReason customRecEngineResetReason) {
        for (RecsEngine recSource : this.recsEngineProvider.getAllEngines()) {
            C0001a.m25b("Resetting RecsEngines for source %s", recSource.getRecSource());
            recSource.reset(customRecEngineResetReason);
        }
    }

    public void clearEngines() {
        this.swipeDispatchRule.getNonBlockingSwipeDispatcher().clear();
        this.swipeRepository.removeAllSwipes();
        for (RecsEngine recsEngine : this.recsEngineProvider.getAllEngines()) {
            C0001a.m25b("Clearing RecsEngines for source %s", recsEngine.getRecSource());
            recsEngine.pause();
            recsEngine.reset(Unspecified.INSTANCE);
        }
    }
}
