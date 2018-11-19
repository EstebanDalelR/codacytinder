package com.tinder.discovery.badge.p334b;

import com.tinder.discovery.badge.Badgeable;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/discovery/badge/listener/BadgingSegmentChangeListener;", "Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "lazyDiscoveryTabView", "Ldagger/Lazy;", "Lcom/tinder/discovery/view/DiscoveryTabView;", "(Ldagger/Lazy;)V", "onSegmentChanged", "", "nextSegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "prevSegment", "onSegmentClicked", "segment", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.badge.b.a */
public final class C11137a implements OnSegmentChangedListener {
    /* renamed from: a */
    private final Lazy<DiscoveryTabView> f36023a;

    public void onSegmentClicked(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "segment");
    }

    public C11137a(@NotNull Lazy<DiscoveryTabView> lazy) {
        C2668g.b(lazy, "lazyDiscoveryTabView");
        this.f36023a = lazy;
    }

    public void onSegmentChanged(@NotNull DiscoverySegment discoverySegment, @Nullable DiscoverySegment discoverySegment2) {
        C2668g.b(discoverySegment, "nextSegment");
        discoverySegment = ((DiscoveryTabView) this.f36023a.get()).m43904a(discoverySegment);
        if ((discoverySegment instanceof Badgeable) != null) {
            ((Badgeable) discoverySegment).hideBadge();
        } else {
            C0001a.d("Trying to hide badge on view that is not Badgeable.", new Object[null]);
        }
    }
}
