package com.tinder.typingindicator.api;

import com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator;
import com.tinder.typingindicator.p440f.C18250c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/typingindicator/model/TypingIndicator;", "p1", "Lcom/tinder/proto/keepalive/KeepAliveTypingIndicator$TypingIndicator;", "Lkotlin/ParameterName;", "name", "keepAliveTypingIndicator", "invoke"}, k = 3, mv = {1, 1, 10})
final class TypingIndicatorApiClient$observeTypingIndicator$1 extends FunctionReference implements Function1<TypingIndicator, com.tinder.typingindicator.model.TypingIndicator> {
    TypingIndicatorApiClient$observeTypingIndicator$1(C18250c c18250c) {
        super(1, c18250c);
    }

    public final String getName() {
        return "invoke";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C18250c.class);
    }

    public final String getSignature() {
        return "invoke(Lcom/tinder/proto/keepalive/KeepAliveTypingIndicator$TypingIndicator;)Lcom/tinder/typingindicator/model/TypingIndicator;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68163a((TypingIndicator) obj);
    }

    @NotNull
    /* renamed from: a */
    public final com.tinder.typingindicator.model.TypingIndicator m68163a(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "p1");
        return ((C18250c) this.receiver).m66136a(typingIndicator);
    }
}
