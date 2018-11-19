package com.tinder.match.sponsoredmessage;

import com.tinder.domain.match.model.Match;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "p1", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "Lkotlin/ParameterName;", "name", "matchOptional", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageAdCadenceRequestRule$shouldRequestAd$1 extends FunctionReference implements Function1<Optional<Match>, Boolean> {
    MessageAdCadenceRequestRule$shouldRequestAd$1(C12084b c12084b) {
        super(1, c12084b);
    }

    public final String getName() {
        return "shouldRequestRule";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C12084b.class);
    }

    public final String getSignature() {
        return "shouldRequestRule(Ljava8/util/Optional;)Z";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m54435a((Optional) obj));
    }

    /* renamed from: a */
    public final boolean m54435a(@NotNull Optional<Match> optional) {
        C2668g.b(optional, "p1");
        return ((C12084b) this.receiver).m48191a((Optional) optional);
    }
}
