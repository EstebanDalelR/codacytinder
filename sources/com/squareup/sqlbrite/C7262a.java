package com.squareup.sqlbrite;

import android.database.Cursor;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import com.squareup.sqlbrite.SqlBrite.C6122b;
import java.util.List;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.functions.Func1;

/* renamed from: com.squareup.sqlbrite.a */
public final class C7262a extends Observable<C6122b> {
    public C7262a(OnSubscribe<C6122b> onSubscribe) {
        super(onSubscribe);
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public final <T> Observable<T> m31085a(@NonNull Func1<Cursor, T> func1) {
        return a(C6122b.m26607a(func1));
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public final <T> Observable<T> m31086a(@NonNull Func1<Cursor, T> func1, T t) {
        return a(C6122b.m26608a(func1, t));
    }

    @CheckResult
    @NonNull
    /* renamed from: b */
    public final <T> Observable<List<T>> m31087b(@NonNull Func1<Cursor, T> func1) {
        return a(C6122b.m26609b(func1));
    }
}
