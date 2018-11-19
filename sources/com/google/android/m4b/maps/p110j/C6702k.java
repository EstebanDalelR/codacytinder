package com.google.android.m4b.maps.p110j;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5414d.C5408a;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5410c;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p110j.C5449l.C5448a;
import com.google.android.m4b.maps.p110j.C5457r.C6707a;
import com.google.android.m4b.maps.p110j.C5458s.C6709a;
import com.tinder.api.ManagerWebServices;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.m4b.maps.j.k */
public abstract class C6702k<T extends IInterface> implements C5401a, C5448a {
    /* renamed from: s */
    private static String[] f25079s = new String[]{"service_esmobile", "service_googleme"};
    /* renamed from: a */
    final Handler f25080a;
    /* renamed from: b */
    protected AtomicInteger f25081b;
    /* renamed from: c */
    private final Context f25082c;
    /* renamed from: d */
    private final C5441f f25083d;
    /* renamed from: e */
    private final Looper f25084e;
    /* renamed from: f */
    private final C5450m f25085f;
    /* renamed from: g */
    private final Object f25086g;
    /* renamed from: h */
    private C5458s f25087h;
    /* renamed from: i */
    private C5410c f25088i;
    /* renamed from: j */
    private T f25089j;
    /* renamed from: k */
    private final ArrayList<C5446c<?>> f25090k;
    /* renamed from: l */
    private C5447e f25091l;
    /* renamed from: m */
    private int f25092m;
    /* renamed from: n */
    private final Set<C6690o> f25093n;
    /* renamed from: o */
    private final Account f25094o;
    /* renamed from: p */
    private C5409b f25095p;
    /* renamed from: q */
    private C5411d f25096q;
    /* renamed from: r */
    private final int f25097r;

    /* renamed from: com.google.android.m4b.maps.j.k$b */
    final class C5445b extends Handler {
        /* renamed from: a */
        private /* synthetic */ C6702k f20417a;

        public C5445b(C6702k c6702k, Looper looper) {
            this.f20417a = c6702k;
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (this.f20417a.f25081b.get() != message.arg1) {
                if (C5445b.m23678b(message)) {
                    C5445b.m23677a(message);
                }
            } else if ((message.what == 1 || message.what == 5 || message.what == 6) && !this.f20417a.m29902j()) {
                C5445b.m23677a(message);
            } else if (message.what == 3) {
                this.f20417a.f25088i.mo5411a(new C6676a(message.arg2, null));
                C6702k.m29891i();
            } else if (message.what == 4) {
                this.f20417a.m29881a(4, null);
                if (this.f20417a.f25095p != null) {
                    this.f20417a.f25095p.mo5305a(message.arg2);
                }
                message = message.arg2;
                C6702k.m29890h();
                this.f20417a.m29883a(4, 1, null);
            } else if (message.what == 2 && !this.f20417a.mo5413e()) {
                C5445b.m23677a(message);
            } else if (C5445b.m23678b(message)) {
                ((C5446c) message.obj).m23680b();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
            }
        }

        /* renamed from: a */
        private static void m23677a(Message message) {
            ((C5446c) message.obj).m23681c();
        }

        /* renamed from: b */
        private static boolean m23678b(Message message) {
            if (!(message.what == 2 || message.what == 1 || message.what == 5)) {
                if (message.what != 6) {
                    return null;
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.m4b.maps.j.k$c */
    public abstract class C5446c<TListener> {
        /* renamed from: a */
        private TListener f20418a;
        /* renamed from: b */
        private boolean f20419b = null;
        /* renamed from: c */
        private /* synthetic */ C6702k f20420c;

        /* renamed from: a */
        protected abstract void mo5427a(TListener tListener);

        public C5446c(C6702k c6702k, TListener tListener) {
            this.f20420c = c6702k;
            this.f20418a = tListener;
        }

        /* renamed from: b */
        public final void m23680b() {
            synchronized (this) {
                Object obj = this.f20418a;
                if (this.f20419b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    stringBuilder.append("Callback proxy ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" being reused. This is not safe.");
                    Log.w("GmsClient", stringBuilder.toString());
                }
            }
            if (obj != null) {
                try {
                    mo5427a(obj);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
                this.f20419b = true;
            }
            m23681c();
        }

        /* renamed from: c */
        public final void m23681c() {
            m23682d();
            synchronized (this.f20420c.f25090k) {
                this.f20420c.f25090k.remove(this);
            }
        }

        /* renamed from: d */
        public final void m23682d() {
            synchronized (this) {
                this.f20418a = null;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.j.k$e */
    public final class C5447e implements ServiceConnection {
        /* renamed from: a */
        private final int f20421a;
        /* renamed from: b */
        private /* synthetic */ C6702k f20422b;

        public C5447e(C6702k c6702k, int i) {
            this.f20422b = c6702k;
            this.f20421a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C5462v.m23768a((Object) iBinder, (Object) "Expecting a valid IBinder");
            this.f20422b.f25087h = C6709a.m29964a(iBinder);
            componentName = this.f20422b;
            componentName.f25080a.sendMessage(componentName.f25080a.obtainMessage(6, this.f20421a, -1, new C7698h(componentName)));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f20422b.f25080a.sendMessage(this.f20422b.f25080a.obtainMessage(4, this.f20421a, 1));
        }
    }

    /* renamed from: com.google.android.m4b.maps.j.k$a */
    abstract class C6700a extends C5446c<Boolean> {
        /* renamed from: a */
        private int f25075a;
        /* renamed from: b */
        private Bundle f25076b;
        /* renamed from: c */
        private /* synthetic */ C6702k f25077c;

        /* renamed from: a */
        protected abstract void mo7236a(C6676a c6676a);

        /* renamed from: a */
        protected abstract boolean mo7237a();

        /* renamed from: a */
        protected final /* synthetic */ void mo5427a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                this.f25077c.m29881a(1, null);
                return;
            }
            obj = this.f25075a;
            if (obj != null) {
                if (obj != 10) {
                    this.f25077c.m29881a(1, null);
                    if (this.f25076b != null) {
                        pendingIntent = (PendingIntent) this.f25076b.getParcelable("pendingIntent");
                    }
                    mo7236a(new C6676a(this.f25075a, pendingIntent));
                } else {
                    this.f25077c.m29881a(1, null);
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                }
            } else if (mo7237a() == null) {
                this.f25077c.m29881a(1, null);
                mo7236a(new C6676a(8, null));
            }
        }

        protected C6700a(C6702k c6702k, int i, Bundle bundle) {
            this.f25077c = c6702k;
            super(c6702k, Boolean.valueOf(true));
            this.f25075a = i;
            this.f25076b = bundle;
        }
    }

    /* renamed from: com.google.android.m4b.maps.j.k$f */
    public class C6701f implements C5410c {
        /* renamed from: a */
        private /* synthetic */ C6702k f25078a;

        public C6701f(C6702k c6702k) {
            this.f25078a = c6702k;
        }

        /* renamed from: a */
        public final void mo5411a(C6676a c6676a) {
            if (c6676a.m29746b()) {
                this.f25078a.mo5430a(null, this.f25078a.f25093n);
                return;
            }
            if (this.f25078a.f25096q != null) {
                this.f25078a.f25096q.mo5307a(c6676a);
            }
        }

        /* renamed from: b */
        public final void mo5412b(C6676a c6676a) {
            throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
        }
    }

    /* renamed from: com.google.android.m4b.maps.j.k$d */
    public static final class C7696d extends C6707a {
        /* renamed from: a */
        private C6702k f28164a;
        /* renamed from: b */
        private final int f28165b;

        public C7696d(C6702k c6702k, int i) {
            this.f28164a = c6702k;
            this.f28165b = i;
        }

        /* renamed from: a */
        public final void mo5437a(int i, Bundle bundle) {
            C5462v.m23768a(this.f28164a, (Object) "onAccountValidationComplete can be called only once per call to validateAccount");
            C6702k c6702k = this.f28164a;
            c6702k.f25080a.sendMessage(c6702k.f25080a.obtainMessage(5, this.f28165b, -1, new C7699i(c6702k, i, bundle)));
            this.f28164a = 0;
        }

        /* renamed from: a */
        public final void mo5438a(int i, IBinder iBinder, Bundle bundle) {
            C5462v.m23768a(this.f28164a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            C6702k c6702k = this.f28164a;
            c6702k.f25080a.sendMessage(c6702k.f25080a.obtainMessage(1, this.f28165b, -1, new C7697g(c6702k, i, iBinder, bundle)));
            this.f28164a = 0;
        }
    }

    /* renamed from: com.google.android.m4b.maps.j.k$g */
    public final class C7697g extends C6700a {
        /* renamed from: a */
        private IBinder f28166a;
        /* renamed from: b */
        private /* synthetic */ C6702k f28167b;

        public C7697g(C6702k c6702k, int i, IBinder iBinder, Bundle bundle) {
            this.f28167b = c6702k;
            super(c6702k, i, bundle);
            this.f28166a = iBinder;
        }

        /* renamed from: a */
        protected final void mo7236a(C6676a c6676a) {
            if (this.f28167b.f25096q != null) {
                this.f28167b.f25096q.mo5307a(c6676a);
            }
            C6702k.m29891i();
        }

        /* renamed from: a */
        protected final boolean mo7237a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r7 = this;
            r0 = 0;
            r1 = r7.f28166a;	 Catch:{ RemoteException -> 0x007f }
            r1 = r1.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x007f }
            r2 = r7.f28167b;
            r2 = r2.mo7229b();
            r2 = r2.equals(r1);
            if (r2 != 0) goto L_0x004b;
        L_0x0013:
            r2 = "GmsClient";
            r3 = r7.f28167b;
            r3 = r3.mo7229b();
            r4 = new java.lang.StringBuilder;
            r5 = java.lang.String.valueOf(r3);
            r5 = r5.length();
            r5 = r5 + 34;
            r6 = java.lang.String.valueOf(r1);
            r6 = r6.length();
            r5 = r5 + r6;
            r4.<init>(r5);
            r5 = "service descriptor mismatch: ";
            r4.append(r5);
            r4.append(r3);
            r3 = " vs. ";
            r4.append(r3);
            r4.append(r1);
            r1 = r4.toString();
            android.util.Log.e(r2, r1);
            return r0;
        L_0x004b:
            r1 = r7.f28167b;
            r2 = r7.f28166a;
            r1 = r1.mo7227a(r2);
            if (r1 == 0) goto L_0x007e;
        L_0x0055:
            r2 = r7.f28167b;
            r3 = 2;
            r4 = 3;
            r1 = r2.m29883a(r3, r4, r1);
            if (r1 == 0) goto L_0x007e;
        L_0x005f:
            r0 = r7.f28167b;
            r0 = r7.f28167b;
            r0 = r0.f25095p;
            if (r0 == 0) goto L_0x0073;
        L_0x0069:
            r0 = r7.f28167b;
            r0 = r0.f25095p;
            r1 = 0;
            r0.mo5306a(r1);
        L_0x0073:
            r0 = r7.f28167b;
            r0 = r0.f25082c;
            com.google.android.m4b.maps.p107g.C5398g.m23583b(r0);
            r0 = 1;
            return r0;
        L_0x007e:
            return r0;
        L_0x007f:
            r1 = "GmsClient";
            r2 = "service probably died";
            android.util.Log.w(r1, r2);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.j.k.g.a():boolean");
        }
    }

    /* renamed from: com.google.android.m4b.maps.j.k$h */
    public final class C7698h extends C6700a {
        /* renamed from: a */
        private /* synthetic */ C6702k f28168a;

        public C7698h(C6702k c6702k) {
            this.f28168a = c6702k;
            super(c6702k, 0, null);
        }

        /* renamed from: a */
        protected final void mo7236a(C6676a c6676a) {
            this.f28168a.f25088i.mo5411a(c6676a);
            C6702k.m29891i();
        }

        /* renamed from: a */
        protected final boolean mo7237a() {
            this.f28168a.f25088i.mo5411a(C6676a.f24965a);
            return true;
        }
    }

    /* renamed from: com.google.android.m4b.maps.j.k$i */
    public final class C7699i extends C6700a {
        /* renamed from: a */
        private /* synthetic */ C6702k f28169a;

        public C7699i(C6702k c6702k, int i, Bundle bundle) {
            this.f28169a = c6702k;
            super(c6702k, i, bundle);
        }

        /* renamed from: a */
        protected final void mo7236a(C6676a c6676a) {
            this.f28169a.f25088i.mo5412b(c6676a);
            C6702k.m29891i();
        }

        /* renamed from: a */
        protected final boolean mo7237a() {
            this.f28169a.f25088i.mo5412b(C6676a.f24965a);
            return true;
        }
    }

    /* renamed from: h */
    protected static void m29890h() {
    }

    /* renamed from: i */
    protected static void m29891i() {
    }

    /* renamed from: a */
    protected abstract T mo7227a(IBinder iBinder);

    /* renamed from: a */
    protected abstract String mo7228a();

    /* renamed from: b */
    protected abstract String mo7229b();

    /* renamed from: f */
    public boolean mo5433f() {
        return false;
    }

    /* renamed from: o */
    public boolean mo7582o() {
        return false;
    }

    @Deprecated
    protected C6702k(Context context, Looper looper, int i, C5409b c5409b, C5411d c5411d) {
        this.f25086g = new Object();
        this.f25090k = new ArrayList();
        this.f25092m = 1;
        this.f25081b = new AtomicInteger(0);
        this.f25082c = (Context) C5462v.m23767a((Object) context);
        this.f25084e = (Looper) C5462v.m23768a((Object) looper, (Object) "Looper must not be null");
        this.f25085f = C5450m.m23693a(context);
        this.f25080a = new C5445b(this, looper);
        this.f25097r = 40;
        this.f25094o = null;
        this.f25093n = Collections.emptySet();
        this.f25083d = new C5408a(context).m23609a();
        this.f25095p = (C5409b) C5462v.m23767a((Object) c5409b);
        this.f25096q = (C5411d) C5462v.m23767a((Object) c5411d);
    }

    protected C6702k(Context context, Looper looper, int i, C5409b c5409b, C5411d c5411d, C5441f c5441f) {
        this(context, looper, C5450m.m23693a(context), i, c5441f, c5409b, c5411d);
    }

    private C6702k(Context context, Looper looper, C5450m c5450m, int i, C5441f c5441f, C5409b c5409b, C5411d c5411d) {
        this(context, looper, c5450m, i, c5441f);
        this.f25095p = (C5409b) C5462v.m23767a((Object) c5409b);
        this.f25096q = (C5411d) C5462v.m23767a((Object) c5411d);
    }

    private C6702k(Context context, Looper looper, C5450m c5450m, int i, C5441f c5441f) {
        this.f25086g = new Object();
        this.f25090k = new ArrayList();
        this.f25092m = 1;
        this.f25081b = new AtomicInteger(0);
        this.f25082c = (Context) C5462v.m23768a((Object) context, (Object) "Context must not be null");
        this.f25084e = (Looper) C5462v.m23768a((Object) looper, (Object) "Looper must not be null");
        this.f25085f = (C5450m) C5462v.m23768a((Object) c5450m, (Object) "Supervisor must not be null");
        this.f25080a = new C5445b(this, looper);
        this.f25097r = i;
        this.f25083d = (C5441f) C5462v.m23767a((Object) c5441f);
        this.f25094o = c5441f.m23665b();
        this.f25093n = m29879a(c5441f.m23668e());
    }

    /* renamed from: a */
    private Set<C6690o> m29879a(Set<C6690o> set) {
        if (set == null) {
            return set;
        }
        for (C6690o contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    protected String j_() {
        return this.f25083d.m23671h();
    }

    /* renamed from: a */
    private boolean m29883a(int i, int i2, T t) {
        synchronized (this.f25086g) {
            if (this.f25092m != i) {
                return false;
            }
            m29881a(i2, (IInterface) t);
            return true;
        }
    }

    /* renamed from: e */
    public final boolean mo5413e() {
        boolean z;
        synchronized (this.f25086g) {
            z = this.f25092m == 3;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean m29902j() {
        boolean z;
        synchronized (this.f25086g) {
            z = this.f25092m == 2;
        }
        return z;
    }

    /* renamed from: d */
    public void mo5432d() {
        this.f25081b.incrementAndGet();
        synchronized (this.f25090k) {
            int size = this.f25090k.size();
            for (int i = 0; i < size; i++) {
                ((C5446c) this.f25090k.get(i)).m23682d();
            }
            this.f25090k.clear();
        }
        m29881a(1, null);
    }

    /* renamed from: a */
    private void m29880a(int i) {
        this.f25080a.sendMessage(this.f25080a.obtainMessage(4, this.f25081b.get(), 1));
    }

    /* renamed from: k */
    public final Context m29903k() {
        return this.f25082c;
    }

    /* renamed from: l */
    protected Bundle mo7238l() {
        return new Bundle();
    }

    /* renamed from: m */
    protected final void m29905m() {
        if (!mo5413e()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: n */
    public final T m29906n() {
        T t;
        synchronized (this.f25086g) {
            if (this.f25092m == 4) {
                throw new DeadObjectException();
            }
            m29905m();
            C5462v.m23771a(this.f25089j != null, (Object) "Client is connected but service is null");
            t = this.f25089j;
        }
        return t;
    }

    /* renamed from: a */
    public final void mo5429a(com.google.android.m4b.maps.p110j.C5455p r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = new com.google.android.m4b.maps.j.aa;
        r1 = r4.f25093n;
        r2 = r4.f25093n;
        r2 = r2.size();
        r2 = new com.google.android.m4b.maps.p108h.C6690o[r2];
        r1 = r1.toArray(r2);
        r1 = (com.google.android.m4b.maps.p108h.C6690o[]) r1;
        r2 = r4.f25082c;
        r2 = r2.getPackageName();
        r3 = 0;
        r0.<init>(r5, r1, r2, r3);
        r5 = r4.f25087h;	 Catch:{ DeadObjectException -> 0x0036, RemoteException -> 0x002d }
        r1 = new com.google.android.m4b.maps.j.k$d;	 Catch:{ DeadObjectException -> 0x0036, RemoteException -> 0x002d }
        r2 = r4.f25081b;	 Catch:{ DeadObjectException -> 0x0036, RemoteException -> 0x002d }
        r2 = r2.get();	 Catch:{ DeadObjectException -> 0x0036, RemoteException -> 0x002d }
        r1.<init>(r4, r2);	 Catch:{ DeadObjectException -> 0x0036, RemoteException -> 0x002d }
        r5.mo5451a(r1, r0);	 Catch:{ DeadObjectException -> 0x0036, RemoteException -> 0x002d }
        return;
    L_0x002d:
        r5 = move-exception;
        r0 = "GmsClient";
        r1 = "Remote exception occurred";
        android.util.Log.w(r0, r1, r5);
        return;
    L_0x0036:
        r5 = "GmsClient";
        r0 = "service died";
        android.util.Log.w(r5, r0);
        r5 = 1;
        r4.m29880a(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.j.k.a(com.google.android.m4b.maps.j.p):void");
    }

    /* renamed from: a */
    public final void mo5430a(com.google.android.m4b.maps.p110j.C5455p r4, java.util.Set<com.google.android.m4b.maps.p108h.C6690o> r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.mo7238l();	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r1 = new com.google.android.m4b.maps.j.i;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r2 = r3.f25097r;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r1.<init>(r2);	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r2 = r3.f25082c;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r2 = r2.getPackageName();	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r1.f25070d = r2;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r1.f25073g = r0;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        if (r5 == 0) goto L_0x0025;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x0017:
        r0 = r5.size();	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r0 = new com.google.android.m4b.maps.p108h.C6690o[r0];	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r5 = r5.toArray(r0);	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r5 = (com.google.android.m4b.maps.p108h.C6690o[]) r5;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r1.f25072f = r5;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x0025:
        r5 = r3.mo5433f();	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        if (r5 == 0) goto L_0x0046;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x002b:
        r5 = r3.f25094o;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        if (r5 == 0) goto L_0x0032;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x002f:
        r5 = r3.f25094o;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        goto L_0x003b;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x0032:
        r5 = new android.accounts.Account;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r0 = "<<default account>>";	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r2 = "com.google";	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r5.<init>(r0, r2);	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x003b:
        r1.f25074h = r5;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        if (r4 == 0) goto L_0x0050;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x003f:
        r4 = r4.asBinder();	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r1.f25071e = r4;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        goto L_0x0050;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x0046:
        r4 = r3.mo7582o();	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        if (r4 == 0) goto L_0x0050;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x004c:
        r4 = r3.f25094o;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r1.f25074h = r4;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
    L_0x0050:
        r4 = r3.f25087h;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r5 = new com.google.android.m4b.maps.j.k$d;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r0 = r3.f25081b;	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r0 = r0.get();	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r5.<init>(r3, r0);	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        r4.mo5452a(r5, r1);	 Catch:{ DeadObjectException -> 0x006a, RemoteException -> 0x0061 }
        return;
    L_0x0061:
        r4 = move-exception;
        r5 = "GmsClient";
        r0 = "Remote exception occurred";
        android.util.Log.w(r5, r0, r4);
        return;
    L_0x006a:
        r4 = "GmsClient";
        r5 = "service died";
        android.util.Log.w(r4, r5);
        r4 = 1;
        r3.m29880a(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.j.k.a(com.google.android.m4b.maps.j.p, java.util.Set):void");
    }

    /* renamed from: a */
    public final void mo5431a(String str, PrintWriter printWriter) {
        synchronized (this.f25086g) {
            int i = this.f25092m;
            IInterface iInterface = this.f25089j;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.println(ManagerWebServices.NULL_STRING_VALUE);
        } else {
            printWriter.append(mo7229b()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
    }

    /* renamed from: a */
    private void m29881a(int i, T t) {
        Object obj = null;
        if ((i == 3 ? 1 : null) == (t != null ? 1 : null)) {
            obj = 1;
        }
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f25086g) {
            this.f25092m = i;
            this.f25089j = t;
            switch (i) {
                case 1:
                    if (this.f25091l != 0) {
                        this.f25085f.mo5435b(mo7228a(), this.f25091l, j_());
                        this.f25091l = 0;
                        break;
                    }
                    break;
                case 2:
                    String valueOf;
                    if (this.f25091l != 0) {
                        i = "GmsClient";
                        t = "Calling connect() while still connected, missing disconnect() for ";
                        valueOf = String.valueOf(mo7228a());
                        Log.e(i, valueOf.length() != 0 ? t.concat(valueOf) : new String(t));
                        this.f25085f.mo5435b(mo7228a(), this.f25091l, j_());
                        this.f25081b.incrementAndGet();
                    }
                    this.f25091l = new C5447e(this, this.f25081b.get());
                    if (this.f25085f.mo5434a(mo7228a(), this.f25091l, j_()) == 0) {
                        i = "GmsClient";
                        t = "unable to connect to service: ";
                        valueOf = String.valueOf(mo7228a());
                        Log.e(i, valueOf.length() != 0 ? t.concat(valueOf) : new String(t));
                        this.f25080a.sendMessage(this.f25080a.obtainMessage(3, this.f25081b.get(), 9));
                        break;
                    }
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo5428a(C5410c c5410c) {
        this.f25088i = (C5410c) C5462v.m23768a((Object) c5410c, (Object) "Connection progress callbacks cannot be null.");
        m29881a(2, null);
    }
}
