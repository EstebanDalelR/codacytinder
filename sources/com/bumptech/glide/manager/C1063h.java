package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.p026d.C0987h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.manager.h */
public class C1063h implements Callback {
    /* renamed from: c */
    private static final C1063h f2905c = new C1063h();
    /* renamed from: a */
    final Map<FragmentManager, C1062g> f2906a = new HashMap();
    /* renamed from: b */
    final Map<android.support.v4.app.FragmentManager, C4114j> f2907b = new HashMap();
    /* renamed from: d */
    private volatile RequestManager f2908d;
    /* renamed from: e */
    private final Handler f2909e = new Handler(Looper.getMainLooper(), this);

    /* renamed from: a */
    public static C1063h m3655a() {
        return f2905c;
    }

    C1063h() {
    }

    /* renamed from: b */
    private RequestManager m3656b(Context context) {
        if (this.f2908d == null) {
            synchronized (this) {
                if (this.f2908d == null) {
                    this.f2908d = new RequestManager(context.getApplicationContext(), new C3112b(), new C3113e());
                }
            }
        }
        return this.f2908d;
    }

    /* renamed from: a */
    public RequestManager m3659a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (C0987h.m3415c() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m3662a((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return m3658a((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return m3659a(((ContextWrapper) context).getBaseContext());
            }
        }
        return m3656b(context);
    }

    /* renamed from: a */
    public RequestManager m3662a(FragmentActivity fragmentActivity) {
        if (C0987h.m3416d()) {
            return m3659a(fragmentActivity.getApplicationContext());
        }
        C1063h.m3657b((Activity) fragmentActivity);
        return m3661a((Context) fragmentActivity, fragmentActivity.getSupportFragmentManager());
    }

    @TargetApi(11)
    /* renamed from: a */
    public RequestManager m3658a(Activity activity) {
        if (!C0987h.m3416d()) {
            if (VERSION.SDK_INT >= 11) {
                C1063h.m3657b(activity);
                return m3660a((Context) activity, activity.getFragmentManager());
            }
        }
        return m3659a(activity.getApplicationContext());
    }

    @TargetApi(17)
    /* renamed from: b */
    private static void m3657b(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed() != null) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @TargetApi(17)
    /* renamed from: a */
    C1062g m3663a(FragmentManager fragmentManager) {
        C1062g c1062g = (C1062g) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (c1062g != null) {
            return c1062g;
        }
        c1062g = (C1062g) this.f2906a.get(fragmentManager);
        if (c1062g != null) {
            return c1062g;
        }
        Fragment c1062g2 = new C1062g();
        this.f2906a.put(fragmentManager, c1062g2);
        fragmentManager.beginTransaction().add(c1062g2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f2909e.obtainMessage(1, fragmentManager).sendToTarget();
        return c1062g2;
    }

    @TargetApi(11)
    /* renamed from: a */
    RequestManager m3660a(Context context, FragmentManager fragmentManager) {
        fragmentManager = m3663a(fragmentManager);
        RequestManager b = fragmentManager.m3652b();
        if (b != null) {
            return b;
        }
        b = new RequestManager(context, fragmentManager.m3650a(), fragmentManager.m3653c());
        fragmentManager.m3651a(b);
        return b;
    }

    /* renamed from: a */
    C4114j m3664a(android.support.v4.app.FragmentManager fragmentManager) {
        C4114j c4114j = (C4114j) fragmentManager.mo428a("com.bumptech.glide.manager");
        if (c4114j != null) {
            return c4114j;
        }
        c4114j = (C4114j) this.f2907b.get(fragmentManager);
        if (c4114j != null) {
            return c4114j;
        }
        android.support.v4.app.Fragment c4114j2 = new C4114j();
        this.f2907b.put(fragmentManager, c4114j2);
        fragmentManager.mo429a().mo405a(c4114j2, "com.bumptech.glide.manager").mo412d();
        this.f2909e.obtainMessage(2, fragmentManager).sendToTarget();
        return c4114j2;
    }

    /* renamed from: a */
    RequestManager m3661a(Context context, android.support.v4.app.FragmentManager fragmentManager) {
        fragmentManager = m3664a(fragmentManager);
        RequestManager b = fragmentManager.m15989b();
        if (b != null) {
            return b;
        }
        b = new RequestManager(context, fragmentManager.m15987a(), fragmentManager.m15990c());
        fragmentManager.m15988a(b);
        return b;
    }

    public boolean handleMessage(Message message) {
        Object obj = null;
        boolean z = true;
        switch (message.what) {
            case 1:
                obj = (FragmentManager) message.obj;
                message = this.f2906a.remove(obj);
                break;
            case 2:
                obj = (android.support.v4.app.FragmentManager) message.obj;
                message = this.f2907b.remove(obj);
                break;
            default:
                z = false;
                message = null;
                break;
        }
        if (z && r5 == null && Log.isLoggable("RMRetriever", 5) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to remove expected request manager fragment, manager: ");
            stringBuilder.append(obj);
            Log.w("RMRetriever", stringBuilder.toString());
        }
        return z;
    }
}
