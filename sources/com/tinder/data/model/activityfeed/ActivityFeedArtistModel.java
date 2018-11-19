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
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface ActivityFeedArtistModel {

    public interface Creator<T extends ActivityFeedArtistModel> {
        T create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable List<ActivityFeedImage> list);
    }

    public interface Select_activity_feed_artistCreator<T extends Select_activity_feed_artistModel> {
        T create(@NonNull String str, @NonNull String str2, @Nullable List<ActivityFeedImage> list);
    }

    public interface Select_activity_feed_artistModel {
        @NonNull
        String id();

        @Nullable
        List<ActivityFeedImage> images();

        @NonNull
        String name();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedArtistModel$a */
    public static final class C8719a<T extends ActivityFeedArtistModel> {
        /* renamed from: a */
        public final Creator<T> f30690a;
        /* renamed from: b */
        public final ColumnAdapter<List<ActivityFeedImage>, byte[]> f30691b;

        public C8719a(Creator<T> creator, ColumnAdapter<List<ActivityFeedImage>, byte[]> columnAdapter) {
            this.f30690a = creator;
            this.f30691b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37203a(@NonNull String str, @NonNull String str2) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT id, name, images\nFROM activity_feed_artist\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            stringBuilder.append(" AND activity_feed_song_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(2);
            arrayList.add(str2);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("activity_feed_artist"));
        }

        /* renamed from: a */
        public <R extends Select_activity_feed_artistModel> C10869c<R, T> m37204a(Select_activity_feed_artistCreator<R> select_activity_feed_artistCreator) {
            return new C10869c(select_activity_feed_artistCreator, this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedArtistModel$c */
    public static final class C10869c<T extends Select_activity_feed_artistModel, T1 extends ActivityFeedArtistModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_activity_feed_artistCreator<T> f35524a;
        /* renamed from: b */
        private final C8719a<T1> f35525b;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43373a(cursor);
        }

        public C10869c(Select_activity_feed_artistCreator<T> select_activity_feed_artistCreator, C8719a<T1> c8719a) {
            this.f35524a = select_activity_feed_artistCreator;
            this.f35525b = c8719a;
        }

        @NonNull
        /* renamed from: a */
        public T m43373a(@NonNull Cursor cursor) {
            return this.f35524a.create(cursor.getString(0), cursor.getString(1), cursor.isNull(2) ? null : (List) this.f35525b.f30691b.decode(cursor.getBlob(2)));
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedArtistModel$b */
    public static final class C13025b extends C7265b {
        /* renamed from: c */
        private final C8719a<? extends ActivityFeedArtistModel> f41583c;

        public C13025b(SQLiteDatabase sQLiteDatabase, C8719a<? extends ActivityFeedArtistModel> c8719a) {
            super("activity_feed_artist", sQLiteDatabase.compileStatement("INSERT INTO activity_feed_artist (id, activity_feed_item_id, activity_feed_song_id, name, images)\nVALUES (?, ?, ?, ?, ?)"));
            this.f41583c = c8719a;
        }

        /* renamed from: a */
        public void m50777a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable List<ActivityFeedImage> list) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            this.b.bindString(4, str4);
            if (list == null) {
                this.b.bindNull(5);
            } else {
                this.b.bindBlob(5, (byte[]) this.f41583c.f30691b.encode(list));
            }
        }
    }

    @NonNull
    String activity_feed_item_id();

    @NonNull
    String activity_feed_song_id();

    @NonNull
    String id();

    @Nullable
    List<ActivityFeedImage> images();

    @NonNull
    String name();
}
