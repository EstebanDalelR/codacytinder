package com.tinder.toppicks.badge;

import com.tinder.discovery.p235d.C11140a.C8891a;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.main.trigger.Trigger;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.subjects.C18432c;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.toppicks.badge.d */
public final class C18223d implements Factory<Trigger> {
    /* renamed from: a */
    private final TopPicksTriggerModule f56485a;
    /* renamed from: b */
    private final Provider<TopPicksApplicationRepository> f56486b;
    /* renamed from: c */
    private final Provider<Function0<DateTime>> f56487c;
    /* renamed from: d */
    private final Provider<C8891a> f56488d;
    /* renamed from: e */
    private final Provider<TopPicksConfig> f56489e;
    /* renamed from: f */
    private final Provider<C18432c<Boolean>> f56490f;

    public /* synthetic */ Object get() {
        return m66054a();
    }

    public C18223d(TopPicksTriggerModule topPicksTriggerModule, Provider<TopPicksApplicationRepository> provider, Provider<Function0<DateTime>> provider2, Provider<C8891a> provider3, Provider<TopPicksConfig> provider4, Provider<C18432c<Boolean>> provider5) {
        this.f56485a = topPicksTriggerModule;
        this.f56486b = provider;
        this.f56487c = provider2;
        this.f56488d = provider3;
        this.f56489e = provider4;
        this.f56490f = provider5;
    }

    /* renamed from: a */
    public Trigger m66054a() {
        return C18223d.m66052a(this.f56485a, this.f56486b, this.f56487c, this.f56488d, this.f56489e, this.f56490f);
    }

    /* renamed from: a */
    public static Trigger m66052a(TopPicksTriggerModule topPicksTriggerModule, Provider<TopPicksApplicationRepository> provider, Provider<Function0<DateTime>> provider2, Provider<C8891a> provider3, Provider<TopPicksConfig> provider4, Provider<C18432c<Boolean>> provider5) {
        return C18223d.m66051a(topPicksTriggerModule, (TopPicksApplicationRepository) provider.get(), (Function0) provider2.get(), (C8891a) provider3.get(), (TopPicksConfig) provider4.get(), (C18432c) provider5.get());
    }

    /* renamed from: b */
    public static C18223d m66053b(TopPicksTriggerModule topPicksTriggerModule, Provider<TopPicksApplicationRepository> provider, Provider<Function0<DateTime>> provider2, Provider<C8891a> provider3, Provider<TopPicksConfig> provider4, Provider<C18432c<Boolean>> provider5) {
        return new C18223d(topPicksTriggerModule, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static Trigger m66051a(TopPicksTriggerModule topPicksTriggerModule, TopPicksApplicationRepository topPicksApplicationRepository, Function0<DateTime> function0, C8891a c8891a, TopPicksConfig topPicksConfig, C18432c<Boolean> c18432c) {
        return (Trigger) C15521i.m58001a(topPicksTriggerModule.m57296a(topPicksApplicationRepository, function0, c8891a, topPicksConfig, c18432c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
