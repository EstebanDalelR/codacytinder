package com.tinder.data.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqldelight.C6123b.C7264a;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6123b.C7266c;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.message.MessageType;
import com.tinder.data.model.GifModel.C8703a;
import com.tinder.data.model.ReactionModel.C8712a;
import com.tinder.domain.message.DeliveryStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.joda.time.DateTime;

public interface MessageModel {

    public interface Creator<T extends MessageModel> {
        T create(long j, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull DateTime dateTime, boolean z, @NonNull MessageType messageType, @NonNull DeliveryStatus deliveryStatus, boolean z2);
    }

    public interface Message_viewCreator<T1 extends MessageModel, T2 extends GifModel, T3 extends ReactionModel, T extends Message_viewModel<T1, T2, T3>> {
        T create(@NonNull T1 t1, @Nullable T2 t2, @Nullable T3 t3);
    }

    public interface Message_viewModel<T1 extends MessageModel, T2 extends GifModel, T3 extends ReactionModel> {
        @Nullable
        T2 gif();

        @NonNull
        T1 message();

        @Nullable
        T3 reaction();
    }

    public interface Select_latest_message_by_matchCreator<V1T1 extends MessageModel, V1T2 extends GifModel, V1T3 extends ReactionModel, V1 extends Message_viewModel<V1T1, V1T2, V1T3>, T extends Select_latest_message_by_matchModel<V1T1, V1T2, V1T3, V1>> {
        T create(@NonNull V1 v1, long j);
    }

    public interface Select_latest_message_by_matchModel<V1T1 extends MessageModel, V1T2 extends GifModel, V1T3 extends ReactionModel, V1 extends Message_viewModel<V1T1, V1T2, V1T3>> {
        long MAX_sent_date();

        @NonNull
        V1 message_view();
    }

    /* renamed from: com.tinder.data.model.MessageModel$b */
    public static final class C8710b<T extends MessageModel> {
        /* renamed from: a */
        public final Creator<T> f30672a;
        /* renamed from: b */
        public final ColumnAdapter<DateTime, Long> f30673b;
        /* renamed from: c */
        public final ColumnAdapter<MessageType, String> f30674c;
        /* renamed from: d */
        public final ColumnAdapter<DeliveryStatus, String> f30675d;

        /* renamed from: com.tinder.data.model.MessageModel$b$1 */
        class C108581 implements RowMapper<DateTime> {
            /* renamed from: a */
            final /* synthetic */ C8710b f35505a;

            C108581(C8710b c8710b) {
                this.f35505a = c8710b;
            }

            public /* synthetic */ Object map(Cursor cursor) {
                return m43362a(cursor);
            }

            /* renamed from: a */
            public DateTime m43362a(Cursor cursor) {
                return (DateTime) this.f35505a.f30673b.decode(Long.valueOf(cursor.getLong(0)));
            }
        }

        /* renamed from: com.tinder.data.model.MessageModel$b$2 */
        class C108592 implements RowMapper<Long> {
            /* renamed from: a */
            final /* synthetic */ C8710b f35506a;

            C108592(C8710b c8710b) {
                this.f35506a = c8710b;
            }

            public /* synthetic */ Object map(Cursor cursor) {
                return m43363a(cursor);
            }

            /* renamed from: a */
            public Long m43363a(Cursor cursor) {
                return Long.valueOf(cursor.getLong(0));
            }
        }

        /* renamed from: com.tinder.data.model.MessageModel$b$3 */
        class C108603 implements RowMapper<Long> {
            /* renamed from: a */
            final /* synthetic */ C8710b f35507a;

            C108603(C8710b c8710b) {
                this.f35507a = c8710b;
            }

            public /* synthetic */ Object map(Cursor cursor) {
                return m43364a(cursor);
            }

            /* renamed from: a */
            public Long m43364a(Cursor cursor) {
                return Long.valueOf(cursor.getLong(0));
            }
        }

        public C8710b(Creator<T> creator, ColumnAdapter<DateTime, Long> columnAdapter, ColumnAdapter<MessageType, String> columnAdapter2, ColumnAdapter<DeliveryStatus, String> columnAdapter3) {
            this.f30672a = creator;
            this.f30673b = columnAdapter;
            this.f30674c = columnAdapter2;
            this.f30675d = columnAdapter3;
        }

        /* renamed from: a */
        public C6124c m37182a() {
            return new C6124c("SELECT *, MAX(sent_date) FROM message_view GROUP BY match_id", new String[0], Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"message", "gif", "reaction"}))));
        }

        /* renamed from: a */
        public C6124c m37183a(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM message_view\nWHERE match_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            stringBuilder.append("\nORDER BY sent_date DESC");
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"message", "gif", "reaction"}))));
        }

        /* renamed from: a */
        public C6124c m37185a(@NonNull String str, @NonNull DateTime dateTime) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM message_view\nWHERE match_id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            stringBuilder.append(" AND sent_date >= ");
            stringBuilder.append(this.f30673b.encode(dateTime));
            stringBuilder.append("\nORDER BY sent_date DESC");
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"message", "gif", "reaction"}))));
        }

        /* renamed from: a */
        public C6124c m37184a(@NonNull String str, long j) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT sent_date\nFROM (\n    SELECT sent_date FROM message_view\n    WHERE match_id=");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            stringBuilder.append(" ORDER BY sent_date DESC LIMIT ");
            stringBuilder.append(j);
            stringBuilder.append("\n)\nORDER BY sent_date ASC LIMIT 1");
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"message", "gif", "reaction"}))));
        }

        /* renamed from: b */
        public C6124c m37190b(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT * FROM message_view WHERE id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"message", "gif", "reaction"}))));
        }

        /* renamed from: a */
        public C6124c m37186a(@NonNull DateTime dateTime) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT COUNT (DISTINCT match_id) AS count\nFROM message WHERE sent_date > ");
            stringBuilder.append(this.f30673b.encode(dateTime));
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("message"));
        }

        /* renamed from: c */
        public C6124c m37192c(@NonNull String str) {
            List arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT COUNT(*) from message\nWHERE id = ");
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
            stringBuilder.append(1);
            arrayList.add(str);
            return new C6124c(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), Collections.singleton("message"));
        }

        /* renamed from: a */
        public <V1T2 extends GifModel, V1T3 extends ReactionModel, V1 extends Message_viewModel<T, V1T2, V1T3>, R extends Select_latest_message_by_matchModel<T, V1T2, V1T3, V1>> C10862g<T, V1T2, V1T3, V1, R> m37188a(Select_latest_message_by_matchCreator<T, V1T2, V1T3, V1, R> select_latest_message_by_matchCreator, C8703a<V1T2> c8703a, C8712a<V1T3> c8712a, Message_viewCreator<T, V1T2, V1T3, V1> message_viewCreator) {
            return new C10862g(select_latest_message_by_matchCreator, this, c8703a, c8712a, message_viewCreator);
        }

        /* renamed from: a */
        public <T2 extends GifModel, T3 extends ReactionModel, R extends Message_viewModel<T, T2, T3>> C10861f<T, T2, T3, R> m37187a(Message_viewCreator<T, T2, T3, R> message_viewCreator, C8703a<T2> c8703a, C8712a<T3> c8712a) {
            return new C10861f(message_viewCreator, this, c8703a, c8712a);
        }

        /* renamed from: b */
        public RowMapper<DateTime> m37189b() {
            return new C108581(this);
        }

        /* renamed from: c */
        public RowMapper<Long> m37191c() {
            return new C108592(this);
        }

        /* renamed from: d */
        public RowMapper<Long> m37193d() {
            return new C108603(this);
        }
    }

    /* renamed from: com.tinder.data.model.MessageModel$f */
    public static final class C10861f<T1 extends MessageModel, T2 extends GifModel, T3 extends ReactionModel, T extends Message_viewModel<T1, T2, T3>> implements RowMapper<T> {
        /* renamed from: a */
        private final Message_viewCreator<T1, T2, T3, T> f35508a;
        /* renamed from: b */
        private final C8710b<T1> f35509b;
        /* renamed from: c */
        private final C8703a<T2> f35510c;
        /* renamed from: d */
        private final C8712a<T3> f35511d;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43365a(cursor);
        }

        public C10861f(Message_viewCreator<T1, T2, T3, T> message_viewCreator, C8710b<T1> c8710b, C8703a<T2> c8703a, C8712a<T3> c8712a) {
            this.f35508a = message_viewCreator;
            this.f35509b = c8710b;
            this.f35510c = c8703a;
            this.f35511d = c8712a;
        }

        @NonNull
        /* renamed from: a */
        public T m43365a(@NonNull Cursor cursor) {
            GifModel gifModel;
            Cursor cursor2 = cursor;
            Message_viewCreator message_viewCreator = this.f35508a;
            MessageModel create = this.f35509b.f30672a.create(cursor2.getLong(0), cursor2.getString(1), cursor2.getString(2), cursor2.getString(3), cursor2.getString(4), cursor2.getString(5), (DateTime) this.f35509b.f30673b.decode(Long.valueOf(cursor2.getLong(6))), cursor2.getInt(7) == 1, (MessageType) r0.f35509b.f30674c.decode(cursor2.getString(8)), (DeliveryStatus) r0.f35509b.f30675d.decode(cursor2.getString(9)), cursor2.getInt(10) == 1);
            ReactionModel reactionModel = null;
            if (cursor2.isNull(11)) {
                gifModel = null;
            } else {
                gifModel = r0.f35510c.f30655a.create(cursor2.getLong(11), cursor2.getString(12), cursor2.getString(13), cursor2.getString(14), cursor2.getLong(15), cursor2.getLong(16), cursor2.getString(17), cursor2.getLong(18), cursor2.getLong(19));
            }
            if (!cursor2.isNull(20)) {
                reactionModel = r0.f35511d.f30677a.create(cursor2.getLong(20), cursor2.getString(21), cursor2.getString(22));
            }
            return message_viewCreator.create(create, gifModel, reactionModel);
        }
    }

    /* renamed from: com.tinder.data.model.MessageModel$g */
    public static final class C10862g<V1T1 extends MessageModel, V1T2 extends GifModel, V1T3 extends ReactionModel, V1 extends Message_viewModel<V1T1, V1T2, V1T3>, T extends Select_latest_message_by_matchModel<V1T1, V1T2, V1T3, V1>> implements RowMapper<T> {
        /* renamed from: a */
        private final Select_latest_message_by_matchCreator<V1T1, V1T2, V1T3, V1, T> f35512a;
        /* renamed from: b */
        private final C8710b<V1T1> f35513b;
        /* renamed from: c */
        private final C8703a<V1T2> f35514c;
        /* renamed from: d */
        private final C8712a<V1T3> f35515d;
        /* renamed from: e */
        private final Message_viewCreator<V1T1, V1T2, V1T3, V1> f35516e;

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m43366a(cursor);
        }

        public C10862g(Select_latest_message_by_matchCreator<V1T1, V1T2, V1T3, V1, T> select_latest_message_by_matchCreator, C8710b<V1T1> c8710b, C8703a<V1T2> c8703a, C8712a<V1T3> c8712a, Message_viewCreator<V1T1, V1T2, V1T3, V1> message_viewCreator) {
            this.f35512a = select_latest_message_by_matchCreator;
            this.f35513b = c8710b;
            this.f35514c = c8703a;
            this.f35515d = c8712a;
            this.f35516e = message_viewCreator;
        }

        @NonNull
        /* renamed from: a */
        public T m43366a(@NonNull Cursor cursor) {
            GifModel gifModel;
            Cursor cursor2 = cursor;
            Select_latest_message_by_matchCreator select_latest_message_by_matchCreator = this.f35512a;
            Message_viewCreator message_viewCreator = this.f35516e;
            MessageModel create = this.f35513b.f30672a.create(cursor2.getLong(0), cursor2.getString(1), cursor2.getString(2), cursor2.getString(3), cursor2.getString(4), cursor2.getString(5), (DateTime) this.f35513b.f30673b.decode(Long.valueOf(cursor2.getLong(6))), cursor2.getInt(7) == 1, (MessageType) r0.f35513b.f30674c.decode(cursor2.getString(8)), (DeliveryStatus) r0.f35513b.f30675d.decode(cursor2.getString(9)), cursor2.getInt(10) == 1);
            ReactionModel reactionModel = null;
            if (cursor2.isNull(11)) {
                gifModel = null;
            } else {
                gifModel = r0.f35514c.f30655a.create(cursor2.getLong(11), cursor2.getString(12), cursor2.getString(13), cursor2.getString(14), cursor2.getLong(15), cursor2.getLong(16), cursor2.getString(17), cursor2.getLong(18), cursor2.getLong(19));
            }
            if (!cursor2.isNull(20)) {
                reactionModel = r0.f35515d.f30677a.create(cursor2.getLong(20), cursor2.getString(21), cursor2.getString(22));
            }
            return select_latest_message_by_matchCreator.create(message_viewCreator.create(create, gifModel, reactionModel), cursor2.getLong(23));
        }
    }

    /* renamed from: com.tinder.data.model.MessageModel$a */
    public static final class C13005a extends C7264a {
        public C13005a(SQLiteDatabase sQLiteDatabase) {
            super("message", sQLiteDatabase.compileStatement("DELETE FROM message WHERE id = ?"));
        }

        /* renamed from: a */
        public void m50757a(@NonNull String str) {
            this.b.bindString(1, str);
        }
    }

    /* renamed from: com.tinder.data.model.MessageModel$c */
    public static final class C13006c extends C7265b {
        /* renamed from: c */
        private final C8710b<? extends MessageModel> f41574c;

        public C13006c(SQLiteDatabase sQLiteDatabase, C8710b<? extends MessageModel> c8710b) {
            super("message", sQLiteDatabase.compileStatement("INSERT INTO message (id, match_id, to_id, from_id, text, sent_date, is_liked, is_seen, type, delivery_status)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.f41574c = c8710b;
        }

        /* renamed from: a */
        public void m50758a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull DateTime dateTime, boolean z, boolean z2, @NonNull MessageType messageType, @NonNull DeliveryStatus deliveryStatus) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            this.b.bindString(4, str4);
            this.b.bindString(5, str5);
            this.b.bindLong(6, ((Long) this.f41574c.f30673b.encode(dateTime)).longValue());
            str2 = 0;
            this.b.bindLong(7, z ? 1 : null);
            str = this.b;
            if (z2) {
                str2 = 1;
            }
            str.bindLong(8, str2);
            this.b.bindString(9, (String) this.f41574c.f30674c.encode(messageType));
            this.b.bindString(10, (String) this.f41574c.f30675d.encode(deliveryStatus));
        }
    }

    /* renamed from: com.tinder.data.model.MessageModel$d */
    public static final class C13007d extends C7266c {
        public C13007d(SQLiteDatabase sQLiteDatabase) {
            super("message", sQLiteDatabase.compileStatement("UPDATE message SET is_liked = ?1\nWHERE id = ?2 AND match_id = ?3 AND (from_id = ?4 OR to_id = ?4)"));
        }

        /* renamed from: a */
        public void m50759a(boolean z, @NonNull String str, @NonNull String str2, @NonNull String str3) {
            this.b.bindLong(true, z ? 1 : 0);
            this.b.bindString(2, str);
            this.b.bindString(3, str2);
            this.b.bindString(4, str3);
        }
    }

    /* renamed from: com.tinder.data.model.MessageModel$e */
    public static final class C13008e extends C7266c {
        /* renamed from: c */
        private final C8710b<? extends MessageModel> f41575c;

        public C13008e(SQLiteDatabase sQLiteDatabase, C8710b<? extends MessageModel> c8710b) {
            super("message", sQLiteDatabase.compileStatement("UPDATE message\nSET delivery_status = ?\nWHERE delivery_status = ?"));
            this.f41575c = c8710b;
        }

        /* renamed from: a */
        public void m50760a(@NonNull DeliveryStatus deliveryStatus, @NonNull DeliveryStatus deliveryStatus2) {
            this.b.bindString(1, (String) this.f41575c.f30675d.encode(deliveryStatus));
            this.b.bindString(2, (String) this.f41575c.f30675d.encode(deliveryStatus2));
        }
    }

    /* renamed from: com.tinder.data.model.MessageModel$h */
    public static final class C13009h extends C7266c {
        public C13009h(SQLiteDatabase sQLiteDatabase) {
            super("message", sQLiteDatabase.compileStatement("UPDATE message SET is_liked = ? WHERE id = ?"));
        }

        /* renamed from: a */
        public void m50761a(boolean z, @NonNull String str) {
            this.b.bindLong(true, z ? 1 : 0);
            this.b.bindString(2, str);
        }
    }

    /* renamed from: com.tinder.data.model.MessageModel$i */
    public static final class C13010i extends C7266c {
        public C13010i(SQLiteDatabase sQLiteDatabase) {
            super("message", sQLiteDatabase.compileStatement("UPDATE message SET is_seen = 1 WHERE match_id = ?"));
        }

        /* renamed from: a */
        public void m50762a(@NonNull String str) {
            this.b.bindString(1, str);
        }
    }

    /* renamed from: com.tinder.data.model.MessageModel$j */
    public static final class C13011j extends C7266c {
        /* renamed from: c */
        private final C8710b<? extends MessageModel> f41576c;

        public C13011j(SQLiteDatabase sQLiteDatabase, C8710b<? extends MessageModel> c8710b) {
            super("message", sQLiteDatabase.compileStatement("UPDATE message\nSET id = ?, match_id = ?, to_id = ?, from_id = ?, text = ?, sent_date = ?, is_liked = ?, type = ?, delivery_status = ?, is_seen = ?\nWHERE id = ?"));
            this.f41576c = c8710b;
        }

        /* renamed from: a */
        public void m50763a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull DateTime dateTime, boolean z, @NonNull MessageType messageType, @NonNull DeliveryStatus deliveryStatus, boolean z2, @NonNull String str6) {
            this.b.bindString(1, str);
            this.b.bindString(2, str2);
            this.b.bindString(3, str3);
            this.b.bindString(4, str4);
            this.b.bindString(5, str5);
            this.b.bindLong(6, ((Long) this.f41576c.f30673b.encode(dateTime)).longValue());
            str2 = 0;
            this.b.bindLong(7, z ? 1 : null);
            this.b.bindString(8, (String) this.f41576c.f30674c.encode(messageType));
            this.b.bindString(9, (String) this.f41576c.f30675d.encode(deliveryStatus));
            str = this.b;
            if (z2) {
                str2 = 1;
            }
            str.bindLong(10, str2);
            this.b.bindString(11, str6);
        }
    }

    long client_sequential_id();

    @NonNull
    DeliveryStatus delivery_status();

    @NonNull
    String from_id();

    @NonNull
    String id();

    boolean is_liked();

    boolean is_seen();

    @NonNull
    String match_id();

    @NonNull
    DateTime sent_date();

    @NonNull
    String text();

    @NonNull
    String to_id();

    @NonNull
    MessageType type();
}
