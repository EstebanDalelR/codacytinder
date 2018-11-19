package com.tinder.analytics.fireworks.data;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6123b.C7265b;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.RowMapper;
import com.tinder.analytics.fireworks.C2632i;
import java.util.Collections;

public interface FireworksEventModel {

    public interface Creator<T extends FireworksEventModel> {
        T create(long j, @NonNull C2632i c2632i);
    }

    /* renamed from: com.tinder.analytics.fireworks.data.FireworksEventModel$a */
    public static final class C6227a<T extends FireworksEventModel> {
        /* renamed from: a */
        public final Creator<T> f22797a;
        /* renamed from: b */
        public final ColumnAdapter<C2632i, byte[]> f22798b;

        /* renamed from: com.tinder.analytics.fireworks.data.FireworksEventModel$a$1 */
        class C73231 implements RowMapper<C2632i> {
            /* renamed from: a */
            final /* synthetic */ C6227a f26473a;

            C73231(C6227a c6227a) {
                this.f26473a = c6227a;
            }

            public /* synthetic */ Object map(Cursor cursor) {
                return m31266a(cursor);
            }

            /* renamed from: a */
            public C2632i m31266a(Cursor cursor) {
                return (C2632i) this.f26473a.f22798b.decode(cursor.getBlob(0));
            }
        }

        public C6227a(Creator<T> creator, ColumnAdapter<C2632i, byte[]> columnAdapter) {
            this.f22797a = creator;
            this.f22798b = columnAdapter;
        }

        /* renamed from: a */
        public C6124c m26885a() {
            return new C6124c("SELECT event FROM fireworks", new String[0], Collections.singleton("fireworks"));
        }

        /* renamed from: b */
        public RowMapper<C2632i> m26886b() {
            return new C73231(this);
        }
    }

    /* renamed from: com.tinder.analytics.fireworks.data.FireworksEventModel$b */
    public static final class C8012b extends C7265b {
        /* renamed from: c */
        private final C6227a<? extends FireworksEventModel> f28644c;

        public C8012b(SQLiteDatabase sQLiteDatabase, C6227a<? extends FireworksEventModel> c6227a) {
            super("fireworks", sQLiteDatabase.compileStatement("INSERT INTO fireworks(event) VALUES(?)"));
            this.f28644c = c6227a;
        }

        /* renamed from: a */
        public void m33916a(@NonNull C2632i c2632i) {
            this.b.bindBlob(1, (byte[]) this.f28644c.f22798b.encode(c2632i));
        }
    }

    long _id();

    @NonNull
    C2632i event();
}
