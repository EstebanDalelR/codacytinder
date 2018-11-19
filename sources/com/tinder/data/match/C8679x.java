package com.tinder.data.match;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.match.p224a.C8672a;
import com.tinder.data.model.MatchModel.C12992g;
import com.tinder.data.model.MatchModel.C12995k;
import com.tinder.data.model.MatchPersonModel.C12998b;
import com.tinder.data.model.MatchPersonModel.C12999c;
import com.tinder.data.model.SponsoredMatchCreativeValuesModel.C13016b;
import com.tinder.domain.common.model.User;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020#H\u0002J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u001a\u0010'\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010)\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/tinder/data/match/MatchInsert;", "", "db", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "creativeValuesInsert", "Lcom/tinder/data/model/SponsoredMatchCreativeValuesModel$Insert_creative_values;", "matchInsert", "Lcom/tinder/data/model/MatchModel$Insert_match;", "matchPlaceInsertOperation", "Lcom/tinder/data/match/MatchPlaceUpsertOperation;", "getMatchPlaceInsertOperation", "()Lcom/tinder/data/match/MatchPlaceUpsertOperation;", "matchPlaceInsertOperation$delegate", "Lkotlin/Lazy;", "matchUpdate", "Lcom/tinder/data/model/MatchModel$Update_match;", "matchUserInsert", "Lcom/tinder/data/model/MatchPersonModel$Insert_person;", "matchUserUpdate", "Lcom/tinder/data/model/MatchPersonModel$Update_person;", "bindInsert", "", "user", "Lcom/tinder/domain/common/model/User;", "bindUpdate", "insert", "match", "Lcom/tinder/domain/match/model/Match;", "insertCoreMatch", "Lcom/tinder/domain/match/model/CoreMatch;", "insertCreativeValues", "Lcom/tinder/domain/match/model/MessageAdMatch;", "insertMessageAdMatch", "insertPlacesMatch", "Lcom/tinder/domain/match/model/PlacesMatch;", "insertTransaction", "userId", "", "updateOrInsertMatch", "updateOrInsertPerson", "updateTransaction", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.match.x */
public final class C8679x {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30544a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C8679x.class), "matchPlaceInsertOperation", "getMatchPlaceInsertOperation()Lcom/tinder/data/match/MatchPlaceUpsertOperation;"))};
    /* renamed from: b */
    private final C12998b f30545b;
    /* renamed from: c */
    private final C12999c f30546c;
    /* renamed from: d */
    private final C12992g f30547d;
    /* renamed from: e */
    private final C12995k f30548e;
    /* renamed from: f */
    private final C13016b f30549f;
    /* renamed from: g */
    private final Lazy f30550g = C18451c.a((Function0) new MatchInsert$matchPlaceInsertOperation$2(this));
    /* renamed from: h */
    private final BriteDatabase f30551h;

    /* renamed from: a */
    private final ai m36991a() {
        Lazy lazy = this.f30550g;
        KProperty kProperty = f30544a[0];
        return (ai) lazy.getValue();
    }

    public C8679x(@NotNull BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "db");
        this.f30551h = briteDatabase;
        briteDatabase = this.f30551h.b();
        this.f30545b = new C12998b(briteDatabase, C8680y.f30552a);
        this.f30546c = new C12999c(briteDatabase, C8680y.f30552a);
        this.f30547d = new C12992g(briteDatabase, C8680y.f30553b);
        this.f30548e = new C12995k(briteDatabase, C8680y.f30553b);
        this.f30549f = new C13016b(briteDatabase, C8673k.f30536a);
    }

    /* renamed from: a */
    public final void m37002a(@NotNull Match match) {
        C2668g.b(match, "match");
        if (match instanceof CoreMatch) {
            m36993a((CoreMatch) match);
            match = C15813i.f49016a;
        } else if (match instanceof MessageAdMatch) {
            m36995a((MessageAdMatch) match);
            match = C15813i.f49016a;
        } else if (match instanceof PlacesMatch) {
            m36996a((PlacesMatch) match);
            match = C15813i.f49016a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final void m36993a(CoreMatch coreMatch) {
        User person = coreMatch.getPerson();
        m37001c(person);
        m36994a(coreMatch, person.id());
    }

    /* renamed from: a */
    private final void m36995a(MessageAdMatch messageAdMatch) {
        m36994a(messageAdMatch, null);
        m36999b(messageAdMatch);
    }

    /* renamed from: a */
    private final void m36996a(PlacesMatch placesMatch) {
        User person = placesMatch.getPerson();
        m37001c(person);
        m36994a(placesMatch, person.id());
        m36991a().m36952a(placesMatch);
    }

    /* renamed from: a */
    private final void m36994a(Match match, String str) {
        if (m37000c(match, str) <= 0) {
            m36998b(match, str);
        }
    }

    /* renamed from: b */
    private final void m36998b(Match match, String str) {
        this.f30547d.m50745a(match.getId(), match.getCreationDate(), match.getLastActivityDate(), match.getAttribution(), match.getMuted(), match.getTouched(), str, null, null, C8672a.m36945a(match));
        this.f30551h.b(this.f30547d.a, this.f30547d.b);
    }

    /* renamed from: c */
    private final int m37000c(Match match, String str) {
        this.f30548e.m50748a(match.getCreationDate(), match.getLastActivityDate(), match.getAttribution(), match.getMuted(), match.getTouched(), str, null, null, C8672a.m36945a(match), match.getId());
        return this.f30551h.a(this.f30548e.a, this.f30548e.b);
    }

    /* renamed from: a */
    private final void m36992a(User user) {
        this.f30546c.m50752a(user.name(), user.bio(), user.birthDate(), user.gender(), user.photos(), user.badges(), user.jobs(), user.schools(), user.id());
    }

    /* renamed from: b */
    private final void m36997b(User user) {
        this.f30545b.m50751a(user.id(), user.name(), user.bio(), user.birthDate(), user.gender(), user.photos(), user.badges(), user.jobs(), user.schools());
    }

    /* renamed from: c */
    private final void m37001c(User user) {
        m36992a(user);
        if (this.f30551h.a(this.f30546c.a, this.f30546c.b) <= 0) {
            m36997b(user);
            this.f30551h.b(this.f30545b.a, this.f30545b.b);
        }
    }

    /* renamed from: b */
    private final void m36999b(MessageAdMatch messageAdMatch) {
        this.f30549f.m50768a(messageAdMatch.getTemplateId(), messageAdMatch.getId(), messageAdMatch.getTitle(), messageAdMatch.getLogoUrl(), messageAdMatch.getBody(), messageAdMatch.getClickthroughUrl(), messageAdMatch.getClickthroughText(), messageAdMatch.getEndDate(), messageAdMatch.getPhotos());
        this.f30551h.b(this.f30549f.a, this.f30549f.b);
    }
}
