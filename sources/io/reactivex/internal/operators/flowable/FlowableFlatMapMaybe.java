package io.reactivex.internal.operators.flowable;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableFlatMapMaybe<T, R> extends C18364a<T, R> {
    /* renamed from: c */
    final Function<? super T, ? extends MaybeSource<? extends R>> f58824c;
    /* renamed from: d */
    final boolean f58825d;
    /* renamed from: e */
    final int f58826e;

    static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        /* renamed from: a */
        final Subscriber<? super R> f56944a;
        /* renamed from: b */
        final boolean f56945b;
        /* renamed from: c */
        final int f56946c;
        /* renamed from: d */
        final AtomicLong f56947d = new AtomicLong();
        /* renamed from: e */
        final C17356a f56948e = new C17356a();
        /* renamed from: f */
        final AtomicInteger f56949f = new AtomicInteger(1);
        /* renamed from: g */
        final AtomicThrowable f56950g = new AtomicThrowable();
        /* renamed from: h */
        final Function<? super T, ? extends MaybeSource<? extends R>> f56951h;
        /* renamed from: i */
        final AtomicReference<C18423a<R>> f56952i = new AtomicReference();
        /* renamed from: j */
        Subscription f56953j;
        /* renamed from: k */
        volatile boolean f56954k;

        final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;
            /* renamed from: a */
            final /* synthetic */ FlatMapMaybeSubscriber f53227a;

            InnerObserver(FlatMapMaybeSubscriber flatMapMaybeSubscriber) {
                this.f53227a = flatMapMaybeSubscriber;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onSuccess(R r) {
                this.f53227a.m66438a(this, (Object) r);
            }

            public void onError(Throwable th) {
                this.f53227a.m66439a(this, th);
            }

            public void onComplete() {
                this.f53227a.m66437a(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }

        FlatMapMaybeSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i) {
            this.f56944a = subscriber;
            this.f56951h = function;
            this.f56945b = z;
            this.f56946c = i;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56953j, subscription)) {
                this.f56953j = subscription;
                this.f56944a.onSubscribe(this);
                if (this.f56946c == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
                } else {
                    subscription.request((long) this.f56946c);
                }
            }
        }

        public void onNext(T t) {
            try {
                MaybeSource maybeSource = (MaybeSource) C15684a.m58895a(this.f56951h.apply(t), "The mapper returned a null MaybeSource");
                this.f56949f.getAndIncrement();
                Object innerObserver = new InnerObserver(this);
                if (!this.f56954k && this.f56948e.add(innerObserver)) {
                    maybeSource.subscribe(innerObserver);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f56953j.cancel();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f56949f.decrementAndGet();
            if (this.f56950g.m58961a(th)) {
                if (this.f56945b == null) {
                    this.f56948e.dispose();
                }
                m66440b();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f56949f.decrementAndGet();
            m66440b();
        }

        public void cancel() {
            this.f56954k = true;
            this.f56953j.cancel();
            this.f56948e.dispose();
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f56947d, j);
                m66440b();
            }
        }

        /* renamed from: a */
        void m66438a(InnerObserver innerObserver, R r) {
            this.f56948e.delete(innerObserver);
            if (get() == null) {
                innerObserver = true;
                if (compareAndSet(0, 1)) {
                    if (this.f56949f.decrementAndGet() != 0) {
                        innerObserver = null;
                    }
                    if (this.f56947d.get() != 0) {
                        this.f56944a.onNext(r);
                        C18423a c18423a = (C18423a) this.f56952i.get();
                        if (innerObserver == null || (c18423a != null && c18423a.isEmpty() == null)) {
                            C15735a.m58969c(this.f56947d, 1);
                            if (this.f56946c != Integer.MAX_VALUE) {
                                this.f56953j.request(1);
                            }
                        } else {
                            innerObserver = this.f56950g.m58960a();
                            if (innerObserver != null) {
                                this.f56944a.onError(innerObserver);
                            } else {
                                this.f56944a.onComplete();
                            }
                            return;
                        }
                    }
                    innerObserver = m66436a();
                    synchronized (innerObserver) {
                        innerObserver.offer(r);
                    }
                    if (decrementAndGet() == null) {
                        return;
                    }
                    m66442d();
                }
            }
            innerObserver = m66436a();
            synchronized (innerObserver) {
                innerObserver.offer(r);
            }
            this.f56949f.decrementAndGet();
            if (getAndIncrement() != null) {
                return;
            }
            m66442d();
        }

        /* renamed from: a */
        C18423a<R> m66436a() {
            C18423a<R> c18423a;
            do {
                c18423a = (C18423a) this.f56952i.get();
                if (c18423a != null) {
                    return c18423a;
                }
                c18423a = new C18423a(C3957b.a());
            } while (!this.f56952i.compareAndSet(null, c18423a));
            return c18423a;
        }

        /* renamed from: a */
        void m66439a(InnerObserver innerObserver, Throwable th) {
            this.f56948e.delete(innerObserver);
            if (this.f56950g.m58961a(th) != null) {
                if (this.f56945b == null) {
                    this.f56953j.cancel();
                    this.f56948e.dispose();
                } else if (this.f56946c != Integer.MAX_VALUE) {
                    this.f56953j.request(1);
                }
                this.f56949f.decrementAndGet();
                m66440b();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: a */
        void m66437a(InnerObserver innerObserver) {
            this.f56948e.delete(innerObserver);
            if (get() == null) {
                innerObserver = true;
                if (compareAndSet(0, 1)) {
                    if (this.f56949f.decrementAndGet() != 0) {
                        innerObserver = null;
                    }
                    C18423a c18423a = (C18423a) this.f56952i.get();
                    if (innerObserver == null || (c18423a != null && c18423a.isEmpty() == null)) {
                        if (this.f56946c != 2147483647) {
                            this.f56953j.request(1);
                        }
                        if (decrementAndGet() != null) {
                            m66442d();
                        }
                        return;
                    }
                    innerObserver = this.f56950g.m58960a();
                    if (innerObserver != null) {
                        this.f56944a.onError(innerObserver);
                    } else {
                        this.f56944a.onComplete();
                    }
                    return;
                }
            }
            this.f56949f.decrementAndGet();
            if (this.f56946c != 2147483647) {
                this.f56953j.request(1);
            }
            m66440b();
        }

        /* renamed from: b */
        void m66440b() {
            if (getAndIncrement() == 0) {
                m66442d();
            }
        }

        /* renamed from: c */
        void m66441c() {
            C18423a c18423a = (C18423a) this.f56952i.get();
            if (c18423a != null) {
                c18423a.clear();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: d */
        void m66442d() {
            /*
            r15 = this;
            r0 = r15.f56944a;
            r1 = r15.f56949f;
            r2 = r15.f56952i;
            r3 = 1;
            r4 = 1;
        L_0x0008:
            r5 = r15.f56947d;
            r5 = r5.get();
            r7 = 0;
            r9 = r7;
        L_0x0011:
            r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
            r12 = 0;
            if (r11 == 0) goto L_0x0075;
        L_0x0016:
            r11 = r15.f56954k;
            if (r11 == 0) goto L_0x001e;
        L_0x001a:
            r15.m66441c();
            return;
        L_0x001e:
            r11 = r15.f56945b;
            if (r11 != 0) goto L_0x0039;
        L_0x0022:
            r11 = r15.f56950g;
            r11 = r11.get();
            r11 = (java.lang.Throwable) r11;
            if (r11 == 0) goto L_0x0039;
        L_0x002c:
            r1 = r15.f56950g;
            r1 = r1.m58960a();
            r15.m66441c();
            r0.onError(r1);
            return;
        L_0x0039:
            r11 = r1.get();
            if (r11 != 0) goto L_0x0041;
        L_0x003f:
            r11 = 1;
            goto L_0x0042;
        L_0x0041:
            r11 = 0;
        L_0x0042:
            r13 = r2.get();
            r13 = (io.reactivex.internal.queue.C18423a) r13;
            if (r13 == 0) goto L_0x004f;
        L_0x004a:
            r13 = r13.poll();
            goto L_0x0050;
        L_0x004f:
            r13 = 0;
        L_0x0050:
            if (r13 != 0) goto L_0x0054;
        L_0x0052:
            r14 = 1;
            goto L_0x0055;
        L_0x0054:
            r14 = 0;
        L_0x0055:
            if (r11 == 0) goto L_0x0069;
        L_0x0057:
            if (r14 == 0) goto L_0x0069;
        L_0x0059:
            r1 = r15.f56950g;
            r1 = r1.m58960a();
            if (r1 == 0) goto L_0x0065;
        L_0x0061:
            r0.onError(r1);
            goto L_0x0068;
        L_0x0065:
            r0.onComplete();
        L_0x0068:
            return;
        L_0x0069:
            if (r14 == 0) goto L_0x006c;
        L_0x006b:
            goto L_0x0075;
        L_0x006c:
            r0.onNext(r13);
            r11 = 1;
            r13 = r9 + r11;
            r9 = r13;
            goto L_0x0011;
        L_0x0075:
            r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
            if (r11 != 0) goto L_0x00c8;
        L_0x0079:
            r5 = r15.f56954k;
            if (r5 == 0) goto L_0x0081;
        L_0x007d:
            r15.m66441c();
            return;
        L_0x0081:
            r5 = r15.f56945b;
            if (r5 != 0) goto L_0x009c;
        L_0x0085:
            r5 = r15.f56950g;
            r5 = r5.get();
            r5 = (java.lang.Throwable) r5;
            if (r5 == 0) goto L_0x009c;
        L_0x008f:
            r1 = r15.f56950g;
            r1 = r1.m58960a();
            r15.m66441c();
            r0.onError(r1);
            return;
        L_0x009c:
            r5 = r1.get();
            if (r5 != 0) goto L_0x00a4;
        L_0x00a2:
            r5 = 1;
            goto L_0x00a5;
        L_0x00a4:
            r5 = 0;
        L_0x00a5:
            r6 = r2.get();
            r6 = (io.reactivex.internal.queue.C18423a) r6;
            if (r6 == 0) goto L_0x00b3;
        L_0x00ad:
            r6 = r6.isEmpty();
            if (r6 == 0) goto L_0x00b4;
        L_0x00b3:
            r12 = 1;
        L_0x00b4:
            if (r5 == 0) goto L_0x00c8;
        L_0x00b6:
            if (r12 == 0) goto L_0x00c8;
        L_0x00b8:
            r1 = r15.f56950g;
            r1 = r1.m58960a();
            if (r1 == 0) goto L_0x00c4;
        L_0x00c0:
            r0.onError(r1);
            goto L_0x00c7;
        L_0x00c4:
            r0.onComplete();
        L_0x00c7:
            return;
        L_0x00c8:
            r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
            if (r5 == 0) goto L_0x00dd;
        L_0x00cc:
            r5 = r15.f56947d;
            io.reactivex.internal.util.C15735a.m58969c(r5, r9);
            r5 = r15.f56946c;
            r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
            if (r5 == r6) goto L_0x00dd;
        L_0x00d8:
            r5 = r15.f56953j;
            r5.request(r9);
        L_0x00dd:
            r4 = -r4;
            r4 = r15.addAndGet(r4);
            if (r4 != 0) goto L_0x0008;
        L_0x00e4:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.d():void");
        }
    }

    public FlowableFlatMapMaybe(C3957b<T> c3957b, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i) {
        super(c3957b);
        this.f58824c = function;
        this.f58825d = z;
        this.f58826e = i;
    }

    /* renamed from: a */
    protected void m67577a(Subscriber<? super R> subscriber) {
        this.a.a(new FlatMapMaybeSubscriber(subscriber, this.f58824c, this.f58825d, this.f58826e));
    }
}
