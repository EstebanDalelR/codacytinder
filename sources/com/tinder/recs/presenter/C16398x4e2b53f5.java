package com.tinder.recs.presenter;

import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.presenter.RecsPresenter$observeShouldShowNudgeAnimation$shouldShowNudgeAnimationDisposable$2 */
final class C16398x4e2b53f5<T> implements Predicate<Boolean> {
    public static final C16398x4e2b53f5 INSTANCE = new C16398x4e2b53f5();

    C16398x4e2b53f5() {
    }

    @NotNull
    public final Boolean test(@NotNull Boolean bool) {
        C2668g.b(bool, "it");
        return bool;
    }

    public /* synthetic */ boolean test(Object obj) {
        return test((Boolean) obj).booleanValue();
    }
}
