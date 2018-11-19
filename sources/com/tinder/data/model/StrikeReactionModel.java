package com.tinder.data.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface StrikeReactionModel {

    public interface Creator<T extends StrikeReactionModel> {
        T create(@NonNull String str, @NonNull String str2);
    }

    /* renamed from: com.tinder.data.model.StrikeReactionModel$a */
    public static final class C8714a<T extends StrikeReactionModel> {
        /* renamed from: a */
        public final Creator<T> f30681a;

        public C8714a(Creator<T> creator) {
            this.f30681a = creator;
        }

        /* renamed from: a */
        public C6124c m37194a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM strike_reaction WHERE match_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("strike_reaction"));
        }
    }

    /* renamed from: com.tinder.data.model.StrikeReactionModel$c */
    public static final class C10864c<T extends StrikeReactionModel> implements RowMapper<T> {
        /* renamed from: a */
        private final C8714a<T> f35518a;

        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43368a(cursor);
        }

        public C10864c(C8714a<T> c8714a) {
            this.f35518a = c8714a;
        }

        /* renamed from: a */
        public T m43368a(@NonNull Cursor cursor) {
            return this.f35518a.f30681a.create(cursor.getString(0), cursor.getString(1));
        }
    }

    /* renamed from: com.tinder.data.model.StrikeReactionModel$b */
    public static final class C13017b extends C7265b {
        public C13017b(SQLiteDatabase sQLiteDatabase) {
            super("strike_reaction", sQLiteDatabase.compileStatement("INSERT INTO strike_reaction(match_id, strike_id)\nVALUES (?, ?)"));
        }

        /* renamed from: a */
        public void m50769a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    /* renamed from: com.tinder.data.model.StrikeReactionModel$d */
    public static final class C13018d extends C7266c {
        public C13018d(SQLiteDatabase sQLiteDatabase) {
            super("strike_reaction", sQLiteDatabase.compileStatement("UPDATE strike_reaction\nSET strike_id = ?\nWHERE match_id = ?"));
        }

        /* renamed from: a */
        public void m50770a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    @NonNull
    String match_id();

    @NonNull
    String strike_id();
}
