package com.tinder.onboarding.module;

import com.tinder.onboarding.view.DateWidgetDateValidator;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.onboarding.module.i */
public final class C13520i implements Factory<DateWidgetDateValidator> {
    /* renamed from: a */
    private final C2655a f43120a;

    public /* synthetic */ Object get() {
        return m52659a();
    }

    public C13520i(C2655a c2655a) {
        this.f43120a = c2655a;
    }

    /* renamed from: a */
    public DateWidgetDateValidator m52659a() {
        return C13520i.m52656a(this.f43120a);
    }

    /* renamed from: a */
    public static DateWidgetDateValidator m52656a(C2655a c2655a) {
        return C13520i.m52658c(c2655a);
    }

    /* renamed from: b */
    public static C13520i m52657b(C2655a c2655a) {
        return new C13520i(c2655a);
    }

    /* renamed from: c */
    public static DateWidgetDateValidator m52658c(C2655a c2655a) {
        return (DateWidgetDateValidator) C15521i.a(c2655a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
