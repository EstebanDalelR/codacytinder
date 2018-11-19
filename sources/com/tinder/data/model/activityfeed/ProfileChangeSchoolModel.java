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
import com.tinder.domain.feed.ActivityFeedSchool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface ProfileChangeSchoolModel {

    public interface Creator<T extends ProfileChangeSchoolModel> {
        T create(long j, @NonNull String str, long j2, long j3, @Nullable List<ActivityFeedSchool> list);
    }

    public interface Select_profile_change_schoolCreator<T extends Select_profile_change_schoolModel> {
        T create(long j, long j2, @Nullable List<ActivityFeedSchool> list);
    }

    public interface Select_profile_change_schoolModel {
        @Nullable
        List<ActivityFeedSchool> schools();

        long timestamp();

        long user_number();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeSchoolModel$a */
    public static final class C8731a<T extends ProfileChangeSchoolModel> {
        /* renamed from: a */
        public final Creator<T> f30708a;
        /* renamed from: b */
        public final ColumnAdapter<List<ActivityFeedSchool>, byte[]> f30709b;

        public C8731a(Creator<T> creator, ColumnAdapter<List<ActivityFeedSchool>, byte[]> columnAdapter) {
            this.f30708a = creator;
            this.f30709b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37227a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_number, timestamp, schools\nFROM profile_change_school\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("profile_change_school"));
        }

        /* renamed from: a */
        public <R extends Select_profile_change_schoolModel> C10881c<R, T> m37228a(Select_profile_change_schoolCreator<R> select_profile_change_schoolCreator) {
            return new C10881c(select_profile_change_schoolCreator, this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeSchoolModel$c */
    public static final class C10881c<T extends Select_profile_change_schoolModel, T1 extends ProfileChangeSchoolModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_profile_change_schoolCreator<T> f35542a;
        /* renamed from: b */
        private final C8731a<T1> f35543b;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43385a(cursor);
        }

        public C10881c(Select_profile_change_schoolCreator<T> select_profile_change_schoolCreator, C8731a<T1> c8731a) {
            this.f35542a = select_profile_change_schoolCreator;
            this.f35543b = c8731a;
        }

        @NonNull
        /* renamed from: a */
        public T m43385a(@NonNull Cursor cursor) {
            Select_profile_change_schoolCreator select_profile_change_schoolCreator = this.f35542a;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            if (cursor.isNull(2)) {
                cursor = null;
            } else {
                List list = (List) this.f35543b.f30709b.decode(cursor.getBlob(2));
            }
            return select_profile_change_schoolCreator.create(j, j2, cursor);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileChangeSchoolModel$b */
    public static final class C13038b extends C7265b {
        /* renamed from: c */
        private final C8731a<? extends ProfileChangeSchoolModel> f41589c;

        public C13038b(SQLiteDatabase sQLiteDatabase, C8731a<? extends ProfileChangeSchoolModel> c8731a) {
            super("profile_change_school", sQLiteDatabase.compileStatement("INSERT INTO profile_change_school (activity_feed_item_id, user_number, timestamp, schools)\nVALUES (?, ?, ?, ?)"));
            this.f41589c = c8731a;
        }

        /* renamed from: a */
        public void m50790a(@NonNull String str, long j, long j2, @Nullable List<ActivityFeedSchool> list) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
            if (list == null) {
                this.b.bindNull(4);
            } else {
                this.b.bindBlob(4, (byte[]) this.f41589c.f30709b.encode(list));
            }
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    @Nullable
    List<ActivityFeedSchool> schools();

    long timestamp();

    long user_number();
}
