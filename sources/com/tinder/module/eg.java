package com.tinder.module;

import android.content.ClipboardManager;
import com.tinder.managers.ManagerApp;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class eg implements Factory<ClipboardManager> {
    /* renamed from: a */
    private final ec f42965a;
    /* renamed from: b */
    private final Provider<ManagerApp> f42966b;

    public /* synthetic */ Object get() {
        return m52451a();
    }

    /* renamed from: a */
    public ClipboardManager m52451a() {
        return m52450a(this.f42965a, this.f42966b);
    }

    /* renamed from: a */
    public static ClipboardManager m52450a(ec ecVar, Provider<ManagerApp> provider) {
        return m52449a(ecVar, (ManagerApp) provider.get());
    }

    /* renamed from: a */
    public static ClipboardManager m52449a(ec ecVar, ManagerApp managerApp) {
        return (ClipboardManager) C15521i.a(ecVar.m40891d(managerApp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
