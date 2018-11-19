package android.arch.persistence.db.p004a;

import android.arch.persistence.db.SupportSQLiteProgram;
import android.database.sqlite.SQLiteProgram;

/* renamed from: android.arch.persistence.db.a.d */
class C2713d implements SupportSQLiteProgram {
    /* renamed from: a */
    private final SQLiteProgram f8566a;

    C2713d(SQLiteProgram sQLiteProgram) {
        this.f8566a = sQLiteProgram;
    }

    public void bindNull(int i) {
        this.f8566a.bindNull(i);
    }

    public void bindLong(int i, long j) {
        this.f8566a.bindLong(i, j);
    }

    public void bindDouble(int i, double d) {
        this.f8566a.bindDouble(i, d);
    }

    public void bindString(int i, String str) {
        this.f8566a.bindString(i, str);
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f8566a.bindBlob(i, bArr);
    }

    public void clearBindings() {
        this.f8566a.clearBindings();
    }

    public void close() throws Exception {
        this.f8566a.close();
    }
}
