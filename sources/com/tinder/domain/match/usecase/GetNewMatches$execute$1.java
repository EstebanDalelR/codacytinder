package com.tinder.domain.match.usecase;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.message.Message;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001b\u0010\u0003\u001a\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062!\u0010\u0007\u001a\u001d\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/match/model/Match;", "p1", "Lkotlin/ParameterName;", "name", "matches", "p2", "", "", "Lcom/tinder/domain/message/Message;", "messages", "invoke"}, k = 3, mv = {1, 1, 10})
final class GetNewMatches$execute$1 extends FunctionReference implements Function2<List<? extends Match>, Map<String, ? extends Message>, List<? extends Match>> {
    GetNewMatches$execute$1(GetNewMatches getNewMatches) {
        super(2, getNewMatches);
    }

    public final String getName() {
        return "combine";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(GetNewMatches.class);
    }

    public final String getSignature() {
        return "combine(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;";
    }

    @NotNull
    public final List<Match> invoke(@NotNull List<? extends Match> list, @NotNull Map<String, ? extends Message> map) {
        C2668g.b(list, "p1");
        C2668g.b(map, "p2");
        return ((GetNewMatches) this.receiver).combine(list, map);
    }
}
