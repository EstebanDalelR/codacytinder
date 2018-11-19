package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;

public class WorkQueue {
    /* renamed from: a */
    static final /* synthetic */ boolean f4683a = true;
    /* renamed from: b */
    private final Object f4684b;
    /* renamed from: c */
    private C3411a f4685c;
    /* renamed from: d */
    private final int f4686d;
    /* renamed from: e */
    private final Executor f4687e;
    /* renamed from: f */
    private C3411a f4688f;
    /* renamed from: g */
    private int f4689g;

    public interface WorkItem {
        boolean cancel();

        boolean isRunning();

        void moveToFront();
    }

    /* renamed from: com.facebook.internal.WorkQueue$a */
    private class C3411a implements WorkItem {
        /* renamed from: a */
        static final /* synthetic */ boolean f10383a = true;
        /* renamed from: b */
        final /* synthetic */ WorkQueue f10384b;
        /* renamed from: c */
        private final Runnable f10385c;
        /* renamed from: d */
        private C3411a f10386d;
        /* renamed from: e */
        private C3411a f10387e;
        /* renamed from: f */
        private boolean f10388f;

        static {
            Class cls = WorkQueue.class;
        }

        C3411a(WorkQueue workQueue, Runnable runnable) {
            this.f10384b = workQueue;
            this.f10385c = runnable;
        }

        public boolean cancel() {
            synchronized (this.f10384b.f4684b) {
                if (isRunning()) {
                    return false;
                }
                this.f10384b.f4685c = m13084a(this.f10384b.f4685c);
                return f10383a;
            }
        }

        public void moveToFront() {
            synchronized (this.f10384b.f4684b) {
                if (!isRunning()) {
                    this.f10384b.f4685c = m13084a(this.f10384b.f4685c);
                    this.f10384b.f4685c = m13085a(this.f10384b.f4685c, f10383a);
                }
            }
        }

        public boolean isRunning() {
            return this.f10388f;
        }

        /* renamed from: a */
        Runnable m13086a() {
            return this.f10385c;
        }

        /* renamed from: a */
        void m13087a(boolean z) {
            this.f10388f = z;
        }

        /* renamed from: a */
        C3411a m13085a(C3411a c3411a, boolean z) {
            if (!f10383a && this.f10386d != null) {
                throw new AssertionError();
            } else if (f10383a || this.f10387e == null) {
                if (c3411a == null) {
                    this.f10387e = this;
                    this.f10386d = this;
                    c3411a = this;
                } else {
                    this.f10386d = c3411a;
                    this.f10387e = c3411a.f10387e;
                    C3411a c3411a2 = this.f10386d;
                    this.f10387e.f10386d = this;
                    c3411a2.f10387e = this;
                }
                return z ? this : c3411a;
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        C3411a m13084a(C3411a c3411a) {
            if (!f10383a && this.f10386d == null) {
                throw new AssertionError();
            } else if (f10383a || this.f10387e != null) {
                if (c3411a == this) {
                    if (this.f10386d == this) {
                        c3411a = null;
                    } else {
                        c3411a = this.f10386d;
                    }
                }
                this.f10386d.f10387e = this.f10387e;
                this.f10387e.f10386d = this.f10386d;
                this.f10387e = null;
                this.f10386d = null;
                return c3411a;
            } else {
                throw new AssertionError();
            }
        }
    }

    public WorkQueue() {
        this(8);
    }

    public WorkQueue(int i) {
        this(i, FacebookSdk.m3990c());
    }

    public WorkQueue(int i, Executor executor) {
        this.f4684b = new Object();
        this.f4688f = null;
        this.f4689g = 0;
        this.f4686d = i;
        this.f4687e = executor;
    }

    /* renamed from: a */
    public WorkItem m5854a(Runnable runnable) {
        return m5855a(runnable, (boolean) f4683a);
    }

    /* renamed from: a */
    public WorkItem m5855a(Runnable runnable, boolean z) {
        WorkItem c3411a = new C3411a(this, runnable);
        synchronized (this.f4684b) {
            this.f4685c = c3411a.m13085a(this.f4685c, z);
        }
        m5848a();
        return c3411a;
    }

    /* renamed from: a */
    private void m5848a() {
        m5849a(null);
    }

    /* renamed from: a */
    private void m5849a(C3411a c3411a) {
        synchronized (this.f4684b) {
            if (c3411a != null) {
                this.f4688f = c3411a.m13084a(this.f4688f);
                this.f4689g -= 1;
            }
            if (this.f4689g < this.f4686d) {
                c3411a = this.f4685c;
                if (c3411a != null) {
                    this.f4685c = c3411a.m13084a(this.f4685c);
                    this.f4688f = c3411a.m13085a(this.f4688f, false);
                    this.f4689g++;
                    c3411a.m13087a((boolean) f4683a);
                }
            } else {
                c3411a = null;
            }
        }
        if (c3411a != null) {
            m5853b(c3411a);
        }
    }

    /* renamed from: b */
    private void m5853b(final C3411a c3411a) {
        this.f4687e.execute(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ WorkQueue f4682b;

            public void run() {
                try {
                    c3411a.m13086a().run();
                } finally {
                    this.f4682b.m5849a(c3411a);
                }
            }
        });
    }
}
