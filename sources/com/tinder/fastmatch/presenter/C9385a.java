package com.tinder.fastmatch.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.fastmatch.target.FastMatchPreviewTarget;
import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/tinder/fastmatch/presenter/FastMatchPreviewPresenter;", "", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "fastMatchPreviewViewModelFactory", "Lcom/tinder/fastmatch/presenter/FastMatchPreviewViewModelFactory;", "(Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/fastmatch/presenter/FastMatchPreviewViewModelFactory;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/fastmatch/target/FastMatchPreviewTarget;", "getTarget$Tinder_release", "()Lcom/tinder/fastmatch/target/FastMatchPreviewTarget;", "setTarget$Tinder_release", "(Lcom/tinder/fastmatch/target/FastMatchPreviewTarget;)V", "subscribe", "", "unsubscribe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.a */
public final class C9385a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FastMatchPreviewTarget f31483a;
    /* renamed from: b */
    private final C17356a f31484b = new C17356a();
    /* renamed from: c */
    private final FastMatchStatusProvider f31485c;
    /* renamed from: d */
    private final SubscriptionProvider f31486d;
    /* renamed from: e */
    private final C9390f f31487e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel;", "status", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.a$a */
    static final class C11625a<T1, T2, R> implements BiFunction<FastMatchStatus, Subscription, FastMatchPreviewViewModel> {
        /* renamed from: a */
        final /* synthetic */ C9385a f38050a;

        C11625a(C9385a c9385a) {
            this.f38050a = c9385a;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m47370a((FastMatchStatus) obj, (Subscription) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final FastMatchPreviewViewModel m47370a(@NotNull FastMatchStatus fastMatchStatus, @NotNull Subscription subscription) {
            C2668g.b(fastMatchStatus, "status");
            C2668g.b(subscription, "subscription");
            return this.f38050a.f31487e.m39307a(fastMatchStatus, subscription);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.a$b */
    static final class C11626b<T> implements Consumer<FastMatchPreviewViewModel> {
        /* renamed from: a */
        final /* synthetic */ C9385a f38051a;

        C11626b(C9385a c9385a) {
            this.f38051a = c9385a;
        }

        public /* synthetic */ void accept(Object obj) {
            m47371a((FastMatchPreviewViewModel) obj);
        }

        /* renamed from: a */
        public final void m47371a(FastMatchPreviewViewModel fastMatchPreviewViewModel) {
            FastMatchPreviewTarget a = this.f38051a.m39294a();
            C2668g.a(fastMatchPreviewViewModel, "it");
            a.showPreview(fastMatchPreviewViewModel);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.a$c */
    static final class C11627c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11627c f38052a = new C11627c();

        C11627c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47372a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47372a(Throwable th) {
            C0001a.c(th, "Error observing fastMatchStatus and subscription", new Object[0]);
        }
    }

    @Inject
    public C9385a(@NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull SubscriptionProvider subscriptionProvider, @NotNull C9390f c9390f) {
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(c9390f, "fastMatchPreviewViewModelFactory");
        this.f31485c = fastMatchStatusProvider;
        this.f31486d = subscriptionProvider;
        this.f31487e = c9390f;
    }

    @NotNull
    /* renamed from: a */
    public final FastMatchPreviewTarget m39294a() {
        FastMatchPreviewTarget fastMatchPreviewTarget = this.f31483a;
        if (fastMatchPreviewTarget == null) {
            C2668g.b("target");
        }
        return fastMatchPreviewTarget;
    }

    @Take
    /* renamed from: b */
    public final void m39295b() {
        this.f31484b.add(C3959e.combineLatest(this.f31485c.observe(), RxJavaInteropExtKt.toV2Observable(this.f31486d.observe()).distinctUntilChanged(), new C11625a(this)).observeOn(C15674a.a()).subscribe(new C11626b(this), C11627c.f38052a));
    }

    @Drop
    /* renamed from: c */
    public final void m39296c() {
        this.f31484b.a();
    }
}
