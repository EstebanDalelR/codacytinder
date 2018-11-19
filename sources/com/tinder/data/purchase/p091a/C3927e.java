package com.tinder.data.purchase.p091a;

import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.purchase.SubscriptionProvider;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tinder/data/purchase/usecase/UnsubscribeFromAllSubscriptions;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "getSubscriptionProvider", "()Lcom/tinder/domain/purchase/SubscriptionProvider;", "execute", "Lrx/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "We should rely on updates the subscription from /v2/profile")
/* renamed from: com.tinder.data.purchase.a.e */
public final class C3927e implements SimpleCompletableUseCase {
    @NotNull
    /* renamed from: a */
    private final SubscriptionProvider f12278a;

    @Inject
    public C3927e(@NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.m10309b(subscriptionProvider, "subscriptionProvider");
        this.f12278a = subscriptionProvider;
    }

    @NotNull
    /* renamed from: a */
    public final SubscriptionProvider m14815a() {
        return this.f12278a;
    }

    @NotNull
    @Deprecated(message = "We should NOT be manually updating this value. We should rely on getting the value from backend", replaceWith = @ReplaceWith(expression = "execute(request)", imports = {"com.tinder.domain.profile.usecase.SyncProfileData"}))
    public Completable execute() {
        Object a = Completable.m10366a((Action0) new e$a(this));
        C2668g.m10305a(a, "Completable.fromAction {…sPlus = false))\n        }");
        return a;
    }
}
