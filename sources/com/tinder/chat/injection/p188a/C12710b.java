package com.tinder.chat.injection.p188a;

import android.content.Context;
import com.tinder.chat.activity.ChatActivity;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.b */
public final class C12710b implements Factory<Context> {
    /* renamed from: a */
    private final C8440a f40998a;
    /* renamed from: b */
    private final Provider<ChatActivity> f40999b;

    public /* synthetic */ Object get() {
        return m50026a();
    }

    public C12710b(C8440a c8440a, Provider<ChatActivity> provider) {
        this.f40998a = c8440a;
        this.f40999b = provider;
    }

    /* renamed from: a */
    public Context m50026a() {
        return C12710b.m50024a(this.f40998a, this.f40999b);
    }

    /* renamed from: a */
    public static Context m50024a(C8440a c8440a, Provider<ChatActivity> provider) {
        return C12710b.m50023a(c8440a, (ChatActivity) provider.get());
    }

    /* renamed from: b */
    public static C12710b m50025b(C8440a c8440a, Provider<ChatActivity> provider) {
        return new C12710b(c8440a, provider);
    }

    /* renamed from: a */
    public static Context m50023a(C8440a c8440a, ChatActivity chatActivity) {
        return (Context) C15521i.a(c8440a.m36011a(chatActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
