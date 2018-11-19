package com.tinder.discovery.p235d;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.tooltip.C9835c.C9834a;
import com.tinder.main.trigger.Trigger;
import com.tinder.main.trigger.Trigger.RunStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;", "Lcom/tinder/main/trigger/Trigger;", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "tooltipQueue", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "(Lcom/tinder/discovery/model/DiscoverySegment;Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;)V", "getDiscoverySegment", "()Lcom/tinder/discovery/model/DiscoverySegment;", "enqueueTooltip", "", "tooltipRequest", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue$DisplayRequest;", "getRunStrategy", "Lcom/tinder/main/trigger/Trigger$RunStrategy;", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.d.b */
public abstract class C11141b extends Trigger {
    @NotNull
    /* renamed from: a */
    private final DiscoverySegment f36028a;
    /* renamed from: b */
    private final C9835c f36029b;

    @NotNull
    /* renamed from: c */
    public final DiscoverySegment m43884c() {
        return this.f36028a;
    }

    public C11141b(@NotNull DiscoverySegment discoverySegment, @NotNull C9835c c9835c) {
        C2668g.b(discoverySegment, "discoverySegment");
        C2668g.b(c9835c, "tooltipQueue");
        this.f36028a = discoverySegment;
        this.f36029b = c9835c;
    }

    @NotNull
    /* renamed from: a */
    public RunStrategy mo9999a() {
        return RunStrategy.TRANSIENT;
    }

    /* renamed from: a */
    public final void m43883a(@NotNull C9834a c9834a) {
        C2668g.b(c9834a, "tooltipRequest");
        this.f36029b.m40452a(c9834a);
    }
}
