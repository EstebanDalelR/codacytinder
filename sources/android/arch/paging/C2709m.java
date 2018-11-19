package android.arch.paging;

import android.arch.paging.C0046e.C0045a;
import android.arch.paging.C0054f.C0049a;
import android.arch.paging.C0054f.C0051c;
import android.arch.paging.C0054f.C0053d;
import android.arch.paging.C0056h.C0055a;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.m */
class C2709m<T> extends C0054f<T> implements C0055a {
    /* renamed from: h */
    private final C2705j<T> f8560h;
    /* renamed from: i */
    private C0045a<T> f8561i = new C27081(this);

    /* renamed from: android.arch.paging.m$1 */
    class C27081 extends C0045a<T> {
        /* renamed from: a */
        final /* synthetic */ C2709m f8559a;

        C27081(C2709m c2709m) {
            this.f8559a = c2709m;
        }

        @AnyThread
        /* renamed from: a */
        public void mo48a(int i, @NonNull C0046e<T> c0046e) {
            if (c0046e.m158b()) {
                this.f8559a.m194g();
            } else if (!this.f8559a.mo74f()) {
                if (i == 0 || i == 3) {
                    if (this.f8559a.e.m217h() == 0) {
                        this.f8559a.e.m205a(c0046e.f101b, c0046e.f100a, c0046e.f102c, c0046e.f103d, this.f8559a.d.f121a, this.f8559a);
                    } else {
                        this.f8559a.e.m207a(c0046e.f103d, c0046e.f100a, this.f8559a);
                    }
                    if (this.f8559a.c != null) {
                        boolean z = false;
                        boolean z2 = this.f8559a.e.size() == 0;
                        boolean z3 = !z2 && c0046e.f101b == 0 && c0046e.f103d == 0;
                        int size = this.f8559a.size();
                        if (!z2 && ((i == 0 && c0046e.f102c == 0) || (i == 3 && c0046e.f103d + this.f8559a.d.f121a >= size))) {
                            z = true;
                        }
                        this.f8559a.m183a(z2, z3, z);
                    }
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected resultType");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    boolean mo53a() {
        return false;
    }

    @WorkerThread
    C2709m(@NonNull C2705j<T> c2705j, @NonNull Executor executor, @NonNull Executor executor2, @Nullable C0049a<T> c0049a, @NonNull C0053d c0053d, int i) {
        super(new C0056h(), executor, executor2, c0049a, c0053d);
        this.f8560h = c2705j;
        int i2 = this.d.f121a;
        this.f = i;
        if (this.f8560h.mo2969b() != null) {
            m194g();
            return;
        }
        int max = Math.max(Math.round((float) (this.d.f124d / i2)), 2) * i2;
        this.f8560h.m10523a(true, Math.max(null, Math.round((float) ((i - (max / 2)) / i2)) * i2), max, i2, this.a, this.f8561i);
    }

    @NonNull
    /* renamed from: b */
    public DataSource<?, T> mo54b() {
        return this.f8560h;
    }

    @Nullable
    /* renamed from: c */
    public Object mo57c() {
        return Integer.valueOf(this.f);
    }

    /* renamed from: a */
    protected void mo52a(@NonNull C0054f<T> c0054f, @NonNull C0051c c0051c) {
        c0054f = c0054f.f129e;
        if (!c0054f.isEmpty()) {
            if (this.e.size() == c0054f.size()) {
                int i = this.d.f121a;
                int c = this.e.m212c() / i;
                int h = this.e.m217h();
                int i2 = 0;
                while (i2 < h) {
                    int i3 = i2 + c;
                    int i4 = 0;
                    while (i4 < this.e.m217h()) {
                        int i5 = i3 + i4;
                        if (!this.e.m209a(i, i5) || c0054f.m209a(i, i5)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 > 0) {
                        c0051c.mo46b(i3 * i, i * i4);
                        i2 += i4 - 1;
                    }
                    i2++;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
    }

    /* renamed from: a */
    protected void mo49a(int i) {
        this.e.m204a(i, this.d.f122b, this.d.f121a, (C0055a) this);
    }

    /* renamed from: b */
    public void mo55b(int i) {
        m186b(0, i);
    }

    /* renamed from: a */
    public void mo51a(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* renamed from: b */
    public void mo56b(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* renamed from: c */
    public void mo58c(final int i) {
        this.b.execute(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C2709m f165b;

            public void run() {
                if (!this.f165b.mo74f()) {
                    int i = this.f165b.d.f121a;
                    if (this.f165b.f8560h.mo2969b()) {
                        this.f165b.m194g();
                    } else {
                        int i2 = i * i;
                        this.f165b.f8560h.m10520a(3, i2, Math.min(i, this.f165b.e.size() - i2), this.f165b.a, this.f165b.f8561i);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo50a(int i, int i2) {
        m188c(i, i2);
    }
}
