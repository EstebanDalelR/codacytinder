package com.tinder.main.tab.listener;

import com.tinder.common.logger.Logger;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p234c.C8890a;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.domain.places.provider.PlacesDiscoverToggleProvider;
import com.tinder.main.model.MainPage;
import com.tinder.places.provider.C10271c;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/main/tab/listener/DiscoveryTabViewPageSelectedListener;", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "placesDiscoverToggleProvider", "Lcom/tinder/domain/places/provider/PlacesDiscoverToggleProvider;", "discoverySegmentRouter", "Lcom/tinder/discovery/router/DiscoverySegmentRouter;", "placeFrontmostProvider", "Lcom/tinder/places/provider/PlaceFrontmostProvider;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/places/provider/PlacesDiscoverToggleProvider;Lcom/tinder/discovery/router/DiscoverySegmentRouter;Lcom/tinder/places/provider/PlaceFrontmostProvider;Lcom/tinder/common/logger/Logger;)V", "getDiscoverySegmentRouter", "()Lcom/tinder/discovery/router/DiscoverySegmentRouter;", "discoveryTabView", "Lcom/tinder/discovery/view/DiscoveryTabView;", "getPlacesDiscoverToggleProvider", "()Lcom/tinder/domain/places/provider/PlacesDiscoverToggleProvider;", "shouldShowPlacesToggleCollapseSubscription", "Lio/reactivex/disposables/Disposable;", "onPageReselected", "", "reselectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "onPageScrollChanged", "state", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "onPageSelected", "selectedPage", "previousPage", "onPageUnselected", "unselectedPage", "setDiscoveryTabView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.tab.listener.a */
public final class C12001a implements OnPageSelectedListener {
    /* renamed from: a */
    private DiscoveryTabView f38957a;
    /* renamed from: b */
    private Disposable f38958b;
    @NotNull
    /* renamed from: c */
    private final PlacesDiscoverToggleProvider f38959c;
    @NotNull
    /* renamed from: d */
    private final C8890a f38960d;
    /* renamed from: e */
    private final C10271c f38961e;
    /* renamed from: f */
    private final Logger f38962f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tab.listener.a$a */
    static final class C11998a<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C11998a f38954a = new C11998a();

        C11998a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48040a((Boolean) obj);
        }

        /* renamed from: a */
        public final boolean m48040a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return C2668g.a(bool, Boolean.valueOf(true));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tab.listener.a$b */
    static final class C11999b<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C12001a f38955a;

        C11999b(C12001a c12001a) {
            this.f38955a = c12001a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48041a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m48041a(Boolean bool) {
            this.f38955a.m48044a().m37694b(DiscoverySegment.PLACES);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tab.listener.a$c */
    static final class C12000c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C12001a f38956a;

        C12000c(C12001a c12001a) {
            this.f38956a = c12001a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48042a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48042a(Throwable th) {
            Logger a = this.f38956a.f38962f;
            C2668g.a(th, "it");
            a.error(th, "error observeShouldShowPlacesToggleCollapse");
        }
    }

    public void onPageReselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "reselectedPage");
    }

    public void onPageScrollChanged(@NotNull ScrollState scrollState) {
        C2668g.b(scrollState, "state");
    }

    public C12001a(@NotNull PlacesDiscoverToggleProvider placesDiscoverToggleProvider, @NotNull C8890a c8890a, @NotNull C10271c c10271c, @NotNull Logger logger) {
        C2668g.b(placesDiscoverToggleProvider, "placesDiscoverToggleProvider");
        C2668g.b(c8890a, "discoverySegmentRouter");
        C2668g.b(c10271c, "placeFrontmostProvider");
        C2668g.b(logger, "logger");
        this.f38959c = placesDiscoverToggleProvider;
        this.f38960d = c8890a;
        this.f38961e = c10271c;
        this.f38962f = logger;
    }

    @NotNull
    /* renamed from: a */
    public final C8890a m48044a() {
        return this.f38960d;
    }

    public void onPageSelected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @Nullable TabbedPageLayout$Page tabbedPageLayout$Page2) {
        C2668g.b(tabbedPageLayout$Page, "selectedPage");
        boolean z = false;
        this.f38961e.m41662b(tabbedPageLayout$Page == MainPage.DISCOVERY);
        tabbedPageLayout$Page2 = this.f38957a;
        if (tabbedPageLayout$Page2 == null) {
            C2668g.b("discoveryTabView");
        }
        if (tabbedPageLayout$Page == MainPage.DISCOVERY) {
            z = true;
        }
        tabbedPageLayout$Page2.setSelected(z);
        tabbedPageLayout$Page = this.f38958b;
        if (tabbedPageLayout$Page != null) {
            tabbedPageLayout$Page.dispose();
        }
        tabbedPageLayout$Page = this.f38957a;
        if (tabbedPageLayout$Page == null) {
            C2668g.b("discoveryTabView");
        }
        if (tabbedPageLayout$Page.isSelected() == null) {
            this.f38958b = this.f38959c.observeShouldShowPlacesToggleCollapse().a((Predicate) C11998a.f38954a).a((Consumer) new C11999b(this), new C12000c(this));
        }
    }

    public void onPageUnselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "unselectedPage");
        tabbedPageLayout$Page = this.f38957a;
        if (tabbedPageLayout$Page == null) {
            C2668g.b("discoveryTabView");
        }
        tabbedPageLayout$Page.setSelected(false);
    }

    /* renamed from: a */
    public final void m48045a(@NotNull DiscoveryTabView discoveryTabView) {
        C2668g.b(discoveryTabView, "discoveryTabView");
        this.f38957a = discoveryTabView;
    }
}
