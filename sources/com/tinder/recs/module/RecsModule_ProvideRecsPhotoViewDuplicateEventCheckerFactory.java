package com.tinder.recs.module;

import com.tinder.recs.analytics.dedupe.RecsPhotoViewDuplicateEventChecker;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class RecsModule_ProvideRecsPhotoViewDuplicateEventCheckerFactory implements Factory<RecsPhotoViewDuplicateEventChecker> {
    private final RecsModule module;

    public RecsModule_ProvideRecsPhotoViewDuplicateEventCheckerFactory(RecsModule recsModule) {
        this.module = recsModule;
    }

    public RecsPhotoViewDuplicateEventChecker get() {
        return provideInstance(this.module);
    }

    public static RecsPhotoViewDuplicateEventChecker provideInstance(RecsModule recsModule) {
        return proxyProvideRecsPhotoViewDuplicateEventChecker(recsModule);
    }

    public static RecsModule_ProvideRecsPhotoViewDuplicateEventCheckerFactory create(RecsModule recsModule) {
        return new RecsModule_ProvideRecsPhotoViewDuplicateEventCheckerFactory(recsModule);
    }

    public static RecsPhotoViewDuplicateEventChecker proxyProvideRecsPhotoViewDuplicateEventChecker(RecsModule recsModule) {
        return (RecsPhotoViewDuplicateEventChecker) C15521i.m58001a(recsModule.provideRecsPhotoViewDuplicateEventChecker(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
