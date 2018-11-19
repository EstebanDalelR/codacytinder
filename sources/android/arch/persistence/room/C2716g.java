package android.arch.persistence.room;

import android.arch.persistence.db.C2714a;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper.C0066a;
import android.arch.persistence.room.p005a.C0073a;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.persistence.room.g */
public class C2716g extends C0066a {
    @Nullable
    /* renamed from: b */
    private C0074a f8569b;
    @NonNull
    /* renamed from: c */
    private final C0093a f8570c;
    @NonNull
    /* renamed from: d */
    private final String f8571d;

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.arch.persistence.room.g$a */
    public static abstract class C0093a {
        /* renamed from: a */
        public final int f250a;

        /* renamed from: a */
        protected abstract void m299a(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: b */
        protected abstract void m300b(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: c */
        protected abstract void m301c(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: d */
        protected abstract void m302d(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: e */
        protected abstract void m303e(SupportSQLiteDatabase supportSQLiteDatabase);

        public C0093a(int i) {
            this.f250a = i;
        }
    }

    public C2716g(@NonNull C0074a c0074a, @NonNull C0093a c0093a, @NonNull String str) {
        super(c0093a.f250a);
        this.f8569b = c0074a;
        this.f8570c = c0093a;
        this.f8571d = str;
    }

    /* renamed from: a */
    public void mo127a(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.mo127a(supportSQLiteDatabase);
    }

    /* renamed from: b */
    public void mo129b(SupportSQLiteDatabase supportSQLiteDatabase) {
        m10555f(supportSQLiteDatabase);
        this.f8570c.m300b(supportSQLiteDatabase);
        this.f8570c.m302d(supportSQLiteDatabase);
    }

    /* renamed from: a */
    public void mo128a(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        Object obj;
        if (this.f8569b != null) {
            List<C0073a> a = this.f8569b.f184d.m282a(i, i2);
            if (a != null) {
                for (C0073a a2 : a) {
                    a2.m243a(supportSQLiteDatabase);
                }
                this.f8570c.m303e(supportSQLiteDatabase);
                m10555f(supportSQLiteDatabase);
                obj = 1;
                if (obj == null) {
                    if (this.f8569b != null) {
                        if (this.f8569b.f187g) {
                            this.f8570c.m299a(supportSQLiteDatabase);
                            this.f8570c.m300b(supportSQLiteDatabase);
                            return;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("A migration from ");
                    stringBuilder.append(i);
                    stringBuilder.append(" to ");
                    stringBuilder.append(i2);
                    stringBuilder.append(" is necessary. Please provide a Migration in the builder or call");
                    stringBuilder.append(" fallbackToDestructiveMigration in the builder in which case Room will");
                    stringBuilder.append(" re-create all of the tables.");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }
        obj = null;
        if (obj == null) {
            if (this.f8569b != null) {
                if (this.f8569b.f187g) {
                    this.f8570c.m299a(supportSQLiteDatabase);
                    this.f8570c.m300b(supportSQLiteDatabase);
                    return;
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("A migration from ");
            stringBuilder2.append(i);
            stringBuilder2.append(" to ");
            stringBuilder2.append(i2);
            stringBuilder2.append(" is necessary. Please provide a Migration in the builder or call");
            stringBuilder2.append(" fallbackToDestructiveMigration in the builder in which case Room will");
            stringBuilder2.append(" re-create all of the tables.");
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    /* renamed from: b */
    public void mo130b(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        mo128a(supportSQLiteDatabase, i, i2);
    }

    /* renamed from: c */
    public void mo131c(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.mo131c(supportSQLiteDatabase);
        m10554e(supportSQLiteDatabase);
        this.f8570c.m301c(supportSQLiteDatabase);
        this.f8569b = null;
    }

    /* renamed from: e */
    private void m10554e(SupportSQLiteDatabase supportSQLiteDatabase) {
        m10556g(supportSQLiteDatabase);
        Object obj = "";
        supportSQLiteDatabase = supportSQLiteDatabase.query(new C2714a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            if (supportSQLiteDatabase.moveToFirst()) {
                obj = supportSQLiteDatabase.getString(0);
            }
            supportSQLiteDatabase.close();
            if (this.f8571d.equals(obj) == null) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            supportSQLiteDatabase.close();
        }
    }

    /* renamed from: f */
    private void m10555f(SupportSQLiteDatabase supportSQLiteDatabase) {
        m10556g(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(C0092f.m298a(this.f8571d));
    }

    /* renamed from: g */
    private void m10556g(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }
}
