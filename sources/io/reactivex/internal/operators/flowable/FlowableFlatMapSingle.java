package io.reactivex.internal.operators.flowable;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
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

public final class FlowableFlatMapSingle<T, R> extends C18364a<T, R> {
    /* renamed from: c */
    final Function<? super T, ? extends SingleSource<? extends R>> f58827c;
    /* renamed from: d */
    final boolean f58828d;
    /* renamed from: e */
    final int f58829e;

    static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        /* renamed from: a */
        final Subscriber<? super R> f56955a;
        /* renamed from: b */
        final boolean f56956b;
        /* renamed from: c */
        final int f56957c;
        /* renamed from: d */
        final AtomicLong f56958d = new AtomicLong();
        /* renamed from: e */
        final C17356a f56959e = new C17356a();
        /* renamed from: f */
        final AtomicInteger f56960f = new AtomicInteger(1);
        /* renamed from: g */
        final AtomicThrowable f56961g = new AtomicThrowable();
        /* renamed from: h */
        final Function<? super T, ? extends SingleSource<? extends R>> f56962h;
        /* renamed from: i */
        final AtomicReference<C18423a<R>> f56963i = new AtomicReference();
        /* renamed from: j */
        Subscription f56964j;
        /* renamed from: k */
        volatile boolean f56965k;

        final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;
            /* renamed from: a */
            final /* synthetic */ FlatMapSingleSubscriber f53228a;

            InnerObserver(FlatMapSingleSubscriber flatMapSingleSubscriber) {
                this.f53228a = flatMapSingleSubscriber;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onSuccess(R r) {
                this.f53228a.m66444a(this, (Object) r);
            }

            public void onError(Throwable th) {
                this.f53228a.m66445a(this, th);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }

        FlatMapSingleSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
            this.f56955a = subscriber;
            this.f56962h = function;
            this.f56956b = z;
            this.f56957c = i;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56964j, subscription)) {
                this.f56964j = subscription;
                this.f56955a.onSubscribe(this);
                if (this.f56957c == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
                } else {
                    subscription.request((long) this.f56957c);
                }
            }
        }

        public void onNext(T t) {
            try {
                SingleSource singleSource = (SingleSource) C15684a.m58895a(this.f56962h.apply(t), "The mapper returned a null SingleSource");
                this.f56960f.getAndIncrement();
                Object innerObserver = new InnerObserver(this);
                if (!this.f56965k && this.f56959e.add(innerObserver)) {
                    singleSource.subscribe(innerObserver);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f56964j.cancel();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f56960f.decrementAndGet();
            if (this.f56961g.m58961a(th)) {
                if (this.f56956b == null) {
                    this.f56959e.dispose();
                }
                m66446b();
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f56960f.decrementAndGet();
            m66446b();
        }

        public void cancel() {
            this.f56965k = true;
            this.f56964j.cancel();
            this.f56959e.dispose();
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f56958d, j);
                m66446b();
            }
        }

        /* renamed from: a */
        void m66444a(InnerObserver innerObserver, R r) {
            this.f56959e.delete(innerObserver);
            if (get() == null) {
                innerObserver = true;
                if (compareAndSet(0, 1)) {
                    if (this.f56960f.decrementAndGet() != 0) {
                        innerObserver = null;
                    }
                    if (this.f56958d.get() != 0) {
                        this.f56955a.onNext(r);
                        C18423a c18423a = (C18423a) this.f56963i.get();
                        if (innerObserver == null || (c18423a != null && c18423a.isEmpty() == null)) {
                            C15735a.m58969c(this.f56958d, 1);
                            if (this.f56957c != Integer.MAX_VALUE) {
                                this.f56964j.request(1);
                            }
                        } else {
                            innerObserver = this.f56961g.m58960a();
                            if (innerObserver != null) {
                                this.f56955a.onError(innerObserver);
                            } else {
                                this.f56955a.onComplete();
                            }
                            return;
                        }
                    }
                    innerObserver = m66443a();
                    synchronized (innerObserver) {
                        innerObserver.offer(r);
                    }
                    if (decrementAndGet() == null) {
                        return;
                    }
                    m66448d();
                }
            }
            innerObserver = m66443a();
            synchronized (innerObserver) {
                innerObserver.offer(r);
            }
            this.f56960f.decrementAndGet();
            if (getAndIncrement() != null) {
                return;
            }
            m66448d();
        }

        /* renamed from: a */
        C18423a<R> m66443a() {
            C18423a<R> c18423a;
            do {
                c18423a = (C18423a) this.f56963i.get();
                if (c18423a != null) {
                    return c18423a;
                }
                c18423a = new C18423a(C3957b.a());
            } while (!this.f56963i.compareAndSet(null, c18423a));
            return c18423a;
        }

        /* renamed from: a */
        void m66445a(InnerObserver innerObserver, Throwable th) {
            this.f56959e.delete(innerObserver);
            if (this.f56961g.m58961a(th) != null) {
                if (this.f56956b == null) {
                    this.f56964j.cancel();
                    this.f56959e.dispose();
                } else if (this.f56957c != Integer.MAX_VALUE) {
                    this.f56964j.request(1);
                }
                this.f56960f.decrementAndGet();
                m66446b();
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: b */
        void m66446b() {
            if (getAndIncrement() == 0) {
                m66448d();
            }
        }

        /* renamed from: c */
        void m66447c() {
            C18423a c18423a = (C18423a) this.f56963i.get();
            if (c18423a != null) {
                c18423a.clear();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: d */
        void m66448d() {
            /*
            r15 = this;
            r0 = r15.f56955a;
            r1 = r15.f56960f;
            r2 = r15.f56963i;
            r3 = 1;
            r4 = 1;
        L_0x0008:
            r5 = r15.f56958d;
            r5 = r5.get();
            r7 = 0;
            r9 = r7;
        L_0x0011:
            r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
            r12 = 0;
            if (r11 == 0) goto L_0x0075;
        L_0x0016:
            r11 = r15.f56965k;
            if (r11 == 0) goto L_0x001e;
        L_0x001a:
            r15.m66447c();
            return;
        L_0x001e:
            r11 = r15.f56956b;
            if (r11 != 0) goto L_0x0039;
        L_0x0022:
            r11 = r15.f56961g;
            r11 = r11.get();
            r11 = (java.lang.Throwable) r11;
            if (r11 == 0) goto L_0x0039;
        L_0x002c:
            r1 = r15.f56961g;
            r1 = r1.m58960a();
            r15.m66447c();
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
            r1 = r15.f56961g;
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
            r5 = r15.f56965k;
            if (r5 == 0) goto L_0x0081;
        L_0x007d:
            r15.m66447c();
            return;
        L_0x0081:
            r5 = r15.f56956b;
            if (r5 != 0) goto L_0x009c;
        L_0x0085:
            r5 = r15.f56961g;
            r5 = r5.get();
            r5 = (java.lang.Throwable) r5;
            if (r5 == 0) goto L_0x009c;
        L_0x008f:
            r1 = r15.f56961g;
            r1 = r1.m58960a();
            r15.m66447c();
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
            r1 = r15.f56961g;
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
            r5 = r15.f56958d;
            io.reactivex.internal.util.C15735a.m58969c(r5, r9);
            r5 = r15.f56957c;
            r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
            if (r5 == r6) goto L_0x00dd;
        L_0x00d8:
            r5 = r15.f56964j;
            r5.request(r9);
        L_0x00dd:
            r4 = -r4;
            r4 = r15.addAndGet(r4);
            if (r4 != 0) goto L_0x0008;
        L_0x00e4:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.d():void");
        }
    }

    public FlowableFlatMapSingle(C3957b<T> c3957b, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
        super(c3957b);
        this.f58827c = function;
        this.f58828d = z;
        this.f58829e = i;
    }

    /* renamed from: a */
    protected void m67578a(Subscriber<? super R> subscriber) {
        this.a.a(new FlatMapSingleSubscriber(subscriber, this.f58827c, this.f58828d, this.f58829e));
    }
}
