package io.fabric.sdk.android.services.cache;

import android.content.Context;

/* renamed from: io.fabric.sdk.android.services.cache.b */
public class C18331b<T> extends C17325a<T> {
    /* renamed from: a */
    private T f56798a;

    public C18331b() {
        this(null);
    }

    public C18331b(ValueCache<T> valueCache) {
        super(valueCache);
    }

    /* renamed from: a */
    protected void mo13553a(Context context) {
        this.f56798a = null;
    }

    /* renamed from: b */
    protected T mo13555b(Context context) {
        return this.f56798a;
    }

    /* renamed from: a */
    protected void mo13554a(Context context, T t) {
        this.f56798a = t;
    }
}
