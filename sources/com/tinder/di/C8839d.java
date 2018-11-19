package com.tinder.di;

import com.tinder.data.recs.C10991h;
import com.tinder.domain.di.CardGrid;
import com.tinder.domain.di.CardStack;
import com.tinder.domain.di.EngineScope;
import com.tinder.domain.recs.GlobalRecsConsumptionEventMessenger;
import com.tinder.domain.recs.GlobalRecsConsumptionEventPublisher;
import com.tinder.domain.recs.GlobalRecsConsumptionListenerRegistry;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsRepository;
import com.tinder.domain.recs.engine.RecsLoader;
import com.tinder.domain.recs.engine.SwipeProcessor.SwipeRulesProcessor;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0015"}, d2 = {"Lcom/tinder/di/RecsEngineModule;", "", "()V", "provideGlobalRecsConsumptionEventPublisher", "Lcom/tinder/domain/recs/GlobalRecsConsumptionEventPublisher;", "provideGlobalRecsConsumptionListenerRegistry", "Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry;", "provideRecsLoader", "Lcom/tinder/domain/recs/engine/RecsLoader;", "config", "Lcom/tinder/domain/recs/RecsEngine$Config;", "cardStackRecsLoader", "Ldagger/Lazy;", "cardGridRecsLoader", "provideRecsRepository", "Lcom/tinder/domain/recs/RecsRepository;", "cardStackRecsDataRepository", "Lcom/tinder/data/recs/RecsDataRepository;", "cardGridRecsDataRepository", "provideSwipeRulesProcessor", "Lcom/tinder/domain/recs/engine/SwipeProcessor$SwipeRulesProcessor;", "engine_release"}, k = 1, mv = {1, 1, 9})
@Module
/* renamed from: com.tinder.di.d */
public final class C8839d {
    @NotNull
    @EngineScope
    @Provides
    /* renamed from: a */
    public final GlobalRecsConsumptionListenerRegistry m37596a() {
        return GlobalRecsConsumptionListenerRegistry.Companion.getSharedInstance();
    }

    @NotNull
    @EngineScope
    @Provides
    /* renamed from: b */
    public final GlobalRecsConsumptionEventPublisher m37598b() {
        return GlobalRecsConsumptionEventMessenger.INSTANCE;
    }

    @NotNull
    @EngineScope
    @Provides
    /* renamed from: c */
    public final SwipeRulesProcessor m37600c() {
        return new SwipeRulesProcessor();
    }

    @EngineScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final RecsRepository m37597a(@NotNull Config config, @CardStack @NotNull Lazy<C10991h> lazy, @CardGrid @NotNull Lazy<C10991h> lazy2) {
        C2668g.b(config, "config");
        C2668g.b(lazy, "cardStackRecsDataRepository");
        C2668g.b(lazy2, "cardGridRecsDataRepository");
        switch (C8840e.f30980a[config.getLoaderType().ordinal()]) {
            case 1:
                config = lazy.get();
                C2668g.a(config, "cardStackRecsDataRepository.get()");
                return (RecsRepository) config;
            case 2:
                config = lazy2.get();
                C2668g.a(config, "cardGridRecsDataRepository.get()");
                return (RecsRepository) config;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @EngineScope
    @NotNull
    @Provides
    /* renamed from: b */
    public final RecsLoader m37599b(@NotNull Config config, @CardStack @NotNull Lazy<RecsLoader> lazy, @CardGrid @NotNull Lazy<RecsLoader> lazy2) {
        C2668g.b(config, "config");
        C2668g.b(lazy, "cardStackRecsLoader");
        C2668g.b(lazy2, "cardGridRecsLoader");
        switch (C8840e.f30981b[config.getLoaderType().ordinal()]) {
            case 1:
                config = lazy.get();
                C2668g.a(config, "cardStackRecsLoader.get()");
                return (RecsLoader) config;
            case 2:
                config = lazy2.get();
                C2668g.a(config, "cardGridRecsLoader.get()");
                return (RecsLoader) config;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
