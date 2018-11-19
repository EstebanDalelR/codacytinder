package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.model.ChatScreenState;
import com.tinder.chat.view.provider.C10650w;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java8.util.function.Supplier;
import javax.inject.Provider;
import rx.Observable;

/* renamed from: com.tinder.chat.injection.a.j */
public final class C12718j implements Factory<Supplier<Observable<ChatScreenState>>> {
    /* renamed from: a */
    private final C8440a f41024a;
    /* renamed from: b */
    private final Provider<C10650w> f41025b;

    public /* synthetic */ Object get() {
        return m50055a();
    }

    /* renamed from: a */
    public Supplier<Observable<ChatScreenState>> m50055a() {
        return C12718j.m50054a(this.f41024a, this.f41025b);
    }

    /* renamed from: a */
    public static Supplier<Observable<ChatScreenState>> m50054a(C8440a c8440a, Provider<C10650w> provider) {
        return C12718j.m50053a(c8440a, (C10650w) provider.get());
    }

    /* renamed from: a */
    public static Supplier<Observable<ChatScreenState>> m50053a(C8440a c8440a, C10650w c10650w) {
        return (Supplier) C15521i.a(c8440a.m36023a(c10650w), "Cannot return null from a non-@Nullable @Provides method");
    }
}
