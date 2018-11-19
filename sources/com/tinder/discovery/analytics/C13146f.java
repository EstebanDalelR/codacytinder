package com.tinder.discovery.analytics;

import com.tinder.discovery.analytics.C11125b.C8880a;
import com.tinder.discovery.analytics.model.NotificationType;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.C11141b;
import com.tinder.discovery.p235d.p335a.C11139b;
import com.tinder.discovery.tooltip.DiscoveryTooltipOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/discovery/analytics/AnalyticsDiscoveryTooltipOwnerDecorator;", "Lcom/tinder/discovery/trigger/decorator/DiscoveryDiscoveryTooltipOwnerDecorator;", "tooltipMark", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;", "addSessionNotificationEvent", "Lcom/tinder/discovery/analytics/AddSessionNotificationEvent;", "segmentNotificationLedger", "Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;", "(Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;Lcom/tinder/discovery/analytics/AddSessionNotificationEvent;Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;)V", "showTooltip", "", "trigger", "Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "tooltipText", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.f */
public final class C13146f extends C11139b {
    /* renamed from: a */
    private final C11125b f41818a;
    /* renamed from: b */
    private final DiscoverySegmentNotificationLedger f41819b;

    public C13146f(@NotNull DiscoveryTooltipOwner discoveryTooltipOwner, @NotNull C11125b c11125b, @NotNull DiscoverySegmentNotificationLedger discoverySegmentNotificationLedger) {
        C2668g.b(discoveryTooltipOwner, "tooltipMark");
        C2668g.b(c11125b, "addSessionNotificationEvent");
        C2668g.b(discoverySegmentNotificationLedger, "segmentNotificationLedger");
        super(discoveryTooltipOwner);
        this.f41818a = c11125b;
        this.f41819b = discoverySegmentNotificationLedger;
    }

    public void showTooltip(@NotNull C11141b c11141b, @NotNull DiscoverySegment discoverySegment, @NotNull CharSequence charSequence) {
        C2668g.b(c11141b, "trigger");
        C2668g.b(discoverySegment, "discoverySegment");
        C2668g.b(charSequence, "tooltipText");
        super.showTooltip(c11141b, discoverySegment, charSequence);
        this.f41819b.addNotificationForSegment(discoverySegment, NotificationType.TOOLTIP);
        this.f41818a.m43865a(new C8880a(discoverySegment, NotificationType.TOOLTIP, null));
    }
}
