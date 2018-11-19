package com.tinder.typingindicator.worker;

import com.tinder.typingindicator.repository.C17168c;
import com.tinder.typingindicator.usecase.C17172a;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;

/* renamed from: com.tinder.typingindicator.worker.f */
public final class C18270f implements Factory<C17203e> {
    /* renamed from: a */
    private final Provider<C17168c> f56595a;
    /* renamed from: b */
    private final Provider<C15679f> f56596b;
    /* renamed from: c */
    private final Provider<C15679f> f56597c;
    /* renamed from: d */
    private final Provider<C17172a> f56598d;
    /* renamed from: e */
    private final Provider<Function0<Long>> f56599e;

    public /* synthetic */ Object get() {
        return m66188a();
    }

    public C18270f(Provider<C17168c> provider, Provider<C15679f> provider2, Provider<C15679f> provider3, Provider<C17172a> provider4, Provider<Function0<Long>> provider5) {
        this.f56595a = provider;
        this.f56596b = provider2;
        this.f56597c = provider3;
        this.f56598d = provider4;
        this.f56599e = provider5;
    }

    /* renamed from: a */
    public C17203e m66188a() {
        return C18270f.m66186a(this.f56595a, this.f56596b, this.f56597c, this.f56598d, this.f56599e);
    }

    /* renamed from: a */
    public static C17203e m66186a(Provider<C17168c> provider, Provider<C15679f> provider2, Provider<C15679f> provider3, Provider<C17172a> provider4, Provider<Function0<Long>> provider5) {
        return new C17203e((C17168c) provider.get(), (C15679f) provider2.get(), (C15679f) provider3.get(), (C17172a) provider4.get(), (Function0) provider5.get());
    }

    /* renamed from: b */
    public static C18270f m66187b(Provider<C17168c> provider, Provider<C15679f> provider2, Provider<C15679f> provider3, Provider<C17172a> provider4, Provider<Function0<Long>> provider5) {
        return new C18270f(provider, provider2, provider3, provider4, provider5);
    }
}
