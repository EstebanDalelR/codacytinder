package com.tinder.loops.ui.viewmodels;

import com.tinder.loops.data.CroppingRectangleRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.ui.viewmodels.c */
public final class C13382c implements Factory<VideoCropperViewModel> {
    /* renamed from: a */
    private final Provider<CroppingRectangleRepository> f42430a;

    public /* synthetic */ Object get() {
        return m51772a();
    }

    public C13382c(Provider<CroppingRectangleRepository> provider) {
        this.f42430a = provider;
    }

    /* renamed from: a */
    public VideoCropperViewModel m51772a() {
        return C13382c.m51770a(this.f42430a);
    }

    /* renamed from: a */
    public static VideoCropperViewModel m51770a(Provider<CroppingRectangleRepository> provider) {
        return new VideoCropperViewModel((CroppingRectangleRepository) provider.get());
    }

    /* renamed from: b */
    public static C13382c m51771b(Provider<CroppingRectangleRepository> provider) {
        return new C13382c(provider);
    }
}
