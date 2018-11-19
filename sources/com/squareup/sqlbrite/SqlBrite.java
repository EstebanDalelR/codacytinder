package com.squareup.sqlbrite;

import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import java.util.List;
import rx.C2671a;
import rx.Observable;
import rx.Observable$Transformer;
import rx.Observable.Operator;
import rx.Observer;
import rx.functions.Func1;
import rx.subjects.PublishSubject;

public final class SqlBrite {
    /* renamed from: a */
    static final Logger f22508a = new C72611();
    /* renamed from: b */
    static final Observable$Transformer<C6122b, C6122b> f22509b = new C81112();
    /* renamed from: c */
    final Logger f22510c;
    /* renamed from: d */
    final Observable$Transformer<C6122b, C6122b> f22511d;

    public interface Logger {
        void log(String str);
    }

    /* renamed from: com.squareup.sqlbrite.SqlBrite$a */
    public static final class C6121a {
        /* renamed from: a */
        private Logger f22506a = SqlBrite.f22508a;
        /* renamed from: b */
        private Observable$Transformer<C6122b, C6122b> f22507b = SqlBrite.f22509b;

        @CheckResult
        /* renamed from: a */
        public SqlBrite m26606a() {
            return new SqlBrite(this.f22506a, this.f22507b);
        }
    }

    /* renamed from: com.squareup.sqlbrite.SqlBrite$b */
    public static abstract class C6122b {
        @Nullable
        @WorkerThread
        @CheckResult
        /* renamed from: a */
        public abstract Cursor mo7413a();

        @CheckResult
        @NonNull
        /* renamed from: a */
        public static <T> Operator<T, C6122b> m26607a(@NonNull Func1<Cursor, T> func1) {
            return new C8113c(func1, false, null);
        }

        @CheckResult
        @NonNull
        /* renamed from: a */
        public static <T> Operator<T, C6122b> m26608a(@NonNull Func1<Cursor, T> func1, T t) {
            return new C8113c(func1, true, t);
        }

        @CheckResult
        @NonNull
        /* renamed from: b */
        public static <T> Operator<List<T>, C6122b> m26609b(@NonNull Func1<Cursor, T> func1) {
            return new C8112b(func1);
        }
    }

    /* renamed from: com.squareup.sqlbrite.SqlBrite$1 */
    static class C72611 implements Logger {
        C72611() {
        }

        public void log(String str) {
            Log.d("SqlBrite", str);
        }
    }

    /* renamed from: com.squareup.sqlbrite.SqlBrite$2 */
    static class C81112 implements Observable$Transformer<C6122b, C6122b> {
        /* renamed from: a */
        public Observable<C6122b> m34521a(Observable<C6122b> observable) {
            return observable;
        }

        C81112() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m34521a((Observable) obj);
        }
    }

    @Deprecated
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static SqlBrite m26611a(@NonNull Logger logger) {
        if (logger != null) {
            return new SqlBrite(logger, f22509b);
        }
        throw new NullPointerException("logger == null");
    }

    SqlBrite(@NonNull Logger logger, @NonNull Observable$Transformer<C6122b, C6122b> observable$Transformer) {
        this.f22510c = logger;
        this.f22511d = observable$Transformer;
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public BriteDatabase m26612a(@NonNull SQLiteOpenHelper sQLiteOpenHelper, @NonNull C2671a c2671a) {
        Observer w = PublishSubject.w();
        return new BriteDatabase(sQLiteOpenHelper, this.f22510c, w, w, c2671a, this.f22511d);
    }
}
