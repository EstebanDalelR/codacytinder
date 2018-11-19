package com.squareup.sqlbrite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.WorkerThread;
import com.squareup.sqlbrite.SqlBrite.C6122b;
import com.squareup.sqlbrite.SqlBrite.Logger;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import rx.C19571c;
import rx.C2671a;
import rx.Observable;
import rx.Observable$Transformer;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.functions.Action0;
import rx.functions.Func1;

public final class BriteDatabase implements Closeable {
    /* renamed from: a */
    final ThreadLocal<SqliteTransaction> f22496a = new ThreadLocal();
    /* renamed from: b */
    volatile boolean f22497b;
    /* renamed from: c */
    private final SQLiteOpenHelper f22498c;
    /* renamed from: d */
    private final Logger f22499d;
    /* renamed from: e */
    private final Observable$Transformer<C6122b, C6122b> f22500e;
    /* renamed from: f */
    private final Observable<Set<String>> f22501f;
    /* renamed from: g */
    private final Observer<Set<String>> f22502g;
    /* renamed from: h */
    private final Transaction f22503h = new C72601(this);
    /* renamed from: i */
    private final Action0 f22504i = new C81102(this);
    /* renamed from: j */
    private final C2671a f22505j;

    static final class SqliteTransaction extends LinkedHashSet<String> implements SQLiteTransactionListener {
        /* renamed from: a */
        final SqliteTransaction f22494a;
        /* renamed from: b */
        boolean f22495b;

        public void onBegin() {
        }

        public void onRollback() {
        }

        SqliteTransaction(SqliteTransaction sqliteTransaction) {
            this.f22494a = sqliteTransaction;
        }

        public void onCommit() {
            this.f22495b = true;
        }

        public String toString() {
            String format = String.format("%08x", new Object[]{Integer.valueOf(System.identityHashCode(this))});
            if (this.f22494a == null) {
                return format;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(format);
            stringBuilder.append(" [");
            stringBuilder.append(this.f22494a.toString());
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    public interface Transaction extends Closeable {
        @WorkerThread
        void close();

        @WorkerThread
        void end();

        @WorkerThread
        void markSuccessful();

        @WorkerThread
        boolean yieldIfContendedSafely();

        @WorkerThread
        boolean yieldIfContendedSafely(long j, TimeUnit timeUnit);
    }

    /* renamed from: com.squareup.sqlbrite.BriteDatabase$1 */
    class C72601 implements Transaction {
        /* renamed from: a */
        final /* synthetic */ BriteDatabase f26164a;

        C72601(BriteDatabase briteDatabase) {
            this.f26164a = briteDatabase;
        }

        public void markSuccessful() {
            if (this.f26164a.f22497b) {
                this.f26164a.m26600a("TXN SUCCESS %s", this.f26164a.f22496a.get());
            }
            this.f26164a.m26604b().setTransactionSuccessful();
        }

        public boolean yieldIfContendedSafely() {
            return this.f26164a.m26604b().yieldIfContendedSafely();
        }

        public boolean yieldIfContendedSafely(long j, TimeUnit timeUnit) {
            return this.f26164a.m26604b().yieldIfContendedSafely(timeUnit.toMillis(j));
        }

        public void end() {
            Set set = (SqliteTransaction) this.f26164a.f22496a.get();
            if (set == null) {
                throw new IllegalStateException("Not in transaction.");
            }
            this.f26164a.f22496a.set(set.f22494a);
            if (this.f26164a.f22497b) {
                this.f26164a.m26600a("TXN END %s", set);
            }
            this.f26164a.m26604b().endTransaction();
            if (set.f22495b) {
                this.f26164a.m26601a(set);
            }
        }

        public void close() {
            end();
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteDatabase$a */
    final class C7953a extends C6122b implements Func1<Set<String>, C6122b> {
        /* renamed from: a */
        final /* synthetic */ BriteDatabase f28562a;
        /* renamed from: b */
        private final Func1<Set<String>, Boolean> f28563b;
        /* renamed from: c */
        private final String f28564c;
        /* renamed from: d */
        private final String[] f28565d;

        /* renamed from: a */
        public C6122b m33817a(Set<String> set) {
            return this;
        }

        public /* synthetic */ Object call(Object obj) {
            return m33817a((Set) obj);
        }

        C7953a(BriteDatabase briteDatabase, Func1<Set<String>, Boolean> func1, String str, String... strArr) {
            this.f28562a = briteDatabase;
            this.f28563b = func1;
            this.f28564c = str;
            this.f28565d = strArr;
        }

        /* renamed from: a */
        public Cursor mo7413a() {
            if (this.f28562a.f22496a.get() != null) {
                throw new IllegalStateException("Cannot execute observable query in a transaction.");
            }
            long nanoTime = System.nanoTime();
            Cursor rawQuery = this.f28562a.m26597a().rawQuery(this.f28564c, this.f28565d);
            if (this.f28562a.f22497b) {
                nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                this.f28562a.m26600a("QUERY (%sms)\n  tables: %s\n  sql: %s\n  args: %s", Long.valueOf(nanoTime), this.f28563b, BriteDatabase.m26590a(this.f28564c), Arrays.toString(this.f28565d));
            }
            return rawQuery;
        }

        public String toString() {
            return this.f28564c;
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteDatabase$2 */
    class C81102 implements Action0 {
        /* renamed from: a */
        final /* synthetic */ BriteDatabase f29102a;

        C81102(BriteDatabase briteDatabase) {
            this.f29102a = briteDatabase;
        }

        public void call() {
            if (this.f29102a.f22496a.get() != null) {
                throw new IllegalStateException("Cannot subscribe to observable query in a transaction.");
            }
        }
    }

    BriteDatabase(SQLiteOpenHelper sQLiteOpenHelper, Logger logger, Observable<Set<String>> observable, Observer<Set<String>> observer, C2671a c2671a, Observable$Transformer<C6122b, C6122b> observable$Transformer) {
        this.f22498c = sQLiteOpenHelper;
        this.f22499d = logger;
        this.f22501f = observable;
        this.f22502g = observer;
        this.f22505j = c2671a;
        this.f22500e = observable$Transformer;
    }

    @WorkerThread
    @CheckResult
    @NonNull
    /* renamed from: a */
    public SQLiteDatabase m26597a() {
        return this.f22498c.getReadableDatabase();
    }

    @WorkerThread
    @CheckResult
    @NonNull
    /* renamed from: b */
    public SQLiteDatabase m26604b() {
        return this.f22498c.getWritableDatabase();
    }

    /* renamed from: a */
    void m26601a(Set<String> set) {
        SqliteTransaction sqliteTransaction = (SqliteTransaction) this.f22496a.get();
        if (sqliteTransaction != null) {
            sqliteTransaction.addAll(set);
            return;
        }
        if (this.f22497b) {
            m26600a("TRIGGER %s", set);
        }
        this.f22502g.onNext(set);
    }

    @CheckResult
    @NonNull
    /* renamed from: c */
    public Transaction m26605c() {
        SQLiteTransactionListener sqliteTransaction = new SqliteTransaction((SqliteTransaction) this.f22496a.get());
        this.f22496a.set(sqliteTransaction);
        if (this.f22497b) {
            m26600a("TXN BEGIN %s", sqliteTransaction);
        }
        m26604b().beginTransactionWithListener(sqliteTransaction);
        return this.f22503h;
    }

    public void close() {
        this.f22498c.close();
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public C7262a m26599a(@NonNull final String str, @NonNull String str2, @NonNull String... strArr) {
        return m26588a(new Func1<Set<String>, Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ BriteDatabase f28559b;

            public /* synthetic */ Object call(Object obj) {
                return m33814a((Set) obj);
            }

            /* renamed from: a */
            public Boolean m33814a(Set<String> set) {
                return Boolean.valueOf(set.contains(str));
            }

            public String toString() {
                return str;
            }
        }, str2, strArr);
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public C7262a m26598a(@NonNull final Iterable<String> iterable, @NonNull String str, @NonNull String... strArr) {
        return m26588a(new Func1<Set<String>, Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ BriteDatabase f28561b;

            public /* synthetic */ Object call(Object obj) {
                return m33815a((Set) obj);
            }

            /* renamed from: a */
            public Boolean m33815a(Set<String> set) {
                for (String contains : iterable) {
                    if (set.contains(contains)) {
                        return Boolean.valueOf(true);
                    }
                }
                return Boolean.valueOf(null);
            }

            public String toString() {
                return iterable.toString();
            }
        }, str, strArr);
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    private C7262a m26588a(Func1<Set<String>, Boolean> func1, String str, String... strArr) {
        if (this.f22496a.get() != null) {
            throw new IllegalStateException("Cannot create observable query in transaction. Use query() for a query inside a transaction.");
        }
        Func1 c7953a = new C7953a(this, func1, str, strArr);
        func1 = this.f22501f.f(func1).k(c7953a).m().e(c7953a).a(this.f22505j).a(this.f22500e).m().b(this.f22504i);
        return new C7262a(new OnSubscribe<C6122b>(this) {
            /* renamed from: b */
            final /* synthetic */ BriteDatabase f29367b;

            public /* synthetic */ void call(Object obj) {
                m35027a((C19571c) obj);
            }

            /* renamed from: a */
            public void m35027a(C19571c<? super C6122b> c19571c) {
                func1.a(c19571c);
            }
        });
    }

    @WorkerThread
    @CheckResult
    /* renamed from: a */
    public Cursor m26596a(@NonNull String str, @NonNull String... strArr) {
        long nanoTime = System.nanoTime();
        Cursor rawQuery = m26597a().rawQuery(str, strArr);
        nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
        if (this.f22497b) {
            m26600a("QUERY (%sms)\n  sql: %s\n  args: %s", Long.valueOf(nanoTime), m26590a(str), Arrays.toString(strArr));
        }
        return rawQuery;
    }

    @WorkerThread
    /* renamed from: a */
    public long m26595a(@NonNull String str, @NonNull ContentValues contentValues, int i) {
        SQLiteDatabase b = m26604b();
        if (this.f22497b) {
            m26600a("INSERT\n  table: %s\n  values: %s\n  conflictAlgorithm: %s", str, contentValues, m26589a(i));
        }
        contentValues = b.insertWithOnConflict(str, null, contentValues, i);
        if (this.f22497b) {
            m26600a("INSERT id: %s", Long.valueOf(contentValues));
        }
        if (contentValues != -1) {
            m26601a(Collections.singleton(str));
        }
        return contentValues;
    }

    @WorkerThread
    /* renamed from: a */
    public int m26592a(@NonNull String str, @NonNull ContentValues contentValues, @Nullable String str2, @Nullable String... strArr) {
        return m26591a(str, contentValues, 0, str2, strArr);
    }

    @WorkerThread
    /* renamed from: a */
    public int m26591a(@NonNull String str, @NonNull ContentValues contentValues, int i, @Nullable String str2, @Nullable String... strArr) {
        SQLiteDatabase b = m26604b();
        if (this.f22497b) {
            m26600a("UPDATE\n  table: %s\n  values: %s\n  whereClause: %s\n  whereArgs: %s\n  conflictAlgorithm: %s", str, contentValues, str2, Arrays.toString(strArr), m26589a(i));
        }
        contentValues = b.updateWithOnConflict(str, contentValues, str2, strArr, i);
        if (this.f22497b != 0) {
            String str3 = "UPDATE affected %s %s";
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(contentValues);
            objArr[1] = contentValues != 1 ? "rows" : "row";
            m26600a(str3, objArr);
        }
        if (contentValues > null) {
            m26601a(Collections.singleton(str));
        }
        return contentValues;
    }

    @WorkerThread
    @RequiresApi(11)
    /* renamed from: a */
    public int m26593a(String str, SQLiteStatement sQLiteStatement) {
        return m26594a(Collections.singleton(str), sQLiteStatement);
    }

    @WorkerThread
    @RequiresApi(11)
    /* renamed from: a */
    public int m26594a(Set<String> set, SQLiteStatement sQLiteStatement) {
        if (this.f22497b) {
            m26600a("EXECUTE\n %s", sQLiteStatement);
        }
        sQLiteStatement = sQLiteStatement.executeUpdateDelete();
        if (sQLiteStatement > null) {
            m26601a((Set) set);
        }
        return sQLiteStatement;
    }

    @WorkerThread
    /* renamed from: b */
    public long m26602b(String str, SQLiteStatement sQLiteStatement) {
        return m26603b(Collections.singleton(str), sQLiteStatement);
    }

    @WorkerThread
    /* renamed from: b */
    public long m26603b(Set<String> set, SQLiteStatement sQLiteStatement) {
        if (this.f22497b) {
            m26600a("EXECUTE\n %s", sQLiteStatement);
        }
        long executeInsert = sQLiteStatement.executeInsert();
        if (executeInsert != -1) {
            m26601a((Set) set);
        }
        return executeInsert;
    }

    /* renamed from: a */
    static String m26590a(String str) {
        return str.replace("\n", "\n       ");
    }

    /* renamed from: a */
    void m26600a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f22499d.log(str);
    }

    /* renamed from: a */
    private static String m26589a(int i) {
        switch (i) {
            case 0:
                return "none";
            case 1:
                return "rollback";
            case 2:
                return "abort";
            case 3:
                return "fail";
            case 4:
                return "ignore";
            case 5:
                return "replace";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown (");
                stringBuilder.append(i);
                stringBuilder.append(41);
                return stringBuilder.toString();
        }
    }
}
