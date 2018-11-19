package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.C15606a.C15605b;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.C15641e;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.fabric.sdk.android.c */
public class C15608c {
    /* renamed from: a */
    static volatile C15608c f48312a;
    /* renamed from: b */
    static final Logger f48313b = new C17321b();
    /* renamed from: c */
    final Logger f48314c;
    /* renamed from: d */
    final boolean f48315d;
    /* renamed from: e */
    private final Context f48316e;
    /* renamed from: f */
    private final Map<Class<? extends C15611g>, C15611g> f48317f;
    /* renamed from: g */
    private final ExecutorService f48318g;
    /* renamed from: h */
    private final Handler f48319h;
    /* renamed from: i */
    private final InitializationCallback<C15608c> f48320i;
    /* renamed from: j */
    private final InitializationCallback<?> f48321j;
    /* renamed from: k */
    private final IdManager f48322k;
    /* renamed from: l */
    private C15606a f48323l;
    /* renamed from: m */
    private WeakReference<Activity> f48324m;
    /* renamed from: n */
    private AtomicBoolean f48325n = new AtomicBoolean(null);

    /* renamed from: io.fabric.sdk.android.c$a */
    public static class C15607a {
        /* renamed from: a */
        private final Context f48303a;
        /* renamed from: b */
        private C15611g[] f48304b;
        /* renamed from: c */
        private C15641e f48305c;
        /* renamed from: d */
        private Handler f48306d;
        /* renamed from: e */
        private Logger f48307e;
        /* renamed from: f */
        private boolean f48308f;
        /* renamed from: g */
        private String f48309g;
        /* renamed from: h */
        private String f48310h;
        /* renamed from: i */
        private InitializationCallback<C15608c> f48311i;

        public C15607a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f48303a = context;
        }

        /* renamed from: a */
        public C15607a m58547a(C15611g... c15611gArr) {
            if (this.f48304b != null) {
                throw new IllegalStateException("Kits already set.");
            }
            this.f48304b = c15611gArr;
            return this;
        }

        /* renamed from: a */
        public C15608c m58548a() {
            HashMap hashMap;
            if (this.f48305c == null) {
                this.f48305c = C15641e.m58738a();
            }
            if (this.f48306d == null) {
                this.f48306d = new Handler(Looper.getMainLooper());
            }
            if (this.f48307e == null) {
                if (this.f48308f) {
                    this.f48307e = new C17321b(3);
                } else {
                    this.f48307e = new C17321b();
                }
            }
            if (this.f48310h == null) {
                this.f48310h = this.f48303a.getPackageName();
            }
            if (this.f48311i == null) {
                this.f48311i = InitializationCallback.f48296d;
            }
            if (this.f48304b == null) {
                hashMap = new HashMap();
            } else {
                hashMap = C15608c.m58556b(Arrays.asList(this.f48304b));
            }
            HashMap hashMap2 = hashMap;
            Context applicationContext = this.f48303a.getApplicationContext();
            return new C15608c(applicationContext, hashMap2, this.f48305c, this.f48306d, this.f48307e, this.f48308f, this.f48311i, new IdManager(applicationContext, this.f48310h, this.f48309g, hashMap2.values()), C15608c.m58559d(this.f48303a));
        }
    }

    /* renamed from: io.fabric.sdk.android.c$1 */
    class C173221 extends C15605b {
        /* renamed from: a */
        final /* synthetic */ C15608c f53024a;

        C173221(C15608c c15608c) {
            this.f53024a = c15608c;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            this.f53024a.m58565a(activity);
        }

        public void onActivityStarted(Activity activity) {
            this.f53024a.m58565a(activity);
        }

        public void onActivityResumed(Activity activity) {
            this.f53024a.m58565a(activity);
        }
    }

    /* renamed from: c */
    public String m58570c() {
        return "1.4.3.25";
    }

    /* renamed from: d */
    public String m58571d() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: a */
    static C15608c m58549a() {
        if (f48312a != null) {
            return f48312a;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    C15608c(Context context, Map<Class<? extends C15611g>, C15611g> map, C15641e c15641e, Handler handler, Logger logger, boolean z, InitializationCallback initializationCallback, IdManager idManager, Activity activity) {
        this.f48316e = context;
        this.f48317f = map;
        this.f48318g = c15641e;
        this.f48319h = handler;
        this.f48314c = logger;
        this.f48315d = z;
        this.f48320i = initializationCallback;
        this.f48321j = m58564a(map.size());
        this.f48322k = idManager;
        m58565a(activity);
    }

    /* renamed from: a */
    public static C15608c m58550a(Context context, C15611g... c15611gArr) {
        if (f48312a == null) {
            synchronized (C15608c.class) {
                if (f48312a == null) {
                    C15608c.m58558c(new C15607a(context).m58547a(c15611gArr).m58548a());
                }
            }
        }
        return f48312a;
    }

    /* renamed from: c */
    private static void m58558c(C15608c c15608c) {
        f48312a = c15608c;
        c15608c.m58563k();
    }

    /* renamed from: a */
    public C15608c m58565a(Activity activity) {
        this.f48324m = new WeakReference(activity);
        return this;
    }

    /* renamed from: b */
    public Activity m58568b() {
        return this.f48324m != null ? (Activity) this.f48324m.get() : null;
    }

    /* renamed from: k */
    private void m58563k() {
        this.f48323l = new C15606a(this.f48316e);
        this.f48323l.m58546a(new C173221(this));
        m58566a(this.f48316e);
    }

    /* renamed from: a */
    void m58566a(Context context) {
        Future b = m58569b(context);
        Collection g = m58574g();
        C17324i c17324i = new C17324i(b, g);
        List<C15611g> arrayList = new ArrayList(g);
        Collections.sort(arrayList);
        c17324i.injectParameters(context, this, InitializationCallback.f48296d, this.f48322k);
        for (C15611g injectParameters : arrayList) {
            injectParameters.injectParameters(context, this, this.f48321j, this.f48322k);
        }
        c17324i.initialize();
        if (C15608c.m58560h().isLoggable("Fabric", 3) != null) {
            context = new StringBuilder("Initializing ");
            context.append(m58571d());
            context.append(" [Version: ");
            context.append(m58570c());
            context.append("], with the following kits:\n");
        } else {
            context = null;
        }
        for (C15611g c15611g : arrayList) {
            c15611g.initializationTask.m63395a(c17324i.initializationTask);
            m58567a(this.f48317f, c15611g);
            c15611g.initialize();
            if (context != null) {
                context.append(c15611g.getIdentifier());
                context.append(" [Version: ");
                context.append(c15611g.getVersion());
                context.append("]\n");
            }
        }
        if (context != null) {
            C15608c.m58560h().mo12791d("Fabric", context.toString());
        }
    }

    /* renamed from: a */
    void m58567a(Map<Class<? extends C15611g>, C15611g> map, C15611g c15611g) {
        DependsOn dependsOn = c15611g.dependsOnAnnotation;
        if (dependsOn != null) {
            for (Class cls : dependsOn.value()) {
                if (cls.isInterface()) {
                    for (C15611g c15611g2 : map.values()) {
                        if (cls.isAssignableFrom(c15611g2.getClass())) {
                            c15611g.initializationTask.m63395a(c15611g2.initializationTask);
                        }
                    }
                } else if (((C15611g) map.get(cls)) == null) {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                } else {
                    c15611g.initializationTask.m63395a(((C15611g) map.get(cls)).initializationTask);
                }
            }
        }
    }

    /* renamed from: d */
    private static Activity m58559d(Context context) {
        return context instanceof Activity ? (Activity) context : null;
    }

    /* renamed from: e */
    public C15606a m58572e() {
        return this.f48323l;
    }

    /* renamed from: f */
    public ExecutorService m58573f() {
        return this.f48318g;
    }

    /* renamed from: g */
    public Collection<C15611g> m58574g() {
        return this.f48317f.values();
    }

    /* renamed from: a */
    public static <T extends C15611g> T m58551a(Class<T> cls) {
        return (C15611g) C15608c.m58549a().f48317f.get(cls);
    }

    /* renamed from: h */
    public static Logger m58560h() {
        if (f48312a == null) {
            return f48313b;
        }
        return f48312a.f48314c;
    }

    /* renamed from: i */
    public static boolean m58561i() {
        if (f48312a == null) {
            return false;
        }
        return f48312a.f48315d;
    }

    /* renamed from: j */
    public static boolean m58562j() {
        return f48312a != null && f48312a.f48325n.get();
    }

    /* renamed from: b */
    private static Map<Class<? extends C15611g>, C15611g> m58556b(Collection<? extends C15611g> collection) {
        Map hashMap = new HashMap(collection.size());
        C15608c.m58554a(hashMap, (Collection) collection);
        return hashMap;
    }

    /* renamed from: a */
    private static void m58554a(Map<Class<? extends C15611g>, C15611g> map, Collection<? extends C15611g> collection) {
        for (C15611g c15611g : collection) {
            map.put(c15611g.getClass(), c15611g);
            if (c15611g instanceof KitGroup) {
                C15608c.m58554a((Map) map, ((KitGroup) c15611g).getKits());
            }
        }
    }

    /* renamed from: a */
    InitializationCallback<?> m58564a(final int i) {
        return new InitializationCallback(this) {
            /* renamed from: a */
            final CountDownLatch f53025a = new CountDownLatch(i);
            /* renamed from: c */
            final /* synthetic */ C15608c f53027c;

            public void success(Object obj) {
                this.f53025a.countDown();
                if (this.f53025a.getCount() == 0) {
                    this.f53027c.f48325n.set(true);
                    this.f53027c.f48320i.success(this.f53027c);
                }
            }

            public void failure(Exception exception) {
                this.f53027c.f48320i.failure(exception);
            }
        };
    }

    /* renamed from: b */
    Future<Map<String, C15612h>> m58569b(Context context) {
        return m58573f().submit(new C15610e(context.getPackageCodePath()));
    }
}
