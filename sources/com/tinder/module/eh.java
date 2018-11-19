package com.tinder.module;

import com.facebook.network.connectionclass.ConnectionClassManager;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class eh implements Factory<ConnectionClassManager> {
    /* renamed from: a */
    private final ec f42967a;

    public /* synthetic */ Object get() {
        return m52455a();
    }

    public eh(ec ecVar) {
        this.f42967a = ecVar;
    }

    /* renamed from: a */
    public ConnectionClassManager m52455a() {
        return m52452a(this.f42967a);
    }

    /* renamed from: a */
    public static ConnectionClassManager m52452a(ec ecVar) {
        return m52454c(ecVar);
    }

    /* renamed from: b */
    public static eh m52453b(ec ecVar) {
        return new eh(ecVar);
    }

    /* renamed from: c */
    public static ConnectionClassManager m52454c(ec ecVar) {
        return (ConnectionClassManager) C15521i.a(ecVar.m40879a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
