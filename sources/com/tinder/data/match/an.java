package com.tinder.data.match;

import android.database.Cursor;
import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.match.ao.C10793a;
import com.tinder.data.model.TrackingUrlModel.C13021b;
import com.tinder.data.model.TrackingUrlModel.C13022d;
import com.tinder.domain.common.TrackingUrl;
import com.tinder.domain.common.TrackingUrl.Event;
import com.tinder.domain.common.TrackingUrl.Event.Companion;
import java.util.Arrays;
import java.util.List;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aJ*\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013J&\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/tinder/data/match/TrackingUrlDataStore;", "", "db", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "insertStatement", "Lcom/tinder/data/model/TrackingUrlModel$Insert_tracking_urls;", "getInsertStatement", "()Lcom/tinder/data/model/TrackingUrlModel$Insert_tracking_urls;", "insertStatement$delegate", "Lkotlin/Lazy;", "updateStatement", "Lcom/tinder/data/model/TrackingUrlModel$Save_ping_time;", "getUpdateStatement", "()Lcom/tinder/data/model/TrackingUrlModel$Save_ping_time;", "updateStatement$delegate", "insert", "Lrx/Completable;", "templateId", "", "trackingUrls", "", "Lcom/tinder/domain/common/TrackingUrl;", "observeActive", "Lrx/Observable;", "event", "Lcom/tinder/domain/common/TrackingUrl$Event;", "observeActiveForLineItemId", "lineItemId", "updatePingTimes", "url", "pingTime", "Lorg/joda/time/DateTime;", "data_release"}, k = 1, mv = {1, 1, 10})
public final class an {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30530a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(an.class), "insertStatement", "getInsertStatement()Lcom/tinder/data/model/TrackingUrlModel$Insert_tracking_urls;")), C15825i.a(new PropertyReference1Impl(C15825i.a(an.class), "updateStatement", "getUpdateStatement()Lcom/tinder/data/model/TrackingUrlModel$Save_ping_time;"))};
    /* renamed from: b */
    private final Lazy f30531b = C18451c.a((Function0) new TrackingUrlDataStore$insertStatement$2(this));
    /* renamed from: c */
    private final Lazy f30532c = C18451c.a((Function0) new TrackingUrlDataStore$updateStatement$2(this));
    /* renamed from: d */
    private final BriteDatabase f30533d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/TrackingUrl;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.an$b */
    static final class C12910b<T, R> implements Func1<Cursor, TrackingUrl> {
        /* renamed from: a */
        public static final C12910b f41387a = new C12910b();

        C12910b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50593a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TrackingUrl m50593a(Cursor cursor) {
            C10793a c10793a = (C10793a) ao.f30535b.m43370a(cursor);
            Companion companion = Event.Companion;
            String event = c10793a.event();
            C2668g.a(event, "map.event()");
            Event fromKey = companion.fromKey(event);
            String url = c10793a.url();
            C2668g.a(url, "map.url()");
            DateTime ping_time = c10793a.ping_time();
            C2668g.a(c10793a, "map");
            return new TrackingUrl(fromKey, c10793a.is_unique(), url, ping_time, c10793a.line_item_id());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/TrackingUrl;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.an$c */
    static final class C12911c<T, R> implements Func1<Cursor, TrackingUrl> {
        /* renamed from: a */
        public static final C12911c f41388a = new C12911c();

        C12911c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50594a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TrackingUrl m50594a(Cursor cursor) {
            C10793a c10793a = (C10793a) ao.f30535b.m43370a(cursor);
            Companion companion = Event.Companion;
            String event = c10793a.event();
            C2668g.a(event, "map.event()");
            Event fromKey = companion.fromKey(event);
            String url = c10793a.url();
            C2668g.a(url, "map.url()");
            DateTime ping_time = c10793a.ping_time();
            C2668g.a(c10793a, "map");
            return new TrackingUrl(fromKey, c10793a.is_unique(), url, ping_time, c10793a.line_item_id());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.an$a */
    static final class C13822a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ an f43848a;
        /* renamed from: b */
        final /* synthetic */ List f43849b;
        /* renamed from: c */
        final /* synthetic */ String f43850c;

        C13822a(an anVar, List list, String str) {
            this.f43848a = anVar;
            this.f43849b = list;
            this.f43850c = str;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void call() {
            /*
            r13 = this;
            r0 = r13.f43848a;
            r0 = r0.f30533d;
            r0 = r0.c();
            r0 = (java.io.Closeable) r0;
            r1 = 0;
            r1 = (java.lang.Throwable) r1;
            r2 = r0;
            r2 = (com.squareup.sqlbrite.BriteDatabase.Transaction) r2;	 Catch:{ Throwable -> 0x006e }
            r3 = r13.f43849b;	 Catch:{ Throwable -> 0x006e }
            r3 = (java.lang.Iterable) r3;	 Catch:{ Throwable -> 0x006e }
            r3 = r3.iterator();	 Catch:{ Throwable -> 0x006e }
        L_0x001a:
            r4 = r3.hasNext();	 Catch:{ Throwable -> 0x006e }
            if (r4 == 0) goto L_0x0063;
        L_0x0020:
            r4 = r3.next();	 Catch:{ Throwable -> 0x006e }
            r4 = (com.tinder.domain.common.TrackingUrl) r4;	 Catch:{ Throwable -> 0x006e }
            r5 = r4.component1();	 Catch:{ Throwable -> 0x006e }
            r10 = r4.component2();	 Catch:{ Throwable -> 0x006e }
            r8 = r4.component3();	 Catch:{ Throwable -> 0x006e }
            r11 = r4.component4();	 Catch:{ Throwable -> 0x006e }
            r12 = r4.component5();	 Catch:{ Throwable -> 0x006e }
            r4 = r13.f43848a;	 Catch:{ Throwable -> 0x006e }
            r6 = r4.m36954a();	 Catch:{ Throwable -> 0x006e }
            r7 = r13.f43850c;	 Catch:{ Throwable -> 0x006e }
            r9 = r5.getKey();	 Catch:{ Throwable -> 0x006e }
            r6.m50773a(r7, r8, r9, r10, r11, r12);	 Catch:{ Throwable -> 0x006e }
            r4 = r13.f43848a;	 Catch:{ Throwable -> 0x006e }
            r4 = r4.f30533d;	 Catch:{ Throwable -> 0x006e }
            r5 = r13.f43848a;	 Catch:{ Throwable -> 0x006e }
            r5 = r5.m36954a();	 Catch:{ Throwable -> 0x006e }
            r5 = r5.a;	 Catch:{ Throwable -> 0x006e }
            r6 = r13.f43848a;	 Catch:{ Throwable -> 0x006e }
            r6 = r6.m36954a();	 Catch:{ Throwable -> 0x006e }
            r6 = r6.b;	 Catch:{ Throwable -> 0x006e }
            r4.b(r5, r6);	 Catch:{ Throwable -> 0x006e }
            goto L_0x001a;
        L_0x0063:
            r2.markSuccessful();	 Catch:{ Throwable -> 0x006e }
            r2 = kotlin.C15813i.f49016a;	 Catch:{ Throwable -> 0x006e }
            kotlin.io.C15818b.a(r0, r1);
            return;
        L_0x006c:
            r2 = move-exception;
            goto L_0x0070;
        L_0x006e:
            r1 = move-exception;
            throw r1;	 Catch:{ all -> 0x006c }
        L_0x0070:
            kotlin.io.C15818b.a(r0, r1);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.match.an.a.call():void");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.an$d */
    static final class C13823d implements Action0 {
        /* renamed from: a */
        final /* synthetic */ an f43851a;
        /* renamed from: b */
        final /* synthetic */ DateTime f43852b;
        /* renamed from: c */
        final /* synthetic */ String f43853c;
        /* renamed from: d */
        final /* synthetic */ Event f43854d;
        /* renamed from: e */
        final /* synthetic */ String f43855e;

        C13823d(an anVar, DateTime dateTime, String str, Event event, String str2) {
            this.f43851a = anVar;
            this.f43852b = dateTime;
            this.f43853c = str;
            this.f43854d = event;
            this.f43855e = str2;
        }

        public final void call() {
            this.f43851a.m36956b().m50774a(this.f43852b, this.f43853c, this.f43854d.getKey(), this.f43855e);
            this.f43851a.f30533d.a(this.f43851a.m36956b().a, this.f43851a.m36956b().b);
        }
    }

    /* renamed from: a */
    private final C13021b m36954a() {
        Lazy lazy = this.f30531b;
        KProperty kProperty = f30530a[0];
        return (C13021b) lazy.getValue();
    }

    /* renamed from: b */
    private final C13022d m36956b() {
        Lazy lazy = this.f30532c;
        KProperty kProperty = f30530a[1];
        return (C13022d) lazy.getValue();
    }

    public an(@NotNull BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "db");
        this.f30533d = briteDatabase;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m36959a(@NotNull String str, @NotNull List<TrackingUrl> list) {
        C2668g.b(str, "templateId");
        C2668g.b(list, "trackingUrls");
        str = Completable.a(new C13822a(this, list, str));
        C2668g.a(str, "Completable.fromAction {…          }\n            }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m36958a(@NotNull String str, @NotNull Event event, @NotNull String str2, @NotNull DateTime dateTime) {
        C2668g.b(str, "templateId");
        C2668g.b(event, "event");
        C2668g.b(str2, "url");
        C2668g.b(dateTime, "pingTime");
        str = Completable.a(new C13823d(this, dateTime, str, event, str2));
        C2668g.a(str, "Completable.fromAction {…tement.program)\n        }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<List<TrackingUrl>> m36960a(@NotNull String str, @NotNull Event event) {
        C2668g.b(str, "templateId");
        C2668g.b(event, "event");
        str = ao.f30534a.m37197a(str, event.getKey());
        event = this.f30533d;
        Iterable iterable = str.f22516c;
        String str2 = str.f22514a;
        str = str.f22515b;
        str = event.a(iterable, str2, (String[]) Arrays.copyOf(str, str.length)).b((Func1) C12910b.f41387a);
        C2668g.a(str, "db.createQuery(statement…      )\n                }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<List<TrackingUrl>> m36961a(@NotNull String str, @NotNull Event event, @NotNull String str2) {
        C2668g.b(str, "templateId");
        C2668g.b(event, "event");
        C2668g.b(str2, "lineItemId");
        str = ao.f30534a.m37198a(str, str2, event.getKey());
        event = this.f30533d;
        Iterable iterable = (Iterable) str.f22516c;
        String str3 = str.f22514a;
        str = str.f22515b;
        str = event.a(iterable, str3, (String[]) Arrays.copyOf(str, str.length)).b((Func1) C12911c.f41388a);
        C2668g.a(str, "db.createQuery(statement…      )\n                }");
        return str;
    }
}
