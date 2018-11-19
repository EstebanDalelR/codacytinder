package com.tinder.smsauth.data.p412a;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.C17692o;
import okhttp3.Interceptor;

/* renamed from: com.tinder.smsauth.data.a.f */
public final class C18089f implements Factory<C17692o> {
    /* renamed from: a */
    private final C14966b f56180a;
    /* renamed from: b */
    private final Provider<Set<Interceptor>> f56181b;

    public /* synthetic */ Object get() {
        return m65679a();
    }

    /* renamed from: a */
    public C17692o m65679a() {
        return C18089f.m65678a(this.f56180a, this.f56181b);
    }

    /* renamed from: a */
    public static C17692o m65678a(C14966b c14966b, Provider<Set<Interceptor>> provider) {
        return C18089f.m65677a(c14966b, (Set) provider.get());
    }

    /* renamed from: a */
    public static C17692o m65677a(C14966b c14966b, Set<Interceptor> set) {
        return (C17692o) C15521i.m58001a(c14966b.m56547a((Set) set), "Cannot return null from a non-@Nullable @Provides method");
    }
}
