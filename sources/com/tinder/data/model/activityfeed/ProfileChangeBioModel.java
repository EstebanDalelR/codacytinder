package com.tinder.data.model.activityfeed;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface ProfileChangeBioModel {

    public interface Creator<T extends ProfileChangeBioModel> {
        T create(long j, @NonNull String str, long j2, long j3, @NonNull String str2, @NonNull String str3);
    }

    public interface Select_profile_change_bioCreator<T extends Select_profile_change_bioModel> {
        T create(long j, long j2, @NonNull String str, @NonNull String str2);
    }

    public interface Select_profile_change_bioModel {
        @NonNull
        String bio();

        @NonNull
        String old_bio();

        long timestamp();

        long user_number();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeBioModel$a */
    public static final class C8730a<T extends ProfileChangeBioModel> {
        /* renamed from: a */
        public final Creator<T> f30707a;

        public C8730a(Creator<T> creator) {
            this.f30707a = creator;
        }

        /* renamed from: a */
        public C6124c m37225a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_number, timestamp, bio, old_bio\nFROM profile_change_bio\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("profile_change_bio"));
        }

        /* renamed from: a */
        public <R extends Select_profile_change_bioModel> C10880c<R> m37226a(Select_profile_change_bioCreator<R> select_profile_change_bioCreator) {
            return new C10880c(select_profile_change_bioCreator);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeBioModel$c */
    public static final class C10880c<T extends Select_profile_change_bioModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_profile_change_bioCreator<T> f35541a;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43384a(cursor);
        }

        public C10880c(Select_profile_change_bioCreator<T> select_profile_change_bioCreator) {
            this.f35541a = select_profile_change_bioCreator;
        }

        @NonNull
        /* renamed from: a */
        public T m43384a(@NonNull Cursor cursor) {
            return this.f35541a.create(cursor.getLong(0), cursor.getLong(1), cursor.getString(2), cursor.getString(3));
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeBioModel$b */
    public static final class C13037b extends C7265b {
        public C13037b(SQLiteDatabase sQLiteDatabase) {
            super("profile_change_bio", sQLiteDatabase.compileStatement("INSERT INTO profile_change_bio (activity_feed_item_id, user_number, timestamp, bio, old_bio)\nVALUES (?, ?, ?, ?, ?)"));
        }

        /* renamed from: a */
        public void m50789a(@NonNull String str, long j, long j2, @NonNull String str2, @NonNull String str3) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
            this.b.bindString(4, str2);
            this.b.bindString(5, str3);
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    @NonNull
    String bio();

    @NonNull
    String old_bio();

    long timestamp();

    long user_number();
}
