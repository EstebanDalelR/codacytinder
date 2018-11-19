package com.tinder.app.dagger.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.profile.usecase.IsUserDueForFeedTooltip;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.app.dagger.module.r */
public final class C12529r implements Factory<IsUserDueForFeedTooltip> {
    /* renamed from: a */
    private final C8253o f40377a;
    /* renamed from: b */
    private final Provider<LastActivityDateRepository> f40378b;
    /* renamed from: c */
    private final Provider<Function0<DateTime>> f40379c;
    /* renamed from: d */
    private final Provider<AbTestUtility> f40380d;

    public /* synthetic */ Object get() {
        return m49307a();
    }

    public C12529r(C8253o c8253o, Provider<LastActivityDateRepository> provider, Provider<Function0<DateTime>> provider2, Provider<AbTestUtility> provider3) {
        this.f40377a = c8253o;
        this.f40378b = provider;
        this.f40379c = provider2;
        this.f40380d = provider3;
    }

    /* renamed from: a */
    public IsUserDueForFeedTooltip m49307a() {
        return C12529r.m49305a(this.f40377a, this.f40378b, this.f40379c, this.f40380d);
    }

    /* renamed from: a */
    public static IsUserDueForFeedTooltip m49305a(C8253o c8253o, Provider<LastActivityDateRepository> provider, Provider<Function0<DateTime>> provider2, Provider<AbTestUtility> provider3) {
        return C12529r.m49304a(c8253o, (LastActivityDateRepository) provider.get(), (Function0) provider2.get(), (AbTestUtility) provider3.get());
    }

    /* renamed from: b */
    public static C12529r m49306b(C8253o c8253o, Provider<LastActivityDateRepository> provider, Provider<Function0<DateTime>> provider2, Provider<AbTestUtility> provider3) {
        return new C12529r(c8253o, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static IsUserDueForFeedTooltip m49304a(C8253o c8253o, LastActivityDateRepository lastActivityDateRepository, Function0<DateTime> function0, AbTestUtility abTestUtility) {
        return (IsUserDueForFeedTooltip) C15521i.a(c8253o.m35219a(lastActivityDateRepository, function0, abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
