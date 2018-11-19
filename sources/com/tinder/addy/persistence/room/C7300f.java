package com.tinder.addy.persistence.room;

import com.tinder.addy.tracker.TrackingUrl;
import com.tinder.addy.tracker.TrackingUrl.EventType;
import com.tinder.addy.tracker.TrackingUrlRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/addy/persistence/room/TrackingUrlRoomRepository;", "Lcom/tinder/addy/tracker/TrackingUrlRepository;", "dao", "Lcom/tinder/addy/persistence/room/TrackingUrlDao;", "(Lcom/tinder/addy/persistence/room/TrackingUrlDao;)V", "deleteExpiredTrackingUrls", "Lrx/Completable;", "insertTrackingUrls", "trackingUrls", "", "Lcom/tinder/addy/tracker/TrackingUrl;", "loadTrackingUrls", "Lrx/Single;", "adId", "", "eventType", "Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "addy_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.addy.persistence.room.f */
public final class C7300f implements TrackingUrlRepository {
    /* renamed from: a */
    private final TrackingUrlDao f26407a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/addy/persistence/room/RoomTrackingUrl;", "it", "Lcom/tinder/addy/tracker/TrackingUrl;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.persistence.room.f$a */
    static final class C7972a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C7972a f28584a = new C7972a();

        C7972a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m33853a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C6187d> m33853a(List<TrackingUrl> list) {
            C2668g.a(list, "it");
            Iterable<TrackingUrl> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (TrackingUrl trackingUrl : iterable) {
                arrayList.add(new C6187d(trackingUrl.m26830a(), trackingUrl.m26832c(), trackingUrl.m26831b(), trackingUrl.m26833d().token()));
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/addy/persistence/room/RoomTrackingUrl;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.persistence.room.f$b */
    static final class C7973b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C7300f f28585a;

        C7973b(C7300f c7300f) {
            this.f28585a = c7300f;
        }

        public /* synthetic */ Object call(Object obj) {
            m33854a((List) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m33854a(List<C6187d> list) {
            TrackingUrlDao a = this.f28585a.f26407a;
            C2668g.a(list, "it");
            a.insertAll(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/addy/persistence/room/RoomTrackingUrl;", "it", "Lcom/tinder/addy/persistence/room/TrackingUrlDao;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.persistence.room.f$c */
    static final class C7974c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ String f28586a;
        /* renamed from: b */
        final /* synthetic */ EventType f28587b;

        C7974c(String str, EventType eventType) {
            this.f28586a = str;
            this.f28587b = eventType;
        }

        public /* synthetic */ Object call(Object obj) {
            return m33855a((TrackingUrlDao) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C6187d> m33855a(TrackingUrlDao trackingUrlDao) {
            return trackingUrlDao.loadTrackingUrlsByAdAndEvent(this.f28586a, this.f28587b.token());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/addy/persistence/room/RoomTrackingUrl;", "kotlin.jvm.PlatformType", "it", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.persistence.room.f$d */
    static final class C7975d<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        public static final C7975d f28588a = new C7975d();

        C7975d() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m33856a((List) obj);
        }

        /* renamed from: a */
        public final Observable<C6187d> m33856a(List<C6187d> list) {
            return Observable.a(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/addy/tracker/TrackingUrl;", "it", "Lcom/tinder/addy/persistence/room/RoomTrackingUrl;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.persistence.room.f$e */
    static final class C7976e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ String f28589a;
        /* renamed from: b */
        final /* synthetic */ EventType f28590b;

        C7976e(String str, EventType eventType) {
            this.f28589a = str;
            this.f28590b = eventType;
        }

        public /* synthetic */ Object call(Object obj) {
            return m33857a((C6187d) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TrackingUrl m33857a(C6187d c6187d) {
            return new TrackingUrl(this.f28589a, c6187d.m26797c(), c6187d.m26796b(), this.f28590b);
        }
    }

    public C7300f(@NotNull TrackingUrlDao trackingUrlDao) {
        C2668g.b(trackingUrlDao, "dao");
        this.f26407a = trackingUrlDao;
    }

    @NotNull
    public Completable deleteExpiredTrackingUrls() {
        Completable a = Completable.a(new NotImplementedError("not implemented"));
        C2668g.a(a, "Completable.error(NotImp…Error(\"not implemented\"))");
        return a;
    }

    @NotNull
    public Single<List<TrackingUrl>> loadTrackingUrls(@NotNull String str, @NotNull EventType eventType) {
        C2668g.b(str, "adId");
        C2668g.b(eventType, "eventType");
        str = Single.a(this.f26407a).b(Schedulers.io()).d(new C7974c(str, eventType)).b(C7975d.f28588a).k(new C7976e(str, eventType)).v().a();
        C2668g.a(str, "Single.just(dao)\n       …              .toSingle()");
        return str;
    }

    @NotNull
    public Completable insertTrackingUrls(@NotNull List<TrackingUrl> list) {
        C2668g.b(list, "trackingUrls");
        list = Observable.a(list).b(Schedulers.io()).k(C7972a.f28584a).k(new C7973b(this)).b();
        C2668g.a(list, "Observable.just(tracking…         .toCompletable()");
        return list;
    }
}
