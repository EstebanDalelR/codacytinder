package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0025k.C0024a;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;

/* renamed from: android.arch.lifecycle.j */
public class C2689j implements LifecycleOwner {
    /* renamed from: i */
    private static final C2689j f8507i = new C2689j();
    /* renamed from: a */
    private int f8508a = 0;
    /* renamed from: b */
    private int f8509b = 0;
    /* renamed from: c */
    private boolean f8510c = true;
    /* renamed from: d */
    private boolean f8511d = true;
    /* renamed from: e */
    private Handler f8512e;
    /* renamed from: f */
    private final C2684e f8513f = new C2684e(this);
    /* renamed from: g */
    private Runnable f8514g = new C00231(this);
    /* renamed from: h */
    private C0024a f8515h = new C26872(this);

    /* renamed from: android.arch.lifecycle.j$1 */
    class C00231 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C2689j f53a;

        C00231(C2689j c2689j) {
            this.f53a = c2689j;
        }

        public void run() {
            this.f53a.m10484e();
            this.f53a.m10485f();
        }
    }

    /* renamed from: android.arch.lifecycle.j$2 */
    class C26872 implements C0024a {
        /* renamed from: a */
        final /* synthetic */ C2689j f8505a;

        /* renamed from: a */
        public void mo41a() {
        }

        C26872(C2689j c2689j) {
            this.f8505a = c2689j;
        }

        /* renamed from: b */
        public void mo42b() {
            this.f8505a.m10486a();
        }

        /* renamed from: c */
        public void mo43c() {
            this.f8505a.m10487b();
        }
    }

    /* renamed from: android.arch.lifecycle.j$3 */
    class C26883 extends C0016b {
        /* renamed from: a */
        final /* synthetic */ C2689j f8506a;

        C26883(C2689j c2689j) {
            this.f8506a = c2689j;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0025k.m113b(activity).m117a(this.f8506a.f8515h);
        }

        public void onActivityPaused(Activity activity) {
            this.f8506a.m10489c();
        }

        public void onActivityStopped(Activity activity) {
            this.f8506a.m10490d();
        }
    }

    /* renamed from: a */
    static void m10481a(Context context) {
        f8507i.m10488b(context);
    }

    /* renamed from: a */
    void m10486a() {
        this.f8508a++;
        if (this.f8508a == 1 && this.f8511d) {
            this.f8513f.m10469a(Event.ON_START);
            this.f8511d = false;
        }
    }

    /* renamed from: b */
    void m10487b() {
        this.f8509b++;
        if (this.f8509b != 1) {
            return;
        }
        if (this.f8510c) {
            this.f8513f.m10469a(Event.ON_RESUME);
            this.f8510c = false;
            return;
        }
        this.f8512e.removeCallbacks(this.f8514g);
    }

    /* renamed from: c */
    void m10489c() {
        this.f8509b--;
        if (this.f8509b == 0) {
            this.f8512e.postDelayed(this.f8514g, 700);
        }
    }

    /* renamed from: d */
    void m10490d() {
        this.f8508a--;
        m10485f();
    }

    /* renamed from: e */
    private void m10484e() {
        if (this.f8509b == 0) {
            this.f8510c = true;
            this.f8513f.m10469a(Event.ON_PAUSE);
        }
    }

    /* renamed from: f */
    private void m10485f() {
        if (this.f8508a == 0 && this.f8510c) {
            this.f8513f.m10469a(Event.ON_STOP);
            this.f8511d = true;
        }
    }

    private C2689j() {
    }

    /* renamed from: b */
    void m10488b(Context context) {
        this.f8512e = new Handler();
        this.f8513f.m10469a(Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C26883(this));
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.f8513f;
    }
}
