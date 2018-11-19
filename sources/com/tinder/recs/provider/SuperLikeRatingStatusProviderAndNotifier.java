package com.tinder.recs.provider;

import com.tinder.base.p172b.C8301a;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0006\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/recs/provider/SuperLikeRatingStatusProviderAndNotifier;", "Lcom/tinder/recs/provider/SuperLikeRatingStatusProvider;", "Lcom/tinder/recs/provider/SuperLikeRatingStatusNotifier;", "mainThreadExecutionVerifier", "Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;)V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/recs/provider/SuperLikeRatingStatus;", "kotlin.jvm.PlatformType", "notify", "", "superLikeRatingStatus", "observe", "Lio/reactivex/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeRatingStatusProviderAndNotifier implements SuperLikeRatingStatusNotifier, SuperLikeRatingStatusProvider {
    private final C8301a mainThreadExecutionVerifier;
    private C19040a<SuperLikeRatingStatus> subject = C19040a.m67695a(SuperLikeRatingStatus.ENDED);

    @Inject
    public SuperLikeRatingStatusProviderAndNotifier(@NotNull C8301a c8301a) {
        C2668g.b(c8301a, "mainThreadExecutionVerifier");
        this.mainThreadExecutionVerifier = c8301a;
    }

    @NotNull
    public C3959e<SuperLikeRatingStatus> observe() {
        C3959e<SuperLikeRatingStatus> hide = this.subject.hide();
        C2668g.a(hide, "subject.hide()");
        return hide;
    }

    public void notify(@NotNull SuperLikeRatingStatus superLikeRatingStatus) {
        C2668g.b(superLikeRatingStatus, "superLikeRatingStatus");
        this.mainThreadExecutionVerifier.a();
        this.subject.onNext(superLikeRatingStatus);
    }
}
