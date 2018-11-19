package com.tinder.discovery.observer;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p231a.C11119a;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class DiscoverySegmentsChangeObserver$a<T> implements Consumer<List<? extends DiscoverySegment>> {
    /* renamed from: a */
    final /* synthetic */ DiscoverySegmentsChangeObserver f36034a;

    DiscoverySegmentsChangeObserver$a(DiscoverySegmentsChangeObserver discoverySegmentsChangeObserver) {
        this.f36034a = discoverySegmentsChangeObserver;
    }

    public /* synthetic */ void accept(Object obj) {
        m43888a((List) obj);
    }

    /* renamed from: a */
    public final void m43888a(List<? extends DiscoverySegment> list) {
        C11119a a = DiscoverySegmentsChangeObserver.a(this.f36034a);
        C2668g.a(list, "it");
        a.mo11178a(list);
        DiscoverySegmentsChangeObserver.b(this.f36034a).m51068a((List) list);
    }
}
