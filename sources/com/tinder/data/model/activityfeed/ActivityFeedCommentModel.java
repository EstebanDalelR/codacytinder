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

public interface ActivityFeedCommentModel {

    public interface Creator<T extends ActivityFeedCommentModel> {
        T create(long j, @NonNull String str, long j2, @NonNull String str2, @NonNull String str3);
    }

    public interface Select_activity_feed_item_commentsCreator<T extends Select_activity_feed_item_commentsModel> {
        T create(@NonNull String str, long j, @NonNull String str2, @NonNull String str3);
    }

    public interface Select_activity_feed_item_commentsModel {
        @NonNull
        String activity_feed_item_id();

        long created_at();

        @NonNull
        String message();

        @NonNull
        String metadata_carousel_item_id();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedCommentModel$a */
    public static final class C8720a<T extends ActivityFeedCommentModel> {
        /* renamed from: a */
        public final Creator<T> f30692a;

        public C8720a(Creator<T> creator) {
            this.f30692a = creator;
        }

        /* renamed from: a */
        public C6124c m37205a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT activity_feed_item_id, created_at, message, metadata_carousel_item_id\nFROM activity_feed_comment\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("activity_feed_comment"));
        }

        /* renamed from: a */
        public <R extends Select_activity_feed_item_commentsModel> C10870c<R> m37206a(Select_activity_feed_item_commentsCreator<R> select_activity_feed_item_commentsCreator) {
            return new C10870c(select_activity_feed_item_commentsCreator);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedCommentModel$c */
    public static final class C10870c<T extends Select_activity_feed_item_commentsModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_activity_feed_item_commentsCreator<T> f35526a;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43374a(cursor);
        }

        public C10870c(Select_activity_feed_item_commentsCreator<T> select_activity_feed_item_commentsCreator) {
            this.f35526a = select_activity_feed_item_commentsCreator;
        }

        @NonNull
        /* renamed from: a */
        public T m43374a(@NonNull Cursor cursor) {
            return this.f35526a.create(cursor.getString(0), cursor.getLong(1), cursor.getString(2), cursor.getString(3));
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedCommentModel$b */
    public static final class C13026b extends C7265b {
        public C13026b(SQLiteDatabase sQLiteDatabase) {
            super("activity_feed_comment", sQLiteDatabase.compileStatement("INSERT INTO activity_feed_comment (activity_feed_item_id, created_at, message, metadata_carousel_item_id)\nVALUES (?, ?, ?, ?)"));
        }

        /* renamed from: a */
        public void m50778a(@NonNull String str, long j, @NonNull String str2, @NonNull String str3) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindString(3, str2);
            this.b.bindString(4, str3);
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    long created_at();

    @NonNull
    String message();

    @NonNull
    String metadata_carousel_item_id();
}
