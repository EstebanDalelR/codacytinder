package com.tinder.app.dagger.module.main;

import android.arch.lifecycle.LifecycleObserver;
import android.view.LayoutInflater;
import com.tinder.activities.MainActivity;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.analytics.C11127h;
import com.tinder.discovery.analytics.C11131k;
import com.tinder.discovery.analytics.C13143a;
import com.tinder.discovery.analytics.C13147g;
import com.tinder.discovery.analytics.C8881i;
import com.tinder.discovery.analytics.DiscoverySegmentNotificationLedger;
import com.tinder.discovery.badge.p334b.C11137a;
import com.tinder.discovery.domain.C11143a;
import com.tinder.discovery.domain.C11144b;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import com.tinder.discovery.domain.DiscoverySegmentSequencer;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.observer.DiscoverySegmentsChangeObserver;
import com.tinder.discovery.p231a.C11119a;
import com.tinder.discovery.p231a.C13142b;
import com.tinder.discovery.p232b.C11136d;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.discovery.view.DiscoveryTabView.Adapter.OnSegmentsUpdatedListener;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.discovery.view.animator.C13150a;
import com.tinder.discovery.view.animator.PlacesDiscoveryViewAnimator;
import com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.C8908a;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.ChildViewPreDetachListener;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.main.adapter.C13386b;
import com.tinder.main.model.MainPage;
import com.tinder.main.p346b.p347a.C11992a;
import com.tinder.main.qualifier.MainActivityQualifier;
import com.tinder.main.tab.listener.C12001a;
import com.tinder.places.PlacesMainActivityLifecycleObserver;
import com.tinder.places.main.view.C12375f;
import com.tinder.places.p156a.C7343b;
import com.tinder.scope.ActivityScope;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import io.reactivex.C15679f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u001b\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0007J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\b\u0010\u001d\u001a\u00020\u0006H\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0007JD\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001a2\u0011\u0010#\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00140$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\t\u0012\u00070(¢\u0006\u0002\b\u00140&H\u0007J#\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0011\u0010,\u001a\r\u0012\t\u0012\u00070-¢\u0006\u0002\b\u00140$H\u0007J\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000&H\u0007J.\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\"2\u001c\u00103\u001a\u0018\u0012\t\u0012\u00070/¢\u0006\u0002\b\u0014\u0012\t\u0012\u000700¢\u0006\u0002\b\u00140&H\u0007J\u0018\u00104\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u00105\u001a\u00020\u001fH\u0007J\b\u00106\u001a\u000207H\u0007J\b\u00108\u001a\u000209H\u0007J\u0010\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<H\u0007J2\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010A\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020>H\u0007J\u0010\u0010D\u001a\u00020\u00102\u0006\u0010C\u001a\u00020>H\u0007J\u0010\u0010E\u001a\u00020\u00102\u0006\u00102\u001a\u00020\"H\u0007J,\u0010F\u001a\u00020G2\u0006\u00102\u001a\u00020\"2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000&2\u0006\u0010H\u001a\u00020IH\u0007J\u0010\u0010J\u001a\u00020K2\u0006\u0010\t\u001a\u00020\nH\u0007J\f\u0010L\u001a\u000200*\u00020/H\u0002¨\u0006M"}, d2 = {"Lcom/tinder/app/dagger/module/main/DiscoveryModule;", "", "()V", "provideAddDiscoverySessionNavigateEvent", "Lcom/tinder/discovery/analytics/AddDiscoverySessionNavigateEvent;", "segmentNotificationLedger", "Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "discoverySegmentRepository", "Lcom/tinder/discovery/domain/DiscoverySegmentRepository;", "calculateTogglesAvailableBitwise", "Lcom/tinder/discovery/analytics/CalculateTogglesAvailableBitwise;", "scheduler", "Lio/reactivex/Scheduler;", "provideBadgingSegmentChangeListener", "Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "lazyDiscoveryTabView", "Ldagger/Lazy;", "Lcom/tinder/discovery/view/DiscoveryTabView;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideDiscoverySegmentChangeObserver", "Landroid/arch/lifecycle/LifecycleObserver;", "observerDiscoverySegments", "Lcom/tinder/discovery/domain/ObserverDiscoverySegments;", "discoveryToggleNavigationAdapter", "Lcom/tinder/discovery/adapter/DiscoveryToggleNavigationAdapter;", "discoverySingleViewSwitcherAdapter", "Lcom/tinder/discovery/adapter/DiscoverySingleViewSwitcherAdapter;", "provideDiscoverySegmentNotificationLedger", "provideDiscoverySegmentSequencer", "Lcom/tinder/discovery/domain/DiscoverySegmentSequencer;", "provideDiscoveryTabView", "context", "Lcom/tinder/activities/MainActivity;", "segmentChangeListeners", "", "mainPageListeners", "", "Lcom/tinder/main/model/MainPage;", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "provideDiscoveryToggleNavigationAdapter", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "segmentUpdatedListeners", "Lcom/tinder/discovery/view/DiscoveryTabView$Adapter$OnSegmentsUpdatedListener;", "provideDiscoveryViewAnimators", "Lcom/tinder/discovery/model/DiscoverySegment;", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewAnimator;", "provideDiscoveryViewPagerAdapter", "mainActivity", "discoveryChildViewAnimators", "provideObserverDiscoverySegmentChanges", "discoverySegmentSequencer", "providePlacesDiscoveryChildViewPreDetachListener", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewPreDetachListener;", "providePlacesDiscoverySegmentListener", "Lcom/tinder/places/badge/PlacesDiscoverySegmentAvailableProvider;", "providePlacesMainActivityLifecycleObserver", "placesMainActivityLifecycleObserver", "Lcom/tinder/places/PlacesMainActivityLifecycleObserver;", "provideSessionNavigationAnalyticsNavigationListener", "Lcom/tinder/discovery/analytics/SessionNavigationAnalyticsNavigationListener;", "sessionNavigateEventFactory", "Lcom/tinder/discovery/analytics/SessionEventFactory;", "addDiscoverySessionNavigateEvent", "provideSessionNavigationAnalyticsPageSelectedListener", "navigationListener", "provideSessionNavigationAnalyticsSegmentChangeListener", "provideTabProxyingSegmentChangeListener", "provideTinderDiscoveryViewContainerAdapter", "Lcom/tinder/main/adapter/TinderDiscoveryViewContainerAdapter;", "inflater", "Landroid/view/LayoutInflater;", "provideUpdateDiscoverySegments", "Lcom/tinder/discovery/domain/UpdateDiscoverySegments;", "createAnimator", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.app.dagger.module.main.a */
public final class C8251a {
    @ActivityScope
    @IntoSet
    @MainActivityQualifier
    @NotNull
    @Provides
    /* renamed from: a */
    public final LifecycleObserver m35199a(@NotNull C11143a c11143a, @NotNull C13142b c13142b, @NotNull C11119a c11119a) {
        C2668g.b(c11143a, "observerDiscoverySegments");
        C2668g.b(c13142b, "discoveryToggleNavigationAdapter");
        C2668g.b(c11119a, "discoverySingleViewSwitcherAdapter");
        return new DiscoverySegmentsChangeObserver(c11143a, c13142b, c11119a);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C11143a m35206a(@NotNull DiscoverySegmentRepository discoverySegmentRepository, @NotNull DiscoverySegmentSequencer discoverySegmentSequencer) {
        C2668g.b(discoverySegmentRepository, "discoverySegmentRepository");
        C2668g.b(discoverySegmentSequencer, "discoverySegmentSequencer");
        return new C11143a(discoverySegmentRepository, discoverySegmentSequencer);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C11144b m35207a(@NotNull DiscoverySegmentRepository discoverySegmentRepository) {
        C2668g.b(discoverySegmentRepository, "discoverySegmentRepository");
        return new C11144b(discoverySegmentRepository);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final DiscoverySegmentSequencer m35205a() {
        return new C11136d();
    }

    @ActivityScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C11119a m35201a(@NotNull MainActivity mainActivity, @NotNull Map<DiscoverySegment, C8908a> map) {
        C2668g.b(mainActivity, "mainActivity");
        C2668g.b(map, "discoveryChildViewAnimators");
        LayoutInflater from = LayoutInflater.from(mainActivity);
        C2668g.a(from, "LayoutInflater.from(mainActivity)");
        return new C13386b(mainActivity, map, from);
    }

    @ActivityScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C13142b m35202a(@NotNull SubscriptionProvider subscriptionProvider, @NotNull Set<OnSegmentsUpdatedListener> set) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(set, "segmentUpdatedListeners");
        return new C13142b(set, subscriptionProvider);
    }

    @ActivityScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final DiscoveryTabView m35211a(@NotNull MainActivity mainActivity, @NotNull C13142b c13142b, @NotNull Set<OnSegmentChangedListener> set, @NotNull Map<MainPage, OnPageSelectedListener> map) {
        C2668g.b(mainActivity, "context");
        C2668g.b(c13142b, "discoveryToggleNavigationAdapter");
        C2668g.b(set, "segmentChangeListeners");
        C2668g.b(map, "mainPageListeners");
        DiscoveryTabView discoveryTabView = new DiscoveryTabView(mainActivity, c13142b, set);
        mainActivity = map.get(MainPage.DISCOVERY);
        if (mainActivity == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.main.tab.listener.DiscoveryTabViewPageSelectedListener");
        }
        ((C12001a) mainActivity).m48045a(discoveryTabView);
        return discoveryTabView;
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final OnSegmentChangedListener m35208a(@NotNull MainActivity mainActivity) {
        C2668g.b(mainActivity, "mainActivity");
        return new C11992a(mainActivity);
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final Map<DiscoverySegment, C8908a> m35213b() {
        DiscoverySegment[] values = DiscoverySegment.values();
        Map<DiscoverySegment, C8908a> linkedHashMap = new LinkedHashMap(C19068g.c(ae.a(values.length), 16));
        for (DiscoverySegment discoverySegment : values) {
            linkedHashMap.put(discoverySegment, m35198a(discoverySegment));
        }
        return linkedHashMap;
    }

    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final OnSegmentChangedListener m35210a(@NotNull Lazy<DiscoveryTabView> lazy) {
        C2668g.b(lazy, "lazyDiscoveryTabView");
        return new C11137a(lazy);
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: a */
    public final C11131k m35204a(@NotNull C8881i c8881i, @NotNull C2630h c2630h, @NotNull C13143a c13143a, @NotNull DiscoverySegmentRepository discoverySegmentRepository, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(c8881i, "sessionNavigateEventFactory");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c13143a, "addDiscoverySessionNavigateEvent");
        C2668g.b(discoverySegmentRepository, "discoverySegmentRepository");
        C2668g.b(c15679f, "scheduler");
        return new C11131k(c8881i, c2630h, c13143a, discoverySegmentRepository, c15679f);
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final OnSegmentChangedListener m35209a(@NotNull C11131k c11131k) {
        C2668g.b(c11131k, "navigationListener");
        return c11131k;
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: b */
    public final OnPageSelectedListener m35212b(@NotNull C11131k c11131k) {
        C2668g.b(c11131k, "navigationListener");
        return c11131k;
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: c */
    public final C7343b m35214c() {
        return new C7343b();
    }

    /* renamed from: a */
    private final C8908a m35198a(@NotNull DiscoverySegment discoverySegment) {
        switch (C8252b.f29465a[discoverySegment.ordinal()]) {
            case 1:
                return (C8908a) new RecsDiscoveryViewAnimator(150, 120);
            case 2:
                return (C8908a) new C13150a(150, 120);
            case 3:
                return (C8908a) new PlacesDiscoveryViewAnimator(150, 120);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @ActivityScope
    @IntoSet
    @MainActivityQualifier
    @NotNull
    @Provides
    /* renamed from: a */
    public final LifecycleObserver m35200a(@NotNull PlacesMainActivityLifecycleObserver placesMainActivityLifecycleObserver) {
        C2668g.b(placesMainActivityLifecycleObserver, "placesMainActivityLifecycleObserver");
        return placesMainActivityLifecycleObserver;
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: d */
    public final ChildViewPreDetachListener m35215d() {
        return new C12375f();
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: e */
    public final DiscoverySegmentNotificationLedger m35216e() {
        return new C11127h();
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C13143a m35203a(@NotNull DiscoverySegmentNotificationLedger discoverySegmentNotificationLedger, @NotNull C2630h c2630h, @NotNull DiscoverySegmentRepository discoverySegmentRepository, @NotNull C13147g c13147g, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(discoverySegmentNotificationLedger, "segmentNotificationLedger");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(discoverySegmentRepository, "discoverySegmentRepository");
        C2668g.b(c13147g, "calculateTogglesAvailableBitwise");
        C2668g.b(c15679f, "scheduler");
        return new C13143a(discoverySegmentNotificationLedger, c2630h, ae.a(new Pair[]{C15811g.a(MainPage.PROFILE, "home"), C15811g.a(DiscoverySegment.PLACES, "places"), C15811g.a(MainPage.DISCOVERY, "discovery"), C15811g.a(DiscoverySegment.RECS, "discovery"), C15811g.a(DiscoverySegment.TOP_PICKS, "toppicks"), C15811g.a(MainPage.MATCHES, "matchlist"), C15811g.a(MainPage.FEED, "feed")}), discoverySegmentRepository, c13147g, c15679f);
    }
}
