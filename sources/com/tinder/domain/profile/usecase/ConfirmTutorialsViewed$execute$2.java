package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.model.ProfileUpdateRequest;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.model.Tutorials;
import com.tinder.domain.profile.model.TutorialsUpdateRequest;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "apply"}, k = 3, mv = {1, 1, 10})
final class ConfirmTutorialsViewed$execute$2<T, R> implements Function<TutorialViewStatus, CompletableSource> {
    final /* synthetic */ Tutorial $request;
    final /* synthetic */ ConfirmTutorialsViewed this$0;

    ConfirmTutorialsViewed$execute$2(ConfirmTutorialsViewed confirmTutorialsViewed, Tutorial tutorial) {
        this.this$0 = confirmTutorialsViewed;
        this.$request = tutorial;
    }

    @NotNull
    public final C3956a apply(@NotNull TutorialViewStatus tutorialViewStatus) {
        C2668g.b(tutorialViewStatus, "it");
        return this.this$0.profileRemoteRepository.update((ProfileUpdateRequest) new TutorialsUpdateRequest(new Tutorials(C19301m.a(this.$request))));
    }
}
