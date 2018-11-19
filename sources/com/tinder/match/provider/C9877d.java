package com.tinder.match.provider;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.fastmatch.usecase.ObserveHasFastMatches;
import com.tinder.domain.match.model.MessageMatchesUpdate;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.match.p293e.C9864c;
import com.tinder.match.viewmodel.MatchListItem;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R,\u0010\u000b\u001a \u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/match/provider/MatchListItemsProvider;", "", "messageMatchesUpdateProvider", "Lcom/tinder/match/provider/MessageMatchesUpdateProvider;", "observeHasFastMatches", "Lcom/tinder/domain/fastmatch/usecase/ObserveHasFastMatches;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "matchListFactory", "Lcom/tinder/match/util/MatchListFactory;", "(Lcom/tinder/match/provider/MessageMatchesUpdateProvider;Lcom/tinder/domain/fastmatch/usecase/ObserveHasFastMatches;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/match/util/MatchListFactory;)V", "matchListItemsCreator", "Lio/reactivex/functions/Function3;", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "", "", "Lcom/tinder/match/viewmodel/MatchListItem;", "observe", "Lio/reactivex/Observable;", "observeIsGold", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.provider.d */
public final class C9877d {
    /* renamed from: a */
    private final Function3<MessageMatchesUpdate, Boolean, Boolean, List<MatchListItem>> f32700a = ((Function3) new C12077a(this));
    /* renamed from: b */
    private final C9880i f32701b;
    /* renamed from: c */
    private final ObserveHasFastMatches f32702c;
    /* renamed from: d */
    private final SubscriptionProvider f32703d;
    /* renamed from: e */
    private final C9864c f32704e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "Lcom/tinder/match/viewmodel/MatchListItem;", "kotlin.jvm.PlatformType", "", "messageMatchesUpdate", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "hasFastMatches", "", "isGold", "apply", "(Lcom/tinder/domain/match/model/MessageMatchesUpdate;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/util/List;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.provider.d$a */
    static final class C12077a<T1, T2, T3, R> implements Function3<MessageMatchesUpdate, Boolean, Boolean, List<? extends MatchListItem>> {
        /* renamed from: a */
        final /* synthetic */ C9877d f39222a;

        C12077a(C9877d c9877d) {
            this.f39222a = c9877d;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
            return m48181a((MessageMatchesUpdate) obj, (Boolean) obj2, (Boolean) obj3);
        }

        @NotNull
        /* renamed from: a */
        public final List<MatchListItem> m48181a(@NotNull MessageMatchesUpdate messageMatchesUpdate, @NotNull Boolean bool, @NotNull Boolean bool2) {
            C2668g.b(messageMatchesUpdate, "messageMatchesUpdate");
            C2668g.b(bool, "hasFastMatches");
            C2668g.b(bool2, "isGold");
            return this.f39222a.f32704e.m40578a(messageMatchesUpdate, bool.booleanValue(), bool2.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/common/model/Subscription;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.provider.d$b */
    static final class C12078b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12078b f39223a = new C12078b();

        C12078b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m48182a((Subscription) obj));
        }

        /* renamed from: a */
        public final boolean m48182a(@NotNull Subscription subscription) {
            C2668g.b(subscription, "it");
            return subscription.isGold();
        }
    }

    @Inject
    public C9877d(@NotNull C9880i c9880i, @NotNull ObserveHasFastMatches observeHasFastMatches, @NotNull SubscriptionProvider subscriptionProvider, @NotNull C9864c c9864c) {
        C2668g.b(c9880i, "messageMatchesUpdateProvider");
        C2668g.b(observeHasFastMatches, "observeHasFastMatches");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(c9864c, "matchListFactory");
        this.f32701b = c9880i;
        this.f32702c = observeHasFastMatches;
        this.f32703d = subscriptionProvider;
        this.f32704e = c9864c;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<List<MatchListItem>> m40639a() {
        C3959e<List<MatchListItem>> distinctUntilChanged = C3959e.combineLatest(this.f32701b.m40646a(), this.f32702c.execute(), m40638b(), this.f32700a).distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "Observable.combineLatest…  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    /* renamed from: b */
    private final C3959e<Boolean> m40638b() {
        C3959e<Boolean> map = RxJavaInteropExtKt.toV2Observable(this.f32703d.observe()).map(C12078b.f39223a);
        C2668g.a(map, "subscriptionProvider.obs…vable().map { it.isGold }");
        return map;
    }
}
