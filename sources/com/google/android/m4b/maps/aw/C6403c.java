package com.google.android.m4b.maps.aw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Process;
import android.util.Log;
import com.google.android.m4b.maps.aw.C6402b.C4696a;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4714e;
import com.google.android.m4b.maps.ay.C4714e.C4713a;
import com.google.android.m4b.maps.ay.C4717k;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.aw.c */
public class C6403c implements C4696a, C4714e, Runnable {
    /* renamed from: a */
    private static long f23740a = TimeUnit.MINUTES.toMillis(5);
    /* renamed from: b */
    private static long f23741b = TimeUnit.MINUTES.toMillis(1);
    /* renamed from: c */
    private static final String f23742c = "c";
    /* renamed from: d */
    private static long f23743d = TimeUnit.SECONDS.toMillis(10);
    /* renamed from: e */
    private static long f23744e = TimeUnit.HOURS.toMillis(1);
    /* renamed from: f */
    private static long f23745f = TimeUnit.SECONDS.toMillis(5);
    /* renamed from: g */
    private final Context f23746g;
    /* renamed from: h */
    private final String f23747h;
    /* renamed from: i */
    private final C4712d f23748i;
    /* renamed from: j */
    private final ScheduledExecutorService f23749j;
    /* renamed from: k */
    private Future<?> f23750k;
    /* renamed from: l */
    private final Random f23751l;
    /* renamed from: m */
    private int f23752m;
    /* renamed from: n */
    private long f23753n;
    /* renamed from: o */
    private final C4698d f23754o;
    /* renamed from: p */
    private C4695a f23755p;
    /* renamed from: q */
    private final Set<C4713a> f23756q = new HashSet();
    /* renamed from: r */
    private final C6402b f23757r;

    /* renamed from: com.google.android.m4b.maps.aw.c$a */
    final class C4697a extends BroadcastReceiver {
        /* renamed from: a */
        private volatile boolean f17280a;
        /* renamed from: b */
        private /* synthetic */ C6403c f17281b;

        C4697a(C6403c c6403c) {
            this.f17281b = c6403c;
        }

        public final void onReceive(Context context, Intent intent) {
            if (C6403c.m27931b(context) != null && this.f17280a != null) {
                this.f17281b.f23757r.m27925a(this.f17281b);
                context.unregisterReceiver(this);
                this.f17280a = null;
            }
        }

        /* renamed from: a */
        public final void m20888a(Context context) {
            ab.m27951d();
            this.f17280a = true;
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    private C6403c(Context context, String str, C4712d c4712d, Random random, ScheduledExecutorService scheduledExecutorService, C4698d c4698d, C6402b c6402b) {
        this.f23746g = context;
        this.f23747h = str;
        this.f23748i = c4712d;
        this.f23751l = random;
        this.f23749j = scheduledExecutorService;
        this.f23754o = c4698d;
        this.f23757r = c6402b;
    }

    /* renamed from: a */
    public static C6403c m27927a(Context context, String str, ScheduledExecutorService scheduledExecutorService, String str2, boolean z) {
        C4712d c4712d = new C4712d();
        Random random = new Random();
        String a = C4717k.m20982a(context, str);
        Context context2 = context;
        return new C6403c(context2, a, c4712d, random, scheduledExecutorService, new C4698d(context2), new C6402b(context2, a, str, str2, true));
    }

    /* renamed from: a */
    private void m27929a(String str, long j, long j2) {
        this.f23752m = 0;
        long j3 = j2 - f23740a;
        if (j3 > 0) {
            j2 = f23742c;
            long j4 = j3 / 1000;
            StringBuilder stringBuilder = new StringBuilder(56);
            stringBuilder.append("Scheduling next attempt in ");
            stringBuilder.append(j4);
            stringBuilder.append(" seconds.");
            Log.i(j2, stringBuilder.toString());
            m27928a(j3);
        }
        synchronized (this) {
            this.f23755p = new C4695a(str, j);
        }
        m27933f();
    }

    /* renamed from: a */
    private void m27928a(long j) {
        if (this.f23750k != null) {
            this.f23750k.cancel(true);
        }
        if (j == 0) {
            this.f23750k = 0;
            run();
            return;
        }
        this.f23750k = this.f23749j.schedule(this, j, TimeUnit.MILLISECONDS);
    }

    public synchronized void run() {
        C4695a a = this.f23754o.m20890a(this.f23747h);
        if (a != null) {
            String a2 = a.m20883a();
            long b = a.m20884b();
            long b2 = b - C4712d.m20956b();
            if (b2 <= f23740a) {
                Log.i(f23742c, "Saved token has expired. Fetching a new one.");
                mo4869d();
            } else {
                String str = f23742c;
                StringBuilder stringBuilder = new StringBuilder(60);
                stringBuilder.append("Token loaded from file. Expires in: ");
                stringBuilder.append(b2);
                stringBuilder.append(" ms.");
                Log.i(str, stringBuilder.toString());
                m27929a(a2, b, b2);
                return;
            }
        }
        if (C6403c.m27931b(this.f23746g)) {
            this.f23757r.m27925a((C4696a) this);
            return;
        }
        Log.i(f23742c, "Waiting for active network connection to fetch a new auth token.");
        new C4697a(this).m20888a(this.f23746g);
    }

    /* renamed from: b */
    private static boolean m27931b(Context context) {
        if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            return true;
        }
        context = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null || context.isConnected() == null) {
            return null;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo4865a(C4713a c4713a) {
        C5571j.m24293a((Object) c4713a, (Object) "callback");
        if (m27932e()) {
            c4713a.mo4891a(this);
            return;
        }
        synchronized (this.f23756q) {
            boolean isEmpty = this.f23756q.isEmpty();
            this.f23756q.add(c4713a);
        }
        if (isEmpty) {
            m27928a(0);
        }
    }

    /* renamed from: c */
    public final synchronized String mo4868c() {
        if (!m27932e()) {
            return null;
        }
        return this.f23755p.m20883a();
    }

    /* renamed from: e */
    private synchronized boolean m27932e() {
        return this.f23755p != null;
    }

    /* renamed from: d */
    public final void mo4869d() {
        Log.i(f23742c, "Token rejected");
        synchronized (this) {
            this.f23755p = null;
            long b = C4712d.m20956b();
            if (b < this.f23753n + f23741b) {
                return;
            }
            this.f23753n = b;
            this.f23754o.m20891a();
        }
    }

    /* renamed from: f */
    private void m27933f() {
        synchronized (this.f23756q) {
            for (C4713a c4713a : this.f23756q) {
                if (c4713a != null) {
                    c4713a.mo4891a(this);
                }
            }
            this.f23756q.clear();
        }
    }

    /* renamed from: a */
    public final void mo4866a(String str, long j) {
        this.f23753n = -1;
        long b = C4712d.m20956b() + j;
        m27929a(str, b, j);
        this.f23754o.m20892a(this.f23747h, str, b);
    }

    /* renamed from: b */
    public final void mo4867b() {
        if (this.f23750k != null) {
            this.f23750k.cancel(true);
        }
    }

    /* renamed from: a */
    public final void mo4864a() {
        m27928a(Math.min(f23744e, (long) ((((double) f23743d) * Math.pow(1.6d, (double) this.f23752m)) + (this.f23751l.nextDouble() * ((double) f23745f)))));
        this.f23752m++;
    }
}
