package com.tinder.recs.presenter;

import com.tinder.domain.profile.model.TutorialViewStatus;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tutorialViewStatus", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "test"}, k = 3, mv = {1, 1, 10})
final class GamepadPresenter$showBoostReminderTooltipIfNecessary$1<T> implements Predicate<TutorialViewStatus> {
    final /* synthetic */ GamepadPresenter this$0;

    GamepadPresenter$showBoostReminderTooltipIfNecessary$1(GamepadPresenter gamepadPresenter) {
        this.this$0 = gamepadPresenter;
    }

    public final boolean test(@NotNull TutorialViewStatus tutorialViewStatus) {
        C2668g.b(tutorialViewStatus, "tutorialViewStatus");
        return (tutorialViewStatus == TutorialViewStatus.UNSEEN && this.this$0.managerSharedPreferences.W() == null) ? true : null;
    }
}
