package com.tinder.match.sponsoredmessage;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.sponsoredmessage.C15033d;
import com.tinder.sponsoredmessage.SponsoredMessageAdMonitor;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.p */
public final class C13458p implements Factory<LifecycleObserver> {
    /* renamed from: a */
    private final C9882h f42673a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42674b;
    /* renamed from: c */
    private final Provider<V1SponsoredMessageAdMonitor> f42675c;
    /* renamed from: d */
    private final Provider<SponsoredMessageAdMonitor> f42676d;
    /* renamed from: e */
    private final Provider<C15033d> f42677e;

    public /* synthetic */ Object get() {
        return m51981a();
    }

    /* renamed from: a */
    public LifecycleObserver m51981a() {
        return C13458p.m51980a(this.f42673a, this.f42674b, this.f42675c, this.f42676d, this.f42677e);
    }

    /* renamed from: a */
    public static LifecycleObserver m51980a(C9882h c9882h, Provider<AbTestUtility> provider, Provider<V1SponsoredMessageAdMonitor> provider2, Provider<SponsoredMessageAdMonitor> provider3, Provider<C15033d> provider4) {
        return C13458p.m51979a(c9882h, (AbTestUtility) provider.get(), (V1SponsoredMessageAdMonitor) provider2.get(), (SponsoredMessageAdMonitor) provider3.get(), (C15033d) provider4.get());
    }

    /* renamed from: a */
    public static LifecycleObserver m51979a(C9882h c9882h, AbTestUtility abTestUtility, V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor, SponsoredMessageAdMonitor sponsoredMessageAdMonitor, C15033d c15033d) {
        return (LifecycleObserver) C15521i.a(c9882h.m40658a(abTestUtility, v1SponsoredMessageAdMonitor, sponsoredMessageAdMonitor, c15033d), "Cannot return null from a non-@Nullable @Provides method");
    }
}
