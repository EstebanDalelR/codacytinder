package com.tinder.places.provider;

import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider;
import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider.OnboardingProgress;
import io.reactivex.C3959e;
import io.reactivex.subjects.C18432c;
import io.reactivex.subjects.C19040a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\t0\bH\u0016J\u0014\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0005j\u0002`\tH\u0016R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/places/provider/PlacesOnboardingProgressImplProvider;", "Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider;", "()V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider$OnboardingProgress;", "kotlin.jvm.PlatformType", "observeOnboardingProgress", "Lio/reactivex/Observable;", "Lcom/tinder/places/provider/Progress;", "updateOnboardingProgress", "", "progress", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.provider.j */
public final class C12422j implements PlacesOnboardingProgressProvider {
    /* renamed from: a */
    private final C19040a<OnboardingProgress> f40076a = C19040a.a(OnboardingProgress.NOT_STARTED);

    @NotNull
    public C3959e<OnboardingProgress> observeOnboardingProgress() {
        C18432c d = this.f40076a.d();
        C2668g.a(d, "subject.toSerialized()");
        return d;
    }

    public void updateOnboardingProgress(@NotNull OnboardingProgress onboardingProgress) {
        C2668g.b(onboardingProgress, "progress");
        this.f40076a.onNext(onboardingProgress);
    }
}
