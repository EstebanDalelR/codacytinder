package android.arch.paging;

import android.arch.paging.C0046e.C0045a;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.b */
abstract class C2694b<Key, Value> extends DataSource<Key, Value> {
    /* renamed from: a */
    abstract Key mo2963a(int i, Value value);

    /* renamed from: a */
    abstract void mo2964a(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull C0045a<Value> c0045a);

    /* renamed from: a */
    abstract void mo2965a(@Nullable Key key, int i, int i2, boolean z, @NonNull Executor executor, @NonNull C0045a<Value> c0045a);

    /* renamed from: a */
    boolean mo47a() {
        return true;
    }

    /* renamed from: b */
    abstract void mo2966b(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull C0045a<Value> c0045a);

    C2694b() {
    }
}
