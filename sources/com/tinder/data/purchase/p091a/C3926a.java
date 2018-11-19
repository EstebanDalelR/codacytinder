package com.tinder.data.purchase.p091a;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.purchase.SubscriptionProvider;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/tinder/data/purchase/usecase/SubscribeToTinderGold;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "getSubscriptionProvider", "()Lcom/tinder/domain/purchase/SubscriptionProvider;", "execute", "Lrx/Completable;", "productId", "data_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "We should rely on updates the subscription from /v2/profile")
/* renamed from: com.tinder.data.purchase.a.a */
public final class C3926a implements CompletableUseCase<String> {
    @NotNull
    /* renamed from: a */
    private final SubscriptionProvider f12277a;

    @Inject
    public C3926a(@NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.m10309b(subscriptionProvider, "subscriptionProvider");
        this.f12277a = subscriptionProvider;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m14814a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public final SubscriptionProvider m14813a() {
        return this.f12277a;
    }

    @NotNull
    @Deprecated(message = "We should NOT be manually updating this value. We should rely on getting the value from backend", replaceWith = @ReplaceWith(expression = "execute(request)", imports = {"com.tinder.domain.profile.usecase.SyncProfileData"}))
    /* renamed from: a */
    public Completable m14814a(@NotNull String str) {
        C2668g.m10309b(str, "productId");
        Object a = Completable.m10366a((Action0) new a$a(this, str));
        C2668g.m10305a(a, "Completable.fromAction {…isPlus = true))\n        }");
        return a;
    }
}
