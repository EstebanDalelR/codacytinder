package com.tinder.fastmatch;

import com.tinder.domain.fastmatch.repository.NewCountRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.fastmatch.d */
public final class C13190d implements Factory<NewCountRepository> {
    /* renamed from: a */
    private final C9370a f41885a;

    public /* synthetic */ Object get() {
        return m51149a();
    }

    public C13190d(C9370a c9370a) {
        this.f41885a = c9370a;
    }

    /* renamed from: a */
    public NewCountRepository m51149a() {
        return C13190d.m51146a(this.f41885a);
    }

    /* renamed from: a */
    public static NewCountRepository m51146a(C9370a c9370a) {
        return C13190d.m51148c(c9370a);
    }

    /* renamed from: b */
    public static C13190d m51147b(C9370a c9370a) {
        return new C13190d(c9370a);
    }

    /* renamed from: c */
    public static NewCountRepository m51148c(C9370a c9370a) {
        return (NewCountRepository) C15521i.a(c9370a.m39228b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
