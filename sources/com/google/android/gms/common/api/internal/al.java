package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.support.v4.util.C0546b;
import android.util.Log;
import com.google.android.gms.common.C3813b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.C2467b;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.zzcxd;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.C4501b;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class al implements Callback {
    /* renamed from: a */
    public static final Status f7459a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* renamed from: b */
    private static final Status f7460b = new Status(4, "The user must be signed in to make this API call.");
    /* renamed from: f */
    private static final Object f7461f = new Object();
    /* renamed from: g */
    private static al f7462g;
    /* renamed from: c */
    private long f7463c = 5000;
    /* renamed from: d */
    private long f7464d = 120000;
    /* renamed from: e */
    private long f7465e = 10000;
    /* renamed from: h */
    private final Context f7466h;
    /* renamed from: i */
    private final C3813b f7467i;
    /* renamed from: j */
    private int f7468j = -1;
    /* renamed from: k */
    private final AtomicInteger f7469k = new AtomicInteger(1);
    /* renamed from: l */
    private final AtomicInteger f7470l = new AtomicInteger(0);
    /* renamed from: m */
    private final Map<cg<?>, an<?>> f7471m = new ConcurrentHashMap(5, 0.75f, 1);
    /* renamed from: n */
    private C4292i f7472n = null;
    /* renamed from: o */
    private final Set<cg<?>> f7473o = new C0546b();
    /* renamed from: p */
    private final Set<cg<?>> f7474p = new C0546b();
    /* renamed from: q */
    private final Handler f7475q;

    private al(Context context, Looper looper, C3813b c3813b) {
        this.f7466h = context;
        this.f7475q = new Handler(looper, this);
        this.f7467i = c3813b;
        this.f7475q.sendMessage(this.f7475q.obtainMessage(6));
    }

    /* renamed from: a */
    public static al m8936a() {
        al alVar;
        synchronized (f7461f) {
            ad.m9046a(f7462g, (Object) "Must guarantee manager is non-null before using getInstance");
            alVar = f7462g;
        }
        return alVar;
    }

    /* renamed from: a */
    public static al m8937a(Context context) {
        al alVar;
        synchronized (f7461f) {
            if (f7462g == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f7462g = new al(context.getApplicationContext(), handlerThread.getLooper(), C3813b.m14425a());
            }
            alVar = f7462g;
        }
        return alVar;
    }

    /* renamed from: b */
    public static void m8939b() {
        synchronized (f7461f) {
            if (f7462g != null) {
                al alVar = f7462g;
                alVar.f7470l.incrementAndGet();
                alVar.f7475q.sendMessageAtFrontOfQueue(alVar.f7475q.obtainMessage(10));
            }
        }
    }

    @WorkerThread
    /* renamed from: b */
    private final void m8940b(C2467b<?> c2467b) {
        cg b = c2467b.m8901b();
        an anVar = (an) this.f7471m.get(b);
        if (anVar == null) {
            anVar = new an(this, c2467b);
            this.f7471m.put(b, anVar);
        }
        if (anVar.m17203k()) {
            this.f7474p.add(b);
        }
        anVar.m17201i();
    }

    @WorkerThread
    /* renamed from: h */
    private final void m8949h() {
        for (cg remove : this.f7474p) {
            ((an) this.f7471m.remove(remove)).m17189a();
        }
        this.f7474p.clear();
    }

    /* renamed from: a */
    final PendingIntent m8952a(cg<?> cgVar, int i) {
        an anVar = (an) this.f7471m.get(cgVar);
        if (anVar == null) {
            return null;
        }
        zzcxd m = anVar.m17205m();
        return m == null ? null : PendingIntent.getActivity(this.f7466h, i, m.getSignInIntent(), 134217728);
    }

    /* renamed from: a */
    public final <O extends ApiOptions> C4500a<Boolean> m8953a(@NonNull C2467b<O> c2467b, @NonNull bd<?> bdVar) {
        C4501b c4501b = new C4501b();
        this.f7475q.sendMessage(this.f7475q.obtainMessage(13, new bg(new ce(bdVar, c4501b), this.f7470l.get(), c2467b)));
        return c4501b.a();
    }

    /* renamed from: a */
    public final <O extends ApiOptions> C4500a<Void> m8954a(@NonNull C2467b<O> c2467b, @NonNull bh<zzb, ?> bhVar, @NonNull cc<zzb, ?> ccVar) {
        C4501b c4501b = new C4501b();
        this.f7475q.sendMessage(this.f7475q.obtainMessage(8, new bg(new bo(new bi(bhVar, ccVar), c4501b), this.f7470l.get(), c2467b)));
        return c4501b.a();
    }

    /* renamed from: a */
    public final C4500a<Map<cg<?>, String>> m8955a(Iterable<? extends C2467b<?>> iterable) {
        ci ciVar = new ci(iterable);
        for (C2467b c2467b : iterable) {
            an anVar = (an) this.f7471m.get(c2467b.m8901b());
            if (anVar != null) {
                if (anVar.m17202j()) {
                    ciVar.m8995a(c2467b.m8901b(), ConnectionResult.zzfkr, anVar.m17194b().zzagi());
                }
            }
            this.f7475q.sendMessage(this.f7475q.obtainMessage(2, ciVar));
            return ciVar.m8996b();
        }
        return ciVar.m8996b();
    }

    /* renamed from: a */
    public final void m8956a(C2467b<?> c2467b) {
        this.f7475q.sendMessage(this.f7475q.obtainMessage(7, c2467b));
    }

    /* renamed from: a */
    public final <O extends ApiOptions, TResult> void m8957a(C2467b<O> c2467b, int i, bs<zzb, TResult> bsVar, C4501b<TResult> c4501b, zzcz zzcz) {
        this.f7475q.sendMessage(this.f7475q.obtainMessage(4, new bg(new cd(i, bsVar, c4501b, zzcz), this.f7470l.get(), c2467b)));
    }

    /* renamed from: a */
    public final <O extends ApiOptions> void m8958a(C2467b<O> c2467b, int i, ck<? extends Result, zzb> ckVar) {
        this.f7475q.sendMessage(this.f7475q.obtainMessage(4, new bg(new ax(i, ckVar), this.f7470l.get(), c2467b)));
    }

    /* renamed from: a */
    public final void m8959a(@NonNull C4292i c4292i) {
        synchronized (f7461f) {
            if (this.f7472n != c4292i) {
                this.f7472n = c4292i;
                this.f7473o.clear();
                this.f7473o.addAll(c4292i.m17248g());
            }
        }
    }

    /* renamed from: a */
    final boolean m8960a(ConnectionResult connectionResult, int i) {
        return this.f7467i.m14438a(this.f7466h, connectionResult, i);
    }

    /* renamed from: b */
    public final void m8961b(ConnectionResult connectionResult, int i) {
        if (!m8960a(connectionResult, i)) {
            this.f7475q.sendMessage(this.f7475q.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: b */
    final void m8962b(@NonNull C4292i c4292i) {
        synchronized (f7461f) {
            if (this.f7472n == c4292i) {
                this.f7472n = null;
                this.f7473o.clear();
            }
        }
    }

    /* renamed from: c */
    public final int m8963c() {
        return this.f7469k.getAndIncrement();
    }

    /* renamed from: d */
    public final void m8964d() {
        this.f7475q.sendMessage(this.f7475q.obtainMessage(3));
    }

    /* renamed from: e */
    final void m8965e() {
        this.f7470l.incrementAndGet();
        this.f7475q.sendMessage(this.f7475q.obtainMessage(10));
    }

    @WorkerThread
    public final boolean handleMessage(Message message) {
        long j = 300000;
        an anVar;
        an anVar2;
        StringBuilder stringBuilder;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f7465e = j;
                this.f7475q.removeMessages(12);
                for (cg obtainMessage : this.f7471m.keySet()) {
                    this.f7475q.sendMessageDelayed(this.f7475q.obtainMessage(12, obtainMessage), this.f7465e);
                }
                break;
            case 2:
                ci ciVar = (ci) message.obj;
                for (cg obtainMessage2 : ciVar.m8994a()) {
                    anVar = (an) this.f7471m.get(obtainMessage2);
                    if (anVar == null) {
                        ciVar.m8995a(obtainMessage2, new ConnectionResult(13), null);
                        return true;
                    } else if (anVar.m17202j()) {
                        ciVar.m8995a(obtainMessage2, ConnectionResult.zzfkr, anVar.m17194b().zzagi());
                    } else if (anVar.m17197e() != null) {
                        ciVar.m8995a(obtainMessage2, anVar.m17197e(), null);
                    } else {
                        anVar.m17193a(ciVar);
                    }
                }
                break;
            case 3:
                for (an anVar22 : this.f7471m.values()) {
                    anVar22.m17196d();
                    anVar22.m17201i();
                }
                break;
            case 4:
            case 8:
            case 13:
                bg bgVar = (bg) message.obj;
                anVar22 = (an) this.f7471m.get(bgVar.f7496c.m8901b());
                if (anVar22 == null) {
                    m8940b(bgVar.f7496c);
                    anVar22 = (an) this.f7471m.get(bgVar.f7496c.m8901b());
                }
                if (!anVar22.m17203k() || this.f7470l.get() == bgVar.f7495b) {
                    anVar22.m17192a(bgVar.f7494a);
                    return true;
                }
                bgVar.f7494a.mo2526a(f7459a);
                anVar22.m17189a();
                return true;
            case 5:
                String b;
                String errorMessage;
                StringBuilder stringBuilder2;
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (an anVar3 : this.f7471m.values()) {
                    if (anVar3.m17204l() == i) {
                        if (anVar3 == null) {
                            b = this.f7467i.mo2569b(connectionResult.getErrorCode());
                            errorMessage = connectionResult.getErrorMessage();
                            stringBuilder2 = new StringBuilder((String.valueOf(b).length() + 69) + String.valueOf(errorMessage).length());
                            stringBuilder2.append("Error resolution was canceled by the user, original error message: ");
                            stringBuilder2.append(b);
                            stringBuilder2.append(": ");
                            stringBuilder2.append(errorMessage);
                            anVar3.m17191a(new Status(17, stringBuilder2.toString()));
                            return true;
                        }
                        stringBuilder = new StringBuilder(76);
                        stringBuilder.append("Could not find API instance ");
                        stringBuilder.append(i);
                        stringBuilder.append(" while trying to fail enqueued calls.");
                        Log.wtf("GoogleApiManager", stringBuilder.toString(), new Exception());
                        return true;
                    }
                }
                anVar3 = null;
                if (anVar3 == null) {
                    stringBuilder = new StringBuilder(76);
                    stringBuilder.append("Could not find API instance ");
                    stringBuilder.append(i);
                    stringBuilder.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", stringBuilder.toString(), new Exception());
                    return true;
                }
                b = this.f7467i.mo2569b(connectionResult.getErrorCode());
                errorMessage = connectionResult.getErrorMessage();
                stringBuilder2 = new StringBuilder((String.valueOf(b).length() + 69) + String.valueOf(errorMessage).length());
                stringBuilder2.append("Error resolution was canceled by the user, original error message: ");
                stringBuilder2.append(b);
                stringBuilder2.append(": ");
                stringBuilder2.append(errorMessage);
                anVar3.m17191a(new Status(17, stringBuilder2.toString()));
                return true;
            case 6:
                if (this.f7466h.getApplicationContext() instanceof Application) {
                    cj.m8998a((Application) this.f7466h.getApplicationContext());
                    cj.m8997a().m9000a(new am(this));
                    if (!cj.m8997a().m9001a(true)) {
                        this.f7465e = 300000;
                        return true;
                    }
                }
                break;
            case 7:
                m8940b((C2467b) message.obj);
                return true;
            case 9:
                if (this.f7471m.containsKey(message.obj)) {
                    ((an) this.f7471m.get(message.obj)).m17198f();
                    return true;
                }
                break;
            case 10:
                m8949h();
                return true;
            case 11:
                if (this.f7471m.containsKey(message.obj)) {
                    ((an) this.f7471m.get(message.obj)).m17199g();
                    return true;
                }
                break;
            case 12:
                if (this.f7471m.containsKey(message.obj)) {
                    ((an) this.f7471m.get(message.obj)).m17200h();
                    return true;
                }
                break;
            default:
                int i2 = message.what;
                stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown message id: ");
                stringBuilder.append(i2);
                Log.w("GoogleApiManager", stringBuilder.toString());
                return false;
        }
        return true;
    }
}
