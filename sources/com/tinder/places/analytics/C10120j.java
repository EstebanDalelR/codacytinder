package com.tinder.places.analytics;

import com.foursquare.pilgrim.RegionType;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.qe;
import com.tinder.etl.event.qf;
import com.tinder.etl.event.qg;
import com.tinder.etl.event.qh;
import com.tinder.places.tracker.PilgrimLocationTracker.PlaceSource;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JH\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\u0014J:\u0010\u0015\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002JR\u0010\u001a\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesVisitEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "add", "", "visitId", "", "foursquareId", "arrivalTime", "", "departureTime", "regionType", "Lcom/foursquare/pilgrim/RegionType;", "parentFoursquareIds", "", "source", "Lcom/tinder/places/tracker/PilgrimLocationTracker$PlaceSource;", "getHomeOrWorkEvent", "Lcom/tinder/etl/event/EtlEvent;", "isBackfill", "", "isDeparture", "getVenueEvent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.analytics.j */
public final class C10120j {
    @NotNull
    /* renamed from: a */
    private final C2630h f33089a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.j$a */
    static final class C12293a implements Action {
        /* renamed from: a */
        final /* synthetic */ C10120j f39810a;
        /* renamed from: b */
        final /* synthetic */ PlaceSource f39811b;
        /* renamed from: c */
        final /* synthetic */ long f39812c;
        /* renamed from: d */
        final /* synthetic */ RegionType f39813d;
        /* renamed from: e */
        final /* synthetic */ String f39814e;
        /* renamed from: f */
        final /* synthetic */ long f39815f;
        /* renamed from: g */
        final /* synthetic */ String f39816g;
        /* renamed from: h */
        final /* synthetic */ List f39817h;

        C12293a(C10120j c10120j, PlaceSource placeSource, long j, RegionType regionType, String str, long j2, String str2, List list) {
            this.f39810a = c10120j;
            this.f39811b = placeSource;
            this.f39812c = j;
            this.f39813d = regionType;
            this.f39814e = str;
            this.f39815f = j2;
            this.f39816g = str2;
            this.f39817h = list;
        }

        public final void run() {
            EtlEvent a;
            boolean z = this.f39811b == PlaceSource.BACKFILL;
            boolean z2 = this.f39812c > 0;
            if (this.f39813d.isHomeOrWork()) {
                a = this.f39810a.m41361a(this.f39814e, this.f39815f, this.f39812c, this.f39813d, z, z2);
            } else {
                a = this.f39810a.m41362a(this.f39814e, this.f39816g, this.f39815f, this.f39812c, this.f39813d, this.f39817h, z, z2);
            }
            this.f39810a.m41363a().a(a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.j$b */
    static final class C12294b implements Action {
        /* renamed from: a */
        public static final C12294b f39818a = new C12294b();

        C12294b() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.j$c */
    static final class C12295c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12295c f39819a = new C12295c();

        C12295c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48565a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48565a(Throwable th) {
            C0001a.c(th, "AddPlacesVisitEvent failed", new Object[0]);
        }
    }

    @Inject
    public C10120j(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33089a = c2630h;
    }

    @NotNull
    /* renamed from: a */
    public final C2630h m41363a() {
        return this.f33089a;
    }

    /* renamed from: a */
    public final void m41364a(@Nullable String str, @Nullable String str2, long j, long j2, @NotNull RegionType regionType, @NotNull List<String> list, @NotNull PlaceSource placeSource) {
        RegionType regionType2 = regionType;
        C2668g.b(regionType2, "regionType");
        List<String> list2 = list;
        C2668g.b(list2, "parentFoursquareIds");
        PlaceSource placeSource2 = placeSource;
        C2668g.b(placeSource2, "source");
        C3956a.a(new C12293a(this, placeSource2, j2, regionType2, str, j, str2, list2)).a(C12294b.f39818a, C12295c.f39819a);
    }

    /* renamed from: a */
    private final EtlEvent m41361a(String str, long j, long j2, RegionType regionType, boolean z, boolean z2) {
        if (z2) {
            str = qh.m45870a().m38599a((Number) Long.valueOf(j)).m38602b((Number) Long.valueOf(j2)).m38598a(Boolean.valueOf(z)).m38600a(regionType.toString()).m38603b(str).m38601a();
            C2668g.a(str, "PlacesClientDepartureWor…\n                .build()");
            return (EtlEvent) str;
        }
        str = qf.m45842a().m38586a((Number) Long.valueOf(j)).m38585a(Boolean.valueOf(z)).m38587a(regionType.toString()).m38589b(str).m38588a();
        C2668g.a(str, "PlacesClientArrivalWorkH…\n                .build()");
        return (EtlEvent) str;
    }

    /* renamed from: a */
    private final EtlEvent m41362a(String str, String str2, long j, long j2, RegionType regionType, List<String> list, boolean z, boolean z2) {
        if (z2) {
            str = qg.m45853a().m38591a((Number) Long.valueOf(j)).m38595b((Number) Long.valueOf(j2)).m38592a(str2).m38590a(Boolean.valueOf(z)).m38596b(regionType.toString()).m38597c(str).m38593a((List) list).m38594a();
            C2668g.a(str, "PlacesClientDepartureEve…\n                .build()");
            return (EtlEvent) str;
        }
        str = qe.m45827a().m38579a((Number) Long.valueOf(j)).m38580a(str2).m38578a(Boolean.valueOf(z)).m38583b(regionType.toString()).m38584c(str).m38581a((List) list).m38582a();
        C2668g.a(str, "PlacesClientArrivalEvent…\n                .build()");
        return (EtlEvent) str;
    }
}
