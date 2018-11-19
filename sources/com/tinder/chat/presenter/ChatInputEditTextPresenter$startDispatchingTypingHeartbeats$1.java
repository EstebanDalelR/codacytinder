package com.tinder.chat.presenter;

import com.tinder.typingindicator.usecase.C17185o;
import com.tinder.typingindicator.usecase.C17185o.C15331a;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "p1", "Lcom/tinder/typingindicator/usecase/SendHeartbeatsUponTypingEmissions$Request;", "Lkotlin/ParameterName;", "name", "request", "invoke"}, k = 3, mv = {1, 1, 10})
final class ChatInputEditTextPresenter$startDispatchingTypingHeartbeats$1 extends FunctionReference implements Function1<C15331a, C3956a> {
    ChatInputEditTextPresenter$startDispatchingTypingHeartbeats$1(C17185o c17185o) {
        super(1, c17185o);
    }

    public final String getName() {
        return "execute";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C17185o.class);
    }

    public final String getSignature() {
        return "execute(Lcom/tinder/typingindicator/usecase/SendHeartbeatsUponTypingEmissions$Request;)Lio/reactivex/Completable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54050a((C15331a) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m54050a(@NotNull C15331a c15331a) {
        C2668g.b(c15331a, "p1");
        return ((C17185o) this.receiver).a(c15331a);
    }
}
