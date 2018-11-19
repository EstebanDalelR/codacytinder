package com.tinder.domain.profile.usecase;

import com.tinder.domain.onboarding.OnboardingTutorialAdapter;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.ProfileOption.Onboarding;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.model.Tutorials;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\rH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewedStatus;", "getProfileOptionData", "Lcom/tinder/domain/profile/usecase/GetProfileOptionData;", "onboardingTutorialAdapter", "Lcom/tinder/domain/onboarding/OnboardingTutorialAdapter;", "(Lcom/tinder/domain/profile/usecase/GetProfileOptionData;Lcom/tinder/domain/onboarding/OnboardingTutorialAdapter;)V", "execute", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "tutorial", "Lcom/tinder/domain/profile/model/Tutorial;", "getOnboardingTutorials", "Lio/reactivex/Observable;", "", "getTutorials", "Lcom/tinder/domain/profile/model/Tutorials;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class CheckTutorialViewed implements CheckTutorialViewedStatus {
    private final GetProfileOptionData getProfileOptionData;
    private final OnboardingTutorialAdapter onboardingTutorialAdapter;

    @Inject
    public CheckTutorialViewed(@NotNull GetProfileOptionData getProfileOptionData, @NotNull OnboardingTutorialAdapter onboardingTutorialAdapter) {
        C2668g.b(getProfileOptionData, "getProfileOptionData");
        C2668g.b(onboardingTutorialAdapter, "onboardingTutorialAdapter");
        this.getProfileOptionData = getProfileOptionData;
        this.onboardingTutorialAdapter = onboardingTutorialAdapter;
    }

    @NotNull
    public C3960g<TutorialViewStatus> execute(@NotNull Tutorial tutorial) {
        C2668g.b(tutorial, "tutorial");
        tutorial = C3959e.combineLatest(getTutorials(), getOnboardingTutorials(), CheckTutorialViewed$execute$1.INSTANCE).map(CheckTutorialViewed$execute$2.INSTANCE).firstElement().c(new Tutorials(C19301m.a())).e(new CheckTutorialViewed$execute$3(tutorial));
        C2668g.a(tutorial, "Observable.combineLatest…torialViewStatus.VIEWED }");
        return tutorial;
    }

    private final C3959e<Tutorials> getTutorials() {
        C3959e<Tutorials> d = this.getProfileOptionData.execute(ProfileOption.Tutorials.INSTANCE).d();
        C2668g.a(d, "getProfileOptionData.exe…          .toObservable()");
        return d;
    }

    private final C3959e<List<Tutorial>> getOnboardingTutorials() {
        C3959e<List<Tutorial>> d = this.getProfileOptionData.execute(Onboarding.INSTANCE).f(new CheckTutorialViewed$getOnboardingTutorials$1(this)).d();
        C2668g.a(d, "getProfileOptionData.exe…          .toObservable()");
        return d;
    }
}
