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

public interface ProfileAddPhotoModel {

    public interface Creator<T extends ProfileAddPhotoModel> {
        T create(long j, @NonNull String str, long j2, long j3, @Nullable List<ActivityFeedPhoto> list);
    }

    public interface Select_profile_add_photoCreator<T extends Select_profile_add_photoModel> {
        T create(long j, long j2, @Nullable List<ActivityFeedPhoto> list);
    }

    public interface Select_profile_add_photoModel {
        @Nullable
        List<ActivityFeedPhoto> photos();

        long timestamp();

        long user_number();
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileAddPhotoModel$a */
    public static final class C8728a<T extends ProfileAddPhotoModel> {
        /* renamed from: a */
        public final Creator<T> f30704a;
        /* renamed from: b */
        public final ColumnAdapter<List<ActivityFeedPhoto>, byte[]> f30705b;

        public C8728a(Creator<T> creator, ColumnAdapter<List<ActivityFeedPhoto>, byte[]> columnAdapter) {
            this.f30704a = creator;
            this.f30705b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m37221a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_number, timestamp, photos\nFROM profile_add_photo\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("profile_add_photo"));
        }

        /* renamed from: a */
        public <R extends Select_profile_add_photoModel> C10878c<R, T> m37222a(Select_profile_add_photoCreator<R> select_profile_add_photoCreator) {
            return new C10878c(select_profile_add_photoCreator, this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileAddPhotoModel$c */
    public static final class C10878c<T extends Select_profile_add_photoModel, T1 extends ProfileAddPhotoModel> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_profile_add_photoCreator<T> f35538a;
        /* renamed from: b */
        private final C8728a<T1> f35539b;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43382a(cursor);
        }

        public C10878c(Select_profile_add_photoCreator<T> select_profile_add_photoCreator, C8728a<T1> c8728a) {
            this.f35538a = select_profile_add_photoCreator;
            this.f35539b = c8728a;
        }

        @NonNull
        /* renamed from: a */
        public T m43382a(@NonNull Cursor cursor) {
            Select_profile_add_photoCreator select_profile_add_photoCreator = this.f35538a;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            if (cursor.isNull(2)) {
                cursor = null;
            } else {
                List list = (List) this.f35539b.f30705b.decode(cursor.getBlob(2));
            }
            return select_profile_add_photoCreator.create(j, j2, cursor);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ProfileAddPhotoModel$b */
    public static final class C13035b extends C7265b {
        /* renamed from: c */
        private final C8728a<? extends ProfileAddPhotoModel> f41588c;

        public C13035b(SQLiteDatabase sQLiteDatabase, C8728a<? extends ProfileAddPhotoModel> c8728a) {
            super("profile_add_photo", sQLiteDatabase.compileStatement("INSERT INTO profile_add_photo (activity_feed_item_id, user_number, timestamp, photos)\nVALUES (?, ?, ?, ?)"));
            this.f41588c = c8728a;
        }

        /* renamed from: a */
        public void m50787a(@NonNull String str, long j, long j2, @Nullable List<ActivityFeedPhoto> list) {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
            if (list == null) {
                this.b.bindNull(4);
            } else {
                this.b.bindBlob(4, (byte[]) this.f41588c.f30705b.encode(list));
            }
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    @Nullable
    List<ActivityFeedPhoto> photos();

    long timestamp();

    long user_number();
}
