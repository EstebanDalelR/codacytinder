package com.tinder.data.toppicks.store;

import android.database.Cursor;
import com.google.android.exoplayer2.Format;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.BriteDatabase.Transaction;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.as;
import com.tinder.data.database.DBv2;
import com.tinder.data.model.TopPickTeaserModel;
import com.tinder.data.model.TopPickTeaserModel.C13019a;
import com.tinder.data.model.TopPickTeaserModel.C13020c;
import com.tinder.data.model.TopPickTeaserModel.C8715b;
import com.tinder.data.model.TopPickTeaserModel.Creator;
import com.tinder.domain.recs.model.Tag;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.io.C15818b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002#$B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0 0\u001fJ\u0014\u0010!\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/tinder/data/toppicks/store/TopPicksTeasersLocalDataStore;", "", "db", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "deleteStatement", "Lcom/tinder/data/model/TopPickTeaserModel$Delete_expired_top_pick_teasers;", "getDeleteStatement", "()Lcom/tinder/data/model/TopPickTeaserModel$Delete_expired_top_pick_teasers;", "deleteStatement$delegate", "Lkotlin/Lazy;", "insertStatement", "Lcom/tinder/data/model/TopPickTeaserModel$Insert_top_pick_teaser;", "getInsertStatement", "()Lcom/tinder/data/model/TopPickTeaserModel$Insert_top_pick_teaser;", "insertStatement$delegate", "topPickTeaserModelFactory", "Lcom/tinder/data/model/TopPickTeaserModel$Factory;", "Lcom/tinder/data/model/TopPickTeaserModel;", "topPickTeaserModelMapper", "Lcom/squareup/sqldelight/RowMapper;", "getTopPickTeaserModelMapper", "()Lcom/squareup/sqldelight/RowMapper;", "topPickTeaserModelMapper$delegate", "clearAllTeaserRecs", "Lio/reactivex/Completable;", "clearExpiredTeaserRecs", "mapToDbModel", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "topPickTeaserModel", "observeTopPicksTeasers", "Lrx/Observable;", "", "saveTeaserRecs", "teaserRecs", "DateTimeColumnAdapter", "TopPickTeaserCreator", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.store.c */
public final class C8799c {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30875a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C8799c.class), "topPickTeaserModelMapper", "getTopPickTeaserModelMapper()Lcom/squareup/sqldelight/RowMapper;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C8799c.class), "deleteStatement", "getDeleteStatement()Lcom/tinder/data/model/TopPickTeaserModel$Delete_expired_top_pick_teasers;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C8799c.class), "insertStatement", "getInsertStatement()Lcom/tinder/data/model/TopPickTeaserModel$Insert_top_pick_teaser;"))};
    /* renamed from: b */
    private final C8715b<TopPickTeaserModel> f30876b = new C8715b(C11031b.f35789a, C11029a.f35784a, as.f35130a);
    /* renamed from: c */
    private final Lazy f30877c = C18451c.a((Function0) new TopPicksTeasersLocalDataStore$topPickTeaserModelMapper$2(this));
    /* renamed from: d */
    private final Lazy f30878d = C18451c.a((Function0) new TopPicksTeasersLocalDataStore$deleteStatement$2(this));
    /* renamed from: e */
    private final Lazy f30879e = C18451c.a((Function0) new TopPicksTeasersLocalDataStore$insertStatement$2(this));
    /* renamed from: f */
    private final BriteDatabase f30880f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/data/toppicks/store/TopPicksTeasersLocalDataStore$DateTimeColumnAdapter;", "Lcom/squareup/sqldelight/ColumnAdapter;", "Lorg/joda/time/DateTime;", "", "()V", "decode", "databaseValue", "(Ljava/lang/Long;)Lorg/joda/time/DateTime;", "encode", "value", "(Lorg/joda/time/DateTime;)Ljava/lang/Long;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.store.c$a */
    public static final class C11029a implements ColumnAdapter<DateTime, Long> {
        /* renamed from: a */
        public static final C11029a f35784a = new C11029a();

        private C11029a() {
        }

        public /* synthetic */ Object decode(Object obj) {
            return m43703a((Long) obj);
        }

        public /* synthetic */ Object encode(Object obj) {
            return m43702a((DateTime) obj);
        }

        @NotNull
        /* renamed from: a */
        public DateTime m43703a(@Nullable Long l) {
            return new DateTime(l);
        }

        @NotNull
        /* renamed from: a */
        public Long m43702a(@NotNull DateTime dateTime) {
            C2668g.b(dateTime, "value");
            return Long.valueOf(dateTime.getMillis());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/tinder/data/toppicks/store/TopPicksTeasersLocalDataStore$TopPickTeaserCreator;", "Lcom/tinder/data/model/TopPickTeaserModel$Creator;", "Lcom/tinder/data/model/TopPickTeaserModel;", "()V", "create", "id", "", "expiration_time", "Lorg/joda/time/DateTime;", "photo_url", "tags", "", "Lcom/tinder/domain/recs/model/Tag;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.store.c$b */
    public static final class C11031b implements Creator<TopPickTeaserModel> {
        /* renamed from: a */
        public static final C11031b f35789a = new C11031b();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, d2 = {"com/tinder/data/toppicks/store/TopPicksTeasersLocalDataStore$TopPickTeaserCreator$create$1", "Lcom/tinder/data/model/TopPickTeaserModel;", "(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;)V", "expiration_time", "Lorg/joda/time/DateTime;", "id", "", "photo_url", "tags", "", "Lcom/tinder/domain/recs/model/Tag;", "data_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.toppicks.store.c$b$a */
        public static final class C11030a implements TopPickTeaserModel {
            /* renamed from: a */
            final /* synthetic */ String f35785a;
            /* renamed from: b */
            final /* synthetic */ DateTime f35786b;
            /* renamed from: c */
            final /* synthetic */ String f35787c;
            /* renamed from: d */
            final /* synthetic */ List f35788d;

            C11030a(String str, DateTime dateTime, String str2, List list) {
                this.f35785a = str;
                this.f35786b = dateTime;
                this.f35787c = str2;
                this.f35788d = list;
            }

            @NotNull
            public String id() {
                return this.f35785a;
            }

            @NotNull
            public DateTime expiration_time() {
                return this.f35786b;
            }

            @NotNull
            public String photo_url() {
                return this.f35787c;
            }

            @NotNull
            public List<Tag> tags() {
                List<Tag> list = this.f35788d;
                return list != null ? list : new ArrayList();
            }
        }

        private C11031b() {
        }

        @NotNull
        public TopPickTeaserModel create(@NotNull String str, @NotNull DateTime dateTime, @NotNull String str2, @Nullable List<Tag> list) {
            C2668g.b(str, "id");
            C2668g.b(dateTime, "expiration_time");
            C2668g.b(str2, "photo_url");
            return new C11030a(str, dateTime, str2, list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.store.c$c */
    static final class C11032c implements Action {
        /* renamed from: a */
        final /* synthetic */ C8799c f35790a;

        C11032c(C8799c c8799c) {
            this.f35790a = c8799c;
        }

        public final void run() {
            this.f35790a.m37464e().m50771a(new DateTime(Format.OFFSET_SAMPLE_RELATIVE));
            this.f35790a.f30880f.a(this.f35790a.m37464e().a, this.f35790a.m37464e().b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.store.c$d */
    static final class C11033d implements Action {
        /* renamed from: a */
        final /* synthetic */ C8799c f35791a;

        C11033d(C8799c c8799c) {
            this.f35791a = c8799c;
        }

        public final void run() {
            this.f35791a.m37464e().m50771a(DateTime.a());
            this.f35791a.f30880f.a(this.f35791a.m37464e().a, this.f35791a.m37464e().b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.store.c$f */
    static final class C11034f implements Action {
        /* renamed from: a */
        final /* synthetic */ C8799c f35792a;
        /* renamed from: b */
        final /* synthetic */ List f35793b;

        C11034f(C8799c c8799c, List list) {
            this.f35792a = c8799c;
            this.f35793b = list;
        }

        public final void run() {
            if (this.f35793b.isEmpty()) {
                C3956a.a();
            }
            BriteDatabase b = this.f35792a.f30880f;
            Closeable c = b.c();
            Throwable th = (Throwable) null;
            try {
                Transaction transaction = (Transaction) c;
                Collection arrayList = new ArrayList();
                for (Object next : this.f35793b) {
                    if ((C19303i.a(((TopPickTeaser) next).getId()) ^ 1) != 0) {
                        arrayList.add(next);
                    }
                }
                for (TopPickTeaser topPickTeaser : (List) arrayList) {
                    this.f35792a.m37466f().m50772a(topPickTeaser.getId(), topPickTeaser.getExpirationTime(), topPickTeaser.getPhotoUrl(), topPickTeaser.getTags());
                    b.b(this.f35792a.m37466f().a, this.f35792a.m37466f().b);
                }
                transaction.markSuccessful();
                C15813i c15813i = C15813i.f49016a;
                C15818b.a(c, th);
            } catch (Throwable th2) {
                C15818b.a(c, th);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "cursor", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.store.c$e */
    static final class C13118e<T, R> implements Func1<Cursor, TopPickTeaser> {
        /* renamed from: a */
        final /* synthetic */ C8799c f41744a;

        C13118e(C8799c c8799c) {
            this.f41744a = c8799c;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50989a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TopPickTeaser m50989a(Cursor cursor) {
            C8799c c8799c = this.f41744a;
            cursor = this.f41744a.m37462d().map(cursor);
            C2668g.a(cursor, "topPickTeaserModelMapper.map(cursor)");
            return c8799c.m37458a((TopPickTeaserModel) cursor);
        }
    }

    /* renamed from: d */
    private final RowMapper<TopPickTeaserModel> m37462d() {
        Lazy lazy = this.f30877c;
        KProperty kProperty = f30875a[0];
        return (RowMapper) lazy.getValue();
    }

    /* renamed from: e */
    private final C13019a m37464e() {
        Lazy lazy = this.f30878d;
        KProperty kProperty = f30875a[1];
        return (C13019a) lazy.getValue();
    }

    /* renamed from: f */
    private final C13020c m37466f() {
        Lazy lazy = this.f30879e;
        KProperty kProperty = f30875a[2];
        return (C13020c) lazy.getValue();
    }

    @Inject
    public C8799c(@NotNull @DBv2 BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "db");
        this.f30880f = briteDatabase;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<List<TopPickTeaser>> m37468a() {
        C6124c a = this.f30876b.m37195a(DateTime.a());
        String str = a.f22514a;
        String[] strArr = a.f22515b;
        Observable<List<TopPickTeaser>> b = this.f30880f.a("top_pick_teaser", str, (String[]) Arrays.copyOf(strArr, strArr.length)).b(new C13118e(this));
        C2668g.a(b, "db.createQuery(TopPickTe…odelMapper.map(cursor)) }");
        return b;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37467a(@NotNull List<TopPickTeaser> list) {
        C2668g.b(list, "teaserRecs");
        list = C3956a.a(new C11034f(this, list));
        C2668g.a(list, "Completable.fromAction {…}\n            }\n        }");
        return list;
    }

    @NotNull
    /* renamed from: b */
    public final C3956a m37469b() {
        C3956a a = C3956a.a(new C11033d(this));
        C2668g.a(a, "Completable.fromAction {…tement.program)\n        }");
        return a;
    }

    @NotNull
    /* renamed from: c */
    public final C3956a m37470c() {
        C3956a a = C3956a.a(new C11032c(this));
        C2668g.a(a, "Completable.fromAction {…tement.program)\n        }");
        return a;
    }

    /* renamed from: a */
    private final TopPickTeaser m37458a(TopPickTeaserModel topPickTeaserModel) {
        String id = topPickTeaserModel.id();
        C2668g.a(id, "topPickTeaserModel.id()");
        DateTime expiration_time = topPickTeaserModel.expiration_time();
        C2668g.a(expiration_time, "topPickTeaserModel.expiration_time()");
        String photo_url = topPickTeaserModel.photo_url();
        C2668g.a(photo_url, "topPickTeaserModel.photo_url()");
        return new TopPickTeaser(id, expiration_time, photo_url, new ArrayList(topPickTeaserModel.tags()));
    }
}
