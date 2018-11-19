package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.os.Handler;
import android.support.annotation.NonNull;

/* renamed from: android.arch.lifecycle.l */
public class C0027l {
    /* renamed from: a */
    private final C2684e f58a;
    /* renamed from: b */
    private final Handler f59b = new Handler();
    /* renamed from: c */
    private C0026a f60c;

    /* renamed from: android.arch.lifecycle.l$a */
    static class C0026a implements Runnable {
        /* renamed from: a */
        final Event f55a;
        /* renamed from: b */
        private final C2684e f56b;
        /* renamed from: c */
        private boolean f57c = false;

        C0026a(@NonNull C2684e c2684e, Event event) {
            this.f56b = c2684e;
            this.f55a = event;
        }

        public void run() {
            if (!this.f57c) {
                this.f56b.m10469a(this.f55a);
                this.f57c = true;
            }
        }
    }

    public C0027l(@NonNull LifecycleOwner lifecycleOwner) {
        this.f58a = new C2684e(lifecycleOwner);
    }

    /* renamed from: a */
    private void m118a(Event event) {
        if (this.f60c != null) {
            this.f60c.run();
        }
        this.f60c = new C0026a(this.f58a, event);
        this.f59b.postAtFrontOfQueue(this.f60c);
    }

    /* renamed from: a */
    public void m119a() {
        m118a(Event.ON_CREATE);
    }

    /* renamed from: b */
    public void m120b() {
        m118a(Event.ON_START);
    }

    /* renamed from: c */
    public void m121c() {
        m118a(Event.ON_START);
    }

    /* renamed from: d */
    public void m122d() {
        m118a(Event.ON_STOP);
        m118a(Event.ON_DESTROY);
    }

    /* renamed from: e */
    public Lifecycle m123e() {
        return this.f58a;
    }
}
