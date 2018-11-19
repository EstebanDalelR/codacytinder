package android.arch.paging;

import android.arch.core.p002a.C2673a;
import android.arch.paging.C0054f.C0051c;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.recyclerview.extensions.AsyncDifferConfig;
import android.support.v7.recyclerview.extensions.AsyncDifferConfig.Builder;
import android.support.v7.util.AdapterListUpdateCallback;
import android.support.v7.util.DiffUtil.DiffResult;
import android.support.v7.util.DiffUtil.ItemCallback;
import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView.Adapter;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.a */
public class C0039a<T> {
    /* renamed from: a */
    Executor f79a = C2673a.m10424b();
    @Nullable
    /* renamed from: b */
    C0038a<T> f80b;
    /* renamed from: c */
    private final ListUpdateCallback f81c;
    /* renamed from: d */
    private final AsyncDifferConfig<T> f82d;
    /* renamed from: e */
    private boolean f83e;
    /* renamed from: f */
    private C0054f<T> f84f;
    /* renamed from: g */
    private C0054f<T> f85g;
    /* renamed from: h */
    private int f86h;
    /* renamed from: i */
    private C0051c f87i = new C26931(this);

    /* renamed from: android.arch.paging.a$a */
    interface C0038a<T> {
        /* renamed from: a */
        void mo60a(@Nullable C0054f<T> c0054f);
    }

    /* renamed from: android.arch.paging.a$1 */
    class C26931 extends C0051c {
        /* renamed from: a */
        final /* synthetic */ C0039a f8522a;

        C26931(C0039a c0039a) {
            this.f8522a = c0039a;
        }

        /* renamed from: a */
        public void mo45a(int i, int i2) {
            this.f8522a.f81c.onInserted(i, i2);
        }

        /* renamed from: b */
        public void mo46b(int i, int i2) {
            this.f8522a.f81c.onChanged(i, i2, null);
        }
    }

    public C0039a(@NonNull Adapter adapter, @NonNull ItemCallback<T> itemCallback) {
        this.f81c = new AdapterListUpdateCallback(adapter);
        this.f82d = new Builder(itemCallback).build();
    }

    @Nullable
    /* renamed from: a */
    public T m153a(int i) {
        if (this.f84f != null) {
            this.f84f.m189d(i);
            return this.f84f.get(i);
        } else if (this.f85g != null) {
            return this.f85g.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
    }

    /* renamed from: a */
    public int m152a() {
        if (this.f84f != null) {
            return this.f84f.size();
        }
        return this.f85g == null ? 0 : this.f85g.size();
    }

    /* renamed from: a */
    public void m154a(C0054f<T> c0054f) {
        if (c0054f != null) {
            if (this.f84f == null && this.f85g == null) {
                this.f83e = c0054f.mo53a();
            } else if (c0054f.mo53a() != this.f83e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        if (c0054f != this.f84f) {
            final int i = this.f86h + 1;
            this.f86h = i;
            if (c0054f == null) {
                c0054f = m152a();
                if (this.f84f != null) {
                    this.f84f.m180a(this.f87i);
                    this.f84f = null;
                } else if (this.f85g != null) {
                    this.f85g = null;
                }
                this.f81c.onRemoved(0, c0054f);
                if (this.f80b != null) {
                    this.f80b.mo60a(null);
                }
            } else if (this.f84f == null && this.f85g == null) {
                this.f84f = c0054f;
                c0054f.m182a(null, this.f87i);
                this.f81c.onInserted(0, c0054f.size());
                if (this.f80b != null) {
                    this.f80b.mo60a(c0054f);
                }
            } else {
                if (this.f84f != null) {
                    this.f84f.m180a(this.f87i);
                    this.f85g = (C0054f) this.f84f.m191e();
                    this.f84f = null;
                }
                if (this.f85g != null) {
                    if (this.f84f == null) {
                        final C0054f c0054f2 = this.f85g;
                        final C0054f c0054f3 = (C0054f) c0054f.m191e();
                        final C0054f<T> c0054f4 = c0054f;
                        this.f82d.getBackgroundThreadExecutor().execute(new Runnable(this) {
                            /* renamed from: e */
                            final /* synthetic */ C0039a f78e;

                            public void run() {
                                final DiffResult a = C0057i.m223a(c0054f2.f129e, c0054f3.f129e, this.f78e.f82d.getDiffCallback());
                                this.f78e.f79a.execute(new Runnable(this) {
                                    /* renamed from: b */
                                    final /* synthetic */ C00372 f73b;

                                    public void run() {
                                        if (this.f73b.f78e.f86h == i) {
                                            this.f73b.f78e.m149a(c0054f4, c0054f3, a);
                                        }
                                    }
                                });
                            }
                        });
                        return;
                    }
                }
                throw new IllegalStateException("must be in snapshot state to diff");
            }
        }
    }

    /* renamed from: a */
    private void m149a(C0054f<T> c0054f, C0054f<T> c0054f2, DiffResult diffResult) {
        if (this.f85g != null) {
            if (this.f84f == null) {
                C0054f c0054f3 = this.f85g;
                this.f84f = c0054f;
                this.f85g = null;
                C0057i.m224a(this.f81c, c0054f3.f129e, c0054f.f129e, diffResult);
                c0054f.m182a((List) c0054f2, this.f87i);
                if (this.f80b != null) {
                    this.f80b.mo60a(this.f84f);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("must be in snapshot state to apply diff");
    }
}
