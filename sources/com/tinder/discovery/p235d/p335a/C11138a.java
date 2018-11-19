package com.tinder.discovery.p235d.p335a;

import android.support.annotation.CallSuper;
import com.tinder.discovery.badge.DiscoveryBadgeOwner;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.main.trigger.Trigger;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/discovery/trigger/decorator/BadgeMarkDecorator;", "Lcom/tinder/discovery/badge/DiscoveryBadgeOwner;", "discoveryBadgeOwner", "(Lcom/tinder/discovery/badge/DiscoveryBadgeOwner;)V", "showBadgeForSegment", "", "trigger", "Lcom/tinder/main/trigger/Trigger;", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "animated", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.d.a.a */
public abstract class C11138a implements DiscoveryBadgeOwner {
    /* renamed from: a */
    private final DiscoveryBadgeOwner f36024a;

    public C11138a(@NotNull DiscoveryBadgeOwner discoveryBadgeOwner) {
        C2668g.b(discoveryBadgeOwner, "discoveryBadgeOwner");
        this.f36024a = discoveryBadgeOwner;
    }

    @CallSuper
    public void showBadgeForSegment(@NotNull Trigger trigger, @NotNull DiscoverySegment discoverySegment, boolean z) {
        C2668g.b(trigger, "trigger");
        C2668g.b(discoverySegment, "discoverySegment");
        this.f36024a.showBadgeForSegment(trigger, discoverySegment, z);
    }
}
