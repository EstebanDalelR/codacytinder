package com.tinder.discovery.p234c;

import com.tinder.base.p172b.C8301a;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.main.model.MainPage;
import com.tinder.main.router.MainPageRouter;
import com.tinder.scope.ActivityScope;
import dagger.Lazy;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/discovery/router/DiscoverySegmentRouter;", "", "lazyTabView", "Ldagger/Lazy;", "Lcom/tinder/discovery/view/DiscoveryTabView;", "mainThreadExecutionVerifier", "Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;", "mainPageRouter", "Lcom/tinder/main/router/MainPageRouter;", "(Ldagger/Lazy;Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;Lcom/tinder/main/router/MainPageRouter;)V", "navigateTo", "", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "setActiveSegmentSkipMainPage", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.c.a */
public final class C8890a {
    /* renamed from: a */
    private final Lazy<DiscoveryTabView> f31120a;
    /* renamed from: b */
    private final C8301a f31121b;
    /* renamed from: c */
    private final MainPageRouter f31122c;

    @Inject
    public C8890a(@NotNull @ActivityScope Lazy<DiscoveryTabView> lazy, @NotNull C8301a c8301a, @NotNull MainPageRouter mainPageRouter) {
        C2668g.b(lazy, "lazyTabView");
        C2668g.b(c8301a, "mainThreadExecutionVerifier");
        C2668g.b(mainPageRouter, "mainPageRouter");
        this.f31120a = lazy;
        this.f31121b = c8301a;
        this.f31122c = mainPageRouter;
    }

    /* renamed from: a */
    public final void m37693a(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "discoverySegment");
        this.f31121b.m35392a();
        this.f31122c.navigateTo(MainPage.DISCOVERY);
        ((DiscoveryTabView) this.f31120a.get()).setActiveSegment(discoverySegment);
    }

    /* renamed from: b */
    public final void m37694b(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "discoverySegment");
        this.f31121b.m35392a();
        ((DiscoveryTabView) this.f31120a.get()).setActiveSegment(discoverySegment);
    }
}
