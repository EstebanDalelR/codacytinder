package com.tinder.data.adapter;

import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.UserRec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/Rec;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class SuperLikeableGameDomainApiAdapter$fromApi$recs$2 extends Lambda implements Function1<Rec, Boolean> {
    /* renamed from: a */
    public static final SuperLikeableGameDomainApiAdapter$fromApi$recs$2 f43797a = new SuperLikeableGameDomainApiAdapter$fromApi$recs$2();

    SuperLikeableGameDomainApiAdapter$fromApi$recs$2() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53367a((Rec) obj));
    }

    /* renamed from: a */
    public final boolean m53367a(Rec rec) {
        return rec instanceof UserRec;
    }
}
