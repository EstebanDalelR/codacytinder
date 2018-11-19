package com.tinder.discovery.p235d;

import com.tinder.discovery.badge.DiscoveryBadgeOwner;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.main.trigger.Trigger;
import com.tinder.main.trigger.Trigger.RunStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger;", "Lcom/tinder/main/trigger/Trigger;", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "badgeOwnerAdapter", "Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;", "(Lcom/tinder/discovery/model/DiscoverySegment;Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;)V", "getRunStrategy", "Lcom/tinder/main/trigger/Trigger$RunStrategy;", "onCompleted", "", "showBadge", "animated", "", "BadgeOwnerAdapter", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.d.a */
public abstract class C11140a extends Trigger {
    /* renamed from: a */
    private final DiscoverySegment f36026a;
    /* renamed from: b */
    private final C8891a f36027b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;", "", "discoveryBadgeOwner", "Lcom/tinder/discovery/badge/DiscoveryBadgeOwner;", "(Lcom/tinder/discovery/badge/DiscoveryBadgeOwner;)V", "getBadgeOwner", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.d.a$a */
    public static final class C8891a {
        /* renamed from: a */
        private final DiscoveryBadgeOwner f31123a;

        public C8891a(@NotNull DiscoveryBadgeOwner discoveryBadgeOwner) {
            C2668g.b(discoveryBadgeOwner, "discoveryBadgeOwner");
            this.f31123a = discoveryBadgeOwner;
        }

        @NotNull
        /* renamed from: a */
        public final DiscoveryBadgeOwner m37695a() {
            return this.f31123a;
        }
    }

    /* renamed from: b */
    public void mo10000b() {
    }

    public C11140a(@NotNull DiscoverySegment discoverySegment, @NotNull C8891a c8891a) {
        C2668g.b(discoverySegment, "discoverySegment");
        C2668g.b(c8891a, "badgeOwnerAdapter");
        this.f36026a = discoverySegment;
        this.f36027b = c8891a;
    }

    @NotNull
    /* renamed from: a */
    public RunStrategy mo9999a() {
        return RunStrategy.STICKY;
    }

    /* renamed from: a */
    public final void m43880a(boolean z) {
        this.f36027b.m37695a().showBadgeForSegment(this, this.f36026a, z);
    }
}
