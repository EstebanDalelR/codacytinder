package com.tinder.data.match;

import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.recs.model.Rec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/PerspectableUser;", "invoke"}, k = 3, mv = {1, 1, 10})
final class MatchDomainApiAdapter$fromApiAndRec$1 extends Lambda implements Function0<PerspectableUser> {
    /* renamed from: a */
    final /* synthetic */ C10799v f43843a;
    /* renamed from: b */
    final /* synthetic */ Rec f43844b;

    MatchDomainApiAdapter$fromApiAndRec$1(C10799v c10799v, Rec rec) {
        this.f43843a = c10799v;
        this.f43844b = rec;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53388a();
    }

    @Nullable
    /* renamed from: a */
    public final PerspectableUser m53388a() {
        return this.f43843a.m43258a(this.f43844b);
    }
}
