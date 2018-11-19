package android.arch.persistence.db.p004a;

import android.arch.persistence.db.C2714a;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteQuery;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.support.annotation.RequiresApi;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* renamed from: android.arch.persistence.db.a.a */
class C2710a implements SupportSQLiteDatabase {
    /* renamed from: a */
    private static final String[] f8562a = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    /* renamed from: b */
    private static final String[] f8563b = new String[0];
    /* renamed from: c */
    private final SQLiteDatabase f8564c;

    C2710a(SQLiteDatabase sQLiteDatabase) {
        this.f8564c = sQLiteDatabase;
    }

    public SupportSQLiteStatement compileStatement(String str) {
        return new C3983e(this.f8564c.compileStatement(str));
    }

    public void beginTransaction() {
        this.f8564c.beginTransaction();
    }

    public void beginTransactionNonExclusive() {
        this.f8564c.beginTransactionNonExclusive();
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f8564c.beginTransactionWithListener(sQLiteTransactionListener);
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f8564c.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    public void endTransaction() {
        this.f8564c.endTransaction();
    }

    public void setTransactionSuccessful() {
        this.f8564c.setTransactionSuccessful();
    }

    public boolean inTransaction() {
        return this.f8564c.inTransaction();
    }

    public boolean isDbLockedByCurrentThread() {
        return this.f8564c.isDbLockedByCurrentThread();
    }

    public boolean yieldIfContendedSafely() {
        return this.f8564c.yieldIfContendedSafely();
    }

    public boolean yieldIfContendedSafely(long j) {
        return this.f8564c.yieldIfContendedSafely(j);
    }

    public int getVersion() {
        return this.f8564c.getVersion();
    }

    public void setVersion(int i) {
        this.f8564c.setVersion(i);
    }

    public long getMaximumSize() {
        return this.f8564c.getMaximumSize();
    }

    public long setMaximumSize(long j) {
        return this.f8564c.setMaximumSize(j);
    }

    public long getPageSize() {
        return this.f8564c.getPageSize();
    }

    public void setPageSize(long j) {
        this.f8564c.setPageSize(j);
    }

    public Cursor query(String str) {
        return query(new C2714a(str));
    }

    public Cursor query(String str, Object[] objArr) {
        return query(new C2714a(str, objArr));
    }

    public Cursor query(final SupportSQLiteQuery supportSQLiteQuery) {
        return this.f8564c.rawQueryWithFactory(new CursorFactory(this) {
            /* renamed from: b */
            final /* synthetic */ C2710a f174b;

            public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                supportSQLiteQuery.bindTo(new C2713d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.getSql(), f8563b, null);
    }

    @RequiresApi(api = 16)
    public Cursor query(final SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        return this.f8564c.rawQueryWithFactory(new CursorFactory(this) {
            /* renamed from: b */
            final /* synthetic */ C2710a f176b;

            public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                supportSQLiteQuery.bindTo(new C2713d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.getSql(), f8563b, null, cancellationSignal);
    }

    public long insert(String str, int i, ContentValues contentValues) throws SQLException {
        return this.f8564c.insertWithOnConflict(str, null, contentValues, i);
    }

    public int delete(String str, String str2, Object[] objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DELETE FROM ");
        stringBuilder.append(str);
        if (C2710a.m10547a(str2) != null) {
            str = "";
        } else {
            str = new StringBuilder();
            str.append(" WHERE ");
            str.append(str2);
            str = str.toString();
        }
        stringBuilder.append(str);
        str = compileStatement(stringBuilder.toString());
        C2714a.m10550a(str, objArr);
        return str.executeUpdateDelete();
    }

    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues != null) {
            if (contentValues.size() != 0) {
                StringBuilder stringBuilder = new StringBuilder(120);
                stringBuilder.append("UPDATE ");
                stringBuilder.append(f8562a[i]);
                stringBuilder.append(str);
                stringBuilder.append(" SET ");
                str = contentValues.size();
                if (objArr == null) {
                    i = str;
                } else {
                    i = objArr.length + str;
                }
                Object[] objArr2 = new Object[i];
                int i2 = 0;
                for (String str3 : contentValues.keySet()) {
                    stringBuilder.append(i2 > 0 ? "," : "");
                    stringBuilder.append(str3);
                    int i3 = i2 + 1;
                    objArr2[i2] = contentValues.get(str3);
                    stringBuilder.append("=?");
                    i2 = i3;
                }
                if (objArr != null) {
                    for (contentValues = str; contentValues < i; contentValues++) {
                        objArr2[contentValues] = objArr[contentValues - str];
                    }
                }
                if (C2710a.m10547a(str2) == null) {
                    stringBuilder.append(" WHERE ");
                    stringBuilder.append(str2);
                }
                str = compileStatement(stringBuilder.toString());
                C2714a.m10550a(str, objArr2);
                return str.executeUpdateDelete();
            }
        }
        throw new IllegalArgumentException("Empty values");
    }

    public void execSQL(String str) throws SQLException {
        this.f8564c.execSQL(str);
    }

    public void execSQL(String str, Object[] objArr) throws SQLException {
        this.f8564c.execSQL(str, objArr);
    }

    public boolean isReadOnly() {
        return this.f8564c.isReadOnly();
    }

    public boolean isOpen() {
        return this.f8564c.isOpen();
    }

    public boolean needUpgrade(int i) {
        return this.f8564c.needUpgrade(i);
    }

    public String getPath() {
        return this.f8564c.getPath();
    }

    public void setLocale(Locale locale) {
        this.f8564c.setLocale(locale);
    }

    public void setMaxSqlCacheSize(int i) {
        this.f8564c.setMaxSqlCacheSize(i);
    }

    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z) {
        this.f8564c.setForeignKeyConstraintsEnabled(z);
    }

    public boolean enableWriteAheadLogging() {
        return this.f8564c.enableWriteAheadLogging();
    }

    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        this.f8564c.disableWriteAheadLogging();
    }

    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return this.f8564c.isWriteAheadLoggingEnabled();
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return this.f8564c.getAttachedDbs();
    }

    public boolean isDatabaseIntegrityOk() {
        return this.f8564c.isDatabaseIntegrityOk();
    }

    public void close() throws IOException {
        this.f8564c.close();
    }

    /* renamed from: a */
    private static boolean m10547a(String str) {
        if (str != null) {
            if (str.length() != null) {
                return null;
            }
        }
        return true;
    }
}
