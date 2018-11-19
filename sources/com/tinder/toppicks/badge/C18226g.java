package com.tinder.toppicks.badge;

import android.content.res.Resources;
import com.tinder.discovery.tooltip.C11145a.C8892a;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.fireboarding.domain.C11806k;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.subjects.C18432c;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.badge.g */
public final class C18226g implements Factory<Trigger> {
    /* renamed from: a */
    private final TopPicksTriggerModule f56497a;
    /* renamed from: b */
    private final Provider<C9835c> f56498b;
    /* renamed from: c */
    private final Provider<SwipeCountRepository> f56499c;
    /* renamed from: d */
    private final Provider<Resources> f56500d;
    /* renamed from: e */
    private final Provider<TopPicksConfig> f56501e;
    /* renamed from: f */
    private final Provider<C11806k> f56502f;
    /* renamed from: g */
    private final Provider<CheckTutorialViewed> f56503g;
    /* renamed from: h */
    private final Provider<ConfirmTutorialsViewed> f56504h;
    /* renamed from: i */
    private final Provider<C18432c<Boolean>> f56505i;
    /* renamed from: j */
    private final Provider<C8892a> f56506j;

    public /* synthetic */ Object get() {
        return m66066a();
    }

    public C18226g(TopPicksTriggerModule topPicksTriggerModule, Provider<C9835c> provider, Provider<SwipeCountRepository> provider2, Provider<Resources> provider3, Provider<TopPicksConfig> provider4, Provider<C11806k> provider5, Provider<CheckTutorialViewed> provider6, Provider<ConfirmTutorialsViewed> provider7, Provider<C18432c<Boolean>> provider8, Provider<C8892a> provider9) {
        this.f56497a = topPicksTriggerModule;
        this.f56498b = provider;
        this.f56499c = provider2;
        this.f56500d = provider3;
        this.f56501e = provider4;
        this.f56502f = provider5;
        this.f56503g = provider6;
        this.f56504h = provider7;
        this.f56505i = provider8;
        this.f56506j = provider9;
    }

    /* renamed from: a */
    public Trigger m66066a() {
        return C18226g.m66064a(this.f56497a, this.f56498b, this.f56499c, this.f56500d, this.f56501e, this.f56502f, this.f56503g, this.f56504h, this.f56505i, this.f56506j);
    }

    /* renamed from: a */
    public static Trigger m66064a(TopPicksTriggerModule topPicksTriggerModule, Provider<C9835c> provider, Provider<SwipeCountRepository> provider2, Provider<Resources> provider3, Provider<TopPicksConfig> provider4, Provider<C11806k> provider5, Provider<CheckTutorialViewed> provider6, Provider<ConfirmTutorialsViewed> provider7, Provider<C18432c<Boolean>> provider8, Provider<C8892a> provider9) {
        return C18226g.m66063a(topPicksTriggerModule, (C9835c) provider.get(), (SwipeCountRepository) provider2.get(), (Resources) provider3.get(), (TopPicksConfig) provider4.get(), (C11806k) provider5.get(), (CheckTutorialViewed) provider6.get(), (ConfirmTutorialsViewed) provider7.get(), (C18432c) provider8.get(), (C8892a) provider9.get());
    }

    /* renamed from: b */
    public static C18226g m66065b(TopPicksTriggerModule topPicksTriggerModule, Provider<C9835c> provider, Provider<SwipeCountRepository> provider2, Provider<Resources> provider3, Provider<TopPicksConfig> provider4, Provider<C11806k> provider5, Provider<CheckTutorialViewed> provider6, Provider<ConfirmTutorialsViewed> provider7, Provider<C18432c<Boolean>> provider8, Provider<C8892a> provider9) {
        return new C18226g(topPicksTriggerModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: a */
    public static Trigger m66063a(TopPicksTriggerModule topPicksTriggerModule, C9835c c9835c, SwipeCountRepository swipeCountRepository, Resources resources, TopPicksConfig topPicksConfig, C11806k c11806k, CheckTutorialViewed checkTutorialViewed, ConfirmTutorialsViewed confirmTutorialsViewed, C18432c<Boolean> c18432c, C8892a c8892a) {
        return (Trigger) C15521i.m58001a(topPicksTriggerModule.m57297a(c9835c, swipeCountRepository, resources, topPicksConfig, c11806k, checkTutorialViewed, confirmTutorialsViewed, c18432c, c8892a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
