package com.tinder.messageads.p297d;

import android.content.SharedPreferences;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.messageads.d.d */
public final class C13475d implements Factory<SharedPreferences> {
    /* renamed from: a */
    private final C9907a f42738a;

    public /* synthetic */ Object get() {
        return m52044a();
    }

    public C13475d(C9907a c9907a) {
        this.f42738a = c9907a;
    }

    /* renamed from: a */
    public SharedPreferences m52044a() {
        return C13475d.m52041a(this.f42738a);
    }

    /* renamed from: a */
    public static SharedPreferences m52041a(C9907a c9907a) {
        return C13475d.m52043c(c9907a);
    }

    /* renamed from: b */
    public static C13475d m52042b(C9907a c9907a) {
        return new C13475d(c9907a);
    }

    /* renamed from: c */
    public static SharedPreferences m52043c(C9907a c9907a) {
        return (SharedPreferences) C15521i.a(c9907a.m40719a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
