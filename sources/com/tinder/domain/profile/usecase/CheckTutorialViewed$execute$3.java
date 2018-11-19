package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.model.Tutorials;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "it", "Lcom/tinder/domain/profile/model/Tutorials;", "apply"}, k = 3, mv = {1, 1, 10})
final class CheckTutorialViewed$execute$3<T, R> implements Function<T, R> {
    final /* synthetic */ Tutorial $tutorial;

    CheckTutorialViewed$execute$3(Tutorial tutorial) {
        this.$tutorial = tutorial;
    }

    @NotNull
    public final TutorialViewStatus apply(@NotNull Tutorials tutorials) {
        C2668g.b(tutorials, "it");
        return tutorials.getTutorials().contains(this.$tutorial) != null ? TutorialViewStatus.UNSEEN : TutorialViewStatus.VIEWED;
    }
}
