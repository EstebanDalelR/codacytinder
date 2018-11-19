package com.tinder.discovery.analytics;

import android.annotation.SuppressLint;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import com.tinder.discovery.analytics.C13143a.C8879a;
import com.tinder.discovery.analytics.model.NavigationAction;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.etl.event.vv;
import com.tinder.main.model.MainPage;
import io.reactivex.C15679f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0017J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/discovery/analytics/SessionNavigationAnalyticsNavigationListener;", "Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "sessionEventFactory", "Lcom/tinder/discovery/analytics/SessionEventFactory;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "addDiscoverySessionNavigateEvent", "Lcom/tinder/discovery/analytics/AddDiscoverySessionNavigateEvent;", "discoverySegmentRepository", "Lcom/tinder/discovery/domain/DiscoverySegmentRepository;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/discovery/analytics/SessionEventFactory;Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/discovery/analytics/AddDiscoverySessionNavigateEvent;Lcom/tinder/discovery/domain/DiscoverySegmentRepository;Lio/reactivex/Scheduler;)V", "onPageReselected", "", "reselectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "onPageScrollChanged", "state", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "onPageSelected", "selectedPage", "previousPage", "onPageUnselected", "unselectedPage", "onSegmentChanged", "nextSegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "prevSegment", "onSegmentClicked", "segment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.k */
public final class C11131k implements OnPageSelectedListener, OnSegmentChangedListener {
    /* renamed from: a */
    private final C8881i f36011a;
    /* renamed from: b */
    private final C2630h f36012b;
    /* renamed from: c */
    private final C13143a f36013c;
    /* renamed from: d */
    private final DiscoverySegmentRepository f36014d;
    /* renamed from: e */
    private final C15679f f36015e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/SessionNavigateEvent;", "discoverySegments", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.k$a */
    static final class C11128a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C11131k f36006a;
        /* renamed from: b */
        final /* synthetic */ TabbedPageLayout$Page f36007b;
        /* renamed from: c */
        final /* synthetic */ TabbedPageLayout$Page f36008c;

        C11128a(C11131k c11131k, TabbedPageLayout$Page tabbedPageLayout$Page, TabbedPageLayout$Page tabbedPageLayout$Page2) {
            this.f36006a = c11131k;
            this.f36007b = tabbedPageLayout$Page;
            this.f36008c = tabbedPageLayout$Page2;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43866a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final vv m43866a(@NotNull List<? extends DiscoverySegment> list) {
            C2668g.b(list, "discoverySegments");
            C8881i a = this.f36006a.f36011a;
            TabbedPageLayout$Page tabbedPageLayout$Page = this.f36007b;
            if (tabbedPageLayout$Page == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.main.model.MainPage");
            }
            MainPage mainPage = (MainPage) tabbedPageLayout$Page;
            TabbedPageLayout$Page tabbedPageLayout$Page2 = this.f36008c;
            if (tabbedPageLayout$Page2 != null) {
                return a.m37664a(mainPage, (MainPage) tabbedPageLayout$Page2, NavigationAction.TAP, list);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.main.model.MainPage");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/SessionNavigateEvent;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.k$b */
    static final class C11129b<T> implements Consumer<vv> {
        /* renamed from: a */
        final /* synthetic */ C11131k f36009a;

        C11129b(C11131k c11131k) {
            this.f36009a = c11131k;
        }

        public /* synthetic */ void accept(Object obj) {
            m43867a((vv) obj);
        }

        /* renamed from: a */
        public final void m43867a(vv vvVar) {
            this.f36009a.f36012b.a(vvVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.k$c */
    static final class C11130c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11130c f36010a = new C11130c();

        C11130c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m43868a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43868a(Throwable th) {
            C0001a.c(th, "Failed to send Session.Navigate event", new Object[0]);
        }
    }

    public void onPageReselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "reselectedPage");
    }

    public void onPageScrollChanged(@NotNull ScrollState scrollState) {
        C2668g.b(scrollState, "state");
    }

    public void onPageUnselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "unselectedPage");
    }

    public void onSegmentClicked(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "segment");
    }

    public C11131k(@NotNull C8881i c8881i, @NotNull C2630h c2630h, @NotNull C13143a c13143a, @NotNull DiscoverySegmentRepository discoverySegmentRepository, @NotNull C15679f c15679f) {
        C2668g.b(c8881i, "sessionEventFactory");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c13143a, "addDiscoverySessionNavigateEvent");
        C2668g.b(discoverySegmentRepository, "discoverySegmentRepository");
        C2668g.b(c15679f, "scheduler");
        this.f36011a = c8881i;
        this.f36012b = c2630h;
        this.f36013c = c13143a;
        this.f36014d = discoverySegmentRepository;
        this.f36015e = c15679f;
    }

    public void onSegmentChanged(@NotNull DiscoverySegment discoverySegment, @Nullable DiscoverySegment discoverySegment2) {
        C2668g.b(discoverySegment, "nextSegment");
        if (discoverySegment2 != null) {
            this.f36013c.m51077a(new C8879a(discoverySegment2, discoverySegment, NavigationAction.TAP));
        }
    }

    @SuppressLint({"CheckResult"})
    public void onPageSelected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @Nullable TabbedPageLayout$Page tabbedPageLayout$Page2) {
        C2668g.b(tabbedPageLayout$Page, "selectedPage");
        if (tabbedPageLayout$Page2 != null) {
            this.f36014d.observeDiscoverySegments().f().b(this.f36015e).e(new C11128a(this, tabbedPageLayout$Page2, tabbedPageLayout$Page)).a((Consumer) new C11129b(this), C11130c.f36010a);
        }
    }
}
