package android.arch.paging;

import android.arch.paging.C0046e.C0045a;
import android.arch.paging.C0054f.C0049a;
import android.arch.paging.C0054f.C0051c;
import android.arch.paging.C0054f.C0053d;
import android.arch.paging.C0056h.C0055a;
import android.support.annotation.AnyThread;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.c */
class C2696c<K, V> extends C0054f<V> implements C0055a {
    /* renamed from: h */
    private final C2694b<K, V> f8524h;
    /* renamed from: i */
    private boolean f8525i = false;
    /* renamed from: j */
    private boolean f8526j = false;
    /* renamed from: k */
    private int f8527k = 0;
    /* renamed from: l */
    private int f8528l = 0;
    /* renamed from: m */
    private C0045a<V> f8529m = new C26951(this);

    /* renamed from: android.arch.paging.c$1 */
    class C26951 extends C0045a<V> {
        /* renamed from: a */
        final /* synthetic */ C2696c f8523a;

        C26951(C2696c c2696c) {
            this.f8523a = c2696c;
        }

        @AnyThread
        /* renamed from: a */
        public void mo48a(int i, @NonNull C0046e<V> c0046e) {
            if (c0046e.m158b()) {
                this.f8523a.m194g();
            } else if (!this.f8523a.mo74f()) {
                List list = c0046e.f100a;
                if (i == 0) {
                    this.f8523a.e.m206a(c0046e.f101b, list, c0046e.f102c, c0046e.f103d, this.f8523a);
                    if (this.f8523a.f == -1) {
                        this.f8523a.f = (c0046e.f101b + c0046e.f103d) + (list.size() / 2);
                    }
                } else if (i == 1) {
                    this.f8523a.e.m210b(list, this.f8523a);
                } else if (i == 2) {
                    this.f8523a.e.m208a(list, this.f8523a);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unexpected resultType ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                if (this.f8523a.c != null) {
                    boolean z = false;
                    boolean z2 = this.f8523a.e.size() == 0;
                    boolean z3 = !z2 && i == 2 && c0046e.f100a.size() == 0;
                    if (!z2 && i == 1 && c0046e.f100a.size() == 0) {
                        z = true;
                    }
                    this.f8523a.m183a(z2, z3, z);
                }
            }
        }
    }

    /* renamed from: a */
    boolean mo53a() {
        return true;
    }

    C2696c(@NonNull C2694b<K, V> c2694b, @NonNull Executor executor, @NonNull Executor executor2, @Nullable C0049a<V> c0049a, @NonNull C0053d c0053d, @Nullable K k, int i) {
        super(new C0056h(), executor, executor2, c0049a, c0053d);
        this.f8524h = c2694b;
        this.f = i;
        if (this.f8524h.mo2969b() != null) {
            m194g();
            return;
        }
        this.f8524h.mo2965a(k, this.d.f124d, this.d.f121a, this.d.f123c, this.a, this.f8529m);
    }

    @MainThread
    /* renamed from: a */
    void mo52a(@NonNull C0054f<V> c0054f, @NonNull C0051c c0051c) {
        c0054f = c0054f.f129e;
        int f = this.e.m215f() - c0054f.m215f();
        int g = this.e.m216g() - c0054f.m216g();
        int d = c0054f.m213d();
        int c = c0054f.m212c();
        if (!c0054f.isEmpty() && f >= 0 && g >= 0 && this.e.m213d() == Math.max(d - f, 0) && this.e.m212c() == Math.max(c - g, 0)) {
            if (this.e.m214e() == (c0054f.m214e() + f) + g) {
                if (f != 0) {
                    d = Math.min(d, f);
                    f -= d;
                    int c2 = c0054f.m212c() + c0054f.m214e();
                    if (d != 0) {
                        c0051c.mo46b(c2, d);
                    }
                    if (f != 0) {
                        c0051c.mo45a(c2 + d, f);
                    }
                }
                if (g != 0) {
                    c0054f = Math.min(c, g);
                    g -= c0054f;
                    if (c0054f != null) {
                        c0051c.mo46b(c, c0054f);
                    }
                    if (g != 0) {
                        c0051c.mo45a(0, g);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
    }

    @MainThread
    /* renamed from: a */
    protected void mo49a(int i) {
        int c = this.d.f122b - (i - this.e.m212c());
        i = (i + this.d.f122b) - (this.e.m212c() + this.e.m214e());
        this.f8527k = Math.max(c, this.f8527k);
        if (this.f8527k > 0) {
            m10501i();
        }
        this.f8528l = Math.max(i, this.f8528l);
        if (this.f8528l > 0) {
            m10502j();
        }
    }

    @MainThread
    /* renamed from: i */
    private void m10501i() {
        if (!this.f8525i) {
            this.f8525i = true;
            final int c = this.e.m212c() + this.e.m218i();
            final Object l = this.e.m221l();
            this.b.execute(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ C2696c f90c;

                public void run() {
                    if (!this.f90c.mo74f()) {
                        if (this.f90c.f8524h.mo2969b()) {
                            this.f90c.m194g();
                        } else {
                            this.f90c.f8524h.mo2966b(c, l, this.f90c.d.f121a, this.f90c.a, this.f90c.f8529m);
                        }
                    }
                }
            });
        }
    }

    @MainThread
    /* renamed from: j */
    private void m10502j() {
        if (!this.f8526j) {
            this.f8526j = true;
            final int c = ((this.e.m212c() + this.e.m214e()) - 1) + this.e.m218i();
            final Object m = this.e.m222m();
            this.b.execute(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ C2696c f93c;

                public void run() {
                    if (!this.f93c.mo74f()) {
                        if (this.f93c.f8524h.mo2969b()) {
                            this.f93c.m194g();
                        } else {
                            this.f93c.f8524h.mo2964a(c, m, this.f93c.d.f121a, this.f93c.a, this.f93c.f8529m);
                        }
                    }
                }
            });
        }
    }

    @NonNull
    /* renamed from: b */
    public DataSource<?, V> mo54b() {
        return this.f8524h;
    }

    @Nullable
    /* renamed from: c */
    public Object mo57c() {
        return this.f8524h.mo2963a(this.f, this.g);
    }

    @MainThread
    /* renamed from: b */
    public void mo55b(int i) {
        m186b(0, i);
    }

    @MainThread
    /* renamed from: a */
    public void mo51a(int i, int i2, int i3) {
        this.f8527k = (this.f8527k - i2) - i3;
        this.f8525i = false;
        if (this.f8527k > 0) {
            m10501i();
        }
        m188c(i, i2);
        m186b(0, i3);
        m192e(i3);
    }

    @MainThread
    /* renamed from: b */
    public void mo56b(int i, int i2, int i3) {
        this.f8528l = (this.f8528l - i2) - i3;
        this.f8526j = false;
        if (this.f8528l > 0) {
            m10502j();
        }
        m188c(i, i2);
        m186b(i + i2, i3);
    }

    @MainThread
    /* renamed from: c */
    public void mo58c(int i) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    @MainThread
    /* renamed from: a */
    public void mo50a(int i, int i2) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }
}
