package com.tinder.boost.presenter;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "multiplier", "invoke"}, k = 3, mv = {1, 1, 10})
final class BoostButtonPresenter$subscribeToBoostChanges$1 extends FunctionReference implements Function1<String, C15813i> {
    BoostButtonPresenter$subscribeToBoostChanges$1(C8346a c8346a) {
        super(1, c8346a);
    }

    public final String getName() {
        return "onBoostMultiplierChange";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C8346a.class);
    }

    public final String getSignature() {
        return "onBoostMultiplierChange(Ljava/lang/String;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m54007a((String) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m54007a(@NotNull String str) {
        C2668g.b(str, "p1");
        ((C8346a) this.receiver).m35533a(str);
    }
}
