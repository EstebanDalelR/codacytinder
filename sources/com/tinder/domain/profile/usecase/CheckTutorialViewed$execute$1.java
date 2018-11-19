package com.tinder.domain.profile.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorials;
import io.reactivex.functions.BiFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/profile/model/Tutorial;", "tutorials", "Lcom/tinder/domain/profile/model/Tutorials;", "onboardingTutorials", "apply"}, k = 3, mv = {1, 1, 10})
final class CheckTutorialViewed$execute$1<T1, T2, R> implements BiFunction<Tutorials, List<? extends Tutorial>, List<? extends Tutorial>> {
    public static final CheckTutorialViewed$execute$1 INSTANCE = new CheckTutorialViewed$execute$1();

    CheckTutorialViewed$execute$1() {
    }

    @NotNull
    public final List<Tutorial> apply(@NotNull Tutorials tutorials, @NotNull List<? extends Tutorial> list) {
        C2668g.b(tutorials, ManagerWebServices.PARAM_TUTORIALS);
        C2668g.b(list, "onboardingTutorials");
        return C19301m.b(tutorials.getTutorials(), list);
    }
}
