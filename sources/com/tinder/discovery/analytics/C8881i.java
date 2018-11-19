package com.tinder.discovery.analytics;

import com.tinder.discovery.analytics.model.NavigationAction;
import com.tinder.discovery.analytics.model.NotificationType;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.etl.event.vv;
import com.tinder.etl.event.vw;
import com.tinder.main.model.MainPage;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/discovery/analytics/SessionEventFactory;", "", "calculateTogglesAvailableBitwise", "Lcom/tinder/discovery/analytics/CalculateTogglesAvailableBitwise;", "(Lcom/tinder/discovery/analytics/CalculateTogglesAvailableBitwise;)V", "navigationItemMap", "", "", "createMainPageNavigationEvent", "Lcom/tinder/etl/event/SessionNavigateEvent;", "source", "Lcom/tinder/main/model/MainPage;", "destination", "navigationAction", "Lcom/tinder/discovery/analytics/model/NavigationAction;", "discoverySegments", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "createNotificationEvent", "Lcom/tinder/etl/event/SessionNotificationEvent;", "discoverySegment", "notificationType", "Lcom/tinder/discovery/analytics/model/NotificationType;", "notificationName", "screenName", "item", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.i */
public final class C8881i {
    /* renamed from: a */
    private final Map<Object, String> f31084a = ae.a(new Pair[]{C15811g.a(MainPage.PROFILE, "home"), C15811g.a(DiscoverySegment.PLACES, "places"), C15811g.a(MainPage.DISCOVERY, "discovery"), C15811g.a(DiscoverySegment.RECS, "discovery"), C15811g.a(DiscoverySegment.TOP_PICKS, "toppicks"), C15811g.a(MainPage.MATCHES, "matchlist"), C15811g.a(MainPage.FEED, "feed")});
    /* renamed from: b */
    private final C13147g f31085b;

    @Inject
    public C8881i(@NotNull C13147g c13147g) {
        C2668g.b(c13147g, "calculateTogglesAvailableBitwise");
        this.f31085b = c13147g;
    }

    @NotNull
    /* renamed from: a */
    public final vv m37664a(@NotNull MainPage mainPage, @NotNull MainPage mainPage2, @NotNull NavigationAction navigationAction, @NotNull List<? extends DiscoverySegment> list) {
        C2668g.b(mainPage, "source");
        C2668g.b(mainPage2, "destination");
        C2668g.b(navigationAction, "navigationAction");
        C2668g.b(list, "discoverySegments");
        mainPage = vv.m46636a().m38906b(m37663a(mainPage)).m38902a(m37663a(mainPage2)).m38905b((Number) Integer.valueOf(navigationAction.getValue())).m38901a((Number) this.f31085b.m51081a(list)).m38903a();
        C2668g.a(mainPage, "SessionNavigateEvent.bui…ts))\n            .build()");
        return mainPage;
    }

    @NotNull
    /* renamed from: a */
    public final vw m37665a(@NotNull DiscoverySegment discoverySegment, @NotNull NotificationType notificationType, @Nullable String str) {
        C2668g.b(discoverySegment, "discoverySegment");
        C2668g.b(notificationType, "notificationType");
        discoverySegment = vw.m46653a().m38908a(m37663a(discoverySegment)).m38907a((Number) Integer.valueOf(notificationType.getValue())).m38910b(str).m38909a();
        C2668g.a(discoverySegment, "SessionNotificationEvent…\n                .build()");
        return discoverySegment;
    }

    /* renamed from: a */
    private final String m37663a(Object obj) {
        String str = (String) this.f31084a.get(obj);
        return str != null ? str : "unknown";
    }
}
