package com.tinder.tindergold.p426a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.tindergold.p426a.C15183k.C15182b;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/tindergold/analytics/AddGoldSkuOfferedEvent;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "goldEtlEventFactory", "Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;)V", "execute", "", "getLikesNum", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.a.j */
public final class C16921j implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C2630h f52127a;
    /* renamed from: b */
    private final C15183k f52128b;
    /* renamed from: c */
    private final SubscriptionProvider f52129c;
    /* renamed from: d */
    private final FastMatchStatusProvider f52130d;
    /* renamed from: e */
    private final FastMatchConfigProvider f52131e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.j$a */
    static final class C18961a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16921j f58641a;

        C18961a(C16921j c16921j) {
            this.f58641a = c16921j;
        }

        public final void call() {
            this.f58641a.f52127a.a(this.f58641a.f52128b.m57094d(new C15182b(null, null, this.f58641a.m62582a(), null, 11, null)));
        }
    }

    @Inject
    public C16921j(@NotNull C2630h c2630h, @NotNull C15183k c15183k, @NotNull SubscriptionProvider subscriptionProvider, @NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull FastMatchConfigProvider fastMatchConfigProvider) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15183k, "goldEtlEventFactory");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        this.f52127a = c2630h;
        this.f52128b = c15183k;
        this.f52129c = subscriptionProvider;
        this.f52130d = fastMatchStatusProvider;
        this.f52131e = fastMatchConfigProvider;
    }

    public void execute() {
        if (this.f52131e.get().isEnabled()) {
            Completable.a(new C18961a(this)).b(Schedulers.io()).b(RxUtils.b());
        }
    }

    /* renamed from: a */
    private final int m62582a() {
        FastMatchStatus fastMatchStatus = this.f52130d.get();
        int i = 0;
        if (fastMatchStatus.getCount() < 2) {
            return 0;
        }
        if (this.f52129c.get().isGold()) {
            return -1;
        }
        if (fastMatchStatus.getCount() >= 0) {
            i = fastMatchStatus.getCount();
        }
        return i;
    }
}
