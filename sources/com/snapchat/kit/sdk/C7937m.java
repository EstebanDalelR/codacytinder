package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.m */
public final class C7937m implements Factory<SharedPreferences> {
    /* renamed from: a */
    private final C5951d f28537a;

    public /* synthetic */ Object get() {
        return m33792a();
    }

    public C7937m(C5951d c5951d) {
        this.f28537a = c5951d;
    }

    /* renamed from: a */
    public SharedPreferences m33792a() {
        return (SharedPreferences) C15521i.a(this.f28537a.m25565e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<SharedPreferences> m33791a(C5951d c5951d) {
        return new C7937m(c5951d);
    }
}
