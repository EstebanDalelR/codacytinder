package com.tinder.recs.presenter;

import com.tinder.fireboarding.domain.Level;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.presenter.RecsPresenter$observeShouldShowNudgeAnimation$shouldShowNudgeAnimationDisposable$1 */
final class C16397x4e2b53f4<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ RecsPresenter this$0;

    C16397x4e2b53f4(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final C3960g<Boolean> apply(@NotNull Boolean bool) {
        C2668g.b(bool, "it");
        if (bool.booleanValue()) {
            return this.this$0.completeFireboardingLevel.a(Level.LIKE_AND_PASS).a(bool);
        }
        return C3956a.a().a(bool);
    }
}
