package com.tinder.recs.usecase;

import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import com.tinder.recs.domain.usecase.ObserveRewindsAvailable;
import com.tinder.tinderplus.p428a.C15193i;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/recs/usecase/CanUserRewind;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "", "observeRewindsAvailable", "Lcom/tinder/recs/domain/usecase/ObserveRewindsAvailable;", "tinderPlusInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;", "(Lcom/tinder/recs/domain/usecase/ObserveRewindsAvailable;Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;)V", "execute", "Lio/reactivex/Single;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class CanUserRewind implements SingleResultUseCase<Boolean> {
    private final ObserveRewindsAvailable observeRewindsAvailable;
    private final C15193i tinderPlusInteractor;

    @Inject
    public CanUserRewind(@NotNull ObserveRewindsAvailable observeRewindsAvailable, @NotNull C15193i c15193i) {
        C2668g.b(observeRewindsAvailable, "observeRewindsAvailable");
        C2668g.b(c15193i, "tinderPlusInteractor");
        this.observeRewindsAvailable = observeRewindsAvailable;
        this.tinderPlusInteractor = c15193i;
    }

    @NotNull
    public C3960g<Boolean> execute() {
        C3960g<Boolean> e = this.observeRewindsAvailable.execute().f().e(new CanUserRewind$execute$1(this));
        C2668g.a(e, "observeRewindsAvailable.…eractor.hasTinderPlus() }");
        return e;
    }
}
