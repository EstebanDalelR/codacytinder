package com.tinder.domain.toppicks;

import com.tinder.domain.profile.model.TutorialViewStatus;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "apply"}, k = 3, mv = {1, 1, 10})
final class ShouldShowTopPicksTutorial$execute$1<T, R> implements Function<T, R> {
    final /* synthetic */ ShouldShowTopPicksTutorial this$0;

    ShouldShowTopPicksTutorial$execute$1(ShouldShowTopPicksTutorial shouldShowTopPicksTutorial) {
        this.this$0 = shouldShowTopPicksTutorial;
    }

    public /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(apply((TutorialViewStatus) obj));
    }

    public final boolean apply(@NotNull TutorialViewStatus tutorialViewStatus) {
        C2668g.b(tutorialViewStatus, "it");
        return (tutorialViewStatus == TutorialViewStatus.UNSEEN || this.this$0.topPicksApplicationRepository.hasSeenTutorial() != null) ? null : true;
    }
}
