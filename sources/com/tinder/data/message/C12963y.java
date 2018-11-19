package com.tinder.data.message;

import com.tinder.data.message.p225a.C10810c;
import com.tinder.domain.message.GifRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.message.y */
public final class C12963y implements Factory<GifRepository> {
    /* renamed from: a */
    private final C8698t f41519a;
    /* renamed from: b */
    private final Provider<C10810c> f41520b;

    public /* synthetic */ Object get() {
        return m50696a();
    }

    /* renamed from: a */
    public GifRepository m50696a() {
        return C12963y.m50695a(this.f41519a, this.f41520b);
    }

    /* renamed from: a */
    public static GifRepository m50695a(C8698t c8698t, Provider<C10810c> provider) {
        return C12963y.m50694a(c8698t, (C10810c) provider.get());
    }

    /* renamed from: a */
    public static GifRepository m50694a(C8698t c8698t, C10810c c10810c) {
        return (GifRepository) C15521i.a(c8698t.m37157a(c10810c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
