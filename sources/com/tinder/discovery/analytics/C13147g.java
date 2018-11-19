package com.tinder.discovery.analytics;

import com.tinder.discovery.model.DiscoverySegment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ae;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0002\u0010\nR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/discovery/analytics/CalculateTogglesAvailableBitwise;", "Lkotlin/Function1;", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "", "()V", "valuesMap", "", "invoke", "discoverySegments", "(Ljava/util/List;)Ljava/lang/Integer;", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.g */
public final class C13147g implements Function1<List<? extends DiscoverySegment>, Integer> {
    /* renamed from: a */
    private final Map<DiscoverySegment, Integer> f41820a = ae.a(new Pair[]{C15811g.a(DiscoverySegment.RECS, Integer.valueOf(1)), C15811g.a(DiscoverySegment.PLACES, Integer.valueOf(2)), C15811g.a(DiscoverySegment.TOP_PICKS, Integer.valueOf(4))});

    public /* synthetic */ Object invoke(Object obj) {
        return m51081a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public Integer m51081a(@NotNull List<? extends DiscoverySegment> list) {
        C2668g.b(list, "discoverySegments");
        Collection arrayList = new ArrayList();
        for (DiscoverySegment discoverySegment : list) {
            Integer num = (Integer) this.f41820a.get(discoverySegment);
            if (num != null) {
                arrayList.add(num);
            }
        }
        Iterable<Number> iterable = (List) arrayList;
        list = Integer.valueOf(null);
        for (Number intValue : iterable) {
            list = Integer.valueOf(((Number) list).intValue() + intValue.intValue());
        }
        return list;
    }
}
