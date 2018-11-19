package com.tinder.module;

import com.tinder.common.C10654a;
import com.tinder.common.log.C10681a.C8546a;
import com.tinder.common.log.LoggingInitializer;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class fa implements Factory<LoggingInitializer> {
    /* renamed from: a */
    private final ez f43008a;
    /* renamed from: b */
    private final Provider<C8546a> f43009b;
    /* renamed from: c */
    private final Provider<C10654a> f43010c;

    public /* synthetic */ Object get() {
        return m52509a();
    }

    /* renamed from: a */
    public LoggingInitializer m52509a() {
        return m52508a(this.f43008a, this.f43009b, this.f43010c);
    }

    /* renamed from: a */
    public static LoggingInitializer m52508a(ez ezVar, Provider<C8546a> provider, Provider<C10654a> provider2) {
        return m52507a(ezVar, (C8546a) provider.get(), (C10654a) provider2.get());
    }

    /* renamed from: a */
    public static LoggingInitializer m52507a(ez ezVar, C8546a c8546a, C10654a c10654a) {
        return (LoggingInitializer) C15521i.a(ezVar.m40895a(c8546a, c10654a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
