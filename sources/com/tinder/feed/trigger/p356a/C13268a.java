package com.tinder.feed.trigger.p356a;

import com.tinder.discovery.analytics.C11125b;
import com.tinder.discovery.analytics.C11125b.C8880a;
import com.tinder.discovery.analytics.model.NotificationType;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.feed.trigger.C13269a;
import com.tinder.main.model.MainPage;
import com.tinder.main.tooltip.C12013b;
import com.tinder.main.tooltip.MainTabTooltipOwner;
import com.tinder.main.trigger.p348a.C12017a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/feed/trigger/decorator/AnalyticsMainTabTooltipOwnerDecorator;", "Lcom/tinder/main/trigger/decorator/MainTabTooltipOwnerDecorator;", "tooltipOwner", "Lcom/tinder/main/tooltip/MainTabTooltipOwner;", "addSessionNotificationEvent", "Lcom/tinder/discovery/analytics/AddSessionNotificationEvent;", "(Lcom/tinder/main/tooltip/MainTabTooltipOwner;Lcom/tinder/discovery/analytics/AddSessionNotificationEvent;)V", "showTooltip", "", "trigger", "Lcom/tinder/main/tooltip/MainTabTooltipTrigger;", "mainPage", "Lcom/tinder/main/model/MainPage;", "tooltipText", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.trigger.a.a */
public final class C13268a extends C12017a {
    /* renamed from: a */
    private final C11125b f42025a;

    public C13268a(@NotNull MainTabTooltipOwner mainTabTooltipOwner, @NotNull C11125b c11125b) {
        C2668g.b(mainTabTooltipOwner, "tooltipOwner");
        C2668g.b(c11125b, "addSessionNotificationEvent");
        super(mainTabTooltipOwner);
        this.f42025a = c11125b;
    }

    public void showTooltip(@NotNull C12013b c12013b, @NotNull MainPage mainPage, @NotNull CharSequence charSequence) {
        C2668g.b(c12013b, "trigger");
        C2668g.b(mainPage, "mainPage");
        C2668g.b(charSequence, "tooltipText");
        super.showTooltip(c12013b, mainPage, charSequence);
        if ((c12013b instanceof C13269a) != null) {
            this.f42025a.m43865a(new C8880a(DiscoverySegment.RECS, NotificationType.TOOLTIP, "ReactivatedUserTooltip"));
        }
    }
}
