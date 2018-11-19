package com.tinder.smsauth.sdk.di;

import com.tinder.common.reactivex.schedulers.Schedulers;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.smsauth.sdk.di.q */
public final class C18134q implements Factory<Schedulers> {
    /* renamed from: a */
    private final C14996k f56269a;

    public /* synthetic */ Object get() {
        return m65799a();
    }

    public C18134q(C14996k c14996k) {
        this.f56269a = c14996k;
    }

    /* renamed from: a */
    public Schedulers m65799a() {
        return C18134q.m65796a(this.f56269a);
    }

    /* renamed from: a */
    public static Schedulers m65796a(C14996k c14996k) {
        return C18134q.m65798c(c14996k);
    }

    /* renamed from: b */
    public static C18134q m65797b(C14996k c14996k) {
        return new C18134q(c14996k);
    }

    /* renamed from: c */
    public static Schedulers m65798c(C14996k c14996k) {
        return (Schedulers) C15521i.m58001a(c14996k.m56604c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
