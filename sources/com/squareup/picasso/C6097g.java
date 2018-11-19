package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.picasso.g */
class C6097g {
    /* renamed from: a */
    final C6095b f22381a = new C6095b();
    /* renamed from: b */
    final Context f22382b;
    /* renamed from: c */
    final ExecutorService f22383c;
    /* renamed from: d */
    final Downloader f22384d;
    /* renamed from: e */
    final Map<String, C6090c> f22385e;
    /* renamed from: f */
    final Map<Object, C6084a> f22386f;
    /* renamed from: g */
    final Map<Object, C6084a> f22387g;
    /* renamed from: h */
    final Set<Object> f22388h;
    /* renamed from: i */
    final Handler f22389i;
    /* renamed from: j */
    final Handler f22390j;
    /* renamed from: k */
    final Cache f22391k;
    /* renamed from: l */
    final C6110s f22392l;
    /* renamed from: m */
    final List<C6090c> f22393m;
    /* renamed from: n */
    final C6096c f22394n;
    /* renamed from: o */
    final boolean f22395o;
    /* renamed from: p */
    boolean f22396p;

    /* renamed from: com.squareup.picasso.g$a */
    private static class C6094a extends Handler {
        /* renamed from: a */
        private final C6097g f22379a;

        public C6094a(Looper looper, C6097g c6097g) {
            super(looper);
            this.f22379a = c6097g;
        }

        public void handleMessage(final Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f22379a.m26497c((C6084a) message.obj);
                    return;
                case 2:
                    this.f22379a.m26499d((C6084a) message.obj);
                    return;
                case 4:
                    this.f22379a.m26501e((C6090c) message.obj);
                    return;
                case 5:
                    this.f22379a.m26500d((C6090c) message.obj);
                    return;
                case 6:
                    this.f22379a.m26489a((C6090c) message.obj, false);
                    return;
                case 7:
                    this.f22379a.m26484a();
                    return;
                case 9:
                    this.f22379a.m26492b((NetworkInfo) message.obj);
                    return;
                case 10:
                    C6097g c6097g = this.f22379a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    c6097g.m26496b(z);
                    return;
                case 11:
                    this.f22379a.m26490a(message.obj);
                    return;
                case 12:
                    this.f22379a.m26495b(message.obj);
                    return;
                default:
                    Picasso.f22316a.post(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C6094a f22378b;

                        public void run() {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown handler message received: ");
                            stringBuilder.append(message.what);
                            throw new AssertionError(stringBuilder.toString());
                        }
                    });
                    return;
            }
        }
    }

    /* renamed from: com.squareup.picasso.g$b */
    static class C6095b extends HandlerThread {
        C6095b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.g$c */
    static class C6096c extends BroadcastReceiver {
        /* renamed from: a */
        private final C6097g f22380a;

        C6096c(C6097g c6097g) {
            this.f22380a = c6097g;
        }

        /* renamed from: a */
        void m26478a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f22380a.f22395o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f22380a.f22382b.registerReceiver(this, intentFilter);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state") != null) {
                        this.f22380a.m26491a(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) != null) {
                    this.f22380a.m26485a(((ConnectivityManager) C6120v.m26569a(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    C6097g(Context context, ExecutorService executorService, Handler handler, Downloader downloader, Cache cache, C6110s c6110s) {
        this.f22381a.start();
        C6120v.m26576a(this.f22381a.getLooper());
        this.f22382b = context;
        this.f22383c = executorService;
        this.f22385e = new LinkedHashMap();
        this.f22386f = new WeakHashMap();
        this.f22387g = new WeakHashMap();
        this.f22388h = new HashSet();
        this.f22389i = new C6094a(this.f22381a.getLooper(), this);
        this.f22384d = downloader;
        this.f22390j = handler;
        this.f22391k = cache;
        this.f22392l = c6110s;
        this.f22393m = new ArrayList(4);
        this.f22396p = C6120v.m26587d(this.f22382b);
        this.f22395o = C6120v.m26583b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.f22394n = new C6096c(this);
        this.f22394n.m26478a();
    }

    /* renamed from: a */
    void m26486a(C6084a c6084a) {
        this.f22389i.sendMessage(this.f22389i.obtainMessage(1, c6084a));
    }

    /* renamed from: b */
    void m26493b(C6084a c6084a) {
        this.f22389i.sendMessage(this.f22389i.obtainMessage(2, c6084a));
    }

    /* renamed from: a */
    void m26488a(C6090c c6090c) {
        this.f22389i.sendMessage(this.f22389i.obtainMessage(4, c6090c));
    }

    /* renamed from: b */
    void m26494b(C6090c c6090c) {
        this.f22389i.sendMessageDelayed(this.f22389i.obtainMessage(5, c6090c), 500);
    }

    /* renamed from: c */
    void m26498c(C6090c c6090c) {
        this.f22389i.sendMessage(this.f22389i.obtainMessage(6, c6090c));
    }

    /* renamed from: a */
    void m26485a(NetworkInfo networkInfo) {
        this.f22389i.sendMessage(this.f22389i.obtainMessage(9, networkInfo));
    }

    /* renamed from: a */
    void m26491a(boolean z) {
        this.f22389i.sendMessage(this.f22389i.obtainMessage(10, z, 0));
    }

    /* renamed from: c */
    void m26497c(C6084a c6084a) {
        m26487a(c6084a, true);
    }

    /* renamed from: a */
    void m26487a(C6084a c6084a, boolean z) {
        if (this.f22388h.contains(c6084a.m26450l())) {
            this.f22387g.put(c6084a.m26442d(), c6084a);
            if (c6084a.m26448j().f22327l) {
                String a = c6084a.f22335b.m26517a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("because tag '");
                stringBuilder.append(c6084a.m26450l());
                stringBuilder.append("' is paused");
                C6120v.m26579a("Dispatcher", "paused", a, stringBuilder.toString());
            }
            return;
        }
        C6090c c6090c = (C6090c) this.f22385e.get(c6084a.m26443e());
        if (c6090c != null) {
            c6090c.m26460a(c6084a);
        } else if (this.f22383c.isShutdown()) {
            if (c6084a.m26448j().f22327l) {
                C6120v.m26579a("Dispatcher", "ignored", c6084a.f22335b.m26517a(), "because shut down");
            }
        } else {
            Object a2 = C6090c.m26455a(c6084a.m26448j(), this, this.f22391k, this.f22392l, c6084a);
            a2.f22368n = this.f22383c.submit(a2);
            this.f22385e.put(c6084a.m26443e(), a2);
            if (z) {
                this.f22386f.remove(c6084a.m26442d());
            }
            if (c6084a.m26448j().f22327l) {
                C6120v.m26578a("Dispatcher", "enqueued", c6084a.f22335b.m26517a());
            }
        }
    }

    /* renamed from: d */
    void m26499d(C6084a c6084a) {
        String e = c6084a.m26443e();
        C6090c c6090c = (C6090c) this.f22385e.get(e);
        if (c6090c != null) {
            c6090c.m26462b(c6084a);
            if (c6090c.m26463b()) {
                this.f22385e.remove(e);
                if (c6084a.m26448j().f22327l) {
                    C6120v.m26578a("Dispatcher", "canceled", c6084a.m26441c().m26517a());
                }
            }
        }
        if (this.f22388h.contains(c6084a.m26450l())) {
            this.f22387g.remove(c6084a.m26442d());
            if (c6084a.m26448j().f22327l) {
                C6120v.m26579a("Dispatcher", "canceled", c6084a.m26441c().m26517a(), "because paused request got canceled");
            }
        }
        c6084a = (C6084a) this.f22386f.remove(c6084a.m26442d());
        if (c6084a != null && c6084a.m26448j().f22327l) {
            C6120v.m26579a("Dispatcher", "canceled", c6084a.m26441c().m26517a(), "from replaying");
        }
    }

    /* renamed from: a */
    void m26490a(Object obj) {
        if (this.f22388h.add(obj)) {
            Iterator it = this.f22385e.values().iterator();
            while (it.hasNext()) {
                C6090c c6090c = (C6090c) it.next();
                boolean z = c6090c.m26471j().f22327l;
                C6084a i = c6090c.m26470i();
                List k = c6090c.m26472k();
                Object obj2 = (k == null || k.isEmpty()) ? null : 1;
                if (i != null || obj2 != null) {
                    if (i != null && i.m26450l().equals(obj)) {
                        c6090c.m26462b(i);
                        this.f22387g.put(i.m26442d(), i);
                        if (z) {
                            String a = i.f22335b.m26517a();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("because tag '");
                            stringBuilder.append(obj);
                            stringBuilder.append("' was paused");
                            C6120v.m26579a("Dispatcher", "paused", a, stringBuilder.toString());
                        }
                    }
                    if (obj2 != null) {
                        for (int size = k.size() - 1; size >= 0; size--) {
                            C6084a c6084a = (C6084a) k.get(size);
                            if (c6084a.m26450l().equals(obj)) {
                                c6090c.m26462b(c6084a);
                                this.f22387g.put(c6084a.m26442d(), c6084a);
                                if (z) {
                                    String a2 = c6084a.f22335b.m26517a();
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append("because tag '");
                                    stringBuilder2.append(obj);
                                    stringBuilder2.append("' was paused");
                                    C6120v.m26579a("Dispatcher", "paused", a2, stringBuilder2.toString());
                                }
                            }
                        }
                    }
                    if (c6090c.m26463b()) {
                        it.remove();
                        if (z) {
                            C6120v.m26579a("Dispatcher", "canceled", C6120v.m26571a(c6090c), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    void m26495b(Object obj) {
        if (this.f22388h.remove(obj)) {
            Object obj2 = null;
            Iterator it = this.f22387g.values().iterator();
            while (it.hasNext()) {
                C6084a c6084a = (C6084a) it.next();
                if (c6084a.m26450l().equals(obj)) {
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                    }
                    obj2.add(c6084a);
                    it.remove();
                }
            }
            if (obj2 != null) {
                this.f22390j.sendMessage(this.f22390j.obtainMessage(13, obj2));
            }
        }
    }

    /* renamed from: d */
    void m26500d(C6090c c6090c) {
        if (!c6090c.m26464c()) {
            boolean z = false;
            if (this.f22383c.isShutdown()) {
                m26489a(c6090c, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f22395o) {
                networkInfo = ((ConnectivityManager) C6120v.m26569a(this.f22382b, "connectivity")).getActiveNetworkInfo();
            }
            Object obj = (networkInfo == null || !networkInfo.isConnected()) ? null : 1;
            boolean a = c6090c.m26461a(this.f22396p, networkInfo);
            boolean d = c6090c.m26465d();
            if (a) {
                if (this.f22395o) {
                    if (obj == null) {
                        m26489a(c6090c, d);
                        if (d) {
                            m26482f(c6090c);
                        }
                        return;
                    }
                }
                if (c6090c.m26471j().f22327l) {
                    C6120v.m26578a("Dispatcher", "retrying", C6120v.m26571a(c6090c));
                }
                if (c6090c.m26473l() instanceof ContentLengthException) {
                    c6090c.f22363i |= NetworkPolicy.NO_CACHE.index;
                }
                c6090c.f22368n = this.f22383c.submit(c6090c);
                return;
            }
            if (this.f22395o && d) {
                z = true;
            }
            m26489a(c6090c, z);
            if (z) {
                m26482f(c6090c);
            }
        }
    }

    /* renamed from: e */
    void m26501e(C6090c c6090c) {
        if (MemoryPolicy.shouldWriteToMemoryCache(c6090c.m26468g())) {
            this.f22391k.set(c6090c.m26467f(), c6090c.m26466e());
        }
        this.f22385e.remove(c6090c.m26467f());
        m26483g(c6090c);
        if (c6090c.m26471j().f22327l) {
            C6120v.m26579a("Dispatcher", "batched", C6120v.m26571a(c6090c), "for completion");
        }
    }

    /* renamed from: a */
    void m26484a() {
        List arrayList = new ArrayList(this.f22393m);
        this.f22393m.clear();
        this.f22390j.sendMessage(this.f22390j.obtainMessage(8, arrayList));
        m26479a(arrayList);
    }

    /* renamed from: a */
    void m26489a(C6090c c6090c, boolean z) {
        if (c6090c.m26471j().f22327l) {
            String str = "Dispatcher";
            String str2 = "batched";
            String a = C6120v.m26571a(c6090c);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("for error");
            stringBuilder.append(z ? " (will replay)" : "");
            C6120v.m26579a(str, str2, a, stringBuilder.toString());
        }
        this.f22385e.remove(c6090c.m26467f());
        m26483g(c6090c);
    }

    /* renamed from: b */
    void m26496b(boolean z) {
        this.f22396p = z;
    }

    /* renamed from: b */
    void m26492b(NetworkInfo networkInfo) {
        if (this.f22383c instanceof C6101n) {
            ((C6101n) this.f22383c).m26512a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected() != null) {
            m26480b();
        }
    }

    /* renamed from: b */
    private void m26480b() {
        if (!this.f22386f.isEmpty()) {
            Iterator it = this.f22386f.values().iterator();
            while (it.hasNext()) {
                C6084a c6084a = (C6084a) it.next();
                it.remove();
                if (c6084a.m26448j().f22327l) {
                    C6120v.m26578a("Dispatcher", "replaying", c6084a.m26441c().m26517a());
                }
                m26487a(c6084a, false);
            }
        }
    }

    /* renamed from: f */
    private void m26482f(C6090c c6090c) {
        C6084a i = c6090c.m26470i();
        if (i != null) {
            m26481e(i);
        }
        c6090c = c6090c.m26472k();
        if (c6090c != null) {
            int size = c6090c.size();
            for (int i2 = 0; i2 < size; i2++) {
                m26481e((C6084a) c6090c.get(i2));
            }
        }
    }

    /* renamed from: e */
    private void m26481e(C6084a c6084a) {
        Object d = c6084a.m26442d();
        if (d != null) {
            c6084a.f22344k = true;
            this.f22386f.put(d, c6084a);
        }
    }

    /* renamed from: g */
    private void m26483g(C6090c c6090c) {
        if (!c6090c.m26464c()) {
            this.f22393m.add(c6090c);
            if (this.f22389i.hasMessages(7) == null) {
                this.f22389i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: a */
    private void m26479a(List<C6090c> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                if (((C6090c) list.get(0)).m26471j().f22327l) {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (C6090c c6090c : list) {
                        if (stringBuilder.length() > 0) {
                            stringBuilder.append(", ");
                        }
                        stringBuilder.append(C6120v.m26571a(c6090c));
                    }
                    C6120v.m26578a("Dispatcher", "delivered", stringBuilder.toString());
                }
            }
        }
    }
}
