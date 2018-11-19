package com.tinder.domain.toppicks;

import com.tinder.domain.profile.model.Tutorial.TopPicksIntro;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/toppicks/ShouldShowTopPicksTutorial;", "", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "(Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;)V", "execute", "Lio/reactivex/Single;", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ShouldShowTopPicksTutorial {
    private final CheckTutorialViewed checkTutorialViewed;
    private final TopPicksApplicationRepository topPicksApplicationRepository;

    @Inject
    public ShouldShowTopPicksTutorial(@NotNull TopPicksApplicationRepository topPicksApplicationRepository, @NotNull CheckTutorialViewed checkTutorialViewed) {
        C2668g.b(topPicksApplicationRepository, "topPicksApplicationRepository");
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        this.topPicksApplicationRepository = topPicksApplicationRepository;
        this.checkTutorialViewed = checkTutorialViewed;
    }

    @NotNull
    public final C3960g<Boolean> execute() {
        C3960g<Boolean> e = this.checkTutorialViewed.execute(new TopPicksIntro("")).e(new ShouldShowTopPicksTutorial$execute$1(this));
        C2668g.a(e, "checkTutorialViewed.exec…hasSeenTutorial().not() }");
        return e;
    }
}
