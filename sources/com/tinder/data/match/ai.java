package com.tinder.data.match;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.model.MatchPlaceModel.C13001c;
import com.tinder.data.model.MatchPlaceModel.C13002d;
import com.tinder.data.model.PlaceModel.C13012b;
import com.tinder.data.model.PlaceModel.C13013d;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.model.PlacesMatch.PlaceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/data/match/MatchPlaceUpsertOperation;", "", "db", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "matchPlaceInsert", "Lcom/tinder/data/model/MatchPlaceModel$Insert_match_place;", "matchPlaceUpdate", "Lcom/tinder/data/model/MatchPlaceModel$Update_match_place;", "placeInsert", "Lcom/tinder/data/model/PlaceModel$Insert_place;", "placeUpdate", "Lcom/tinder/data/model/PlaceModel$Update_place;", "insertMatchPlace", "", "match", "Lcom/tinder/domain/match/model/PlacesMatch;", "insertPlace", "place", "Lcom/tinder/domain/match/model/PlacesMatch$PlaceInfo;", "updateMatchPlace", "", "updatePlace", "upsertMatchPlace", "upsertPlace", "upsertPlacesMatch", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ai {
    /* renamed from: a */
    private final C13001c f30525a;
    /* renamed from: b */
    private final C13002d f30526b;
    /* renamed from: c */
    private final C13012b f30527c;
    /* renamed from: d */
    private final C13013d f30528d;
    /* renamed from: e */
    private final BriteDatabase f30529e;

    public ai(@NotNull BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "db");
        this.f30529e = briteDatabase;
        briteDatabase = this.f30529e.b();
        this.f30525a = new C13001c(briteDatabase);
        this.f30526b = new C13002d(briteDatabase);
        this.f30527c = new C13012b(briteDatabase);
        this.f30528d = new C13013d(briteDatabase);
    }

    /* renamed from: a */
    public final void m36952a(@NotNull PlacesMatch placesMatch) {
        C2668g.b(placesMatch, "match");
        m36946a(placesMatch.getPlace());
        m36948b(placesMatch);
    }

    /* renamed from: b */
    private final void m36948b(PlacesMatch placesMatch) {
        if (m36951d(placesMatch) <= 0) {
            m36950c(placesMatch);
        }
    }

    /* renamed from: a */
    private final void m36946a(PlaceInfo placeInfo) {
        if (m36949c(placeInfo) <= 0) {
            m36947b(placeInfo);
        }
    }

    /* renamed from: c */
    private final void m36950c(PlacesMatch placesMatch) {
        this.f30525a.m50753a(placesMatch.getId(), placesMatch.getPlace().getId());
        this.f30529e.b(this.f30525a.a, this.f30525a.b);
    }

    /* renamed from: d */
    private final int m36951d(PlacesMatch placesMatch) {
        this.f30526b.m50754a(placesMatch.getPlace().getId(), placesMatch.getId());
        return this.f30529e.a(this.f30526b.a, this.f30526b.b);
    }

    /* renamed from: b */
    private final void m36947b(PlaceInfo placeInfo) {
        this.f30527c.m50764a(placeInfo.getId(), placeInfo.getName());
        this.f30529e.b(this.f30527c.a, this.f30527c.b);
    }

    /* renamed from: c */
    private final int m36949c(PlaceInfo placeInfo) {
        this.f30528d.m50765a(placeInfo.getName(), placeInfo.getId());
        return this.f30529e.a(this.f30528d.a, this.f30528d.b);
    }
}
