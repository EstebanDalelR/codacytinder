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
import com.tinder.domain.feed.InstagramMedia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface InstagramNewMediaModel {

    public interface Creator<T extends InstagramNewMediaModel> {
        T create(long j, @NonNull String str, @NonNull String str2, @NonNull String str3, long j2, long j3, long j4, @NonNull String str4, @Nullable List<InstagramMedia> list);
    }

    public interface Select_instagram_new_mediaCreator<T extends Select_instagram_new_mediaModel> {
        T create(@NonNull String str, @NonNull String str2, long j, long j2, long j3, @NonNull String str3, @Nullable List<InstagramMedia> list);
    }

    public interface Select_instagram_new_mediaModel {
        @NonNull
        String caption();

        @NonNull
        String instagram_media_id();

        long instagram_user_id();

        @NonNull
        String instagram_user_name();

        @Nullable
        List<InstagramMedia> media();

        long timestamp();

        long user_number();
    }

    /* renamed from: com.tinder.data.model.activityfeed.InstagramNewMediaModel$a */
    public static final class C8725a<T extends InstagramNewMediaModel> {
        /* renamed from: a */
        public final Creator<T> f30699a;
        /* renamed from: b */
        public final ColumnAdapter<List<InstagramMedia>, byte[]> f30700b;

        public C8725a(Creator<T> creator, ColumnAdapter<List<InstagramMedia>, byte[]> columnAdapter) {
            this.f30699a = creator;
            this.f30700b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37215a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT instagram_media_id, instagram_user_name, user_number, instagram_user_id, timestamp, caption, media\nFROM instagram_new_media\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("instagram_new_media"));
        }

        /* renamed from: a */
        public <R extends Select_instagram_new_mediaModel> C10875c<R, T> m37216a(Select_instagram_new_mediaCreator<R> select_instagram_new_mediaCreator) {
            return new C10875c(select_instagram_new_mediaCreator, this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.InstagramNewMediaModel$c */
    public static final class C10875c<T extends Select_instagram_new_mediaModel, T1 extends InstagramNewMediaModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_instagram_new_mediaCreator<T> f35533a;
        /* renamed from: b */
        private final C8725a<T1> f35534b;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43379a(cursor);
        }

        public C10875c(Select_instagram_new_mediaCreator<T> select_instagram_new_mediaCreator, C8725a<T1> c8725a) {
            this.f35533a = select_instagram_new_mediaCreator;
            this.f35534b = c8725a;
        }

        @NonNull
        /* renamed from: a */
        public T m43379a(@NonNull Cursor cursor) {
            Select_instagram_new_mediaCreator select_instagram_new_mediaCreator = this.f35533a;
            String string = cursor.getString(0);
            String string2 = cursor.getString(1);
            long j = cursor.getLong(2);
            long j2 = cursor.getLong(3);
            long j3 = cursor.getLong(4);
            String string3 = cursor.getString(5);
            if (cursor.isNull(6)) {
                cursor = null;
            } else {
                List list = (List) this.f35534b.f30700b.decode(cursor.getBlob(6));
            }
            return select_instagram_new_mediaCreator.create(string, string2, j, j2, j3, string3, cursor);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.InstagramNewMediaModel$b */
    public static final class C13032b extends C7265b {
        /* renamed from: c */
        private final C8725a<? extends InstagramNewMediaModel> f41586c;

        public C13032b(SQLiteDatabase sQLiteDatabase, C8725a<? extends InstagramNewMediaModel> c8725a) {
            super("instagram_new_media", sQLiteDatabase.compileStatement("INSERT INTO instagram_new_media (\n  activity_feed_item_id,\n  instagram_media_id,\n  instagram_user_name,\n  user_number,\n  instagram_user_id,\n  timestamp,\n  caption,\n  media\n)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)"));
            this.f41586c = c8725a;
        }

        /* renamed from: a */
        public void m50784a(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, long j2, long j3, @NonNull String str4, @Nullable List<InstagramMedia> list) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            this.b.bindLong(4, j);
            this.b.bindLong(5, j2);
            this.b.bindLong(6, j3);
            this.b.bindString(7, str4);
            if (list == null) {
                this.b.bindNull(8);
            } else {
                this.b.bindBlob(8, (byte[]) this.f41586c.f30700b.encode(list));
            }
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    @NonNull
    String caption();

    @NonNull
    String instagram_media_id();

    long instagram_user_id();

    @NonNull
    String instagram_user_name();

    @Nullable
    List<InstagramMedia> media();

    long timestamp();

    long user_number();
}
