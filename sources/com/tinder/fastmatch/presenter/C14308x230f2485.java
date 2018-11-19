package com.tinder.fastmatch.presenter;

import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "Lkotlin/ParameterName;", "name", "swipeRatingStatus", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.FastMatchRecsGridPresenter$subscribeToSwipeRatingStatus$swipeRatingStatusSubscription$5 */
final class C14308x230f2485 extends FunctionReference implements Function1<Ended, C15813i> {
    C14308x230f2485(C11648i c11648i) {
        super(1, c11648i);
    }

    public final String getName() {
        return "handleRewoundSwipeRatingStatus";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C11648i.class);
    }

    public final String getSignature() {
        return "handleRewoundSwipeRatingStatus(Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m54408a((Ended) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m54408a(@NotNull Ended ended) {
        C2668g.b(ended, "p1");
        ((C11648i) this.receiver).m47429b(ended);
    }
}
