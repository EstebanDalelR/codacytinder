package com.tinder.match.analytics;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.MessageMatch;
import com.tinder.domain.match.model.PlacesMatch;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002J\"\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u001c\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u0012\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u0014\u0010\u0013\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u0015"}, d2 = {"Lcom/tinder/match/analytics/MatchAnalyticsHelper;", "", "()V", "fastMatchMatchCount", "", "matchMessages", "", "Lcom/tinder/domain/match/model/MessageMatch;", "newMatches", "Lcom/tinder/domain/match/model/Match;", "getFrom", "", "match", "query", "getNameFromMatch", "matchCount", "matchesWithQueryInNameCount", "matches", "unreadMatchCount", "unreadMessageCount", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.analytics.j */
public final class C9844j {
    /* renamed from: a */
    public static final C9843a f32614a = new C9843a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/match/analytics/MatchAnalyticsHelper$Companion;", "", "()V", "FIELD_FROM_VALUE_MESSAGE", "", "FIELD_FROM_VALUE_NAME", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.j$a */
    public static final class C9843a {
        private C9843a() {
        }
    }

    /* renamed from: a */
    public final int m40524a(@NotNull List<MessageMatch> list, @NotNull List<? extends Match> list2) {
        C2668g.b(list, "matchMessages");
        C2668g.b(list2, "newMatches");
        return list.size() + list2.size();
    }

    /* renamed from: a */
    public final int m40523a(@NotNull List<? extends Match> list) {
        C2668g.b(list, "newMatches");
        Iterable<Match> iterable = list;
        int i = 0;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (Match touched : iterable) {
                if ((touched.getTouched() ^ 1) != 0) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public final int m40526b(@NotNull List<MessageMatch> list) {
        C2668g.b(list, "matchMessages");
        Iterable<MessageMatch> iterable = list;
        int i = 0;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (MessageMatch match : iterable) {
                if ((match.getMatch().getTouched() ^ 1) != 0) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public final int m40527b(@NotNull List<MessageMatch> list, @NotNull List<? extends Match> list2) {
        int i;
        C2668g.b(list, "matchMessages");
        C2668g.b(list2, "newMatches");
        Iterable<MessageMatch> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (MessageMatch match : iterable) {
                if ((match.getMatch().getAttribution() == Attribution.FAST_MATCH ? 1 : null) != null) {
                    i++;
                }
            }
        }
        Iterable<Match> iterable2 = list2;
        if ((iterable2 instanceof Collection) == null || ((Collection) iterable2).isEmpty() == null) {
            list2 = null;
            for (Match attribution : iterable2) {
                if ((attribution.getAttribution() == Attribution.FAST_MATCH ? 1 : null) != null) {
                    list2++;
                }
            }
        } else {
            list2 = null;
        }
        return i + list2;
    }

    /* renamed from: a */
    public final int m40522a(@NotNull String str, @NotNull List<MessageMatch> list) {
        C2668g.b(str, "query");
        C2668g.b(list, ManagerWebServices.PARAM_MATCHES);
        int i = 0;
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return list.size();
        }
        Iterable<MessageMatch> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        for (MessageMatch match : iterable) {
            String a = m40521a(match.getMatch());
            C2668g.a(a, "getNameFromMatch(it.match)");
            if (C19303i.b(a, str, true)) {
                i++;
            }
        }
        return i;
    }

    @NotNull
    /* renamed from: a */
    public final String m40525a(@NotNull Match match, @NotNull String str) {
        C2668g.b(match, "match");
        C2668g.b(str, "query");
        match = m40521a(match);
        C2668g.a(match, "getNameFromMatch(match)");
        return C19303i.b(match, str, true) != null ? "name" : "message";
    }

    /* renamed from: a */
    private final String m40521a(Match match) {
        if (match instanceof CoreMatch) {
            return ((CoreMatch) match).getPerson().name();
        }
        if (match instanceof MessageAdMatch) {
            return "";
        }
        if (match instanceof PlacesMatch) {
            return ((PlacesMatch) match).getPerson().name();
        }
        throw new NoWhenBranchMatchedException();
    }
}
