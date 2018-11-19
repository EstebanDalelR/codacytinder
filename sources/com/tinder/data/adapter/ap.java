package com.tinder.data.adapter;

import com.tinder.api.model.superlikeable.SuperLikeableGameResponseData;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/adapter/SuperLikeableGameDomainApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponseData;", "recsDomainApiAdapter", "Lcom/tinder/data/adapter/RecDomainApiAdapter;", "(Lcom/tinder/data/adapter/RecDomainApiAdapter;)V", "fromApi", "gameApiModel", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ap extends C2646o<SuperLikeableGame, SuperLikeableGameResponseData> {
    /* renamed from: a */
    private final ah f35127a;

    public ap(@NotNull ah ahVar) {
        C2668g.b(ahVar, "recsDomainApiAdapter");
        this.f35127a = ahVar;
    }

    @Nullable
    /* renamed from: a */
    public SuperLikeableGame m43110a(@NotNull SuperLikeableGameResponseData superLikeableGameResponseData) {
        C2668g.b(superLikeableGameResponseData, "gameApiModel");
        String token = superLikeableGameResponseData.getToken();
        if (token == null) {
            C0001a.e("Unable to parse ApiSuperLikeableGame: token is null.", new Object[0]);
            return null;
        }
        Integer position = superLikeableGameResponseData.getPosition();
        int intValue = position != null ? position.intValue() : 3;
        superLikeableGameResponseData = superLikeableGameResponseData.getUserRecs();
        if (superLikeableGameResponseData == null) {
            superLikeableGameResponseData = C19301m.a();
        }
        superLikeableGameResponseData = this.f35127a.a(superLikeableGameResponseData);
        C2668g.a(superLikeableGameResponseData, "recsDomainApiAdapter.fromApi(apiUserRecs)");
        return new SuperLikeableGame(token, intValue, C19285g.f(C19285g.e(C19285g.a(C19285g.g(C19301m.r((Iterable) superLikeableGameResponseData), new SuperLikeableGameDomainApiAdapter$fromApi$recs$1(token)), SuperLikeableGameDomainApiAdapter$fromApi$recs$2.f43797a), SuperLikeableGameDomainApiAdapter$fromApi$recs$3.f43798a)));
    }
}
