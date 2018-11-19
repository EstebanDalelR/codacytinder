package com.squareup.sqlbrite;

import android.database.Cursor;
import com.squareup.sqlbrite.SqlBrite.C6122b;
import java.util.ArrayList;
import java.util.List;
import rx.C19571c;
import rx.Observable.Operator;
import rx.exceptions.C19410a;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;

/* renamed from: com.squareup.sqlbrite.b */
final class C8112b<T> implements Operator<List<T>, C6122b> {
    /* renamed from: a */
    final Func1<Cursor, T> f29103a;

    public /* synthetic */ Object call(Object obj) {
        return m34522a((C19571c) obj);
    }

    C8112b(Func1<Cursor, T> func1) {
        this.f29103a = func1;
    }

    /* renamed from: a */
    public C19571c<? super C6122b> m34522a(final C19571c<? super List<T>> c19571c) {
        return new C19571c<C6122b>(this, c19571c) {
            /* renamed from: b */
            final /* synthetic */ C8112b f28567b;

            public /* synthetic */ void onNext(Object obj) {
                m33818a((C6122b) obj);
            }

            /* renamed from: a */
            public void m33818a(C6122b c6122b) {
                Cursor a;
                try {
                    a = c6122b.mo7413a();
                    if (a != null) {
                        if (!c19571c.isUnsubscribed()) {
                            List arrayList = new ArrayList(a.getCount());
                            while (a.moveToNext()) {
                                arrayList.add(this.f28567b.f29103a.call(a));
                            }
                            a.close();
                            if (!c19571c.isUnsubscribed()) {
                                c19571c.onNext(arrayList);
                            }
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
