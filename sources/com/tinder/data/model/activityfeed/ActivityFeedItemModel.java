package com.tinder.data.model.activityfeed;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqldelight.C6123b.C7264a;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.message.activityfeed.ActivityEventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public interface ActivityFeedItemModel {

    public interface Creator<T extends ActivityFeedItemModel> {
        T create(@NonNull String str, @NonNull String str2, @NonNull ActivityEventType activityEventType, @Nullable String str3);
    }

    public interface Select_activity_feed_item_by_message_idCreator<T extends Select_activity_feed_item_by_message_idModel> {
        T create(@NonNull String str, @NonNull String str2, @NonNull ActivityEventType activityEventType, @Nullable String str3);
    }

    public interface Select_activity_feed_item_by_message_idModel {
        @NonNull
        ActivityEventType activity_event_type();

        @Nullable
        String activity_id();

        @NonNull
        String id();

        @NonNull
        String match_id();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedItemModel$b */
    public static final class C8721b<T extends ActivityFeedItemModel> {
        /* renamed from: a */
        public final Creator<T> f30693a;
        /* renamed from: b */
        public final ColumnAdapter<ActivityEventType, String> f30694b;

        public C8721b(Creator<T> creator, ColumnAdapter<ActivityEventType, String> columnAdapter) {
            this.f30693a = creator;
            this.f30694b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37207a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT id, match_id, activity_event_type, activity_id\nFROM activity_feed_item\nINNER JOIN message_activity_feed_item\nON message_activity_feed_item.activity_feed_item_id = activity_feed_item.id\nWHERE message_activity_feed_item.message_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"activity_feed_item", "message_activity_feed_item"}))));
        }

        /* renamed from: a */
        public <R extends Select_activity_feed_item_by_message_idModel> C10871d<R, T> m37208a(Select_activity_feed_item_by_message_idCreator<R> select_activity_feed_item_by_message_idCreator) {
            return new C10871d(select_activity_feed_item_by_message_idCreator, this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedItemModel$d */
    public static final class C10871d<T extends Select_activity_feed_item_by_message_idModel, T1 extends ActivityFeedItemModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_activity_feed_item_by_message_idCreator<T> f35527a;
        /* renamed from: b */
        private final C8721b<T1> f35528b;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43375a(cursor);
        }

        public C10871d(Select_activity_feed_item_by_message_idCreator<T> select_activity_feed_item_by_message_idCreator, C8721b<T1> c8721b) {
            this.f35527a = select_activity_feed_item_by_message_idCreator;
            this.f35528b = c8721b;
        }

        @NonNull
        /* renamed from: a */
        public T m43375a(@NonNull Cursor cursor) {
            return this.f35527a.create(cursor.getString(0), cursor.getString(1), (ActivityEventType) this.f35528b.f30694b.decode(cursor.getString(2)), cursor.isNull(3) ? null : cursor.getString(3));
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedItemModel$a */
    public static final class C13027a extends C7264a {
        public C13027a(SQLiteDatabase sQLiteDatabase) {
            super("activity_feed_item", sQLiteDatabase.compileStatement("DELETE FROM activity_feed_item WHERE id = ?"));
        }

        /* renamed from: a */
        public void m50779a(@NonNull String str) {
            this.b.bindString(1, str);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedItemModel$c */
    public static final class C13028c extends C7265b {
        /* renamed from: c */
        private final C8721b<? extends ActivityFeedItemModel> f41584c;

        public C13028c(SQLiteDatabase sQLiteDatabase, C8721b<? extends ActivityFeedItemModel> c8721b) {
            super("activity_feed_item", sQLiteDatabase.compileStatement("INSERT INTO activity_feed_item (id, match_id, activity_event_type, activity_id)\nVALUES (?, ?, ?, ?)"));
            this.f41584c = c8721b;
        }

        /* renamed from: a */
        public void m50780a(@NonNull String str, @NonNull String str2, @NonNull ActivityEventType activityEventType, @Nullable String str3) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, (String) this.f41584c.f30694b.encode(activityEventType));
            if (str3 == null) {
                this.b.bindNull(4);
            } else {
                this.b.bindString(4, str3);
            }
        }
    }

    @NonNull
    ActivityEventType activity_event_type();

    @Nullable
    String activity_id();

    @NonNull
    String id();

    @NonNull
    String match_id();
}
