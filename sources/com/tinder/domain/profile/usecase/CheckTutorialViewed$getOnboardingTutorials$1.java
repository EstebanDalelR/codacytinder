package com.tinder.domain.profile.usecase;

import com.tinder.domain.onboarding.Onboarding;
import com.tinder.domain.onboarding.Onboarding.Tutorial.Name;
import com.tinder.domain.profile.model.Tutorial;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/profile/model/Tutorial;", "onboarding", "Lcom/tinder/domain/onboarding/Onboarding;", "apply"}, k = 3, mv = {1, 1, 10})
final class CheckTutorialViewed$getOnboardingTutorials$1<T, R> implements Function<T, R> {
    final /* synthetic */ CheckTutorialViewed this$0;

    CheckTutorialViewed$getOnboardingTutorials$1(CheckTutorialViewed checkTutorialViewed) {
        this.this$0 = checkTutorialViewed;
    }

    @NotNull
    public final List<Tutorial> apply(@NotNull Onboarding onboarding) {
        C2668g.b(onboarding, "onboarding");
        Collection arrayList = new ArrayList();
        for (Object next : onboarding.getTutorials()) {
            if ((((Onboarding.Tutorial) next).getName() != Name.NONE ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        Iterable<Onboarding.Tutorial> iterable = (List) arrayList;
        Collection collection = (Collection) new ArrayList(C19301m.a(iterable, 10));
        for (Onboarding.Tutorial toDomainTutorial : iterable) {
            collection.add(this.this$0.onboardingTutorialAdapter.toDomainTutorial(toDomainTutorial));
        }
        return (List) collection;
    }
}
