package rx.internal.operators;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.C2671a;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Func0;
import rx.internal.util.C19444e;
import rx.p497b.C19565b;
import rx.p500e.C19407e;
import rx.schedulers.C19453a;

public final class OperatorReplay<T> extends C19565b<T> implements Subscription {
    /* renamed from: e */
    static final Func0 f61548e = new C196781();
    /* renamed from: b */
    final Observable<? extends T> f61549b;
    /* renamed from: c */
    final AtomicReference<C19681b<T>> f61550c;
    /* renamed from: d */
    final Func0<? extends C19418a<T>> f61551d;

    static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        /* renamed from: a */
        final Object f60600a;
        /* renamed from: b */
        final long f60601b;

        public Node(Object obj, long j) {
            this.f60600a = obj;
            this.f60601b = j;
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$a */
    interface C19418a<T> {
        /* renamed from: a */
        void mo14692a(T t);

        /* renamed from: a */
        void mo14693a(Throwable th);

        /* renamed from: a */
        void mo14694a(InnerProducer<T> innerProducer);

        /* renamed from: c */
        void mo14695c();
    }

    static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements C19418a<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        /* renamed from: a */
        Node f61171a;
        /* renamed from: b */
        int f61172b;
        /* renamed from: c */
        long f61173c;

        /* renamed from: b */
        Object mo14749b(Object obj) {
            return obj;
        }

        /* renamed from: c */
        Object mo14751c(Object obj) {
            return obj;
        }

        /* renamed from: d */
        void mo14752d() {
        }

        /* renamed from: e */
        void mo14753e() {
        }

        public BoundedReplayBuffer() {
            Node node = new Node(null, 0);
            this.f61171a = node;
            set(node);
        }

        /* renamed from: a */
        final void m70582a(Node node) {
            this.f61171a.set(node);
            this.f61171a = node;
            this.f61172b++;
        }

        /* renamed from: a */
        final void m70578a() {
            Node node = (Node) ((Node) get()).get();
            if (node == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.f61172b--;
            m70585b(node);
        }

        /* renamed from: b */
        final void m70585b(Node node) {
            set(node);
        }

        /* renamed from: b */
        Node mo14750b() {
            return (Node) get();
        }

        /* renamed from: a */
        public final void mo14692a(T t) {
            t = mo14749b(NotificationLite.m69885a((Object) t));
            long j = this.f61173c + 1;
            this.f61173c = j;
            m70582a(new Node(t, j));
            mo14752d();
        }

        /* renamed from: a */
        public final void mo14693a(Throwable th) {
            th = mo14749b(NotificationLite.m69886a(th));
            long j = this.f61173c + 1;
            this.f61173c = j;
            m70582a(new Node(th, j));
            mo14753e();
        }

        /* renamed from: c */
        public final void mo14695c() {
            Object b = mo14749b(NotificationLite.m69884a());
            long j = this.f61173c + 1;
            this.f61173c = j;
            m70582a(new Node(b, j));
            mo14753e();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public final void mo14694a(rx.internal.operators.OperatorReplay.InnerProducer<T> r14) {
            /*
            r13 = this;
            monitor-enter(r14);
            r0 = r14.f61178e;	 Catch:{ all -> 0x00a9 }
            r1 = 1;
            if (r0 == 0) goto L_0x000a;
        L_0x0006:
            r14.f61179f = r1;	 Catch:{ all -> 0x00a9 }
            monitor-exit(r14);	 Catch:{ all -> 0x00a9 }
            return;
        L_0x000a:
            r14.f61178e = r1;	 Catch:{ all -> 0x00a9 }
            monitor-exit(r14);	 Catch:{ all -> 0x00a9 }
        L_0x000d:
            r0 = r14.isUnsubscribed();
            if (r0 == 0) goto L_0x0014;
        L_0x0013:
            return;
        L_0x0014:
            r0 = r14.m70590a();
            r0 = (rx.internal.operators.OperatorReplay.Node) r0;
            if (r0 != 0) goto L_0x0027;
        L_0x001c:
            r0 = r13.mo14750b();
            r14.f61176c = r0;
            r1 = r0.f60601b;
            r14.m70591a(r1);
        L_0x0027:
            r1 = r14.isUnsubscribed();
            if (r1 == 0) goto L_0x002e;
        L_0x002d:
            return;
        L_0x002e:
            r1 = r14.f61175b;
            if (r1 != 0) goto L_0x0033;
        L_0x0032:
            return;
        L_0x0033:
            r2 = r14.get();
            r4 = 0;
            r6 = r4;
        L_0x003a:
            r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
            if (r8 == 0) goto L_0x0085;
        L_0x003e:
            r8 = r0.get();
            r8 = (rx.internal.operators.OperatorReplay.Node) r8;
            if (r8 == 0) goto L_0x0085;
        L_0x0046:
            r0 = r8.f60600a;
            r0 = r13.mo14751c(r0);
            r9 = 0;
            r10 = rx.internal.operators.NotificationLite.m69887a(r1, r0);	 Catch:{ Throwable -> 0x0064 }
            if (r10 == 0) goto L_0x0056;
        L_0x0053:
            r14.f61176c = r9;	 Catch:{ Throwable -> 0x0064 }
            return;
        L_0x0056:
            r9 = 1;
            r11 = r6 + r9;
            r0 = r14.isUnsubscribed();
            if (r0 == 0) goto L_0x0061;
        L_0x0060:
            return;
        L_0x0061:
            r0 = r8;
            r6 = r11;
            goto L_0x003a;
        L_0x0064:
            r2 = move-exception;
            r14.f61176c = r9;
            rx.exceptions.C19410a.m69874b(r2);
            r14.unsubscribe();
            r14 = rx.internal.operators.NotificationLite.m69889c(r0);
            if (r14 != 0) goto L_0x0084;
        L_0x0073:
            r14 = rx.internal.operators.NotificationLite.m69888b(r0);
            if (r14 != 0) goto L_0x0084;
        L_0x0079:
            r14 = rx.internal.operators.NotificationLite.m69891e(r0);
            r14 = rx.exceptions.OnErrorThrowable.m69866a(r2, r14);
            r1.onError(r14);
        L_0x0084:
            return;
        L_0x0085:
            r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
            if (r1 == 0) goto L_0x0097;
        L_0x0089:
            r14.f61176c = r0;
            r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
            if (r4 == 0) goto L_0x0097;
        L_0x0094:
            r14.m70592b(r6);
        L_0x0097:
            monitor-enter(r14);
            r0 = r14.f61179f;	 Catch:{ all -> 0x00a6 }
            r1 = 0;
            if (r0 != 0) goto L_0x00a1;
        L_0x009d:
            r14.f61178e = r1;	 Catch:{ all -> 0x00a6 }
            monitor-exit(r14);	 Catch:{ all -> 0x00a6 }
            return;
        L_0x00a1:
            r14.f61179f = r1;	 Catch:{ all -> 0x00a6 }
            monitor-exit(r14);	 Catch:{ all -> 0x00a6 }
            goto L_0x000d;
        L_0x00a6:
            r0 = move-exception;
            monitor-exit(r14);	 Catch:{ all -> 0x00a6 }
            throw r0;
        L_0x00a9:
            r0 = move-exception;
            monitor-exit(r14);	 Catch:{ all -> 0x00a9 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.BoundedReplayBuffer.a(rx.internal.operators.OperatorReplay$InnerProducer):void");
        }
    }

    static final class InnerProducer<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        /* renamed from: a */
        final C19681b<T> f61174a;
        /* renamed from: b */
        C19571c<? super T> f61175b;
        /* renamed from: c */
        Object f61176c;
        /* renamed from: d */
        final AtomicLong f61177d = new AtomicLong();
        /* renamed from: e */
        boolean f61178e;
        /* renamed from: f */
        boolean f61179f;

        public InnerProducer(C19681b<T> c19681b, C19571c<? super T> c19571c) {
            this.f61174a = c19681b;
            this.f61175b = c19571c;
        }

        public void request(long j) {
            if (j >= 0) {
                long j2;
                long j3;
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 < 0 || j != 0) {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Format.OFFSET_SAMPLE_RELATIVE;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                } while (!compareAndSet(j2, j3));
                m70591a(j);
                this.f61174a.m70947c(this);
                this.f61174a.f61533a.mo14694a(this);
            }
        }

        /* renamed from: a */
        void m70591a(long j) {
            long j2;
            long j3;
            do {
                j2 = this.f61177d.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Format.OFFSET_SAMPLE_RELATIVE;
                }
            } while (!this.f61177d.compareAndSet(j2, j3));
        }

        /* renamed from: b */
        public long m70592b(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            long j2;
            long j3;
            do {
                j3 = get();
                if (j3 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j2 = j3 - j;
                if (j2 < 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("More produced (");
                    stringBuilder.append(j);
                    stringBuilder.append(") than requested (");
                    stringBuilder.append(j3);
                    stringBuilder.append(")");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            } while (!compareAndSet(j3, j2));
            return j2;
        }

        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f61174a.m70944b(this);
                this.f61174a.m70947c(this);
                this.f61175b = null;
            }
        }

        /* renamed from: a */
        <U> U m70590a() {
            return this.f61176c;
        }
    }

    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements C19418a<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        /* renamed from: a */
        volatile int f61180a;

        public UnboundedReplayBuffer(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo14692a(T t) {
            add(NotificationLite.m69885a((Object) t));
            this.f61180a++;
        }

        /* renamed from: a */
        public void mo14693a(Throwable th) {
            add(NotificationLite.m69886a(th));
            this.f61180a++;
        }

        /* renamed from: c */
        public void mo14695c() {
            add(NotificationLite.m69884a());
            this.f61180a++;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public void mo14694a(rx.internal.operators.OperatorReplay.InnerProducer<T> r15) {
            /*
            r14 = this;
            monitor-enter(r15);
            r0 = r15.f61178e;	 Catch:{ all -> 0x0097 }
            r1 = 1;
            if (r0 == 0) goto L_0x000a;
        L_0x0006:
            r15.f61179f = r1;	 Catch:{ all -> 0x0097 }
            monitor-exit(r15);	 Catch:{ all -> 0x0097 }
            return;
        L_0x000a:
            r15.f61178e = r1;	 Catch:{ all -> 0x0097 }
            monitor-exit(r15);	 Catch:{ all -> 0x0097 }
        L_0x000d:
            r0 = r15.isUnsubscribed();
            if (r0 == 0) goto L_0x0014;
        L_0x0013:
            return;
        L_0x0014:
            r0 = r14.f61180a;
            r1 = r15.m70590a();
            r1 = (java.lang.Integer) r1;
            r2 = 0;
            if (r1 == 0) goto L_0x0024;
        L_0x001f:
            r1 = r1.intValue();
            goto L_0x0025;
        L_0x0024:
            r1 = 0;
        L_0x0025:
            r3 = r15.f61175b;
            if (r3 != 0) goto L_0x002a;
        L_0x0029:
            return;
        L_0x002a:
            r4 = r15.get();
            r6 = 0;
            r8 = r6;
        L_0x0031:
            r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            if (r10 == 0) goto L_0x0070;
        L_0x0035:
            if (r1 >= r0) goto L_0x0070;
        L_0x0037:
            r10 = r14.get(r1);
            r11 = rx.internal.operators.NotificationLite.m69887a(r3, r10);	 Catch:{ Throwable -> 0x0051 }
            if (r11 == 0) goto L_0x0042;
        L_0x0041:
            return;
        L_0x0042:
            r10 = r15.isUnsubscribed();
            if (r10 == 0) goto L_0x0049;
        L_0x0048:
            return;
        L_0x0049:
            r1 = r1 + 1;
            r10 = 1;
            r12 = r8 + r10;
            r8 = r12;
            goto L_0x0031;
        L_0x0051:
            r0 = move-exception;
            rx.exceptions.C19410a.m69874b(r0);
            r15.unsubscribe();
            r15 = rx.internal.operators.NotificationLite.m69889c(r10);
            if (r15 != 0) goto L_0x006f;
        L_0x005e:
            r15 = rx.internal.operators.NotificationLite.m69888b(r10);
            if (r15 != 0) goto L_0x006f;
        L_0x0064:
            r15 = rx.internal.operators.NotificationLite.m69891e(r10);
            r15 = rx.exceptions.OnErrorThrowable.m69866a(r0, r15);
            r3.onError(r15);
        L_0x006f:
            return;
        L_0x0070:
            r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            if (r0 == 0) goto L_0x0086;
        L_0x0074:
            r0 = java.lang.Integer.valueOf(r1);
            r15.f61176c = r0;
            r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
            if (r3 == 0) goto L_0x0086;
        L_0x0083:
            r15.m70592b(r8);
        L_0x0086:
            monitor-enter(r15);
            r0 = r15.f61179f;	 Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x008f;
        L_0x008b:
            r15.f61178e = r2;	 Catch:{ all -> 0x0094 }
            monitor-exit(r15);	 Catch:{ all -> 0x0094 }
            return;
        L_0x008f:
            r15.f61179f = r2;	 Catch:{ all -> 0x0094 }
            monitor-exit(r15);	 Catch:{ all -> 0x0094 }
            goto L_0x000d;
        L_0x0094:
            r0 = move-exception;
            monitor-exit(r15);	 Catch:{ all -> 0x0094 }
            throw r0;
        L_0x0097:
            r0 = move-exception;
            monitor-exit(r15);	 Catch:{ all -> 0x0097 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.UnboundedReplayBuffer.a(rx.internal.operators.OperatorReplay$InnerProducer):void");
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$1 */
    static class C196781 implements Func0 {
        C196781() {
        }

        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        /* renamed from: d */
        final C2671a f61527d;
        /* renamed from: e */
        final long f61528e;
        /* renamed from: f */
        final int f61529f;

        public SizeAndTimeBoundReplayBuffer(int i, long j, C2671a c2671a) {
            this.f61527d = c2671a;
            this.f61529f = i;
            this.f61528e = j;
        }

        /* renamed from: b */
        Object mo14749b(Object obj) {
            return new C19453a(this.f61527d.now(), obj);
        }

        /* renamed from: c */
        Object mo14751c(Object obj) {
            return ((C19453a) obj).m69995b();
        }

        /* renamed from: b */
        Node mo14750b() {
            long now = this.f61527d.now() - this.f61528e;
            Node node = (Node) get();
            Node node2 = (Node) node.get();
            while (true) {
                Node node3 = node2;
                node2 = node;
                node = node3;
                if (node == null) {
                    break;
                }
                Object obj = node.f60600a;
                Object c = mo14751c(obj);
                if (!NotificationLite.m69888b(c)) {
                    if (!NotificationLite.m69889c(c)) {
                        if (((C19453a) obj).m69994a() > now) {
                            break;
                        }
                        node2 = (Node) node.get();
                    } else {
                        break;
                    }
                }
                break;
            }
            return node2;
        }

        /* renamed from: d */
        void mo14752d() {
            long now = this.f61527d.now() - this.f61528e;
            Node node = (Node) get();
            Node node2 = (Node) node.get();
            int i = 0;
            while (true) {
                Node node3 = node2;
                node2 = node;
                node = node3;
                if (node != null) {
                    if (this.b <= this.f61529f) {
                        if (((C19453a) node.f60600a).m69994a() > now) {
                            break;
                        }
                        i++;
                        this.b--;
                        node2 = (Node) node.get();
                    } else {
                        i++;
                        this.b--;
                        node2 = (Node) node.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                m70585b(node2);
            }
        }

        /* renamed from: e */
        void mo14753e() {
            long now = this.f61527d.now() - this.f61528e;
            Node node = (Node) get();
            Node node2 = (Node) node.get();
            int i = 0;
            while (true) {
                Node node3 = node2;
                node2 = node;
                node = node3;
                if (node != null && this.b > 1 && ((C19453a) node.f60600a).m69994a() <= now) {
                    i++;
                    this.b--;
                    node2 = (Node) node.get();
                } else if (i != 0) {
                    m70585b(node2);
                }
            }
            if (i != 0) {
                m70585b(node2);
            }
        }
    }

    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        /* renamed from: d */
        final int f61530d;

        public SizeBoundReplayBuffer(int i) {
            this.f61530d = i;
        }

        /* renamed from: d */
        void mo14752d() {
            if (this.b > this.f61530d) {
                m70578a();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$b */
    static final class C19681b<T> extends C19571c<T> implements Subscription {
        /* renamed from: c */
        static final InnerProducer[] f61531c = new InnerProducer[0];
        /* renamed from: d */
        static final InnerProducer[] f61532d = new InnerProducer[0];
        /* renamed from: a */
        final C19418a<T> f61533a;
        /* renamed from: b */
        boolean f61534b;
        /* renamed from: e */
        volatile boolean f61535e;
        /* renamed from: f */
        final C19444e<InnerProducer<T>> f61536f = new C19444e();
        /* renamed from: g */
        InnerProducer<T>[] f61537g = f61531c;
        /* renamed from: h */
        volatile long f61538h;
        /* renamed from: i */
        long f61539i;
        /* renamed from: j */
        final AtomicBoolean f61540j = new AtomicBoolean();
        /* renamed from: k */
        boolean f61541k;
        /* renamed from: l */
        boolean f61542l;
        /* renamed from: m */
        long f61543m;
        /* renamed from: n */
        long f61544n;
        /* renamed from: o */
        volatile Producer f61545o;
        /* renamed from: p */
        List<InnerProducer<T>> f61546p;
        /* renamed from: q */
        boolean f61547q;

        /* renamed from: rx.internal.operators.OperatorReplay$b$1 */
        class C198181 implements Action0 {
            /* renamed from: a */
            final /* synthetic */ C19681b f61978a;

            C198181(C19681b c19681b) {
                this.f61978a = c19681b;
            }

            public void call() {
                if (!this.f61978a.f61535e) {
                    synchronized (this.f61978a.f61536f) {
                        if (!this.f61978a.f61535e) {
                            this.f61978a.f61536f.m69973a();
                            C19681b c19681b = this.f61978a;
                            c19681b.f61538h++;
                            this.f61978a.f61535e = true;
                        }
                    }
                }
            }
        }

        public C19681b(C19418a<T> c19418a) {
            this.f61533a = c19418a;
            request(0);
        }

        /* renamed from: a */
        void m70941a() {
            add(C19407e.m69854a(new C198181(this)));
        }

        /* renamed from: a */
        boolean m70943a(InnerProducer<T> innerProducer) {
            if (innerProducer == null) {
                throw new NullPointerException();
            } else if (this.f61535e) {
                return false;
            } else {
                synchronized (this.f61536f) {
                    if (this.f61535e) {
                        return false;
                    }
                    this.f61536f.m69975a((Object) innerProducer);
                    this.f61538h++;
                    return true;
                }
            }
        }

        /* renamed from: b */
        void m70944b(InnerProducer<T> innerProducer) {
            if (!this.f61535e) {
                synchronized (this.f61536f) {
                    if (this.f61535e) {
                        return;
                    }
                    this.f61536f.m69977b(innerProducer);
                    if (this.f61536f.m69978c() != null) {
                        this.f61537g = f61531c;
                    }
                    this.f61538h++;
                }
            }
        }

        public void setProducer(Producer producer) {
            if (this.f61545o != null) {
                throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
            }
            this.f61545o = producer;
            m70947c(null);
            m70946c();
        }

        public void onNext(T t) {
            if (!this.f61534b) {
                this.f61533a.mo14692a((Object) t);
                m70946c();
            }
        }

        public void onError(Throwable th) {
            if (!this.f61534b) {
                this.f61534b = true;
                try {
                    this.f61533a.mo14693a(th);
                    m70946c();
                } finally {
                    unsubscribe();
                }
            }
        }

        public void onCompleted() {
            if (!this.f61534b) {
                this.f61534b = true;
                try {
                    this.f61533a.mo14695c();
                    m70946c();
                } finally {
                    unsubscribe();
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: c */
        void m70947c(rx.internal.operators.OperatorReplay.InnerProducer<T> r10) {
            /*
            r9 = this;
            r0 = r9.isUnsubscribed();
            if (r0 == 0) goto L_0x0007;
        L_0x0006:
            return;
        L_0x0007:
            monitor-enter(r9);
            r0 = r9.f61541k;	 Catch:{ all -> 0x00b4 }
            r1 = 1;
            if (r0 == 0) goto L_0x0024;
        L_0x000d:
            if (r10 == 0) goto L_0x001e;
        L_0x000f:
            r0 = r9.f61546p;	 Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x001a;
        L_0x0013:
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x00b4 }
            r0.<init>();	 Catch:{ all -> 0x00b4 }
            r9.f61546p = r0;	 Catch:{ all -> 0x00b4 }
        L_0x001a:
            r0.add(r10);	 Catch:{ all -> 0x00b4 }
            goto L_0x0020;
        L_0x001e:
            r9.f61547q = r1;	 Catch:{ all -> 0x00b4 }
        L_0x0020:
            r9.f61542l = r1;	 Catch:{ all -> 0x00b4 }
            monitor-exit(r9);	 Catch:{ all -> 0x00b4 }
            return;
        L_0x0024:
            r9.f61541k = r1;	 Catch:{ all -> 0x00b4 }
            monitor-exit(r9);	 Catch:{ all -> 0x00b4 }
            r0 = r9.f61543m;
            r2 = 0;
            if (r10 == 0) goto L_0x0037;
        L_0x002c:
            r10 = r10.f61177d;
            r3 = r10.get();
            r3 = java.lang.Math.max(r0, r3);
            goto L_0x0052;
        L_0x0037:
            r10 = r9.m70945b();
            r3 = r10.length;
            r5 = r0;
            r4 = 0;
        L_0x003e:
            if (r4 >= r3) goto L_0x0051;
        L_0x0040:
            r7 = r10[r4];
            if (r7 == 0) goto L_0x004e;
        L_0x0044:
            r7 = r7.f61177d;
            r7 = r7.get();
            r5 = java.lang.Math.max(r5, r7);
        L_0x004e:
            r4 = r4 + 1;
            goto L_0x003e;
        L_0x0051:
            r3 = r5;
        L_0x0052:
            r9.m70942a(r3, r0);
        L_0x0055:
            r10 = r9.isUnsubscribed();
            if (r10 == 0) goto L_0x005c;
        L_0x005b:
            return;
        L_0x005c:
            monitor-enter(r9);
            r10 = r9.f61542l;	 Catch:{ all -> 0x00b1 }
            if (r10 != 0) goto L_0x0065;
        L_0x0061:
            r9.f61541k = r2;	 Catch:{ all -> 0x00b1 }
            monitor-exit(r9);	 Catch:{ all -> 0x00b1 }
            return;
        L_0x0065:
            r9.f61542l = r2;	 Catch:{ all -> 0x00b1 }
            r10 = r9.f61546p;	 Catch:{ all -> 0x00b1 }
            r0 = 0;
            r9.f61546p = r0;	 Catch:{ all -> 0x00b1 }
            r0 = r9.f61547q;	 Catch:{ all -> 0x00b1 }
            r9.f61547q = r2;	 Catch:{ all -> 0x00b1 }
            monitor-exit(r9);	 Catch:{ all -> 0x00b1 }
            r3 = r9.f61543m;
            if (r10 == 0) goto L_0x0091;
        L_0x0075:
            r10 = r10.iterator();
            r5 = r3;
        L_0x007a:
            r1 = r10.hasNext();
            if (r1 == 0) goto L_0x0092;
        L_0x0080:
            r1 = r10.next();
            r1 = (rx.internal.operators.OperatorReplay.InnerProducer) r1;
            r1 = r1.f61177d;
            r7 = r1.get();
            r5 = java.lang.Math.max(r5, r7);
            goto L_0x007a;
        L_0x0091:
            r5 = r3;
        L_0x0092:
            if (r0 == 0) goto L_0x00ad;
        L_0x0094:
            r10 = r9.m70945b();
            r0 = r10.length;
            r1 = 0;
        L_0x009a:
            if (r1 >= r0) goto L_0x00ad;
        L_0x009c:
            r7 = r10[r1];
            if (r7 == 0) goto L_0x00aa;
        L_0x00a0:
            r7 = r7.f61177d;
            r7 = r7.get();
            r5 = java.lang.Math.max(r5, r7);
        L_0x00aa:
            r1 = r1 + 1;
            goto L_0x009a;
        L_0x00ad:
            r9.m70942a(r5, r3);
            goto L_0x0055;
        L_0x00b1:
            r10 = move-exception;
            monitor-exit(r9);	 Catch:{ all -> 0x00b1 }
            throw r10;
        L_0x00b4:
            r10 = move-exception;
            monitor-exit(r9);	 Catch:{ all -> 0x00b4 }
            throw r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.b.c(rx.internal.operators.OperatorReplay$InnerProducer):void");
        }

        /* renamed from: b */
        InnerProducer<T>[] m70945b() {
            Object obj;
            synchronized (this.f61536f) {
                Object d = this.f61536f.m69979d();
                int length = d.length;
                obj = new InnerProducer[length];
                System.arraycopy(d, 0, obj, 0, length);
            }
            return obj;
        }

        /* renamed from: a */
        void m70942a(long j, long j2) {
            long j3 = this.f61544n;
            Producer producer = this.f61545o;
            long j4 = j - j2;
            if (j4 != 0) {
                this.f61543m = j;
                if (producer == null) {
                    j = j3 + j4;
                    if (j < 0) {
                        j = Format.OFFSET_SAMPLE_RELATIVE;
                    }
                    this.f61544n = j;
                } else if (j3 != 0) {
                    this.f61544n = 0;
                    producer.request(j3 + j4);
                } else {
                    producer.request(j4);
                }
            } else if (j3 != 0 && producer != null) {
                this.f61544n = 0;
                producer.request(j3);
            }
        }

        /* renamed from: c */
        void m70946c() {
            InnerProducer[] innerProducerArr = this.f61537g;
            int i = 0;
            if (this.f61539i != this.f61538h) {
                synchronized (this.f61536f) {
                    innerProducerArr = this.f61537g;
                    Object d = this.f61536f.m69979d();
                    int length = d.length;
                    if (innerProducerArr.length != length) {
                        innerProducerArr = new InnerProducer[length];
                        this.f61537g = innerProducerArr;
                    }
                    System.arraycopy(d, 0, innerProducerArr, 0, length);
                    this.f61539i = this.f61538h;
                }
            }
            C19418a c19418a = this.f61533a;
            int length2 = innerProducerArr.length;
            while (i < length2) {
                InnerProducer innerProducer = innerProducerArr[i];
                if (innerProducer != null) {
                    c19418a.mo14694a(innerProducer);
                }
                i++;
            }
        }
    }

    /* renamed from: k */
    public static <T> C19565b<T> m70952k(Observable<? extends T> observable) {
        return m70951a((Observable) observable, f61548e);
    }

    /* renamed from: a */
    public static <T> C19565b<T> m70948a(Observable<? extends T> observable, final int i) {
        if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return m70952k(observable);
        }
        return m70951a((Observable) observable, new Func0<C19418a<T>>() {
            public /* synthetic */ Object call() {
                return m70933a();
            }

            /* renamed from: a */
            public C19418a<T> m70933a() {
                return new SizeBoundReplayBuffer(i);
            }
        });
    }

    /* renamed from: a */
    public static <T> C19565b<T> m70949a(Observable<? extends T> observable, long j, TimeUnit timeUnit, C2671a c2671a) {
        return m70950a(observable, j, timeUnit, c2671a, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: a */
    public static <T> C19565b<T> m70950a(Observable<? extends T> observable, long j, TimeUnit timeUnit, final C2671a c2671a, final int i) {
        j = timeUnit.toMillis(j);
        return m70951a((Observable) observable, new Func0<C19418a<T>>() {
            public /* synthetic */ Object call() {
                return m70934a();
            }

            /* renamed from: a */
            public C19418a<T> m70934a() {
                return new SizeAndTimeBoundReplayBuffer(i, j, c2671a);
            }
        });
    }

    /* renamed from: a */
    static <T> C19565b<T> m70951a(Observable<? extends T> observable, final Func0<? extends C19418a<T>> func0) {
        final AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new OnSubscribe<T>() {
            public /* synthetic */ void call(Object obj) {
                m71579a((C19571c) obj);
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            /* renamed from: a */
            public void m71579a(rx.C19571c<? super T> r4) {
                /*
                r3 = this;
            L_0x0000:
                r0 = r0;
                r0 = r0.get();
                r0 = (rx.internal.operators.OperatorReplay.C19681b) r0;
                if (r0 != 0) goto L_0x0024;
            L_0x000a:
                r1 = new rx.internal.operators.OperatorReplay$b;
                r2 = r4;
                r2 = r2.call();
                r2 = (rx.internal.operators.OperatorReplay.C19418a) r2;
                r1.<init>(r2);
                r1.m70941a();
                r2 = r0;
                r0 = r2.compareAndSet(r0, r1);
                if (r0 != 0) goto L_0x0023;
            L_0x0022:
                goto L_0x0000;
            L_0x0023:
                r0 = r1;
            L_0x0024:
                r1 = new rx.internal.operators.OperatorReplay$InnerProducer;
                r1.<init>(r0, r4);
                r0.m70943a(r1);
                r4.add(r1);
                r0 = r0.f61533a;
                r0.mo14694a(r1);
                r4.setProducer(r1);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.4.a(rx.c):void");
            }
        }, observable, atomicReference, func0);
    }

    private OperatorReplay(OnSubscribe<T> onSubscribe, Observable<? extends T> observable, AtomicReference<C19681b<T>> atomicReference, Func0<? extends C19418a<T>> func0) {
        super(onSubscribe);
        this.f61549b = observable;
        this.f61550c = atomicReference;
        this.f61551d = func0;
    }

    public void unsubscribe() {
        this.f61550c.lazySet(null);
    }

    public boolean isUnsubscribed() {
        C19681b c19681b = (C19681b) this.f61550c.get();
        if (c19681b != null) {
            if (!c19681b.isUnsubscribed()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    public void mo14748e(rx.functions.Action1<? super rx.Subscription> r5) {
        /*
        r4 = this;
    L_0x0000:
        r0 = r4.f61550c;
        r0 = r0.get();
        r0 = (rx.internal.operators.OperatorReplay.C19681b) r0;
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r1 = r0.isUnsubscribed();
        if (r1 == 0) goto L_0x002a;
    L_0x0010:
        r1 = new rx.internal.operators.OperatorReplay$b;
        r2 = r4.f61551d;
        r2 = r2.call();
        r2 = (rx.internal.operators.OperatorReplay.C19418a) r2;
        r1.<init>(r2);
        r1.m70941a();
        r2 = r4.f61550c;
        r0 = r2.compareAndSet(r0, r1);
        if (r0 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x0000;
    L_0x0029:
        r0 = r1;
    L_0x002a:
        r1 = r0.f61540j;
        r1 = r1.get();
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x003d;
    L_0x0034:
        r1 = r0.f61540j;
        r1 = r1.compareAndSet(r3, r2);
        if (r1 == 0) goto L_0x003d;
    L_0x003c:
        goto L_0x003e;
    L_0x003d:
        r2 = 0;
    L_0x003e:
        r5.call(r0);
        if (r2 == 0) goto L_0x0048;
    L_0x0043:
        r5 = r4.f61549b;
        r5.m69661a(r0);
    L_0x0048:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.e(rx.functions.Action1):void");
    }
}
