package com.leanplum;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.os.Build.VERSION;
import com.leanplum.annotations.Parser;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.p069a.C2587d;
import com.leanplum.p069a.ag;
import com.leanplum.p069a.bo;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LeanplumActivityHelper {
    /* renamed from: a */
    static boolean f7830a;
    /* renamed from: b */
    static Activity f7831b;
    /* renamed from: c */
    private static Set<Class> f7832c;
    /* renamed from: d */
    private static boolean f7833d;
    /* renamed from: h */
    private static final Queue<Runnable> f7834h = new LinkedList();
    /* renamed from: i */
    private static final Runnable f7835i = new LeanplumActivityHelper$1();
    /* renamed from: e */
    private final Activity f7836e;
    /* renamed from: f */
    private LeanplumResources f7837f;
    /* renamed from: g */
    private LeanplumInflater f7838g;

    public LeanplumActivityHelper(Activity activity) {
        this.f7836e = activity;
        Leanplum.setApplicationContext(activity.getApplicationContext());
        Parser.parseVariables(activity);
    }

    public static Activity getCurrentActivity() {
        return f7831b;
    }

    public static boolean isActivityPaused() {
        return f7830a;
    }

    public static void enableLifecycleCallbacks(Application application) {
        Leanplum.setApplicationContext(application.getApplicationContext());
        if (VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(new LeanplumActivityHelper$2());
            f7833d = true;
        }
    }

    public LeanplumResources getLeanplumResources() {
        return getLeanplumResources(null);
    }

    public LeanplumResources getLeanplumResources(Resources resources) {
        if (this.f7837f != null) {
            return this.f7837f;
        }
        if (resources == null) {
            resources = this.f7836e.getResources();
        }
        if (resources instanceof LeanplumResources) {
            return (LeanplumResources) resources;
        }
        this.f7837f = new LeanplumResources(resources);
        return this.f7837f;
    }

    public void setContentView(int i) {
        if (this.f7838g == null) {
            this.f7838g = LeanplumInflater.from(this.f7836e);
        }
        this.f7836e.setContentView(this.f7838g.inflate(i));
    }

    /* renamed from: b */
    private static void m9387b() {
        f7830a = true;
    }

    public void onPause() {
        try {
            if (!f7833d) {
                f7830a = true;
            }
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    /* renamed from: d */
    private static void m9391d(Activity activity) {
        f7830a = false;
        f7831b = activity;
        if (!(ag.m9502k() == null && ag.m9503l() == null)) {
            Leanplum.m9356b();
            activity = C2587d.m9699b();
            if (activity != null) {
                activity.updateGeofencing();
                activity.updateUserLocation();
            }
        }
        ag.m9477a(f7835i);
    }

    public void onResume() {
        try {
            if (!f7833d) {
                m9391d(this.f7836e);
            }
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    /* renamed from: e */
    private static void m9392e(Activity activity) {
        if (f7830a) {
            Leanplum.m9344a();
            LocationManager b = C2587d.m9699b();
            if (b != null) {
                b.updateGeofencing();
            }
        }
        if (f7831b != null && f7831b.equals(activity) != null) {
            f7831b = null;
        }
    }

    public void onStop() {
        try {
            if (!f7833d) {
                m9392e(this.f7836e);
            }
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    public static void queueActionUponActive(Runnable runnable) {
        try {
            if (f7831b == null || f7831b.isFinishing() || f7830a || ((runnable instanceof PostponableAction) && m9393f(f7831b))) {
                synchronized (f7834h) {
                    f7834h.add(runnable);
                }
                return;
            }
            runnable.run();
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    /* renamed from: c */
    private static void m9389c() {
        if (!f7830a) {
            if (f7831b != null) {
                synchronized (f7834h) {
                    Queue<Runnable> linkedList = new LinkedList(f7834h);
                    f7834h.clear();
                }
                for (Runnable runnable : linkedList) {
                    if ((runnable instanceof PostponableAction) && m9393f(f7831b)) {
                        f7834h.add(runnable);
                    } else {
                        runnable.run();
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private static boolean m9393f(Activity activity) {
        return (f7832c == null || f7832c.contains(activity.getClass()) == null) ? null : true;
    }

    public static void deferMessagesForActivities(Class... clsArr) {
        if (clsArr != null) {
            if (clsArr.length != 0) {
                if (f7832c == null) {
                    f7832c = new HashSet(clsArr.length);
                }
                Collections.addAll(f7832c, clsArr);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m9385a() {
        if (!f7830a) {
            if (f7831b != null) {
                synchronized (f7834h) {
                    Queue<Runnable> linkedList = new LinkedList(f7834h);
                    f7834h.clear();
                }
                for (Runnable runnable : linkedList) {
                    if ((runnable instanceof PostponableAction) && m9393f(f7831b)) {
                        f7834h.add(runnable);
                    } else {
                        runnable.run();
                    }
                }
            }
        }
    }
}
