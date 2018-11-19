package com.tinder.data.model.activityfeed;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.feed.ActivityFeedJob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface ProfileChangeWorkModel {

    public interface Creator<T extends ProfileChangeWorkModel> {
        T create(long j, @NonNull String str, long j2, long j3, @Nullable List<ActivityFeedJob> list);
    }

    public interface Select_profile_change_workCreator<T extends Select_profile_change_workModel> {
        T create(long j, long j2, @Nullable List<ActivityFeedJob> list);
    }

    public interface Select_profile_change_workModel {
        long timestamp();

        long user_number();

        @Nullable
        List<ActivityFeedJob> works();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeWorkModel$a */
    public static final class C8732a<T extends ProfileChangeWorkModel> {
        /* renamed from: a */
        public final Creator<T> f30710a;
        /* renamed from: b */
        public final ColumnAdapter<List<ActivityFeedJob>, byte[]> f30711b;

        public C8732a(Creator<T> creator, ColumnAdapter<List<ActivityFeedJob>, byte[]> columnAdapter) {
            this.f30710a = creator;
            this.f30711b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37229a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_number, timestamp, works\nFROM profile_change_work\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("profile_change_work"));
        }

        /* renamed from: a */
        public <R extends Select_profile_change_workModel> C10882c<R, T> m37230a(Select_profile_change_workCreator<R> select_profile_change_workCreator) {
            return new C10882c(select_profile_change_workCreator, this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeWorkModel$c */
    public static final class C10882c<T extends Select_profile_change_workModel, T1 extends ProfileChangeWorkModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_profile_change_workCreator<T> f35544a;
        /* renamed from: b */
        private final C8732a<T1> f35545b;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43386a(cursor);
        }

        public C10882c(Select_profile_change_workCreator<T> select_profile_change_workCreator, C8732a<T1> c8732a) {
            this.f35544a = select_profile_change_workCreator;
            this.f35545b = c8732a;
        }

        @NonNull
        /* renamed from: a */
        public T m43386a(@NonNull Cursor cursor) {
            Select_profile_change_workCreator select_profile_change_workCreator = this.f35544a;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            if (cursor.isNull(2)) {
                cursor = null;
            } else {
                List list = (List) this.f35545b.f30711b.decode(cursor.getBlob(2));
            }
            return select_profile_change_workCreator.create(j, j2, cursor);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeWorkModel$b */
    public static final class C13039b extends C7265b {
        /* renamed from: c */
        private final C8732a<? extends ProfileChangeWorkModel> f41590c;

        public C13039b(SQLiteDatabase sQLiteDatabase, C8732a<? extends ProfileChangeWorkModel> c8732a) {
            super("profile_change_work", sQLiteDatabase.compileStatement("INSERT INTO profile_change_work (activity_feed_item_id, user_number, timestamp, works)\nVALUES (?, ?, ?, ?)"));
            this.f41590c = c8732a;
        }

        /* renamed from: a */
        public void m50791a(@NonNull String str, long j, long j2, @Nullable List<ActivityFeedJob> list) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
            if (list == null) {
                this.b.bindNull(4);
            } else {
                this.b.bindBlob(4, (byte[]) this.f41590c.f30711b.encode(list));
            }
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    long timestamp();

    long user_number();

    @Nullable
    List<ActivityFeedJob> works();
}
