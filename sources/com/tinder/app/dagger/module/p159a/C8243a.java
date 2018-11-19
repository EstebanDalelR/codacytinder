package com.tinder.app.dagger.module.p159a;

import com.tinder.discovery.analytics.C11125b;
import com.tinder.discovery.analytics.C13145e;
import com.tinder.discovery.analytics.C13146f;
import com.tinder.discovery.analytics.DiscoverySegmentNotificationLedger;
import com.tinder.discovery.p235d.C11140a.C8891a;
import com.tinder.discovery.tooltip.C11145a.C8892a;
import com.tinder.discovery.tooltip.DiscoveryTooltipOwner;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.scope.ActivityScope;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J&\u0010\f\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/app/dagger/module/discovery/DiscoveryTriggerModule;", "", "()V", "provideBadgeOwnerAdapter", "Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;", "lazyDiscoveryTabView", "Ldagger/Lazy;", "Lcom/tinder/discovery/view/DiscoveryTabView;", "addSessionNotificationEvent", "Lcom/tinder/discovery/analytics/AddSessionNotificationEvent;", "segmentNotificationLedger", "Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;", "provideDiscoveryTooltipOwner", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;", "provideDiscoveryTooltipRequestFactory", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest$Factory;", "discoveryTooltipOwner", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.app.dagger.module.a.a */
public final class C8243a {
    @NotNull
    @Provides
    /* renamed from: a */
    public final C8891a m35139a(@NotNull Lazy<DiscoveryTabView> lazy, @NotNull C11125b c11125b, @NotNull DiscoverySegmentNotificationLedger discoverySegmentNotificationLedger) {
        C2668g.b(lazy, "lazyDiscoveryTabView");
        C2668g.b(c11125b, "addSessionNotificationEvent");
        C2668g.b(discoverySegmentNotificationLedger, "segmentNotificationLedger");
        DiscoveryTabView discoveryTabView = (DiscoveryTabView) lazy.get();
        C2668g.a(discoveryTabView, "baseBadgeMark");
        return new C8891a(new C13145e(discoveryTabView, c11125b, discoverySegmentNotificationLedger));
    }

    @ActivityScope
    @NotNull
    @Provides
    /* renamed from: b */
    public final DiscoveryTooltipOwner m35141b(@NotNull Lazy<DiscoveryTabView> lazy, @NotNull C11125b c11125b, @NotNull DiscoverySegmentNotificationLedger discoverySegmentNotificationLedger) {
        C2668g.b(lazy, "lazyDiscoveryTabView");
        C2668g.b(c11125b, "addSessionNotificationEvent");
        C2668g.b(discoverySegmentNotificationLedger, "segmentNotificationLedger");
        DiscoveryTabView discoveryTabView = (DiscoveryTabView) lazy.get();
        C2668g.a(discoveryTabView, "baseTooltippable");
        return new C13146f(discoveryTabView, c11125b, discoverySegmentNotificationLedger);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C8892a m35140a(@NotNull DiscoveryTooltipOwner discoveryTooltipOwner) {
        C2668g.b(discoveryTooltipOwner, "discoveryTooltipOwner");
        return new C8892a(discoveryTooltipOwner);
    }
}
