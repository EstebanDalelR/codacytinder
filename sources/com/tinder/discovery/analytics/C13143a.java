package com.tinder.discovery.analytics;

import android.annotation.SuppressLint;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.discovery.analytics.model.NavigationAction;
import com.tinder.discovery.analytics.model.NotificationType;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.etl.event.vv;
import io.reactivex.C15679f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Map;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\nH\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/discovery/analytics/AddDiscoverySessionNavigateEvent;", "Lkotlin/Function1;", "Lcom/tinder/discovery/analytics/AddDiscoverySessionNavigateEvent$Request;", "", "segmentNotificationLedger", "Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "navigationItemMap", "", "", "", "discoverySegmentRepository", "Lcom/tinder/discovery/domain/DiscoverySegmentRepository;", "calculateTogglesAvailableBitwise", "Lcom/tinder/discovery/analytics/CalculateTogglesAvailableBitwise;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;Lcom/tinder/analytics/fireworks/Fireworks;Ljava/util/Map;Lcom/tinder/discovery/domain/DiscoverySegmentRepository;Lcom/tinder/discovery/analytics/CalculateTogglesAvailableBitwise;Lio/reactivex/Scheduler;)V", "invoke", "request", "screenName", "item", "Request", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.a */
public final class C13143a implements Function1<C8879a, C15813i> {
    /* renamed from: a */
    private final DiscoverySegmentNotificationLedger f41807a;
    /* renamed from: b */
    private final C2630h f41808b;
    /* renamed from: c */
    private final Map<Object, String> f41809c;
    /* renamed from: d */
    private final DiscoverySegmentRepository f41810d;
    /* renamed from: e */
    private final C13147g f41811e;
    /* renamed from: f */
    private final C15679f f41812f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/tinder/discovery/analytics/AddDiscoverySessionNavigateEvent$Request;", "", "source", "Lcom/tinder/discovery/model/DiscoverySegment;", "destination", "navigationAction", "Lcom/tinder/discovery/analytics/model/NavigationAction;", "(Lcom/tinder/discovery/model/DiscoverySegment;Lcom/tinder/discovery/model/DiscoverySegment;Lcom/tinder/discovery/analytics/model/NavigationAction;)V", "getDestination", "()Lcom/tinder/discovery/model/DiscoverySegment;", "getNavigationAction", "()Lcom/tinder/discovery/analytics/model/NavigationAction;", "getSource", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.a$a */
    public static final class C8879a {
        @NotNull
        /* renamed from: a */
        private final DiscoverySegment f31078a;
        @NotNull
        /* renamed from: b */
        private final DiscoverySegment f31079b;
        @NotNull
        /* renamed from: c */
        private final NavigationAction f31080c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8879a) {
                    C8879a c8879a = (C8879a) obj;
                    if (C2668g.a(this.f31078a, c8879a.f31078a) && C2668g.a(this.f31079b, c8879a.f31079b) && C2668g.a(this.f31080c, c8879a.f31080c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            DiscoverySegment discoverySegment = this.f31078a;
            int i = 0;
            int hashCode = (discoverySegment != null ? discoverySegment.hashCode() : 0) * 31;
            DiscoverySegment discoverySegment2 = this.f31079b;
            hashCode = (hashCode + (discoverySegment2 != null ? discoverySegment2.hashCode() : 0)) * 31;
            NavigationAction navigationAction = this.f31080c;
            if (navigationAction != null) {
                i = navigationAction.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(source=");
            stringBuilder.append(this.f31078a);
            stringBuilder.append(", destination=");
            stringBuilder.append(this.f31079b);
            stringBuilder.append(", navigationAction=");
            stringBuilder.append(this.f31080c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8879a(@NotNull DiscoverySegment discoverySegment, @NotNull DiscoverySegment discoverySegment2, @NotNull NavigationAction navigationAction) {
            C2668g.b(discoverySegment, "source");
            C2668g.b(discoverySegment2, "destination");
            C2668g.b(navigationAction, "navigationAction");
            this.f31078a = discoverySegment;
            this.f31079b = discoverySegment2;
            this.f31080c = navigationAction;
        }

        @NotNull
        /* renamed from: a */
        public final DiscoverySegment m37657a() {
            return this.f31078a;
        }

        @NotNull
        /* renamed from: b */
        public final DiscoverySegment m37658b() {
            return this.f31079b;
        }

        @NotNull
        /* renamed from: c */
        public final NavigationAction m37659c() {
            return this.f31080c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/SessionNavigateEvent;", "kotlin.jvm.PlatformType", "it", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.a$b */
    static final class C11120b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C13143a f35994a;
        /* renamed from: b */
        final /* synthetic */ C8879a f35995b;

        C11120b(C13143a c13143a, C8879a c8879a) {
            this.f35994a = c13143a;
            this.f35995b = c8879a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43860a((List) obj);
        }

        /* renamed from: a */
        public final vv m43860a(@NotNull List<? extends DiscoverySegment> list) {
            C2668g.b(list, "it");
            List notificationsForSegment = this.f35994a.f41807a.getNotificationsForSegment(this.f35995b.m37658b());
            return vv.m46636a().m38906b(this.f35994a.m51074a((Object) this.f35995b.m37657a())).m38902a(this.f35994a.m51074a((Object) this.f35995b.m37658b())).m38905b((Number) Integer.valueOf(this.f35995b.m37659c().getValue())).m38904b(Boolean.valueOf(notificationsForSegment.contains(NotificationType.BADGE))).m38900a(Boolean.valueOf(notificationsForSegment.contains(NotificationType.TOOLTIP))).m38901a((Number) this.f35994a.f41811e.m51081a(list)).m38903a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/SessionNavigateEvent;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.a$c */
    static final class C11121c<T> implements Consumer<vv> {
        /* renamed from: a */
        final /* synthetic */ C13143a f35996a;

        C11121c(C13143a c13143a) {
            this.f35996a = c13143a;
        }

        public /* synthetic */ void accept(Object obj) {
            m43861a((vv) obj);
        }

        /* renamed from: a */
        public final void m43861a(vv vvVar) {
            this.f35996a.f41808b.a(vvVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.a$d */
    static final class C11122d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11122d f35997a = new C11122d();

        C11122d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m43862a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43862a(Throwable th) {
            C0001a.c(th, "Failed to AddDiscoverySessionNavigateEvent", new Object[0]);
        }
    }

    public C13143a(@NotNull DiscoverySegmentNotificationLedger discoverySegmentNotificationLedger, @NotNull C2630h c2630h, @NotNull Map<Object, String> map, @NotNull DiscoverySegmentRepository discoverySegmentRepository, @NotNull C13147g c13147g, @NotNull C15679f c15679f) {
        C2668g.b(discoverySegmentNotificationLedger, "segmentNotificationLedger");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(map, "navigationItemMap");
        C2668g.b(discoverySegmentRepository, "discoverySegmentRepository");
        C2668g.b(c13147g, "calculateTogglesAvailableBitwise");
        C2668g.b(c15679f, "scheduler");
        this.f41807a = discoverySegmentNotificationLedger;
        this.f41808b = c2630h;
        this.f41809c = map;
        this.f41810d = discoverySegmentRepository;
        this.f41811e = c13147g;
        this.f41812f = c15679f;
    }

    public /* synthetic */ Object invoke(Object obj) {
        m51077a((C8879a) obj);
        return C15813i.f49016a;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public void m51077a(@NotNull C8879a c8879a) {
        C2668g.b(c8879a, "request");
        this.f41810d.observeDiscoverySegments().b(this.f41812f).f().e(new C11120b(this, c8879a)).a(new C11121c(this), C11122d.f35997a);
    }

    /* renamed from: a */
    private final String m51074a(Object obj) {
        String str = (String) this.f41809c.get(obj);
        return str != null ? str : "unknown";
    }
}
