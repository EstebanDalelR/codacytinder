package com.tinder.discovery.analytics;

import com.tinder.discovery.analytics.C11125b.C8880a;
import com.tinder.discovery.analytics.model.NotificationType;
import com.tinder.discovery.badge.DiscoveryBadgeOwner;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.p335a.C11138a;
import com.tinder.main.trigger.Trigger;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/discovery/analytics/AnalyticsBadgeMarkDecorator;", "Lcom/tinder/discovery/trigger/decorator/BadgeMarkDecorator;", "discoveryBadgeOwner", "Lcom/tinder/discovery/badge/DiscoveryBadgeOwner;", "addSessionNotificationEvent", "Lcom/tinder/discovery/analytics/AddSessionNotificationEvent;", "notificationLedger", "Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;", "(Lcom/tinder/discovery/badge/DiscoveryBadgeOwner;Lcom/tinder/discovery/analytics/AddSessionNotificationEvent;Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;)V", "showBadgeForSegment", "", "trigger", "Lcom/tinder/main/trigger/Trigger;", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "animated", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.e */
public final class C13145e extends C11138a {
    /* renamed from: a */
    private final C11125b f41816a;
    /* renamed from: b */
    private final DiscoverySegmentNotificationLedger f41817b;

    public C13145e(@NotNull DiscoveryBadgeOwner discoveryBadgeOwner, @NotNull C11125b c11125b, @NotNull DiscoverySegmentNotificationLedger discoverySegmentNotificationLedger) {
        C2668g.b(discoveryBadgeOwner, "discoveryBadgeOwner");
        C2668g.b(c11125b, "addSessionNotificationEvent");
        C2668g.b(discoverySegmentNotificationLedger, "notificationLedger");
        super(discoveryBadgeOwner);
        this.f41816a = c11125b;
        this.f41817b = discoverySegmentNotificationLedger;
    }

    public void showBadgeForSegment(@NotNull Trigger trigger, @NotNull DiscoverySegment discoverySegment, boolean z) {
        C2668g.b(trigger, "trigger");
        C2668g.b(discoverySegment, "discoverySegment");
        super.showBadgeForSegment(trigger, discoverySegment, z);
        this.f41817b.addNotificationForSegment(discoverySegment, NotificationType.BADGE);
        this.f41816a.m43865a(new C8880a(discoverySegment, NotificationType.BADGE, null));
    }
}
