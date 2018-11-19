package com.tinder.data.match.p224a;

import com.tinder.data.match.MatchType;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"matchType", "Lcom/tinder/data/match/MatchType;", "Lcom/tinder/domain/match/model/Match;", "getMatchType", "(Lcom/tinder/domain/match/model/Match;)Lcom/tinder/data/match/MatchType;", "toCoreMatch", "Lcom/tinder/domain/match/model/CoreMatch;", "Lcom/tinder/domain/match/model/PlacesMatch;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.match.a.a */
public final class C8672a {
    @NotNull
    /* renamed from: a */
    public static final MatchType m36945a(@NotNull Match match) {
        C2668g.b(match, "$receiver");
        if (match instanceof CoreMatch) {
            return MatchType.CORE;
        }
        if (match instanceof MessageAdMatch) {
            return MatchType.SPONSORED_AD;
        }
        if ((match instanceof PlacesMatch) != null) {
            return MatchType.PLACES;
        }
        throw new NoWhenBranchMatchedException();
    }
}
