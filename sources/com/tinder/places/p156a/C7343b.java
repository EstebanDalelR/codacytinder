package com.tinder.places.p156a;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.view.DiscoveryTabView.Adapter.OnSegmentsUpdatedListener;
import io.reactivex.C3957b;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00050\u0005 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0007J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/places/badge/PlacesDiscoverySegmentAvailableProvider;", "Lcom/tinder/discovery/view/DiscoveryTabView$Adapter$OnSegmentsUpdatedListener;", "()V", "processor", "Lio/reactivex/processors/FlowableProcessor;", "", "observeSegmentAvailable", "Lio/reactivex/Flowable;", "kotlin.jvm.PlatformType", "onSegmentsUpdated", "", "newDiscoverySegments", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.a.b */
public final class C7343b implements OnSegmentsUpdatedListener {
    /* renamed from: a */
    private final C18430a<Boolean> f26510a;

    public C7343b() {
        C18430a u = BehaviorProcessor.d(Boolean.valueOf(false)).u();
        C2668g.a(u, "BehaviorProcessor.create…an>(false).toSerialized()");
        this.f26510a = u;
    }

    public void onSegmentsUpdated(@NotNull List<? extends DiscoverySegment> list) {
        C2668g.b(list, "newDiscoverySegments");
        this.f26510a.onNext(Boolean.valueOf(list.contains(DiscoverySegment.PLACES)));
    }

    /* renamed from: a */
    public final C3957b<Boolean> m31323a() {
        return this.f26510a.g();
    }
}
