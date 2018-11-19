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
import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface InstagramConnectModel {

    public interface Creator<T extends InstagramConnectModel> {
        T create(long j, @NonNull String str, long j2, long j3, @NonNull String str2, @Nullable List<ActivityFeedPhoto> list);
    }

    public interface Select_instagram_connectCreator<T extends Select_instagram_connectModel> {
        T create(long j, long j2, @NonNull String str, @Nullable List<ActivityFeedPhoto> list);
    }

    public interface Select_instagram_connectModel {
        @NonNull
        String instagram_user_name();

        @Nullable
        List<ActivityFeedPhoto> photos();

        long timestamp();

        long user_number();
    }

    /* renamed from: com.tinder.data.model.activityfeed.InstagramConnectModel$a */
    public static final class C8724a<T extends InstagramConnectModel> {
        /* renamed from: a */
        public final Creator<T> f30697a;
        /* renamed from: b */
        public final ColumnAdapter<List<ActivityFeedPhoto>, byte[]> f30698b;

        public C8724a(Creator<T> creator, ColumnAdapter<List<ActivityFeedPhoto>, byte[]> columnAdapter) {
            this.f30697a = creator;
            this.f30698b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37213a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_number, timestamp, instagram_user_name, photos\nFROM instagram_connect\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("instagram_connect"));
        }

        /* renamed from: a */
        public <R extends Select_instagram_connectModel> C10874c<R, T> m37214a(Select_instagram_connectCreator<R> select_instagram_connectCreator) {
            return new C10874c(select_instagram_connectCreator, this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.InstagramConnectModel$c */
    public static final class C10874c<T extends Select_instagram_connectModel, T1 extends InstagramConnectModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_instagram_connectCreator<T> f35531a;
        /* renamed from: b */
        private final C8724a<T1> f35532b;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43378a(cursor);
        }

        public C10874c(Select_instagram_connectCreator<T> select_instagram_connectCreator, C8724a<T1> c8724a) {
            this.f35531a = select_instagram_connectCreator;
            this.f35532b = c8724a;
        }

        @NonNull
        /* renamed from: a */
        public T m43378a(@NonNull Cursor cursor) {
            Select_instagram_connectCreator select_instagram_connectCreator = this.f35531a;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            String string = cursor.getString(2);
            if (cursor.isNull(3)) {
                cursor = null;
            } else {
                List list = (List) this.f35532b.f30698b.decode(cursor.getBlob(3));
            }
            return select_instagram_connectCreator.create(j, j2, string, cursor);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.InstagramConnectModel$b */
    public static final class C13031b extends C7265b {
        /* renamed from: c */
        private final C8724a<? extends InstagramConnectModel> f41585c;

        public C13031b(SQLiteDatabase sQLiteDatabase, C8724a<? extends InstagramConnectModel> c8724a) {
            super("instagram_connect", sQLiteDatabase.compileStatement("INSERT INTO instagram_connect (activity_feed_item_id, user_number, timestamp, instagram_user_name, photos)\nVALUES (?, ?, ?, ?, ?)"));
            this.f41585c = c8724a;
        }

        /* renamed from: a */
        public void m50783a(@NonNull String str, long j, long j2, @NonNull String str2, @Nullable List<ActivityFeedPhoto> list) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
            this.b.bindString(4, str2);
            if (list == null) {
                this.b.bindNull(5);
            } else {
                this.b.bindBlob(5, (byte[]) this.f41585c.f30698b.encode(list));
            }
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    @NonNull
    String instagram_user_name();

    @Nullable
    List<ActivityFeedPhoto> photos();

    long timestamp();

    long user_number();
}
