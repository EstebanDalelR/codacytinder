package com.tinder.match.analytics;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageMatchesUpdate;
import com.tinder.etl.event.lu;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f2\u001b\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f¢\u0006\u0002\b\u0010"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/MatchSearchSelectEvent;", "p1", "", "Lkotlin/ParameterName;", "name", "searchQuery", "p2", "Lcom/tinder/domain/match/model/Match;", "match", "p3", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "messageMatchesUpdate", "p4", "", "matches", "invoke"}, k = 3, mv = {1, 1, 10})
final class MatchListAnalyticsFactory$createMatchSearchSelectEvent$1 extends FunctionReference implements Function4<String, Match, MessageMatchesUpdate, List<? extends Match>, lu> {
    MatchListAnalyticsFactory$createMatchSearchSelectEvent$1(C9848s c9848s) {
        super(4, c9848s);
    }

    public final String getName() {
        return "createMatchSearchSelectEvent";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C9848s.class);
    }

    public final String getSignature() {
        return "createMatchSearchSelectEvent(Ljava/lang/String;Lcom/tinder/domain/match/model/Match;Lcom/tinder/domain/match/model/MessageMatchesUpdate;Ljava/util/List;)Lcom/tinder/etl/event/MatchSearchSelectEvent;";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m54428a((String) obj, (Match) obj2, (MessageMatchesUpdate) obj3, (List) obj4);
    }

    @NotNull
    /* renamed from: a */
    public final lu m54428a(@NotNull String str, @NotNull Match match, @NotNull MessageMatchesUpdate messageMatchesUpdate, @NotNull List<? extends Match> list) {
        C2668g.b(str, "p1");
        C2668g.b(match, "p2");
        C2668g.b(messageMatchesUpdate, "p3");
        C2668g.b(list, "p4");
        return ((C9848s) this.receiver).m40537a(str, match, messageMatchesUpdate, list);
    }
}
