package android.arch.lifecycle;

import android.arch.core.p003b.C0008b;
import android.support.annotation.CallSuper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.g */
public class C3979g<T> extends C2686i<T> {
    /* renamed from: a */
    private C0008b<LiveData<?>, C2685a<?>> f12637a = new C0008b();

    /* renamed from: android.arch.lifecycle.g$a */
    private static class C2685a<V> implements Observer<V> {
        /* renamed from: a */
        final LiveData<V> f8502a;
        /* renamed from: b */
        final Observer<V> f8503b;
        /* renamed from: c */
        int f8504c = -1;

        C2685a(LiveData<V> liveData, Observer<V> observer) {
            this.f8502a = liveData;
            this.f8503b = observer;
        }

        /* renamed from: a */
        void m10473a() {
            this.f8502a.m67a((Observer) this);
        }

        /* renamed from: b */
        void m10474b() {
            this.f8502a.mo3031b((Observer) this);
        }

        public void onChanged(@Nullable V v) {
            if (this.f8504c != this.f8502a.m69b()) {
                this.f8504c = this.f8502a.m69b();
                this.f8503b.onChanged(v);
            }
        }
    }

    @MainThread
    /* renamed from: a */
    public <S> void m15520a(@NonNull LiveData<S> liveData, @NonNull Observer<S> observer) {
        C2685a c2685a = new C2685a(liveData, observer);
        C2685a c2685a2 = (C2685a) this.f12637a.mo19a(liveData, c2685a);
        if (c2685a2 == null || c2685a2.f8503b == observer) {
            if (c2685a2 == null && m74e() != null) {
                c2685a.m10473a();
            }
            return;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }

    @MainThread
    /* renamed from: d */
    public <S> void m15523d(@NonNull LiveData<S> liveData) {
        C2685a c2685a = (C2685a) this.f12637a.mo20b(liveData);
        if (c2685a != null) {
            c2685a.m10474b();
        }
    }

    @CallSuper
    /* renamed from: c */
    protected void mo24c() {
        Iterator it = this.f12637a.iterator();
        while (it.hasNext()) {
            ((C2685a) ((Entry) it.next()).getValue()).m10473a();
        }
    }

    @CallSuper
    /* renamed from: d */
    protected void mo25d() {
        Iterator it = this.f12637a.iterator();
        while (it.hasNext()) {
            ((C2685a) ((Entry) it.next()).getValue()).m10474b();
        }
    }
}
