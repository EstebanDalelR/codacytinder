package com.tinder.typingindicator.provider;

import com.tinder.typingindicator.model.TypingIndicator;
import com.tinder.typingindicator.p440f.C18258l;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "p1", "Lcom/tinder/typingindicator/model/TypingIndicator;", "Lkotlin/ParameterName;", "name", "typingIndicator", "invoke"}, k = 3, mv = {1, 1, 10})
final class TypingIndicatorViewModelProvider$observe$1 extends FunctionReference implements Function1<TypingIndicator, TypingIndicatorViewModel> {
    TypingIndicatorViewModelProvider$observe$1(C18258l c18258l) {
        super(1, c18258l);
    }

    public final String getName() {
        return "invoke";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C18258l.class);
    }

    public final String getSignature() {
        return "invoke(Lcom/tinder/typingindicator/model/TypingIndicator;)Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68165a((TypingIndicator) obj);
    }

    @NotNull
    /* renamed from: a */
    public final TypingIndicatorViewModel m68165a(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "p1");
        return ((C18258l) this.receiver).m66152a(typingIndicator);
    }
}
