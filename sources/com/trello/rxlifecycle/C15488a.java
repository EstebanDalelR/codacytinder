package com.trello.rxlifecycle;

import java.util.concurrent.CancellationException;
import rx.Observable;
import rx.exceptions.C19410a;
import rx.functions.Func1;

/* renamed from: com.trello.rxlifecycle.a */
final class C15488a {
    /* renamed from: a */
    static final Func1<Throwable, Boolean> f47927a = new C183101();
    /* renamed from: b */
    static final Func1<Boolean, Boolean> f47928b = new C183112();
    /* renamed from: c */
    static final Func1<Object, Observable<Object>> f47929c = new C183123();

    /* renamed from: com.trello.rxlifecycle.a$1 */
    static class C183101 implements Func1<Throwable, Boolean> {
        C183101() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m66303a((Throwable) obj);
        }

        /* renamed from: a */
        public Boolean m66303a(Throwable th) {
            if (th instanceof OutsideLifecycleException) {
                return Boolean.valueOf(true);
            }
            C19410a.a(th);
            return Boolean.valueOf(null);
        }
    }

    /* renamed from: com.trello.rxlifecycle.a$2 */
    static class C183112 implements Func1<Boolean, Boolean> {
        /* renamed from: a */
        public Boolean m66304a(Boolean bool) {
            return bool;
        }

        C183112() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m66304a((Boolean) obj);
        }
    }

    /* renamed from: com.trello.rxlifecycle.a$3 */
    static class C183123 implements Func1<Object, Observable<Object>> {
        C183123() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m66305a(obj);
        }

        /* renamed from: a */
        public Observable<Object> m66305a(Object obj) {
            return Observable.a(new CancellationException());
        }
    }
}
