package com.tinder.chat.injection.p188a;

import android.arch.lifecycle.Lifecycle;
import com.tinder.chat.activity.ChatActivity;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.r */
public final class C12726r implements Factory<Lifecycle> {
    /* renamed from: a */
    private final C8440a f41040a;
    /* renamed from: b */
    private final Provider<ChatActivity> f41041b;

    public /* synthetic */ Object get() {
        return m50085a();
    }

    /* renamed from: a */
    public Lifecycle m50085a() {
        return C12726r.m50084a(this.f41040a, this.f41041b);
    }

    /* renamed from: a */
    public static Lifecycle m50084a(C8440a c8440a, Provider<ChatActivity> provider) {
        return C12726r.m50083a(c8440a, (ChatActivity) provider.get());
    }

    /* renamed from: a */
    public static Lifecycle m50083a(C8440a c8440a, ChatActivity chatActivity) {
        return (Lifecycle) C15521i.a(c8440a.m36024b(chatActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
