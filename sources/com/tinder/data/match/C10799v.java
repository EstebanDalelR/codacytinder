package com.tinder.data.match;

import android.support.annotation.VisibleForTesting;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.common.ApiMatch.Person;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.model.User;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.model.PlacesMatch.PlaceInfo;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.UserRec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J*\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u001a\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0014\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/data/match/MatchDomainApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/match/model/Match;", "Lcom/tinder/data/match/MatchDomainApiAdapter$MatchData;", "()V", "dateTimeApiAdapter", "Lcom/tinder/data/adapter/DateTimeApiAdapter;", "personAdapter", "Lcom/tinder/data/match/MatchPersonDomainApiAdapter;", "createMatch", "api", "Lcom/tinder/api/model/common/ApiMatch;", "touched", "", "extractPerson", "Lkotlin/Function0;", "Lcom/tinder/domain/common/model/User;", "dateTimeFromString", "Lorg/joda/time/DateTime;", "apiDate", "", "dateTimeNow", "findSuperLikeAttribute", "Lcom/tinder/domain/match/model/Match$Attribution;", "match", "fromApi", "matchData", "fromApiAndRec", "apiMatch", "rec", "Lcom/tinder/domain/recs/model/Rec;", "getAttribution", "placeInfo", "Lcom/tinder/domain/match/model/PlacesMatch$PlaceInfo;", "placeInfoFromApiMatch", "userFromApiMatch", "userFromRec", "Lcom/tinder/domain/common/model/PerspectableUser;", "MatchData", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.match.v */
public class C10799v extends C2646o<Match, C8678a> {
    /* renamed from: a */
    private final C10738l f35251a = new C10738l();
    /* renamed from: b */
    private final ah f35252b = new ah();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/data/match/MatchDomainApiAdapter$MatchData;", "", "match", "Lcom/tinder/api/model/common/ApiMatch;", "touched", "", "(Lcom/tinder/api/model/common/ApiMatch;Z)V", "getMatch", "()Lcom/tinder/api/model/common/ApiMatch;", "getTouched", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.v$a */
    public static final class C8678a {
        @NotNull
        /* renamed from: a */
        private final ApiMatch f30542a;
        /* renamed from: b */
        private final boolean f30543b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8678a) {
                C8678a c8678a = (C8678a) obj;
                if (C2668g.a(this.f30542a, c8678a.f30542a)) {
                    if ((this.f30543b == c8678a.f30543b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            ApiMatch apiMatch = this.f30542a;
            int hashCode = (apiMatch != null ? apiMatch.hashCode() : 0) * 31;
            int i = this.f30543b;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MatchData(match=");
            stringBuilder.append(this.f30542a);
            stringBuilder.append(", touched=");
            stringBuilder.append(this.f30543b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8678a(@NotNull ApiMatch apiMatch, boolean z) {
            C2668g.b(apiMatch, "match");
            this.f30542a = apiMatch;
            this.f30543b = z;
        }

        @NotNull
        /* renamed from: a */
        public final ApiMatch m36988a() {
            return this.f30542a;
        }

        /* renamed from: b */
        public final boolean m36989b() {
            return this.f30543b;
        }
    }

    @Nullable
    /* renamed from: a */
    public Match m43267a(@NotNull C8678a c8678a) {
        C2668g.b(c8678a, "matchData");
        return m43262a(c8678a.m36988a(), c8678a.m36989b(), new MatchDomainApiAdapter$fromApi$1(this, c8678a));
    }

    @Nullable
    /* renamed from: a */
    public final Match m43266a(@NotNull ApiMatch apiMatch, @NotNull Rec rec) {
        C2668g.b(apiMatch, "apiMatch");
        C2668g.b(rec, "rec");
        return m43262a(apiMatch, null, new MatchDomainApiAdapter$fromApiAndRec$1(this, rec));
    }

    /* renamed from: a */
    private final Match m43262a(ApiMatch apiMatch, boolean z, Function0<? extends User> function0) {
        String _id = apiMatch._id();
        if (_id == null) {
            _id = apiMatch.id();
        }
        String str = _id;
        if (str == null) {
            return null;
        }
        User user = (User) function0.invoke();
        if (user == null) {
            return null;
        }
        String createdDate = apiMatch.createdDate();
        _id = apiMatch.lastActivityDate();
        PlaceInfo b = m43264b(apiMatch);
        Attribution a = m43261a(apiMatch, b);
        apiMatch = apiMatch.muted();
        if (apiMatch == null) {
            apiMatch = Boolean.valueOf(null);
        }
        function0 = m43263a(createdDate);
        if (function0 == null) {
            function0 = m43269a();
        }
        Function0<? extends User> function02 = function0;
        function0 = m43263a(_id);
        if (function0 == null) {
            function0 = m43269a();
        }
        Function0<? extends User> function03 = function0;
        if (a != Attribution.PLACES || b == null) {
            C2668g.a(apiMatch, ManagerWebServices.PARAM_IS_MUTED);
            function0 = (Match) new CoreMatch(str, function02, function03, a, apiMatch.booleanValue(), z, user);
        } else {
            C2668g.a(apiMatch, ManagerWebServices.PARAM_IS_MUTED);
            function0 = (Match) new PlacesMatch(str, function02, function03, a, apiMatch.booleanValue(), z, user, b);
        }
        return function0;
    }

    @NotNull
    @VisibleForTesting
    /* renamed from: a */
    protected DateTime m43269a() {
        DateTime a = DateTime.a();
        C2668g.a(a, "DateTime.now()");
        return a;
    }

    /* renamed from: a */
    private final User m43259a(ApiMatch apiMatch) {
        Person person = apiMatch.person();
        return person != null ? this.f35252b.m43248a(person) : null;
    }

    /* renamed from: a */
    private final PerspectableUser m43258a(Rec rec) {
        if (!(rec instanceof UserRec)) {
            rec = null;
        }
        UserRec userRec = (UserRec) rec;
        return userRec != null ? userRec.getUser() : null;
    }

    /* renamed from: a */
    private final DateTime m43263a(String str) {
        return str != null ? this.f35251a.m43129a(str) : null;
    }

    /* renamed from: b */
    private final PlaceInfo m43264b(ApiMatch apiMatch) {
        if (apiMatch == null) {
            return null;
        }
        apiMatch = apiMatch.place();
        if (apiMatch == null) {
            return null;
        }
        String id = apiMatch.id();
        if (id == null) {
            return null;
        }
        apiMatch = apiMatch.name();
        if (apiMatch != null) {
            return new PlaceInfo(id, apiMatch);
        }
        return null;
    }

    /* renamed from: a */
    private final Attribution m43261a(ApiMatch apiMatch, PlaceInfo placeInfo) {
        Boolean isTopPick = apiMatch.isTopPick();
        boolean z = false;
        if (isTopPick == null) {
            isTopPick = Boolean.valueOf(false);
        }
        Boolean isSuperLike = apiMatch.isSuperLike();
        if (isSuperLike == null) {
            isSuperLike = Boolean.valueOf(false);
        }
        Boolean isBoostMatch = apiMatch.isBoostMatch();
        if (isBoostMatch == null) {
            isBoostMatch = Boolean.valueOf(false);
        }
        Boolean isFastMatch = apiMatch.isFastMatch();
        if (isFastMatch == null) {
            isFastMatch = Boolean.valueOf(false);
        }
        Boolean isPlaceMatch = apiMatch.isPlaceMatch();
        if ((isPlaceMatch != null ? isPlaceMatch.booleanValue() : false) && placeInfo != null) {
            z = true;
        }
        C2668g.a(isTopPick, "topPicks");
        if (isTopPick.booleanValue() != null) {
            return Attribution.TOP_PICKS;
        }
        C2668g.a(isSuperLike, "superLike");
        if (isSuperLike.booleanValue() != null) {
            return m43265c(apiMatch);
        }
        C2668g.a(isBoostMatch, "boostMatch");
        if (isBoostMatch.booleanValue() != null) {
            return Attribution.BOOST;
        }
        C2668g.a(isFastMatch, "fastMatch");
        if (isFastMatch.booleanValue() != null) {
            return Attribution.FAST_MATCH;
        }
        if (z) {
            return Attribution.PLACES;
        }
        return Attribution.NONE;
    }

    /* renamed from: c */
    private final Attribution m43265c(ApiMatch apiMatch) {
        String superLiker = apiMatch.superLiker();
        apiMatch = apiMatch.person();
        if (C2668g.a(superLiker, apiMatch != null ? apiMatch.id() : null) != null) {
            return Attribution.THEY_SUPER_LIKE_ME;
        }
        return Attribution.I_SUPER_LIKE_THEM;
    }
}
