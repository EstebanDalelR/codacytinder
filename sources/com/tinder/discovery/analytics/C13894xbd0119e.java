package com.tinder.discovery.analytics;

import com.tinder.discovery.analytics.model.NotificationType;
import com.tinder.discovery.model.DiscoverySegment;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/tinder/discovery/model/DiscoverySegment;", "Lcom/tinder/discovery/analytics/model/NotificationType;", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.MemoryDiscoverySegmentNotificationLedger$clearNotificationsForSegment$1 */
final class C13894xbd0119e extends Lambda implements Function1<Pair<? extends DiscoverySegment, ? extends NotificationType>, Boolean> {
    /* renamed from: a */
    final /* synthetic */ DiscoverySegment f44029a;

    C13894xbd0119e(DiscoverySegment discoverySegment) {
        this.f44029a = discoverySegment;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53445a((Pair) obj));
    }

    /* renamed from: a */
    public final boolean m53445a(@NotNull Pair<? extends DiscoverySegment, ? extends NotificationType> pair) {
        C2668g.b(pair, "it");
        return ((DiscoverySegment) pair.a()) == this.f44029a ? true : null;
    }
}
