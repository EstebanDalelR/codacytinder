package com.tinder.addy.persistence.room;

import com.tinder.addy.ping.C6188a;
import com.tinder.addy.ping.PingRepository;
import com.tinder.addy.tracker.TrackingUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/addy/persistence/room/PingRoomRepository;", "Lcom/tinder/addy/ping/PingRepository;", "dao", "Lcom/tinder/addy/persistence/room/PingDao;", "(Lcom/tinder/addy/persistence/room/PingDao;)V", "createPing", "Lrx/Completable;", "trackingUrl", "Lcom/tinder/addy/tracker/TrackingUrl;", "pingTimeMs", "", "loadLastPingForTrackingUrls", "Lrx/Single;", "", "Lcom/tinder/addy/ping/Ping;", "trackingUrls", "loadPingsForTrackingUrl", "addy_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.addy.persistence.room.b */
public final class C7298b implements PingRepository {
    /* renamed from: a */
    private final PingDao f26404a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.persistence.room.b$a */
    static final class C6184a<V> implements Callable<Object> {
        /* renamed from: a */
        final /* synthetic */ C7298b f22728a;
        /* renamed from: b */
        final /* synthetic */ TrackingUrl f22729b;
        /* renamed from: c */
        final /* synthetic */ long f22730c;

        C6184a(C7298b c7298b, TrackingUrl trackingUrl, long j) {
            this.f22728a = c7298b;
            this.f22729b = trackingUrl;
            this.f22730c = j;
        }

        public /* synthetic */ Object call() {
            m26789a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m26789a() {
            this.f22728a.f26404a.insert(new C6186c(this.f22729b.m26830a(), this.f22729b.m26832c(), this.f22730c, null, 8, null));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/tinder/addy/ping/Ping;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.persistence.room.b$b */
    static final class C6185b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C7298b f22731a;
        /* renamed from: b */
        final /* synthetic */ List f22732b;

        C6185b(C7298b c7298b, List list) {
            this.f22731a = c7298b;
            this.f22732b = list;
        }

        public /* synthetic */ Object call() {
            return m26790a();
        }

        @NotNull
        /* renamed from: a */
        public final List<C6188a> m26790a() {
            Iterable<TrackingUrl> iterable = this.f22732b;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (TrackingUrl a : iterable) {
                arrayList.add(a.m26830a());
            }
            Object[] toArray = ((List) arrayList).toArray(new String[0]);
            if (toArray == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) toArray;
            Iterable<TrackingUrl> iterable2 = this.f22732b;
            Collection arrayList2 = new ArrayList(C19301m.a(iterable2, 10));
            for (TrackingUrl c : iterable2) {
                arrayList2.add(c.m26832c());
            }
            Object[] toArray2 = ((List) arrayList2).toArray(new String[0]);
            if (toArray2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Iterable<C6186c> loadLastPingForTrackingUrls = this.f22731a.f26404a.loadLastPingForTrackingUrls(strArr, (String[]) toArray2);
            arrayList = new ArrayList(C19301m.a(loadLastPingForTrackingUrls, 10));
            for (C6186c c6186c : loadLastPingForTrackingUrls) {
                arrayList.add(new C6188a(c6186c.m26792b(), c6186c.m26793c()));
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/addy/ping/Ping;", "it", "Lcom/tinder/addy/persistence/room/RoomPing;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.persistence.room.b$c */
    static final class C7970c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C7970c f28582a = new C7970c();

        C7970c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m33849a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C6188a> m33849a(List<C6186c> list) {
            C2668g.a(list, "it");
            Iterable<C6186c> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (C6186c c6186c : iterable) {
                arrayList.add(new C6188a(c6186c.m26792b(), c6186c.m26793c()));
            }
            return (List) arrayList;
        }
    }

    public C7298b(@NotNull PingDao pingDao) {
        C2668g.b(pingDao, "dao");
        this.f26404a = pingDao;
    }

    @NotNull
    public Completable createPing(@NotNull TrackingUrl trackingUrl, long j) {
        C2668g.b(trackingUrl, "trackingUrl");
        trackingUrl = Completable.a(new C6184a(this, trackingUrl, j));
        C2668g.a(trackingUrl, "Completable.fromCallable…l, pingTimeMs))\n        }");
        return trackingUrl;
    }

    @NotNull
    public Single<List<C6188a>> loadPingsForTrackingUrl(@NotNull TrackingUrl trackingUrl) {
        C2668g.b(trackingUrl, "trackingUrl");
        trackingUrl = Single.a(this.f26404a.loadPingsForTrackingUrl(trackingUrl.m26830a(), trackingUrl.m26832c())).d(C7970c.f28582a);
        C2668g.a(trackingUrl, "Single.just(dao.loadPing…meMs) }\n                }");
        return trackingUrl;
    }

    @NotNull
    public Single<List<C6188a>> loadLastPingForTrackingUrls(@NotNull List<TrackingUrl> list) {
        C2668g.b(list, "trackingUrls");
        list = Single.a(new C6185b(this, list));
        C2668g.a(list, "Single.fromCallable {\n  …ngTimeMs) }\n            }");
        return list;
    }
}
