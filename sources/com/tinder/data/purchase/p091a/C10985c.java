package com.tinder.data.purchase.p091a;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.purchase.SubscriptionProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/tinder/data/purchase/usecase/SubscribeToTinderPlus;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "getSubscriptionProvider", "()Lcom/tinder/domain/purchase/SubscriptionProvider;", "execute", "Lrx/Completable;", "productId", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.purchase.a.c */
public final class C10985c implements CompletableUseCase<String> {
    @NotNull
    /* renamed from: a */
    private final SubscriptionProvider f35709a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.purchase.a.c$a */
    static final class C13873a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10985c f43980a;
        /* renamed from: b */
        final /* synthetic */ String f43981b;

        C13873a(C10985c c10985c, String str) {
            this.f43980a = c10985c;
            this.f43981b = str;
        }

        public final void call() {
            this.f43980a.m43589a().update(new Subscription(this.f43981b, false, true, null, 8, null));
        }
    }

    @Inject
    public C10985c(@NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f35709a = subscriptionProvider;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m43590a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public final SubscriptionProvider m43589a() {
        return this.f35709a;
    }

    @NotNull
    /* renamed from: a */
    public Completable m43590a(@NotNull String str) {
        C2668g.b(str, "productId");
        str = Completable.a(new C13873a(this, str));
        C2668g.a(str, "Completable.fromAction {…isPlus = true))\n        }");
        return str;
    }
}
