package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewedStatus;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "profileRemoteRepository", "Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "(Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "Lcom/tinder/domain/profile/model/Tutorial;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ConfirmTutorialsViewed implements ConfirmTutorialsViewedStatus {
    private final CheckTutorialViewed checkTutorialViewed;
    private final ProfileRemoteRepository profileRemoteRepository;

    @Inject
    public ConfirmTutorialsViewed(@NotNull CheckTutorialViewed checkTutorialViewed, @NotNull ProfileRemoteRepository profileRemoteRepository) {
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(profileRemoteRepository, "profileRemoteRepository");
        this.checkTutorialViewed = checkTutorialViewed;
        this.profileRemoteRepository = profileRemoteRepository;
    }

    @NotNull
    public C3956a execute(@NotNull Tutorial tutorial) {
        C2668g.b(tutorial, "request");
        tutorial = this.checkTutorialViewed.execute(tutorial).a(ConfirmTutorialsViewed$execute$1.INSTANCE).e(new ConfirmTutorialsViewed$execute$2(this, tutorial));
        C2668g.a(tutorial, "checkTutorialViewed.exec…ateRequest)\n            }");
        return tutorial;
    }
}
