package android.arch.persistence.db.p004a;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.C0066a;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.RequiresApi;

/* renamed from: android.arch.persistence.db.a.b */
class C2711b implements SupportSQLiteOpenHelper {
    /* renamed from: a */
    private final C0072a f8565a;

    /* renamed from: android.arch.persistence.db.a.b$a */
    static class C0072a extends SQLiteOpenHelper {
        /* renamed from: a */
        final C2710a[] f179a;
        /* renamed from: b */
        final C0066a f180b;

        /* renamed from: android.arch.persistence.db.a.b$a$1 */
        class C00711 implements DatabaseErrorHandler {
            /* renamed from: a */
            final /* synthetic */ C2710a[] f177a;
            /* renamed from: b */
            final /* synthetic */ C0066a f178b;

            C00711(C2710a[] c2710aArr, C0066a c0066a) {
                this.f177a = c2710aArr;
                this.f178b = c0066a;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase = this.f177a[0];
                if (sQLiteDatabase != null) {
                    this.f178b.m235d(sQLiteDatabase);
                }
            }
        }

        C0072a(Context context, String str, C2710a[] c2710aArr, C0066a c0066a) {
            super(context, str, null, c0066a.f166a, new C00711(c2710aArr, c0066a));
            this.f180b = c0066a;
            this.f179a = c2710aArr;
        }

        /* renamed from: a */
        SupportSQLiteDatabase m240a() {
            return m241a(super.getWritableDatabase());
        }

        /* renamed from: b */
        SupportSQLiteDatabase m242b() {
            return m241a(super.getReadableDatabase());
        }

        /* renamed from: a */
        C2710a m241a(SQLiteDatabase sQLiteDatabase) {
            if (this.f179a[0] == null) {
                this.f179a[0] = new C2710a(sQLiteDatabase);
            }
            return this.f179a[0];
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f180b.mo129b(m241a(sQLiteDatabase));
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f180b.mo128a(m241a(sQLiteDatabase), i, i2);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f180b.mo127a(m241a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f180b.mo130b(m241a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            this.f180b.mo131c(m241a(sQLiteDatabase));
        }

        public synchronized void close() {
            super.close();
            this.f179a[0] = null;
        }
    }

    C2711b(Context context, String str, C0066a c0066a) {
        this.f8565a = m10548a(context, str, c0066a);
    }

    /* renamed from: a */
    private C0072a m10548a(Context context, String str, C0066a c0066a) {
        return new C0072a(context, str, new C2710a[1], c0066a);
    }

    public String getDatabaseName() {
        return this.f8565a.getDatabaseName();
    }

    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f8565a.setWriteAheadLoggingEnabled(z);
    }

    public SupportSQLiteDatabase getWritableDatabase() {
        return this.f8565a.m240a();
    }

    public SupportSQLiteDatabase getReadableDatabase() {
        return this.f8565a.m242b();
    }

    public void close() {
        this.f8565a.close();
    }
}
