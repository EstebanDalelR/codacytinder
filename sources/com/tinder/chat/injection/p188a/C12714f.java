package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.provider.C10647l;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.f */
public final class C12714f implements Factory<ChatInputTextStateUpdatesNotifier> {
    /* renamed from: a */
    private final C8440a f41016a;
    /* renamed from: b */
    private final Provider<C10647l> f41017b;

    public /* synthetic */ Object get() {
        return m50040a();
    }

    /* renamed from: a */
    public ChatInputTextStateUpdatesNotifier m50040a() {
        return C12714f.m50039a(this.f41016a, this.f41017b);
    }

    /* renamed from: a */
    public static ChatInputTextStateUpdatesNotifier m50039a(C8440a c8440a, Provider<C10647l> provider) {
        return C12714f.m50038a(c8440a, (C10647l) provider.get());
    }

    /* renamed from: a */
    public static ChatInputTextStateUpdatesNotifier m50038a(C8440a c8440a, C10647l c10647l) {
        return (ChatInputTextStateUpdatesNotifier) C15521i.a(c8440a.m36028b(c10647l), "Cannot return null from a non-@Nullable @Provides method");
    }
}
