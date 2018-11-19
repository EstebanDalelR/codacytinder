package android.arch.lifecycle;

import android.arch.core.p002a.C2673a;
import android.arch.core.p003b.C0008b;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    /* renamed from: b */
    private static final Object f19b = new Object();
    /* renamed from: a */
    private final Object f20a = new Object();
    /* renamed from: c */
    private C0008b<Observer<T>, C0011b> f21c = new C0008b();
    /* renamed from: d */
    private int f22d = 0;
    /* renamed from: e */
    private volatile Object f23e = f19b;
    /* renamed from: f */
    private volatile Object f24f = f19b;
    /* renamed from: g */
    private int f25g = -1;
    /* renamed from: h */
    private boolean f26h;
    /* renamed from: i */
    private boolean f27i;
    /* renamed from: j */
    private final Runnable f28j = new C00101(this);

    /* renamed from: android.arch.lifecycle.LiveData$1 */
    class C00101 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ LiveData f14a;

        C00101(LiveData liveData) {
            this.f14a = liveData;
        }

        public void run() {
            Object b;
            synchronized (this.f14a.f20a) {
                b = this.f14a.f24f;
                this.f14a.f24f = LiveData.f19b;
            }
            this.f14a.mo40b(b);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$b */
    private abstract class C0011b {
        /* renamed from: c */
        final Observer<T> f15c;
        /* renamed from: d */
        boolean f16d;
        /* renamed from: e */
        int f17e = -1;
        /* renamed from: f */
        final /* synthetic */ LiveData f18f;

        /* renamed from: a */
        abstract boolean mo23a();

        /* renamed from: a */
        boolean mo2955a(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* renamed from: b */
        void mo2956b() {
        }

        C0011b(LiveData liveData, Observer<T> observer) {
            this.f18f = liveData;
            this.f15c = observer;
        }

        /* renamed from: a */
        void m51a(boolean z) {
            if (z != this.f16d) {
                this.f16d = z;
                int i = 1;
                z = !this.f18f.f22d;
                LiveData liveData = this.f18f;
                int c = liveData.f22d;
                if (!this.f16d) {
                    i = -1;
                }
                liveData.f22d = c + i;
                if (z && this.f16d) {
                    this.f18f.mo24c();
                }
                if (!(this.f18f.f22d || this.f16d)) {
                    this.f18f.mo25d();
                }
                if (this.f16d) {
                    this.f18f.m62b(this);
                }
            }
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private class C2678a extends C0011b {
        /* renamed from: a */
        final /* synthetic */ LiveData f8488a;

        /* renamed from: a */
        boolean mo23a() {
            return true;
        }

        C2678a(LiveData liveData, Observer<T> observer) {
            this.f8488a = liveData;
            super(liveData, observer);
        }
    }

    class LifecycleBoundObserver extends C0011b implements GenericLifecycleObserver {
        @NonNull
        /* renamed from: a */
        final LifecycleOwner f12628a;
        /* renamed from: b */
        final /* synthetic */ LiveData f12629b;

        LifecycleBoundObserver(LiveData liveData, @NonNull LifecycleOwner lifecycleOwner, Observer<T> observer) {
            this.f12629b = liveData;
            super(liveData, observer);
            this.f12628a = lifecycleOwner;
        }

        /* renamed from: a */
        boolean mo23a() {
            return this.f12628a.getLifecycle().mo35a().isAtLeast(State.STARTED);
        }

        public void onStateChanged(LifecycleOwner lifecycleOwner, Event event) {
            if (this.f12628a.getLifecycle().mo35a() == State.DESTROYED) {
                this.f12629b.mo3031b(this.c);
            } else {
                m51a((boolean) mo23a());
            }
        }

        /* renamed from: a */
        boolean mo2955a(LifecycleOwner lifecycleOwner) {
            return this.f12628a == lifecycleOwner ? true : null;
        }

        /* renamed from: b */
        void mo2956b() {
            this.f12628a.getLifecycle().mo37b(this);
        }
    }

    /* renamed from: c */
    protected void mo24c() {
    }

    /* renamed from: d */
    protected void mo25d() {
    }

    /* renamed from: a */
    private void m58a(C0011b c0011b) {
        if (!c0011b.f16d) {
            return;
        }
        if (!c0011b.mo23a()) {
            c0011b.m51a(false);
        } else if (c0011b.f17e < this.f25g) {
            c0011b.f17e = this.f25g;
            c0011b.f15c.onChanged(this.f23e);
        }
    }

    /* renamed from: b */
    private void m62b(@Nullable C0011b c0011b) {
        if (this.f26h) {
            this.f27i = true;
            return;
        }
        this.f26h = true;
        do {
            this.f27i = false;
            if (c0011b == null) {
                Iterator c = this.f21c.m45c();
                while (c.hasNext()) {
                    m58a((C0011b) ((Entry) c.next()).getValue());
                    if (this.f27i) {
                        break;
                    }
                }
            }
            m58a((C0011b) c0011b);
            c0011b = null;
        } while (this.f27i);
        this.f26h = false;
    }

    @MainThread
    /* renamed from: a */
    public void m66a(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
        if (lifecycleOwner.getLifecycle().mo35a() != State.DESTROYED) {
            LifecycleObserver lifecycleBoundObserver = new LifecycleBoundObserver(this, lifecycleOwner, observer);
            C0011b c0011b = (C0011b) this.f21c.mo19a(observer, lifecycleBoundObserver);
            if (c0011b != null && !c0011b.mo2955a(lifecycleOwner)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (c0011b == null) {
                lifecycleOwner.getLifecycle().mo36a(lifecycleBoundObserver);
            }
        }
    }

    @MainThread
    /* renamed from: a */
    public void m67a(@NonNull Observer<T> observer) {
        C2678a c2678a = new C2678a(this, observer);
        C0011b c0011b = (C0011b) this.f21c.mo19a(observer, c2678a);
        if (c0011b != null && (c0011b instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (c0011b == null) {
            c2678a.m51a(true);
        }
    }

    @MainThread
    /* renamed from: b */
    public void mo3031b(@NonNull Observer<T> observer) {
        m60a("removeObserver");
        C0011b c0011b = (C0011b) this.f21c.mo20b(observer);
        if (c0011b != null) {
            c0011b.mo2956b();
            c0011b.m51a(false);
        }
    }

    /* renamed from: a */
    protected void mo39a(T t) {
        synchronized (this.f20a) {
            Object obj = this.f24f == f19b ? 1 : null;
            this.f24f = t;
        }
        if (obj != null) {
            C2673a.m10423a().mo16b(this.f28j);
        }
    }

    @MainThread
    /* renamed from: b */
    protected void mo40b(T t) {
        m60a("setValue");
        this.f25g++;
        this.f23e = t;
        m62b((C0011b) null);
    }

    @Nullable
    /* renamed from: a */
    public T m65a() {
        T t = this.f23e;
        return t != f19b ? t : null;
    }

    /* renamed from: b */
    int m69b() {
        return this.f25g;
    }

    /* renamed from: e */
    public boolean m74e() {
        return this.f22d > 0;
    }

    /* renamed from: a */
    private static void m60a(String str) {
        if (!C2673a.m10423a().mo17d()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot invoke ");
            stringBuilder.append(str);
            stringBuilder.append(" on a background");
            stringBuilder.append(" thread");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
