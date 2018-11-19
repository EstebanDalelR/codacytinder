package com.tinder.domain.message.usecase;

import com.tinder.domain.match.model.Match;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lrx/Single;", "Lkotlin/Pair;", "", "p1", "Lcom/tinder/domain/match/model/Match;", "Lkotlin/ParameterName;", "name", "match", "invoke"}, k = 3, mv = {1, 1, 10})
final class CommonMessagePropertiesAggregator$aggregate$1 extends FunctionReference implements Function1<Match, Single<Pair<? extends String, ? extends String>>> {
    CommonMessagePropertiesAggregator$aggregate$1(CommonMessagePropertiesAggregator commonMessagePropertiesAggregator) {
        super(1, commonMessagePropertiesAggregator);
    }

    public final String getName() {
        return "extractFromIdAndToIdFromMatch";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(CommonMessagePropertiesAggregator.class);
    }

    public final String getSignature() {
        return "extractFromIdAndToIdFromMatch(Lcom/tinder/domain/match/model/Match;)Lrx/Single;";
    }

    @NotNull
    public final Single<Pair<String, String>> invoke(@NotNull Match match) {
        C2668g.b(match, "p1");
        return ((CommonMessagePropertiesAggregator) this.receiver).extractFromIdAndToIdFromMatch(match);
    }
}
