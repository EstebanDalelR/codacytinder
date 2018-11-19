package rx.internal.operators;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.C19566b;
import rx.Single;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.FuncN;
import rx.p498c.C19401c;
import rx.p500e.C19573b;

public final class bq {
    /* renamed from: a */
    public static <T, R> Single<R> m69907a(final Single<? extends T>[] singleArr, final FuncN<? extends R> funcN) {
        return Single.m69745a(new OnSubscribe<R>() {
            public /* synthetic */ void call(Object obj) {
                m71599a((C19566b) obj);
            }

            /* renamed from: a */
            public void m71599a(C19566b<? super R> c19566b) {
                if (singleArr.length == 0) {
                    c19566b.onError(new NoSuchElementException("Can't zip 0 Singles."));
                    return;
                }
                AtomicInteger atomicInteger = new AtomicInteger(singleArr.length);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                Object[] objArr = new Object[singleArr.length];
                Subscription c19573b = new C19573b();
                c19566b.m70541a(c19573b);
                int i = 0;
                while (i < singleArr.length && !c19573b.isUnsubscribed()) {
                    if (atomicBoolean.get()) {
                        break;
                    }
                    final Object[] objArr2 = objArr;
                    final int i2 = i;
                    final AtomicInteger atomicInteger2 = atomicInteger;
                    final C19566b<? super R> c19566b2 = c19566b;
                    final AtomicBoolean atomicBoolean2 = atomicBoolean;
                    C19566b c197271 = new C19566b<T>(this) {
                        /* renamed from: f */
                        final /* synthetic */ C198751 f61715f;

                        /* renamed from: a */
                        public void mo14737a(T t) {
                            objArr2[i2] = t;
                            if (atomicInteger2.decrementAndGet() == null) {
                                try {
                                    c19566b2.mo14737a(funcN.call(objArr2));
                                } catch (T t2) {
                                    C19410a.m69874b(t2);
                                    onError(t2);
                                }
                            }
                        }

                        public void onError(Throwable th) {
                            if (atomicBoolean2.compareAndSet(false, true)) {
                                c19566b2.onError(th);
                            } else {
                                C19401c.m69811a(th);
                            }
                        }
                    };
                    c19573b.m70548a((Subscription) c197271);
                    if (c19573b.isUnsubscribed()) {
                        break;
                    } else if (atomicBoolean.get()) {
                        break;
                    } else {
                        singleArr[i].m69762a(c197271);
                        i++;
                    }
                }
            }
        });
    }
}
