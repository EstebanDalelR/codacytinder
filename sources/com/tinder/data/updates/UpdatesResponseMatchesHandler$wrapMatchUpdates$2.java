package com.tinder.data.updates;

import com.tinder.api.model.common.ApiMatch;
import com.tinder.data.match.C10799v.C8678a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/match/MatchDomainApiAdapter$MatchData;", "apiMatch", "Lcom/tinder/api/model/common/ApiMatch;", "invoke"}, k = 3, mv = {1, 1, 10})
final class UpdatesResponseMatchesHandler$wrapMatchUpdates$2 extends Lambda implements Function1<ApiMatch, C8678a> {
    /* renamed from: a */
    final /* synthetic */ boolean f44025a;

    UpdatesResponseMatchesHandler$wrapMatchUpdates$2(boolean z) {
        this.f44025a = z;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53443a((ApiMatch) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C8678a m53443a(@NotNull ApiMatch apiMatch) {
        C2668g.b(apiMatch, "apiMatch");
        return new C8678a(apiMatch, this.f44025a);
    }
}
