package com.tinder.data.match;

import com.tinder.data.match.C10799v.C8678a;
import com.tinder.domain.match.model.Match;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "p1", "Lcom/tinder/data/match/MatchDomainApiAdapter$MatchData;", "Lkotlin/ParameterName;", "name", "matchData", "invoke"}, k = 3, mv = {1, 1, 10})
final class MatchApiClient$getMatch$2 extends FunctionReference implements Function1<C8678a, Match> {
    MatchApiClient$getMatch$2(C10799v c10799v) {
        super(1, c10799v);
    }

    public final String getName() {
        return "fromApi";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10799v.class);
    }

    public final String getSignature() {
        return "fromApi(Lcom/tinder/data/match/MatchDomainApiAdapter$MatchData;)Lcom/tinder/domain/match/model/Match;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54333a((C8678a) obj);
    }

    @Nullable
    /* renamed from: a */
    public final Match m54333a(@NotNull C8678a c8678a) {
        C2668g.b(c8678a, "p1");
        return ((C10799v) this.receiver).m43267a(c8678a);
    }
}
