package com.tinder.module;

import com.tinder.common.utils.StringLinkDetector;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ds implements Factory<StringLinkDetector> {
    /* renamed from: a */
    private final bs f42940a;

    public /* synthetic */ Object get() {
        return m52405a();
    }

    public ds(bs bsVar) {
        this.f42940a = bsVar;
    }

    /* renamed from: a */
    public StringLinkDetector m52405a() {
        return m52402a(this.f42940a);
    }

    /* renamed from: a */
    public static StringLinkDetector m52402a(bs bsVar) {
        return m52404c(bsVar);
    }

    /* renamed from: b */
    public static ds m52403b(bs bsVar) {
        return new ds(bsVar);
    }

    /* renamed from: c */
    public static StringLinkDetector m52404c(bs bsVar) {
        return (StringLinkDetector) C15521i.a(bsVar.m40850m(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
