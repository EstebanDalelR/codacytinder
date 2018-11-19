package com.tinder.toppicks.counter;

import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatus;", "Lkotlin/ParameterName;", "name", "status", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksBottomCounterPresenter$observeTopPicksLoadingStatus$1 extends FunctionReference implements Function1<TopPicksLoadingStatus, C15813i> {
    TopPicksBottomCounterPresenter$observeTopPicksLoadingStatus$1(C15237a c15237a) {
        super(1, c15237a);
    }

    public final String getName() {
        return "bindStatus";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C15237a.class);
    }

    public final String getSignature() {
        return "bindStatus(Lcom/tinder/domain/toppicks/TopPicksLoadingStatus;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m68145a((TopPicksLoadingStatus) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m68145a(@NotNull TopPicksLoadingStatus topPicksLoadingStatus) {
        C2668g.b(topPicksLoadingStatus, "p1");
        ((C15237a) this.receiver).m57303a(topPicksLoadingStatus);
    }
}
