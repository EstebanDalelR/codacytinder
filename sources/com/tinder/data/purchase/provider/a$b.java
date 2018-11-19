package com.tinder.data.purchase.provider;

import com.tinder.domain.common.model.Subscription;
import java8.util.Optional;
import kotlin.Metadata;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
final class a$b<T, R> implements Func1<T, R> {
    /* renamed from: a */
    public static final a$b f41697a = new a$b();

    a$b() {
    }

    public /* synthetic */ Object call(Object obj) {
        return m50937a((Optional) obj);
    }

    /* renamed from: a */
    public final Subscription m50937a(Optional<Subscription> optional) {
        return (Subscription) optional.b();
    }
}
