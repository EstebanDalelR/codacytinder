package com.tinder.boost.presenter;

import com.tinder.domain.boost.model.BoostStatus;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/domain/boost/model/BoostStatus;", "Lkotlin/ParameterName;", "name", "boostStatus", "invoke"}, k = 3, mv = {1, 1, 10})
final class BoostButtonPresenter$subscribeToBoostChanges$7 extends FunctionReference implements Function1<BoostStatus, C15813i> {
    BoostButtonPresenter$subscribeToBoostChanges$7(C8346a c8346a) {
        super(1, c8346a);
    }

    public final String getName() {
        return "handleBoostStatusChanged";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C8346a.class);
    }

    public final String getSignature() {
        return "handleBoostStatusChanged(Lcom/tinder/domain/boost/model/BoostStatus;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m54010a((BoostStatus) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m54010a(@Nullable BoostStatus boostStatus) {
        ((C8346a) this.receiver).m35532a(boostStatus);
    }
}
