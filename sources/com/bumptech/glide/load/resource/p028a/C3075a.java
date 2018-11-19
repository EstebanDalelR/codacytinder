package com.bumptech.glide.load.resource.p028a;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;

/* renamed from: com.bumptech.glide.load.resource.a.a */
public abstract class C3075a<T extends Drawable> implements Resource<T> {
    /* renamed from: a */
    protected final T f9530a;

    public /* synthetic */ Object get() {
        return m12019a();
    }

    public C3075a(T t) {
        if (t == null) {
            throw new NullPointerException("Drawable must not be null!");
        }
        this.f9530a = t;
    }

    /* renamed from: a */
    public final T m12019a() {
        return this.f9530a.getConstantState().newDrawable();
    }
}
