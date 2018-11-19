package android.arch.persistence.db.p004a;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.database.sqlite.SQLiteStatement;

/* renamed from: android.arch.persistence.db.a.e */
class C3983e implements SupportSQLiteStatement {
    /* renamed from: a */
    private final SQLiteStatement f12641a;

    C3983e(SQLiteStatement sQLiteStatement) {
        this.f12641a = sQLiteStatement;
    }

    public void bindNull(int i) {
        this.f12641a.bindNull(i);
    }

    public void bindLong(int i, long j) {
        this.f12641a.bindLong(i, j);
    }

    public void bindDouble(int i, double d) {
        this.f12641a.bindDouble(i, d);
    }

    public void bindString(int i, String str) {
        this.f12641a.bindString(i, str);
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f12641a.bindBlob(i, bArr);
    }

    public void clearBindings() {
        this.f12641a.clearBindings();
    }

    public void execute() {
        this.f12641a.execute();
    }

    public int executeUpdateDelete() {
        return this.f12641a.executeUpdateDelete();
    }

    public long executeInsert() {
        return this.f12641a.executeInsert();
    }

    public long simpleQueryForLong() {
        return this.f12641a.simpleQueryForLong();
    }

    public String simpleQueryForString() {
        return this.f12641a.simpleQueryForString();
    }

    public void close() throws Exception {
        this.f12641a.close();
    }
}
