package com.tinder.data.model;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7264a;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;
import com.squareup.sqldelight.C6124c;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public interface MatchPlaceModel {

    public interface Creator<T extends MatchPlaceModel> {
        T create(@NonNull String str, @NonNull String str2);
    }

    /* renamed from: com.tinder.data.model.MatchPlaceModel$b */
    public static final class C8708b<T extends MatchPlaceModel> {
        /* renamed from: a */
        public final Creator<T> f30670a;

        public C8708b(Creator<T> creator) {
            this.f30670a = creator;
        }

        /* renamed from: a */
        public C6124c m37179a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM place WHERE place.id IN (SELECT place_id FROM match_place WHERE match_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            stringBuilder.append(") LIMIT 1");
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"place", "match_place"}))));
        }
    }

    /* renamed from: com.tinder.data.model.MatchPlaceModel$a */
    public static final class C13000a extends C7264a {
        public C13000a(SQLiteDatabase sQLiteDatabase) {
            super("place", sQLiteDatabase.compileStatement("DELETE FROM place\nWHERE (\n    SELECT COUNT(*)\n    FROM match_place\n    WHERE place_id = place.id\n) = 0"));
        }
    }

    /* renamed from: com.tinder.data.model.MatchPlaceModel$c */
    public static final class C13001c extends C7265b {
        public C13001c(SQLiteDatabase sQLiteDatabase) {
            super("match_place", sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO match_place (match_id, place_id) VALUES (?, ?)"));
        }

        /* renamed from: a */
        public void m50753a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    /* renamed from: com.tinder.data.model.MatchPlaceModel$d */
    public static final class C13002d extends C7266c {
        public C13002d(SQLiteDatabase sQLiteDatabase) {
            super("match_place", sQLiteDatabase.compileStatement("UPDATE match_place SET place_id = ? WHERE match_id = ?"));
        }

        /* renamed from: a */
        public void m50754a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    @NonNull
    String match_id();

    @NonNull
    String place_id();
}
