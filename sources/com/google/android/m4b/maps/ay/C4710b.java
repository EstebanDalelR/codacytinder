package com.google.android.m4b.maps.ay;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.aj.C4635e;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.ay.b */
public abstract class C4710b<S extends IInterface> {
    /* renamed from: a */
    private static final String f17321a = "b";
    /* renamed from: b */
    private final Context f17322b;
    /* renamed from: c */
    private final Executor f17323c;
    /* renamed from: d */
    private final Queue<Runnable> f17324d = new LinkedList();
    /* renamed from: e */
    private String f17325e;
    /* renamed from: f */
    private String f17326f;
    /* renamed from: g */
    private final ServiceConnection f17327g = new C47071(this);
    /* renamed from: h */
    private S f17328h;
    /* renamed from: i */
    private int f17329i = 1;

    /* renamed from: com.google.android.m4b.maps.ay.b$1 */
    class C47071 implements ServiceConnection {
        /* renamed from: a */
        private /* synthetic */ C4710b f17319a;

        C47071(C4710b c4710b) {
            this.f17319a = c4710b;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this.f17319a.f17327g) {
                if (C4728u.m21050a(C4710b.f17321a, 3)) {
                    String c = C4710b.f17321a;
                    componentName = String.valueOf(componentName);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(componentName).length() + 22);
                    stringBuilder.append("Connected to service: ");
                    stringBuilder.append(componentName);
                    Log.d(c, stringBuilder.toString());
                }
                this.f17319a.f17328h = (IInterface) C5571j.m24292a(this.f17319a.mo4863a(iBinder));
                this.f17319a.f17329i = 3;
                while (this.f17319a.f17324d.size() > null) {
                    this.f17319a.f17323c.execute((Runnable) this.f17319a.f17324d.poll());
                }
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (this.f17319a.f17327g) {
                if (C4728u.m21050a(C4710b.f17321a, 3)) {
                    String c = C4710b.f17321a;
                    componentName = String.valueOf(componentName);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(componentName).length() + 27);
                    stringBuilder.append("Disconnected from service: ");
                    stringBuilder.append(componentName);
                    Log.d(c, stringBuilder.toString());
                }
                this.f17319a.f17328h = null;
                this.f17319a.f17329i = 2;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ay.b$a */
    static class C4708a<V> extends FutureTask<V> {
        public C4708a(Callable<V> callable) {
            super(callable);
        }

        public final V get() {
            ab.m27952e();
            return super.get();
        }

        public final V get(long j, TimeUnit timeUnit) {
            ab.m27952e();
            return super.get(j, timeUnit);
        }
    }

    /* renamed from: com.google.android.m4b.maps.ay.b$b */
    public abstract class C4709b<T> implements Callable<T> {
        /* renamed from: a */
        private /* synthetic */ C4710b f17320a;

        /* renamed from: a */
        public abstract T mo4862a(S s);

        public C4709b(C4710b c4710b) {
            this.f17320a = c4710b;
        }

        public T call() {
            synchronized (this.f17320a.f17327g) {
                IInterface b = this.f17320a.f17328h;
            }
            if (b != null) {
                return mo4862a(b);
            }
            throw new RemoteException("Service was closed in the middle of the execution.");
        }
    }

    /* renamed from: a */
    protected abstract S mo4863a(IBinder iBinder);

    public C4710b(Context context, String str, String str2, Executor executor) {
        this.f17322b = (Context) C5571j.m24293a((Object) context, (Object) "processContext");
        this.f17325e = (String) C5571j.m24293a((Object) str, (Object) "servicePackageName");
        this.f17326f = (String) C5571j.m24293a((Object) str2, (Object) "serviceClassName");
        this.f17323c = (Executor) C5571j.m24293a((Object) executor, (Object) "executor");
    }

    /* renamed from: a */
    public <T> Future<T> mo4877a(C4709b<T> c4709b) {
        Future<T> c4708a = new C4708a((Callable) C5571j.m24292a((Object) c4709b));
        synchronized (this.f17327g) {
            Future a;
            switch (this.f17329i) {
                case 1:
                    if (mo4896a()) {
                        this.f17324d.add(c4708a);
                        return c4708a;
                    }
                    a = C4635e.m20757a(null);
                    return a;
                case 2:
                    this.f17324d.add(c4708a);
                    return c4708a;
                case 3:
                    this.f17323c.execute(c4708a);
                    return c4708a;
                case 4:
                    if (C4728u.m21050a(f17321a, 3)) {
                        String str = f17321a;
                        String str2 = "Request ignored after failure to bind to the service ";
                        String valueOf = String.valueOf(this.f17326f);
                        Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                    a = C4635e.m20757a(null);
                    return a;
                default:
                    int i = this.f17329i;
                    StringBuilder stringBuilder = new StringBuilder(26);
                    stringBuilder.append("Unknown state: ");
                    stringBuilder.append(i);
                    throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    private boolean mo4896a() {
        boolean bindService;
        Intent className = new Intent().setClassName(this.f17325e, this.f17326f);
        synchronized (this.f17327g) {
            C5571j.m24302b(this.f17329i == 1, (Object) "Binding has already been attempted");
            this.f17329i = 2;
            bindService = this.f17322b.bindService(className, this.f17327g, 1);
            if (!bindService) {
                if (C4728u.m21050a(f17321a, 6)) {
                    Log.e(f17321a, String.format("Service \"%s\" in application \"%s\" cannot be found or bound to.", new Object[]{this.f17326f, this.f17325e}));
                }
                this.f17329i = 4;
            }
        }
        return bindService;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final void m20954b() {
        /*
        r3 = this;
        r0 = r3.f17327g;
        monitor-enter(r0);
        r1 = r3.f17329i;	 Catch:{ all -> 0x0026 }
        r2 = 3;
        if (r1 == r2) goto L_0x001a;
    L_0x0008:
        r1 = f17321a;	 Catch:{ all -> 0x0026 }
        r2 = 6;
        r1 = com.google.android.m4b.maps.ay.C4728u.m21050a(r1, r2);	 Catch:{ all -> 0x0026 }
        if (r1 == 0) goto L_0x0018;
    L_0x0011:
        r1 = f17321a;	 Catch:{ all -> 0x0026 }
        r2 = "Attempt to unbind a service that is not bound.";
        android.util.Log.e(r1, r2);	 Catch:{ all -> 0x0026 }
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        return;
    L_0x001a:
        r1 = 1;
        r3.f17329i = r1;	 Catch:{ all -> 0x0026 }
        r1 = r3.f17322b;	 Catch:{ all -> 0x0026 }
        r2 = r3.f17327g;	 Catch:{ all -> 0x0026 }
        r1.unbindService(r2);	 Catch:{ all -> 0x0026 }
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        return;
    L_0x0026:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.b.b():void");
    }
}
