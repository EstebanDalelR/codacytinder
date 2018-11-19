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

public interface ProfileChangeAnthemModel {

    public interface Creator<T extends ProfileChangeAnthemModel> {
        T create(long j, @NonNull String str, long j2, long j3);
    }

    public interface Select_profile_change_anthemCreator<T extends Select_profile_change_anthemModel> {
        T create(long j, long j2);
    }

    public interface Select_profile_change_anthemModel {
        long timestamp();

        long user_number();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeAnthemModel$a */
    public static final class C8729a<T extends ProfileChangeAnthemModel> {
        /* renamed from: a */
        public final Creator<T> f30706a;

        public C8729a(Creator<T> creator) {
            this.f30706a = creator;
        }

        /* renamed from: a */
        public C6124c m37223a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_number, timestamp\nFROM profile_change_anthem\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("profile_change_anthem"));
        }

        /* renamed from: a */
        public <R extends Select_profile_change_anthemModel> C10879c<R> m37224a(Select_profile_change_anthemCreator<R> select_profile_change_anthemCreator) {
            return new C10879c(select_profile_change_anthemCreator);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeAnthemModel$c */
    public static final class C10879c<T extends Select_profile_change_anthemModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_profile_change_anthemCreator<T> f35540a;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43383a(cursor);
        }

        public C10879c(Select_profile_change_anthemCreator<T> select_profile_change_anthemCreator) {
            this.f35540a = select_profile_change_anthemCreator;
        }

        @NonNull
        /* renamed from: a */
        public T m43383a(@NonNull Cursor cursor) {
            return this.f35540a.create(cursor.getLong(0), cursor.getLong(1));
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeAnthemModel$b */
    public static final class C13036b extends C7265b {
        public C13036b(SQLiteDatabase sQLiteDatabase) {
            super("profile_change_anthem", sQLiteDatabase.compileStatement("INSERT INTO profile_change_anthem (activity_feed_item_id, user_number, timestamp)\nVALUES (?, ?, ?)"));
        }

        /* renamed from: a */
        public void m50788a(@NonNull String str, long j, long j2) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    long timestamp();

    long user_number();
}
