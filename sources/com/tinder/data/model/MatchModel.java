package com.tinder.data.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqldelight.C6123b.C7264a;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.match.MatchType;
import com.tinder.data.model.MatchPersonModel.C8707a;
import com.tinder.data.model.SponsoredMatchCreativeValuesModel.C8713a;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.match.model.Match.Attribution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.joda.time.DateTime;

public interface MatchModel {

    public interface Creator<T extends MatchModel> {
        T create(@NonNull String str, @NonNull DateTime dateTime, @NonNull DateTime dateTime2, @NonNull Attribution attribution, boolean z, boolean z2, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z3, @NonNull MatchType matchType);
    }

    public interface Match_viewCreator<T2 extends MatchModel, T3 extends MatchPersonModel, T4 extends SponsoredMatchCreativeValuesModel, T extends Match_viewModel<T2, T3, T4>> {
        T create(@NonNull String str, @NonNull T2 t2, @Nullable T3 t3, @Nullable T4 t4);
    }

    public interface Match_viewModel<T2 extends MatchModel, T3 extends MatchPersonModel, T4 extends SponsoredMatchCreativeValuesModel> {
        @Nullable
        T4 CV();

        @NonNull
        /* renamed from: M */
        T2 mo11063M();

        @Nullable
        /* renamed from: P */
        T3 mo11064P();

        @NonNull
        String m_id();
    }

    /* renamed from: com.tinder.data.model.MatchModel$f */
    public static final class C8706f<T extends MatchModel> {
        /* renamed from: a */
        public final Creator<T> f30658a;
        /* renamed from: b */
        public final ColumnAdapter<DateTime, Long> f30659b;
        /* renamed from: c */
        public final ColumnAdapter<DateTime, Long> f30660c;
        /* renamed from: d */
        public final ColumnAdapter<Attribution, String> f30661d;
        /* renamed from: e */
        public final ColumnAdapter<MatchType, String> f30662e;

        /* renamed from: com.tinder.data.model.MatchModel$f$1 */
        class C108541 implements RowMapper<Long> {
            /* renamed from: a */
            final /* synthetic */ C8706f f35498a;

            C108541(C8706f c8706f) {
                this.f35498a = c8706f;
            }

            public /* synthetic */ Object map(Cursor cursor) {
                return m43358a(cursor);
            }

            /* renamed from: a */
            public Long m43358a(Cursor cursor) {
                return Long.valueOf(cursor.getLong(0));
            }
        }

        /* renamed from: com.tinder.data.model.MatchModel$f$2 */
        class C108552 implements RowMapper<Long> {
            /* renamed from: a */
            final /* synthetic */ C8706f f35499a;

            C108552(C8706f c8706f) {
                this.f35499a = c8706f;
            }

            public /* synthetic */ Object map(Cursor cursor) {
                return m43359a(cursor);
            }

            /* renamed from: a */
            public Long m43359a(Cursor cursor) {
                return Long.valueOf(cursor.getLong(0));
            }
        }

        public C8706f(Creator<T> creator, ColumnAdapter<DateTime, Long> columnAdapter, ColumnAdapter<DateTime, Long> columnAdapter2, ColumnAdapter<Attribution, String> columnAdapter3, ColumnAdapter<MatchType, String> columnAdapter4) {
            this.f30658a = creator;
            this.f30659b = columnAdapter;
            this.f30660c = columnAdapter2;
            this.f30661d = columnAdapter3;
            this.f30662e = columnAdapter4;
        }

        /* renamed from: a */
        public C6124c m37170a() {
            return new C6124c("SELECT * FROM match_view\nWHERE is_blocked = 0 AND my_group_id IS NULL\nORDER BY last_activity_date DESC", new String[0], Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"`match`", "match_person", "sponsored_match_creative_values"}))));
        }

        /* renamed from: a */
        public C6124c m37172a(@Nullable String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM match_view\nWHERE is_blocked = 0 AND person_id IS NOT NULL\nAND\n(\n    name LIKE '%' || ");
            if (str == null) {
                stringBuilder.append(ManagerWebServices.NULL_STRING_VALUE);
            } else {
                stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
                stringBuilder.append(1);
                arrayList.add(str);
            }
            stringBuilder.append(" || '%'\n    OR\n    m_id IN (\n        SELECT DISTINCT match_id FROM message WHERE\n        text LIKE '%' || ");
            if (str == null) {
                stringBuilder.append(ManagerWebServices.NULL_STRING_VALUE);
            } else {
                stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
                stringBuilder.append(1);
            }
            stringBuilder.append(" || '%'\n    )\n    OR\n    m_id IN (\n    SELECT DISTINCT match_id FROM match_place WHERE match_place.place_id IN (\n            SELECT id FROM place P WHERE P.name LIKE '%' || ");
            if (str == null) {
                stringBuilder.append(ManagerWebServices.NULL_STRING_VALUE);
            } else {
                stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
                stringBuilder.append(1);
            }
            stringBuilder.append(" || '%'\n        )\n    )\n)\nORDER BY last_activity_date DESC");
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"`match`", "match_person", "sponsored_match_creative_values", "message", "match_place", "place"}))));
        }

        /* renamed from: b */
        public C6124c m37173b() {
            return new C6124c("SELECT COUNT(*) AS count FROM `match` WHERE is_blocked = 0 AND my_group_id IS NULL", new String[0], Collections.singleton("`match`"));
        }

        /* renamed from: c */
        public C6124c m37175c() {
            return new C6124c("SELECT COUNT(*) AS count FROM `match` WHERE is_touched=0 AND is_blocked = 0 AND my_group_id IS NULL", new String[0], Collections.singleton("`match`"));
        }

        /* renamed from: b */
        public C6124c m37174b(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM match_view WHERE m_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"`match`", "match_person", "sponsored_match_creative_values"}))));
        }

        /* renamed from: c */
        public C6124c m37176c(@Nullable String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM match_view WHERE person_id = ");
            if (str == null) {
                stringBuilder.append(ManagerWebServices.NULL_STRING_VALUE);
            } else {
                stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
                stringBuilder.append(1);
                arrayList.add(str);
            }
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"`match`", "match_person", "sponsored_match_creative_values"}))));
        }

        /* renamed from: a */
        public C6124c m37171a(@NonNull Attribution attribution) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM match_view\nWHERE attribution = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add((String) this.f30661d.encode(attribution));
            stringBuilder.append("\nORDER BY creation_date DESC\nLIMIT 1");
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"`match`", "match_person", "sponsored_match_creative_values"}))));
        }

        /* renamed from: d */
        public RowMapper<Long> m37177d() {
            return new C108541(this);
        }

        /* renamed from: e */
        public RowMapper<Long> m37178e() {
            return new C108552(this);
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$h */
    public static final class C10856h<T2 extends MatchModel, T3 extends MatchPersonModel, T4 extends SponsoredMatchCreativeValuesModel, T extends Match_viewModel<T2, T3, T4>> implements RowMapper<T> {
        /* renamed from: a */
        private final Match_viewCreator<T2, T3, T4, T> f35500a;
        /* renamed from: b */
        private final C8706f<T2> f35501b;
        /* renamed from: c */
        private final C8707a<T3> f35502c;
        /* renamed from: d */
        private final C8713a<T4> f35503d;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43360a(cursor);
        }

        public C10856h(Match_viewCreator<T2, T3, T4, T> match_viewCreator, C8706f<T2> c8706f, C8707a<T3> c8707a, C8713a<T4> c8713a) {
            this.f35500a = match_viewCreator;
            this.f35501b = c8706f;
            this.f35502c = c8707a;
            this.f35503d = c8713a;
        }

        @NonNull
        /* renamed from: a */
        public T m43360a(@NonNull Cursor cursor) {
            MatchPersonModel matchPersonModel;
            Match_viewCreator match_viewCreator;
            MatchModel matchModel;
            SponsoredMatchCreativeValuesModel sponsoredMatchCreativeValuesModel;
            Cursor cursor2 = cursor;
            Match_viewCreator match_viewCreator2 = this.f35500a;
            String string = cursor2.getString(0);
            List list = null;
            MatchModel create = this.f35501b.f30658a.create(cursor2.getString(1), (DateTime) this.f35501b.f30659b.decode(Long.valueOf(cursor2.getLong(2))), (DateTime) this.f35501b.f30660c.decode(Long.valueOf(cursor2.getLong(3))), (Attribution) this.f35501b.f30661d.decode(cursor2.getString(4)), cursor2.getInt(5) == 1, cursor2.getInt(6) == 1, cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.getInt(10) == 1, (MatchType) r0.f35501b.f30662e.decode(cursor2.getString(11)));
            if (cursor2.isNull(12)) {
                matchPersonModel = null;
            } else {
                matchPersonModel = r0.f35502c.f30663a.create(cursor2.getString(12), cursor2.getString(13), cursor2.isNull(14) ? null : cursor2.getString(14), cursor2.isNull(15) ? null : (DateTime) r0.f35502c.f30664b.decode(Long.valueOf(cursor2.getLong(15))), (Gender) r0.f35502c.f30665c.decode(cursor2.getBlob(16)), (List) r0.f35502c.f30666d.decode(cursor2.getBlob(17)), (List) r0.f35502c.f30667e.decode(cursor2.getBlob(18)), (List) r0.f35502c.f30668f.decode(cursor2.getBlob(19)), (List) r0.f35502c.f30669g.decode(cursor2.getBlob(20)));
            }
            if (cursor2.isNull(21)) {
                match_viewCreator = match_viewCreator2;
                matchModel = create;
                sponsoredMatchCreativeValuesModel = null;
            } else {
                com.tinder.data.model.SponsoredMatchCreativeValuesModel.Creator creator = r0.f35503d.f30678a;
                String string2 = cursor2.getString(21);
                String string3 = cursor2.getString(22);
                String string4 = cursor2.getString(23);
                String string5 = cursor2.getString(24);
                String string6 = cursor2.getString(25);
                String string7 = cursor2.getString(26);
                String string8 = cursor2.getString(27);
                Match_viewCreator match_viewCreator3 = match_viewCreator2;
                MatchModel matchModel2 = create;
                DateTime dateTime = (DateTime) r0.f35503d.f30679b.decode(Long.valueOf(cursor2.getLong(28)));
                if (!cursor2.isNull(29)) {
                    list = (List) r0.f35503d.f30680c.decode(cursor2.getBlob(29));
                }
                sponsoredMatchCreativeValuesModel = creator.create(string2, string3, string4, string5, string6, string7, string8, dateTime, list);
                match_viewCreator = match_viewCreator3;
                matchModel = matchModel2;
            }
            return match_viewCreator.create(string, matchModel, matchPersonModel, sponsoredMatchCreativeValuesModel);
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$a */
    public static final class C12987a extends C7264a {
        public C12987a(SQLiteDatabase sQLiteDatabase) {
            super("`match`", sQLiteDatabase.compileStatement("DELETE FROM `match`"));
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$b */
    public static final class C12988b extends C7264a {
        /* renamed from: c */
        private final C8713a<? extends SponsoredMatchCreativeValuesModel> f41568c;

        public C12988b(SQLiteDatabase sQLiteDatabase, C8713a<? extends SponsoredMatchCreativeValuesModel> c8713a) {
            super("`match`", sQLiteDatabase.compileStatement("DELETE FROM `match`\n    WHERE id IN (\n        SELECT id\n        FROM `match` M\n        INNER JOIN sponsored_match_creative_values CV ON M.id = CV.match_id\n        WHERE end_date < ?\n    )"));
            this.f41568c = c8713a;
        }

        /* renamed from: a */
        public void m50743a(@NonNull DateTime dateTime) {
            this.b.bindLong(1, ((Long) this.f41568c.f30679b.encode(dateTime)).longValue());
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$c */
    public static final class C12989c extends C7264a {
        public C12989c(SQLiteDatabase sQLiteDatabase) {
            super("`match`", sQLiteDatabase.compileStatement("DELETE FROM `match` WHERE id = ?"));
        }

        /* renamed from: a */
        public void m50744a(@NonNull String str) {
            this.b.bindString(1, str);
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$d */
    public static final class C12990d extends C7264a {
        public C12990d(SQLiteDatabase sQLiteDatabase) {
            super("match_group", sQLiteDatabase.compileStatement("DELETE FROM match_group\nWHERE (\n    SELECT COUNT(*)\n    FROM `match`\n    WHERE my_group_id = match_group.id\n    OR their_group_id = match_group.id\n) = 0"));
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$e */
    public static final class C12991e extends C7264a {
        public C12991e(SQLiteDatabase sQLiteDatabase) {
            super("match_person", sQLiteDatabase.compileStatement("DELETE FROM match_person\nWHERE (SELECT COUNT(*) FROM `match` WHERE person_id = match_person.id) = 0\nAND (SELECT COUNT(*) FROM match_group_member WHERE person_id = match_person.id) = 0"));
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$g */
    public static final class C12992g extends C7265b {
        /* renamed from: c */
        private final C8706f<? extends MatchModel> f41569c;

        public C12992g(SQLiteDatabase sQLiteDatabase, C8706f<? extends MatchModel> c8706f) {
            super("`match`", sQLiteDatabase.compileStatement("INSERT INTO `match` (id, creation_date, last_activity_date, attribution, is_muted, is_touched,\nperson_id, my_group_id, their_group_id,type)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.f41569c = c8706f;
        }

        /* renamed from: a */
        public void m50745a(@NonNull String str, @NonNull DateTime dateTime, @NonNull DateTime dateTime2, @NonNull Attribution attribution, boolean z, boolean z2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NonNull MatchType matchType) {
            this.b.bindString(1, str);
            this.b.bindLong(2, ((Long) this.f41569c.f30659b.encode(dateTime)).longValue());
            this.b.bindLong(3, ((Long) this.f41569c.f30660c.encode(dateTime2)).longValue());
            this.b.bindString(4, (String) this.f41569c.f30661d.encode(attribution));
            dateTime = 0;
            this.b.bindLong(5, z ? 1 : null);
            str = this.b;
            if (z2) {
                dateTime = 1;
            }
            str.bindLong(6, dateTime);
            if (str2 == null) {
                this.b.bindNull(7);
            } else {
                this.b.bindString(7, str2);
            }
            if (str3 == null) {
                this.b.bindNull(8);
            } else {
                this.b.bindString(8, str3);
            }
            if (str4 == null) {
                this.b.bindNull(9);
            } else {
                this.b.bindString(9, str4);
            }
            this.b.bindString(10, (String) this.f41569c.f30662e.encode(matchType));
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$i */
    public static final class C12993i extends C7266c {
        public C12993i(SQLiteDatabase sQLiteDatabase) {
            super("`match`", sQLiteDatabase.compileStatement("UPDATE `match` SET is_muted = ? WHERE id = ?"));
        }

        /* renamed from: a */
        public void m50746a(boolean z, @NonNull String str) {
            this.b.bindLong(true, z ? 1 : 0);
            this.b.bindString(2, str);
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$j */
    public static final class C12994j extends C7266c {
        public C12994j(SQLiteDatabase sQLiteDatabase) {
            super("`match`", sQLiteDatabase.compileStatement("UPDATE `match` SET is_blocked = ? WHERE id = ?"));
        }

        /* renamed from: a */
        public void m50747a(boolean z, @NonNull String str) {
            this.b.bindLong(true, z ? 1 : 0);
            this.b.bindString(2, str);
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$k */
    public static final class C12995k extends C7266c {
        /* renamed from: c */
        private final C8706f<? extends MatchModel> f41570c;

        public C12995k(SQLiteDatabase sQLiteDatabase, C8706f<? extends MatchModel> c8706f) {
            super("`match`", sQLiteDatabase.compileStatement("UPDATE `match`\nSET creation_date = ?, last_activity_date = ?, attribution = ?, is_muted = ?, is_touched = ?, person_id = ?, my_group_id = ?, their_group_id = ?, type = ?\nWHERE id = ?"));
            this.f41570c = c8706f;
        }

        /* renamed from: a */
        public void m50748a(@NonNull DateTime dateTime, @NonNull DateTime dateTime2, @NonNull Attribution attribution, boolean z, boolean z2, @Nullable String str, @Nullable String str2, @Nullable String str3, @NonNull MatchType matchType, @NonNull String str4) {
            this.b.bindLong(1, ((Long) this.f41570c.f30659b.encode(dateTime)).longValue());
            this.b.bindLong(2, ((Long) this.f41570c.f30660c.encode(dateTime2)).longValue());
            this.b.bindString(3, (String) this.f41570c.f30661d.encode(attribution));
            dateTime2 = 0;
            this.b.bindLong(true, z ? 1 : 0);
            dateTime = this.b;
            if (z2) {
                dateTime2 = 1;
            }
            dateTime.bindLong(true, dateTime2);
            if (str == null) {
                this.b.bindNull(6);
            } else {
                this.b.bindString(6, str);
            }
            if (str2 == null) {
                this.b.bindNull(7);
            } else {
                this.b.bindString(7, str2);
            }
            if (str3 == null) {
                this.b.bindNull(8);
            } else {
                this.b.bindString(8, str3);
            }
            this.b.bindString(9, (String) this.f41570c.f30662e.encode(matchType));
            this.b.bindString(10, str4);
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$l */
    public static final class C12996l extends C7266c {
        /* renamed from: c */
        private final C8706f<? extends MatchModel> f41571c;

        public C12996l(SQLiteDatabase sQLiteDatabase, C8706f<? extends MatchModel> c8706f) {
            super("`match`", sQLiteDatabase.compileStatement("UPDATE `match`\nSET is_touched = ?, last_activity_date = ?\nWHERE id = ?"));
            this.f41571c = c8706f;
        }

        /* renamed from: a */
        public void m50749a(boolean z, @NonNull DateTime dateTime, @NonNull String str) {
            this.b.bindLong(true, z ? 1 : 0);
            this.b.bindLong(2, ((Long) this.f41571c.f30660c.encode(dateTime)).longValue());
            this.b.bindString(3, str);
        }
    }

    /* renamed from: com.tinder.data.model.MatchModel$m */
    public static final class C12997m extends C7266c {
        public C12997m(SQLiteDatabase sQLiteDatabase) {
            super("`match`", sQLiteDatabase.compileStatement("UPDATE `match` SET is_touched = ? WHERE id = ?"));
        }

        /* renamed from: a */
        public void m50750a(boolean z, @NonNull String str) {
            this.b.bindLong(true, z ? 1 : 0);
            this.b.bindString(2, str);
        }
    }

    @NonNull
    Attribution attribution();

    @NonNull
    DateTime creation_date();

    @NonNull
    String id();

    boolean is_blocked();

    boolean is_muted();

    boolean is_touched();

    @NonNull
    DateTime last_activity_date();

    @Nullable
    String my_group_id();

    @Nullable
    String person_id();

    @Nullable
    String their_group_id();

    @NonNull
    MatchType type();
}
