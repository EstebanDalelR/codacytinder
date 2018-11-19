package com.tinder.data.adapter;

import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.UserRec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/UserRec;", "it", "Lcom/tinder/domain/recs/model/Rec;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class SuperLikeableGameDomainApiAdapter$fromApi$recs$3 extends Lambda implements Function1<Rec, UserRec> {
    /* renamed from: a */
    public static final SuperLikeableGameDomainApiAdapter$fromApi$recs$3 f43798a = new SuperLikeableGameDomainApiAdapter$fromApi$recs$3();

    SuperLikeableGameDomainApiAdapter$fromApi$recs$3() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53368a((Rec) obj);
    }

    @NotNull
    /* renamed from: a */
    public final UserRec m53368a(Rec rec) {
        if (rec != null) {
            return (UserRec) rec;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.UserRec");
    }
}
