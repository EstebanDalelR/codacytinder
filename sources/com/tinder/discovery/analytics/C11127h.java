package com.tinder.discovery.analytics;

import com.tinder.discovery.analytics.model.NotificationType;
import com.tinder.discovery.model.DiscoverySegment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0017J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0017J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\n\u001a\u00020\u0006H\u0017J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u000b\u001a\u00020\u0007H\u0017R \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/discovery/analytics/MemoryDiscoverySegmentNotificationLedger;", "Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;", "()V", "segmentNotifications", "", "Lkotlin/Pair;", "Lcom/tinder/discovery/model/DiscoverySegment;", "Lcom/tinder/discovery/analytics/model/NotificationType;", "addNotificationForSegment", "", "segment", "notificationType", "clearNotificationsForSegment", "getNotificationsForSegment", "", "getSegmentsWithNotification", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.h */
public final class C11127h implements DiscoverySegmentNotificationLedger {
    /* renamed from: a */
    private final List<Pair<DiscoverySegment, NotificationType>> f36005a = new ArrayList();

    public synchronized void addNotificationForSegment(@NotNull DiscoverySegment discoverySegment, @NotNull NotificationType notificationType) {
        C2668g.b(discoverySegment, "segment");
        C2668g.b(notificationType, "notificationType");
        this.f36005a.add(new Pair(discoverySegment, notificationType));
    }

    @NotNull
    public synchronized Set<DiscoverySegment> getSegmentsWithNotification(@NotNull NotificationType notificationType) {
        Collection collection;
        C2668g.b(notificationType, "notificationType");
        Collection arrayList = new ArrayList();
        for (Object next : this.f36005a) {
            if ((((NotificationType) ((Pair) next).b()) == notificationType ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        Iterable<Pair> iterable = (List) arrayList;
        collection = (Collection) new ArrayList(C19301m.a(iterable, 10));
        for (Pair a : iterable) {
            collection.add((DiscoverySegment) a.a());
        }
        return C19301m.n((List) collection);
    }

    @NotNull
    public synchronized List<NotificationType> getNotificationsForSegment(@NotNull DiscoverySegment discoverySegment) {
        Collection collection;
        C2668g.b(discoverySegment, "segment");
        Collection arrayList = new ArrayList();
        for (Object next : this.f36005a) {
            if ((((DiscoverySegment) ((Pair) next).a()) == discoverySegment ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        Iterable<Pair> iterable = (List) arrayList;
        collection = (Collection) new ArrayList(C19301m.a(iterable, 10));
        for (Pair b : iterable) {
            collection.add((NotificationType) b.b());
        }
        return C19301m.l((List) collection);
    }

    public synchronized void clearNotificationsForSegment(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "segment");
        C19301m.a(this.f36005a, new C13894xbd0119e(discoverySegment));
    }
}
