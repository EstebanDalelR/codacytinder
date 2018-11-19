package com.tinder.fastmatch.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.fastmatch.target.FastMatchPreviewRowTarget;
import com.tinder.fastmatch.view.FastMatchRecsActivity.Source;
import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0007J\b\u0010\u0019\u001a\u00020\u0014H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/fastmatch/presenter/FastMatchPreviewRowPresenter;", "", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "fastMatchPreviewViewModelFactory", "Lcom/tinder/fastmatch/presenter/FastMatchPreviewViewModelFactory;", "(Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/fastmatch/presenter/FastMatchPreviewViewModelFactory;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/fastmatch/target/FastMatchPreviewRowTarget;", "getTarget$Tinder_release", "()Lcom/tinder/fastmatch/target/FastMatchPreviewRowTarget;", "setTarget$Tinder_release", "(Lcom/tinder/fastmatch/target/FastMatchPreviewRowTarget;)V", "viewModel", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel;", "handleFastMatchPreviewClick", "", "handleFastMatchStatus", "fastMatchStatus", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "subscribe", "unsubscribe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.c */
public final class C9387c {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FastMatchPreviewRowTarget f31488a;
    /* renamed from: b */
    private final C17356a f31489b = new C17356a();
    /* renamed from: c */
    private FastMatchPreviewViewModel f31490c;
    /* renamed from: d */
    private final FastMatchStatusProvider f31491d;
    /* renamed from: e */
    private final SubscriptionProvider f31492e;
    /* renamed from: f */
    private final C9390f f31493f;

    @Inject
    public C9387c(@NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull SubscriptionProvider subscriptionProvider, @NotNull C9390f c9390f) {
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(c9390f, "fastMatchPreviewViewModelFactory");
        this.f31491d = fastMatchStatusProvider;
        this.f31492e = subscriptionProvider;
        this.f31493f = c9390f;
    }

    @Take
    /* renamed from: a */
    public final void m39301a() {
        C3959e observeOn = this.f31491d.observe().observeOn(C15674a.a());
        Consumer c11628d = new C11628d(new FastMatchPreviewRowPresenter$subscribe$subscription$1(this));
        Function1 function1 = FastMatchPreviewRowPresenter$subscribe$subscription$2.f45315a;
        if (function1 != null) {
            function1 = new C11628d(function1);
        }
        this.f31489b.add(observeOn.subscribe(c11628d, (Consumer) function1));
    }

    @Drop
    /* renamed from: b */
    public final void m39302b() {
        this.f31489b.a();
    }

    /* renamed from: c */
    public final void m39303c() {
        if (this.f31492e.get().isGold()) {
            Source source;
            FastMatchPreviewViewModel fastMatchPreviewViewModel = this.f31490c;
            if (fastMatchPreviewViewModel == null || fastMatchPreviewViewModel.m39380a() != 0) {
                source = Source.MATCH_LIST;
            } else {
                source = Source.MATCH_LIST_EMPTY;
            }
            FastMatchPreviewRowTarget fastMatchPreviewRowTarget = this.f31488a;
            if (fastMatchPreviewRowTarget == null) {
                C2668g.b("target");
            }
            fastMatchPreviewRowTarget.navigateToCardGrid(source);
            return;
        }
        FastMatchPreviewRowTarget fastMatchPreviewRowTarget2 = this.f31488a;
        if (fastMatchPreviewRowTarget2 == null) {
            C2668g.b("target");
        }
        fastMatchPreviewRowTarget2.showPaywall();
    }

    /* renamed from: a */
    private final void m39299a(FastMatchStatus fastMatchStatus) {
        this.f31490c = this.f31493f.m39307a(fastMatchStatus, this.f31492e.get());
        fastMatchStatus = this.f31490c;
        if (fastMatchStatus != null) {
            FastMatchPreviewRowTarget fastMatchPreviewRowTarget = this.f31488a;
            if (fastMatchPreviewRowTarget == null) {
                C2668g.b("target");
            }
            fastMatchPreviewRowTarget.showPreview(fastMatchStatus);
        }
    }
}
