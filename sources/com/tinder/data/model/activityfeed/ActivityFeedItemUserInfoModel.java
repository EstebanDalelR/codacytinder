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

public interface ActivityFeedItemUserInfoModel {

    public interface Creator<T extends ActivityFeedItemUserInfoModel> {
        T create(long j, @NonNull String str, @NonNull String str2);
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel$a */
    public static final class C8722a<T extends ActivityFeedItemUserInfoModel> {
        /* renamed from: a */
        public final Creator<T> f30695a;

        /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel$a$1 */
        class C108721 implements RowMapper<String> {
            /* renamed from: a */
            final /* synthetic */ C8722a f35529a;

            C108721(C8722a c8722a) {
                this.f35529a = c8722a;
            }

            public /* synthetic */ Object map(Cursor cursor) {
                return m43376a(cursor);
            }

            /* renamed from: a */
            public String m43376a(Cursor cursor) {
                return cursor.getString(0);
            }
        }

        public C8722a(Creator<T> creator) {
            this.f30695a = creator;
        }

        /* renamed from: a */
        public C6124c m37210a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT user_id\nFROM activity_feed_item_user_info\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("activity_feed_item_user_info"));
        }

        /* renamed from: a */
        public RowMapper<String> m37209a() {
            return new C108721(this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel$b */
    public static final class C13029b extends C7265b {
        public C13029b(SQLiteDatabase sQLiteDatabase) {
            super("activity_feed_item_user_info", sQLiteDatabase.compileStatement("INSERT INTO activity_feed_item_user_info (activity_feed_item_id, user_id)\nVALUES (?, ?)"));
        }

        /* renamed from: a */
        public void m50781a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    long _id();

    @NonNull
    String activity_feed_item_id();

    @NonNull
    String user_id();
}
