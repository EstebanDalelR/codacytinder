package com.tinder.loops.di.p271a;

import com.tinder.rx.RxSchedulerProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.loops.di.a.d */
public final class C13358d implements Factory<RxSchedulerProvider> {
    /* renamed from: a */
    private final C9767a f42365a;

    public /* synthetic */ Object get() {
        return m51678a();
    }

    public C13358d(C9767a c9767a) {
        this.f42365a = c9767a;
    }

    /* renamed from: a */
    public RxSchedulerProvider m51678a() {
        return C13358d.m51675a(this.f42365a);
    }

    /* renamed from: a */
    public static RxSchedulerProvider m51675a(C9767a c9767a) {
        return C13358d.m51677c(c9767a);
    }

    /* renamed from: b */
    public static C13358d m51676b(C9767a c9767a) {
        return new C13358d(c9767a);
    }

    /* renamed from: c */
    public static RxSchedulerProvider m51677c(C9767a c9767a) {
        return (RxSchedulerProvider) C15521i.a(c9767a.m40310a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
