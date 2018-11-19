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
import com.tinder.domain.feed.ActivityFeedLoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface ProfileAddLoopModel {

    public interface Creator<T extends ProfileAddLoopModel> {
        T create(long j, @NonNull String str, long j2, long j3, @Nullable List<ActivityFeedLoop> list);
    }

    public interface Select_profile_add_loopCreator<T extends Select_profile_add_loopModel> {
        T create(long j, long j2, @Nullable List<ActivityFeedLoop> list);
    }

    public interface Select_profile_add_loopModel {
        @Nullable
        List<ActivityFeedLoop> loops();

        long timestamp();

        long user_number();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileAddLoopModel$a */
    public static final class C8727a<T extends ProfileAddLoopModel> {
        /* renamed from: a */
        public final Creator<T> f30702a;
        /* renamed from: b */
        public final ColumnAdapter<List<ActivityFeedLoop>, byte[]> f30703b;

        public C8727a(Creator<T> creator, ColumnAdapter<List<ActivityFeedLoop>, byte[]> columnAdapter) {
            this.f30702a = creator;
            this.f30703b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37219a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_number, timestamp, loops\nFROM profile_add_loop\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("profile_add_loop"));
        }

        /* renamed from: a */
        public <R extends Select_profile_add_loopModel> C10877c<R, T> m37220a(Select_profile_add_loopCreator<R> select_profile_add_loopCreator) {
            return new C10877c(select_profile_add_loopCreator, this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileAddLoopModel$c */
    public static final class C10877c<T extends Select_profile_add_loopModel, T1 extends ProfileAddLoopModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_profile_add_loopCreator<T> f35536a;
        /* renamed from: b */
        private final C8727a<T1> f35537b;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43381a(cursor);
        }

        public C10877c(Select_profile_add_loopCreator<T> select_profile_add_loopCreator, C8727a<T1> c8727a) {
            this.f35536a = select_profile_add_loopCreator;
            this.f35537b = c8727a;
        }

        @NonNull
        /* renamed from: a */
        public T m43381a(@NonNull Cursor cursor) {
            Select_profile_add_loopCreator select_profile_add_loopCreator = this.f35536a;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            if (cursor.isNull(2)) {
                cursor = null;
            } else {
                List list = (List) this.f35537b.f30703b.decode(cursor.getBlob(2));
            }
            return select_profile_add_loopCreator.create(j, j2, cursor);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileAddLoopModel$b */
    public static final class C13034b extends C7265b {
        /* renamed from: c */
        private final C8727a<? extends ProfileAddLoopModel> f41587c;

        public C13034b(SQLiteDatabase sQLiteDatabase, C8727a<? extends ProfileAddLoopModel> c8727a) {
            super("profile_add_loop", sQLiteDatabase.compileStatement("INSERT INTO profile_add_loop (activity_feed_item_id, user_number, timestamp, loops)\nVALUES (?, ?, ?, ?)"));
            this.f41587c = c8727a;
        }

        /* renamed from: a */
        public void m50786a(@NonNull String str, long j, long j2, @Nullable List<ActivityFeedLoop> list) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
            if (list == null) {
                this.b.bindNull(4);
            } else {
                this.b.bindBlob(4, (byte[]) this.f41587c.f30703b.encode(list));
            }
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    @Nullable
    List<ActivityFeedLoop> loops();

    long timestamp();

    long user_number();
}
