package com.tinder.domain.match.usecase;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageMatchesUpdate;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u00072!\u0010\b\u001a\u001d\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "p1", "", "Lcom/tinder/domain/match/model/Match;", "Lkotlin/ParameterName;", "name", "matches", "p2", "", "", "Lcom/tinder/domain/message/Message;", "messages", "invoke"}, k = 3, mv = {1, 1, 10})
final class GetMessagesMatches$execute$1 extends FunctionReference implements Function2<List<? extends Match>, Map<String, ? extends Message>, MessageMatchesUpdate> {
    GetMessagesMatches$execute$1(GetMessagesMatches getMessagesMatches) {
        super(2, getMessagesMatches);
    }

    public final String getName() {
        return "combine";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(GetMessagesMatches.class);
    }

    public final String getSignature() {
        return "combine(Ljava/util/List;Ljava/util/Map;)Lcom/tinder/domain/match/model/MessageMatchesUpdate;";
    }

    @NotNull
    public final MessageMatchesUpdate invoke(@NotNull List<? extends Match> list, @NotNull Map<String, ? extends Message> map) {
        C2668g.b(list, "p1");
        C2668g.b(map, "p2");
        return ((GetMessagesMatches) this.receiver).combine(list, map);
    }
}
