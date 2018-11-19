package com.squareup.sqlbrite;

import android.database.Cursor;
import com.squareup.sqlbrite.SqlBrite.C6122b;
import rx.C19571c;
import rx.Observable.Operator;
import rx.exceptions.C19410a;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;

/* renamed from: com.squareup.sqlbrite.c */
final class C8113c<T> implements Operator<T, C6122b> {
    /* renamed from: a */
    final Func1<Cursor, T> f29104a;
    /* renamed from: b */
    boolean f29105b;
    /* renamed from: c */
    T f29106c;

    public /* synthetic */ Object call(Object obj) {
        return m34523a((C19571c) obj);
    }

    C8113c(Func1<Cursor, T> func1, boolean z, T t) {
        this.f29104a = func1;
        this.f29105b = z;
        this.f29106c = t;
    }

    /* renamed from: a */
    public C19571c<? super C6122b> m34523a(final C19571c<? super T> c19571c) {
        return new C19571c<C6122b>(this, c19571c) {
            /* renamed from: b */
            final /* synthetic */ C8113c f28569b;

            public /* synthetic */ void onNext(Object obj) {
                m33819a((C6122b) obj);
            }

            /* renamed from: a */
            public void m33819a(C6122b c6122b) {
                Object obj = null;
                Object obj2 = null;
                Cursor a;
                try {
                    a = c6122b.mo7413a();
                    if (a != null) {
                        if (a.moveToNext()) {
                            obj = this.f28569b.f29104a.call(a);
                            if (a.moveToNext()) {
                                throw new IllegalStateException("Cursor returned more than 1 row");
                            }
                            obj2 = obj;
                            obj = 1;
                        }
                        a.close();
                    }
                    if (!c19571c.isUnsubscribed()) {
                        if (obj != null) {
                            c19571c.onNext(obj2);
                        } else if (this.f28569b.f29105b) {
                            c19571c.onNext(this.f28569b.f29106c);
                        } else {
                            request(1);
                        }
                    }
                } catch (Throwable th) {
                    C19410a.b(th);
                    onError(OnErrorThrowable.a(th, c6122b.toString()));
                }
            }

            public void onCompleted() {
                c19571c.onCompleted();
            }

            public void onError(Throwable th) {
                c19571c.onError(th);
            }
        };
    }
}
