package com.tinder.match.analytics;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageMatchesUpdate;
import com.tinder.etl.event.lu;
import com.tinder.etl.event.lv;
import com.tinder.etl.event.lw;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/match/analytics/MatchSearchEventsFactory;", "", "matchAnalyticsHelper", "Lcom/tinder/match/analytics/MatchAnalyticsHelper;", "(Lcom/tinder/match/analytics/MatchAnalyticsHelper;)V", "createMatchSearchEvent", "Lcom/tinder/etl/event/MatchSearchEvent;", "searchQuery", "", "messageMatchesUpdate", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "matches", "", "Lcom/tinder/domain/match/model/Match;", "createMatchSearchSelectEvent", "Lcom/tinder/etl/event/MatchSearchSelectEvent;", "match", "createMatchStartSearchEvent", "Lcom/tinder/etl/event/MatchStartSearchEvent;", "createMatchStopSearchEvent", "Lcom/tinder/etl/event/MatchStopSearchEvent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.analytics.s */
public final class C9848s {
    /* renamed from: a */
    private final C9844j f32629a;

    @Inject
    public C9848s(@NotNull C9844j c9844j) {
        C2668g.b(c9844j, "matchAnalyticsHelper");
        this.f32629a = c9844j;
    }

    @NotNull
    /* renamed from: a */
    public final lu m40537a(@NotNull String str, @NotNull Match match, @NotNull MessageMatchesUpdate messageMatchesUpdate, @NotNull List<? extends Match> list) {
        C2668g.b(str, "searchQuery");
        C2668g.b(match, "match");
        C2668g.b(messageMatchesUpdate, "messageMatchesUpdate");
        C2668g.b(list, ManagerWebServices.PARAM_MATCHES);
        List messageMatches = messageMatchesUpdate.getMessageMatches();
        list = lu.m45754a();
        String id = match.getId();
        this.f32629a.m40522a(str, messageMatches);
        CoreMatch coreMatch = (CoreMatch) ((match instanceof CoreMatch) == null ? null : match);
        if (coreMatch != null) {
            list.m38549a(coreMatch.getPerson().id());
        }
        str = list.m38551b(id).m38552c(this.f32629a.m40525a(match, str)).m38550a();
        C2668g.a(str, "eventBuilder\n           …\n                .build()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final lv m40538a(@NotNull String str, @NotNull MessageMatchesUpdate messageMatchesUpdate, @NotNull List<? extends Match> list) {
        C2668g.b(str, "searchQuery");
        C2668g.b(messageMatchesUpdate, "messageMatchesUpdate");
        C2668g.b(list, ManagerWebServices.PARAM_MATCHES);
        List messageMatches = messageMatchesUpdate.getMessageMatches();
        str = lv.m45766a().m38553a(Integer.valueOf(this.f32629a.m40524a(messageMatches, (List) list))).m38555b(Integer.valueOf(messageMatches.size())).m38556c(Integer.valueOf(this.f32629a.m40523a((List) list))).m38557d(Integer.valueOf(this.f32629a.m40526b(messageMatches))).m38554a();
        C2668g.a(str, "MatchStartSearchEvent.bu…\n                .build()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final lw m40539a(@NotNull MessageMatchesUpdate messageMatchesUpdate, @NotNull List<? extends Match> list) {
        C2668g.b(messageMatchesUpdate, "messageMatchesUpdate");
        C2668g.b(list, ManagerWebServices.PARAM_MATCHES);
        List messageMatches = messageMatchesUpdate.getMessageMatches();
        messageMatchesUpdate = lw.m45777a().m38558a(Integer.valueOf(this.f32629a.m40524a(messageMatches, (List) list))).m38560b(Integer.valueOf(messageMatches.size())).m38561c(Integer.valueOf(this.f32629a.m40523a((List) list))).m38562d(Integer.valueOf(this.f32629a.m40526b(messageMatches))).m38559a();
        C2668g.a(messageMatchesUpdate, "MatchStopSearchEvent.bui…\n                .build()");
        return messageMatchesUpdate;
    }
}
