package com.tinder.fastmatch;

import com.tinder.domain.fastmatch.RefreshNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.fastmatch.k */
public final class C13197k implements Factory<RefreshNotifier> {
    /* renamed from: a */
    private final C9370a f41899a;

    public /* synthetic */ Object get() {
        return m51177a();
    }

    public C13197k(C9370a c9370a) {
        this.f41899a = c9370a;
    }

    /* renamed from: a */
    public RefreshNotifier m51177a() {
        return C13197k.m51174a(this.f41899a);
    }

    /* renamed from: a */
    public static RefreshNotifier m51174a(C9370a c9370a) {
        return C13197k.m51176c(c9370a);
    }

    /* renamed from: b */
    public static C13197k m51175b(C9370a c9370a) {
        return new C13197k(c9370a);
    }

    /* renamed from: c */
    public static RefreshNotifier m51176c(C9370a c9370a) {
        return (RefreshNotifier) C15521i.a(c9370a.m39223a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
