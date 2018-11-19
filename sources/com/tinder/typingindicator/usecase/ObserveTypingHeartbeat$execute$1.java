package com.tinder.typingindicator.usecase;

import com.tinder.domain.typingindicator.TypingIndicatorConfig;
import com.tinder.typingindicator.model.C15326a;
import io.reactivex.C3957b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/tinder/typingindicator/model/Heartbeat;", "p1", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;", "Lkotlin/ParameterName;", "name", "typingIndicatorConfig", "invoke"}, k = 3, mv = {1, 1, 10})
final class ObserveTypingHeartbeat$execute$1 extends FunctionReference implements Function1<TypingIndicatorConfig, C3957b<C15326a>> {
    ObserveTypingHeartbeat$execute$1(C17181k c17181k) {
        super(1, c17181k);
    }

    public final String getName() {
        return "heartbeatFromConfig";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C17181k.class);
    }

    public final String getSignature() {
        return "heartbeatFromConfig(Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;)Lio/reactivex/Flowable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68167a((TypingIndicatorConfig) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3957b<C15326a> m68167a(@NotNull TypingIndicatorConfig typingIndicatorConfig) {
        C2668g.b(typingIndicatorConfig, "p1");
        return ((C17181k) this.receiver).m63051a(typingIndicatorConfig);
    }
}
