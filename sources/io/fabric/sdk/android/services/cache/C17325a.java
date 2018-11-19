package io.fabric.sdk.android.services.cache;

import android.content.Context;

/* renamed from: io.fabric.sdk.android.services.cache.a */
public abstract class C17325a<T> implements ValueCache<T> {
    /* renamed from: a */
    private final ValueCache<T> f53039a;

    /* renamed from: a */
    protected abstract void mo13553a(Context context);

    /* renamed from: a */
    protected abstract void mo13554a(Context context, T t);

    /* renamed from: b */
    protected abstract T mo13555b(Context context);

    public C17325a(ValueCache<T> valueCache) {
        this.f53039a = valueCache;
    }

    public final synchronized T get(Context context, ValueLoader<T> valueLoader) throws Exception {
        T b;
        b = mo13555b(context);
        if (b == null) {
            b = this.f53039a != null ? this.f53039a.get(context, valueLoader) : valueLoader.load(context);
            m63386b(context, b);
        }
        return b;
    }

    public final synchronized void invalidate(Context context) {
        mo13553a(context);
    }

    /* renamed from: b */
    private void m63386b(Context context, T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        mo13554a(context, t);
    }
}
