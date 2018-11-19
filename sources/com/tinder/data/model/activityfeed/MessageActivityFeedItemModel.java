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

public interface MessageActivityFeedItemModel {

    public interface Creator<T extends MessageActivityFeedItemModel> {
        T create(@NonNull String str, @NonNull String str2);
    }

    /* renamed from: com.tinder.data.model.activityfeed.MessageActivityFeedItemModel$a */
    public static final class C8726a<T extends MessageActivityFeedItemModel> {
        /* renamed from: a */
        public final Creator<T> f30701a;

        /* renamed from: com.tinder.data.model.activityfeed.MessageActivityFeedItemModel$a$1 */
        class C108761 implements RowMapper<String> {
            /* renamed from: a */
            final /* synthetic */ C8726a f35535a;

            C108761(C8726a c8726a) {
                this.f35535a = c8726a;
            }

            public /* synthetic */ Object map(Cursor cursor) {
                return m43380a(cursor);
            }

            /* renamed from: a */
            public String m43380a(Cursor cursor) {
                return cursor.getString(0);
            }
        }

        public C8726a(Creator<T> creator) {
            this.f30701a = creator;
        }

        /* renamed from: a */
        public C6124c m37218a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT message_id\nFROM message_activity_feed_item\nWHERE activity_feed_item_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("message_activity_feed_item"));
        }

        /* renamed from: a */
        public RowMapper<String> m37217a() {
            return new C108761(this);
        }
    }

    /* renamed from: com.tinder.data.model.activityfeed.MessageActivityFeedItemModel$b */
    public static final class C13033b extends C7265b {
        public C13033b(SQLiteDatabase sQLiteDatabase) {
            super("message_activity_feed_item", sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO message_activity_feed_item (message_id, activity_feed_item_id)\nVALUES (?, ?)"));
        }

        /* renamed from: a */
        public void m50785a(@NonNull String str, @NonNull String str2) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
        }
    }

    @NonNull
    String activity_feed_item_id();

    @NonNull
    String message_id();
}
