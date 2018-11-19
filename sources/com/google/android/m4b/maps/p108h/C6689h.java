package com.google.android.m4b.maps.p108h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5406b.C5402b;
import com.google.android.m4b.maps.p108h.C5406b.C5403c;
import com.google.android.m4b.maps.p108h.C5407c.C7690a;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p110j.C5441f.C5440a;
import com.google.android.m4b.maps.p110j.C5449l;
import com.google.android.m4b.maps.p110j.C5449l.C5448a;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p121u.C5524d;
import com.google.android.m4b.maps.p121u.C6773c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.m4b.maps.h.h */
final class C6689h implements C5414d {
    /* renamed from: a */
    final C5449l f25014a;
    /* renamed from: b */
    final Queue<C5421e<?>> f25015b = new LinkedList();
    /* renamed from: c */
    final C5418a f25016c;
    /* renamed from: d */
    final Map<C5403c<?>, C5401a> f25017d = new HashMap();
    /* renamed from: e */
    final Map<C5403c<?>, C6676a> f25018e = new HashMap();
    /* renamed from: f */
    Set<C6690o> f25019f = new HashSet();
    /* renamed from: g */
    final Set<C5421e<?>> f25020g = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75f, 2));
    /* renamed from: h */
    private final Lock f25021h = new ReentrantLock();
    /* renamed from: i */
    private final Condition f25022i;
    /* renamed from: j */
    private final int f25023j;
    /* renamed from: k */
    private final int f25024k;
    /* renamed from: l */
    private final Context f25025l;
    /* renamed from: m */
    private final Looper f25026m;
    /* renamed from: n */
    private volatile boolean f25027n;
    /* renamed from: o */
    private long f25028o = 120000;
    /* renamed from: p */
    private long f25029p = 5000;
    /* renamed from: q */
    private BroadcastReceiver f25030q;
    /* renamed from: r */
    private C5441f f25031r;
    /* renamed from: s */
    private Map<C5406b<?>, Integer> f25032s;
    /* renamed from: t */
    private C5402b<? extends C6773c, C5524d> f25033t;
    /* renamed from: u */
    private volatile C5422i f25034u;
    /* renamed from: v */
    private C6676a f25035v = null;
    /* renamed from: w */
    private final Set<C5423j<?>> f25036w = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: x */
    private final C5420c f25037x = new C66851(this);
    /* renamed from: y */
    private final C5409b f25038y = new C76922(this);
    /* renamed from: z */
    private final C5448a f25039z = new C66863(this);

    /* renamed from: com.google.android.m4b.maps.h.h$a */
    final class C5418a extends Handler {
        /* renamed from: a */
        private /* synthetic */ C6689h f20372a;

        C5418a(C6689h c6689h, Looper looper) {
            this.f20372a = c6689h;
            super(looper);
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    C6689h.m29827d(this.f20372a);
                    return;
                case 2:
                    C6689h.m29826c(this.f20372a);
                    return;
                default:
                    message = message.what;
                    StringBuilder stringBuilder = new StringBuilder(31);
                    stringBuilder.append("Unknown message id: ");
                    stringBuilder.append(message);
                    Log.w("GoogleApiClientImpl", stringBuilder.toString());
                    return;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.h$b */
    static class C5419b extends BroadcastReceiver {
        /* renamed from: a */
        private WeakReference<C6689h> f20373a;

        C5419b(C6689h c6689h) {
            this.f20373a = new WeakReference(c6689h);
        }

        public final void onReceive(Context context, Intent intent) {
            context = intent.getData();
            context = context != null ? context.getSchemeSpecificPart() : null;
            if (context != null) {
                if (context.equals("com.google.android.gms") != null) {
                    C6689h c6689h = (C6689h) this.f20373a.get();
                    if (c6689h != null) {
                        C6689h.m29826c(c6689h);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.h$c */
    interface C5420c {
    }

    /* renamed from: com.google.android.m4b.maps.h.h$e */
    interface C5421e<A extends C5401a> {
        /* renamed from: a */
        void m23630a();

        /* renamed from: a */
        void mo7232a(C5420c c5420c);

        /* renamed from: b */
        C5403c<A> mo7233b();

        /* renamed from: b */
        void mo7234b(A a);

        /* renamed from: b */
        void m23634b(C6691q c6691q);

        /* renamed from: c */
        void mo7235c(C6691q c6691q);
    }

    /* renamed from: com.google.android.m4b.maps.h.h$1 */
    class C66851 implements C5420c {
        /* renamed from: a */
        private /* synthetic */ C6689h f25008a;

        C66851(C6689h c6689h) {
            this.f25008a = c6689h;
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.h$3 */
    class C66863 implements C5448a {
        /* renamed from: a */
        private /* synthetic */ C6689h f25009a;

        C66863(C6689h c6689h) {
            this.f25009a = c6689h;
        }

        /* renamed from: e */
        public final boolean mo5413e() {
            return this.f25009a.mo5424d();
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.h$d */
    public abstract class C6688d implements C5409b {
        /* renamed from: a */
        private /* synthetic */ C6689h f25013a;

        public C6688d(C6689h c6689h) {
            this.f25013a = c6689h;
        }

        /* renamed from: a */
        public final void mo5305a(int i) {
            this.f25013a.f25021h.lock();
            try {
                this.f25013a.f25034u.mo5409b(i);
            } finally {
                this.f25013a.f25021h.unlock();
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.h$2 */
    class C76922 extends C6688d {
        /* renamed from: a */
        private /* synthetic */ C6689h f28151a;

        C76922(C6689h c6689h) {
            this.f28151a = c6689h;
            super(c6689h);
        }

        /* renamed from: a */
        public final void mo5306a(Bundle bundle) {
            this.f28151a.f25034u.mo5405a(bundle);
        }
    }

    /* renamed from: a */
    private final C5411d m29823a(final C5406b<?> c5406b, final int i) {
        return new C5411d(this) {
            /* renamed from: c */
            private /* synthetic */ C6689h f25012c;

            /* renamed from: a */
            public final void mo5307a(C6676a c6676a) {
                this.f25012c.f25034u.mo5406a(c6676a, c5406b, i);
            }
        };
    }

    public C6689h(Context context, Looper looper, C5441f c5441f, C5402b<? extends C6773c, C5524d> c5402b, Map<C5406b<?>, Object> map, Set<C5409b> set, Set<C5411d> set2, int i, int i2) {
        Looper looper2 = looper;
        Context context2 = context;
        this.f25025l = context2;
        this.f25014a = new C5449l(looper2, this.f25039z);
        this.f25026m = looper2;
        this.f25016c = new C5418a(this, looper2);
        this.f25023j = i;
        this.f25024k = i2;
        this.f25032s = new HashMap();
        this.f25022i = this.f25021h.newCondition();
        this.f25034u = new C6684g(this);
        for (C5409b a : set) {
            r0.f25014a.m23688a(a);
        }
        for (C5411d a2 : set2) {
            r0.f25014a.m23689a(a2);
        }
        Map f = c5441f.m23669f();
        for (C5406b c5406b : map.keySet()) {
            Object obj = map.get(c5406b);
            int i3 = 0;
            if (f.get(c5406b) != null) {
                i3 = ((C5440a) f.get(c5406b)).f20402b ? 1 : 2;
            }
            r0.f25032s.put(c5406b, Integer.valueOf(i3));
            r0.f25017d.put(c5406b.m23604c(), c5406b.m23602a().mo5396a(context2, looper2, c5441f, obj, r0.f25038y, m29823a(c5406b, i3)));
        }
        r0.f25031r = c5441f;
        r0.f25033t = c5402b;
    }

    /* renamed from: a */
    public final <A extends C5401a, R extends C5427m, T extends C7690a<R, A>> T mo5415a(T t) {
        C5462v.m23773b(t.mo7233b() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        C5462v.m23773b(this.f25017d.containsKey(t.mo7233b()), "GoogleApiClient is not configured to use the API required for this call.");
        this.f25021h.lock();
        try {
            t = this.f25034u.mo5402a((C7690a) t);
            return t;
        } finally {
            this.f25021h.unlock();
        }
    }

    /* renamed from: b */
    public final <A extends C5401a, T extends C7690a<? extends C5427m, A>> T mo5419b(T t) {
        C5462v.m23773b(t.mo7233b() != null, "This task can not be executed (it's probably a Batch or malformed)");
        this.f25021h.lock();
        try {
            if (this.f25027n) {
                this.f25015b.add(t);
                while (!this.f25015b.isEmpty()) {
                    C5421e c5421e = (C5421e) this.f25015b.remove();
                    m29833a(c5421e);
                    c5421e.mo7235c(C6691q.f25043b);
                }
            } else {
                t = this.f25034u.mo5407b((C7690a) t);
            }
            this.f25021h.unlock();
            return t;
        } catch (Throwable th) {
            this.f25021h.unlock();
        }
    }

    /* renamed from: b */
    public final void mo5420b() {
        this.f25021h.lock();
        try {
            this.f25034u.mo5408b();
        } finally {
            this.f25021h.unlock();
        }
    }

    /* renamed from: c */
    public final void mo5423c() {
        m29847k();
        this.f25021h.lock();
        try {
            this.f25034u.mo5404a(-1);
        } finally {
            this.f25021h.unlock();
        }
    }

    /* renamed from: f */
    final void m29842f() {
        for (C5421e c5421e : this.f25020g) {
            c5421e.mo7232a(null);
            c5421e.m23630a();
        }
        this.f25020g.clear();
        for (C5423j a : this.f25036w) {
            a.m23645a();
        }
        this.f25036w.clear();
        this.f25019f.clear();
    }

    /* renamed from: g */
    final void m29843g() {
        this.f25021h.lock();
        try {
            this.f25034u = new C6683f(this, this.f25031r, this.f25032s, this.f25033t, this.f25021h, this.f25025l);
            this.f25034u.mo5403a();
            this.f25022i.signalAll();
        } finally {
            this.f25021h.unlock();
        }
    }

    /* renamed from: h */
    final void m29844h() {
        this.f25021h.lock();
        try {
            m29847k();
            this.f25034u = new C6680e(this);
            this.f25034u.mo5403a();
            this.f25022i.signalAll();
        } finally {
            this.f25021h.unlock();
        }
    }

    /* renamed from: a */
    final void m29830a(C6676a c6676a) {
        this.f25021h.lock();
        try {
            this.f25035v = c6676a;
            this.f25034u = new C6684g(this);
            this.f25034u.mo5403a();
            this.f25022i.signalAll();
        } finally {
            this.f25021h.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo5424d() {
        return this.f25034u instanceof C6680e;
    }

    /* renamed from: e */
    public final boolean mo5425e() {
        return this.f25034u instanceof C6683f;
    }

    /* renamed from: i */
    final boolean m29845i() {
        return this.f25027n;
    }

    /* renamed from: k */
    final boolean m29847k() {
        this.f25021h.lock();
        try {
            boolean z = false;
            if (this.f25027n) {
                this.f25027n = false;
                this.f25016c.removeMessages(2);
                z = true;
                this.f25016c.removeMessages(1);
                if (this.f25030q != null) {
                    this.f25025l.getApplicationContext().unregisterReceiver(this.f25030q);
                    this.f25030q = null;
                }
            }
            this.f25021h.unlock();
            return z;
        } catch (Throwable th) {
            this.f25021h.unlock();
        }
    }

    /* renamed from: a */
    final <A extends C5401a> void m29833a(C5421e<A> c5421e) {
        this.f25020g.add(c5421e);
        c5421e.mo7232a(this.f25037x);
    }

    /* renamed from: a */
    public final void mo5416a(C5409b c5409b) {
        this.f25014a.m23688a(c5409b);
    }

    /* renamed from: b */
    public final void mo5421b(C5409b c5409b) {
        this.f25014a.m23691b(c5409b);
    }

    /* renamed from: a */
    public final void mo5417a(C5411d c5411d) {
        this.f25014a.m23689a(c5411d);
    }

    /* renamed from: b */
    public final void mo5422b(C5411d c5411d) {
        this.f25014a.m23692b(c5411d);
    }

    /* renamed from: a */
    public final Looper mo5414a() {
        return this.f25026m;
    }

    /* renamed from: a */
    public final void mo5418a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mState=").append(this.f25034u.mo5410c());
        printWriter.append(" mResuming=").print(this.f25027n);
        printWriter.append(" mWorkQueue.size()=").print(this.f25015b.size());
        printWriter.append(" mUnconsumedRunners.size()=").println(this.f25020g.size());
        String concat = String.valueOf(str).concat("  ");
        for (C5406b c5406b : this.f25032s.keySet()) {
            printWriter.append(str).append(c5406b.m23605d()).println(":");
            ((C5401a) this.f25017d.get(c5406b.m23604c())).mo5431a(concat, printWriter);
        }
    }

    /* renamed from: j */
    final void m29846j() {
        if (!this.f25027n) {
            this.f25027n = true;
            if (this.f25030q == null) {
                this.f25030q = new C5419b(this);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                this.f25025l.getApplicationContext().registerReceiver(this.f25030q, intentFilter);
            }
            this.f25016c.sendMessageDelayed(this.f25016c.obtainMessage(1), this.f25028o);
            this.f25016c.sendMessageDelayed(this.f25016c.obtainMessage(2), this.f25029p);
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m29826c(C6689h c6689h) {
        c6689h.f25021h.lock();
        try {
            if (c6689h.f25027n) {
                c6689h.mo5420b();
            }
            c6689h.f25021h.unlock();
        } catch (Throwable th) {
            c6689h.f25021h.unlock();
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m29827d(C6689h c6689h) {
        c6689h.f25021h.lock();
        try {
            if (c6689h.m29847k()) {
                c6689h.mo5420b();
            }
            c6689h.f25021h.unlock();
        } catch (Throwable th) {
            c6689h.f25021h.unlock();
        }
    }
}
