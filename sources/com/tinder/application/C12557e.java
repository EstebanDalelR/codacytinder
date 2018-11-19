package com.tinder.application;

import com.tinder.core.experiment.AuthExperiment.AuthExperimentTimelineProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.application.e */
public final class C12557e implements Factory<AuthExperimentTimelineProvider> {
    /* renamed from: a */
    private static final C12557e f40586a = new C12557e();

    public /* synthetic */ Object get() {
        return m49634a();
    }

    /* renamed from: a */
    public AuthExperimentTimelineProvider m49634a() {
        return C12557e.m49631b();
    }

    /* renamed from: b */
    public static AuthExperimentTimelineProvider m49631b() {
        return C12557e.m49633d();
    }

    /* renamed from: c */
    public static C12557e m49632c() {
        return f40586a;
    }

    /* renamed from: d */
    public static AuthExperimentTimelineProvider m49633d() {
        return (AuthExperimentTimelineProvider) C15521i.a(C8256b.m35242a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
