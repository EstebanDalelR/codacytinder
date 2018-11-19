package com.tinder.match.sponsoredmessage;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.domain.match.usecase.CreateMessageAdMatch;
import com.tinder.match.p092d.C3942a;
import com.tinder.recsads.rule.C18793c.C14761a;
import com.tinder.sponsoredmessage.SponsoredMessageAdMonitor;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.q */
public final class C13459q implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private final C9882h f42678a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42679b;
    /* renamed from: c */
    private final Provider<SponsoredMessageAdMonitor> f42680c;
    /* renamed from: d */
    private final Provider<V1SponsoredMessageAdMonitor> f42681d;
    /* renamed from: e */
    private final Provider<C3942a> f42682e;
    /* renamed from: f */
    private final Provider<CreateMessageAdMatch> f42683f;
    /* renamed from: g */
    private final Provider<C14761a> f42684g;

    public /* synthetic */ Object get() {
        return m51984a();
    }

    /* renamed from: a */
    public OnPageSelectedListener m51984a() {
        return C13459q.m51983a(this.f42678a, this.f42679b, this.f42680c, this.f42681d, this.f42682e, this.f42683f, this.f42684g);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m51983a(C9882h c9882h, Provider<AbTestUtility> provider, Provider<SponsoredMessageAdMonitor> provider2, Provider<V1SponsoredMessageAdMonitor> provider3, Provider<C3942a> provider4, Provider<CreateMessageAdMatch> provider5, Provider<C14761a> provider6) {
        return C13459q.m51982a(c9882h, (AbTestUtility) provider.get(), (SponsoredMessageAdMonitor) provider2.get(), (V1SponsoredMessageAdMonitor) provider3.get(), (C3942a) provider4.get(), (CreateMessageAdMatch) provider5.get(), (C14761a) provider6.get());
    }

    /* renamed from: a */
    public static OnPageSelectedListener m51982a(C9882h c9882h, AbTestUtility abTestUtility, SponsoredMessageAdMonitor sponsoredMessageAdMonitor, V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor, C3942a c3942a, CreateMessageAdMatch createMessageAdMatch, C14761a c14761a) {
        return (OnPageSelectedListener) C15521i.a(c9882h.m40661a(abTestUtility, sponsoredMessageAdMonitor, v1SponsoredMessageAdMonitor, c3942a, createMessageAdMatch, c14761a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
