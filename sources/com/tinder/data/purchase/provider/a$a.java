package com.tinder.data.purchase.provider;

import com.tinder.domain.common.model.Subscription;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class a$a<T, R> implements Func1<Optional<Subscription>, Boolean> {
    /* renamed from: a */
    public static final a$a f41696a = new a$a();

    a$a() {
    }

    public /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(m50936a((Optional) obj));
    }

    /* renamed from: a */
    public final boolean m50936a(Optional<Subscription> optional) {
        C2668g.a(optional, "it");
        return optional.c();
    }
}
