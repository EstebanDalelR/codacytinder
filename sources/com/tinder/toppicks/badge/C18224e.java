package com.tinder.toppicks.badge;

import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.toppicks.badge.e */
public final class C18224e implements Factory<OnSegmentChangedListener> {
    /* renamed from: a */
    private final TopPicksTriggerModule f56491a;
    /* renamed from: b */
    private final Provider<TopPicksApplicationRepository> f56492b;
    /* renamed from: c */
    private final Provider<Function0<DateTime>> f56493c;
    /* renamed from: d */
    private final Provider<TopPicksConfig> f56494d;

    public /* synthetic */ Object get() {
        return m66058a();
    }

    public C18224e(TopPicksTriggerModule topPicksTriggerModule, Provider<TopPicksApplicationRepository> provider, Provider<Function0<DateTime>> provider2, Provider<TopPicksConfig> provider3) {
        this.f56491a = topPicksTriggerModule;
        this.f56492b = provider;
        this.f56493c = provider2;
        this.f56494d = provider3;
    }

    /* renamed from: a */
    public OnSegmentChangedListener m66058a() {
        return C18224e.m66056a(this.f56491a, this.f56492b, this.f56493c, this.f56494d);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m66056a(TopPicksTriggerModule topPicksTriggerModule, Provider<TopPicksApplicationRepository> provider, Provider<Function0<DateTime>> provider2, Provider<TopPicksConfig> provider3) {
        return C18224e.m66055a(topPicksTriggerModule, (TopPicksApplicationRepository) provider.get(), (Function0) provider2.get(), (TopPicksConfig) provider3.get());
    }

    /* renamed from: b */
    public static C18224e m66057b(TopPicksTriggerModule topPicksTriggerModule, Provider<TopPicksApplicationRepository> provider, Provider<Function0<DateTime>> provider2, Provider<TopPicksConfig> provider3) {
        return new C18224e(topPicksTriggerModule, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m66055a(TopPicksTriggerModule topPicksTriggerModule, TopPicksApplicationRepository topPicksApplicationRepository, Function0<DateTime> function0, TopPicksConfig topPicksConfig) {
        return (OnSegmentChangedListener) C15521i.m58001a(topPicksTriggerModule.m57295a(topPicksApplicationRepository, function0, topPicksConfig), "Cannot return null from a non-@Nullable @Provides method");
    }
}
