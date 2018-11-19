package com.tinder.data.match;

import com.tinder.data.match.C10799v.C8678a;
import com.tinder.domain.common.model.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/User;", "invoke"}, k = 3, mv = {1, 1, 10})
final class MatchDomainApiAdapter$fromApi$1 extends Lambda implements Function0<User> {
    /* renamed from: a */
    final /* synthetic */ C10799v f43841a;
    /* renamed from: b */
    final /* synthetic */ C8678a f43842b;

    MatchDomainApiAdapter$fromApi$1(C10799v c10799v, C8678a c8678a) {
        this.f43841a = c10799v;
        this.f43842b = c8678a;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53387a();
    }

    @Nullable
    /* renamed from: a */
    public final User m53387a() {
        return this.f43841a.m43259a(this.f43842b.m36988a());
    }
}
