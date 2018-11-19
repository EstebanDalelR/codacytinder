package com.tinder.data.match;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.BriteDatabase.Transaction;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.database.DBv2;
import com.tinder.data.match.C8680y.C10806g;
import com.tinder.data.model.MatchModel;
import com.tinder.data.model.MatchModel.C12987a;
import com.tinder.data.model.MatchModel.C12988b;
import com.tinder.data.model.MatchModel.C12989c;
import com.tinder.data.model.MatchModel.C12990d;
import com.tinder.data.model.MatchModel.C12991e;
import com.tinder.data.model.MatchModel.C12993i;
import com.tinder.data.model.MatchModel.C12994j;
import com.tinder.data.model.MatchModel.C12996l;
import com.tinder.data.model.MatchModel.C12997m;
import com.tinder.data.model.MatchPersonModel;
import com.tinder.data.model.MatchPlaceModel.C13000a;
import com.tinder.data.model.PlaceModel;
import com.tinder.data.model.SponsoredMatchCreativeValuesModel;
import com.tinder.domain.common.model.User;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.model.PlacesMatch.PlaceInfo;
import java.io.Closeable;
import java.util.Arrays;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ak;
import kotlin.io.C15818b;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Func1;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\fH\u0002J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00162\u0006\u0010\u0017\u001a\u00020\u0010J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190\b2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u001f\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0019J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190\bJ\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010#\u001a\u00020$H\u0002J\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190\b2\u0006\u0010'\u001a\u00020\u0010J\u001c\u0010(\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010-\u001a\u00020+J\u001e\u0010.\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020+J\u0016\u00102\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00101\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/tinder/data/match/MatchDataStore;", "", "db", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "personModelAdapter", "Lcom/tinder/data/match/PersonModelAdapter;", "countMatches", "Lrx/Observable;", "", "countUnTouchedMatches", "deleteAll", "Lrx/Completable;", "deleteExpiredSponsoredMatches", "deleteMatch", "matchId", "", "deleteOrphans", "getMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "getMatchByUserId", "Lrx/Single;", "userId", "getMatchesByType", "", "matchType", "Lcom/tinder/data/match/MatchType;", "getMostRecentMessageAdMatch", "getPlaceModelForMatch", "Lcom/tinder/data/model/PlaceModel;", "insertMatches", "matches", "loadMatches", "map", "cursor", "Landroid/database/Cursor;", "mapOptional", "search", "query", "setBlockedStatusForMatches", "matchIds", "isBlocked", "", "setMuteStatus", "isMuted", "updateTouchAndLastActivityDate", "lastActivityDate", "Lorg/joda/time/DateTime;", "isTouched", "updateTouchState", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.match.s */
public final class C8676s {
    /* renamed from: a */
    private final al f30539a = new al();
    /* renamed from: b */
    private final BriteDatabase f30540b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call", "(Landroid/database/Cursor;)Ljava/lang/Long;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$a */
    static final class C12929a<T, R> implements Func1<Cursor, Long> {
        /* renamed from: a */
        final /* synthetic */ RowMapper f41445a;

        C12929a(RowMapper rowMapper) {
            this.f41445a = rowMapper;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50612a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Long m50612a(Cursor cursor) {
            return (Long) this.f41445a.map(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call", "(Landroid/database/Cursor;)Ljava/lang/Long;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$b */
    static final class C12930b<T, R> implements Func1<Cursor, Long> {
        /* renamed from: a */
        final /* synthetic */ RowMapper f41446a;

        C12930b(RowMapper rowMapper) {
            this.f41446a = rowMapper;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50613a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Long m50613a(Cursor cursor) {
            return (Long) this.f41446a.map(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$g */
    static final class C12931g<T, R> implements Func1<Cursor, Optional<Match>> {
        /* renamed from: a */
        final /* synthetic */ C8676s f41447a;

        C12931g(C8676s c8676s) {
            this.f41447a = c8676s;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50614a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Optional<Match> m50614a(Cursor cursor) {
            C8676s c8676s = this.f41447a;
            C2668g.a(cursor, "it");
            return c8676s.m36968a(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$h */
    static final class C12932h<T, R> implements Func1<Cursor, Optional<Match>> {
        /* renamed from: a */
        final /* synthetic */ C8676s f41448a;

        C12932h(C8676s c8676s) {
            this.f41448a = c8676s;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50615a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Optional<Match> m50615a(Cursor cursor) {
            C8676s c8676s = this.f41448a;
            C2668g.a(cursor, "it");
            return c8676s.m36968a(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$i */
    static final class C12933i<T, R> implements Func1<Cursor, Optional<Match>> {
        /* renamed from: a */
        final /* synthetic */ C8676s f41449a;

        C12933i(C8676s c8676s) {
            this.f41449a = c8676s;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50616a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Optional<Match> m50616a(Cursor cursor) {
            C8676s c8676s = this.f41449a;
            C2668g.a(cursor, "it");
            return c8676s.m36968a(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$k */
    static final class C12934k<T, R> implements Func1<Cursor, Match> {
        /* renamed from: a */
        final /* synthetic */ C8676s f41450a;

        C12934k(C8676s c8676s) {
            this.f41450a = c8676s;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50617a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Match m50617a(Cursor cursor) {
            C8676s c8676s = this.f41450a;
            C2668g.a(cursor, "it");
            return c8676s.m36969b(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$l */
    static final class C12935l<T, R> implements Func1<Cursor, Match> {
        /* renamed from: a */
        final /* synthetic */ C8676s f41451a;

        C12935l(C8676s c8676s) {
            this.f41451a = c8676s;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50618a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Match m50618a(Cursor cursor) {
            C8676s c8676s = this.f41451a;
            C2668g.a(cursor, "it");
            return c8676s.m36969b(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$c */
    static final class C13825c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8676s f43858a;

        C13825c(C8676s c8676s) {
            this.f43858a = c8676s;
        }

        public final void call() {
            C12987a c12987a = new C12987a(this.f43858a.f30540b.b());
            this.f43858a.f30540b.a(c12987a.a, c12987a.b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$d */
    static final class C13826d implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8676s f43859a;

        C13826d(C8676s c8676s) {
            this.f43859a = c8676s;
        }

        public final void call() {
            C12988b c12988b = new C12988b(this.f43859a.f30540b.b(), C8673k.f30536a);
            c12988b.m50743a(DateTime.a());
            this.f43859a.f30540b.a(c12988b.a, c12988b.b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$e */
    static final class C13827e implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8676s f43860a;
        /* renamed from: b */
        final /* synthetic */ String f43861b;

        C13827e(C8676s c8676s, String str) {
            this.f43860a = c8676s;
            this.f43861b = str;
        }

        public final void call() {
            C12989c c12989c = new C12989c(this.f43860a.f30540b.b());
            c12989c.m50744a(this.f43861b);
            this.f43860a.f30540b.a(ak.a(new String[]{c12989c.a, "message"}), c12989c.b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$f */
    static final class C13828f implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8676s f43862a;

        C13828f(C8676s c8676s) {
            this.f43862a = c8676s;
        }

        public final void call() {
            SQLiteDatabase b = this.f43862a.f30540b.b();
            C12990d c12990d = new C12990d(b);
            C12991e c12991e = new C12991e(b);
            C13000a c13000a = new C13000a(b);
            BriteDatabase a = this.f43862a.f30540b;
            Closeable c = a.c();
            Throwable th = (Throwable) null;
            try {
                Transaction transaction = (Transaction) c;
                a.a(c12990d.a, c12990d.b);
                a.a(c12991e.a, c12991e.b);
                a.a(c13000a.a, c13000a.b);
                transaction.markSuccessful();
                C15813i c15813i = C15813i.f49016a;
                C15818b.a(c, th);
            } catch (Throwable th2) {
                C15818b.a(c, th);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$j */
    static final class C13829j implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8676s f43863a;
        /* renamed from: b */
        final /* synthetic */ List f43864b;

        C13829j(C8676s c8676s, List list) {
            this.f43863a = c8676s;
            this.f43864b = list;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void call() {
            /*
            r6 = this;
            r0 = r6.f43863a;
            r0 = r0.f30540b;
            r0 = r0.c();
            r0 = (java.io.Closeable) r0;
            r1 = 0;
            r1 = (java.lang.Throwable) r1;
            r2 = r0;
            r2 = (com.squareup.sqlbrite.BriteDatabase.Transaction) r2;	 Catch:{ Throwable -> 0x003e }
            r3 = new com.tinder.data.match.x;	 Catch:{ Throwable -> 0x003e }
            r4 = r6.f43863a;	 Catch:{ Throwable -> 0x003e }
            r4 = r4.f30540b;	 Catch:{ Throwable -> 0x003e }
            r3.<init>(r4);	 Catch:{ Throwable -> 0x003e }
            r4 = r6.f43864b;	 Catch:{ Throwable -> 0x003e }
            r4 = r4.iterator();	 Catch:{ Throwable -> 0x003e }
        L_0x0023:
            r5 = r4.hasNext();	 Catch:{ Throwable -> 0x003e }
            if (r5 == 0) goto L_0x0033;
        L_0x0029:
            r5 = r4.next();	 Catch:{ Throwable -> 0x003e }
            r5 = (com.tinder.domain.match.model.Match) r5;	 Catch:{ Throwable -> 0x003e }
            r3.m37002a(r5);	 Catch:{ Throwable -> 0x003e }
            goto L_0x0023;
        L_0x0033:
            r2.markSuccessful();	 Catch:{ Throwable -> 0x003e }
            r2 = kotlin.C15813i.f49016a;	 Catch:{ Throwable -> 0x003e }
            kotlin.io.C15818b.a(r0, r1);
            return;
        L_0x003c:
            r2 = move-exception;
            goto L_0x0040;
        L_0x003e:
            r1 = move-exception;
            throw r1;	 Catch:{ all -> 0x003c }
        L_0x0040:
            kotlin.io.C15818b.a(r0, r1);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.match.s.j.call():void");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$m */
    static final class C13830m implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8676s f43865a;
        /* renamed from: b */
        final /* synthetic */ List f43866b;
        /* renamed from: c */
        final /* synthetic */ boolean f43867c;

        C13830m(C8676s c8676s, List list, boolean z) {
            this.f43865a = c8676s;
            this.f43866b = list;
            this.f43867c = z;
        }

        public final void call() {
            BriteDatabase a = this.f43865a.f30540b;
            Closeable c = a.c();
            Throwable th = (Throwable) null;
            try {
                Transaction transaction = (Transaction) c;
                C12994j c12994j = new C12994j(a.b());
                for (String a2 : this.f43866b) {
                    c12994j.m50747a(this.f43867c, a2);
                    a.a(c12994j.a, c12994j.b);
                }
                transaction.markSuccessful();
                C15813i c15813i = C15813i.f49016a;
                C15818b.a(c, th);
            } catch (Throwable th2) {
                C15818b.a(c, th);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$n */
    static final class C13831n implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8676s f43868a;
        /* renamed from: b */
        final /* synthetic */ boolean f43869b;
        /* renamed from: c */
        final /* synthetic */ String f43870c;

        C13831n(C8676s c8676s, boolean z, String str) {
            this.f43868a = c8676s;
            this.f43869b = z;
            this.f43870c = str;
        }

        public final void call() {
            C12993i c12993i = new C12993i(this.f43868a.f30540b.b());
            c12993i.m50746a(this.f43869b, this.f43870c);
            this.f43868a.f30540b.a(c12993i.a, c12993i.b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$o */
    static final class C13832o implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8676s f43871a;
        /* renamed from: b */
        final /* synthetic */ boolean f43872b;
        /* renamed from: c */
        final /* synthetic */ DateTime f43873c;
        /* renamed from: d */
        final /* synthetic */ String f43874d;

        C13832o(C8676s c8676s, boolean z, DateTime dateTime, String str) {
            this.f43871a = c8676s;
            this.f43872b = z;
            this.f43873c = dateTime;
            this.f43874d = str;
        }

        public final void call() {
            C12996l c12996l = new C12996l(this.f43871a.f30540b.b(), C8680y.f30553b);
            c12996l.m50749a(this.f43872b, this.f43873c, this.f43874d);
            this.f43871a.f30540b.a(c12996l.a, c12996l.b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.s$p */
    static final class C13833p implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8676s f43875a;
        /* renamed from: b */
        final /* synthetic */ boolean f43876b;
        /* renamed from: c */
        final /* synthetic */ String f43877c;

        C13833p(C8676s c8676s, boolean z, String str) {
            this.f43875a = c8676s;
            this.f43876b = z;
            this.f43877c = str;
        }

        public final void call() {
            C12997m c12997m = new C12997m(this.f43875a.f30540b.b());
            c12997m.m50750a(this.f43876b, this.f43877c);
            this.f43875a.f30540b.a("`match`", c12997m.b);
        }
    }

    @Inject
    public C8676s(@NotNull @DBv2 BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "db");
        this.f30540b = briteDatabase;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<List<Match>> m36977a() {
        C6124c a = C8680y.f30553b.m37170a();
        BriteDatabase briteDatabase = this.f30540b;
        Iterable iterable = a.f22516c;
        String str = a.f22514a;
        String[] strArr = a.f22515b;
        Observable<List<Match>> b = briteDatabase.a(iterable, str, (String[]) Arrays.copyOf(strArr, strArr.length)).b(new C12934k(this));
        C2668g.a(b, "db.createQuery(statement…   .mapToList { map(it) }");
        return b;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m36975a(@NotNull List<? extends Match> list) {
        C2668g.b(list, ManagerWebServices.PARAM_MATCHES);
        list = Completable.a(new C13829j(this, list));
        C2668g.a(list, "Completable.fromAction {…}\n            }\n        }");
        return list;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<List<Match>> m36978a(@NotNull String str) {
        C2668g.b(str, "query");
        str = C8680y.f30553b.m37172a(str);
        BriteDatabase briteDatabase = this.f30540b;
        Iterable iterable = str.f22516c;
        String str2 = str.f22514a;
        str = str.f22515b;
        str = briteDatabase.a(iterable, str2, (String[]) Arrays.copyOf(str, str.length)).b(new C12935l(this));
        C2668g.a(str, "db.createQuery(search.ta…   .mapToList { map(it) }");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final Observable<Long> m36981b() {
        C6124c b = C8680y.f30553b.m37173b();
        RowMapper d = C8680y.f30553b.m37177d();
        BriteDatabase briteDatabase = this.f30540b;
        Iterable iterable = b.f22516c;
        String str = b.f22514a;
        String[] strArr = b.f22515b;
        Observable<Long> a = briteDatabase.a(iterable, str, (String[]) Arrays.copyOf(strArr, strArr.length)).a(new C12929a(d), Long.valueOf(0));
        C2668g.a(a, "db.createQuery(statement…t({ mapper.map(it) }, 0L)");
        return a;
    }

    @NotNull
    /* renamed from: c */
    public final Observable<Long> m36982c() {
        C6124c c = C8680y.f30553b.m37175c();
        RowMapper e = C8680y.f30553b.m37178e();
        BriteDatabase briteDatabase = this.f30540b;
        Iterable iterable = c.f22516c;
        String str = c.f22514a;
        String[] strArr = c.f22515b;
        Observable<Long> a = briteDatabase.a(iterable, str, (String[]) Arrays.copyOf(strArr, strArr.length)).a(new C12930b(e), Long.valueOf(0));
        C2668g.a(a, "db.createQuery(statement…t({ mapper.map(it) }, 0L)");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m36974a(@NotNull String str, boolean z) {
        C2668g.b(str, "matchId");
        str = Completable.a(new C13833p(this, z, str));
        C2668g.a(str, "Completable.fromAction {…tement.program)\n        }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m36976a(@NotNull List<String> list, boolean z) {
        C2668g.b(list, "matchIds");
        list = Completable.a(new C13830m(this, list, z));
        C2668g.a(list, "Completable.fromAction {…}\n            }\n        }");
        return list;
    }

    @NotNull
    /* renamed from: b */
    public final Completable m36979b(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = Completable.a(new C13827e(this, str)).a(m36972g());
        C2668g.a(str, "Completable.fromAction {….andThen(deleteOrphans())");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m36973a(@NotNull String str, @NotNull DateTime dateTime, boolean z) {
        C2668g.b(str, "matchId");
        C2668g.b(dateTime, "lastActivityDate");
        str = Completable.a(new C13832o(this, z, dateTime, str));
        C2668g.a(str, "Completable.fromAction {…update.program)\n        }");
        return str;
    }

    @NotNull
    /* renamed from: d */
    public final Completable m36984d() {
        Completable a = Completable.a(new C13825c(this)).a(m36972g());
        C2668g.a(a, "Completable.fromAction {….andThen(deleteOrphans())");
        return a;
    }

    /* renamed from: g */
    private final Completable m36972g() {
        Completable a = Completable.a(new C13828f(this));
        C2668g.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }

    @NotNull
    /* renamed from: c */
    public final Observable<Optional<Match>> m36983c(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = C8680y.f30553b.m37174b(str);
        BriteDatabase briteDatabase = this.f30540b;
        Iterable iterable = str.f22516c;
        String str2 = str.f22514a;
        str = str.f22515b;
        str = briteDatabase.a(iterable, str2, (String[]) Arrays.copyOf(str, str.length)).a(new C12931g(this), Optional.a());
        C2668g.a(str, "db.createQuery(statement… Optional.empty<Match>())");
        return str;
    }

    @NotNull
    /* renamed from: d */
    public final Single<Optional<Match>> m36985d(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        str = C8680y.f30553b.m37176c(str);
        BriteDatabase briteDatabase = this.f30540b;
        Iterable iterable = str.f22516c;
        String str2 = str.f22514a;
        str = str.f22515b;
        str = briteDatabase.a(iterable, str2, (String[]) Arrays.copyOf(str, str.length)).a(new C12932h(this), Optional.a()).h().a();
        C2668g.a(str, "db.createQuery(statement…ch>()).first().toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: e */
    public final Observable<Optional<Match>> m36986e() {
        C6124c a = C8680y.f30553b.m37171a(Attribution.SPONSORED_AD);
        BriteDatabase briteDatabase = this.f30540b;
        Iterable iterable = a.f22516c;
        String str = a.f22514a;
        String[] strArr = a.f22515b;
        Observable<Optional<Match>> a2 = briteDatabase.a(iterable, str, (String[]) Arrays.copyOf(strArr, strArr.length)).a(new C12933i(this), Optional.a());
        C2668g.a(a2, "db.createQuery(statement… Optional.empty<Match>())");
        return a2;
    }

    @NotNull
    /* renamed from: b */
    public final Completable m36980b(@NotNull String str, boolean z) {
        C2668g.b(str, "matchId");
        str = Completable.a(new C13831n(this, z, str));
        C2668g.a(str, "Completable.fromAction {…Status.program)\n        }");
        return str;
    }

    /* renamed from: a */
    private final Optional<Match> m36968a(Cursor cursor) {
        cursor = Optional.a(m36969b(cursor));
        C2668g.a(cursor, "Optional.of(map(cursor))");
        return cursor;
    }

    /* renamed from: b */
    private final Match m36969b(Cursor cursor) {
        C8676s c8676s = this;
        C10806g c10806g = (C10806g) C8680y.f30555d.m43360a(cursor);
        MatchModel M = c10806g.mo11063M();
        MatchPersonModel P;
        User a;
        String id;
        DateTime creation_date;
        DateTime last_activity_date;
        Attribution attribution;
        boolean is_muted;
        boolean is_touched;
        switch (C8677t.f30541a[M.type().ordinal()]) {
            case 1:
                P = c10806g.mo11064P();
                if (P == null) {
                    throw new IllegalStateException("Invalid MatchView Model".toString());
                }
                a = c8676s.f30539a.m43250a(P);
                id = M.id();
                C2668g.a(id, "matchModel.id()");
                creation_date = M.creation_date();
                C2668g.a(creation_date, "matchModel.creation_date()");
                last_activity_date = M.last_activity_date();
                C2668g.a(last_activity_date, "matchModel.last_activity_date()");
                attribution = M.attribution();
                C2668g.a(attribution, "matchModel.attribution()");
                C2668g.a(M, "matchModel");
                is_muted = M.is_muted();
                is_touched = M.is_touched();
                C2668g.a(a, ManagerWebServices.PARAM_PERSON);
                return new CoreMatch(id, creation_date, last_activity_date, attribution, is_muted, is_touched, a);
            case 2:
                SponsoredMatchCreativeValuesModel CV = c10806g.CV();
                if (CV == null) {
                    throw new IllegalStateException("Invalid MatchView Model".toString());
                }
                Type type;
                String id2 = M.id();
                C2668g.a(id2, "matchModel.id()");
                DateTime creation_date2 = M.creation_date();
                C2668g.a(creation_date2, "matchModel.creation_date()");
                creation_date = M.last_activity_date();
                C2668g.a(creation_date, "matchModel.last_activity_date()");
                Attribution attribution2 = M.attribution();
                C2668g.a(attribution2, "matchModel.attribution()");
                C2668g.a(M, "matchModel");
                boolean is_muted2 = M.is_muted();
                is_muted = M.is_touched();
                String template_id = CV.template_id();
                C2668g.a(template_id, "creativeValuesModel.template_id()");
                String title = CV.title();
                C2668g.a(title, "creativeValuesModel.title()");
                String logo_url = CV.logo_url();
                C2668g.a(logo_url, "creativeValuesModel.logo_url()");
                String body = CV.body();
                C2668g.a(body, "creativeValuesModel.body()");
                String clickthrough_url = CV.clickthrough_url();
                C2668g.a(clickthrough_url, "creativeValuesModel.clickthrough_url()");
                String clickthrough_text = CV.clickthrough_text();
                C2668g.a(clickthrough_text, "creativeValuesModel.clickthrough_text()");
                DateTime end_date = CV.end_date();
                C2668g.a(end_date, "creativeValuesModel.end_date()");
                if (CV.photos() != null) {
                    type = Type.BRANDED_PROFILE_CARD;
                    if (type != null) {
                        return new MessageAdMatch(id2, creation_date2, creation_date, attribution2, is_muted2, is_muted, template_id, title, logo_url, body, clickthrough_url, clickthrough_text, end_date, type, CV.photos());
                    }
                }
                type = Type.SPONSORED;
                return new MessageAdMatch(id2, creation_date2, creation_date, attribution2, is_muted2, is_muted, template_id, title, logo_url, body, clickthrough_url, clickthrough_text, end_date, type, CV.photos());
            case 3:
                P = c10806g.mo11064P();
                if (P == null) {
                    throw new IllegalStateException("Invalid MatchView Model".toString());
                }
                a = c8676s.f30539a.m43250a(P);
                String id3 = M.id();
                C2668g.a(id3, "matchModel.id()");
                PlaceModel e = m36971e(id3);
                id = M.id();
                C2668g.a(id, "matchModel.id()");
                creation_date = M.creation_date();
                C2668g.a(creation_date, "matchModel.creation_date()");
                last_activity_date = M.last_activity_date();
                C2668g.a(last_activity_date, "matchModel.last_activity_date()");
                attribution = M.attribution();
                C2668g.a(attribution, "matchModel.attribution()");
                C2668g.a(M, "matchModel");
                is_muted = M.is_muted();
                is_touched = M.is_touched();
                C2668g.a(a, ManagerWebServices.PARAM_PERSON);
                String id4 = e.id();
                C2668g.a(id4, "place.id()");
                id3 = e.name();
                C2668g.a(id3, "place.name()");
                return new PlacesMatch(id, creation_date, last_activity_date, attribution, is_muted, is_touched, a, new PlaceInfo(id4, id3));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    private final com.tinder.data.model.PlaceModel m36971e(java.lang.String r5) {
        /*
        r4 = this;
        r0 = com.tinder.data.match.C8680y.f30556e;
        r5 = r0.m37179a(r5);
        r0 = r4.f30540b;
        r1 = r5.f22514a;
        r5 = r5.f22515b;
        r2 = r5.length;
        r5 = java.util.Arrays.copyOf(r5, r2);
        r5 = (java.lang.String[]) r5;
        r5 = r0.a(r1, r5);
        r5 = (java.io.Closeable) r5;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r5;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0050 }
        r2 = "cursor";
        kotlin.jvm.internal.C2668g.a(r1, r2);	 Catch:{ Throwable -> 0x0050 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0050 }
        r2 = new com.tinder.data.match.MatchDataStore$getPlaceModelForMatch$1$1$1;	 Catch:{ Throwable -> 0x0050 }
        r3 = com.tinder.data.match.C8680y.f30557f;	 Catch:{ Throwable -> 0x0050 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0050 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0050 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0050 }
        r1 = kotlin.sequences.C19285g.c(r1);	 Catch:{ Throwable -> 0x0050 }
        r2 = "cursor.asSequence().map(…LACE_MAPPER::map).first()";
        kotlin.jvm.internal.C2668g.a(r1, r2);	 Catch:{ Throwable -> 0x0050 }
        r1 = (com.tinder.data.model.PlaceModel) r1;	 Catch:{ Throwable -> 0x0050 }
        kotlin.io.C15818b.a(r5, r0);
        r5 = "db.query(statement.state…first()\n                }";
        kotlin.jvm.internal.C2668g.a(r1, r5);
        r5 = "MatchModels.MATCH_PLACE_…          }\n            }";
        kotlin.jvm.internal.C2668g.a(r1, r5);
        return r1;
    L_0x004e:
        r1 = move-exception;
        goto L_0x0052;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004e }
    L_0x0052:
        kotlin.io.C15818b.a(r5, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.match.s.e(java.lang.String):com.tinder.data.model.PlaceModel");
    }

    @NotNull
    /* renamed from: f */
    public final Completable m36987f() {
        Completable a = Completable.a(new C13826d(this));
        C2668g.a(a, "Completable.fromAction {…tement.program)\n        }");
        return a;
    }
}
