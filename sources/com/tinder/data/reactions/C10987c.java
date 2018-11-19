package com.tinder.data.reactions;

import android.database.Cursor;
import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.model.StrikeReactionModel.C13017b;
import com.tinder.data.model.StrikeReactionModel.C13018d;
import com.tinder.data.reactions.C8769d.C10988a;
import java.util.Arrays;
import java8.util.Optional;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/tinder/data/reactions/StrikeReactionDelightStore;", "Lcom/tinder/data/reactions/StrikeReactionStore;", "db", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "strikeIdInsert", "Lcom/tinder/data/model/StrikeReactionModel$Insert_strike_id;", "getStrikeIdInsert", "()Lcom/tinder/data/model/StrikeReactionModel$Insert_strike_id;", "strikeIdInsert$delegate", "Lkotlin/Lazy;", "strikeIdUpdate", "Lcom/tinder/data/model/StrikeReactionModel$Update_strike_id;", "getStrikeIdUpdate", "()Lcom/tinder/data/model/StrikeReactionModel$Update_strike_id;", "strikeIdUpdate$delegate", "getStrikeId", "Lrx/Single;", "Ljava8/util/Optional;", "", "matchId", "insert", "", "strikeId", "map", "cursor", "Landroid/database/Cursor;", "update", "", "upsertStrikeId", "Lrx/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.reactions.c */
public final class C10987c implements StrikeReactionStore {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f35711a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C10987c.class), "strikeIdInsert", "getStrikeIdInsert()Lcom/tinder/data/model/StrikeReactionModel$Insert_strike_id;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C10987c.class), "strikeIdUpdate", "getStrikeIdUpdate()Lcom/tinder/data/model/StrikeReactionModel$Update_strike_id;"))};
    /* renamed from: b */
    private final Lazy f35712b = C18451c.a((Function0) new StrikeReactionDelightStore$strikeIdInsert$2(this));
    /* renamed from: c */
    private final Lazy f35713c = C18451c.a((Function0) new StrikeReactionDelightStore$strikeIdUpdate$2(this));
    /* renamed from: d */
    private final BriteDatabase f35714d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "", "kotlin.jvm.PlatformType", "it", "Landroid/database/Cursor;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.reactions.c$a */
    static final class C13094a<T, R> implements Func1<Cursor, Optional<String>> {
        /* renamed from: a */
        final /* synthetic */ C10987c f41700a;

        C13094a(C10987c c10987c) {
            this.f41700a = c10987c;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50938a((Cursor) obj);
        }

        /* renamed from: a */
        public final Optional<String> m50938a(Cursor cursor) {
            C10987c c10987c = this.f41700a;
            C2668g.a(cursor, "it");
            return Optional.a(c10987c.m43595a(cursor));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.reactions.c$b */
    static final class C13874b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10987c f43985a;
        /* renamed from: b */
        final /* synthetic */ String f43986b;
        /* renamed from: c */
        final /* synthetic */ String f43987c;

        C13874b(C10987c c10987c, String str, String str2) {
            this.f43985a = c10987c;
            this.f43986b = str;
            this.f43987c = str2;
        }

        public final void call() {
            if (this.f43985a.m43592a(this.f43986b, this.f43987c) <= 0) {
                this.f43985a.m43599b(this.f43986b, this.f43987c);
            }
        }
    }

    /* renamed from: a */
    private final C13017b m43594a() {
        Lazy lazy = this.f35712b;
        KProperty kProperty = f35711a[0];
        return (C13017b) lazy.getValue();
    }

    /* renamed from: b */
    private final C13018d m43597b() {
        Lazy lazy = this.f35713c;
        KProperty kProperty = f35711a[1];
        return (C13018d) lazy.getValue();
    }

    public C10987c(@NotNull BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "db");
        this.f35714d = briteDatabase;
    }

    @NotNull
    public Single<Optional<String>> getStrikeId(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = C8769d.f30817a.m37194a(str);
        BriteDatabase briteDatabase = this.f35714d;
        Iterable iterable = str.f22516c;
        String str2 = str.f22514a;
        str = str.f22515b;
        str = briteDatabase.a(iterable, str2, (String[]) Arrays.copyOf(str, str.length)).a(new C13094a(this), Optional.a()).h().a();
        C2668g.a(str, "db.createQuery(statement…              .toSingle()");
        return str;
    }

    @NotNull
    public Completable upsertStrikeId(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "strikeId");
        str = Completable.a(new C13874b(this, str, str2));
        C2668g.a(str, "Completable.fromAction {…)\n            }\n        }");
        return str;
    }

    /* renamed from: a */
    private final int m43592a(String str, String str2) {
        m43597b().m50770a(str2, str);
        return this.f35714d.a(m43597b().a, m43597b().b);
    }

    /* renamed from: b */
    private final void m43599b(String str, String str2) {
        m43594a().m50769a(str, str2);
        this.f35714d.b(m43594a().a, m43594a().b);
    }

    /* renamed from: a */
    private final String m43595a(Cursor cursor) {
        cursor = ((C10988a) C8769d.f30818b.m43368a(cursor)).strike_id();
        C2668g.a(cursor, "model.strike_id()");
        return cursor;
    }
}
