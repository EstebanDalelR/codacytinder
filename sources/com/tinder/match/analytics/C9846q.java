package com.tinder.match.analytics;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageMatchesUpdate;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.etl.event.lo;
import com.tinder.etl.event.lo.C9164a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/match/analytics/MatchListEventsFactory;", "", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "matchAnalyticsHelper", "Lcom/tinder/match/analytics/MatchAnalyticsHelper;", "fastMatchAnalyticsHelper", "Lcom/tinder/match/analytics/FastMatchAnalyticsHelper;", "(Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/match/analytics/MatchAnalyticsHelper;Lcom/tinder/match/analytics/FastMatchAnalyticsHelper;)V", "createMatchListEvent", "Lcom/tinder/etl/event/MatchListEvent;", "messageMatchesUpdate", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "matches", "", "Lcom/tinder/domain/match/model/Match;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.analytics.q */
public final class C9846q {
    /* renamed from: a */
    private final FastMatchConfigProvider f32620a;
    /* renamed from: b */
    private final FastMatchStatusProvider f32621b;
    /* renamed from: c */
    private final C9844j f32622c;
    /* renamed from: d */
    private final C9842h f32623d;

    @Inject
    public C9846q(@NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull C9844j c9844j, @NotNull C9842h c9842h) {
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        C2668g.b(c9844j, "matchAnalyticsHelper");
        C2668g.b(c9842h, "fastMatchAnalyticsHelper");
        this.f32620a = fastMatchConfigProvider;
        this.f32621b = fastMatchStatusProvider;
        this.f32622c = c9844j;
        this.f32623d = c9842h;
    }

    @NotNull
    /* renamed from: a */
    public final lo m40532a(@NotNull MessageMatchesUpdate messageMatchesUpdate, @NotNull List<? extends Match> list) {
        C2668g.b(messageMatchesUpdate, "messageMatchesUpdate");
        C2668g.b(list, ManagerWebServices.PARAM_MATCHES);
        List messageMatches = messageMatchesUpdate.getMessageMatches();
        C9164a a = lo.m45678a();
        boolean isEnabled = this.f32620a.get().isEnabled();
        if (isEnabled) {
            int count = this.f32621b.get().getCount();
            C9164a h = a.m38532h(Integer.valueOf(count));
            isEnabled = isEnabled && count > 0;
            h.m38523a(Boolean.valueOf(isEnabled)).m38529e(Integer.valueOf(this.f32622c.m40527b(messageMatches, list))).m38531g(Integer.valueOf(this.f32623d.m40520a(count)));
        }
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((Match) next) instanceof PlacesMatch) {
                arrayList.add(next);
            }
        }
        messageMatchesUpdate = a.m38524a((Number) Integer.valueOf(this.f32622c.m40524a(messageMatches, (List) list))).m38526b(Integer.valueOf(messageMatches.size())).m38528d(Integer.valueOf(this.f32622c.m40526b(messageMatches))).m38527c(Integer.valueOf(this.f32622c.m40523a((List) list))).m38530f(Integer.valueOf(((List) arrayList).size())).m38525a();
        C2668g.a(messageMatchesUpdate, "builder.numMatches(match…\n                .build()");
        return messageMatchesUpdate;
    }
}
