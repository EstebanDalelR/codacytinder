package com.tinder.match.analytics;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageMatchesUpdate;
import com.tinder.etl.event.lw;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u001b\u0010\u0007\u001a\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/MatchStopSearchEvent;", "p1", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "Lkotlin/ParameterName;", "name", "messageMatchesUpdate", "p2", "", "Lcom/tinder/domain/match/model/Match;", "matches", "invoke"}, k = 3, mv = {1, 1, 10})
final class MatchListAnalyticsFactory$createMatchStopSearchEvent$1 extends FunctionReference implements Function2<MessageMatchesUpdate, List<? extends Match>, lw> {
    MatchListAnalyticsFactory$createMatchStopSearchEvent$1(C9848s c9848s) {
        super(2, c9848s);
    }

    public final String getName() {
        return "createMatchStopSearchEvent";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C9848s.class);
    }

    public final String getSignature() {
        return "createMatchStopSearchEvent(Lcom/tinder/domain/match/model/MessageMatchesUpdate;Ljava/util/List;)Lcom/tinder/etl/event/MatchStopSearchEvent;";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m54430a((MessageMatchesUpdate) obj, (List) obj2);
    }

    @NotNull
    /* renamed from: a */
    public final lw m54430a(@NotNull MessageMatchesUpdate messageMatchesUpdate, @NotNull List<? extends Match> list) {
        C2668g.b(messageMatchesUpdate, "p1");
        C2668g.b(list, "p2");
        return ((C9848s) this.receiver).m40539a(messageMatchesUpdate, list);
    }
}
